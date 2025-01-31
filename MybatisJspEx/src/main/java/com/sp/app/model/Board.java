package com.sp.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // 인자가 없는 생성자
@AllArgsConstructor // 모든걸 인자로 갖는 생성자(test 진행할때는 인자가 있는 생성자 필요)
public class Board {
	private long num;
	private String name;
	private String pwd;
	private String subject;
	private String content;
	private String ipAddr;
	private String reg_date;
	private int hitCount;
}
