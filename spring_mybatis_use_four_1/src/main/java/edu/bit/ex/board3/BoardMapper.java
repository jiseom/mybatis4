package edu.bit.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.bit.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
//셀렉트에서 에노테이션 지원합니다.
	@Select("select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc")
	   List<BoardVO> selectBoardList();   
}
