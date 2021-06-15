package edu.bit.ex.board4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.BoardVO;
/*
*
1.첫번째 방법과 같은 방식임. 대신 sqlSession.getMapper 함수를 사용하지 않음 
2.간단하고 심플함

3.root~.xml 에 
아래를 추가함
   <!--    Mapper Interface -->
   <mybatis-spring:scan base-package="edu.bit.mapper"/> 

3,4번은 마이바티스 객체를 끌고 오는 방식 x 
*/
@Service
public class BService4 {

	@Autowired
	BoardMapper4 boardMapper4;
	

    public List<BoardVO> selectBoardList()throws Exception {
        return boardMapper4.selectBoardList();
    }
	
}
