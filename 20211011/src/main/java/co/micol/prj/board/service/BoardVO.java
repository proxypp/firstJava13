package co.micol.prj.board.service;

import java.sql.Date;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class BoardVO { //3.번째 생성 SQL의 칼럼명과 타입을 보고 만들어라.
	private int bId;
	private String bWriter;
	private Date bWriteDate;
	private String bTitle;
	private String bContents;
	private int bHit;
	

	
}
