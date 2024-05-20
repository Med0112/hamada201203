//document.getElementById('imageForm').addEventListener('submit', function(event) {
//    event.preventDefault();
//    const imagePath = document.getElementById('imagePath').value;
//
//    fetch('/process-image', {
//        method: 'POST',
//        headers: {
//            'Content-Type': 'application/json'
//        },
//        body: JSON.stringify({ imagePath: imagePath })
//    })
//    .then(response => response.text())
//    .then(data => {
//        document.getElementById('result').innerText = data;
//    })
//    .catch(error => {
//        console.error('Error:', error);
//    });
//});






//--------------------------------------------

document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('imageForm');
    const imagePathInput = document.getElementById('imagePath');
    const imageResult = document.getElementById('imageResult');

    form.addEventListener('submit', async (event) => {
        event.preventDefault();

        const imagePath = imagePathInput.value.trim();

        try {
            // Fetch the image using the provided path
            const response = await fetch(imagePath);
            if (!response.ok) {
                throw new Error('Failed to fetch image');
            }

            // Create an img element to display the image
            const img = document.createElement('img');
            img.src = imagePath;
            img.alt = 'User Image';
            img.style.maxWidth = '100%';

            // Clear previous results and append the new image
            imageResult.innerHTML = '';
            imageResult.appendChild(img);
        } catch (error) {
            // Display error message if fetching the image fails
            imageResult.innerHTML = `<p>Error: ${error.message}</p>`;
        }
    });
});
