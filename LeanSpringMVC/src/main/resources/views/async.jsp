<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0.1 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>servlet async support</title>
</head>
<body>
    <script type="text/javascript" src="assets/js/jquery.js"></script>
    <script type="text/javascript">
        //打开后就向后台发送请求
        deferred();
        function deferred(data){
            $.get('defer', function(data){
                //输出服务端推送的数据
                console.log(data);
                //请求完成后继续下一个请求.
                deferred();
            })
        }
    </script>
</body>
</html>