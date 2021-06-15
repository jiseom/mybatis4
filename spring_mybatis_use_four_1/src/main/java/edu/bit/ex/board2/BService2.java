package edu.bit.ex.board2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.BoardVO;


/*
1. interface는 필요가 없음  (자체에서 함수를 제공하기 때문에 )
2. sqlSession에서 제공하는 함수(selectList,selectOne)를 이용함
3. 쿼리구현을 위한 XML이 필요. 해당 XML의 namespace는  개발자가가 정함
* 
* */
@Service
public class BService2 {

	@Autowired
	SqlSession sqlSession;
	
    public List<BoardVO> selectBoardList()throws Exception {
        return sqlSession.selectList("board.selectBoardList");
      } //sql 내에서 selectList 라는 함수를 제공하고 있다.
    
	
	
}
