package com.codeup.adlister.dao;

import com.codeup.adlister.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();
//    private static Users user = new Users();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
//            adsDao = new MySQLUsersDao(user);
        }
        return adsDao;
    }
}
