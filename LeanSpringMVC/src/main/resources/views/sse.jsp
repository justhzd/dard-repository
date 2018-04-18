<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>SSE Demo</title>
</head>
<body>
    <div id="msgFormPush"></div>
    <script type="text/javascript" src="<c:url value="assets/js/jquery.js"/>"></script>
    <script type="text/javascript">
        //只有新式浏览器才有支持,EventSource是SSE的客户端
        if(!!window.EventSource){
            var source = new EventSource('push');
            s = '';
            //添加监听，在这里获取到服务端推送的消息
            source.addEventListener('message', function(e){
                s += e.data + "<br/>";
                $('#msgFormPush').html(s);
            });
            source.addEventListener('open', function(e) {
                console.log('连接打开');
            },false);

            source.addEventListener('error', function(e) {
                if(e.readyState === EventSource.CLOSED) {
                    console.log('连接关闭');
                }else{
                    console.log(e.readyState);
                }
            },false);

        }else{
            console.log('你的浏览器不支持SSE');
        }
    </script>
</body>
</html>