Feature: Managemen Divisi

  Scenario: TCC.TMS.092 Menu Halaman Managemen Divisi
    When TCC.TMS.092 klik dropdown menu master
    And TCC.TMS.092 klik menu managemen divisi
    Then TCC.TMS.092 validasi tampil halaman managemen divisi

  Scenario: TCC.TMS.093 pilih Nama Divisi
    When TCC.TMS.093 klik dropdown menu master
    And TCC.TMS.093 pilih nama divisi
    Then TCC.TMS.093 validasi tampil halaman nama divisi

  Scenario: TCC.TMS.094 input NIK team leader/V1
    When TCC.TMS.094 klik field NIK team leader
    Then TCC.TMS.094 input NIK team leader

  Scenario: TCC.TMS.095 nama team leader/V1
    When TCC.TMS.095 nama team leader otomatis

  Scenario: TCC.TMS.096 input nama supervisor
    When TCC.TMS.096 klik field nama supervisor
    Then TCC.TMS.096 input nama supervisor

  Scenario: TCC.TMS.097 input nama staff backup
    When TCC.TMS.097 klik field nama backup staff
    Then TCC.TMS.097 input nama backup staff

  Scenario: TCC.TMS.098 tombol simpan managemen divisi
    When TCC.TMS.098 klik tombol simpan managemen divisi
    Then TCC.TMS.098 validasi data berhasil disimpan

  Scenario: TCC.TMS.099 Input Nama Divisi alphanumeric
    When TCC.TMS.099 klik dropdown menu master alphanumeric
    And TCC.TMS.099 pilih nama divisi alphanumeric
    Then TCC.TMS.099 validasi tampil halaman nama divisi alphanumeric

  Scenario: TCC.TMS.100 input NIK team leader/V1 alphanumeric
    When TCC.TMS.100 klik field NIK team leader alphanumeric
    Then TCC.TMS.100 input NIK team leader alphanumeric

  Scenario: TCC.TMS.101 nama team leader/V1 alphanumeric
    When TCC.TMS.101 nama team leader otomatis alphanumeric

  Scenario: TCC.TMS.102 input nama supervisor alphanumeric
    When TCC.TMS.102 klik field nama supervisor alphanumeric
    Then TCC.TMS.102 input nama supervisor alphanumeric

  Scenario: TCC.TMS.103 input nama staff backup alphanumeric
    When TCC.TMS.103 klik field nama backup staff alphanumeric
    Then TCC.TMS.103 input nama backup staff alphanumeric

  Scenario: TCC.TMS.104 tombol simpan managemen divisi alphanumeric
    When TCC.TMS.104 klik tombol simpan managemen divisi alphanumeric
    Then TCC.TMS.104 validasi data berhasil disimpan alphanumeric

  Scenario: TCC.TMS.105 show 10 entries (List Divisi)
    When TCC.TMS.105 klik dropdown pada halaman list divisi show 10 entries
    And TCC.TMS.105 pilih angka 10
    Then TCC.TMS.105 validasi menampilkan halaman list divisi sebanyak 10 baris

  Scenario: TCC.TMS.106 show 25 entries (List Divisi)
    When TCC.TMS.106 klik dropdown pada halaman list divisi show 25 entries
    And TCC.TMS.106 pilih angka 25
    Then TCC.TMS.106 validasi menampilkan halaman list divisi sebanyak 25 baris

  Scenario: TCC.TMS.107 show 50 entries (List Divisi)
    When TCC.TMS.107 klik dropdown pada halaman list divisi show 50 entries
    And TCC.TMS.107 pilih angka 50
    Then TCC.TMS.107 validasi menampilkan halaman list divisi sebanyak 50 baris

  Scenario: TCC.TMS.108 show 100 entries (List Divisi)
    When TCC.TMS.108 klik dropdown pada halaman list divisi show 100 entries
    And TCC.TMS.108 pilih angka 100
    Then TCC.TMS.108 validasi menampilkan halaman list divisi sebanyak 100 baris

  Scenario: TCC.TMS.109 search (List Divisi)
    When TCC.TMS.109 klik search box pada halaman list divisi
    And TCC.TMS.109 cari nama yang sudah diinput list divisi
    Then TCC.TMS.109 validasi menampilkan halaman nama yang telah diinput

  Scenario: TCC.TMS.110 no (List Divisi)
    When TCC.TMS.110 validasi menampilkan halaman no yang telah diinput

  Scenario: TCC.TMS.111 info (List Divisi)
    When TCC.TMS.111 validasi menampilkan halaman info list divisi yang telah diinput

  Scenario: TCC.TMS.112 action (List Divisi)
    When TCC.TMS.112 validasi menampilkan halaman action list divisi yang telah diinput

  Scenario: TCC.TMS.113 edit (List Divisi)
    When TCC.TMS.113 validasi menampilkan halaman edit nama divisi

  Scenario: TCC.TMS.114 delete (List Divisi)
    When TCC.TMS.114 validasi menampilkan halaman delete nama divisi

  Scenario: TCC.TMS.115 Showing Page 2,3,4......dst (List Divisi)
    When TCC.TMS.115 klik page 2, 3, 4.....dst yang berada dibawah halaman list divisi
    And TCC.TMS.115 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi

  Scenario: TCC.TMS.116 Showing Next Page (List Divisi)
    When TCC.TMS.116 klik Next page yang berada dibawah halaman list divisi
    And TCC.TMS.116 validasi menampilkan Next page yang berada dibawah halaman list divisi

  Scenario: TCC.TMS.117 Showing Previous Page (List Divisi)
    When TCC.TMS.117 klik Previous page yang berada dibawah halaman list divisi
    And TCC.TMS.117 validasi menampilkan Previous page yang berada dibawah halaman list divisi

  Scenario: TCC.TMS.118 pilih nama divisi
    When TCC.TMS.118 klik dropdown menu master
    And TCC.TMS.118 pilih nama divisi
    Then TCC.TMS.118 validasi tampil nama edit managemen divisi

  Scenario: TCC.TMS.119 input NIK team leader/V1
    When TCC.TMS.119 klik field NIK team leader
    Then TCC.TMS.119 input NIK team leader

  Scenario: TCC.TMS.120 nama team leader/V1
    When TCC.TMS.120 nama team leader otomatis

  Scenario: TCC.TMS.121 input nama supervisor
    When TCC.TMS.121 klik field nama supervisor
    Then TCC.TMS.121 input nama supervisor

  Scenario: TCC.TMS.122 input nama staff backup
    When TCC.TMS.122 klik field nama backup staff
    Then TCC.TMS.122 input nama backup staff

  Scenario: TCC.TMS.123 tombol simpan edit managemen divisi
    When TCC.TMS.123 klik tombol simpan edit managemen divisi
    Then TCC.TMS.123 validasi data berhasil disimpan

  Scenario: TCC.TMS.124 Input Nama Divisi alphanumeric
    When TCC.TMS.124 klik dropdown menu master alphanumeric
    And TCC.TMS.124 pilih nama divisi alphanumeric
    Then TCC.TMS.124 validasi tampil halaman nama divisi alphanumeric

  Scenario: TCC.TMS.125 input NIK team leader/V1 alphanumeric
    When TCC.TMS.125 klik field NIK team leader alphanumeric
    Then TCC.TMS.125 input NIK team leader alphanumeric

  Scenario: TCC.TMS.126 nama team leader/V1 alphanumeric
    When TCC.TMS.126 nama team leader otomatis alphanumeric

  Scenario: TCC.TMS.127 input nama supervisor alphanumeric
    When TCC.TMS.127 klik field nama supervisor alphanumeric
    Then TCC.TMS.127 input nama supervisor alphanumeric

  Scenario: TCC.TMS.128 input nama staff backup alphanumeric
    When TCC.TMS.128 klik field nama backup staff alphanumeric
    Then TCC.TMS.128 input nama backup staff alphanumeric

  Scenario: TCC.TMS.129 tombol simpan managemen divisi alphanumeric
    When TCC.TMS.129 klik tombol simpan edit managemen divisi
    Then TCC.TMS.129 validasi data berhasil disimpan alphanumeric

  Scenario: TCC.TMS.130 show 10 entries (List Divisi)
    When TCC.TMS.130 klik dropdown pada halaman list divisi show 10 entries
    And TCC.TMS.130 pilih angka 10
    Then TCC.TMS.130 validasi menampilkan halaman list divisi sebanyak 10 baris

  Scenario: TCC.TMS.131 show 25 entries (List Divisi)
    When TCC.TMS.131 klik dropdown pada halaman list divisi show 25 entries
    And TCC.TMS.131 pilih angka 25
    Then TCC.TMS.131 validasi menampilkan halaman list divisi sebanyak 25 baris

  Scenario: TCC.TMS.132 show 50 entries (List Divisi)
    When TCC.TMS.132 klik dropdown pada halaman list divisi show 50 entries
    And TCC.TMS.132 pilih angka 50
    Then TCC.TMS.132 validasi menampilkan halaman list divisi sebanyak 50 baris

  Scenario: TCC.TMS.133 show 100 entries (List Divisi)
    When TCC.TMS.133 klik dropdown pada halaman list divisi show 100 entries
    And TCC.TMS.133 pilih angka 100
    Then TCC.TMS.133 validasi menampilkan halaman list divisi sebanyak 100 baris

  Scenario: TCC.TMS.134 search (List Divisi)
    When TCC.TMS.134 klik search box pada halaman list divisi
    And TCC.TMS.134 cari nama yang sudah diinput list divisi
    Then TCC.TMS.134 validasi menampilkan halaman nama yang telah diinput

  Scenario: TCC.TMS.135 no (List Divisi)
    When TCC.TMS.135 validasi menampilkan halaman no yang telah diinput

  Scenario: TCC.TMS.136 info (List Divisi)
    When TCC.TMS.136 validasi menampilkan halaman info list divisi yang telah diinput

  Scenario: TCC.TMS.137 action (List Divisi)
    When TCC.TMS.137 validasi menampilkan halaman action list divisi yang telah diinput

  Scenario: TCC.TMS.138 edit (List Divisi)
    When TCC.TMS.138 validasi menampilkan halaman edit nama divisi

  Scenario: TCC.TMS.139 delete (List Divisi)
    When TCC.TMS.139 validasi menampilkan halaman delete nama divisi

  Scenario: TCC.TMS.140 Showing Page 2,3,4......dst (List Divisi)
    When TCC.TMS.140 klik page 2, 3, 4.....dst yang berada dibawah halaman list divisi
    And TCC.TMS.140 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi

  Scenario: TCC.TMS.141 Showing Next Page (List Divisi)
    When TCC.TMS.141 klik Next page yang berada dibawah halaman list divisi
    And TCC.TMS.141 validasi menampilkan Next page yang berada dibawah halaman list divisi

  Scenario: TCC.TMS.142 Showing Previous Page (List Divisi)
    When TCC.TMS.142 klik Previous page yang berada dibawah halaman list divisi
    And TCC.TMS.142 validasi menampilkan Previous page yang berada dibawah halaman list divisi
