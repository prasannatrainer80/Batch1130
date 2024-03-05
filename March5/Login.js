function login() {
    if (frmLogin.userName.value=="") {
        document.getElementById("errUser").innerHTML = "Please Enter UserName...";
        return;
    } else {
        document.getElementById("errUser").innerHTML = "";
    }
    if (frmLogin.passCode.value == "") {
        document.getElementById("errPassword").innerHTML = "Please Enter Password...";
        return;
    } else {
        document.getElementById("errPassword").innerHTML = "";
    }
    var user = frmLogin.userName.value;
    var pwd = frmLogin.passCode.value;
    if (user=="Ramu" && pwd == "Ramu") {
        // alert("Correct Credentials...");
        window.open("http://www.google.com");
    } else {
        alert("Invalid Credentials...");
    }
}