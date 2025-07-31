
document.addEventListener('DOMContentLoaded', () => {
    const toggler = document.querySelector('.navbar-toggler');
    const menu = document.querySelector('.navbar-menu');
    const openIcon = document.querySelector('.open-icon');
    const closeIcon = document.querySelector('.close-icon');
    const navLinks = document.querySelectorAll('.nav-links a');

    // Toggle menu and icons
    toggler.addEventListener('click', () => {
        menu.classList.toggle('active');
        menu.classList.toggle('dropdown');
        openIcon.style.display = menu.classList.contains('active') ? 'none' : '';
        closeIcon.style.display = menu.classList.contains('active') ? '' : 'none';
    });

    // Close menu when clicking outside
    document.addEventListener('click', (event) => {
        if (!menu.contains(event.target) && !toggler.contains(event.target) && menu.classList.contains('active')) {
            menu.classList.remove('active');
            menu.classList.remove('dropdown');
            openIcon.style.display = '';
            closeIcon.style.display = 'none';
        }
    });

    // Close menu when clicking a nav link
    navLinks.forEach(link => {
        link.addEventListener('click', () => {
            menu.classList.remove('active');
            menu.classList.remove('dropdown');
            openIcon.style.display = '';
            closeIcon.style.display = 'none';
        });
    });
});