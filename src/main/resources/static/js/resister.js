$(function(){
	$("#zhuce").on("click",zhuce);
} )
function zhuce(){
	var workId=$("#username").val();
	var password=$("#password").val();
	var name=$("#xingming").val();
	var gender=$("#gender").val();
	alert(workId);
	$.ajax({
        //请求路径
        url: '/register',  //提交的页面
        data: {                 //传过去的数据，"userName"servlet的req取值使用的，相当于form表单的name
            "workId":workId,
            "password":password
            // "name":name,
            // "gender":gender,
        },
        type: "post",    //提交方式
        dataType: "text", ////json,或text【如果前端返回来的是单个字符串，就用text，是对象就用json】
        success: function (data) {//解析数据  [解析servlet的resp些回来的数据]
            if (data==200){
                alert("注册成功")
            }
        }
    });
}

