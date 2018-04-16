package zhujj.com.scpgather.db.dao;

import java.util.List;

import zhujj.com.scpgather.db.bean.Settings;

import static zhujj.com.scpgather.MyApplication.getDaoInstant;

/**
 * 作者：朱建晶 on 2018/4/16 15:55
 * 邮箱：344951059@qq.com
 */

public class SettingsDao {

    public static long insertSettings(Settings settings) {
        return getDaoInstant().getSettingsDao().insertOrReplace(settings);
    }

    public static void deleteSettings(long id) {
        getDaoInstant().getSettingsDao().deleteByKey(id);
    }

    public static void updateSettings(Settings settings) {
        getDaoInstant().getSettingsDao().update(settings);
    }

    public static List<Settings> queryAll() {
        return getDaoInstant().getSettingsDao().loadAll();
    }
}
