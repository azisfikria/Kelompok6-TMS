package com.kelompokenam.tms.pages;

import com.kelompokenam.tms.drivers.DriverSingleton;
import com.kelompokenam.tms.utils.Constants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class ManagemenDivisi {

    private WebDriver driver;


    public ManagemenDivisi() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }

    // Modul Managemen Divisi
    // Menu Dashboard Master
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/a")
    WebElement menuMasterManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[2]/a")
    WebElement klikManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[1]")
    WebElement txtValidasiTampilHalamanManagemenDivisi;

    //pilih nama divisi
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/div/button/div")
    WebElement klikDropdownNamaDivisiManagemenDivisi;

    @FindBy(xpath = "//body/div[@id='page-container']/div[@id='content']/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement pilihNamaDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/label")
    WebElement txtValidasiTampilNamaManagemenDivisi;

    //input NIK team leader/V1
    @FindBy(name = "V1_NIK")
    WebElement klikFieldNIKLeader;

    @FindBy(name = "V1_NIK")
    WebElement inputNIKLeader;

    //input Nama team leader/V1
    @FindBy(xpath = "//*[@id=\"V1_Name\"]")
    WebElement namaTeamLeader;

    //input nama supervisor/V2
    @FindBy(xpath = "//*[@id=\"V2_Name\"]")
    WebElement klikFieldNamaSupervisor;

    @FindBy(xpath = "//*[@id=\"V2_Name\"]")
    WebElement inputNamaSupervisor;

    //input nama backup staff
    @FindBy(xpath = "//*[@id=\"Backup_Staff\"]")
    WebElement klikFieldNamaBackupStaff;

    @FindBy(xpath = "//*[@id=\"Backup_Staff\"]")
    WebElement inputNamaBackupStaff;

    //tombol simpan
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement btnSimpanManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement txtValidasiTombolSimpanManagemenDivisi;

    //Menggunakan Karakter Alphanumeric
    //pilih nama divisi
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/div/button/div")
    WebElement klikDropdownNamaDivisiManagemenDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/div/div/div[1]/input")
    WebElement pilihNamaDivisiManagemenDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/label")
    WebElement txtValidasiTampilNamaManagemenDivisiAlphanumeric;

    //input NIK team leader/V1
    @FindBy(name = "V1_NIK")
    WebElement klikFieldNIKLeaderAlphanumeric;

    @FindBy(name = "V1_NIK")
    WebElement inputNIKLeaderAlphanumeric;

    //nama leader alphanumeric
    @FindBy(xpath = "//*[@id=\"V1_Name\"]")
    WebElement namaTeamLeaderAlphanumeric;

    //input nama supervisor/V2
    @FindBy(xpath = "//*[@id=\"V2_Name\"]")
    WebElement klikFieldNamaSupervisorAlphanumeric;

    @FindBy(xpath = "//*[@id=\"V2_Name\"]")
    WebElement inputNamaSupervisorAlphanumeric;

    //input nama backup staff
    @FindBy(xpath = "//*[@id=\"Backup_Staff\"]")
    WebElement klikFieldNamaBackupStaffAlphanumeric;

    @FindBy(xpath = "//*[@id=\"Backup_Staff\"]")
    WebElement inputNamaBackupStaffAlphanumeric;

    //tombol simpan
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement btnSimpanManagemenDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement txtValidasiTombolSimpanManagemenDivisiAlphanumeric;

    //Show Page Managemen Divisi
    //Show 10 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show10EntriesListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka10ListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow10EntriesListDivisiManagemenDivisi;

    //Show 25 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show25EntriesListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka25ListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow25EntriesListDivisiManagemenDivisi;

    //Show 50 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show50EntriesListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka50ListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow50EntriesListDivisiManagemenDivisi;

    //Show 100 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show100EntriesListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka100ListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow100EntriesListDivisiManagemenDivisi;

    //Search List Divisi
    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement searchListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement cariNamaYangSudahDiinputlistDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement txtValidasiSearchListDivisiManagemenDivisi;

    //Validasi No (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[1]")
    WebElement txtValidasiNoListDivisiManagemenDivisi;

    //Validasi Info (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[2]")
    WebElement txtValidasiInfoListDivisiManagemenDivisi;

    //Validasi Action (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[3]")
    WebElement txtValidasiActionListDivisiManagemenDivisi;

    //Icon Edit (List Divisi)
    @FindBy(xpath = "//tbody/tr[1]/td[3]/button[1]")
            //*[@id=\"data-table-default\"]/tbody/tr[1]/td[3]/button")
    WebElement iconEditListDivisiManagemenDivisi;

    //Delete Edit (List Divisi)
    @FindBy(xpath = "//tbody/tr[10]/td[3]/a[1]/i[1]")
            //"//*[@id=\"data-table-default\"]/tbody/tr[1]/td[3]/a")
    WebElement iconDeleteListDivisiManagemenDivisi;


    ///Paging///
    //Showing Page 2, 3, 4.....dst (List Divisi)
    //*[@id="data-table-default_paginate"]
    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]")
    WebElement showingPage2_3_4____DstListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]/ul/li[3]/a")
    WebElement txtValidasiShowingPage2_3_4____DstListDivisiManagemenDivisi;

    //Showing Next Page (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]/a")
    WebElement showingNextPageListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]/a")
    WebElement txtValidasiShowingNextPageListDivisiManagemenDivisi;

    //Showing Previous Page (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]/a")
    WebElement showingPreviousPageListDivisiManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]/a")
    WebElement txtValidasiShowingPreviousPageListDivisiManagemenDivisi;

    //Edit Halaman managemen Divisi//
    //pilih nama divisi
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/div/button/div")
    WebElement klikDropdownNamaDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/div/button/div/div/div")
    WebElement pilihNamaDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/label")
    WebElement txtValidasiTampilNamaEditManagemenDivisi;

    //input NIK team leader/V1
    @FindBy(xpath = "//*[@id=\"V1_NIK\"]")
    WebElement klikFieldNIKLeaderEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"V1_NIK\"]")
    WebElement inputNIKLeaderEditManagemenDivisi;

    //input Nama team leader/V1
    @FindBy(xpath = "//*[@id=\"V1_Name\"]")
    WebElement namaTeamLeaderEditManagemenDivisi;

    //input nama supervisor/V2
    @FindBy(xpath = "//*[@id=\"V2_Name\"]")
    WebElement klikFieldNamaSupervisorEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"V2_Name\"]")
    WebElement inputNamaSupervisorEditManagemenDivisi;

    //input nama backup staff
    @FindBy(xpath = "//*[@id=\"Backup_Staff\"]")
    WebElement klikFieldNamaBackupStaffEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"Backup_Staff\"]")
    WebElement inputNamaBackupStaffEditManagemenDivisi;

    //tombol simpan
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement btnSimpanEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement txtValidasiTombolSimpanEditManagemenDivisi;

    //Menggunakan Karakter Alphanumeric
    //pilih nama divisi
    //body/div[@id='page-container']/div[@id='content']/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]
    @FindBy(xpath = "//body/div[@id='page-container']/div[@id='content']/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]")
    WebElement klikDropdownNamaDivisiEditManagemenDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/div/div/div[1]/input")
    WebElement pilihNamaDivisiEditManagemenDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/div[1]/label")
    WebElement txtValidasiTampilNamaEditManagemenDivisiAlphanumeric;

    //input NIK team leader/V1
    @FindBy(name = "V1_NIK")
    WebElement klikFieldNIKLeaderAlphanumericEditManagemenDivisi;

    @FindBy(xpath = "<a role=\"option\" class=\"dropdown-item selected active\" aria-disabled=\"false\" tabindex=\"0\" aria-selected=\"true\">...</a>")
    WebElement inputNIKLeaderAlphanumericEditManagemenDivisi;

    //nama leader alphanumeric
    @FindBy(xpath = "//*[@id=\"V1_Name\"]")
    WebElement namaTeamLeaderAlphanumericEditManagemenDivisi;

    //input nama supervisor/V2
    @FindBy(xpath = "//*[@id=\"V2_Name\"]")
    WebElement klikFieldNamaSupervisorAlphanumericEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"V2_Name\"]")
    WebElement inputNamaSupervisorAlphanumericEditManagemenDivisi;

    //input nama backup staff
    @FindBy(xpath = "//*[@id=\"Backup_Staff\"]")
    WebElement klikFieldNamaBackupStaffAlphanumericEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"Backup_Staff\"]")
    WebElement inputNamaBackupStaffAlphanumericEditManagemenDivisi;

    //tombol simpan
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement btnSimpanEditManagemenDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement txtValidasiTombolSimpanEditManagemenDivisiAlphanumeric;

    //Show Page edit Managemen Divisi
    //Show 10 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show10EntriesListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka10ListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow10EntriesListDivisiEditManagemenDivisi;

    //Show 25 entries (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show25EntriesListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka25ListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow25EntriesListDivisiEditManagemenDivisi;

    //Show 50 entries (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show50EntriesListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka50ListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow50EntriesListDivisiEditManagemenDivisi;

    //Show 100 entries (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show100EntriesListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka100ListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow100EntriesListDivisiEditManagemenDivisi;

    //Search (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement searchListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement cariNamaYangSudahDiinputlistDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement txtValidasiSearchListDivisiEditManagemenDivisi;

    //Validasi No (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[1]")
    WebElement txtValidasiNoListDivisiEditManagemenDivisi;

    //Validasi Info (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[2]")
    WebElement txtValidasiInfoListDivisiEditManagemenDivisi;

    //Validasi Action (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[3]")
    WebElement txtValidasiActionListDivisiEditManagemenDivisi;

    //Icon Edit (Edit List Divisi)
    @FindBy(xpath = "//tbody/tr[1]/td[3]/button[1]")
    WebElement iconEditListDivisiEditManagemenDivisi;

    //Icon Delete (Edit List Divisi)
    @FindBy(xpath = "//tbody/tr[10]/td[3]/a[1]/i[1]")
    WebElement iconDeleteListDivisiEditManagemenDivisi;

    ///Paging///
    //Showing Page 2, 3, 4.....dst (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]")
    WebElement showingPage2_3_4____DstListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]/ul/li[3]/a")
    WebElement txtValidasiShowingPage2_3_4____DstListDivisiEditManagemenDivisi;

    //Showing Next Page (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]")
    WebElement showingNextPageListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]")
    WebElement txtValidasiShowingNextPageListDivisiEditManagemenDivisi;

    //Showing Previous Page (Edit List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]")
    WebElement showingPreviousPageListDivisiEditManagemenDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]")
    WebElement txtValidasiShowingPreviousPageListDivisiEditManagemenDivisi;


    // Menu Dashboard Master
    public void menuMasterManagemenDivisi() {
        this.menuMasterManagemenDivisi.click();
    }
    public void klikManagemenDivisi() {
        klikManagemenDivisi.click();
    }
    public String txtValidasiTampilHalamanManagemenDivisi() {
        txtValidasiTampilHalamanManagemenDivisi.getAttribute("Managemen Divisi");
        return txtValidasiTampilHalamanManagemenDivisi.getText();
    }

    //input Nama Divisi
    public void klikDropdownNamaDivisiManagemenDivisi() {
        klikDropdownNamaDivisiManagemenDivisi.getText();
    }
    public void pilihNamaDivisiManagemenDivisi() {

        pilihNamaDivisiManagemenDivisi.sendKeys("KELOMPOK 6");
        pilihNamaDivisiManagemenDivisi.click();
    }
    public String txtValidasiTampilNamaManagemenDivisi() {
        return txtValidasiTampilNamaManagemenDivisi.getText();
    }

    //input NIK team leader/V1
    public void klikFieldNIKLeader() {
        klikFieldNIKLeader.click();
    }
    public String inputNIKLeader() {
        inputNIKLeader.sendKeys("D6200792");
       return inputNIKLeader.getText();
    }

    //nama team leader/V1
    public void namaTeamLeader() {
        namaTeamLeader.getText();
    }

    //Input Nama Supervisor
    public void klikFieldNamaSupervisor() {
        klikFieldNamaSupervisor.click();
    }
    public String inputNamaSupervisor() {
        inputNamaSupervisor.sendKeys("Abdul Azis");
        return inputNamaSupervisor.getText();
    }

    //Input Nama Staff Backup
    public void klikFieldNamaBackupStaff() {
        klikFieldNamaBackupStaff.click();
    }
    public String inputNamaBackupStaff() {
        inputNamaBackupStaff.sendKeys("Dwi Febrian, Rizki Maulana, Rio");
        return inputNamaBackupStaff.getText();
    }

    //tombol simpan
    public void btnSimpanManagemenDivisi() {
        btnSimpanManagemenDivisi.click();
    }
    public String txtValidasiTombolSimpanManagemenDivisi() {
        driver.switchTo().alert().accept();
        return txtValidasiTombolSimpanManagemenDivisi.getText();

    }

    //Input nama divisi alphanumeric
    public void klikDropdownNamaDivisiManagemenDivisiAlphanumeric() {
        klikDropdownNamaDivisiManagemenDivisiAlphanumeric.clear();
        klikDropdownNamaDivisiManagemenDivisiAlphanumeric.click();
    }
    public void pilihNamaDivisiManagemenDivisiAlphanumeric() {
        pilihNamaDivisiManagemenDivisiAlphanumeric.click();
        pilihNamaDivisiManagemenDivisiAlphanumeric.sendKeys("Kelompok 6 _++_:");
        pilihNamaDivisiManagemenDivisiAlphanumeric.click();
    }
    public String txtValidasiTampilNamaManagemenDivisiAlphanumeric() {
        txtValidasiTampilNamaManagemenDivisiAlphanumeric.getAttribute("Nama Divisi *:");
        return txtValidasiTampilNamaManagemenDivisiAlphanumeric.getText();
    }

    //input NIK team leader/V1 alphanumeric
    public void klikFieldNIKLeaderAlphanumeric() {
        klikFieldNIKLeaderAlphanumeric.click();
    }
    public String inputNIKLeaderAlphanumeric() {
        inputNIKLeaderAlphanumeric.sendKeys("D6200792");
        return inputNIKLeaderAlphanumeric.getText();
    }

    //nama team leader alphanumeric
    public void namaTeamLeaderAlphanumeric() {
        namaTeamLeaderAlphanumeric.getText();
    }

    //input nama supervisor alphanumeric
    public void klikFieldNamaSupervisorAlphanumeric() {
        klikFieldNamaSupervisorAlphanumeric.click();
    }
    public String inputNamaSupervisorAlphanumeric() {
        inputNamaSupervisorAlphanumeric.sendKeys("Azis_+_");
        return inputNamaSupervisorAlphanumeric.getText();
    }

    //input nama backup staff alphanumeric
    public void klikFieldNamaBackupStaffAlphanumeric() {
        klikFieldNamaBackupStaffAlphanumeric.click();
    }
    public String inputNamaBackupStaffAlphanumeric() {
        inputNamaBackupStaffAlphanumeric.sendKeys("Dwi-+, Rizki+_, Rio++");
        return inputNamaBackupStaffAlphanumeric.getText();
    }

    //tombol simpan alphanumeric
    public void btnSimpanManagemenDivisiAlphanumeric() {
        btnSimpanManagemenDivisiAlphanumeric.click();
    }
    public String txtValidasiTombolSimpanManagemenDivisiAlphanumeric() {
        driver.switchTo().alert().accept();
        return txtValidasiTombolSimpanManagemenDivisiAlphanumeric.getText();
    }

    //Show 10 entries
    public void show10EntriesListDivisiManagemenDivisi() {
        show10EntriesListDivisiManagemenDivisi.click();
    }
    public void pilihAngka10ListDivisiManagemenDivisi() {
        pilihAngka10ListDivisiManagemenDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka10ListDivisiManagemenDivisi.sendKeys("10");
        pilihAngka10ListDivisiManagemenDivisi.click();
    }
    public String txtValidasiShow10EntriesListDivisiManagemenDivisi() {
        return txtValidasiShow10EntriesListDivisiManagemenDivisi.getText();
    }

    //Show 25 entries
    public void show25EntriesListDivisiManagemenDivisi() {
        show25EntriesListDivisiManagemenDivisi.click();
    }
    public void pilihAngka25ListDivisiManagemenDivisi() {
        pilihAngka25ListDivisiManagemenDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka25ListDivisiManagemenDivisi.sendKeys("25");
        pilihAngka25ListDivisiManagemenDivisi.click();
    }
    public String txtValidasiShow25EntriesListDivisiManagemenDivisi() {
        return txtValidasiShow25EntriesListDivisiManagemenDivisi.getText();
    }

    //Show 50 entries
    public void show50EntriesListDivisiManagemenDivisi() {
        show50EntriesListDivisiManagemenDivisi.click();
    }
    public void pilihAngka50ListDivisiManagemenDivisi() {
        pilihAngka50ListDivisiManagemenDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka50ListDivisiManagemenDivisi.sendKeys("50");
        pilihAngka50ListDivisiManagemenDivisi.click();
    }
    public String txtValidasiShow50EntriesListDivisiManagemenDivisi() {
        return txtValidasiShow50EntriesListDivisiManagemenDivisi.getText();
    }

    //Show 100 entries
    public void show100EntriesListDivisiManagemenDivisi() {
        show100EntriesListDivisiManagemenDivisi.click();
    }
    public void pilihAngka100ListDivisiManagemenDivisi() {
        pilihAngka100ListDivisiManagemenDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka100ListDivisiManagemenDivisi.sendKeys("100");
        pilihAngka100ListDivisiManagemenDivisi.click();
    }
    public String txtValidasiShow100EntriesListDivisiManagemenDivisi() {
        return txtValidasiShow100EntriesListDivisiManagemenDivisi.getText();
    }

    //Search List Divisi
    public void searchListDivisiManagemenDivisi() {
        searchListDivisiManagemenDivisi.click();
    }
    public void cariNamaYangSudahDiinputlistDivisiManagemenDivisi() {
        cariNamaYangSudahDiinputlistDivisiManagemenDivisi.sendKeys("Kelompok 6");
        cariNamaYangSudahDiinputlistDivisiManagemenDivisi.sendKeys(Keys.ENTER);
    }
    public String txtValidasiSearchListDivisiManagemenDivisi() {
        return txtValidasiSearchListDivisiManagemenDivisi.getText();
    }

    //No List Managemen Divisi
    public String txtValidasiNoListDivisiManagemenDivisi() {
        return txtValidasiNoListDivisiManagemenDivisi.getText();
    }

    //Info (List Managemen Divisi)
    public String txtValidasiInfoListDivisiManagemenDivisi() {
        return txtValidasiInfoListDivisiManagemenDivisi.getText();
    }

    //Action (List Managemen Divisi)
    public String txtValidasiActionListDivisiManagemenDivisi() {
        return txtValidasiActionListDivisiManagemenDivisi.getText();
    }

    //Edit (List Managemen Divisi)
    public void iconEditListDivisiManagemenDivisi() {
        iconEditListDivisiManagemenDivisi.click();
    }

    //Delete (List Managemen Divisi)
    public void iconDeleteListDivisiManagemenDivisi() {
        iconDeleteListDivisiManagemenDivisi.click();
    }

    //Showing Page 2, 3, 4......dst (List Managemen Divisi)
    public void showingPage2_3_4____DstListDivisiManagemenDivisi() {
        showingPage2_3_4____DstListDivisiManagemenDivisi.sendKeys("2");
        showingPage2_3_4____DstListDivisiManagemenDivisi.click();
        
    }
    public String txtValidasiShowingPage2_3_4____DstListDivisiManagemenDivisi() {
        return txtValidasiShowingPage2_3_4____DstListDivisiManagemenDivisi.getText();
    }

    //Showing Next Page (List Managemen Divisi)
    public void showingNextPageListDivisiManagemenDivisi() {
        showingNextPageListDivisiManagemenDivisi.sendKeys("Next");
        showingNextPageListDivisiManagemenDivisi.click();
    }
    public String txtValidasiShowingNextPageListDivisiManagemenDivisi() {
        return txtValidasiShowingNextPageListDivisiManagemenDivisi.getText();
    }

    //Showing Previous Page (List Managemen Divisi)
    public void showingPreviousPageListDivisiManagemenDivisi() {
        showingPreviousPageListDivisiManagemenDivisi.sendKeys("Previous");
        showingPreviousPageListDivisiManagemenDivisi.click();
    }
    public String txtValidasiShowingPreviousPageListDivisiManagemenDivisi() {
        return txtValidasiShowingPreviousPageListDivisiManagemenDivisi.getText();
    }

    ////// Edit Halaman Managemen Divisi //////
    //input nama divisi
    public void klikDropdownNamaDivisiEditManagemenDivisi() {
        klikDropdownNamaDivisiEditManagemenDivisi.click();
    }
    public void pilihNamaDivisiEditManagemenDivisi() {
        pilihNamaDivisiEditManagemenDivisi.sendKeys("Kelompok 6");
        pilihNamaDivisiEditManagemenDivisi.sendKeys(Keys.ENTER);
    }
    public String txtValidasiTampilNamaEditManagemenDivisi() {
        return txtValidasiTampilNamaEditManagemenDivisi.getText();
    }

    //input NIK team leader/V1
    public void klikFieldNIKLeaderEditManagemenDivisi() {
        klikFieldNIKLeaderEditManagemenDivisi.click();
    }
    public String inputNIKLeaderEditManagemenDivisi() {
        inputNIKLeaderEditManagemenDivisi.sendKeys("D6200792");
        return inputNIKLeaderEditManagemenDivisi.getText();
    }

    public void namaTeamLeaderEditManagemenDivisi() {
        namaTeamLeaderEditManagemenDivisi.getText();
    }

    //input nama supervisor
    public void klikFieldNamaSupervisorEditManagemenDivisi() {
        klikFieldNamaSupervisorEditManagemenDivisi.click();
    }
    public String inputNamaSupervisorEditManagemenDivisi() {
        inputNamaSupervisorEditManagemenDivisi.sendKeys("Abdul Azis");
        return inputNamaSupervisorEditManagemenDivisi.getText();
    }

    //input nama backup staff
    public void klikFieldNamaBackupStaffEditManagemenDivisi() {
        klikFieldNamaBackupStaffEditManagemenDivisi.click();
    }
    public String inputNamaBackupStaffEditManagemenDivisi() {
        inputNamaBackupStaffEditManagemenDivisi.sendKeys("Dwi, Rizki, Rio");
        return inputNamaBackupStaffEditManagemenDivisi.getText();
    }

    //tombol simpan
    public void btnSimpanEditManagemenDivisi() {
        btnSimpanEditManagemenDivisi.click();
    }
    public String txtValidasiTombolSimpanEditManagemenDivisi() {
        driver.navigate().refresh();
        return txtValidasiTombolSimpanEditManagemenDivisi.getText();

    }

    //input nama divisi alphanumeric
    public void klikDropdownNamaDivisiEditManagemenDivisiAlphanumeric() {
        klikDropdownNamaDivisiEditManagemenDivisiAlphanumeric.click();
        klikDropdownNamaDivisiEditManagemenDivisiAlphanumeric.sendKeys(Keys.ARROW_DOWN);
    }
    public void pilihNamaDivisiEditManagemenDivisiAlphanumeric() {
        pilihNamaDivisiEditManagemenDivisiAlphanumeric.sendKeys("Kelompok ---6--");
        pilihNamaDivisiEditManagemenDivisiAlphanumeric.click();
    }
    public String txtValidasiTampilNamaEditManagemenDivisiAlphanumeric() {
        return txtValidasiTampilNamaEditManagemenDivisiAlphanumeric.getText();
    }

    //input NIK team leader/V1 alphanumeric
    public void klikFieldNIKLeaderAlphanumericEditManagemenDivisi() {
        klikFieldNIKLeaderAlphanumericEditManagemenDivisi.click();
    }
    public String inputNIKLeaderAlphanumericEditManagemenDivisi() {
        inputNIKLeaderAlphanumericEditManagemenDivisi.sendKeys("D62007921234+++----");
        return inputNIKLeaderAlphanumericEditManagemenDivisi.getText();

    }

    //nama team leader/V1 otomatis alphanumeric
    public void namaTeamLeaderAlphanumericEditManagemenDivisi() {
        namaTeamLeaderAlphanumericEditManagemenDivisi.getText();
    }

    //input nama supervisor alphanumeric
    public void klikFieldNamaSupervisorAlphanumericEditManagemenDivisi() {
        klikFieldNamaSupervisorAlphanumericEditManagemenDivisi.click();
    }
    public String inputNamaSupervisorAlphanumericEditManagemenDivisi() {
        inputNamaSupervisorAlphanumericEditManagemenDivisi.sendKeys("AZIS :{:}{=");
        return inputNamaSupervisorAlphanumericEditManagemenDivisi.getText();
    }

    //input nama backup staff alphanumeric
    public void klikFieldNamaBackupStaffAlphanumericEditManagemenDivisi() {
        klikFieldNamaBackupStaffAlphanumericEditManagemenDivisi.click();
    }
    public String inputNamaBackupStaffAlphanumericEditManagemenDivisi() {
        inputNamaBackupStaffAlphanumericEditManagemenDivisi.sendKeys("Dwi 11--, Rizki12---, Rio13----");
        return inputNamaBackupStaffAlphanumericEditManagemenDivisi.getText();
    }

    //tombol simpan alphanumeric
    public void btnSimpanEditManagemenDivisiAlphanumeric() {
        btnSimpanEditManagemenDivisiAlphanumeric.click();
    }
    public String txtValidasiTombolSimpanEditManagemenDivisiAlphanumeric() {
        return txtValidasiTombolSimpanEditManagemenDivisiAlphanumeric.getText();
    }

    //Show 10 entries
    public void show10EntriesListDivisiEditManagemenDivisi() {
        show10EntriesListDivisiEditManagemenDivisi.click();
    }
    public void pilihAngka10ListDivisiEditManagemenDivisi() {
        pilihAngka10ListDivisiEditManagemenDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka10ListDivisiEditManagemenDivisi.sendKeys("10");
        pilihAngka10ListDivisiEditManagemenDivisi.click();
    }
    public String txtValidasiShow10EntriesListDivisiEditManagemenDivisi() {
        return txtValidasiShow10EntriesListDivisiEditManagemenDivisi.getText();
    }

    //Show 25 entries
    public void show25EntriesListDivisiEditManagemenDivisi() {
        show25EntriesListDivisiEditManagemenDivisi.click();
    }
    public void pilihAngka25ListDivisiEditManagemenDivisi() {
        pilihAngka25ListDivisiEditManagemenDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka25ListDivisiEditManagemenDivisi.sendKeys("25");
        pilihAngka25ListDivisiEditManagemenDivisi.click();
    }
    public String txtValidasiShow25EntriesListDivisiEditManagemenDivisi() {
        return txtValidasiShow25EntriesListDivisiEditManagemenDivisi.getText();
    }

    //Show 50 entries
    public void show50EntriesListDivisiEditManagemenDivisi() {
        show50EntriesListDivisiEditManagemenDivisi.click();
    }
    public void pilihAngka50ListDivisiEditManagemenDivisi() {
        pilihAngka50ListDivisiEditManagemenDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka50ListDivisiEditManagemenDivisi.sendKeys("50");
        pilihAngka50ListDivisiEditManagemenDivisi.click();
    }
    public String txtValidasiShow50EntriesListDivisiEditManagemenDivisi() {
        return txtValidasiShow50EntriesListDivisiEditManagemenDivisi.getText();
    }

    //Show 100 entries
    public void show100EntriesListDivisiEditManagemenDivisi() {
        show100EntriesListDivisiEditManagemenDivisi.click();
    }
    public void pilihAngka100ListDivisiEditManagemenDivisi() {
        pilihAngka100ListDivisiEditManagemenDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka100ListDivisiEditManagemenDivisi.sendKeys("100");
        pilihAngka100ListDivisiEditManagemenDivisi.click();
    }
    public String txtValidasiShow100EntriesListDivisiEditManagemenDivisi() {
        return txtValidasiShow100EntriesListDivisiEditManagemenDivisi.getText();
    }

    //Search List Divisi
    public void searchListDivisiEditManagemenDivisi() {
        searchListDivisiEditManagemenDivisi.click();
    }
    public void cariNamaYangSudahDiinputlistDivisiEditManagemenDivisi() {
        cariNamaYangSudahDiinputlistDivisiEditManagemenDivisi.sendKeys("Kelompok 6");
        cariNamaYangSudahDiinputlistDivisiEditManagemenDivisi.sendKeys(Keys.ENTER);
    }
    public String txtValidasiSearchListDivisiEditManagemenDivisi() {
        return txtValidasiSearchListDivisiEditManagemenDivisi.getText();
    }

    //No List Managemen Divisi
    public String txtValidasiNoListDivisiEditManagemenDivisi() {
        return txtValidasiNoListDivisiEditManagemenDivisi.getText();
    }

    //Info (List Managemen Divisi)
    public String txtValidasiInfoListDivisiEditManagemenDivisi() {
        return txtValidasiInfoListDivisiEditManagemenDivisi.getText();
    }

    //Action (List Managemen Divisi)
    public String txtValidasiActionListDivisiEditManagemenDivisi() {
        return txtValidasiActionListDivisiEditManagemenDivisi.getText();
    }

    //Edit (List Managemen Divisi)
    public void iconEditListDivisiEditManagemenDivisi() {
        iconEditListDivisiEditManagemenDivisi.getText();
    }

    //Delete (List Managemen Divisi)
    public void iconDeleteListDivisiEditManagemenDivisi() {
        iconDeleteListDivisiEditManagemenDivisi.getText();
    }

    //Showing Page 2, 3, 4......dst (List Managemen Divisi)
    public void showingPage2_3_4____DstListDivisiEditManagemenDivisi() {
        showingPage2_3_4____DstListDivisiEditManagemenDivisi.click();
    }
    public String txtValidasiShowingPage2_3_4____DstListDivisiEditManagemenDivisi() {
        showingPage2_3_4____DstListDivisiEditManagemenDivisi.sendKeys("2");
        return txtValidasiShowingPage2_3_4____DstListDivisiEditManagemenDivisi.getText();
    }

    //Showing Next Page (List Managemen Divisi)
    public void showingNextPageListDivisiEditManagemenDivisi() {
        showingNextPageListDivisiEditManagemenDivisi.click();
    }
    public String txtValidasiShowingNextPageListDivisiEditManagemenDivisi() {
        showingNextPageListDivisiEditManagemenDivisi.sendKeys("Next");
        return txtValidasiShowingNextPageListDivisiEditManagemenDivisi.getText();
    }

    //Showing Previous Page (List Managemen Divisi)
    public void showingPreviousPageListDivisiEditManagemenDivisi() {
        showingPreviousPageListDivisiEditManagemenDivisi.click();
    }
    public String txtValidasiShowingPreviousPageListDivisiEditManagemenDivisi() {
        showingPreviousPageListDivisiEditManagemenDivisi.sendKeys("Previous");
        return txtValidasiShowingPreviousPageListDivisiEditManagemenDivisi.getText();
    }

}
