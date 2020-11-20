package com.zc58s.prototype;

import java.io.*;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 16:34
 */
public abstract class Prototype<T> implements Cloneable, Serializable {
    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }

    public T deepReplication() throws IOException, CloneNotSupportedException, ClassNotFoundException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        //从流里读出来
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        T cloneBook = (T) ois.readObject();
        //关闭流
        baos.close();
        oos.close();
        bais.close();
        return cloneBook;
    }
}


