package com.resume.admin.ctrl;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@WebServlet("/UploadStudentServlet")
@MultipartConfig
public class UploadStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resume", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part filePart = request.getPart("studentName"); // "file" is the name of the file input field in your JSP
		InputStream fileContent = filePart.getInputStream();

		int i = 0;

		// Read Excel file content and insert data into the database
		try {
			Workbook workbook = new XSSFWorkbook(fileContent);
			Sheet sheet = workbook.getSheetAt(0);
			// JDBC connection setup (adjust for your database)
			Connection connection = getConnection();

			Row row;

			for (int j = 1; j <= sheet.getLastRowNum(); j++) {

//			for (Row row : sheet) {
				// Read data from Excel rows
				row = (Row) sheet.getRow(j);
				// Read data from Excel rows
				String name = row.getCell(1).getStringCellValue();
				String scholar_no = row.getCell(2).getStringCellValue();
				String password = row.getCell(3).getStringCellValue();
				String enroll = row.getCell(4).getStringCellValue();
				String clgMail = row.getCell(5).getStringCellValue();

				

				// Insert data into the database
				String sql = "INSERT INTO student_basic (scholar_no, st_name, st_password,st_college_mail,st_enroll) VALUES (?, ?, ?, ?, ?)";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, scholar_no);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, password);
				preparedStatement.setString(4, clgMail);
				preparedStatement.setString(5, enroll);
				i = preparedStatement.executeUpdate();

			}

			// Close JDBC connection
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		if (i != 0) {
			session.setAttribute("message", "File Uploaded Successfully");
			response.sendRedirect("admin/admin_dashboard.jsp");
		} else {
			session.setAttribute("message", "Something Wrong");
			response.sendRedirect("admin/admin_dashboard.jsp");
		}

	}

}
