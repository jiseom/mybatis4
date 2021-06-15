package edu.bit.ex.board1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.BoardVO;

@Service
public class BService1 {
	@Autowired
	SqlSession sqlSession; //SqlSession -> 마이바티스
	
    public List<BoardVO> selectBoardList() throws Exception {
        IBDao dao = sqlSession.getMapper(IBDao.class);
       return dao.listDao();
     }
	
	
}
