<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src = "JQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function()
		{
	$('#search').click(function()
			{
		//var empid =$('#empid').val();
		 $.ajax({url:"http://localhost:7001/Restfullfirstproject/jaxrs/MyFirstRestService",
				
				success: function(result)
				{
						alert(result);
					 $('#usertext').val(result);			
						
		        },
		 		error:function(data) 
				 {
		 			alert(data.status+" "+data.statustext);
				 }
				}
				);
		
			}
		);
		}
		);
</script>
<title>Insert title here</title>
</head>
<body>
<input  id ="search" type="button" value="Show User">
<input id ="usertext" type="text">
</body>
</html>