package prototype.deepclone;

import java.io.Serializable;

/**
 * @author vdsklnl
 * @create 2022-06-22 11:23
 * @Description
 */

public class DeepCloneableTarget implements Serializable, Cloneable {
    //序列化标识
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "{" + "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }
}
