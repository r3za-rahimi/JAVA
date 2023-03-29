package org.mapsa.Q1;

import org.mapsa.Q1.DAO.Person;
import org.mapsa.Q1.collection.ArrayListService;
import org.mapsa.Q1.collection.HashSetService;
import org.mapsa.Q1.collection.LinkListService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        Person psn = new Person("feri" , 20);
        List<Person> persons = new ArrayList();

        IntStream.rangeClosed(1,5000000).forEach(i -> persons.add(new Person("a"+i , i)));
        persons.add(250000, psn);


        //////////////////////////////////////////////////////////////////////////

        ArrayListService<Person> arrayList = new ArrayListService<>();
        LinkListService<Person> linkList = new LinkListService<>();
        HashSetService<Person> hashSet = new HashSetService<>();



        ////////////////
        long arrayAddStart = System.currentTimeMillis();
        persons.stream().forEach(arrayList::add);
        long arrayAddEnd = System.currentTimeMillis();

        System.out.println("arrayList add time " + (arrayAddEnd - arrayAddStart));

        ////////////////////////
        long linkAddStart = System.currentTimeMillis();
        persons.stream().forEach(linkList::add);
        long linkAddEnd = System.currentTimeMillis();

        System.out.println("linkList add time " + (linkAddEnd - linkAddStart));

        /////////////////////////
        long setAddStart = System.currentTimeMillis();
        persons.stream().forEach(hashSet::add);
        long setAddEnd = System.currentTimeMillis();

        System.out.println("hashSet add time " + (setAddEnd - setAddStart));


        /////////////////////////
        long arrayRemoveStart = System.currentTimeMillis();
//        persons.stream().forEach(arrayList::remove);
        arrayList.remove(psn);
        long arrayRemoveEnd = System.currentTimeMillis();

        System.out.println("\u001B[35m" +"arrayList remove time " + (arrayRemoveEnd - arrayRemoveStart));


        /////////////////////////
        long linkRemoveStart = System.currentTimeMillis();
//        persons.stream().forEach(linkList::remove);
        linkList.remove(psn);
        long linkRemoveEnd = System.currentTimeMillis();

        System.out.println("linkList remove time " + (linkRemoveEnd - linkRemoveStart));


        /////////////////////////
        long setRemoveStart = System.currentTimeMillis();
//        persons.stream().forEach(hashSet::remove);
        hashSet.remove(psn);
        long setRemoveEnd = System.currentTimeMillis();

        System.out.println("hashSet remove time " + (setRemoveEnd - setRemoveStart));

        /////////////////////////
        long arrayContainStart = System.currentTimeMillis();
//        persons.stream().forEach(arrayList::contain);
        arrayList.contain(psn);
        long arrayContainEnd = System.currentTimeMillis();

        System.out.println("\u001B[32m" + "arrayList Contain time " + (arrayContainEnd - arrayContainStart));


        /////////////////////////
        long linkContainStart = System.currentTimeMillis();
//        persons.stream().forEach(linkList::contain);
        linkList.contain(psn);
        long linkContainEnd = System.currentTimeMillis();

        System.out.println("linkList Contain time " + (linkContainEnd - linkContainStart));


        /////////////////////////
        long setContainStart = System.currentTimeMillis();
//        persons.stream().forEach(hashSet::contain);
        hashSet.contain(psn);
        long setContainEnd = System.currentTimeMillis();

        System.out.println("hashSet Contain time " + (setContainEnd - setContainStart));
    }
}