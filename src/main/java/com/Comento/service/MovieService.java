package com.Comento.service;
import java.util.List;
import com.Comento.vo.MovieVO;
 
public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}