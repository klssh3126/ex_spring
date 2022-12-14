package org.zerock.board.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer")
public class Board extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bno;
	
	private String title;
	private String content;
	
	@ManyToOne (fetch = FetchType.LAZY)//명시적으로 Lazy 로딩 지정 
	private Member writer; //연관관계 지정

	
	public void changeTitle(String title) {
		this.title= title;
	}
	
	public void changeContent(String content) {
		this.content = content;
	}
}
