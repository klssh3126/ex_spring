<h1> ex_spring </h1>
[코드로 배우는 스프링부트 웹 프로젝트 - 남가람북스] </br></br>
도서를 공부하며 코드를 직접 따라치고, 배운내용들을 간략히 정리하는 저장소입니다. </br>
작은 단위 프로젝트(ex..)들로 구성되어 있으며, 공부한 지식과 실습시 마주했던 에러들과 이를 해결한 방법을 기록하였습니다.</br>

## ex1
  스프링부트로 간단한 컨트롤러 실습, GetMapping("/hello")로 Hello 출력하기 </br></br>


## ex2

  마리아 DB 설치, DB계정 설정, 이클립스와 DB 연동</br>
  JPA 소개, 엔티티 클래스와 JpaRepository 작성</br>
  JPA와 JUnut 테스트를 통해, 등록/조회/수정/삭제 간단 실습 </br>
  페이징/ 정렬 처리, 쿼리 메서드(Query Methods) 기능과 @Query 실습</br>


 <details>
<summary> 
  <h4> lombok라이브러리의 JUnit 테스트코드 인식 문제발생 및 해결 </h4>
 </summary>
<div markdown="1">

 lombok 라이브러리가 JUnit 테스트코드에서 인식이 안되어 에러가 떴다. 스프링부트 시작할 때, lombok을 체크했다고 lombok을 사용할 수 있는게 아니었다.
  
  <h4>해결</h4>
 STS4와 lombok.jar 파일을 직접 다운받고, 콘솔창에서 직접 실행한 뒤, STS4와 이클립스IDE 경로를 추가해주어 해결하였다.
</div>
</details>
  
  
## ex3

  Thymeleaf를 이용한 반복문, 제어문, 삼항연산자 </br>
  th:inline, th:block, th:href 링크처리 </br>
  Thymeleaf의 fragment를 이용한 레이아웃 기능 </br>
  th:insert, th:replace, 파라미터 방식의 처리 </br>
  레이아웃 템플릿 만들기 </br>
  부트스트랩 레이아웃 템플릿 적용 실습</br></br>
  
  
  <details>
<summary> 
  <h4>부트스트랩 적용 결과</h4>
 </summary>
<div markdown="1">
  ![bootstrap](https://user-images.githubusercontent.com/35258559/201243210-693f5c37-da18-466b-9d90-ca33cdabf33e.png)
</div>
</details>
  
<details>
<summary> 
  <h4> HTML,타임리프 주석 문제발생 및 해결 </h4>
 </summary>
<div markdown="1">

  HTML과 타임리프의 파서가 들어있는 코드를 HTML의 주석처리 기법인 < !-- -- > 형식으로 코드를 묶었다.</br> 
  그랬더니, 타임리프의 파서 부분 [[${ data }]] 부분에서 오류가 발생했다.
  분명히 HTML 주석내에 있는 코드였다. 국비학원 수업때, 강사님께서 타임리프 주석은 다르다는걸 말씀했던게 불현듯 생각이 나서, 내용을 찾았다.

  <h4>해결</h4>
  타임리프 주석 형식은 < !--/*   */-- > 형태이다. 주석을 다시 고쳐쓰고, 경로를 호출해보니, 이번에는 정상적으로 데이터가 브라우저 화면에 출력이 되었다.
</div>
</details>
  
