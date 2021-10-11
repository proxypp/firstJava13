package co.micol.prj.board.service.command;

import java.sql.Date;
import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;

public class BoardInsert implements Command {
	//dao 객체는 인터페이스에서 상속받아서 사용한다.
	private Scanner scb = new Scanner(System.in);
	
	@Override
	public void execute() {
		BoardVO vo = new BoardVO(); // 강제로 값을 집어넣었다.
		System.out.println("======================");
		System.out.println("작성자를 입력하세요? \n");
		
		vo.setBWriter(scb.nextLine());
		System.out.println("제목을 입력하세요? \n");
		vo.setBTitle(scb.nextLine());
		System.out.println("내용을 입력하세요? \n");
		vo.setBContents(scb.nextLine());
		System.out.println("제목을 입력하세요? \n");
			
		int n = dao.boardInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		}else {
			System.out.println("등록이 실패되었습니다.");
		}
		}

}
