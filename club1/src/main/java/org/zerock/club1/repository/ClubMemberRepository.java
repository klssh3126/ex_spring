package org.zerock.club1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.club1.entity.ClubMember;

public interface ClubMemberRepository extends JpaRepository<ClubMember,String>{

}
