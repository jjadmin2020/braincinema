package com.main.braincinema.controller;

import com.main.braincinema.controller.request.LoginRequest;
import com.main.braincinema.controller.request.RegistrationRequest;
import com.main.braincinema.entity.User;
import com.main.braincinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServlet;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */
@Controller
public class UserRegistrationController extends HttpServlet {

    private final UserService userService;

    @Autowired
    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/register")
    public String register(@Valid @RequestBody RegistrationRequest request) {
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .login(request.getLogin())
                .password(request.getPassword())
                .email(request.getEmail())
                .dateOfBirth(request.getDateOfBirth())
                .build();

        userService.register(user);
        return "Hello";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return userService.login(request.getLogin(), request.getPassword());
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loginRequest", new LoginRequest());
        return "login";
    }

    @GetMapping(value = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

//    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        request.getRequestDispatcher("/register.jsp").forward(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request,
//                          HttpServletResponse response) throws ServletException, IOException {
//        User user = new User();
//        user.setFirstName(request.getParameter("firstName"));
//        user.setLastName(request.getParameter("lastName"));
//        Date dob = null;
//        try {
//            dob = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dob"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        user.setDateOfBirth(dob);
//        user.setEmail(request.getParameter("email"));
//        user.setLogin(request.getParameter("password"));
//        user.setPassword(request.getParameter("login.html"));
//
//        userService.register(user);
//        request.getRequestDispatcher("/login.html.jsp").forward(request, response);
//    }
}
