<?php
require("config.php");
?>
<html>
<head>
<link rel="shortcut icon" type="image/ico" href="http://www.datatables.net/favicon.ico">
	<meta name="viewport" content="initial-scale=1.0, maximum-scale=2.0">
	<link rel="stylesheet" type="text/css" href="./resources/syntax/shCore.css">
	<link rel="stylesheet" type="text/css" href="./resources/demo.css">
	<script type="text/javascript" language="javascript" src="../media/js/jquery.js"></script>
	<script type="text/javascript" language="javascript" src="./resources/syntax/shCore.js"></script>
	<script type="text/javascript" language="javascript" src="./resources/demo.js"></script>

    <title>Data Tables chigozirim learning test</title>
    <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="DataTables-1.10.4/media/js/jquery.dataTables.js" type="text/javascript"></script>
        <script src="DataTables-1.10.4/media/js/jquery.js"></script>
        <script src="Chart.js-master/Chart.js" type="text/javascript"></script>
        <link rel="stylesheet" href="DataTables-1.10.4/media/css/jquery.dataTables.css">
<script type="text/javascript" language="javascript" class="init">


$(document).ready(function() {
    $('#example').DataTable();
} );


    </script>

</head>
<body>
    <table id="example" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Middle Name</th>
                <th>Department</th>
                <th>Faculty</th>
                <th>Sex</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Middle Name</th>
                <th>Department</th>
                <th>Faculty</th>
                <th>Sex</th>
            </tr>
        </tfoot>
        <tbody>
        <?php
$sql = "SELECT * FROM `studentsinfo`.`students`";
$rows = query($sql);
foreach($rows as $row){?>
        <tr>
            <td><?=$row['FirstName']?></td>
            <td><?=$row['LastName']?></td>
            <td><?=$row['MiddleName']?></td>
            <td><?=$row['Department']?></td>
            <td><?=$row['Faculty']?></td>
            <td><?=$row['Sex']?></td>
        </tr>
        <?}?>
        </tbody>
    </table>

</body>
</html>
