<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src = "JQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function()
		{
	$('#add').click(function()
			{
		//var empid =$('#empid').val();
		var v1 =$('#v1').val();
		var v2 =$('#v2').val();
		 $.ajax({url:"http://localhost:7001/RestFullserviceHomework/jaxrs/RestFullHomework/"+v1+"/"+v2+"/Add",
			 method:"get",
				success: function(result)
				{
						alert(result);
					 $('#result').val("Addition is "+result);			
						
		        },
		 		error:function(data) 
				 {
		 			alert(data.status+" "+data.statusText);
				 }
				}
				);
			}
		);

$('#mul').click(function()
		{
	//var empid =$('#empid').val();
	var v1 =$('#v1').val();
	var v2 =$('#v2').val();
	 $.ajax({url:"http://localhost:7001/RestFullserviceHomework/jaxrs/RestFullHomework/"+v1+"/"+v2+"/Mul",
		 method:"get",
			
			success: function(result)
			{
					alert(result);
				 $('#result').val("Multiplication is "+result);			
					
	        },
	 		error:function(data) 
			 {
	 			alert(data.status+" "+data.statusText);
			 }
			}
			);
		});
	$('#sub').click(function()
			{
		var v1 =$('#v1').val();
		var v2 =$('#v2').val();
		$.ajax({url:"http://localhost:7001/RestFullserviceHomework/jaxrs/RestFullHomework/"+v1+"/"+v2+"/Sub",
			method:"get",
			
			success: function(result)
			{
				alert(result);
				$('#result').val("Substraction is "+result);
			},
			error:function(data)
			{
				alert(data.status+" "+data.statusText);
			}
			}
			);
			});
		$('#empid').keyup(function()
		{
			//alert("check");
			var empid =$('#empid').val();
			 $.ajax({url:"http://localhost:7001/RestFullserviceHomework/jaxrs/RestFullHomework/"+empid,	
				 dataType:"text", 					 
				 success: function(result)
				 {					
					if(result)
						{
						alert("success"+result);
						var rs=JSON.parse(result);
						
						var htmlData="<table border=2><th>Eno</th><th>Ename</th><th>Job</th><tr><td>"+rs.Eno+"</td><td>"+rs.Ename+"</td><td>"+rs.Job+"</td></tr></table>";
						$('#empdata').html(htmlData);
						}
				   // 			
				 },
				 error:function(data)
				 {
					 alert("error" +data.status);
				 }
		}				
		);
		}	
	);
	}
	);
</script>
</head>
<body>
<input id="v1" type="number" placeholder="Enter the First Number"><br>
<input id="v2" type="number" placeholder="Enter the Second Number"><br>
<input id = "result" placeholder="result" type="text"><br>
<input id ="add" type="button" value="Add">
<input id ="mul" type="button" value="Mul">
<input id ="sub" type="button" value="Sub">
<br>
<h5>Employee Search</h5>
<input id ="empid" placeholder="Enter employee Id" type="text">
<div id="empdata">
</div>
</body> 
</html>