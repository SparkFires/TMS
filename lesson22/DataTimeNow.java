package com.example.lesson22;

import java.io.*;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DataTimeNow", value = "/data")
public class DataTimeNow extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=cp1251");
        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<h3>Дата и время:<h3>" +
                "<h4>" + LocalDateTime.now() + "<h4>" +
                "</html>");
    }
}