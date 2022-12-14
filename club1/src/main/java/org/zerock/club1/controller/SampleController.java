package org.zerock.club1.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.club1.security.dto.ClubAuthMemberDTO;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/sample/")
public class SampleController {

	@GetMapping("/all")
	public void exAll() {
		log.info("exAll.......");
	}
	
	@GetMapping("/member")
	public void exMember(@AuthenticationPrincipal ClubAuthMemberDTO clubAuthMember) {
		
		log.info("exMember......");
		
		log.info("------------------------------");
		log.info(clubAuthMember);
				
	}
	
	@GetMapping("/admin")
	public void exAdmin() {
		log.info("exAdmin......");
	}
}
