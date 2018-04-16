package zhujj.com.scpgather.db.dao;

import java.util.List;

import zhujj.com.scpgather.db.bean.DataOpLog;

import static zhujj.com.scpgather.MyApplication.getDaoInstant;

/**
 * 作者：朱建晶 on 2018/4/16 11:00
 * 邮箱：344951059@qq.com
 */

public class DataOplogDao {

    public static long insertDataOplog(DataOpLog dataOpLog) {
        return getDaoInstant().getDataOpLogDao().insertOrReplace(dataOpLog);
    }

    public static void deleteDataOpLog(long id) {
        getDaoInstant().getDataOpLogDao().deleteByKey(id);
    }

    public static void updateDataOpLog(DataOpLog dataOpLog) {
        getDaoInstant().getDataOpLogDao().update(dataOpLog);
    }

    public static List<DataOpLog> queryAll() {
        return getDaoInstant().getDataOpLogDao().loadAll();
    }

    // 分页查询， 每页20条   页码从0开始，第一页传0
    public static List<DataOpLog> queryByNum(int num) {
        return getDaoInstant().getDataOpLogDao().queryBuilder().offset(num * 20).limit(20).list();
    }
}
