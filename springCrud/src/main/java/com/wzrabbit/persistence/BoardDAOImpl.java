package com.wzrabbit.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wzrabbit.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;
	
	public static String namespace = "com.wzrabbit.mapper.BoardMapper";

	@Override
	public void create(BoardVO data) throws Exception {
		session.insert(namespace + ".create", data);
	}

	@Override
	public BoardVO read(Integer id) throws Exception {
		return session.selectOne(namespace + ".read", id);
	}

	@Override
	public void update(BoardVO data) throws Exception {
		session.update(namespace + ".update", data);
	}

	@Override
	public void delete(Integer id) throws Exception {
		session.delete(namespace + ".delete", id);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

}
