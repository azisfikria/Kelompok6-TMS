package com.kelompokenam.tms.pages;

import com.kelompokenam.tms.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class TambahDivisi {

    private WebDriver driver;

    public TambahDivisi() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Modul Tambah Divisi
    // Menu Dashboard Master
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/a")
    WebElement menuMaster;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[4]/ul/li[1]/a")
    WebElement menuMasterTambahDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[1]/h4")
    WebElement txtValidasiTampilHalamanMasterDivisi;

    //Input Nama Divisi
    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement fieldNamaDivisi;

    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement inputNamaDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[1]/h4")
    WebElement txtValidasiInputNamaDivisi;

    //tombol simpan
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement btnSimpanMasterDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement txtValidasiTombolSimpanMasterDivisi;

    //input nama divisi dengan karakter alphanumeric
    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement fieldNamaDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement inputNamaDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[1]/h4")
    WebElement txtValidasiInputNamaDivisiAlphanumeric;

    //tombol simpan
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement btnSimpanMasterDivisiAlphanumeric;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement txtValidasiTombolSimpanMasterDivisiAlphanumeric;

    //Show Page Tambah Divisi
    //Show 10 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show10EntriesListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka10ListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow10EntriesListDivisi;

    //Show 25 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show25EntriesListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka25ListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow25EntriesListDivisi;

    //Show 50 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show50EntriesListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka50ListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow50EntriesListDivisi;

    //Show 100 entries (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show100EntriesListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka100ListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow100EntriesListDivisi;

    //Search List Divisi
    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement searchListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement cariNamaYangSudahDiinputlistDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement txtValidasiSearchListDivisi;

    //Validasi No (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[1]")
    WebElement txtValidasiNoListDivisi;

    //Validasi Nama Divisi (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[2]")
    WebElement txtValidasiNamaDivisiListDivisi;

    //Icon Edit (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[1]/td[3]/a")
    WebElement iconEditListDivisi;


    ///Paging///
    //Showing Page 2, 3, 4.....dst (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]/ul/li[3]")
    WebElement showingPage2_3_4____DstListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]/ul/li[3]")
    WebElement txtValidasiShowingPage2_3_4____DstListDivisi;

    //Showing Next Page (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]")
    WebElement showingNextPageListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]")
    WebElement txtValidasiShowingNextPageListDivisi;

    //Showing Previous Page (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]")
    WebElement showingPreviousPageListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]")
    WebElement txtValidasiShowingPreviousPageListDivisi;

    //Input Nama Divisi (edit list divisi)
    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement fieldNamaDivisiEditListDivisi;

    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement inputNamaDivisiEditListDivisi;

    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement txtValidasiInputNamaDivisiEditListDivisi;

    //tombol Update
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement btnUpdateMasterDivisiEditListDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[2]/div/input")
    WebElement txtValidasiTombolUpdateMasterDivisiEditListDivisi;

    //Icon Edit (List Divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[1]/td[3]/a")
    WebElement iconEditListDivisi2;

    //input nama divisi dengan karakter alphanumeric
    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement fieldNamaDivisiAlphanumericEditListDivisi;

    @FindBy(xpath = "//*[@id=\"Privilege_Name\"]")
    WebElement inputNamaDivisiAlphanumericEditListDivisi;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[1]/div/div[1]/h4")
    WebElement txtValidasiInputNamaDivisiAlphanumericEditListDivisi;

    //tombol cancel
    @FindBy(xpath = "//a[@class='btn btn-block btn-danger']")
    WebElement btnCancelMasterDivisiAlphanumericEditListDivisi;

    @FindBy(xpath = "//a[contains(text(),'Cancel')]")
    WebElement txtValidasiTombolCancelMasterDivisiAlphanumericEditListDivisi;

    //    Show 10 entries (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show10EntriesEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka10EditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow10EntriesEditListDivisi;

    //Show 25 entries (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show25EntriesEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka25EditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow25EntriesEditListDivisi;

    //Show 50 entries (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show50EntriesEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka50EditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow50EntriesEditListDivisi;

    //Show 100 entries (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement show100EntriesEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement pilihAngka100EditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select")
    WebElement txtValidasiShow100EntriesEditListDivisi;

    //Search Edit List Divisi
    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement searchEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement cariNamaYangSudahDiinputEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_filter\"]/label/input")
    WebElement txtValidasiSearchEditListDivisi;

    //Validasi No (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[1]")
    WebElement txtValidasiNoEditListDivisi;

    //Validasi Nama Divisi (edit list divisii)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/thead/tr/th[2]")
    WebElement txtValidasiNamaDivisiEditListDivisi;

    //Tombol Edit (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[1]/td[3]/a")
    WebElement tombolEditListDivisi;

    //Showing Page 2, 3, 4.....dst (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]/ul/li[3]")
    WebElement showingPage2_3_4____DstEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_paginate\"]/ul/li[3]")
    WebElement txtValidasiShowingPage2_3_4____DstEditListDivisi;

    //Showing Next Page (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]")
    WebElement showingNextPageEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_next\"]")
    WebElement txtValidasiShowingNextPageEditListDivisi;

    //Showing Previous Page (edit list divisi)
    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]")
    WebElement showingPreviousPageEditListDivisi;

    @FindBy(xpath = "//*[@id=\"data-table-default_previous\"]")
    WebElement txtValidasiShowingPreviousPageEditListDivisi;



    //Menu Dashboard Master
    public void menuMaster() {
        this.menuMaster.click();
    }
    public void menuMasterTambahDivisi() {
        menuMasterTambahDivisi.click();
    }
    public String txtValidasiTampilHalamanMasterDivisi() {
        return txtValidasiTampilHalamanMasterDivisi.getText();
    }

    //Input Nama Divisi
    public void fieldNamaDivisi() {
        fieldNamaDivisi.getText();
    }

    public void inputNamaDivisi() {
        inputNamaDivisi.sendKeys("KELOMPOK 6");
        inputNamaDivisi.getText();
    }

    public String txtValidasiInputNamaDivisi() {
        return txtValidasiInputNamaDivisi.getText();
    }

    //tombol simpan
    public void btnSimpanMasterDivisi() {
        btnSimpanMasterDivisi.click();
    }

    public String txtValidasiTombolSimpanMasterDivisi() {
        driver.switchTo().alert().accept();
        return txtValidasiTombolSimpanMasterDivisi.getText();
    }

    //input nama divisi dengan karakter alphanumeric
    public void fieldNamaDivisiAlphanumeric() {
        driver.navigate().refresh();
        fieldNamaDivisiAlphanumeric.click();
    }
    public void inputNamaDivisiAlphanumeric() {
        inputNamaDivisiAlphanumeric.sendKeys("KELOMPOK 6 ,.,.=-+_!@#$%");
        inputNamaDivisiAlphanumeric.click();
    }
    public String txtValidasiInputNamaDivisiAlphanumeric() {
        return txtValidasiInputNamaDivisiAlphanumeric.getText();
    }

    //tombol simpan
    public void btnSimpanMasterDivisiAlphanumeric() {
        btnSimpanMasterDivisiAlphanumeric.click();
    }

    public String txtValidasiTombolSimpanMasterDivisiAlphanumeric() {
        driver.switchTo().alert().accept();
        return txtValidasiTombolSimpanMasterDivisiAlphanumeric.getText();
    }

    //Show 10 entries (List Divisi)
    public void show10EntriesListDivisi() {
        show10EntriesListDivisi.click();
    }
    public void pilihAngka10ListDivisi() {
        pilihAngka10ListDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka10ListDivisi.sendKeys("10");
        pilihAngka10ListDivisi.click();
    }
    public String txtValidasiShow10EntriesListDivisi() {
        return txtValidasiShow10EntriesListDivisi.getText();
    }

    //Show 25 entries (List Divisi)
    public void show25EntriesListDivisi() {
        show25EntriesListDivisi.click();
    }
    public void pilihAngka25ListDivisi() {
        pilihAngka25ListDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka25ListDivisi.sendKeys("25");
        pilihAngka25ListDivisi.click();
    }
    public String txtValidasiShow25EntriesListDivisi() {
        return txtValidasiShow25EntriesListDivisi.getText();
    }

    //Show 50 entries (List Divisi)
    public void show50EntriesListDivisi() {
        show50EntriesListDivisi.click();
    }
    public void pilihAngka50ListDivisi() {
        pilihAngka50ListDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka50ListDivisi.sendKeys("50");
        pilihAngka50ListDivisi.click();
    }
    public String txtValidasiShow50EntriesListDivisi() {
        return txtValidasiShow50EntriesListDivisi.getText();
    }

    //Show 100 entries (List Divisi)
    public void show100EntriesListDivisi() {
        show100EntriesListDivisi.click();
    }
    public void pilihAngka100ListDivisi() {
        pilihAngka100ListDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka100ListDivisi.sendKeys("100");
        pilihAngka100ListDivisi.click();
    }
    public String txtValidasiShow100EntriesListDivisi() {
        return txtValidasiShow100EntriesListDivisi.getText();
    }

    //Search (List Divisi)
    public void searchListDivisi() {
        searchListDivisi.sendKeys("KELOMPOK 69");
        searchListDivisi.click();
    }

    public void cariNamaYangSudahDiinputlistDivisi() {
        cariNamaYangSudahDiinputlistDivisi.getText();
    }
    public String txtValidasiSearchListDivisi() {
        return txtValidasiSearchListDivisi.getText();
    }

    //nomor (List Divisi)
    public String txtValidasiNoListDivisi() {
        return txtValidasiNoListDivisi.getText();
    }

    //Nama Divisi (List Divisi)
    public String txtValidasiNamaDivisiListDivisi() {
        return txtValidasiNamaDivisiListDivisi.getText();
    }

    //icon edit (List Divisi)
    public void iconEditListDivisi() {
        iconEditListDivisi.click();
    }

    //Showing Page 2, 3, 4......dst (List Divisi)
    public void showingPage2_3_4____DstListDivisi() {
        showingPage2_3_4____DstListDivisi.click();
    }

    public String txtValidasiShowingPage2_3_4____DstListDivisi() {
        return txtValidasiShowingPage2_3_4____DstListDivisi.getText();
    }

    //Showing Next Page (List Divisi)
    public void showingNextPageListDivisi() {
        showingNextPageListDivisi.click();
    }

    public String txtValidasiShowingNextPageListDivisi() {
        return txtValidasiShowingNextPageListDivisi.getText();
    }

    //Showing Previous Page (List Divisi)
    public void showingPreviousPageListDivisi() {
        showingPreviousPageListDivisi.click();
    }

    public String txtValidasiShowingPreviousPageListDivisi() {
        driver.navigate().refresh();
        return txtValidasiShowingPreviousPageListDivisi.getText();

    }

    // Edit Page
    //Input Nama Divisi (edit list divisi)
    public void fieldNamaDivisiEditListDivisi() {
        fieldNamaDivisiEditListDivisi.click();
    }

    public void inputNamaDivisiEditListDivisi() {
        inputNamaDivisiEditListDivisi.sendKeys("KELOMPOK 66");
        inputNamaDivisiEditListDivisi.click();
    }

    public String txtValidasiInputNamaDivisiEditListDivisi() {
        return txtValidasiInputNamaDivisiEditListDivisi.getText();
    }

    //tombol update
    public void btnUpdateMasterDivisiEditListDivisi() {
        btnUpdateMasterDivisiEditListDivisi.click();
    }

    public String txtValidasiTombolUpdateMasterDivisiEditListDivisi() {
        driver.switchTo().alert().accept();
        return txtValidasiTombolUpdateMasterDivisiEditListDivisi.getText();
    }

    //icon edit 2 (List Divisi)
    public void iconEditListDivisi2() {
        iconEditListDivisi2.click();
    }

    //input nama divisi dengan karakter alphanumeric (Edit List Divisi)
    public void fieldNamaDivisiAlphanumericEditListDivisi() {
        driver.navigate().refresh();
        fieldNamaDivisiAlphanumericEditListDivisi.click();
    }
    public void inputNamaDivisiAlphanumericEditListDivisi() {
        inputNamaDivisiAlphanumericEditListDivisi.sendKeys("KELOMPOK 69");
        inputNamaDivisiAlphanumericEditListDivisi.click();
    }
    public String txtValidasiInputNamaDivisiAlphanumericEditListDivisi() {
        return txtValidasiInputNamaDivisiAlphanumericEditListDivisi.getText();
    }

    //tombol cancel
    public void btnCancelMasterDivisiAlphanumericEditListDivisi() {
        btnCancelMasterDivisiAlphanumericEditListDivisi.click();
    }
    public String txtValidasiTombolCancelMasterDivisiAlphanumericEditListDivisi() {
        return txtValidasiTombolCancelMasterDivisiAlphanumericEditListDivisi.getAttribute("Required");
    }

    //Show 10 entries (Edit List Divisi)
    public void show10EntriesEditListDivisi() {
        show10EntriesEditListDivisi.click();
    }
    public void pilihAngka10EditListDivisi() {
        pilihAngka10EditListDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka10EditListDivisi.sendKeys("10");
        pilihAngka10EditListDivisi.click();
    }
    public String txtValidasiShow10EntriesEditListDivisi() {
        return txtValidasiShow10EntriesEditListDivisi.getText();
    }

    //Show 25 entries (Edit List Divisi)
    public void show25EntriesEditListDivisi() {
        show25EntriesEditListDivisi.click();
    }
    public void pilihAngka25EditListDivisi() {
        pilihAngka25EditListDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka25EditListDivisi.sendKeys("25");
        pilihAngka25EditListDivisi.click();
    }
    public String txtValidasiShow25EntriesEditListDivisi() {
        return txtValidasiShow25EntriesEditListDivisi.getText();
    }

    //Show 50 entries (Edit List Divisi)
    public void show50EntriesEditListDivisi() {
        show50EntriesEditListDivisi.click();
    }
    public void pilihAngka50EditListDivisi() {
        pilihAngka50EditListDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka50EditListDivisi.sendKeys("50");
        pilihAngka50EditListDivisi.click();
    }
    public String txtValidasiShow50EntriesEditListDivisi() {
        return txtValidasiShow50EntriesEditListDivisi.getText();
    }

    //Show 100 entries (Edit List Divisi)
    public void show100EntriesEditListDivisi() {
        show100EntriesEditListDivisi.click();
    }
    public void pilihAngka100EditListDivisi() {
        pilihAngka100EditListDivisi.sendKeys(Keys.ARROW_DOWN);
        pilihAngka100EditListDivisi.sendKeys("100");
        pilihAngka100EditListDivisi.click();
    }
    public String txtValidasiShow100EntriesEditListDivisi() {
        return txtValidasiShow100EntriesEditListDivisi.getText();
    }

    //Search (Edit List Divisi)
    public void searchEditListDivisi() {
        searchEditListDivisi.sendKeys("KELOMPOK 66");
        searchEditListDivisi.click();
    }

    public void cariNamaYangSudahDiinputEditListDivisi() {
        cariNamaYangSudahDiinputEditListDivisi.getText();
    }
    public String txtValidasiSearchEditListDivisi() {
        return txtValidasiSearchEditListDivisi.getText();
    }

    //nomor (Edit List Divisi)
    public String txtValidasiNoEditListDivisi() {
        return txtValidasiNoEditListDivisi.getText();
    }

    //Nama Divisi (Edit List Divisi)
    public String txtValidasiNamaDivisiEditListDivisi() {
        return txtValidasiNamaDivisiEditListDivisi.getText();
    }

    //Tombol edit (Edit List Divisi)
    public void tombolEditListDivisi() {
        tombolEditListDivisi.click();
    }

    //Showing Page 2, 3, 4......dst (Edit List Divisi)
    public void showingPage2_3_4____DstEditListDivisi() {
        showingPage2_3_4____DstEditListDivisi.click();
    }

    public String txtValidasiShowingPage2_3_4____DstEditListDivisi() {
        return txtValidasiShowingPage2_3_4____DstEditListDivisi.getText();
    }

    //Showing Next Page (Edit List Divisi)
    public void showingNextPageEditListDivisi() {
        showingNextPageEditListDivisi.click();
    }

    public String txtValidasiShowingNextPageEditListDivisi() {
        return txtValidasiShowingNextPageEditListDivisi.getText();
    }

    //Showing Previous Page (Edit List Divisi)
    public void showingPreviousPageEditListDivisi() {
        showingPreviousPageEditListDivisi.click();
    }

    public String txtValidasiShowingPreviousPageEditListDivisi() {
        return txtValidasiShowingPreviousPageEditListDivisi.getText();
    }
}

