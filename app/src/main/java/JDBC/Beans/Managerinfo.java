package JDBC.Beans;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by ChrisYoung on 2017/12/26.
 */

public class Managerinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String magId;
    private String magPassword;
    private String magName;

    public String getMagId() {
        return magId;
    }

    public void setMagId(String magId) {
        this.magId = magId;
    }

    public String getMagPassword() {
        return magPassword;
    }

    public void setMagPassword(String magPassword) {
        this.magPassword = magPassword;
    }

    public String getMagName() {
        return magName;
    }

    public void setMagName(String magName) {
        this.magName = magName;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
