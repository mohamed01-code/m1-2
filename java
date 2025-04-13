// script.js

document.getElementById('contact-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;
    const message = document.getElementById('message').value;

    if (name && email && phone && message) {
        alert('Thank you for your message!');
        // Here you can add code to send the form data to a server or email service
        // For example, using Formspree or another service
    } else {
        alert('Please fill in all fields.');
    }
});
