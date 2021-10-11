package co.micol.prj.board.service.command;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.serviceImpl.BoardSerivceImpl;
import co.micol.prj.mybatis.BoardMybatisService;

public interface Command { // 8번째
//	public BoardService dao = new BoardSerivceImpl();
	public BoardService dao = new BoardMybatisService();
	public void execute();
}
