package com.devfun.settingweb_boot.service;
 
import java.util.HashMap;
import java.util.Map;
 
public interface StatisticService {
    public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String, Object> yearMonthloginNum(String yearMonth);
    public HashMap<String, Object> yearMonthDayloginNum(String yearMonthDay);
    public HashMap<String, Object> yearMonthDepartmentloginNum(String yearMonth,String department);
	public HashMap<String, Object> yearMonthAverageloginNum(String yearMonth);
	public HashMap<String, Object> exceptHolidaymonthloginNum(String yearMonth);
}
