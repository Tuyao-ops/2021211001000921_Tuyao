package com.Tuyao.week2.Homework;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer=response.getWriter();
        writer.println("Hello,Client!");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){


    }
}
