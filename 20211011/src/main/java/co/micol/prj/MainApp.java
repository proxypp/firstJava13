package co.micol.prj;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.command.BoardList;
import co.micol.prj.board.service.command.BoardSelect;
import co.micol.prj.board.service.command.Command;
import co.micol.prj.comm.BoardMenu;

public class MainApp { // 7번째
	public static void main(String[] args) {
		//게시판 프로젝트 1. VO 객체 생성 dao 생성. 2.interface 생성 3. interface 구현제 생성.
		//1.db.properties 2. dataSource 3. boardVO 4. BoardService 5. BoardServiceImpl
		//6.BoardListCommand 7. MainApp 8. Command (interface) 후implements BoardService 9. boardSelect  후 메인앱 변경
        //10.BoardMenu 후 MainApp 바꿈
//		BoardListCommand blist = new BoardListCommand();
//		blist.execute();
//		Command command = new BoardSelect();
//		command.execute();
		
		BoardMenu boardMenu = new BoardMenu();
		boardMenu.run();
		
		
	}
}
