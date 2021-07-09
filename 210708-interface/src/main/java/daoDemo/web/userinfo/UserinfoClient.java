//파일의 상대경로 시작점은 프로젝트 디렉토리이다. 이걸로 헤멤...

package daoDemo.web.userinfo;

import daoDemo.domain.userinfo.UserInfo;
import daoDemo.domain.userinfo.dao.UserInfoDao;
import daoDemo.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import daoDemo.domain.userinfo.dao.oracle.UserinfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserinfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserID("kkumtree");
        userInfo.setPassword("486");
        userInfo.setUserName("Mint Choco");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        } else if (dbType.equals("ORACLE")) {
            userInfoDao = new UserinfoOracleDao();
        } else {
            System.out.println("db error");
            return ;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
