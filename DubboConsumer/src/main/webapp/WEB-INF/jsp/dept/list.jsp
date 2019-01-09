
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="<%=request.getContextPath()%>/jq/jquery.min.js"></script>
    <script>
        $(function(){
            $.ajax({url:"<%=request.getContextPath()%>/dept/list.do",
                type:"post",
                async:false,
                contentType:"json",
                success:function(data){
                    if(data!=''){
                        var tr="";
                        for (var i = 0; i < data.length; i++) {
                            var obj = data[i];
                            tr+="<tr><td>"+obj.dname+"</td><td>"+obj.loc+"</td><td>更新&nbsp;删除</td></tr>";
                        }
                        $("#tbd").append(tr);
                    }
                }});

        });
    </script>
</head>
<body>
     <h3>部门列表 ip:192.168.21.150</h3>
     <table border="1" width="600">
         <tr><td>名称</td><td>位置</td><td>操作</td></tr>

         <tbody id="tbd"></tbody>
     </table>
</body>
</html>
