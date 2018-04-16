package zhujj.com.scpgather.db.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：朱建晶 on 2018/4/16 15:46
 * 邮箱：344951059@qq.com
 */

@Entity
public class Settings {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "time")
    private String time; // 刷新时间

    @Property(nameInDb = "pileNum")
    private String pileNum; // 桩号

    @Property(nameInDb = "carNum")
    private String carNum; // 车辆编号

    @Property(nameInDb = "deeping")
    private String deeping; // 当前深度

    @Generated(hash = 1249504820)
    public Settings(Long id, String time, String pileNum, String carNum,
            String deeping) {
        this.id = id;
        this.time = time;
        this.pileNum = pileNum;
        this.carNum = carNum;
        this.deeping = deeping;
    }

    @Generated(hash = 456090543)
    public Settings() {
    }

    public String getPileNum() {
        return this.pileNum;
    }

    public void setPileNum(String pileNum) {
        this.pileNum = pileNum;
    }

    public String getCarNum() {
        return this.carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getDeeping() {
        return this.deeping;
    }

    public void setDeeping(String deeping) {
        this.deeping = deeping;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
