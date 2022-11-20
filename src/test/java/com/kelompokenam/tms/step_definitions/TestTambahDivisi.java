package com.kelompokenam.tms.step_definitions;

import com.kelompokenam.tms.pages.TambahDivisi;
import com.kelompokenam.tms.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.kelompokenam.tms.step_definitions.Hooks.delay;

public class TestTambahDivisi {
    WebDriver driver;
    private static ExtentTest extentTest;

    private final TambahDivisi tambahdivisi = new TambahDivisi();

    public TestTambahDivisi() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Tambah Divisi

    //Menu Dashboard Master
    @When("TCC.TMS.060 klik dropdown menu master")
    public void TCC_TMS_060_klik_dropdown_menu_master() {
        tambahdivisi.menuMaster();
        extentTest.log(LogStatus.PASS, "TCC.TMS.060 klik dropdown menu master");
    }

    @And("TCC.TMS.060 klik menu tambah divisi")
    public void TCC_TMS_060_klik_menu_tambah_divisi() {
        tambahdivisi.menuMasterTambahDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.060 klik menu tambah divisi");
    }

    @Then("TCC.TMS.060 validasi Tampil Halaman Master Divisi")
    public void TCC_TMS_060_validasi_tampil_halaman_master_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiTampilHalamanMasterDivisi(), "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.060 validasi Tampil Halaman Master Divisi");
    }

    //Input Nama Divisi
    @When("TCC.TMS.061 klik field nama divisi")
    public void TCC_TMS_061_klik_field_nama_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.fieldNamaDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.061 klik field nama divisi");
    }

    @And("TCC.TMS.061 input nama divisi")
    public void TCC_TMS_061_input_nama_divisi() {
        tambahdivisi.inputNamaDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.061 input nama divisi");
    }

    @Then("TCC.TMS.061 validasi nama divisi sudah terinput")
    public void TCC_TMS_061_validasi_nama_divisi_sudah_terinput() {
        Assert.assertEquals(tambahdivisi.txtValidasiInputNamaDivisi(), "Master Divisi");
        extentTest.log(LogStatus.PASS, "TCC.TMS.061 validasi nama divisi sudah terinput");
    }

    //tombol simpan
    @When("TCC.TMS.062 klik tombol simpan nama divisi")
    public void TCC_TMS_062_klik_tombol_simpan_nama_divisi() {
        tambahdivisi.btnSimpanMasterDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.062 klik tombol simpan nama divisi");
    }

    @Then("TCC.TMS.062 validasi data nama divisi berhasil disimpan")
    public void TCC_TMS_062_validasi_data_nama_divisi_berhasil_disimpan() {
        Assert.assertEquals(tambahdivisi.txtValidasiTombolSimpanMasterDivisi(), "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.062 validasi data nama divisi berhasil disimpan");
    }


    //input nama divisi dengan karakter alphanumeric
    @When("TCC.TMS.063 klik field nama divisi alphanumeric")
    public void TCC_TMS_063_klik_field_nama_divisi_alphanumeric() {
        tambahdivisi.fieldNamaDivisiAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.063 klik field nama divisi alphanumeric");
    }

    @And("TCC.TMS.063 input nama divisi alphanumeric")
    public void TCC_TMS_060_input_nama_divisi_alphanumeric() {
        tambahdivisi.inputNamaDivisiAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.063 input nama divisi alphanumeric");
    }

    @Then("TCC.TMS.063 validasi nama divisi alphanumeric sudah terinput")
    public void TCC_TMS_060_validasi_nama_divisi_alphanumeric_sudah_terinput() {
        Assert.assertEquals(tambahdivisi.txtValidasiInputNamaDivisiAlphanumeric(), "Master Divisi");
        extentTest.log(LogStatus.PASS, "TCC.TMS.063 validasi nama divisi alphanumeric sudah terinput");
    }

    //tombol simpan
    @When("TCC.TMS.064 klik tombol simpan nama divisi alphanumeric")
    public void TCC_TMS_064_klik_tombol_simpan_nama_divisi_alphanumeric() {
        tambahdivisi.btnSimpanMasterDivisiAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.064 klik tombol simpan nama divisi alphanumeric");
    }

    @Then("TCC.TMS.064 validasi data nama divisi alphanumeric berhasil disimpan")
    public void TCC_TMS_064_validasi_data_nama_divisi_alphanumeric_berhasil_disimpan() {
        Assert.assertEquals(tambahdivisi.txtValidasiTombolSimpanMasterDivisiAlphanumeric(), "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.064 validasi data nama divisi alphanumeric berhasil disimpan");
    }

    //Show 10 entries
    @When("TCC.TMS.065 klik dropdown pada halaman list divisi show 10 entries")
    public void TCC_TMS_065_klik_dropdown_pada_halaman_list_divisi_show_10_entries() {
        delay(Constants.DETIK);
        tambahdivisi.show10EntriesListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.065 klik dropdown pada halaman list divisi show 10 entries");
    }

    @And("TCC.TMS.065 pilih angka 10")
    public void TCC_TMS_065_pilih_angka_10() {
        tambahdivisi.pilihAngka10ListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.065 pilih angka 10");
    }

    @Then("TCC.TMS.065 validasi menampilkan halaman list divisi sebanyak 10 baris")
    public void TCC_TMS_065_validasi_menampilkan_halaman_list_divisi_sebanyak_10_baris() {
        Assert.assertEquals(tambahdivisi.txtValidasiShow10EntriesListDivisi(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.065 validasi menampilkan halaman list divisi sebanyak 10 baris");
    }

    //Show 25 entries
    @When("TCC.TMS.066 klik dropdown pada halaman list divisi show 25 entries")
    public void TCC_TMS_066_klik_dropdown_pada_halaman_list_divisi_show_25_entries() {
        delay(Constants.DETIK);
        tambahdivisi.show25EntriesListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.066 klik dropdown pada halaman list divisi show 25 entries");
    }
    @And("TCC.TMS.066 pilih angka 25")
    public void TCC_TMS_066_pilih_angka_25() {
        tambahdivisi.pilihAngka25ListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.066 pilih angka 25");
    }
    @Then("TCC.TMS.066 validasi menampilkan halaman list divisi sebanyak 25 baris")
    public void TCC_TMS_066_validasi_menampilkan_halaman_list_divisi_sebanyak_25_baris() {
        Assert.assertEquals(tambahdivisi.txtValidasiShow25EntriesListDivisi(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.066 validasi menampilkan halaman list divisi sebanyak 25 baris");
    }

    //Show 50 entries
    @When("TCC.TMS.067 klik dropdown pada halaman list divisi show 50 entries")
    public void TCC_TMS_067_klik_dropdown_pada_halaman_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.show50EntriesListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.067 klik dropdown pada halaman list divisi show 50 entries");
    }
    @And("TCC.TMS.067 pilih angka 50")
    public void TCC_TMS_067_pilih_angka_50() {
        tambahdivisi.pilihAngka50ListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.067 pilih angka 50");
    }
    @Then("TCC.TMS.067 validasi menampilkan halaman list divisi sebanyak 50 baris")
    public void TCC_TMS_067_validasi_menampilkan_halaman_list_divisi_sebanyak_50_baris() {
        Assert.assertEquals(tambahdivisi.txtValidasiShow50EntriesListDivisi(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.067 validasi menampilkan halaman list divisi sebanyak 50 baris");
    }

    //Show 100 entries
    @When("TCC.TMS.068 klik dropdown pada halaman list divisi show 100 entries")
    public void TCC_TMS_068_klik_dropdown_pada_halaman_list_divisi_show_100_entries() {
        delay(Constants.DETIK);
        tambahdivisi.show100EntriesListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.068 klik dropdown pada halaman list divisi show 100 entries");
    }
    @And("TCC.TMS.068 pilih angka 100")
    public void TCC_TMS_068_pilih_angka_100() {
        tambahdivisi.pilihAngka100ListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.068 pilih angka 100");
    }
    @Then("TCC.TMS.068 validasi menampilkan halaman list divisi sebanyak 100 baris")
    public void TCC_TMS_068_validasi_menampilkan_halaman_list_divisi_sebanyak_100_baris() {
        Assert.assertEquals(tambahdivisi.txtValidasiShow100EntriesListDivisi(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.068 validasi menampilkan halaman list divisi sebanyak 100 baris");
    }

    //Search List Divisi
    @When("TCC.TMS.069 klik search box pada halaman list divisi")
    public void TCC_TMS_069_klik_search_box_pada_halaman_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.searchListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.069 klik search box pada halaman list divisi");
    }
    @And("TCC.TMS.069 cari nama yang sudah diinput list divisi")
    public void TCC_TMS_069_cari_nama_yang_sudah_diinput_list_divisi() {
        tambahdivisi.cariNamaYangSudahDiinputlistDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.069 cari nama yang sudah diinput list divisi");
    }
    @Then("TCC.TMS.069 validasi menampilkan halaman nama yang telah diinput")
    public void TCC_TMS_069_validasi_menampilkan_halaman_nama_yang_telah_diinput() {
        Assert.assertEquals(tambahdivisi.txtValidasiSearchListDivisi(), "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.069 validasi menampilkan halaman nama yang telah diinput");
    }

    //No List Divisi
    @When("TCC.TMS.070 validasi menampilkan halaman no yang telah diinput")
    public void TCC_TMS_070_validasi_menampilkan_halaman_no_yang_telah_diinput() {
        Assert.assertEquals(tambahdivisi.txtValidasiNoListDivisi(), "No");
        extentTest.log(LogStatus.PASS, "TCC.TMS.070 validasi menampilkan halaman no yang telah diinput");
    }

    //Nama Divisi (List Divisi)
    @When("TCC.TMS.071 validasi menampilkan halaman nama divisi yang telah diinput")
    public void TCC_TMS_071_validasi_menampilkan_halaman_nama_divisi_yang_telah_diinput() {
        Assert.assertEquals(tambahdivisi.txtValidasiNamaDivisiListDivisi(), "Nama Divisi");
        extentTest.log(LogStatus.PASS, "TCC.TMS.071 validasi menampilkan halaman nama divisi yang telah diinput");
    }

    //Edit (List Divisi)
    @When("TCC.TMS.072 validasi menampilkan halaman edit nama divisi")
    public void TCC_TMS_072_validasi_menampilkan_halaman_edit_nama_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.iconEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.072 validasi menampilkan halaman edit nama divisi");
    }

    //Showing Page 2, 3, 4......dst (List Divisi)
    @When("TCC.TMS.073 klik page 2, 3, 4.....dst yang berada dibawah halaman list divisi")
    public void TCC_TMS_073_klik_page_2_3_4_______dst_yang_berada_dibawah_halaman_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.showingPage2_3_4____DstListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.073 klik page 2, 3, 4.....dsb yang berada dibawah halaman list divisi");
    }
    @Then("TCC.TMS.073 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi")
    public void TCC_TMS_073_validasi_menampilkan_page_2_3_4_______dst_yang_berada_dibawah_halaman_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShowingPage2_3_4____DstListDivisi(), "2");
        extentTest.log(LogStatus.PASS, "TCC.TMS.073 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman list divisi");
    }

    //Showing Next Page (List Divisi)
    @When("TCC.TMS.074 klik Next page yang berada dibawah halaman list divisi")
    public void TCC_TMS_074_klik_next_page_yang_berada_dibawah_halaman_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.showingNextPageListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.074 klik Next page yang berada dibawah halaman list divisi");
    }
    @Then("TCC.TMS.074 validasi menampilkan Next page yang berada dibawah halaman list divisi")
    public void TCC_TMS_074_validasi_menampilkan_next_page_yang_berada_dibawah_halaman_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShowingNextPageListDivisi(), "Next");
        extentTest.log(LogStatus.PASS, "TCC.TMS.074 validasi menampilkan Next page yang berada dibawah halaman list divisi");
    }

    //Showing Previous Page (List Divisi)
    @When("TCC.TMS.075 klik Previous page yang berada dibawah halaman list divisi")
    public void TCC_TMS_075_lik_previous_page_yang_berada_dibawah_halaman_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.showingPreviousPageListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.075 klik Previous page yang berada dibawah halaman list divisi");
    }
    @Then("TCC.TMS.075 validasi menampilkan Previous page yang berada dibawah halaman list divisi")
    public void TCC_TMS_075_validasi_menampilkan_previous_page_yang_berada_dibawah_halaman_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShowingPreviousPageListDivisi(), "Previous");
        extentTest.log(LogStatus.PASS, "TCC.TMS.075 validasi menampilkan Previous page yang berada dibawah halaman list divisi");
    }

    //Edit List Divisi
    //Input Nama Divisi (Edit List Divisi)
    @When("TCC.TMS.076 klik field nama divisi edit list divisi")
    public void TCC_TMS_076_klik_field_nama_divisi_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.fieldNamaDivisiEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.076 klik field nama divisi edit list divisi");
    }
    @And("TCC.TMS.076 input nama divisi edit list divisi")
    public void TCC_TMS_076_input_nama_divisi_edit_list_divisi() {
        tambahdivisi.inputNamaDivisiEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.076 input nama divisi edit list divisi");
    }
    @Then("TCC.TMS.076 validasi nama divisi sudah terinput edit list divisi")
    public void TCC_TMS_076_validasi_nama_divisi_sudah_terinput_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiInputNamaDivisiEditListDivisi(), "Master Divisi");
        extentTest.log(LogStatus.PASS, "TCC.TMS.076 validasi nama divisi sudah terinput edit list divisi");
    }

    //tombol update
    @When("TCC.TMS.077 klik tombol update nama divisi (edit list divisi)")
    public void TCC_TMS_077_klik_tombol_update_nama_divisi_edit_list_divisi() {
        tambahdivisi.btnUpdateMasterDivisiEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.077 klik tombol simpan nama divisi (edit list divisi)");
    }
    @Then("TCC.TMS.077 validasi update data nama divisi berhasil disimpan (edit list divisi)")
    public void TCC_TMS_077_validasi_update_data_nama_divisi_berhasil_disimpan_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiTombolUpdateMasterDivisiEditListDivisi(), "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.077 validasi update data nama divisi berhasil disimpan (edit list divisi)");
    }

    //Edit 2 (List Divisi)
    @When("TCC.TMS.078 validasi menampilkan halaman edit 2 nama divisi")
    public void TCC_TMS_078_validasi_menampilkan_halaman_edit_2_nama_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.iconEditListDivisi2();
        extentTest.log(LogStatus.PASS, "TCC.TMS.078 validasi menampilkan halaman edit 2 nama divisi");
    }

    //input nama divisi dengan karakter alphanumeric
    @When("TCC.TMS.079 klik field nama divisi alphanumeric edit list divisi")
    public void TCC_TMS_079_klik_field_nama_divisi_alphanumeric_edit_list_divisi() {
        tambahdivisi.fieldNamaDivisiAlphanumericEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.079 klik field nama divisi alphanumeric edit list divisi");
    }
    @And("TCC.TMS.079 input nama divisi alphanumeric edit list divisi")
    public void TCC_TMS_079_input_nama_divisi_alphanumeric_edit_list_divisi() {
        tambahdivisi.inputNamaDivisiAlphanumericEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.079 input nama divisi alphanumeric edit list divisi");
    }
    @Then("TCC.TMS.079 validasi nama divisi alphanumeric sudah terinput edit list divisi")
    public void TCC_TMS_079_validasi_nama_divisi_alphanumeric_sudah_terinput_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiInputNamaDivisiAlphanumericEditListDivisi(), "Master Divisi");
        extentTest.log(LogStatus.PASS, "TCC.TMS.079 validasi nama divisi alphanumeric sudah terinput edit list divisi");
    }

    //tombol cancel
    @When("TCC.TMS.080 klik tombol cancel nama divisi alphanumeric (edit list divisi)")
    public void TCC_TMS_080_klik_cancel_simpan_nama_divisi_alphanumeric_edit_list_divisi() {
        tambahdivisi.btnCancelMasterDivisiAlphanumericEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.080 klik tombol cancel nama divisi alphanumeric (edit list divisi)");
    }
    @Then("TCC.TMS.080 validasi cancel data nama divisi alphanumeric berhasil disimpan (edit list divisi)")
    public void TCC_TMS_080_validasi_cancel_data_nama_divisi_alphanumeric_berhasil_disimpan_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiTombolCancelMasterDivisiAlphanumericEditListDivisi(), "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.080 validasi cancel data nama divisi alphanumeric berhasil disimpan (edit list divisi)");
    }

    //Show 10 entries (Edit List Divisi)
    @When("TCC.TMS.081 klik dropdown pada halaman list divisi show 10 entries edit list divisi")
    public void TCC_TMS_081_klik_dropdown_pada_halaman_list_divisi_show_10_entries_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.show10EntriesEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.081 klik dropdown pada halaman list divisi show 10 entries edit list divisi");
    }

    @And("TCC.TMS.081 pilih angka 10 edit list divisi")
    public void TCC_TMS_081_pilih_angka_10_edit_list_divisi() {
        tambahdivisi.pilihAngka10EditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.081 pilih angka 10 edit list divisi");
    }

    @Then("TCC.TMS.081 validasi menampilkan halaman list divisi sebanyak 10 baris edit list divisi")
    public void TCC_TMS_081_validasi_menampilkan_halaman_list_divisi_sebanyak_10_baris_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShow10EntriesEditListDivisi(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.081 validasi menampilkan halaman list divisi sebanyak 10 baris edit list divisi");
    }

    //Show 25 entries (edit list divisi)
    @When("TCC.TMS.082 klik dropdown pada halaman list divisi show 25 entries edit list divisi")
    public void TCC_TMS_082_klik_dropdown_pada_halaman_list_divisi_show_25_entries_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.show25EntriesEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.082 klik dropdown pada halaman list divisi show 25 entries edit list divisi");
    }
    @And("TCC.TMS.082 pilih angka 25 edit list divisi")
    public void TCC_TMS_082_pilih_angka_25_edit_list_divisi() {
        tambahdivisi.pilihAngka25EditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.082 pilih angka 25 edit list divisi");
    }
    @Then("TCC.TMS.082 validasi menampilkan halaman list divisi sebanyak 25 baris edit list divisi")
    public void TCC_TMS_082_validasi_menampilkan_halaman_list_divisi_sebanyak_25_baris_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShow25EntriesEditListDivisi(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.082 validasi menampilkan halaman list divisi sebanyak 25 baris edit list divisi");
    }

    //Show 50 entries (edit list divisi)
    @When("TCC.TMS.083 klik dropdown pada halaman list divisi show 50 entries edit list divisi")
    public void TCC_TMS_083_klik_dropdown_pada_halaman_list_divisi_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.show50EntriesEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.083 klik dropdown pada halaman list divisi show 50 entries edit list divisi");
    }
    @And("TCC.TMS.083 pilih angka 50 edit list divisi")
    public void TCC_TMS_083_pilih_angka_50_edit_list_divisi() {
        tambahdivisi.pilihAngka50EditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.083 pilih angka 50 edit list divisi");
    }
    @Then("TCC.TMS.083 validasi menampilkan halaman list divisi sebanyak 50 baris edit list divisi")
    public void TCC_TMS_083_validasi_menampilkan_halaman_list_divisi_sebanyak_50_baris_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShow50EntriesEditListDivisi(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.083 validasi menampilkan halaman list divisi sebanyak 50 baris edit list divisi");
    }

    //Show 100 entries (edit list divisi)
    @When("TCC.TMS.084 klik dropdown pada halaman list divisi show 100 entries edit list divisi")
    public void TCC_TMS_084_klik_dropdown_pada_halaman_list_divisi_show_100_entries_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.show100EntriesEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.084 klik dropdown pada halaman list divisi show 100 entries edit list divisi");
    }
    @And("TCC.TMS.084 pilih angka 100 edit list divisi")
    public void TCC_TMS_084_pilih_angka_100_edit_list_divisi() {
        tambahdivisi.pilihAngka100EditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.084 pilih angka 100 edit list divisi");
    }
    @Then("TCC.TMS.084 validasi menampilkan halaman list divisi sebanyak 100 baris edit list divisi")
    public void TCC_TMS_084_validasi_menampilkan_halaman_list_divisi_sebanyak_100_baris_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShow100EntriesEditListDivisi(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.084 validasi menampilkan halaman list divisi sebanyak 100 baris edit list divisi");
    }

    //Search List Divisi (edit list divisi)
    @When("TCC.TMS.085 klik search box pada halaman edit list divisi")
    public void TCC_TMS_085_klik_search_box_pada_halaman_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.searchEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.085 klik search box pada halaman edit list divisi");
    }
    @And("TCC.TMS.085 cari nama yang sudah diinput edit list divisi")
    public void TCC_TMS_085_cari_nama_yang_sudah_diinput_edit_list_divisi() {
        tambahdivisi.cariNamaYangSudahDiinputEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.085 cari nama yang sudah diinput edit list divisi");
    }
    @Then("TCC.TMS.085 validasi menampilkan halaman nama yang telah diinput edit list divisi")
    public void TCC_TMS_085_validasi_menampilkan_halaman_nama_yang_telah_diinput_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiSearchEditListDivisi(), "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.085 validasi menampilkan halaman nama yang telah diinput edit list divisi");
    }

    //No List Divisi (edit list divisi)
    @When("TCC.TMS.086 validasi menampilkan halaman no yang telah diinput edit list divisi")
    public void TCC_TMS_086_validasi_menampilkan_halaman_no_yang_telah_diinput_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiNoEditListDivisi(), "No");
        extentTest.log(LogStatus.PASS, "TCC.TMS.086 validasi menampilkan halaman no yang telah diinput edit list divisi");
    }

    //Nama Divisi (edit List Divisi)
    @When("TCC.TMS.087 validasi menampilkan halaman nama divisi yang telah diinput edit list divisi")
    public void TCC_TMS_087_validasi_menampilkan_halaman_nama_divisi_yang_telah_diinput_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiNamaDivisiEditListDivisi(), "Nama Divisi");
        extentTest.log(LogStatus.PASS, "TCC.TMS.087 validasi menampilkan halaman nama divisi yang telah diinput edit list divisi");
    }

    //Edit (edit List Divisi)
    @When("TCC.TMS.088 validasi menampilkan halaman edit nama divisi edit list divisi")
    public void TCC_TMS_088_validasi_menampilkan_halaman_edit_nama_divisi_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.tombolEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.088 validasi menampilkan halaman edit nama divisi edit list divisi");
    }

    //Showing Page 2, 3, 4......dst (edit List Divisi)
    @When("TCC.TMS.089 klik page 2, 3, 4.....dst yang berada dibawah halaman edit list divisi")
    public void TCC_TMS_089_klik_page_2_3_4_______dst_yang_berada_dibawah_halaman_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.showingPage2_3_4____DstEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.089 klik page 2, 3, 4.....dsb yang berada dibawah halaman edit list divisi");
    }
    @Then("TCC.TMS.089 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman edit list divisi")
    public void TCC_TMS_089_validasi_menampilkan_page_2_3_4_______dst_yang_berada_dibawah_halaman_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShowingPage2_3_4____DstListDivisi(), "2");
        extentTest.log(LogStatus.PASS, "TCC.TMS.089 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman edit list divisi");
    }

    //Showing Next Page (Edit List Divisi)
    @When("TCC.TMS.090 klik Next page yang berada dibawah halaman edit list divisi")
    public void TCC_TMS_090_klik_next_page_yang_berada_dibawah_halaman_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.showingNextPageEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.090 klik Next page yang berada dibawah halaman edit list divisi");
    }
    @Then("TCC.TMS.090 validasi menampilkan Next page yang berada dibawah halaman edit list divisi")
    public void TCC_TMS_090_validasi_menampilkan_next_page_yang_berada_dibawah_halaman_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShowingNextPageEditListDivisi(), "Next");
        extentTest.log(LogStatus.PASS, "TCC.TMS.090 validasi menampilkan Next page yang berada dibawah halaman edit list divisi");
    }

    //Showing Previous Page (Edit List Divisi)
    @When("TCC.TMS.091 klik Previous page yang berada dibawah halaman edit list divisi")
    public void TCC_TMS_091_klik_previous_page_yang_berada_dibawah_halaman_edit_list_divisi() {
        delay(Constants.DETIK);
        tambahdivisi.showingPreviousPageEditListDivisi();
        extentTest.log(LogStatus.PASS, "TCC.TMS.091 klik Previous page yang berada dibawah halaman edit list divisi");
    }
    @Then("TCC.TMS.091 validasi menampilkan Previous page yang berada dibawah halaman edit list divisi")
    public void TCC_TMS_091_validasi_menampilkan_previous_page_yang_berada_dibawah_halaman_edit_list_divisi() {
        Assert.assertEquals(tambahdivisi.txtValidasiShowingPreviousPageEditListDivisi(), "Previous");
        extentTest.log(LogStatus.PASS, "TCC.TMS.091 validasi menampilkan Previous page yang berada dibawah halaman edit list divisi");
    }

}

