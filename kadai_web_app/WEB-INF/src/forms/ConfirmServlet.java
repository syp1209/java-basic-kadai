package forms;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ConfirmServlet extends HttpServlet {
    // POSTメソッドのリクエスト受信時に実行されるメソッド
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        // リクエスト・レスポンスの設定
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // JSPからのリクエストデータ取得
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phone_number = request.getParameter("phone_number");

        // リクエストスコープにデータ保存
        request.setAttribute( "name", name );
        request.setAttribute( "email", email );
        request.setAttribute( "address", address );
        request.setAttribute( "phone_number", phone_number );

        // データが存在しない場合は空文字に置き換え
        name = Objects.toString(name, "");
        email = Objects.toString(email, "");
        address = Objects.toString(address, "");
        phone_number = Objects.toString(phone_number, "");

        // セッションの取得
        HttpSession session = request.getSession();
        
        // セッションへのデータ登録
        session.setAttribute( "name", name );
        session.setAttribute( "email", email );
        session.setAttribute( "address", address );
        session.setAttribute( "phone_number", phone_number );
        
        // クッキーに保存
        setCookie(response, "name", name );
        setCookie(response, "email", email );
       

        // フォワードによる画面遷移
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/confirmPage.jsp");
        dispatcher.forward(request, response);
    }
    
	// 新しいクッキーを設定するメソッド
	private void setCookie(HttpServletResponse response, String name, String value ) {
	    Cookie cookie = new Cookie(name, value);
	    cookie.setMaxAge(60 * 60 * 24 * 1); // 有効期限は1日
	    response.addCookie(cookie);
    }
}
