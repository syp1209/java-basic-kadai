<%@ page contentType="text/html; charset=UTF-8" %>

<html>
    <head>
        <title>Servlet/JSPの基礎を学ぼう</title>
    </head>
    <body>
         <h2>個人情報入力を完了しました。</h2>

        <%-- 戻るボタン（入力フォームに戻る） --%>
        <button onclick="location.href='<%= request.getContextPath() %>/form';">戻る</button>
    </body>
</html>
