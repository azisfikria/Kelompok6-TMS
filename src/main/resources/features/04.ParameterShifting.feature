Feature: Parameter Shifting

  Scenario: TCC.TMS.060 Menu Halaman parameter shifting
    When TCC.TMS.060 klik dropdown menu master parameter shifting
    And TCC.TMS.060 klik menu parameter shifting
    Then TCC.TMS.060 validasi tampil halaman parameter shifting

  Scenario: TCC.TMS.143 show 100 entries (parameter shifting)
    When TCC.TMS.143 klik dropdown pada halaman parameter shifting show 100 entries
    And TCC.TMS.143 pilih angka 100
    Then TCC.TMS.143 validasi menampilkan halaman parameter shifting sebanyak 100 baris

  Scenario: TCC.TMS.144 show 25 entries (parameter shifting)
    When TCC.TMS.144 klik dropdown pada halaman parameter shifting show 25 entries
    And TCC.TMS.144 pilih angka 25
    Then TCC.TMS.144 validasi menampilkan halaman parameter shifting sebanyak 25 baris

  Scenario: TCC.TMS.145 show 50 entries (parameter shifting)
    When TCC.TMS.145 klik dropdown pada halaman parameter shifting show 50 entries
    And TCC.TMS.145 pilih angka 50
    Then TCC.TMS.145 validasi menampilkan halaman parameter shifting sebanyak 50 baris

  Scenario: TCC.TMS.146 show 10 entries (parameter shifting)
    When TCC.TMS.146 klik dropdown pada halaman parameter shifting show 10 entries
    And TCC.TMS.146 pilih angka 10
    Then TCC.TMS.146 validasi menampilkan halaman parameter shifting sebanyak 10 baris

  Scenario: TCC.TMS.147 Showing Page 2,3,4......dst (parameter shifting)
    When TCC.TMS.147 klik page 2, 3, 4.....dst yang berada dibawah halaman parameter shifting
    And TCC.TMS.147 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman parameter shifting

  Scenario: TCC.TMS.148 Showing Next Page (parameter shifting)
    When TCC.TMS.148 klik Next page yang berada dibawah halaman parameter shifting
    And TCC.TMS.148 validasi menampilkan Next page yang berada dibawah halaman parameter shifting

  Scenario: TCC.TMS.149 Showing Previous Page (parameter shifting)
    When TCC.TMS.149 klik Previous page yang berada dibawah halaman parameter shifting
    And TCC.TMS.149 validasi menampilkan Previous page yang berada dibawah halaman parameter shifting

  Scenario: TCC.TMS.150 search (parameter shifting)
    When TCC.TMS.150 klik search box pada halaman parameter shifting
    And TCC.TMS.150 cari nama yang sudah diinput parameter shifting
    Then TCC.TMS.150 validasi menampilkan halaman nama yang telah diinput parameter shifting

  Scenario: TCC.TMS.151 Nomor parameter shifting
    When TCC.TMS.151 validasi menampilkan halaman nomor yang telah diinput

  Scenario: TCC.TMS.152 Unit parameter shifting
    When TCC.TMS.152 validasi menampilkan halaman unit yang telah diinput

  Scenario: TCC.TMS.153 nama shift parameter shifting
    When TCC.TMS.153 validasi menampilkan halaman nama shift yang telah diinput

  Scenario: TCC.TMS.154 Jam Mulai parameter shifting
    When TCC.TMS.154 validasi menampilkan halaman jam mulai yang telah diinput

  Scenario: TCC.TMS.155 Jam Selesai parameter shifting
    When TCC.TMS.155 validasi menampilkan halaman jam selesai yang telah diinput

  Scenario: TCC.TMS.156 Aksi parameter shifting
    When TCC.TMS.156 validasi menampilkan halaman aksi yang telah diinput

  Scenario: TCC.TMS.157 tombol edit parameter shifting
    When TCC.TMS.157 tombol edit parameter shifting

  Scenario: TCC.TMS.158 tombol hapus parameter shifting
    When TCC.TMS.158 tombol hapus parameter shifting

  Scenario: TCC.TMS.159 Tombol Tambah/add parameter shifting
    When TCC.TMS.159 tombol add parameter shifting

  Scenario: TCC.TMS.160 Unit (add form parameter shifting)
    When TCC.TMS.160 klik dropdown list
    Then TCC.TMS.160 pilih nama unit

  Scenario: TCC.TMS.161 Search Unit (add form parameter shifting)
    When TCC.TMS.161 klik dropdown list
    And TCC.TMS.161 klik search box
    Then TCC.TMS.161 input nama unit

  Scenario: TCC.TMS.162 Nama Shift (add form parameter shifting)
    When TCC.TMS.162 klik field nama shift
    Then TCC.TMS.162 input nama shift yang akan digunakan

  Scenario: TCC.TMS.163 Nama Shift alphanumeric (add form parameter shifting)
    When TCC.TMS.163 klik field nama shift karakter alphanumeric
    Then TCC.TMS.163 input nama shift menggunakan karakter alphanumeric

  Scenario: TCC.TMS.164 Jam Mulai (add form parameter shifting)
    When TCC.TMS.164 klik field jam mulai
    Then TCC.TMS.164 input jam mulai

  Scenario: TCC.TMS.165 Jam Mulai alphanumeric (add form parameter shifting)
    When TCC.TMS.165 klik field jam mulai alphanumeric
    Then TCC.TMS.165 input jam mulai alphanumeric

  Scenario: TCC.TMS.166 Jam Selesai (add form parameter shifting)
    When TCC.TMS.166 klik field jam selesai
    Then TCC.TMS.166 input jam selesai

  Scenario: TCC.TMS.167 Jam Selesai alphanumeric (add form parameter shifting)
    When TCC.TMS.167 klik field jam selesai alphanumeric
    Then TCC.TMS.167 input jam selesai alphanumeric

  Scenario: TCC.TMS.168 tombol submit (add form parameter shifting)
    When TCC.TMS.168 klik tombol submit

  Scenario: TCC.TMS.169 tombol edit (add form parameter shifting)
    When TCC.TMS.169 klik tombol edit

  Scenario: TCC.TMS.170 tombol back (add form parameter shifting)
    When TCC.TMS.170 klik tombol back

  Scenario: TCC.TMS.171 tombol edit two (add form parameter shifting)
    When TCC.TMS.171 klik tombol edit two

  Scenario: TCC.TMS.172 Unit (edit add form parameter shifting)
    When TCC.TMS.172 klik icon edit
    Then TCC.TMS.172 nama unit otomatis terisi

  Scenario: TCC.TMS.173 Nama Shift (edit add form parameter shifting)
    When TCC.TMS.173 klik field edit nama shift
    Then TCC.TMS.173 input edit nama shift yang akan digunakan

  Scenario: TCC.TMS.174 Nama Shift alphanumeric (edit add form parameter shifting)
    When TCC.TMS.174 klik field edit nama shift karakter alphanumeric
    Then TCC.TMS.174 input edit nama shift menggunakan karakter alphanumeric

  Scenario: TCC.TMS.175 Jam Mulai (edit add form parameter shifting)
    When TCC.TMS.175 klik field edit jam mulai
    Then TCC.TMS.175 input edit jam mulai

  Scenario: TCC.TMS.176 Jam Mulai alphanumeric (edit add form parameter shifting)
    When TCC.TMS.176 klik field edit jam mulai alphanumeric
    Then TCC.TMS.176 input edit jam mulai alphanumeric

  Scenario: TCC.TMS.177 Jam Selesai (edit add form parameter shifting)
    When TCC.TMS.177 klik field edit jam selesai
    Then TCC.TMS.177 input edit jam selesai

  Scenario: TCC.TMS.178 Jam Selesai alphanumeric (edit add form parameter shifting)
    When TCC.TMS.178 klik field edit jam selesai alphanumeric
    Then TCC.TMS.178 input edit jam selesai alphanumeric

  Scenario: TCC.TMS.179 tombol submit (edit add form parameter shifting)
    When TCC.TMS.179 klik tombol submit edit

  Scenario: TCC.TMS.180 tombol edit (edit add form parameter shifting)
    When TCC.TMS.180 klik tombol edit edit

  Scenario: TCC.TMS.181 tombol back two (edit add form parameter shifting)
    When TCC.TMS.181 klik tombol back two