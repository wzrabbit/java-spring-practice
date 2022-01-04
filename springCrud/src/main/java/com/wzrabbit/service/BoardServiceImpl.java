package com.wzrabbit.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Repository;
import com.wzrabbit.domain.BoardVO;
import com.wzrabbit.persistence.BoardDAO;

@Repository
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;

	@Override
	public void write(BoardVO board) throws Exception {
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer id) throws Exception {
		return dao.read(id);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		dao.update(board);
	}

	@Override
	public void remove(Integer id) throws Exception {
		dao.delete(id);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}

}
