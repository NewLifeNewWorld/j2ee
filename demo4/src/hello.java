import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @author yangyedong
 * @version 1.0
 * @createDate 2019/11/6 13:34
 * @updateUser yangyedong
 * @updateDate 2019/11/6 13:34
 * @updateRemark
 */
public class hello extends HttpServlet {

    @Override
    public void init(ServletConfig config){
        System.out.println("初始化Servlet");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().println("<h1>hello world</h1>");
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");//对提交的数据进行解码
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String html="";
        System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
        System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
        System.out.println("请求行中的参数部分: " + request.getQueryString());
        System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
        System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
        System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
        System.out.println("服务器的IP地址: " + request.getLocalAddr());
        System.out.println("服务器的主机名: " + request.getLocalName());
        System.out.println("得到客户机请求方式: " + request.getMethod());
        if ("admin".equals(name) && "111".equals(password)) {
//             html = "<div style= 'color:green'>成功</div>";
            request.getRequestDispatcher("success.html").forward(request,response);
        }else{
//             html = "<div style='color:red'>失败</div>";
            response.sendRedirect("fail.html");
        }
        System.out.println("name:" + name + "password:" + password);
//        try {
//            response.getWriter().println(html);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
