function crearCuenta() {
    window.location.href = "../Register/index.html"; 
}

function inicioSesion(event) {
    event.preventDefault(); 
    
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    if (username && password) {
        
        window.location.href = "../MainPage/index.html";
    } else {
        alert('Por favor, complete todos los campos.');
    }
}
