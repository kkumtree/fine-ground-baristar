package daoDemo.domain.userinfo.dao.oracle;

import daoDemo.domain.userinfo.UserInfo;
import daoDemo.domain.userinfo.dao.UserInfoDao;

public class UserinfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID = " + userInfo.getUserID());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("Update from Oracle DB userID = " + userInfo.getUserID());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("Delete from Oracle DB userID = " + userInfo.getUserID());
    }
}
