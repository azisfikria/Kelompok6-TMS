Feature: Tambah Divisi

  Scenario: TCC.TMS.060 Menu Halaman Tambah Divisi
    When TCC.TMS.060 klik dropdown menu master
    And TCC.TMS.060 klik menu tambah divisi
    Then TCC.TMS.060 validasi Tampil Halaman Master Divisi

  Scenario: TCC.TMS.061 input nama divisi
    When TCC.TMS.061 klik field nama divisi
    And TCC.TMS.061 input nama divisi
    Then TCC.TMS.061 validasi nama divisi sudah terinput

  Scenario: TCC.TMS.062 tombol simpan tambah divisi
    When TCC.TMS.062 klik tombol simpan nama divisi
    Then TCC.TMS.062 validasi data nama divisi berhasil disimpan

  Scenario: TCC.TMS.063 input nama divisi dengan karakter alphanumeric
    When TCC.TMS.063 klik field nama divisi alphanumeric
    And TCC.TMS.063 input nama divisi alphanumeric
    Then TCC.TMS.063 validasi nama divisi alphanumeric sudah terinput

  Scenario: TCC.TMS.064 tombol simpan tambah divisi dengan karakter alphanumeric
    When TCC.TMS.064 klik tombol simpan nama divisi alphanumeric
    Then TCC.TMS.064 validasi data nama divisi alphanumeric berhasil disimpan

  Scenario: TCC.TMS.065 show 10 entries (List Divisi)
    When TCC.TMS.065 klik dropdown pada halaman list divisi show 10 entries
    And TCC.TMS.065 pilih angka 10
    Then TCC.TMS.065 validasi menampilkan halaman list divisi sebanyak 10 baris

  Scenario: TCC.TMS.066 show 25 entries (List Divisi)
    When TCC.TMS.066 klik dropdown pada halaman list divisi show 25 entries
    And TCC.TMS.066 pilih angka 25
    Then TCC.TMS.066 validasi menampilkan halaman list divisi sebanyak 25 baris

  Scenario: TCC.TMS.067 show 50 entries (List Divisi)
    When TCC.TMS.067 klik dropdown pada halaman list divisi show 50 entries
    And TCC.TMS.067 pilih angka 50
    Then TCC.TMS.067 validasi menampilkan halaman list divisi sebanyak 50 baris

  Scenario: TCC.TMS.068 show 100 entries (List Divisi)
    When TCC.TMS.068 klik dropdown pada halaman list divisi show 100 entries
    And TCC.TMS.068 pilih angka 100
    Then TCC.TMS.068 validasi menampilkan halaman list divisi sebanyak 100 baris

  Scenario: TCC.TMS.069 search (List Divisi)
    When TCC.TMS.069 klik search box pada halaman list divisi
    And TCC.TMS.069 cari nama yang sudah diinput list divisi
    Then TCC.TMS.069 validasi menampilkan halaman nama yang telah diinput

  Scenario: TCC.TMS.070 no (List Divisi)
    When TCC.TMS.070 validasi menampilkan halaman no yang telah diinput

  Scenario: TCC.TMS.071 nama divisi (List Divisi)
    When TCC.TMS.071 validasi menampilkan halaman nama divisi yang telah diinput

  Scenario: TCC.TMS.072 edit (List Divisi)
    When TCC.TMS.072 validasi menampilkan halaman edit nama divisi

  Scenario: TCC.TMS.073 Showing Page 2,3,4......dst (List Divisi)
    When TCC.TMS.073 klik page 2, 3, 4.....dst yang berada dibawah halaman list divisi
    And TCC.TMS.073 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi

  Scenario: TCC.TMS.074 Showing Next Page (List Divisi)
    When TCC.TMS.074 klik Next page yang berada dibawah halaman list divisi
    And TCC.TMS.074 validasi menampilkan Next page yang berada dibawah halaman list divisi

  Scenario: TCC.TMS.075 Showing Previous Page (List Divisi)
    When TCC.TMS.075 klik Previous page yang berada dibawah halaman list divisi
    And TCC.TMS.075 validasi menampilkan Previous page yang berada dibawah halaman list divisi

  Scenario: TCC.TMS.076 input nama divisi (edit list divisi)
    When TCC.TMS.076 klik field nama divisi edit list divisi
    And TCC.TMS.076 input nama divisi edit list divisi
    Then TCC.TMS.076 validasi nama divisi sudah terinput edit list divisi

  Scenario: TCC.TMS.077 tombol update tambah divisi (edit list divisi)
    When TCC.TMS.077 klik tombol update nama divisi edit list divisi
    Then TCC.TMS.077 validasi update data nama divisi berhasil disimpan edit list divisi

  Scenario: TCC.TMS.078 edit 2 (List Divisi)
    When TCC.TMS.078 validasi menampilkan halaman edit 2 nama divisi

  Scenario: TCC.TMS.079 input nama divisi dengan karakter alphanumeric (edit list divisi)
    When TCC.TMS.079 klik field nama divisi alphanumeric edit list divisi
    And TCC.TMS.079 input nama divisi alphanumeric edit list divisi
    Then TCC.TMS.079 validasi nama divisi alphanumeric sudah terinput edit list divisi

  Scenario: TCC.TMS.080 tombol cancel divisi dengan karakter alphanumeric (edit list divisi)
    When TCC.TMS.080 klik tombol cancel nama divisi alphanumeric edit list divisi
    Then TCC.TMS.080 validasi cancel data nama divisi alphanumeric berhasil disimpan edit list divisi

  Scenario: TCC.TMS.081 show 10 entries (edit list divisi)
    When TCC.TMS.081 klik dropdown pada halaman list divisi show 10 entries edit list divisi
    And TCC.TMS.081 pilih angka 10 edit list divisi
    Then TCC.TMS.081 validasi menampilkan halaman list divisi sebanyak 10 baris edit list divisi

  Scenario: TCC.TMS.082 show 25 entries (edit list divisi)
    When TCC.TMS.082 klik dropdown pada halaman list divisi show 25 entries edit list divisi
    And TCC.TMS.082 pilih angka 25 edit list divisi
    Then TCC.TMS.082 validasi menampilkan halaman list divisi sebanyak 25 baris edit list divisi

  Scenario: TCC.TMS.083 show 50 entries (edit list divisi)
    When TCC.TMS.083 klik dropdown pada halaman list divisi show 50 entries edit list divisi
    And TCC.TMS.083 pilih angka 50 edit list divisi
    Then TCC.TMS.083 validasi menampilkan halaman list divisi sebanyak 50 baris edit list divisi

  Scenario: TCC.TMS.084 show 100 entries (edit list divisi)
    When TCC.TMS.084 klik dropdown pada halaman list divisi show 100 entries edit list divisi
    And TCC.TMS.084 pilih angka 100 edit list divisi
    Then TCC.TMS.084 validasi menampilkan halaman list divisi sebanyak 100 baris edit list divisi

  Scenario: TCC.TMS.085 search (edit list divisi)
    When TCC.TMS.085 klik search box pada halaman edit list divisi
    And TCC.TMS.085 cari nama yang sudah diinput edit list divisi
    Then TCC.TMS.085 validasi menampilkan halaman nama yang telah diinput edit list divisi

  Scenario: TCC.TMS.086 no (edit list divisi)
    When TCC.TMS.086 validasi menampilkan halaman no yang telah diinput edit list divisi

  Scenario: TCC.TMS.087 nama divisi (edit list divisi)
    When TCC.TMS.087 validasi menampilkan halaman nama divisi yang telah diinput edit list divisi

  Scenario: TCC.TMS.088 edit (edit list divisi)
    When TCC.TMS.088 validasi menampilkan halaman edit nama divisi edit list divisi

  Scenario: TCC.TMS.089 Showing Page 2,3,4......dsb (edit list divisi)
    When TCC.TMS.089 klik page 2, 3, 4.....dst yang berada dibawah halaman edit list divisi
    And TCC.TMS.089 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman edit list divisi

  Scenario: TCC.TMS.090 Showing Next Page (edit list divisi)
    When TCC.TMS.090 klik Next page yang berada dibawah halaman edit list divisi
    And TCC.TMS.090 validasi menampilkan Next page yang berada dibawah halaman edit list divisi

  Scenario: TCC.TMS.091 Showing Previous Page (edit list divisi)
    When TCC.TMS.091 klik Previous page yang berada dibawah halaman edit list divisi
    And TCC.TMS.091 validasi menampilkan Previous page yang berada dibawah halaman edit list divisi