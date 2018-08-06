<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello World!</h2>
<input type="button" value="存储字符串" onclick="cunchu1()">
<input type="button" value="存储对象" onclick="cunchu2()">
<input type="button" value="清空" onclick="qingkong()">
<input type="button" value="删除字符串" onclick="shanchu()">
<input type="button" value="获取字符串" onclick="huoqu1()">
<input type="button" value="获取对象" onclick="huoqu2()">
	<script type="text/javascript">
        function cunchu1(){
        	alert(1);
            var arr = [ 1, 2, 3 ];
            localStorage.setItem("temp", arr); //存入 参数： 1.调用的值 2.所要存入的数据 
            console.log(localStorage.getItem("temp"));//输出
        }
        function cunchu2(){
            //JSON对象转JSON字符串
            var obj = {"a": 1,"b": 2};
            obj = JSON.stringify(obj); //转化为JSON字符串
            localStorage.setItem("temp2", obj);
        }
        function qingkong(){
            localStorage.clear()
        }
        function shanchu(){
            localStorage.removeItem("temp");
        }
        function huoqu1(){
            alert(localStorage.getItem("temp"));
        }
        function huoqu2(){
            var oo = JSON.parse(localStorage.getItem("temp2"));
            alert(oo.a);
        }
    </script>
</body>
</html>
