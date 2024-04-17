package com.shblog.web.board.service;

import java.util.List;
import java.util.Map;

import com.shblog.common.Pagination;
import com.shblog.common.Search;
import com.shblog.web.board.model.BoardVO;
import com.shblog.web.board.model.ReplyVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList(Search search) throws Exception;
	
	//�� �Խñ� ���� Ȯ��
	public int getBoardListCnt(Search search) throws Exception;
	
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	public BoardVO getBoardContent(int bid) throws Exception;
	
	public void updateBoard(BoardVO boardVO) throws Exception;
	
	public void deleteBoard(int bid) throws Exception;
	
	// ��� ����Ʈ	
	public List<ReplyVO> getReplyList(int bid) throws Exception;		
	
	public int saveReply(ReplyVO replyVO) throws Exception;		
	
	public int updateReply(ReplyVO replyVO) throws Exception;		
	
	public int deleteReply(int rid) throws Exception;
}
