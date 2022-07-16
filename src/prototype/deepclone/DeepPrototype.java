package prototype.deepclone;

import java.io.*;

/**
 * @author vdsklnl
 * @create 2022-06-22 11:28
 * @Description
 */

public class DeepPrototype implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
    }

    //深拷贝方法1：重写clone()
    //不推荐，需要处理每一个引用对象
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepPrototype deep = (DeepPrototype) super.clone();
        //对引用类型变量进行处理
        deep.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    //深拷贝方式2：对象序列化
    //推荐，但需要引用类型类实现序列化
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流形式输出
            oos.writeObject(this);

            //反序列化
            ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            DeepPrototype copyObj = (DeepPrototype) ois.readObject();
            //输出读取就完成复制
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                "} " + deepCloneableTarget.hashCode();
    }
}
