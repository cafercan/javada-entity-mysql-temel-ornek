/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityandmysql;

import Entityler.Kullanici;
import Veritabani.Veritabani;

/**
 *
 * @author cafercan
 */
public class EntityAndMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veritabani veritabani = new Veritabani();
        Kullanici kullanici = new Kullanici();
        
        veritabani.baglan();
        kullanici.setKullaniciAdi("cafercan");
        kullanici.setSifre("q1w2e3");
        veritabani.persist(kullanici);
    }
    
}
