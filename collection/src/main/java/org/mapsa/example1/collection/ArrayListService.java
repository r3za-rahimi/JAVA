package org.mapsa.Q1.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListService<T> implements ColectionFunc<T> {

    List<T> arrayList = new ArrayList<>();

    @Override
    public boolean add(T t) {

        try {
            arrayList.add(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean remove(T t) {

        try {
            arrayList.remove(t);
            return true;
        } catch (Exception e) {
            return false;
        }


    }

    @Override
    public boolean contain(T t) {
        try {
            return arrayList.contains(t);

        } catch (Exception e) {
            return false;
        }
    }


    public List<T> getArrayList() {
        return arrayList;
    }
}
