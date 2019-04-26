package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet",urlPatterns = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应内容类型
        resp.setContentType("text/html;charset=utf-8");
        //设置逻辑实现
        System.out.println("使用doGet方法.....");
        PrintWriter out = resp.getWriter();
        out.println("<h1>a标签访问get方式</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username=="" || password=="")
        {
            out.println("<h1>登录失败，用户名密码不得为空</h1>");
        } else {
            if (username.equals("admin") && password.equals("12345")) {
                //重定向至登录成功页面
                response.sendRedirect("/homework/success.jsp");
            } else {
                //服务器转发至登录失败界面
                request.getRequestDispatcher("/fault.jsp").forward(request,response);
            }
        }
    }
}
