package com.kelompokenam.tms.step_definitions;

import com.kelompokenam.tms.pages.ManagemenDivisi;
import com.kelompokenam.tms.pages.ParameterShifting;
import com.kelompokenam.tms.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.kelompokenam.tms.step_definitions.Hooks.delay;

public class TestParameterShifting {
    WebDriver driver;
    private static ExtentTest extentTest;

    private final ParameterShifting parametershifting = new ParameterShifting();

    public TestParameterShifting() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //Managemen Divisi
    //Menu Dashboard Master
    @When("TCC.TMS.000 klik dropdown menu master parameter shifting")
    public void TCC_TMS_000_klik_dropdown_menu_master_parameter_shifting() {
        parametershifting.menuMasterParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.000 klik dropdown menu master parameter shifting");
    }

    @And("TCC.TMS.000 klik menu parameter shifting")
    public void TCC_TMS_000_klik_menu_parameter_shifting() {
        parametershifting.klikParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.000 klik menu parameter shifting");
    }

    @Then("TCC.TMS.000 validasi tampil halaman parameter shifting")
    public void TCC_TMS_000_validasi_tampil_halaman_managemen_divisi() {
        Assert.assertEquals(parametershifting.txtValidasiTampilHalamanParameterShifting(), "Parameter Shifting");
        extentTest.log(LogStatus.PASS, "TCC.TMS.000 validasi tampil halaman parameter shifting");
    }

    //Show 100 entries
    @When("TCC.TMS.143 klik dropdown pada halaman parameter shifting show 100 entries")
    public void TCC_TMS_143_klik_dropdown_pada_halaman_parameter_shifting_show_100_entries() {
        delay(Constants.DETIK);
        parametershifting.show100EntriesParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.143 klik dropdown pada halaman parameter shifting show 100 entries");
    }

    @And("TCC.TMS.143 pilih angka 100")
    public void TCC_TMS_143_pilih_angka_100() {
        parametershifting.pilihAngka100ParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.143 pilih angka 100");
    }

