package com.example.bachtest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
<<<<<<< HEAD
    private String message;

    public void init() {
        message = "Hello anh bách2222222222";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        System.out.println("Bach vua tao branch moi");
    }

    public void destroy() {
    }
}
=======
    // alo Duy Hung
}
>>>>>>> Bachvip
