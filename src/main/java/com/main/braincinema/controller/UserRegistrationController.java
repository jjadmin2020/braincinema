package com.main.braincinema.controller;

import com.main.braincinema.entity.User;
import com.main.braincinema.service.UserService;
import com.main.braincinema.service.imple.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */
public class UserRegistrationController extends HttpServlet {
    private final UserService userService = new UserServiceImpl();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        Date dob = null;
        try {
            dob = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dob"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setDateOfBirth(dob);
        user.setEmail(request.getParameter("email"));
        user.setLogin(request.getParameter("password"));
        user.setPassword(request.getParameter("login"));

        userService.register(user);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }
}
