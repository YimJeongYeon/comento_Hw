package com.Comento.dao;
import java.util.List;
import com.Comento.vo.MovieVO;
 
public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}