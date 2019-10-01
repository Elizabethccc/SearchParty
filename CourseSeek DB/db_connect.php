
<?php
define('DB_USER', "root"); 
define('DB_PASSWORD', "GSU123!!"); 
define('DB_DATABASE', "CourseSeek"); 
define('DB_SERVER', "courseseek-database.ces0s77dgomj.us-east-1.rds.amazonaws.com"); // endpoint
 
$con = mysqli_connect(DB_SERVER,DB_USER,DB_PASSWORD,DB_DATABASE);
 

if(mysqli_connect_errno())
{
	echo "Failed to connect to MySQL: " . mysqli_connect_error();
}
 
?>