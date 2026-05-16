document.getElementById("loginForm").addEventListener("submit", function(e) {
    e.preventDefault(); // Prevent form from submitting
  
    // Get input values
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
  
    // Simple if-else check for the 3 users
    if (username === "user1" && password === "pass1") {
      window.location.href = "index.html"; // Redirect
    } else if (username === "user2" && password === "pass2") {
      window.location.href = "index.html"; // Redirect
    } else if (username === "user3" && password === "pass3") {
      window.location.href = "index.html"; // Redirect
    } else {
      document.write = "Invalid username or password!";
    }
  });
  