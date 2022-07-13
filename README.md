# FinalProject_Mobile

Nama: Gusti Fahmi Fadhila  
Kode Peserta: KSAT006ONL012

## Test Case
Tes yang dilakukan pada assignment isi antara lain:

### 1. Login
   Terdapat 5 test case untuk login. Untuk semua test case akan diawali dengan create profile. Lima test case tersebut antara lain:

   1) Login - Blank Fields  
      Mengosongkan username dan password.  

      Verify:  
      - Verify Element Not Visible, Object: Page Title - Dashboard (gagal masuk ke halaman dashboard yang menandakan gagal login)

   2) Login Incorrect Password  
      Memasukkan password yang salah.  

      Verify:  
      - Verify Element Not Visible, Object: Page Title - Dashboard (gagal masuk ke halaman dashboard yang menandakan gagal login)

   3) Login - Incorrect Username  
      Memasukkan username yang salah.  

      Verify:  
      - Verify Element Not Visible, Object: Page Title - Dashboard (gagal masuk ke halaman dashboard yang menandakan gagal login)

   4) Login Incorrect Username and Password  
      Memasukkan username dan password yang salah.  

      Verify:  
      - Verify Element Not Visible, Object: Page Title - Dashboard (gagal masuk ke halaman dashboard yang menandakan gagal login)

   5) Login - Success Valid  
      Memasukkan username dan password yang sesuai dengan data yang ddinput saat create profile.  

      Verify:  
      - Verify Element Visible, Object: Page Title - Dashboard (Masuk ke halaman dashboard yang menandakan berhasil login)

### 2. Create Bank Account  
   Terdapat 3 test case untuk create bank account. Untuk semua test case akan diawali dengan create profile dan login. Tiga test case tersebut antara lain:

   1) Create Bank Account - Blank Account Name  
      Membuat akun bank, namun dengan input nama akun yang kosong.  

      Verify:  
      - Verify Element Not Visible, Object: Image - Account 1 (artinya account gagal dibuat)

   2) Create Bank Account - Success  
      Membuat akun bank dengan input yang nama tidak kosong, sehingga akun berhasil dibuat.  

      Verify:  
      - Verify Element Text, Object: Text - Account 1 Name = "tesaccount"
      - Verify Element Text, Object: Text - Account 1 Balance = "Account balance: $1000.00"
      - Verify Element Text, Object: Text - Account 1 Number = "Account no: A1"  
      Artinya data akun sesuai dengan yang diinput.  

   3) Create Bank Account - Duplicate Account Name
      Membuat akun bank sebanyak 2 kali. Percobaan pertama berhasil, tapi percobaan kedua gagal karena menggunakan nama acoount yang sama dengan percobaan pertama.  

      Verify:  
      - Verify Element Not Visible, Object: Image - Account 1 (artinya account kedua gagal dibuat, hanya akun pertama yang berhasil)

### 3. Transaction  
   Terdapat 3 test case untuk create bank account. Untuk semua test case akan diawali dengan create profile, login, dan membuat 2 akun yang berhasil dibuat (tesacc1 dengan balance 1000 dan tesacc2 dengan balance 2000). Semua test case di bagian ini juga menggunakan if clause dan beberapa menggunakan else clause. Tiga test case tersebut antara lain:

   1) Deposit  
      Melakukan deposit sebanyak 200, JIKA balance + 200 <= max_limit (artinya penambahan 200 tidak akan melebihi limit maksimum). Nilai dari max_limit bisa diubah di variables.  

      Verify (hanya dilakukan ketika terjadi deposit pada masing-masing akun karena if clause terpenuhi):    
      - Verify Element Text, Object: Text - Account 1 Balance (1200)
      - Verify Element Text, Object: Text - Account 2 Balance (2200)

   2) Payment
      Membuat payee terlebih dahulu dengan nama "Saldo Gapoy". Lalu melakukan payment sebanyak 300, JIKA balance - 300 >= min_limit (artinya pengurangan 300 tidak akan lebih kecil dari limit minimum). Nilai dari min_limit bisa diubah di variables.  

      Verify (hanya dilakukan ketika terjadi payment pada masing-masing akun karena if clause terpenuhi):    
      - Verify Element Text, Object: Text - Account 1 Balance (700)
      - Verify Element Text, Object: Text - Account 2 Balance (1300)

   3) Transfer  
      Melakukan transfer sebanyak 500 dari suatu akun ke akun lainnya. JIKA acc1_as_sender == true, maka tesacc1 melakukan transfer ke tesacc2, tapi JIKA SEBALIKNYA (acc1_sender == false), maka tesacc2 melakukan transfer ke tesacc1. Nilai dari boolean acc1_as_sender bisa diubah di variables.  

      Verify jika tesacc1 melakukan transfer ke tesacc2: 
      - Verify Element Text, Object: Text - Account 1 Balance (500)
      - Verify Element Text, Object: Text - Account 2 Balance (2500)

      Verify jika tesacc2 melakukan transfer ke tesacc1: 
      - Verify Element Text, Object: Text - Account 1 Balance (1500)
      - Verify Element Text, Object: Text - Account 2 Balance (1500)