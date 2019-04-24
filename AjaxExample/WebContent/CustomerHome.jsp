<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src ="JQuery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function()
		{
		 $('#show').click(function()
		{
			 var deptId  =$('#deptId').val();
			 $.ajax({url:"CustomerJdbc.jsp?deptId="+deptId,		
					
					success: function(result){
							/*alert(result);
						if(result.indexOf('success')!=-1)
							{
			                $("#userStatus").html("<font color=red>User not available</font>");
							}
						else
							{
							$("#userStatus").html("<font color=green>User available</font>");
							}*/
				  $('#empdata').html(result);			
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
<input id ="deptId" type="text" placeholder="Enter Department Id">
<input id ="show" type="button" value="Search"><br>
<div id = empdata>
</div>
</body>
</html>