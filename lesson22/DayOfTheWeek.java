package com.example.lesson22;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;


@WebServlet(name = "DayOfTheWeek", urlPatterns = "/week")
public class DayOfTheWeek extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=cp1251");
        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<h3>Введите данные на главной странице</h3>" +
                "<h4><a href=\"/form\">Перейти на главную страницу</a></h4>" +
                "</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=cp1251");
        PrintWriter writer = response.getWriter();
        String date = request.getParameter("data");

        writer.println(String.format("<html><h3>День недели - %s!</h3></html>", LocalDateTime.parse(date).getDayOfWeek()));
        writer.println(String.format("<html><h3>Ваш день недели - %s!</h3></html>", LocalDateTime.parse(date).getDayOfYear()));
    }
}
