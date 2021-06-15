package edu.bit.ex.board2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.bit.ex.board1.BService1;
import lombok.extern.log4j.Log4j;

/*
1.interface IBDao를  XML namespac에 매핑 <mapper namespace="edu.bit.ex.board1.IBDao"> 
2.sqlSession.getMapper(IBDao.class)를 이용.
* 
* 
* */


@Log4j
@Controller
public class BoardController2 {
	@Autowired
	BService2 bservice2;

	@RequestMapping("/list2")
	public String home(Model model) throws Exception {
		log.info("/list2");
		model.addAttribute("list",bservice2.selectBoardList());

		return "list";
	}

}
