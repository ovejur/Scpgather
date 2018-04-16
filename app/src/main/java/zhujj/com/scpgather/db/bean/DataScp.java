package zhujj.com.scpgather.db.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 *
 * 桩数据采集
 * 作者：朱建晶 on 2018/4/16 11:46
 * 邮箱：344951059@qq.com
 */

@Entity
public class DataScp {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "time")
    private String time; // 数据采集时间

    @Property(nameInDb = "pileNum")
    private String pileNum; // 桩号

    @Property(nameInDb = "carNum")
    private String carNum; // 车辆编号

    @Property(nameInDb = "deeped")
    private String deeped; // 成孔深度

    @Property(nameInDb = "deeping")
    private String deeping; // 当前深度

    @Property(nameInDb = "deepX")
    private String deepX; // 垂直度X

    @Property(nameInDb = "deepY")
    private String deepY; // 垂直度Y

    @Property(nameInDb = "current")
    private String current; // 动力头电机电流

    @Property(nameInDb = "cement")
    private String cement; // 剩余水泥量

    @Property(nameInDb = "isUp")
    private int isUp; // 是否已上传到后台   0未上传  1已上传

    @Generated(hash = 232123988)
    public DataScp(Long id, String time, String pileNum, String carNum,
            String deeped, String deeping, String deepX, String deepY,
            String current, String cement, int isUp) {
        this.id = id;
        this.time = time;
        this.pileNum = pileNum;
        this.carNum = carNum;
        this.deeped = deeped;
        this.deeping = deeping;
        this.deepX = deepX;
        this.deepY = deepY;
        this.current = current;
        this.cement = cement;
        this.isUp = isUp;
    }

    @Generated(hash = 384688592)
    public DataScp() {
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

    public String getPileNum() {
        return this.pileNum;
    }

    public void setPileNum(String pileNum) {
        this.pileNum = pileNum;
    }

    public String getDeeped() {
        return this.deeped;
    }

    public void setDeeped(String deeped) {
        this.deeped = deeped;
    }

    public String getDeeping() {
        return this.deeping;
    }

    public void setDeeping(String deeping) {
        this.deeping = deeping;
    }

    public String getDeepX() {
        return this.deepX;
    }

    public void setDeepX(String deepX) {
        this.deepX = deepX;
    }

    public String getDeepY() {
        return this.deepY;
    }

    public void setDeepY(String deepY) {
        this.deepY = deepY;
    }

    public String getCurrent() {
        return this.current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getCement() {
        return this.cement;
    }

    public void setCement(String cement) {
        this.cement = cement;
    }

    public int getIsUp() {
        return this.isUp;
    }

    public void setIsUp(int isUp) {
        this.isUp = isUp;
    }

    public String getCarNum() {
        return this.carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

}
