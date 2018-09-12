package com.leetcode.algo.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OnlineStockSpan {

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();

        System.out.println(stockSpanner.next(100));
        System.out.println(stockSpanner.next(80));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(70));
        System.out.println(stockSpanner.next(60));
        System.out.println(stockSpanner.next(75));
        System.out.println(stockSpanner.next(85));
    }


}

class StockSpanner {

    Stack<Integer> stocks;
    int index;
    List<Integer> prices;

    public StockSpanner() {
        stocks = new Stack<>();
        index = -1;
        prices = new ArrayList<>();
    }

    public int next(int price) {
        prices.add(price);
        index++;
        if(stocks.empty()){
            stocks.push(index);
            return (index + 1);
        }
        if(prices.get(stocks.peek()) > price){
            stocks.push(index);
            return 1;
        }
        while(!stocks.empty() && prices.get(stocks.peek()) <= price){
            stocks.pop();
        }
        int ans;
        if(stocks.empty()){
           ans = (index + 1);
        }else {
            ans = (index - stocks.peek());
        }
        stocks.push(index);
        return ans;
    }
}

