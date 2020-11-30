package com.zc58s.structural.facede;

/*
 * @description :
 *
 * 加密外观类，充当外观类
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 11:23
 */
public class EncryptFacade {



    //维持对其他对象的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade()
    {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    //调用其他对象的业务方法
    public void FileEncrypt()
    {
        reader.read();
        cipher.encrypt();
        writer.write();
    }
}
