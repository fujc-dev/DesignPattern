package com.zc58s.basic.collection;

import java.util.*;

/*
 * SortedMap无序不可重复的，但是存进去的元素可以按照大小自动排序。
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/17 11:44
 */
public class P169 {
    /**
     * 如果想要自动排序：Key元素需要实现{@link Comparable}接口；
     * 也可以使用{@link Comparator}接口，实现一个比较器。
     *
     * @param args
     */
    public static void main(String[] args) {

        //声明可排序，不可重复的元素
        Map products = new TreeMap();
        //构建商品
        Product p1 = new Product("西瓜", 1);
        Product p2 = new Product("苹果", 4);
        Product p3 = new Product("香蕉", 2);
        Product p4 = new Product("荔枝", 7);

        products.put(p1, 2.0);
        products.put(p2, 3.0);
        products.put(p3, 6.0);
        products.put(p4, 10.0);

        Set sets = products.keySet();
        Iterator iterator = sets.iterator();
        while (iterator.hasNext()) {
            Object k = iterator.next();
            Object v = products.get(k);
            System.out.println(k + " ---> " + v + "kg");
        }


    }

    static class Product implements Comparable {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Product)) return false;
            Product product = (Product) o;
            return Double.compare(product.price, price) == 0 &&
                    Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }

        @Override
        public int compareTo(Object o) {

            /*
            * Product product = (Product) o;
            * int temp = this.price - product.price;
            * return temp == 0 ? this.name.compareTo(product.name) : temp;
            * */
            //按照商品价格排序
            Product product = (Product) o;
            if (this.price < product.price) return -1;
            else if (this.price > product.price) return 1;
            else return 0;
        }
    }

}
