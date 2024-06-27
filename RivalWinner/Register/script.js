document.addEventListener('DOMContentLoaded', (event) => {
    document.getElementById('registerForm').addEventListener('submit', function(event) {
        event.preventDefault(); 

        
        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;
        const confirmPassword = document.getElementById('confirmPassword').value;
        const email = document.getElementById('email').value;
        const age = document.getElementById('age').value;
        const location = document.getElementById('location').value;

        
        if (username && password && confirmPassword && email && age && location) {
            if (password !== confirmPassword) {
                alert('Las contraseñas no coinciden.');
                return;
            }

            window.location.href = "../MainPage/index.html";
        } else {
            alert('Por favor, complete todos los campos.');
        }
    });
});