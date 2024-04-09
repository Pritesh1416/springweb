<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div style="text-align: center; color: tomato;"><h2>Student Registration Page</h2></div>
    <form name="student" action="saveStudent" method="post">
    <table style="margin: auto; background-color: violet; border-radius: 10px;">
    <tr>
        <td><b>Name :</b></td>
        <td><input type="text" name="name" placeholder="Enter Your Name" width="800px" required=true></td>
        </tr>
    <tr>
        <td><b>Contact :</b></td>
        <td><input type="text" name="contact" placeholder="Enter Your Contact Number" width="800px" required=true></td>
    </tr>
    <tr>
        <td><b>College :</b></td>
        <td><input type="text" name="college" placeholder="Enter Your College" width="800px" required=true></td>
    </tr>
    <tr>
        <td><b>Percentage :</b></td>
        <td><input type="text" name="percentage" placeholder="Enter Your Percentage" width="800px" required=true></td>
    </tr>
    <tr>
        <td><b>Email :</b></td>
        <td><input type="text" name="email" placeholder="Enter Your Email" width="800px" required=true></td>
    </tr>
    <tr>
        <td><b>Password :</b></td>
        <td><input type="password" name="password" placeholder="Enter Password" width="800px" required=true></td>
    </tr>
    </table>
    <div style="text-align: center;"><td><button type="submit" name="submitbtn"><b>Submit</b></button></td></div>
    <div style="text-align: center; color: green;"><td><b>${message}</b></td></div>
</form>
</body>
</html>