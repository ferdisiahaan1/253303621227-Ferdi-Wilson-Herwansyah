## TP8 - Java GUI & Swing Implementation

### 1. Screenshot Aplikasi
*(Sertakan 2 screenshot)*
- **Kondisi Awal (Misal 3-4 Karakter):** ![Screenshot 1] 2026-10-21 183509.png
- **Kondisi Akhir (5 Karakter + Statistik):** ![Screenshot 2] 2026-10-21 225346.png

### 2. Aliran Data (MVC Architecture)
Aplikasi dimulai dari `Main` yang menginstansiasi model data dan mendaftarkannya ke `CharacterManager` (Controller). `CharacterManager` mengelola daftar objek `Character` (Model) dalam memori. Selanjutnya, `Main` mengirimkan lis data karakter dari `CharacterManager` ke `MainWindow` (View) untuk dirender secara dinamis pada komponen GUI Swing.

### 3. Daftar Karakter Baru
- **Healer (Support, Level 8):** Ditambahkan sebagai karakter pendukung kelompok untuk menyeimbangkan variasi tipe *role*.
- **Assassin (DPS, Level 20):** Ditambahkan sebagai karakter tingkat lanjut dengan level tinggi untuk menguji kalkulasi rata-rata statistik level secara dinamis.

### 4. Link Dokumen Analisis
- **Google Docs (Bagian D):** [https://docs.google.com/document/d/1R8hEdzEWIp-hdSuWt-zfDFaU5eCxSOcYys6hgIvu8Nk/edit?usp=sharing]