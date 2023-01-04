/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import javax.swing.JOptionPane;
import rumahsakit.DataPasien;

/**
 *
 * @author LENOVO
 */
public class Validation {
    private int antrian = 0;
            
    public void validate(DataPasien pasien) {
        if(antrian >= 0) {
            this.antrian++;
            JOptionPane.showMessageDialog(null, "Nama : " + pasien.getNama() + "\n" + "Nomor Antrian : " + this.antrian);
        } else {
            System.out.println("Kami sedang tutup");
        }
    }
    
}
