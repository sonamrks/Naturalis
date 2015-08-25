/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author Sonam
 */
public class CartIterator implements Iterator {
    private CartItemsTableModel cartItemsTableModel;
    private List<Product> cartItems;
    private List<Integer> itemCodes;
    private List<String> itemNames;
    private List<Double> itemPrices;
    private List<String> itemTypes;
    private List<String> itemPicturePaths;
    private int numcols;
    private int currentIndex = 0;
    
    public CartIterator(CartItemsTableModel cartItemsTableModel) {
        this.cartItemsTableModel = cartItemsTableModel;
        itemCodes = cartItemsTableModel.getItemCodes();
        itemNames = cartItemsTableModel.getItemNames();
        itemPrices = cartItemsTableModel.getItemPrices();
        itemPicturePaths = cartItemsTableModel.getPicturePath();
        itemTypes = cartItemsTableModel.getItemTypes();
        cartItems = cartItemsTableModel.getCartItems();
        numcols = cartItemsTableModel.getColumnCount();
    }

    @Override
    public boolean hasNext() {
            if (currentIndex >= cartItems.size()) {
                    return false;
            } else {
                    return true;
            }
    }

    @Override
    public Integer next() {
            return itemCodes.get(currentIndex++);
    }

    @Override
    public void removeItem(Integer code) {
        while(hasNext()) {
            if(next().equals(code)) {
                itemCodes.remove(--currentIndex);
                itemNames.remove(currentIndex);  
                itemPrices.remove(currentIndex);  
                itemTypes.remove(currentIndex);
                itemPicturePaths.remove(currentIndex); 
                cartItems.remove(currentIndex);
                break;
            }
        }
        currentIndex = 0;

        cartItemsTableModel.updateRemoveFromCartTable(itemCodes.size(), numcols-1);
    }
}