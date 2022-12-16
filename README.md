<h1> ex_spring </h1>
[코드로 배우는 스프링부트 웹 프로젝트 - 남가람북스] </br></br>
도서를 공부하며 코드를 직접 따라치고, 배운내용들을 간략히 정리했는 저장소입니다. </br>
작은 단위 프로젝트(ex..)들로 구성되어 있으며, 공부한 지식과 실습시 마주했던 에러들과 이를 해결한 방법을 기록하였습니다.</br>

## 프로젝트 목차 <!-- omit TOC -->

- [프로젝트 목차 ](#프로젝트-목차-)
- [ex1](#ex1)
- [ex2](#ex2)
- [ex3](#ex3)
- [guestbook 방명록](#guestbook-방명록)
- [board 프로젝트 (guestbook 방명록 프로젝트에서 회원, 게시판, 댓글 연관관계 추가 반영)](#board-프로젝트-guestbook-방명록-프로젝트에서-회원-게시판-댓글-연관관계-추가-반영)
- [mreview](#mreview)


>

## ex1
  스프링부트로 간단한 컨트롤러 실습, GetMapping("/hello")로 Hello 출력하기 </br></br>

<!-- ############################################################################################################################################### -->
## ex2

  마리아 DB 설치, DB계정 설정, 이클립스와 DB 연동</br>
  JPA 소개, 엔티티 클래스와 JpaRepository 작성</br>
  JPA와 JUnut 테스트를 통해, 등록/조회/수정/삭제 간단 실습 </br>
  페이징/ 정렬 처리, 쿼리 메서드(Query Methods) 기능과 @Query 실습</br>


 <details>
<summary> 
  lombok라이브러리의 JUnit 테스트코드 인식 문제발생 및 해결
 </summary>
<div markdown="1">

 lombok 라이브러리가 JUnit 테스트코드에서 인식이 안되어 에러가 떴다. 스프링부트 시작할 때, lombok을 체크했다고 lombok을 사용할 수 있는게 아니었다.
  
  <h4>해결</h4>
 STS4와 lombok.jar 파일을 직접 다운받고, 콘솔창에서 직접 실행한 뒤, STS4와 이클립스IDE 경로를 추가해주어 해결하였다.
</div>
</details>
   </br></br>
   
  <!-- ############################################################################################################################################### -->
## ex3

  Thymeleaf를 이용한 반복문, 제어문, 삼항연산자 </br>
  th:inline, th:block, th:href 링크처리 </br>
  Thymeleaf의 fragment를 이용한 레이아웃 기능 </br>
  th:insert, th:replace, th:(파라미터) 방식의 처리 </br>
  레이아웃 템플릿 만들기 </br>
  부트스트랩 레이아웃 템플릿 적용 실습</br></br>
  
  
  <details>
<summary> 
 부트스트랩 적용 결과
 </summary>
<div markdown="1">
  
  ![bootstrap](https://user-images.githubusercontent.com/35258559/201243210-693f5c37-da18-466b-9d90-ca33cdabf33e.png)
  
</div>
</details>
<details>
<summary> 
   HTML,타임리프 주석 문제발생 및 해결 
 </summary>
<div markdown="1">

  HTML과 타임리프의 파서가 들어있는 코드를 HTML의 주석처리 기법인 < !-- -- > 형식으로 코드를 묶었다.</br> 
  그랬더니, 타임리프의 파서 부분 [[${ data }]] 부분에서 오류가 발생했다.
  분명히 HTML 주석내에 있는 코드였다. 국비학원 수업때, 강사님께서 타임리프 주석은 다르다는걸 말씀했던게 불현듯 생각이 나서, 내용을 찾았다.

  해결
  타임리프 주석 형식은 < !--/*   */-- > 형태이다. 주석을 다시 고쳐쓰고, 경로를 호출해보니, 이번에는 정상적으로 데이터가 브라우저 화면에 출력이 되었다.
</div>
</details>
   </br></br>
   
  <!-- ############################################################################################################################################### -->
  ## guestbook 방명록 
  
  QueryDSL 설정, 방명록 프로젝트 명세 이해 </br>
  JPA로 방명록 엔티티 및 repository 작성 및 테스트코드 구현 (더미 데이터 등록, 내용 수정, 등록시간, 최종수정시간 업데이트) </br>
  QueryDSL을 사용하여 단일, 다중조건 검색테스트 실습 </br> 
  ex) 검색조건: 제목/ 제목 or 내용/ 제목 or 내용 or 작성자 </br>
  Controller, DTO, Entity, Repository, Service, ServiceImpl 구현 </br>
  dto <-> entity 변환 함수 작성 </br>
  ServiceImpl 클래스에서 Repository 객체를 생성하여 DB로부터 엔티티를 가져오거나 저장 </br>
  </br>
  목록, 페이징처리 구현 </br>
  게시글 (등록, 조회, 삭제, 수정) 구현 </br>
  QueryDSL을 사용하여 단일, 다중항목 검색 구현  </br>
  페이지(page, size) 정보 및 검색조건(type, keyword) 유지 </br>
 
 
<details>
  <summary> 
    결과 홈페이지 
   </summary>
<div markdown="1">
목록 페이지
  
 ![image](https://user-images.githubusercontent.com/35258559/202380387-6ed092ec-6f72-4f8c-9d7b-827faacb4703.png)

  <hr/>
  조회 페이지
  
  ![image](https://user-images.githubusercontent.com/35258559/202380588-b308ca5f-7ad9-4ef0-9634-5805d95db216.png)

  <hr/>
  수정 페이지
  
  ![image](https://user-images.githubusercontent.com/35258559/202380732-917c5da0-7dd7-4d74-bfe3-8b5ba69d9681.png)

</div>
</details>

  <details>
<summary> 
  QueryDSL 설치방법 및 Build.gradle, Q도메인 변환 
 </summary>
<div markdown="1">

 QueryDSL을 설치하기 위해서는 Build.gradle 파일에 특별한 코드를 추가해야 한다. (업로드 파일 참고) 이때, 이클립스와 IntelliJ의 코드는 다르다는걸 명심해야 한다. 이걸 모르고 구글의 IntelliJ 코드를 검색해서 계속 에러가 났다. 
 코드를 추가한 후, 프로젝트 우클릭, Gradle => refresh gradle project를 클릭해준다.

(1) 이클립스 상단 메뉴에서 window 클릭

(2) Show View -> other -> gradle 검색 -> Gradle Task 클릭

(3) Gradle Task에서 해당 프로젝트를 더블클릭 

(4) build 폴더로 가서 build를 선택 후 마우스 오른쪽 클릭

(5) Run Gradle Tasks를 클릭하면 src 밑에 generated 폴더가 생성된다.

프로젝트에 새로 생긴 generated의 경로를 추가해줘야 사용 가능

 (1) 프로젝트 우클릭 -> Properties ->Java build Path

 (2) Source 탭에서 Add Folder... 클릭

 (3) src 밑에 새로 생긴 generated폴더 체크 후 확인

 (4) apply 클릭 후 확인

 (5) 이제 src/main/java에서 src/main/generated를 접근해서 사용할 수 있다.

 (6) 만약 이클립스내에서 package 경로가 안맞을 경우, 해당 경로로 Q~.java 파일을 옮겨준다.

</div>
</details>
 </br></br>
 
<!-- ############################################################################################################################################### -->

## board 프로젝트 (guestbook 방명록 프로젝트에서 회원, 게시판, 댓글 연관관계 추가 반영)

 N:1(다대일) 연관관계</br>
 목록화면에서 게시글의 정보, 등록한 회원의 이메일, 해당 게시글에 달린 댓글의 수를 가져오기</br>
 회원, 게시글, 댓글 엔티티들의 PK,FK 관계를 분석후 @ManyToOne을 이용한 연관관계 설정</br>
 연관관계가 없는 상황에서 left (outer) join 처리 : JPQL의 조인을 이용</br>
 즉시(Eager) 로딩과 지연(Lazy) 로딩의 차이점</br>
 회원, 게시글, 댓글 더미데이터 등록, 수정, 삭제 구현 </br>
 JPQL의 결과로 나온 Object[]를 DTO타입으로 변환 </br>
 JPQL로 다중조건 검색기능 구현하기 </br>

 
 <br>
 댓글의 개수를 나타내는 버튼을 누르면 댓글의 목록이 펼쳐지는 기능 <br>
 댓글 (조회, 추가, 삭제, 수정) 기능을 모달창으로 선택<br>
 게시물의 조회화면(read.html)에서 Ajax를 통해 JSON포맷으로 서버와 데이터 교환<br>
 
 
 
## mreview 

M:N(다대다) 관계와 파일 업로드 처리</br>

- 한 편의 영화는 여러 회원의 리뷰가 달릴 수 있다.
- 한 회원은 여러 영화에 평점을 줄 수 있다.

영화와 회원 엔티티를 연결해줄 매핑 테이블로 "리뷰"를 설계한다.</br>

![image](https://user-images.githubusercontent.com/35258559/206617577-a911d902-97dd-43d1-9ca3-1baf94e71729.png)

- 목록 화면에서 영화의 제목과 이미지 하나, 영화 리뷰의 평점/리뷰 개수 출력</br>
- 영화 조회 화면에서 영화와 영화의 이미지들, 리뷰의 평균점수/리뷰 개수를 같이 출력</br>
- 리뷰에 대한 정보에는 회원의 이메일이나 닉네임과 같은 정보를 같이 출력</br>

N+1 문제 발생과 해결하기</br>
Review를 처리할 때, @EntityGraph를 적용해서 Member도 같이 로딩하기 <br>
회원 삭제시, 리뷰 테이블에서 리뷰 데이터를 먼저 삭제하고 회원을 삭제한다. 이를 하나의 트랜잭션 처리하기

# 지금은 시큐리티가 급해서 mreview는 442페이지 까지 끝냈고, 443 페이지 이후부터는 시큐리티 공부 끝내고 다시 이어서 하자. 국비 팀프로젝트에 시큐리티 적용하는게 지금 급하다.


## club1 (474페이지부터 공부~ 523페이지까지 공부함. 442페이지부터 돌아가서 공부하기)

스프링 시큐리티에서 제공하는 로그인 처리방식 이해
- SecurityConfig 클래스 작성
- 인증, 인가 개념 공부
- 권한(ROLE)과 접근제한(ACCESS CONTROL)
    - USER, MANAGER, ADMIN 으로 구분

JPA와 연동하는 커스텀 로그인 처리
- PasswordEncoder를 통한 패스워드 암호화(BCryptPasswordEncoder)
    - BCryptPasswordEncoder는 복호화가 불가능하고 매번 암호화된 값도 다름
- DB에 회원의 이메일, 패스워드, 이름, 소셜 가입여부, 등록일/수정일, 권한 저장  
CSRF 공격

Thymeleaf에서 로그인 정보 활용하기
- 권한이 다른 유저별로 보이는 페이지 내용이 다르게 처리

