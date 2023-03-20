/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author LENOVO
 */
public class Balok extends PersegiPanjang {
    private double tinggi, luasPermukaan, volume;
    
    public Balok() {
    }
    
    public Balok(double p, double l, double t) {
        super(p,l);
        tinggi = t;
    }    
    
    public double hitungVolume()
    {
        volume = getLuas()*tinggi;
        return volume;
    }
    
    public double hitungLuasPermukaan()
    {
        luasPermukaan = getLuas()*2+2*getLebar()*tinggi+2*getPanjang()*tinggi;
        return luasPermukaan;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
}

