package com.main.braincinema.controller;

import com.main.braincinema.entity.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//@WebServlet(name = "UserController", urlPatterns = "/login")
public class UserController extends HttpServlet {

    public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String username = request.getParameter("userName");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<h1>" + username + " " + password + "</h1>");
        writer.flush();

    }


    public boolean addUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    public boolean deleteUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    public boolean findUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}
