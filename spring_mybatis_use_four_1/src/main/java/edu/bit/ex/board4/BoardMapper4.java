package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.bit.ex.vo.BoardVO;

@Mapper
public interface BoardMapper4 {
	List<BoardVO> selectBoardList();

	@Select("select*from mvc_board where bId = #{bId}")
	BoardVO read(int bno);
}
