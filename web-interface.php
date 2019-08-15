<html>
<?php
							$servername="localhost";
							$db="pacific";
							$user = "root";
							$pass="";
							$connection = mysqli_connect($servername,$user,$pass,$db);
							// Query to fetch data from database
							$sql = "Select * from test";
								// $sql = "SELECT m.name, m.musician_image_url, p.Description, p.Month_Year FROM musician as m , perfomance as p where m.musicianid=p.MusicianId";
								$imagequery_run = $connection->query($sql); 
								$result = mysqli_query($connection, $sql);
								if ($imagequery_run) 
								{
	   							 // runs the loop untilit it fetches all the rows from the database
	    							while($row = $result->fetch_assoc())
	    							{
	        							//all the data is echoed using using php echo command. wherever the the data has to be fetched php variables are given
	        						echo '<p id="month"><strong>'.$row['Fname'].'</strong></p>';
									echo '<table id="tab">';
									
									echo '<td>';	
									echo $row['Lname'];
									echo '</td>';
									echo '</table>';
									
	    							}
								}
								else
								{ 
								//if no row is present in database it echos 0 results
	    							echo "0 results";
								}
								?>
						




						<h1>---------------------</h1>


						<form method="POST" name="myform" action="">
							
								<!-- after submit button is clicked checks if any required field is empty -->
	<?php
	if(isset($_POST['submit']))
		{
			$fname=$_REQUEST['fname'];
			$lname=$_REQUEST['lname'];




		//if all three contents are filled enters data in to the database.
			$sql = "INSERT INTO test (Fname, Lname)
	        VALUES ('$fname','$lname')";
	        mysqli_query($connection,$sql);
	        echo "Data Inserted";
	        header("index.php?signup=success");

	}
	?>
							
	          					<label class="formalign">*First Name:</label></td>
	          					<input type = "text" id = "fname" name="fname" 
	                 			/>
	        					

	        					<label class="formalign">*Last Name:</label></td>
	          					<td class="contentalign" ><input type = "Last Name"
	                 			id = "lname" name="lname" 
	                 			/>
	        					<button type="submit"  value="submit" onclick="validateform()" name="submit" id="btn">Apply Now</button>
						</form>
</html>