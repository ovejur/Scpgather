package zhujj.com.scpgather.db.dao;

import java.util.List;

import zhujj.com.scpgather.db.bean.DataScp;

import static zhujj.com.scpgather.MyApplication.getDaoInstant;

/**
 * 作者：朱建晶 on 2018/4/16 15:53
 * 邮箱：344951059@qq.com
 */

public class DataScpDao {
    public static long insertDataScp(DataScp dataScp) {
        return getDaoInstant().getDataScpDao().insertOrReplace(dataScp);
    }

    public static void deleteDataScp(long id) {
        getDaoInstant().getDataScpDao().deleteByKey(id);
    }

    public static void updateDataScp(DataScp dataScp) {
        getDaoInstant().getDataScpDao().update(dataScp);
    }

    public static List<DataScp> queryAll() {
        return getDaoInstant().getDataScpDao().loadAll();
    }
}
