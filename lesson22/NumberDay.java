package com.example.lesson22;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "NumberDay", urlPatterns = "/form")
public class NumberDay extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=cp1251");
        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<h3>Бланк для заполнения даты:<h3>" +
                "<body>" +
                "<form action=\"/week\" method=\"POST\">" +
                "<label for=\"date\">Введите дату: </label>" +
                "<input type=\"date\" name=\"date\" value=\"2023-02-08\"/>" +
                "<input type=\"submit\" value=\"Submit\"/>" +
                "</form>" +
                "</body>" +
                "</html>");
    }
}
