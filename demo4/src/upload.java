import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * @author yangyedong
 * @version 1.0
 * @createDate 2019/11/6 14:52
 * @updateUser yangyedong
 * @updateDate 2019/11/6 14:52
 * @updateRemark
 */
public class upload extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        String filename = null;

    }
}
