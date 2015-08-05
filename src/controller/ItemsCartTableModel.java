/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Sonam
 */
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ItemsCartTableModel extends AbstractTableModel {
    private List<Integer> itemCodes;
    private List<String> itemNames;
    private int numcols, numrows;
    
    public ItemsCartTableModel() {
     itemCodes = new CircularList<Integer>();
     itemNames = new CircularList<String>();
     numrows = itemCodes.size();
     numcols = 2;    
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
    public String getValueAt(int row, int col) {
      	try {
            if (col == 0) 
                return Integer.toString(itemCodes.get(row));
            else if (col == 1)
                return itemNames.get(row);
            else
		   throw new Exception("Error: invalid column index in itemlist table");
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
        String colName = null;
        try {
            if (col == 0) 
            	   colName = "Code";
            else if (col == 1)
            	   colName = "Name";
            else 
                throw new Exception("Access to invalid column number in itemlist table");
        }
        catch (Exception err) {
           return err.toString();
        }  
        return colName;
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int col) {
    }
    
    public List getItemCodes() {
	return itemCodes;
    }
    
    public List getItemNames() {
	return itemNames;
    }
    
    public ItemsCartTableModel(List list1, List list2)  {
        itemCodes = list1;
        itemNames = list2;
        numrows = itemCodes.size();
        numcols = 2;     
     }
    
    public void addRow(Integer ID) {
        if(!itemCodes.contains(ID)) {
            itemCodes.add(ID);
            itemNames.add("name");
            fireTableRowsInserted(itemCodes.size()-1, numcols-1);
            numrows++;
        }
    }
        
    public void deleteRow(Integer ID) {
            itemCodes.remove(ID);
            itemNames.remove("name");
            fireTableRowsDeleted(itemCodes.size(), numcols-1);   
        }
}
