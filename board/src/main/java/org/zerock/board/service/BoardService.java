package org.zerock.board.service;

import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.dto.PageResultDTO;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Member;

public interface BoardService {
	
	Long register (BoardDTO dto);
	
	PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO);// 목록처리
	
	void removeWithReplies(Long bno); //삭제기능
	
	default Board dtoToEntity(BoardDTO dto) {
		Member member = Member.builder().email(dto.getWriterEmail()).build();
		Board board = Board.builder()
				.bno(dto.getBno())
				.title(dto.getTitle())
				.content(dto.getContent())
				.writer(member)
				.build();
		return board;
	}
	
	default BoardDTO entityToDTO(Board board, Member member, Long replyCount) {
		
		BoardDTO boardDTO = BoardDTO.builder()
				.bno(board.getBno())
				.title(board.getTitle())
				.content(board.getContent())
				.regDate(board.getRegDate())
				.modDate(board.getModDate())
				.writerEmail(member.getEmail())
				.replyCount(replyCount.intValue())
				.build();
		return boardDTO;
	}
	
	BoardDTO get(Long bno);
	
	void modify(BoardDTO boardDTO);
}
