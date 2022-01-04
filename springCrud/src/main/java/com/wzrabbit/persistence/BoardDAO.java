package com.wzrabbit.persistence;

import java.util.List;
import com.wzrabbit.domain.BoardVO;

public interface BoardDAO {
	
	public void create(BoardVO data) throws Exception;
	public BoardVO read(Integer id) throws Exception;
	public void update(BoardVO data) throws Exception;
	public void delete(Integer id) throws Exception;
	public List<BoardVO> listAll() throws Exception;

}
