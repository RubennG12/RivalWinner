document.addEventListener("DOMContentLoaded", function() {
    var modal = document.getElementById("modal");
    var btns = document.querySelectorAll(".botones");
    var span = document.getElementsByClassName("close")[0];

    btns.forEach(function(btn) {
        btn.addEventListener("click", function() {
            modal.style.display = "block";
        });
    });

    span.addEventListener("click", function() {
        modal.style.display = "none";
    });

    window.addEventListener("click", function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    });

    document.getElementById("payment-form").addEventListener("submit", function(event) {
        event.preventDefault(); 

        var cardName = document.getElementById("card-name").value;
        var cvv = document.getElementById("cvv").value;
        var expiryDate = document.getElementById("expiry-date").value;

        if (!/^\d+$/.test(cardName)) {
            alert("El número de la tarjeta debe contener solo números.");
            return;
        }

        if (!/^\d{3}$/.test(cvv)) {
            alert("El CVV debe tener exactamente 3 números.");
            return;
        }

        if (!/^\d{4}-\d{2}$/.test(expiryDate)) {
            alert("La fecha de caducidad debe estar en el formato MM/YYYY.");
            return;
        }

        modal.style.display = "none";

        alert("Te has inscrito correctamente. ¡Mucha suerte!");
    });
});
