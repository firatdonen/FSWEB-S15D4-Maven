package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<>();

    // Eleman ekleme metodu
    public void add(T element) {
        if (!list.contains(element)) {
            list.add(element);
        }
    }

    // Elemanları sıralama metodu
    public void sort() {
        Collections.sort(list);
    }

    // Eleman silme metodu
    public void remove(Object element) {
        list.remove(element);
        this.sort();
    }

    // Listeyi yazdırma metodu (test etmek için)
    public void printList() {
        for (T element : list) {
            System.out.println(element);
        }
    }

    // Liste boyutunu dönen metot
    public int size() {
        return list.size();
    }

    // Listeyi dönen metot
    public ArrayList<T> getList() {
        return list;
    }

    public double get(int i) {//burayı alamadım
    return 0;}
}
