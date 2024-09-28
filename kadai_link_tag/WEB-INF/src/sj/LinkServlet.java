package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LinkServlet extends HttpServlet {
    // GETメソッドのリクエスト受信時に実行されるメソッド
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
    
     // URLのパラメータ(画面遷移の種類)を取得
        String name = request.getParameter("name");
        request.setAttribute("text", "Servletからデータを受信しました："+ name +"さん、こんにちは！");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
		    }
}


