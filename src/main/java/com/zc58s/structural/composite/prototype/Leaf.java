package com.zc58s.structural.composite.prototype;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 15:10
 */
/**
 * 叶子对象，叶子对象不再包含其它子对象
 */
public class Leaf extends Component {
    /**
     * 示意方法，叶子对象可能有自己的功能方法
     */
    public void someOperation() {
        // do something
    }
}