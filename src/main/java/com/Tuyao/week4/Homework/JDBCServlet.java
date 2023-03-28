package com.Tuyao.week4.Homework;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@WebServlet(
        urlPatterns = {"/jdbc"},
        initParams = {
                @WebInitParam(name = "driver",value = "com.microsoft.sqlserver.jdbc.SQLServerDriver"),
                @WebInitParam(name = "url",value = "jdbc:sqlserver://localhost:databaseName=userdb"),
                @WebInitParam(name = "username",value = "luoji"),
                @WebInitParam(name = "password",value = "123456"),
        },loadOnStartup = 1
)
public class JDBCServlet<ResulutSet> extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {
        //String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        //String url="jdbc:sqlserver://localhost:databaseName=userdb";
        //String username="luoji";
        //String password="123456";

        ServletConfig config = getServletConfig();
        String driver = config.getInitParameter("driver");
        String url = config.getInitParameter("url");
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");



        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);
            System.out.println("init()-->"+con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in doGet()");

        String sql="select * from usertable";

        try {
            ResulutSet rs = (ResulutSet) con.createStatement().executeQuery(sql);
            while (rs.equals(1)){

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
