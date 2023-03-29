package org.mapsa.Q1.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkListService<T> implements ColectionFunc<T> {


    List<T> linkList = new LinkedList<>();
//    LinkedList<T> linkList1 = new LinkedList<>();


    @Override
    public boolean add(T t) {

        try {
            linkList.add(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean remove(T t) {
        try {
            linkList.remove(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean contain(T t) {
        try {
            return linkList.contains(t);
        } catch (Exception e) {
            return false;
        }
    }
}
