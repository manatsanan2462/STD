// อนิเมชั่นตัวอักษรค่อยๆ โผล่ขึ้นมาตอนโหลดหน้าเว็บ
gsap.from(".hero-title", {
    duration: 1.5,
    y: 100,
    opacity: 0,
    ease: "power4.out",
    stagger: 0.2
});

// อนิเมชั่นรูปภาพเมื่อ Scroll ถึง (ScrollTrigger)
gsap.to(".service-card", {
    scrollTrigger: ".service-card",
    duration: 1,
    y: 0,
    opacity: 1,
    stagger: 0.3
});
// ตัวอย่างสร้างอนุภาควิ่งๆ เป็นพื้นหลัง (Conceptual Code)
const scene = new THREE.Scene();
const camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
const renderer = new THREE.WebGLRenderer({ alpha: true });
renderer.setSize(window.innerWidth, window.innerHeight);
document.getElementById('canvas-container').appendChild(renderer.domElement);

const geometry = new THREE.BufferGeometry();
// ... ใส่ Code สร้างจุดอนุภาค (Particles) แทนโครงสร้างโมเลกุลหรือท่อส่งก๊าซ ...
// เมื่อ User ขยับเมาส์ อนุภาคจะค่อยๆ ขยับตาม