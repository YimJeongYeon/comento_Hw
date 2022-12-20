package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
import com.devfun.settingweb_boot.dto.StatisticDto;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    public HashMap<String, Object> selectYearMonthLogin(String yearMonth);
    public HashMap<String, Object> selectYearMonthDayLogin(String yearMonthDay);
    public HashMap<String, Object> selectYearMonthDepartmentLogin(String yearMonth,String department);
	public HashMap<String, Object> selectYearMonthAverageLogin(String yearMonth);
	public HashMap<String, Object> selectexceptHolidaymonthLogin(String yearMonth);
}