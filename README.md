<h1> ex_spring </h1>
[코드로 배우는 스프링부트 웹 프로젝트 - 남가람북스] 공부 기록

## ex1
  스프링부트로 간단한 컨트롤러 실습, GetMapping("/hello")로 Hello 출력하기 </br></br>


## ex2
  마리아 DB 설치, DB계정 설정 </br> 
  JPA 소개, 엔티티 클래스와 JpaRepository 작성 </br> 
  JPA와 JUnut 테스트를 통해, 등록/조회/수정/삭제 간단 실습</br>
  페이징/ 정렬 처리, 쿼리 메서드(Query Methods) 기능과 @Query 실습</br></br>
  
####  에러1 발생</br>
<p>lombok 라이브러리가 Junit 테스트코드에서 인식이 안되어 에러가 떴다. 스프링부트 시작할 때, lombok을 체크했다고 lombok을 사용할 수 있는게 아니었다.</p>
####  에러1 해결</br>
<p>STS4와 lombok.jar 파일을 직접 다운받고, 콘솔창에서 직접 실행한 뒤, STS4와 이클립스IDE 경로를 추가해주어 해결하였다.<p>
