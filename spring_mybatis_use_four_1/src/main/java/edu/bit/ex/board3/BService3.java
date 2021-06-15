package edu.bit.ex.board3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.BoardVO;

/*

1.인터페이스 함수 위에 @을 붙이는 형식임 
2.XML이 필요없음, sqlSession개체 필요없음
3.root~.xml 에 
아래의 한줄을 추가
   <!--    Mapper Interface -->
   <mybatis-spring:scan base-package="edu.bit.mapper"/> 
4.단점: 쿼리가 길어지면 사용하기 힘듬
* 
* */



@Service
public class BService3 {
	
	@Autowired
	BoardMapper boardMapper;
	
    public List<BoardVO> selectBoardList()throws Exception {
        return boardMapper.selectBoardList();
      } 
    
	
}
