package com.kelompokenam.tms.step_definitions;

import com.kelompokenam.tms.pages.ManagemenDivisi;
import com.kelompokenam.tms.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import static com.kelompokenam.tms.step_definitions.Hooks.delay;

    public class TestManagemenDivisi {
        WebDriver driver;
        private static ExtentTest extentTest;

        private final ManagemenDivisi managemendivisi = new ManagemenDivisi();

        public TestManagemenDivisi() {
            driver = Hooks.driver;
            extentTest = Hooks.extentTest;
        }

        //Managemen Divisi
        //Menu Dashboard Master
        @When("TCC.TMS.092 klik dropdown menu master")
        public void TCC_TMS_092_klik_dropdown_menu_master() {
            managemendivisi.menuMasterManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.092 klik dropdown menu master");
        }

        @And("TCC.TMS.092 klik menu managemen divisi")
        public void TCC_TMS_092_klik_menu_managemen_divisi() {
            managemendivisi.klikManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.092 klik menu managemen divisi");
        }

        @Then("TCC.TMS.092 validasi tampil halaman managemen divisi")
        public void TCC_TMS_092_validasi_tampil_halaman_managemen_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiTampilHalamanManagemenDivisi(), "Managemen Divisi");
            extentTest.log(LogStatus.PASS, "TCC.TMS.092 validasi tampil halaman managemen divisi");
        }

        //input nama divisi
        @When("TCC.TMS.093 klik dropdown menu master")
        public void TCC_TMS_093_klik_dropdown_menu_master() {
            managemendivisi.klikDropdownNamaDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.093 klik dropdown menu master");
        }
        @And("TCC.TMS.093 pilih nama divisi")
        public void TCC_TMS_093_pilih_nama_divisi() {
            managemendivisi.pilihNamaDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.093 pilih nama divisi");
        }
        @Then("TCC.TMS.093 validasi tampil halaman nama divisi")
        public void TCC_TMS_093_validasi_tampil_halaman_nama_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiTampilNamaManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.093 validasi tampil halaman nama divisi");
        }

        //input NIK team leader/V1
        @When("TCC.TMS.094 klik field NIK team leader")
        public void TCC_TMS_094_klik_field_NIK_team_leader() {
            managemendivisi.klikFieldNIKLeader();
            extentTest.log(LogStatus.PASS, "TCC.TMS.094 klik field NIK team leader");
        }
        @Then("TCC.TMS.094 input NIK team leader")
        public void TCC_TMS_094_input_NIK_team_leader() {
            Assert.assertEquals(managemendivisi.inputNIKLeader(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.094 input NIK team leader");
        }

        //nama team leader/V1 otomatis
        @When("TCC.TMS.095 nama team leader otomatis")
        public void TCC_TMS_095_nama_team_leader_otomatis() {
            managemendivisi.namaTeamLeader();
            extentTest.log(LogStatus.PASS, "TCC.TMS.095 nama team leader otomatis");
        }

        //input nama supervisor
        @When("TCC.TMS.096 klik field nama supervisor")
        public void TCC_TMS_096_klik_field_nama_supervisor() {
            managemendivisi.klikFieldNamaSupervisor();
            extentTest.log(LogStatus.PASS, "TCC.TMS.096 klik field nama supervisor");
        }
        @Then("TCC.TMS.096 input nama supervisor")
        public void TCC_TMS_096_input_nama_supervisor() {
            Assert.assertEquals(managemendivisi.inputNamaSupervisor(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.096 input nama supervisor");
        }

        //input nama backup staff
        @When("TCC.TMS.097 klik field nama backup staff")
        public void TCC_TMS_097_klik_field_nama_backup_staff() {
            managemendivisi.klikFieldNamaBackupStaff();
            extentTest.log(LogStatus.PASS, "TCC.TMS.097 klik field nama backup staff");
        }
        @Then("TCC.TMS.097 input nama backup staff")
        public void TCC_TMS_097_input_nama_backup_staff() {
            Assert.assertEquals(managemendivisi.inputNamaBackupStaff(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.097 input nama backup staff");
        }

        //tombol simpan
        @When("TCC.TMS.098 klik tombol simpan managemen divisi")
        public void TCC_TMS_098_klik_tombol_simpan_managemen_divisi() {
            managemendivisi.btnSimpanManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.098 klik tombol simpan managemen divisi");
        }

        @Then("TCC.TMS.098 validasi data berhasil disimpan")
        public void TCC_TMS_098_validasi_data_berhasil_disimpan() {
            Assert.assertEquals(managemendivisi.txtValidasiTombolSimpanManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.098 validasi data berhasil disimpan");
        }

        //input nama divisi alphanumeric
        @When("TCC.TMS.099 klik dropdown menu master alphanumeric")
        public void TCC_TMS_099_klik_dropdown_menu_master_alphanumeric() {
            managemendivisi.klikDropdownNamaDivisiManagemenDivisiAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.099 klik dropdown menu master alphanumeric");
        }
        @And("TCC.TMS.099 pilih nama divisi alphanumeric")
        public void TCC_TMS_099_pilih_nama_divisi_alphanumeric() {
            managemendivisi.pilihNamaDivisiManagemenDivisiAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.099 pilih nama divisi alphanumeric");
        }
        @Then("TCC.TMS.099 validasi tampil halaman nama divisi alphanumeric")
        public void TCC_TMS_099_validasi_tampil_halaman_nama_divisi_alphanumeric() {
            Assert.assertEquals(managemendivisi.txtValidasiTampilNamaManagemenDivisiAlphanumeric(), "Nama Divisi *:");
            extentTest.log(LogStatus.PASS, "TCC.TMS.099 validasi tampil halaman nama divisi alphanumeric");
        }

        //input NIK team leader/V1 alphanumeric
        @When("TCC.TMS.100 klik field NIK team leader alphanumeric")
        public void TCC_TMS_100_klik_field_NIK_team_leaderAlphanumeric() {
            managemendivisi.klikFieldNIKLeaderAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.100 klik field NIK team leader alphanumeric");
        }
        @Then("TCC.TMS.100 input NIK team leader alphanumeric")
        public void TCC_TMS_100_input_NIK_team_leader() {
            Assert.assertEquals(managemendivisi.inputNIKLeaderAlphanumeric(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.100 input NIK team leader alphanumeric");
        }

        //nama team leader/V1 otomatis alphanumeric
        @When("TCC.TMS.101 nama team leader otomatis alphanumeric")
        public void TCC_TMS_095_nama_team_leader_otomatis_alphanumeric() {
            managemendivisi.namaTeamLeaderAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.101 nama team leader otomatis alphanumeric");
        }

        //input nama supervisor alphanumeric
        @When("TCC.TMS.102 klik field nama supervisor alphanumeric")
        public void TCC_TMS_102_klik_field_nama_supervisor_alphanumeric() {
            managemendivisi.klikFieldNamaSupervisorAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.102 klik field nama supervisor alphanumeric");
        }
        @Then("TCC.TMS.102 input nama supervisor alphanumeric")
        public void TCC_TMS_102_input_nama_supervisor_alphanumeric() {
            Assert.assertEquals(managemendivisi.inputNamaSupervisorAlphanumeric(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.102 input nama supervisor alphanumeric");
        }

        //input nama backup staff alphanumeric
        @When("TCC.TMS.103 klik field nama backup staff alphanumeric")
        public void TCC_TMS_103_klik_field_nama_backup_staff_alphanumeric() {
            managemendivisi.klikFieldNamaBackupStaffAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.103 klik field nama backup staff alphanumeric");
        }
        @Then("TCC.TMS.103 input nama backup staff alphanumeric")
        public void TCC_TMS_103_input_nama_backup_staff_alphanumeric() {
            Assert.assertEquals(managemendivisi.inputNamaBackupStaffAlphanumeric(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.103 input nama backup staff alphanumeric");
        }

        //tombol simpan alphanumeric
        @When("TCC.TMS.104 klik tombol simpan managemen divisi alphanumeric")
        public void TCC_TMS_104_klik_tombol_simpan_managemen_divisi_alphanumeric() {
            managemendivisi.btnSimpanManagemenDivisiAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.104 klik tombol simpan managemen divisi alphanumeric");
        }

        @Then("TCC.TMS.104 validasi data berhasil disimpan alphanumeric")
        public void TCC_TMS_104_validasi_data_berhasil_disimpan_alphanumeric() {
            Assert.assertEquals(managemendivisi.txtValidasiTombolSimpanManagemenDivisiAlphanumeric(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.104 validasi data berhasil disimpan alphanumeric");
        }


        //Show 10 entries
        @When("TCC.TMS.105 klik dropdown pada halaman list divisi show 10 entries")
        public void TCC_TMS_105_klik_dropdown_pada_halaman_list_divisi_show_10_entries() {
            delay(Constants.DETIK);
            managemendivisi.show10EntriesListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.105 klik dropdown pada halaman list divisi show 10 entries");
        }

        @And("TCC.TMS.105 pilih angka 10")
        public void TCC_TMS_105_pilih_angka_10() {
            managemendivisi.pilihAngka10ListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.105 pilih angka 10");
        }

        @Then("TCC.TMS.105 validasi menampilkan halaman list divisi sebanyak 10 baris")
        public void TCC_TMS_105_validasi_menampilkan_halaman_list_divisi_sebanyak_10_baris() {
            Assert.assertEquals(managemendivisi.txtValidasiShow10EntriesListDivisiManagemenDivisi(), "10\n" +
                    "25\n" +
                    "50\n" +
                    "100");
            extentTest.log(LogStatus.PASS, "TCC.TMS.105 validasi menampilkan halaman list divisi sebanyak 10 baris");
        }

        //Show 25 entries
        @When("TCC.TMS.106 klik dropdown pada halaman list divisi show 25 entries")
        public void TCC_TMS_106_klik_dropdown_pada_halaman_list_divisi_show_25_entries() {
            delay(Constants.DETIK);
            managemendivisi.show25EntriesListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.106 klik dropdown pada halaman list divisi show 25 entries");
        }
        @And("TCC.TMS.106 pilih angka 25")
        public void TCC_TMS_106_pilih_angka_25() {
            managemendivisi.pilihAngka25ListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.106 pilih angka 25");
        }
        @Then("TCC.TMS.106 validasi menampilkan halaman list divisi sebanyak 25 baris")
        public void TCC_TMS_106_validasi_menampilkan_halaman_list_divisi_sebanyak_25_baris() {
            Assert.assertEquals(managemendivisi.txtValidasiShow25EntriesListDivisiManagemenDivisi(), "10\n" +
                    "25\n" +
                    "50\n" +
                    "100");
            extentTest.log(LogStatus.PASS, "TCC.TMS.106 validasi menampilkan halaman list divisi sebanyak 25 baris");
        }

        //Show 50 entries
        @When("TCC.TMS.107 klik dropdown pada halaman list divisi show 50 entries")
        public void TCC_TMS_107_klik_dropdown_pada_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.show50EntriesListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.107 klik dropdown pada halaman list divisi show 50 entries");
        }
        @And("TCC.TMS.107 pilih angka 50")
        public void TCC_TMS_107_pilih_angka_50() {
            managemendivisi.pilihAngka50ListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.107 pilih angka 50");
        }
        @Then("TCC.TMS.107 validasi menampilkan halaman list divisi sebanyak 50 baris")
        public void TCC_TMS_107_validasi_menampilkan_halaman_list_divisi_sebanyak_50_baris() {
            Assert.assertEquals(managemendivisi.txtValidasiShow50EntriesListDivisiManagemenDivisi(), "10\n" +
                    "25\n" +
                    "50\n" +
                    "100");
            extentTest.log(LogStatus.PASS, "TCC.TMS.107 validasi menampilkan halaman list divisi sebanyak 50 baris");
        }

        //Show 100 entries
        @When("TCC.TMS.108 klik dropdown pada halaman list divisi show 100 entries")
        public void TCC_TMS_108_klik_dropdown_pada_halaman_list_divisi_show_100_entries() {
            delay(Constants.DETIK);
            managemendivisi.show100EntriesListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.108 klik dropdown pada halaman list divisi show 100 entries");
        }
        @And("TCC.TMS.108 pilih angka 100")
        public void TCC_TMS_108_pilih_angka_100() {
            managemendivisi.pilihAngka100ListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.108 pilih angka 100");
        }
        @Then("TCC.TMS.108 validasi menampilkan halaman list divisi sebanyak 100 baris")
        public void TCC_TMS_108_validasi_menampilkan_halaman_list_divisi_sebanyak_100_baris() {
            Assert.assertEquals(managemendivisi.txtValidasiShow100EntriesListDivisiManagemenDivisi(), "10\n" +
                    "25\n" +
                    "50\n" +
                    "100");
            extentTest.log(LogStatus.PASS, "TCC.TMS.108 validasi menampilkan halaman list divisi sebanyak 100 baris");
        }

        //Search List Divisi
        @When("TCC.TMS.109 klik search box pada halaman list divisi")
        public void TCC_TMS_109_klik_search_box_pada_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.searchListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.109 klik search box pada halaman list divisi");
        }
        @And("TCC.TMS.109 cari nama yang sudah diinput list divisi")
        public void TCC_TMS_109_cari_nama_yang_sudah_diinput_list_divisi() {
            managemendivisi.cariNamaYangSudahDiinputlistDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.109 cari nama yang sudah diinput list divisi");
        }
        @Then("TCC.TMS.109 validasi menampilkan halaman nama yang telah diinput")
        public void TCC_TMS_109_validasi_menampilkan_halaman_nama_yang_telah_diinput() {
            Assert.assertEquals(managemendivisi.txtValidasiSearchListDivisiManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.109 validasi menampilkan halaman nama yang telah diinput");
        }

        //No List Managemen Divisi
        @When("TCC.TMS.110 validasi menampilkan halaman no yang telah diinput")
        public void TCC_TMS_110_validasi_menampilkan_halaman_no_yang_telah_diinput() {
            Assert.assertEquals(managemendivisi.txtValidasiNoListDivisiManagemenDivisi(), "No");
            extentTest.log(LogStatus.PASS, "TCC.TMS.110 validasi menampilkan halaman no yang telah diinput");
        }

        //Info (List Managemen Divisi)
        @When("TCC.TMS.111 validasi menampilkan halaman info list divisi yang telah diinput")
        public void TCC_TMS_111_validasi_menampilkan_halaman_info_list_divisi_yang_telah_diinput() {
            Assert.assertEquals(managemendivisi.txtValidasiInfoListDivisiManagemenDivisi(), "Info");
            extentTest.log(LogStatus.PASS, "TCC.TMS.111 validasi menampilkan halaman list divisi yang telah diinput");
        }

        //Action (List Managemen Divisi)
        @When("TCC.TMS.112 validasi menampilkan halaman action list divisi yang telah diinput")
        public void TCC_TMS_112_validasi_menampilkan_halaman_action_list_divisi_yang_telah_diinput() {
            Assert.assertEquals(managemendivisi.txtValidasiActionListDivisiManagemenDivisi(), "Action");
            extentTest.log(LogStatus.PASS, "TCC.TMS.112 validasi menampilkan halaman action list divisi yang telah diinput");
        }

        //Edit (List Managemen Divisi)
        @When("TCC.TMS.113 validasi menampilkan halaman edit nama divisi")
        public void TCC_TMS_113_validasi_menampilkan_halaman_edit_nama_divisi() {
            delay(Constants.DETIK);
            managemendivisi.iconEditListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.113 validasi menampilkan halaman edit nama divisi");
        }

        //Delete (List Managemen Divisi)
        @When("TCC.TMS.114 validasi menampilkan halaman delete nama divisi")
        public void TCC_TMS_114_validasi_menampilkan_halaman_delete_nama_divisi() {
            delay(Constants.DETIK);
            managemendivisi.iconDeleteListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.114 validasi menampilkan halaman edit nama divisi");
        }

        //Showing Page 2, 3, 4......dst (List Managemen Divisi)
        @When("TCC.TMS.115 klik page 2, 3, 4.....dst yang berada dibawah halaman list divisi")
        public void TCC_TMS_115_klik_page_2_3_4_______dst_yang_berada_dibawah_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.showingPage2_3_4____DstListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.115 klik page 2, 3, 4.....dsb yang berada dibawah halaman list divisi");
        }
        @Then("TCC.TMS.115 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi")
        public void TCC_TMS_115_validasi_menampilkan_page_2_3_4_______dst_yang_berada_dibawah_halaman_list_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiShowingPage2_3_4____DstListDivisiManagemenDivisi(), "2");
            extentTest.log(LogStatus.PASS, "TCC.TMS.115 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi");
        }

        //Showing Next Page (List Managemen Divisi)
        @When("TCC.TMS.116 klik Next page yang berada dibawah halaman list divisi")
        public void TCC_TMS_116_klik_next_page_yang_berada_dibawah_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.showingNextPageListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.116 klik Next page yang berada dibawah halaman list divisi");
        }
        @Then("TCC.TMS.116 validasi menampilkan Next page yang berada dibawah halaman list divisi")
        public void TCC_TMS_116_validasi_menampilkan_next_page_yang_berada_dibawah_halaman_list_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiShowingNextPageListDivisiManagemenDivisi(), "Next");
            extentTest.log(LogStatus.PASS, "TCC.TMS.116 validasi menampilkan Next page yang berada dibawah halaman list divisi");
        }

        //Showing Previous Page (List Managemen Divisi)
        @When("TCC.TMS.117 klik Previous page yang berada dibawah halaman list divisi")
        public void TCC_TMS_117_lik_previous_page_yang_berada_dibawah_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.showingPreviousPageListDivisiManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.117 klik Previous page yang berada dibawah halaman list divisi");
        }
        @Then("TCC.TMS.117 validasi menampilkan Previous page yang berada dibawah halaman list divisi")
        public void TCC_TMS_117_validasi_menampilkan_previous_page_yang_berada_dibawah_halaman_list_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiShowingPreviousPageListDivisiManagemenDivisi(), "Previous");
            extentTest.log(LogStatus.PASS, "TCC.TMS.117 validasi menampilkan Previous page yang berada dibawah halaman list divisi");
        }

        ////// Edit Halaman Managemen Divisi //////
        //input nama divisi
        @When("TCC.TMS.118 klik dropdown menu master")
        public void TCC_TMS_118_klik_dropdown_menu_master() {
            managemendivisi.klikDropdownNamaDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.118 klik dropdown menu master");
        }
        @And("TCC.TMS.118 pilih nama divisi")
        public void TCC_TMS_118_pilih_nama_divisi() {
            managemendivisi.pilihNamaDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.118 pilih nama divisi");
        }
        @Then("TCC.TMS.118 validasi tampil nama edit managemen divisi")
        public void TCC_TMS_118_validasi_tampil_nama_edit_managemen_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiTampilNamaEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.118 validasi tampil halaman nama divisi");
        }

        //input NIK team leader/V1
        @When("TCC.TMS.119 klik field NIK team leader")
        public void TCC_TMS_119_klik_field_NIK_team_leader() {
            managemendivisi.klikFieldNIKLeaderEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.119 klik field NIK team leader");
        }
        @Then("TCC.TMS.119 input NIK team leader")
        public void TCC_TMS_119_input_NIK_team_leader() {
            Assert.assertEquals(managemendivisi.inputNIKLeaderEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.119 input NIK team leader");
        }

        //nama team leader/V1 otomatis
        @When("TCC.TMS.120 nama team leader otomatis")
        public void TCC_TMS_120_nama_team_leader_otomatis() {
            managemendivisi.namaTeamLeaderEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.120 nama team leader otomatis");
        }

        //input nama supervisor
        @When("TCC.TMS.121 klik field nama supervisor")
        public void TCC_TMS_121_klik_field_nama_supervisor() {
            managemendivisi.klikFieldNamaSupervisorEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.121 klik field nama supervisor");
        }
        @Then("TCC.TMS.121 input nama supervisor")
        public void TCC_TMS_121_input_nama_supervisor() {
            Assert.assertEquals(managemendivisi.inputNamaSupervisorEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.121 input nama supervisor");
        }

        //input nama backup staff
        @When("TCC.TMS.122 klik field nama backup staff")
        public void TCC_TMS_122_klik_field_nama_backup_staff() {
            managemendivisi.klikFieldNamaBackupStaffEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.122 klik field nama backup staff");
        }
        @Then("TCC.TMS.122 input nama backup staff")
        public void TCC_TMS_122_input_nama_backup_staff() {
            Assert.assertEquals(managemendivisi.inputNamaBackupStaffEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.122 input nama backup staff");
        }

        //tombol simpan
        @When("TCC.TMS.123 klik tombol simpan edit managemen divisi")
        public void TCC_TMS_123_klik_tombol_simpan_edit_managemen_divisi() {
            managemendivisi.btnSimpanEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.123 klik tombol simpan edit managemen divisi");
        }

        @Then("TCC.TMS.123 validasi data berhasil disimpan")
        public void TCC_TMS_123_validasi_data_berhasil_disimpan() {
            Assert.assertEquals(managemendivisi.txtValidasiTombolSimpanEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.123 validasi data berhasil disimpan");
        }

        //input nama divisi alphanumeric
        @When("TCC.TMS.124 klik dropdown menu master alphanumeric")
        public void TCC_TMS_124_klik_dropdown_menu_master_alphanumeric() {
            managemendivisi.klikDropdownNamaDivisiEditManagemenDivisiAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.124 klik dropdown menu master alphanumeric");
        }
        @And("TCC.TMS.124 pilih nama divisi alphanumeric")
        public void TCC_TMS_124_pilih_nama_divisi_alphanumeric() {
            managemendivisi.pilihNamaDivisiEditManagemenDivisiAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.124 pilih nama divisi alphanumeric");
        }
        @Then("TCC.TMS.124 validasi tampil halaman nama divisi alphanumeric")
        public void TCC_TMS_124_validasi_tampil_halaman_nama_divisi_alphanumeric() {
            Assert.assertEquals(managemendivisi.txtValidasiTampilNamaEditManagemenDivisiAlphanumeric(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.124 validasi tampil halaman nama divisi alphanumeric");
        }

        //input NIK team leader/V1 alphanumeric
        @When("TCC.TMS.125 klik field NIK team leader alphanumeric")
        public void TCC_TMS_125_klik_field_NIK_team_leaderAlphanumeric() {
            managemendivisi.klikFieldNIKLeaderAlphanumericEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.125 klik field NIK team leader alphanumeric");
        }
        @Then("TCC.TMS.125 input NIK team leader alphanumeric")
        public void TCC_TMS_125_input_NIK_team_leader() {
            Assert.assertEquals(managemendivisi.inputNIKLeaderAlphanumericEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.125 input NIK team leader alphanumeric");
        }

        //nama team leader/V1 otomatis alphanumeric
        @When("TCC.TMS.126 nama team leader otomatis alphanumeric")
        public void TCC_TMS_126_nama_team_leader_otomatis_alphanumeric() {
            managemendivisi.namaTeamLeaderAlphanumericEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.126 nama team leader otomatis alphanumeric");
        }

        //input nama supervisor alphanumeric
        @When("TCC.TMS.127 klik field nama supervisor alphanumeric")
        public void TCC_TMS_127_klik_field_nama_supervisor_alphanumeric() {
            managemendivisi.klikFieldNamaSupervisorAlphanumericEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.127 klik field nama supervisor alphanumeric");
        }
        @Then("TCC.TMS.127 input nama supervisor alphanumeric")
        public void TCC_TMS_127_input_nama_supervisor_alphanumeric() {
            Assert.assertEquals(managemendivisi.inputNamaSupervisorAlphanumericEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.127 input nama supervisor alphanumeric");
        }

        //input nama backup staff alphanumeric
        @When("TCC.TMS.128 klik field nama backup staff alphanumeric")
        public void TCC_TMS_128_klik_field_nama_backup_staff_alphanumeric() {
            managemendivisi.klikFieldNamaBackupStaffAlphanumericEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.128 klik field nama backup staff alphanumeric");
        }
        @Then("TCC.TMS.128 input nama backup staff alphanumeric")
        public void TCC_TMS_128_input_nama_backup_staff_alphanumeric() {
            Assert.assertEquals(managemendivisi.inputNamaBackupStaffAlphanumericEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.128 input nama backup staff alphanumeric");
        }

        //tombol simpan alphanumeric
        @When("TCC.TMS.129 klik tombol simpan edit managemen divisi")
        public void TCC_TMS_129_klik_tombol_simpan_edit_managemen_divisi() {
            managemendivisi.btnSimpanEditManagemenDivisiAlphanumeric();
            extentTest.log(LogStatus.PASS, "TCC.TMS.129 klik tombol simpan edit managemen divisi");
        }

        @Then("TCC.TMS.129 validasi data berhasil disimpan alphanumeric")
        public void TCC_TMS_129_validasi_data_berhasil_disimpan_alphanumeric() {
            Assert.assertEquals(managemendivisi.txtValidasiTombolSimpanEditManagemenDivisiAlphanumeric(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.129 validasi data berhasil disimpan alphanumeric");
        }

        //Show 10 entries
        @When("TCC.TMS.130 klik dropdown pada halaman list divisi show 10 entries")
        public void TCC_TMS_130_klik_dropdown_pada_halaman_list_divisi_show_10_entries() {
            delay(Constants.DETIK);
            managemendivisi.show10EntriesListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.130 klik dropdown pada halaman list divisi show 10 entries");
        }

        @And("TCC.TMS.130 pilih angka 10")
        public void TCC_TMS_130_pilih_angka_10() {
            managemendivisi.pilihAngka10ListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.130 pilih angka 10");
        }

        @Then("TCC.TMS.130 validasi menampilkan halaman list divisi sebanyak 10 baris")
        public void TCC_TMS_130_validasi_menampilkan_halaman_list_divisi_sebanyak_10_baris() {
            Assert.assertEquals(managemendivisi.txtValidasiShow10EntriesListDivisiEditManagemenDivisi(), "10\n" +
                    "25\n" +
                    "50\n" +
                    "100");
            extentTest.log(LogStatus.PASS, "TCC.TMS.130 validasi menampilkan halaman list divisi sebanyak 10 baris");
        }

        //Show 25 entries
        @When("TCC.TMS.131 klik dropdown pada halaman list divisi show 25 entries")
        public void TCC_TMS_131_klik_dropdown_pada_halaman_list_divisi_show_25_entries() {
            delay(Constants.DETIK);
            managemendivisi.show25EntriesListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.131 klik dropdown pada halaman list divisi show 25 entries");
        }
        @And("TCC.TMS.131 pilih angka 25")
        public void TCC_TMS_131_pilih_angka_25() {
            managemendivisi.pilihAngka25ListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.131 pilih angka 25");
        }
        @Then("TCC.TMS.131 validasi menampilkan halaman list divisi sebanyak 25 baris")
        public void TCC_TMS_131_validasi_menampilkan_halaman_list_divisi_sebanyak_25_baris() {
            Assert.assertEquals(managemendivisi.txtValidasiShow25EntriesListDivisiEditManagemenDivisi(), "10\n" +
                    "25\n" +
                    "50\n" +
                    "100");
            extentTest.log(LogStatus.PASS, "TCC.TMS.131 validasi menampilkan halaman list divisi sebanyak 25 baris");
        }

        //Show 50 entries
        @When("TCC.TMS.132 klik dropdown pada halaman list divisi show 50 entries")
        public void TCC_TMS_132_klik_dropdown_pada_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.show50EntriesListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.131 klik dropdown pada halaman list divisi show 50 entries");
        }
        @And("TCC.TMS.132 pilih angka 50")
        public void TCC_TMS_132_pilih_angka_50() {
            managemendivisi.pilihAngka50ListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.132 pilih angka 50");
        }
        @Then("TCC.TMS.132 validasi menampilkan halaman list divisi sebanyak 50 baris")
        public void TCC_TMS_132_validasi_menampilkan_halaman_list_divisi_sebanyak_50_baris() {
            Assert.assertEquals(managemendivisi.txtValidasiShow50EntriesListDivisiEditManagemenDivisi(), "10\n" +
                    "25\n" +
                    "50\n" +
                    "100");
            extentTest.log(LogStatus.PASS, "TCC.TMS.132 validasi menampilkan halaman list divisi sebanyak 50 baris");
        }

        //Show 100 entries
        @When("TCC.TMS.133 klik dropdown pada halaman list divisi show 100 entries")
        public void TCC_TMS_133_klik_dropdown_pada_halaman_list_divisi_show_100_entries() {
            delay(Constants.DETIK);
            managemendivisi.show100EntriesListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.133 klik dropdown pada halaman list divisi show 100 entries");
        }
        @And("TCC.TMS.133 pilih angka 100")
        public void TCC_TMS_133_pilih_angka_100() {
            managemendivisi.pilihAngka100ListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.133 pilih angka 100");
        }
        @Then("TCC.TMS.133 validasi menampilkan halaman list divisi sebanyak 100 baris")
        public void TCC_TMS_133_validasi_menampilkan_halaman_list_divisi_sebanyak_100_baris() {
            Assert.assertEquals(managemendivisi.txtValidasiShow100EntriesListDivisiEditManagemenDivisi(), "10\n" +
                    "25\n" +
                    "50\n" +
                    "100");
            extentTest.log(LogStatus.PASS, "TCC.TMS.133 validasi menampilkan halaman list divisi sebanyak 100 baris");
        }

        //Search List Divisi
        @When("TCC.TMS.134 klik search box pada halaman list divisi")
        public void TCC_TMS_134_klik_search_box_pada_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.searchListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.134 klik search box pada halaman list divisi");
        }
        @And("TCC.TMS.134 cari nama yang sudah diinput list divisi")
        public void TCC_TMS_134_cari_nama_yang_sudah_diinput_list_divisi() {
            managemendivisi.cariNamaYangSudahDiinputlistDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.134 cari nama yang sudah diinput list divisi");
        }
        @Then("TCC.TMS.134 validasi menampilkan halaman nama yang telah diinput")
        public void TCC_TMS_134_validasi_menampilkan_halaman_nama_yang_telah_diinput() {
            Assert.assertEquals(managemendivisi.txtValidasiSearchListDivisiEditManagemenDivisi(), "");
            extentTest.log(LogStatus.PASS, "TCC.TMS.134 validasi menampilkan halaman nama yang telah diinput");
        }

        //No List Managemen Divisi
        @When("TCC.TMS.135 validasi menampilkan halaman no yang telah diinput")
        public void TCC_TMS_135_validasi_menampilkan_halaman_no_yang_telah_diinput() {
            Assert.assertEquals(managemendivisi.txtValidasiNoListDivisiEditManagemenDivisi(), "No");
            extentTest.log(LogStatus.PASS, "TCC.TMS.135 validasi menampilkan halaman no yang telah diinput");
        }

        //Info (List Managemen Divisi)
        @When("TCC.TMS.136 validasi menampilkan halaman info list divisi yang telah diinput")
        public void TCC_TMS_136_validasi_menampilkan_halaman_info_list_divisi_yang_telah_diinput() {
            Assert.assertEquals(managemendivisi.txtValidasiInfoListDivisiEditManagemenDivisi(), "Info");
            extentTest.log(LogStatus.PASS, "TCC.TMS.136 validasi menampilkan halaman info list divisi yang telah diinput");
        }

        //Action (List Managemen Divisi)
        @When("TCC.TMS.137 validasi menampilkan halaman action list divisi yang telah diinput")
        public void TCC_TMS_137_validasi_menampilkan_halaman_action_list_divisi_yang_telah_diinput() {
            Assert.assertEquals(managemendivisi.txtValidasiActionListDivisiEditManagemenDivisi(), "Action");
            extentTest.log(LogStatus.PASS, "TCC.TMS.137 validasi menampilkan halaman action list divisi yang telah diinput");
        }

        //Edit (List Managemen Divisi)
        @When("TCC.TMS.138 validasi menampilkan halaman edit nama divisi")
        public void TCC_TMS_138_validasi_menampilkan_halaman_edit_nama_divisi() {
            delay(Constants.DETIK);
            managemendivisi.iconEditListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.138 validasi menampilkan halaman edit nama divisi");
        }

        //Delete (List Managemen Divisi)
        @When("TCC.TMS.139 validasi menampilkan halaman delete nama divisi")
        public void TCC_TMS_139_validasi_menampilkan_halaman_delet_nama_divisi() {
            delay(Constants.DETIK);
            managemendivisi.iconDeleteListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.139 validasi menampilkan halaman delete nama divisi");
        }

        //Showing Page 2, 3, 4......dst (List Managemen Divisi)
        @When("TCC.TMS.140 klik page 2, 3, 4.....dst yang berada dibawah halaman list divisi")
        public void TCC_TMS_140_klik_page_2_3_4_______dst_yang_berada_dibawah_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.showingPage2_3_4____DstListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.140 klik page 2, 3, 4.....dsb yang berada dibawah halaman list divisi");
        }
        @Then("TCC.TMS.140 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi")
        public void TCC_TMS_140_validasi_menampilkan_page_2_3_4_______dst_yang_berada_dibawah_halaman_list_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiShowingPage2_3_4____DstListDivisiEditManagemenDivisi(), "2");
            extentTest.log(LogStatus.PASS, "TCC.TMS.140 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi");
        }

        //Showing Next Page (List Managemen Divisi)
        @When("TCC.TMS.141 klik Next page yang berada dibawah halaman list divisi")
        public void TCC_TMS_141_klik_next_page_yang_berada_dibawah_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.showingNextPageListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.141 klik Next page yang berada dibawah halaman list divisi");
        }
        @Then("TCC.TMS.141 validasi menampilkan Next page yang berada dibawah halaman list divisi")
        public void TCC_TMS_141_validasi_menampilkan_next_page_yang_berada_dibawah_halaman_list_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiShowingNextPageListDivisiEditManagemenDivisi(), "Next");
            extentTest.log(LogStatus.PASS, "TCC.TMS.141 validasi menampilkan Next page yang berada dibawah halaman list divisi");
        }

        //Showing Previous Page (List Managemen Divisi)
        @When("TCC.TMS.142 klik Previous page yang berada dibawah halaman list divisi")
        public void TCC_TMS_142_lik_previous_page_yang_berada_dibawah_halaman_list_divisi() {
            delay(Constants.DETIK);
            managemendivisi.showingPreviousPageListDivisiEditManagemenDivisi();
            extentTest.log(LogStatus.PASS, "TCC.TMS.142 klik Previous page yang berada dibawah halaman list divisi");
        }
        @Then("TCC.TMS.142 validasi menampilkan Previous page yang berada dibawah halaman list divisi")
        public void TCC_TMS_142_validasi_menampilkan_previous_page_yang_berada_dibawah_halaman_list_divisi() {
            Assert.assertEquals(managemendivisi.txtValidasiShowingPreviousPageListDivisiEditManagemenDivisi(), "Previous");
            extentTest.log(LogStatus.PASS, "TCC.TMS.142 validasi menampilkan Previous page yang berada dibawah halaman list divisi");
        }


    }

