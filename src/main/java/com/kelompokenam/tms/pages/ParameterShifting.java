package com.kelompokenam.tms.pages;

import com.kelompokenam.tms.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParameterShifting {
    private WebDriver driver;


    public ParameterShifting() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    // Modul Parameter Shifitng
    // Menu Dashboard Master
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/a")
    WebElement menuMasterParameterShifting;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[4]/a")
    WebElement klikParameterShifting;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[1]")
    WebElement txtValidasiTampilHalamanParameterShifting;

    // Show 100 entries (parameter shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show100EntriesParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka100ParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow100EntriesParameterShifting;

    //Show 25 entries (parameter shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show25EntriesParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka25ParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow25EntriesParameterShifting;

    //Show 50 entries (parameter shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show50EntriesParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka50ParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow50EntriesParameterShifting;

    //Show 10 entries (parameter shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show10EntriesParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka10ParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow10EntriesParameterShifting;

    //Showing Page 2, 3, 4.....dst (parameter shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]/ul/li[3]")
    WebElement showingPage2_3_4____DstParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]/ul/li[3]")
    WebElement txtValidasiShowingPage2_3_4____DstParameterShifting;

    //Showing Next Page (parameter shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]")
    WebElement showingNextPageParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]/a")
    WebElement txtValidasiShowingNextPageParameterShifting;

    //Showing Previous Page (parameter shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]")
    WebElement showingPreviousPageParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]/a")
    WebElement txtValidasiShowingPreviousPageParameterShifting;

    //Search (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement searchParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement cariNamaYangSudahDiinputParameterShifting;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label")
    WebElement txtValidasiSearchParameterShifting;

    //Validasi Nomor (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[1]")
    WebElement txtValidasiNomorParameterShifting;

    //Validasi Unit (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[2]")
    WebElement txtValidasiUnitParameterShifting;

    //Validasi Nama Shift (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[3]")
    WebElement txtValidasiNamaShiftParameterShifting;

    //Validasi Jam Mulai (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[4]")
    WebElement txtValidasiJamMulaiParameterShifting;

    //Validasi Jam Selesai (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[5]")
    WebElement txtValidasiJamSelesaiParameterShifting;

    //Validasi Aksi (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[2]/td/ul/li/span[1]")
    WebElement txtValidasiAksiParameterShifting;

    //Tombol Edit (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[2]/td/ul/li/span[2]/a[1]")
    WebElement btnEditParameterShifting;

    //Tombol Hapus (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[2]/td/ul/li/span[2]/a[2]")
    WebElement btnHapusParameterShifting;

    //Tombol Tambah Add Form (Parameter Shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/h1/a")
    WebElement btnTambahAddFormParameterShifting;

    // Unit (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[1]/div[1]/div/button/div/div/div")
    WebElement klikDropdownListParameterShifting;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[1]/div[1]/div/div/div[1]/input")
    WebElement pilihNamaUnitParameterShifting;

    //Search Unit (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[1]/div[1]/div/button/div/div/div")
    WebElement klikDropdownParameterShifting;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[1]/div[1]/div/div/div[1]/input")
    WebElement klikSearchUnitParameterShifting;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[1]/div[1]/div/div/div[1]/input")
    WebElement inputNamaUnitParameterShifting;

    //nama shift (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"shift_name\"]")
    WebElement klikFieldNamaShiftParameterShifting;

    @FindBy(xpath = "//*[@id=\"shift_name\"]")
    WebElement inputNamaShiftParameterShifting;

    //nama shift karakter alphanumeric(add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"shift_name\"]")
    WebElement klikFieldNamaALphanumericShiftParameterShifting;

    @FindBy(xpath = "//*[@id=\"shift_name\"]")
    WebElement inputNamaShiftAlphanumericParameterShifting;

    //Jam Mulai (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"jam_mulai\"]")
    WebElement jamMulaiAddParameterShifting;

    @FindBy(xpath = "//*[@id=\"jam_mulai\"]")
    WebElement inputJamMulaiAddParameterShifting;

    //Jam Mulai alphanumeric (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"jam_mulai\"]")
    WebElement jamMulaiAlphanumericAddParameterShifting;

    @FindBy(xpath = "//*[@id=\"jam_mulai\"]")
    WebElement inputJamMulaiAlphanumericAddParameterShifting;

    //Jam Selesai (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"jam_selesai\"]")
    WebElement jamSelesaiAddParameterShifting;

    @FindBy(xpath = "//*[@id=\"jam_selesai\"]")
    WebElement inputJamSelesaiAddParameterShifting;

    //Jam Selesai alphanumeric (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"jam_selesai\"]")
    WebElement jamSelesaiAddParameterShiftingAlphanumeric;

    @FindBy(xpath = "//*[@id=\"jam_selesai\"]")
    WebElement inputJamSelesaiAddParameterShiftingAlphanumeric;

    //tombol submit (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[4]/button")
    WebElement tombolSubmitAddParameterShifting;

    //tombol edit (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[4]/button")
    WebElement tombolEditAddParameterShifting;

    //tombol back (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[4]/a")
    WebElement tombolBackParameterShifting;

    //tombol edit two (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[4]/button")
    WebElement tombolEditTwoAddParameterShifting;


    //unit (edit add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[1]/div[1]/div/button/div/div/div")
    WebElement klikIconEditParameterShifting;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[1]/div[1]/div/div/div[1]/input")
    WebElement namaUnitOtomatisParameterShifting;

    //nama shift (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"shift_name\"]")
    WebElement klikFieldEditNamaShiftParameterShifting;

    @FindBy(xpath = "//*[@id=\"shift_name\"]")
    WebElement inputEditNamaShiftParameterShifting;

    //nama shift karakter alphanumeric (edit add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"shift_name\"]")
    WebElement klikFieldEditNamaShiftAlphanumericParameterShifting;

    @FindBy(xpath = "//*[@id=\"shift_name\"]")
    WebElement inputEditNamaShiftALphanumericParameterShifting;

    //Jam Mulai (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"jam_mulai\"]")
    WebElement editJamMulaiAddParameterShifting;

    @FindBy(xpath = "//*[@id=\"jam_mulai\"]")
    WebElement inputEditJamMulaiAddParameterShifting;

    //Jam Mulai alphanumeric (edit add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"jam_mulai\"]")
    WebElement editJamMulaiAddParameterShiftingAlphanumeric;

    @FindBy(xpath = "//*[@id=\"jam_mulai\"]")
    WebElement inputEditJamMulaiAddParameterShiftingAlphanumeric;

    //Jam Selesai (add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"jam_selesai\"]")
    WebElement editJamSelesaiAddParameterShifting;

    @FindBy(xpath = "//*[@id=\"jam_selesai\"]")
    WebElement inputEditJamSelesaiAddParameterShifting;

    //Jam Selesai alphanumeric (edit add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"jam_selesai\"]")
    WebElement editJamSelesaiAddParameterShiftingAlphanumeric;

    @FindBy(xpath = "//*[@id=\"jam_selesai\"]")
    WebElement inputEditJamSelesaiAddParameterShiftingAlphanumeric;

    //tombol submit (edit add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[4]/button")
    WebElement tombolSubmitEditParameterShifting;

    //tombol edit (edit add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[2]/td/ul/li/span[2]/a[1]/span")
    WebElement tombolEditEditParameterShifting;

    //tombol back (edit add form parameter shifting)
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/form/div/div[4]/a")
    WebElement tombolBackEditParameterShifting;



    //Halaman Dashboard Parameter Shifting
    public void menuMasterParameterShifting() {
        menuMasterParameterShifting.click();
    }
    public void klikParameterShifting() {
        klikParameterShifting.sendKeys("Parameter Shifting");
        klikParameterShifting.click();
    }
    public String txtValidasiTampilHalamanParameterShifting() {
        return txtValidasiTampilHalamanParameterShifting.getText();
    }

    //Pilih Angka 100
    public void show100EntriesParameterShifting() {
        show100EntriesParameterShifting.click();
    }
    public void pilihAngka100ParameterShifting() {
        pilihAngka100ParameterShifting.sendKeys(Keys.ARROW_DOWN);
        pilihAngka100ParameterShifting.sendKeys("100");
    }
    public String txtValidasiShow100EntriesParameterShifting() {
        return txtValidasiShow100EntriesParameterShifting.getText();
    }

    //Pilih Angka 25
    public void show25EntriesParameterShifting() {
        show100EntriesParameterShifting.click();
    }
    public void pilihAngka25ParameterShifting() {
        pilihAngka25ParameterShifting.sendKeys(Keys.ARROW_DOWN);
        pilihAngka25ParameterShifting.sendKeys("25");
    }
    public String txtValidasiShow25EntriesParameterShifting() {
        return txtValidasiShow25EntriesParameterShifting.getText();
    }

    //Pilih Angka 50
    public void show50EntriesParameterShifting() {
        show50EntriesParameterShifting.click();
    }
    public void pilihAngka50ParameterShifting() {
        pilihAngka50ParameterShifting.sendKeys(Keys.ARROW_DOWN);
        pilihAngka50ParameterShifting.sendKeys("50");
    }
    public String txtValidasiShow50EntriesParameterShifting() {
        return txtValidasiShow50EntriesParameterShifting.getText();
    }

    //Pilih Angka 10
    public void show10EntriesParameterShifting() {
        show10EntriesParameterShifting.click();
    }
    public void pilihAngka10ParameterShifting() {
        pilihAngka10ParameterShifting.sendKeys(Keys.ARROW_DOWN);
        pilihAngka10ParameterShifting.sendKeys("10");
    }
    public String txtValidasiShow10EntriesParameterShifting() {
        return txtValidasiShow10EntriesParameterShifting.getText();
    }

    //showingPage2_3_4____Dst Parameter Shifting
    public void showingPage2_3_4____DstParameterShifting() {
        showingPage2_3_4____DstParameterShifting.click();
        showingPage2_3_4____DstParameterShifting.sendKeys("2");
    }
    public String txtValidasiShowingPage2_3_4____DstParameterShifting() {
        return txtValidasiShowingPage2_3_4____DstParameterShifting.getText();
    }

    //showing Next Page Parameter Shifting
    public void showingNextPageParameterShifting() {
        showingNextPageParameterShifting.click();
        showingNextPageParameterShifting.sendKeys("Next");
    }
    public String txtValidasiShowingNextPageParameterShifting() {
        return txtValidasiShowingNextPageParameterShifting.getText();
    }

    //showing Previous Page Parameter Shifting
    public void showingPreviousPageParameterShifting() {
        showingPreviousPageParameterShifting.click();
        showingPreviousPageParameterShifting.sendKeys("Previous");
    }

    public String txtValidasiShowingPreviousPageParameterShifting() {
        return txtValidasiShowingPreviousPageParameterShifting.getText();
    }

    //Search Parameter Shifting
    public void searchParameterShifting() {
        searchParameterShifting.click();
    }
    public void cariNamaYangSudahDiinputParameterShifting() {
        cariNamaYangSudahDiinputParameterShifting.sendKeys("BOOTCAMP");
        cariNamaYangSudahDiinputParameterShifting.click();
    }
    public String txtValidasiSearchParameterShifting() {
        return txtValidasiSearchParameterShifting.getText();
    }

    //validasi nomor
    public String txtValidasiNomorParameterShifting() {
        return txtValidasiNomorParameterShifting.getText();
    }

    //validasi Unit
    public String txtValidasiUnitParameterShifting() {
        return txtValidasiUnitParameterShifting.getText();
    }

    //validasi Nama Shift
    public String txtValidasiNamaShiftParameterShifting() {
        return txtValidasiNamaShiftParameterShifting.getText();
    }

    public String txtValidasiJamMulaiParameterShifting() {
        return txtValidasiJamMulaiParameterShifting.getText();
    }

    public String txtValidasiJamSelesaiParameterShifting() {
        return txtValidasiJamSelesaiParameterShifting.getText();
    }

    public String txtValidasiAksiParameterShifting() {
        return txtValidasiAksiParameterShifting.getText();
    }

    public void btnEditParameterShifting() {
        btnEditParameterShifting.click();
    }

    public void btnHapusParameterShifting() {
        btnHapusParameterShifting.click();
    }

    public void btnTambahAddFormParameterShifting() {
        btnTambahAddFormParameterShifting.click();
    }

    public void klikDropdownListParameterShifting() {
        klikDropdownListParameterShifting.click();
    }

    public void pilihNamaUnitParameterShifting() {
        pilihNamaUnitParameterShifting.sendKeys(Keys.ARROW_DOWN);
        pilihNamaUnitParameterShifting.sendKeys("BOOTCAMP");
        pilihNamaUnitParameterShifting.click();
        pilihNamaUnitParameterShifting.clear();
    }

    public void klikDropdownParameterShifting() {
        klikDropdownParameterShifting.click();
    }

    public void klikSearchUnitParameterShifting() {
        klikSearchUnitParameterShifting.click();
    }

    public void inputNamaUnitParameterShifting() {
        inputNamaUnitParameterShifting.sendKeys(Keys.ARROW_DOWN);
        inputNamaUnitParameterShifting.sendKeys("BOOTCAMP");
        inputNamaUnitParameterShifting.click();
    }

    public void klikFieldNamaShiftParameterShifting() {
        klikFieldNamaShiftParameterShifting.click();
    }

    public void inputNamaShiftParameterShifting() {
        inputNamaShiftParameterShifting.sendKeys("D66");
        inputNamaShiftParameterShifting.click();
        inputNamaShiftParameterShifting.clear();
    }

    public void klikFieldNamaShiftAlphanumericParameterShifting() {
        klikFieldEditNamaShiftAlphanumericParameterShifting.click();
    }

    public void inputNamaShiftAlphanumericParameterShifting() {
        inputNamaShiftAlphanumericParameterShifting.sendKeys("D66-_-");
    }

    public void jamMulaiAddParameterShifting() {
        jamMulaiAddParameterShifting.click();
    }

    public void inputJamMulaiAddParameterShifting() {
        inputJamMulaiAddParameterShifting.sendKeys("12:00");
    }

    public void jamMulaiAlphanumericAddParameterShifting() {
        jamMulaiAlphanumericAddParameterShifting.click();
    }

    public void inputJamMulaiAlphanumericAddParameterShifting() {
        inputJamMulaiAlphanumericAddParameterShifting.sendKeys("-_-23:00-_-");
    }

    public void jamSelesaiAddParameterShifting() {
        jamSelesaiAddParameterShifting.click();
    }

    public void inputJamSelesaiAddParameterShifting() {
        inputJamSelesaiAddParameterShifting.sendKeys("07:00");
    }

    public void jamSelesaiAddParameterShiftingAlphanumeric() {
        jamSelesaiAddParameterShiftingAlphanumeric.click();
    }

    public void inputJamSelesaiAddParameterShiftingAlphanumeric() {
        inputJamSelesaiAddParameterShiftingAlphanumeric.sendKeys("___08:00____");
    }

    public void tombolSubmitAddParameterShifting() {
        tombolSubmitAddParameterShifting.click();
    }

    public void tombolEditAddParameterShifting() {
        tombolEditAddParameterShifting.click();
    }

    public void tombolEditTwoAddParameterShifting() {
        tombolEditTwoAddParameterShifting.click();
    }

    public void klikIconEditParameterShifting() {
        klikIconEditParameterShifting.click();
    }

    public String namaUnitOtomatisParameterShifting() {
        return namaUnitOtomatisParameterShifting.getText();
    }

    public void klikFieldEditNamaShiftParameterShifting() {
        klikFieldEditNamaShiftParameterShifting.click();
    }

    public void inputEditNamaShiftParameterShifting() {
        inputEditNamaShiftParameterShifting.sendKeys("Bootcamp 6");
    }

    public void klikFieldEditNamaShiftAlphanumericParameterShifting() {
        klikFieldEditNamaShiftAlphanumericParameterShifting.click();
    }

    public void inputEditNamaShiftALphanumericParameterShifting() {
        inputEditNamaShiftALphanumericParameterShifting.sendKeys("L2");
    }

    public void editJamMulaiAddParameterShifting() {
        editJamMulaiAddParameterShifting.click();
    }

    public void inputEditJamMulaiAddParameterShifting() {
        inputEditJamMulaiAddParameterShifting.sendKeys("09:00");
    }

    public void editJamSelesaiAddParameterShiftingAlphanumeric() {
        editJamSelesaiAddParameterShiftingAlphanumeric.click();
    }

    public void inputEditJamMulaiAddParameterShiftingAlphanumeric() {
        inputEditJamMulaiAddParameterShiftingAlphanumeric.sendKeys("00:00 WIB");
    }

    public void editJamSelesaiAddParameterShifting() {
        editJamSelesaiAddParameterShifting.click();
    }

    public void inputEditJamSelesaiAddParameterShifting() {
        inputEditJamSelesaiAddParameterShifting.sendKeys("01:00");
    }

    public void inputEditJamSelesaiAddParameterShiftingAlphanumeric() {
        inputEditJamSelesaiAddParameterShiftingAlphanumeric.sendKeys("09:00 WIB");
    }

    public void tombolSubmitEditParameterShifting() {
        tombolSubmitEditParameterShifting.click();
    }

    public void tombolEditEditParameterShifting() {
        tombolEditEditParameterShifting.click();
    }

    public void tombolBackEditParameterShifting() {
        tombolBackEditParameterShifting.click();
    }
}
