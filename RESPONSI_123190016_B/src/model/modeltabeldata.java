/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class modeltabeldata extends AbstractTableModel {
    List<datagym>dg;
    public modeltabeldata(List<datagym>dg){
     this.dg = dg;   
    }

    @Override
    public int getRowCount() {
        return dg.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dg.get(row).getNama();
            case 1:
                return dg.get(row).getAlat();
            case 2:
                return dg.get(row).getNo_telp();
            case 3:
                return dg.get(row).getWaktu();
            case 4:
                return dg.get(row).getBiaya();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "NAMA";
            case 1:
                return 
                        "ALAT";
            case 2:
                return "NO_TELP";
            case 3:
                return "WAKTU";
            case 4:
                return "BIAYA";
            default:
                return null;
        }
    }
    
}
