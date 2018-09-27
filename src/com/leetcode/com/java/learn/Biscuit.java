package com.leetcode.com.java.learn;

import lombok.Data;
import lombok.Getter;
import sun.reflect.generics.tree.Tree;

import java.util.*;

@Getter
public class Biscuit implements Comparable<Biscuit>{
    private String name;
    private Integer price;
    private String type;

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public Biscuit(String name, Integer price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(Biscuit biscuit) {
        return price - biscuit.price;
    }

    public static void main(String[] args) {

        Biscuit fruitNut = new Biscuit("Fruit & Nuts", 25, "Cookie");
        Biscuit pistaBadaam = new Biscuit("Pista Badaam", 20, "Cookie");
        Biscuit chocoNuts = new Biscuit("Choco Nuts", 30, "Cookie");

        List<Biscuit> biscuitsList = new ArrayList<>();
        biscuitsList.add(fruitNut);
        biscuitsList.add(pistaBadaam);
        biscuitsList.add(chocoNuts);

        System.out.println(biscuitsList);

        TreeSet<Biscuit> biscuitsNaturalSet = new TreeSet<>();
        biscuitsNaturalSet.add(fruitNut);
        biscuitsNaturalSet.add(pistaBadaam);
        biscuitsNaturalSet.add(chocoNuts);

        System.out.println(biscuitsNaturalSet);

        TreeSet<Biscuit> biscuitCustomSet = new TreeSet<>(new BiscuitComparatorByName());
        biscuitCustomSet.add(fruitNut);
        biscuitCustomSet.add(pistaBadaam);
        biscuitCustomSet.add(chocoNuts);

        System.out.println(biscuitCustomSet);

        Comparator<Biscuit> compareByName = Comparator.comparing(Biscuit::getName);
        Comparator<Biscuit> compareByPrice = Comparator.comparing(Biscuit::getPrice);

        Comparator<Biscuit> compareByNameAndPrice = compareByName.thenComparing(compareByPrice);

        Collections.sort(biscuitsList, compareByNameAndPrice);

        System.out.println(biscuitsList);


    }
}

class BiscuitComparatorByName implements Comparator<Biscuit> {

    @Override
    public int compare(Biscuit biscuit1, Biscuit biscuit2) {
        return biscuit1.getName().compareTo(biscuit2.getName());
    }
}

class BiscuitComparatorPrice implements Comparator<Biscuit> {

    @Override
    public int compare(Biscuit biscuit1, Biscuit biscuit2) {
        return biscuit1.getPrice().compareTo(biscuit2.getPrice());
    }
}