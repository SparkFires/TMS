package com.example.html.task2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "ErrorServlet", urlPatterns = {"/authorization/error"})
public class ErrorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=cp1251");
        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<body>" +
                "<h2>Аккаунт не найден.</h2>\n" +
                "</body>" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