    @Then("TCC.TMS.143 validasi menampilkan halaman parameter shifting sebanyak 100 baris")
    public void TCC_TMS_143_validasi_menampilkan_halaman_parameter_shifting_sebanyak_100_baris() {
        Assert.assertEquals(parametershifting.txtValidasiShow100EntriesParameterShifting(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.143 validasi menampilkan halaman parameter shifting sebanyak 100 baris");
    }

    //Show 25 entries
    @When("TCC.TMS.144 klik dropdown pada halaman parameter shifting show 25 entries")
    public void TCC_TMS_144_klik_dropdown_pada_halaman_parameter_shifting_show_25_entries() {
        delay(Constants.DETIK);
        parametershifting.show25EntriesParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.144 klik dropdown pada halaman parameter shifting show 25 entries");
    }
    @And("TCC.TMS.144 pilih angka 25")
    public void TCC_TMS_144_pilih_angka_25() {
        parametershifting.pilihAngka25ParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.144 pilih angka 25");
    }
    @Then("TCC.TMS.144 validasi menampilkan halaman parameter shifting sebanyak 25 baris")
    public void TCC_TMS_144_validasi_menampilkan_halaman_parameter_shifting_sebanyak_25_baris() {
        Assert.assertEquals(parametershifting.txtValidasiShow25EntriesParameterShifting(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.144 validasi menampilkan halaman parameter shifting sebanyak 25 baris");
    }

    //Show 50 entries
    @When("TCC.TMS.145 klik dropdown pada halaman parameter shifting show 50 entries")
    public void TCC_TMS_145_klik_dropdown_pada_halaman_parameter_shifting() {
        delay(Constants.DETIK);
        parametershifting.show50EntriesParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.145 klik dropdown pada halaman parameter shifting show 50 entries");
    }
    @And("TCC.TMS.145 pilih angka 50")
    public void TCC_TMS_145_pilih_angka_50() {
        parametershifting.pilihAngka50ParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.146 pilih angka 50");
    }
    @Then("TCC.TMS.145 validasi menampilkan halaman parameter shifting sebanyak 50 baris")
    public void TCC_TMS_145_validasi_menampilkan_halaman_parameter_shifting_sebanyak_50_baris() {
        Assert.assertEquals(parametershifting.txtValidasiShow50EntriesParameterShifting(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.145 validasi menampilkan halaman parameter shifting sebanyak 50 baris");
    }

    //Show 10 entries
    @When("TCC.TMS.146 klik dropdown pada halaman parameter shifting show 10 entries")
    public void TCC_TMS_146_klik_dropdown_pada_halaman_parameter_shifting_show_10_entries() {
        delay(Constants.DETIK);
        parametershifting.show10EntriesParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.146 klik dropdown pada halaman parameter shifting show 10 entries");
    }
    @And("TCC.TMS.146 pilih angka 10")
    public void TCC_TMS_146_pilih_angka_10() {
        parametershifting.pilihAngka10ParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.146 pilih angka 10");
    }
    @Then("TCC.TMS.146 validasi menampilkan halaman parameter shifting sebanyak 10 baris")
    public void TCC_TMS_146_validasi_menampilkan_halaman_parameter_shifting_sebanyak_10_baris() {
        Assert.assertEquals(parametershifting.txtValidasiShow10EntriesParameterShifting(), "10\n" +
                "25\n" +
                "50\n" +
                "100");
        extentTest.log(LogStatus.PASS, "TCC.TMS.146 validasi menampilkan halaman parameter shifting sebanyak 10 baris");
    }

    //Showing Page 2, 3, 4......dst (List Divisi)
    @When("TCC.TMS.147 klik page 2, 3, 4.....dst yang berada dibawah halaman parameter shifting")
    public void TCC_TMS_147_klik_page_2_3_4_______dst_yang_berada_dibawah_halaman_parameter_shifting() {
        delay(Constants.DETIK);
        parametershifting.showingPage2_3_4____DstParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.147 klik page 2, 3, 4.....dsb yang berada dibawah halaman parameter shifting");
    }
    @Then("TCC.TMS.147 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman parameter shifting")
    public void TCC_TMS_147_validasi_menampilkan_page_2_3_4_______dst_yang_berada_dibawah_halaman_parameter_shifting() {
        Assert.assertEquals(parametershifting.txtValidasiShowingPage2_3_4____DstParameterShifting(), "2");
        extentTest.log(LogStatus.PASS, "TCC.TMS.147 validasi menampilkan page 2, 3, 4.....dst yang berada di halaman parameter shifting");
    }

    //Showing Next Page (List Divisi)
    @When("TCC.TMS.148 klik Next page yang berada dibawah halaman parameter shifting")
    public void TCC_TMS_148_klik_next_page_yang_berada_dibawah_halaman_parameter_shifting() {
        delay(Constants.DETIK);
        parametershifting.showingNextPageParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.148 klik Next page yang berada dibawah halaman parameter shifting");
    }
    @Then("TCC.TMS.148 validasi menampilkan Next page yang berada dibawah halaman parameter shifting")
    public void TCC_TMS_148_validasi_menampilkan_next_page_yang_berada_dibawah_halaman_parameter_shifting() {
        Assert.assertEquals(parametershifting.txtValidasiShowingNextPageParameterShifting(), "Next");
        extentTest.log(LogStatus.PASS, "TCC.TMS.148 validasi menampilkan Next page yang berada dibawah halaman parameter shifting");
    }

    //Showing Previous Page (List Divisi)
    @When("TCC.TMS.149 klik Previous page yang berada dibawah halaman parameter shifting")
    public void TCC_TMS_149_lik_previous_page_yang_berada_dibawah_halaman_parameter_shifting() {
        delay(Constants.DETIK);
        parametershifting.showingPreviousPageParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.149 klik Previous page yang berada dibawah halaman parameter shifting");
    }
    @Then("TCC.TMS.149 validasi menampilkan Previous page yang berada dibawah halaman parameter shifting")
    public void TCC_TMS_149_validasi_menampilkan_previous_page_yang_berada_dibawah_halaman_parameter_shifting() {
        Assert.assertEquals(parametershifting.txtValidasiShowingPreviousPageParameterShifting(), "Previous");
        extentTest.log(LogStatus.PASS, "TCC.TMS.149 validasi menampilkan Previous page yang berada dibawah halaman parameter shifting");
    }

    //Search parameter shifting
    @When("TCC.TMS.150 klik search box pada halaman parameter shifting")
    public void TCC_TMS_150_klik_search_box_pada_halaman_parameter_shifting() {
        delay(Constants.DETIK);
        parametershifting.searchParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.150 klik search box pada halaman parameter shifting");
    }
    @And("TCC.TMS.150 cari nama yang sudah diinput parameter shifting")
    public void TCC_TMS_150_cari_nama_yang_sudah_diinput_parameter_shifting() {
        parametershifting.cariNamaYangSudahDiinputParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.150 cari nama yang sudah diinput parameter shifting");
    }
    @Then("TCC.TMS.150 validasi menampilkan halaman nama yang telah diinput parameter shifting")
    public void TCC_TMS_150_validasi_menampilkan_halaman_nama_yang_telah_diinput_parameter_shifting() {
        Assert.assertEquals(parametershifting.txtValidasiSearchParameterShifting(), "");
        extentTest.log(LogStatus.PASS, "TCC.TMS.150 validasi menampilkan halaman nama yang telah diinput parameter shifting");
    }

    //Nomor parameter shifting
    @When("TCC.TMS.151 validasi menampilkan halaman nomor yang telah diinput")
    public void TCC_TMS_151_validasi_menampilkan_halaman_nomor_yang_telah_diinput() {
        Assert.assertEquals(parametershifting.txtValidasiNomorParameterShifting(), "Nomor");
        extentTest.log(LogStatus.PASS, "TCC.TMS.151 validasi menampilkan halaman nomor yang telah diinput");
    }

    //unit parameter shifting
    @When("TCC.TMS.152 validasi menampilkan halaman unit yang telah diinput")
    public void TCC_TMS_152_validasi_menampilkan_halaman_unit_yang_telah_diinput() {
        Assert.assertEquals(parametershifting.txtValidasiUnitParameterShifting(), "Unit");
        extentTest.log(LogStatus.PASS, "TCC.TMS.152 validasi menampilkan halaman Unit yang telah diinput");
    }

    //nama shift parameter shifting
    @When("TCC.TMS.153 validasi menampilkan halaman nama shift yang telah diinput")
    public void TCC_TMS_153_validasi_menampilkan_halaman_nama_shift_yang_telah_diinput() {
        Assert.assertEquals(parametershifting.txtValidasiNamaShiftParameterShifting(), "Nama Shift");
        extentTest.log(LogStatus.PASS, "TCC.TMS.153 validasi menampilkan halaman nama shift yang telah diinput");
    }

    //Jam Mulai parameter shifting
    @When("TCC.TMS.154 validasi menampilkan halaman jam mulai yang telah diinput")
    public void TCC_TMS_154_validasi_menampilkan_halaman_jam_mulai_yang_telah_diinput() {
        Assert.assertEquals(parametershifting.txtValidasiJamMulaiParameterShifting(), "Jam Mulai");
        extentTest.log(LogStatus.PASS, "TCC.TMS.154 validasi menampilkan halaman jam mulai yang telah diinput");
    }

    //Jam Selesai parameter shifting
    @When("TCC.TMS.155 validasi menampilkan halaman jam selesai yang telah diinput")
    public void TCC_TMS_155_validasi_menampilkan_halaman_jam_selesai_yang_telah_diinput() {
        Assert.assertEquals(parametershifting.txtValidasiJamSelesaiParameterShifting(), "Jam Selesai");
        extentTest.log(LogStatus.PASS, "TCC.TMS.155 validasi menampilkan halaman jam selesai yang telah diinput");
    }

    //Aksi parameter shifting
    @When("TCC.TMS.156 validasi menampilkan halaman aksi yang telah diinput")
    public void TCC_TMS_156_validasi_menampilkan_halaman_aksi_yang_telah_diinput() {
        Assert.assertEquals(parametershifting.txtValidasiAksiParameterShifting(), "No");
        extentTest.log(LogStatus.PASS, "TCC.TMS.156 validasi menampilkan halaman aksi yang telah diinput");
    }

    //Tombol Edit parameter shifting
    @When("TCC.TMS.157 tombol edit parameter shifting")
    public void TCC_TMS_157_tombol_edit_parameter_shifting() {
        parametershifting.btnEditParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.157 tombol edit parameter shifting");
    }

    //Tombol Hapus parameter shifting
    @When("TCC.TMS.158 tombol hapus parameter shifting")
    public void TCC_TMS_158_tombol_hapus_parameter_shifting() {
        parametershifting.btnHapusParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.158 tombol hapus parameter shiftin");
    }

    //Tombol Tambah/Add Form parameter shifting
    @When("TCC.TMS.159 tombol add parameter shifting")
    public void TCC_TMS_159_tombol_add_parameter_shifting() {
        parametershifting.btnTambahAddFormParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.159 tombol add parameter shifting");
    }

    //Unit add form parameter shifting
    @When("TCC.TMS.160 klik dropdown list")
    public void TCC_TMS_160_klik_dropdown_list() {
        delay(Constants.DETIK);
        parametershifting.klikDropdownListParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.160 klik dropdown list");
    }
    @Then("TCC.TMS.160 pilih nama unit")
    public void TCC_TMS_160_pilih_nama_unit() {
        parametershifting.pilihNamaUnitParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.160 pilih nama unit");
    }

    //search unit add form parameter shifting
    @When("TCC.TMS.161 klik dropdown list")
    public void TCC_TMS_161_klik_dropdown_list() {
        delay(Constants.DETIK);
        parametershifting.klikDropdownParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.160 klik dropdown list");
    }
    @And("TCC.TMS.161 klik search box")
    public void TCC_TMS_161_klik_search_box() {
        parametershifting.klikSearchUnitParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.161 klik search box");
    }
    @Then("TCC.TMS.161 input nama unit")
    public void TCC_TMS_161_input_nama_unit() {
        parametershifting.inputNamaUnitParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.161 input nama unit");
    }

    //Nama Shift (add form parameter shifting)
    @When("TCC.TMS.162 klik field nama shift")
    public void TCC_TMS_162_klik_field_nama_shift() {
        delay(Constants.DETIK);
        parametershifting.klikFieldNamaShiftParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.162 klik dropdown list");
    }
    @Then("TCC.TMS.162 input nama shift yang akan digunakan")
    public void TCC_TMS_162_input_nama_shift_yang_akan_digunakan() {
        parametershifting.inputNamaShiftParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.162 input nama shift yang akan digunakan");
    }

    //Nama Shift alphanumeric (add form parameter shifting)
    @When("TCC.TMS.163 klik field nama shift karakter alphanumeric")
    public void TCC_TMS_163_klik_field_nama_shift_karakter_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.klikFieldNamaShiftAlphanumericParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.163 klik dropdown list");
    }
    @Then("TCC.TMS.163 input nama shift menggunakan karakter alphanumeric")
    public void TCC_TMS_163_input_nama_shift_menggunakan_karakter_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.inputNamaShiftAlphanumericParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.163 input nama shift menggunakan karakter alphanumeric");
    }

    //Jam Mulai (add form parameter shifting)
    @When("TCC.TMS.164 klik field jam mulai")
    public void TCC_TMS_164_klik_field_jam_mulai() {
        delay(Constants.DETIK);
        parametershifting.jamMulaiAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.164 klik field jam mulai");
    }
    @Then("TCC.TMS.164 input jam mulai")
    public void TCC_TMS_164_input_jam_mulai() {
        delay(Constants.DETIK);
        parametershifting.inputJamMulaiAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.164 input jam mulai");
    }

    //Jam Mulai alphanumeric (add form parameter shifting)
    @When("TCC.TMS.165 klik field jam mulai alphanumeric")
    public void TCC_TMS_165_klik_field_jam_mulai_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.jamMulaiAlphanumericAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.165 klik field jam mulai alphanumeric");
    }
    @Then("TCC.TMS.165 input jam mulai alphanumeric")
    public void TCC_TMS_165_input_jam_mulai() {
        delay(Constants.DETIK);
        parametershifting.inputJamMulaiAlphanumericAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.165 input jam mulai alphanumeric");
    }

    //Jam Selesai (add form parameter shifting)
    @When("TCC.TMS.166 klik field jam selesai")
    public void TCC_TMS_166_klik_field_jam_selesai() {
        delay(Constants.DETIK);
        parametershifting.jamSelesaiAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.166 TCC.TMS.166 klik field jam selesai");
    }
    @Then("TCC.TMS.166 input jam selesai")
    public void TCC_TMS_166_input_jam_selesai() {
        delay(Constants.DETIK);
        parametershifting.inputJamSelesaiAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.166 input jam selesai");
    }

    //Jam Selesai alphanumeric (add form parameter shifting)
    @When("TCC.TMS.167 klik field jam selesai alphanumeric")
    public void TCC_TMS_167_klik_field_jam_selesai_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.jamSelesaiAddParameterShiftingAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.167 TCC.TMS.166 klik field jam selesai alphanumeric");
    }
    @Then("TCC.TMS.167 input jam selesai alphanumeric")
    public void TCC_TMS_167_input_jam_pulang_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.inputJamSelesaiAddParameterShiftingAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.167 input jam selesai alphanumeric");
    }

    //Tombol Submit (add form parameter shifting)
    @When("TCC.TMS.168 klik tombol submit")
    public void TCC_TMS_168_klik_tombol_submit() {
        parametershifting.tombolSubmitAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.168 klik tombol submit");
    }

    //Tombol Edit (add form parameter shifting)
    @When("TCC.TMS.169 klik tombol edit")
    public void TCC_TMS_169_klik_tombol_edit() {
        parametershifting.tombolEditAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.169 klik tombol edit");
    }

    //Tombol Back (add form parameter shifting)
    @When("TCC.TMS.170 klik tombol back")
    public void TCC_TMS_170_klik_tombol_back() {
        parametershifting.tombolEditAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.170 klik tombol back");
    }

    //Tombol Edit two (add form parameter shifting)
    @When("TCC.TMS.171 klik tombol edit two")
    public void TCC_TMS_171_klik_tombol_edit_two() {
        parametershifting.tombolEditTwoAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.171 klik tombol edit two");
    }


    //icon edit unit form parameter shifting
    @When("TCC.TMS.172 klik icon edit")
    public void TCC_TMS_172_klik_icon_edit() {
        delay(Constants.DETIK);
        parametershifting.klikIconEditParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.172 klik icon edit");
    }
    @Then("TCC.TMS.172 nama unit otomatis terisi")
    public void TCC_TMS_172_nama_unit_otomatis_terisi() {
        parametershifting.namaUnitOtomatisParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.172 nama unit otomatis terisi");
    }

    //Nama Shift edit (add form parameter shifting)
    @When("TCC.TMS.173 klik field edit nama shift")
    public void TCC_TMS_173_klik_field_edit_nama_shift() {
        delay(Constants.DETIK);
        parametershifting.klikFieldEditNamaShiftParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.173 klik field edit nama shift");
    }
    @Then("TCC.TMS.173 input edit nama shift yang akan digunakan")
    public void TCC_TMS_173_input_edit_nama_shift_yang_akan_digunakan() {
        parametershifting.inputEditNamaShiftParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.173 input edit nama shift yang akan digunakan");
    }

    //Nama Shift alphanumeric (add form parameter shifting)
    @When("TCC.TMS.174 klik field edit nama shift karakter alphanumeric")
    public void TCC_TMS_174_klik_field_edit_nama_shift_karakter_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.klikFieldEditNamaShiftAlphanumericParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.174 klik field edit nama shift karakter alphanumeric");
    }
    @Then("TCC.TMS.174 input edit nama shift menggunakan karakter alphanumeric")
    public void TCC_TMS_174_input_edit_nama_shift_menggunakan_karakter_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.inputEditNamaShiftALphanumericParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.174 input edit nama shift menggunakan karakter alphanumeric");
    }

    //Jam Mulai (add form parameter shifting)
    @When("TCC.TMS.175 klik field edit jam mulai")
    public void TCC_TMS_175_klik_field_edit_jam_mulai() {
        delay(Constants.DETIK);
        parametershifting.editJamMulaiAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.175 klik field edit jam mulai");
    }
    @Then("TCC.TMS.175 input edit jam mulai")
    public void TCC_TMS_175_input_edit_jam_mulai() {
        delay(Constants.DETIK);
        parametershifting.inputEditJamMulaiAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.175 input edit jam mulai");
    }

    //Jam Mulai alphanumeric (add form parameter shifting)
    @When("TCC.TMS.176 klik field edit jam mulai alphanumeric")
    public void TCC_TMS_176_klik_field_edit_jam_mulai_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.editJamSelesaiAddParameterShiftingAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.176 klik field edit jam mulai alphanumeric");
    }
    @Then("TCC.TMS.176 input edit jam mulai alphanumeric")
    public void TCC_TMS_176_input_edit_jam_mulai() {
        delay(Constants.DETIK);
        parametershifting.inputEditJamMulaiAddParameterShiftingAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.176 input edit jam mulai alphanumeric");
    }

    //Jam Selesai (add form parameter shifting)
    @When("TCC.TMS.177 klik field edit jam selesai")
    public void TCC_TMS_177_klik_field_edit_jam_selesai() {
        delay(Constants.DETIK);
        parametershifting.editJamSelesaiAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.177 TCC.TMS.166 klik field edit jam selesai");
    }
    @Then("TCC.TMS.177 input edit jam selesai")
    public void TCC_TMS_177_input_edit_jam_selesai() {
        delay(Constants.DETIK);
        parametershifting.inputEditJamSelesaiAddParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.177 input edit jam selesai");
    }

    //Jam Selesai alphanumeric (add form parameter shifting)
    @When("TCC.TMS.178 klik field edit jam selesai alphanumeric")
    public void TCC_TMS_178_klik_field_edit_jam_selesai_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.editJamSelesaiAddParameterShiftingAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.167 TCC.TMS.178 klik field edit jam selesai alphanumeric");
    }
    @Then("TCC.TMS.178 input edit jam selesai alphanumeric")
    public void TCC_TMS_178_input_edit_jam_pulang_alphanumeric() {
        delay(Constants.DETIK);
        parametershifting.inputEditJamSelesaiAddParameterShiftingAlphanumeric();
        extentTest.log(LogStatus.PASS, "TCC.TMS.178 input edit jam selesai alphanumeric");
    }

    //Tombol Submit (add form parameter shifting)
    @When("TCC.TMS.179 klik tombol submit edit")
    public void TCC_TMS_179_klik_tombol_submit_edit() {
        parametershifting.tombolSubmitEditParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.179 klik tombol submit edit");
    }

    //Tombol Edit (add form parameter shifting)
    @When("TCC.TMS.180 klik tombol edit edit")
    public void TCC_TMS_180_klik_tombol_edit_edit() {
        parametershifting.tombolEditEditParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.180 klik tombol edit edit");
    }

    //Tombol Back two (add form parameter shifting)
    @When("TCC.TMS.181 klik tombol back two")
    public void TCC_TMS_181_klik_tombol_back_two() {
        parametershifting.tombolBackEditParameterShifting();
        extentTest.log(LogStatus.PASS, "TCC.TMS.181 klik tombol back two");
    }

}
