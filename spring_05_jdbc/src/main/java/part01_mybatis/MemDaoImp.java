package part01_mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

public class MemDaoImp implements MemDAO{
	private SqlSessionTemplate sqlSession;
	
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession =sqlSession;
	}
	public MemDaoImp() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<MemDTO> list() {
		return sqlSession.selectList("mem.all");
	}

	@Override
	public void insertMethod(MemDTO dto) {
		sqlSession.insert("mem.ins", dto);
		
	}

	@Override
	public MemDTO updateMethod(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMethod(MemDTO dto) {
		sqlSession.update("mem.upt", dto);
		
	}

	@Override
	public void delectMethod(MemDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemDTO delectMethod(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemDTO one(int num) {
		return sqlSession.selectOne("mem.one", num);
	}

	@Override
	public int countMethon() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
