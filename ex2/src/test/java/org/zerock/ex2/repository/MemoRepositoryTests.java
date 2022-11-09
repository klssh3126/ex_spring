package org.zerock.ex2.repository;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.zerock.ex2.entity.Memo;

@SpringBootTest
public class MemoRepositoryTests {

	@Autowired
	MemoRepository memoRepository;

	// @Test
	public void testClass() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(memoRepository.getClass().getName());
	}

	// @Test
	public void testInsertDummies() {
		IntStream.rangeClosed(1, 100).forEach(i -> {
			Memo memo = Memo.builder().memoText("Sample...." + i).build();
			memoRepository.save(memo);
		});
	}

	//@Transactional
	//@Test
	public void testSelect() {
		// 데이터베이스에 조재하는 mno
		Long mno = 100L;
		Memo memo = memoRepository.getOne(mno+100);
		System.out.println("===========@@===============");
		System.out.println(memo);
	}
	
	//@Test
	public void testUpdate() {
		Memo memo = Memo.builder().mno(701L).memoText("Update Text").build();
		System.out.println(memoRepository.save(memo));
	}
	
	//@Test
	public void testDelete() {
		Long mno=100L;
		memoRepository.deleteById(mno);
	}
	
	@Test
	public void testPageDefault() {
		Pageable pageable = PageRequest.of(0, 10);
		Page<Memo> result = memoRepository.
		findAll(pageable);
		System.out.println(result);
	}
}
