/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.DatabaseConnection;
import model.SmartCard;

/**
 *
 * @author Sonam
 */
public class SmartCardTableModel extends AbstractTableModel {
    private List<SmartCard> cardsList;
    private SmartCard smartCard;
    private int numcols,numrows;
    
    public SmartCardTableModel() {
        smartCard = new SmartCard();
        numrows = cardsList.size();
        numcols = smartCard.getNumberOfColumns();
    }
    
    public SmartCardTableModel(List<SmartCard> list)  {
     cardsList = list;
     numrows = cardsList.size();
     smartCard = new SmartCard();
     numcols = smartCard.getNumberOfColumns();     
    }
           
    @Override
    public int getColumnCount() {
            // TODO Auto-generated method stub
            return numcols;
    }

    @Override
    public int getRowCount() {
            // TODO Auto-generated method stub
            return numrows;
    }

    @Override
    public Object getValueAt(int row, int col) {
            try {
                return cardsList.get(row).getColumnData(col);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int colIndex) {
            return false;
     }

    @Override
    public Class<?> getColumnClass(int col) {
            return getValueAt(0, col).getClass();
     }

    @Override
    public String getColumnName(int col) {
        try {
            return smartCard.getColumnName(col);
        } catch (Exception err) {
            return err.toString();
           }             
     }

    @Override
    public void setValueAt(Object aValue, int row, int col) {
            try {
               SmartCard element = cardsList.get(row);
               element.setColumnData(col, aValue); 
               fireTableCellUpdated(row, col);
            } catch(Exception err) {
                err.toString();
            }	
    }
    public List<SmartCard> getList() {
            return cardsList;
    }
    

}
