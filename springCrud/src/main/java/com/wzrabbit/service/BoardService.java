package com.wzrabbit.service;

import java.util.List;
import com.wzrabbit.domain.BoardVO;

public interface BoardService {
	
	public void write(BoardVO board) throws Exception;
	public BoardVO read(Integer id) throws Exception;
	public void modify(BoardVO board) throws Exception;
	public void remove(Integer id) throws Exception;
	public List<BoardVO> listAll() throws Exception;
	
}
