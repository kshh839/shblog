package com.shblog.web.board.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.shblog.web.board.dao.BoardDAO;
import com.shblog.web.board.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private BoardDAO boardDAO;

	public List<BoardVO> getBoardList() throws Exception {
		return boardDAO.getBoardList();
	}

	@Override	
	public void insertBoard(BoardVO boardVO) throws Exception {		
		boardDAO.insertBoard(boardVO);	
	}

}