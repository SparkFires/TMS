package com.example.html.task1;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", value = "/form/file")
public class FormServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<body>" +
                "<h1>Please choose file to upload:</h1>" +
                "<form action=\"/file/upload/result\" method=\"POST\" enctype=\"multipart/form-data\">" +
                "<input type=\"file\" name=\"file\"> <br>" +
                "<input type=\"submit\" value=\"Upload\"/>" +
                "</body>" +
                "</html>");
    }
}