package org.mapsa.Q34;

public class MainClass {

    public static void main(String[] args) {

        LinkList linkList = new LinkList();

        linkList.add(5);
        linkList.add(6);
        linkList.add(7);
        linkList.add(8);

        System.out.println(linkList.toString());


//        linkList.setRoot(linkList.remove(linkList.getRoot(), 5));
        linkList.remove(linkList.getRoot(), 6);


        System.out.println(linkList.toString());
    }
}
