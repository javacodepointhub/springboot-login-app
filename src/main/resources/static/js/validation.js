function validateForm() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    let message = document.getElementById("validationMessage");
    if (username.trim() === "") {
        message.innerHTML = "Username is required";
        return false;
    }
    if (password.trim() === "") {
        message.innerHTML = "Password is required";
        return false;
    }
    return true;
}