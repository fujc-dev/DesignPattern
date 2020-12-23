package com.zc58s.basic.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * DesignPattern
 * com.zc58s.basic.collection
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/23 14:37
 */
public class P171 {


    /**
     *
     * for(item:source)删除报错分析
     * <p>
     *     {@link java.util.ConcurrentModificationException},此异常可能由检测到并发的方法引发在不允许修改的情况下修改对象。
     * </p>
     * <p>{@link Iterator}与{@link ArrayList}取得的的数据两个数据副本。</p>
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        /*
        for (String item : list) {
            System.out.println(item);
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
         */
        //删除的时候，先把item的索引查出来，
        //然后通过去删除数组
        //删除之后，再去遍历，但是list发生了变化，
        //此时，for内部的迭代器与实际的迭代器已经变化了。
        //上述26-33行代码，通过反编译，得到这样子的代码。
        //1、拿list获取迭代器
        Iterator iterator = list.iterator();
        do {
            try {
                //2、是否包含下一个值
                if (!iterator.hasNext())
                    break;
                String item = (String) iterator.next();  //modCount 调用next的时候进行了一个修改次数的判断，修改次数与
                //在删除一个值后，获取下一个值时报错。
                //
                System.out.println(item);
                if ("2".equals(item)) {
                    list.remove(item);
                }
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

        } while (true);
        //以上，会报错的原因就是操作了迭代器，哈哈
        iterator = list.iterator();

        //
//        for (int i = 0; i < list.size(); i++) {
//            if ("2".equals(list.get(i))) {
//                list.remove(list.get(i));
//            }
//        }

        System.out.println(list.size());


        /**
         * 用了迭代器就必须要用迭代器删除，如果使用ArrayList里面的删除(modCount会+1)，
         * 那么其静态的modCount就与获取迭代器时内部获取的modCount不等，不等就会报错。
         * 另外，迭代器是将ArrayList的内容又复制了一遍。删除的数据副本都不一样，所有就会报错，
         * 这个错其实迭代器报的，用catch捕获一下这个异常后，
         * 其实并不影响list的正常使用，只是这个迭代器就不能再用。
         */
    }

}
