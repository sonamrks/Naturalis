/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Sonam
*/
    public class CircularList<E> extends ArrayList<E> {

        @Override
        public E get(int index) {
            if (size() != 0) {
            return super.get(index % size());
            } else {
                return null;
            }
        }
    }
