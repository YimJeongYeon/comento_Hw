package com.devfun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    @Autowired
    private StatisticMapper uMapper;
    
    //년도별 로그인수 
    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    //월별 로그인수
    @Override
    public HashMap<String, Object> yearMonthloginNum (String yearMonth) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearMonthLogin(yearMonth);
            retVal.put("month", yearMonth);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("month", yearMonth);
            retVal.put("is_success", false);
        }
        return retVal;
    }
    
    //날짜별 로그인수
    @Override
    public HashMap<String, Object> yearMonthDayloginNum (String yearMonthDay) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearMonthDayLogin(yearMonthDay);
            retVal.put("yearMonthday", yearMonthDay);
            retVal.put("is_success", true);
            
        }
        catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("day", yearMonthDay);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    // 월기준 평균 하루로그인수
    @Override
	public HashMap<String, Object> yearMonthAverageloginNum(String yearMonth) {
		// TODO Auto-generated method stub
    	HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearMonthAverageLogin(yearMonth);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", true);
            System.out.println(yearMonth);
        }
        catch(Exception e) {
            retVal.put("averageCnt", -999);
            retVal.put("yearMonth", yearMonth);
            retVal.put("is_success", false);
        }
        return retVal;
	}
    
    //휴일을 제외한 월별 로그인수 
	@Override
	public HashMap<String, Object> exceptHolidaymonthloginNum(String yearMonth) {
		// TODO Auto-generated method stub
		 HashMap<String, Object> retVal = new HashMap<String,Object>();
	        
	        try {
	            retVal = uMapper.selectexceptHolidaymonthLogin(yearMonth);
	            retVal.put("yearMonth", yearMonth);
	            retVal.put("is_success", true);
	            System.out.println(yearMonth);
	        }
	        catch(Exception e) {
	            retVal.put("totCnt", -999);
	            retVal.put("yearMonth", yearMonth);
	            retVal.put("is_success", false);
	        }
	        return retVal;
		
	}
	
	//부서별 월별 로그인수 
	@Override
    public HashMap<String, Object> yearMonthDepartmentloginNum (String yearMonth,String department) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearMonthDepartmentLogin(yearMonth,department);
            retVal.put("yearMonth", yearMonth);
            retVal.put("department", department);
            retVal.put("is_success", true);
            
        }
        catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("yearMonth", yearMonth);
            retVal.put("department", department);
            retVal.put("is_success", false);
        }
        return retVal;
    }
	

}