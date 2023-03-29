package org.mapsa.Q1.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetService<T> implements ColectionFunc<T> {

    //    HashSet<T> hashSet = new HashSet<>();
    Set<T> hashSet = new HashSet<>();

    @Override
    public boolean add(T t) {
        try {
            hashSet.add(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean remove(T t) {
        try {
            hashSet.remove(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean contain(T t) {
        try {
            return hashSet.contains(t);

        } catch (Exception e) {
            return false;
        }
    }
}
