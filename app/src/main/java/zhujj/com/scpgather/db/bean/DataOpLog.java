package zhujj.com.scpgather.db.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 *
 * 操作日志数据采集
 *
 * 作者：朱建晶 on 2018/4/16 10:21
 * 邮箱：344951059@qq.com
 */

@Entity
public class DataOpLog {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "time")
    private String time; // 数据采集时间

    @Property(nameInDb = "opType")
    private String opType; //  操作来源类型  app

    @Property(nameInDb = "describe")
    private String describe; //  操作描述

    @Generated(hash = 592902679)
    public DataOpLog(Long id, String time, String opType, String describe) {
        this.id = id;
        this.time = time;
        this.opType = opType;
        this.describe = describe;
    }

    @Generated(hash = 1353561541)
    public DataOpLog() {
    }

    public String getOpType() {
        return this.opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
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
