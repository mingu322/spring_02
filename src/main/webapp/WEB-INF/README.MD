### 스프링 에러노트
 - 브라우저에서 404
   - .xml파일 이름이 틀렸을 때
     - Tomcat Localhost Log에 FileNotFoundException 발생
   - servlet-context.xml의 base-package 이름이 틀렸을 때
 - 400 Bad Request
   - 클라이언트에서 요청한 파라미터이름과 컨트롤러에서 받을 파라미터 이름이 다를 때
- 500 Internal Server Error
  - 주입관계가 제대로 설정되지 않는 경우
    - 클래스에 어노테이션을 제대로 작성하지 않는 경우 발생
    - UnsatisfiedDependencyException: Error creating bean with name 등의 메세지 확인

### 컨트롤러 리턴값이 "index" 라면
1. prefix + 리턴값 + suffix 형태로 만들어줌
2. /WEB-INF/views/index.jsp

### servlet-context.xml의 base-package
1. 프로젝트 실행시 지정한 패키지 이하의 모든 클래스를 스캔하며, @Controller,
   @Service, @Repository, @Component 어노테이션(Annotation)이 붙은 클래스들을 스프링빈으로 등록해줌
2. 스프링빈(Spring Bean):스프링에서 관리하는 객체로 프로젝트 실행시 객체를 1개만 갖는 싱글톤(Singletone) 형태로 생성됌

### 스프링 의존관계 주입(Dependency lnjection, DI)
1. 스프링에서 관리하는 객체(Controller, Service, Repository 클래스 등)가 가지고 있는 자원(
    메서드 등)을 호출하기 위해 해당 객체에 대한 사용을 할 수 있도록 하는 것
2. 주의사항
    2-1. 주입받으려는 클래스는 반드시 스프링빈(스프링..)
3. 주입 방식
    2-1. 필드 주입
    @Controller
    public class ExampleController {
    @Autowired
    private ExampleService exampleService;
    
    @GetMapping("/req1")
    public String req1(){
        // 서비스클래스의 method1을 호출해야함.
   } 
}

    @Service
    public class ExampleService {

     public void method1(){

     }
}

### 생성자 주입
@Controller
@RequiredArgsConstructor
    public class ExampleController {
    @Autowired
    private ExampleService exampleService;
    
@GetMapping("/req1")
    public String req1(){
        // 서비스클래스의 method1을 호출해야함.
}
}

@Service
public class ExampleService {

 public void method1(){

     }
}

-------------------------------------------------------------------------------------------------------------




### 20230830_스프링 시작
1. 프로젝트 만들기 연습
   - 프로젝트 이름 : spring_02
   - 기본패키지 : com.study.basic
   - 시작화면 : welcome.jsp
     - 안녕하세요~ 반갑습니다! 를 h1 태그로 출력
   - tomcat 포트 : 8090

 

### 프로젝트 만들기 연습
1. 프로젝트 이름: spring_03
    - 기본패키지: com.ex.demo
    - 시작화면: index.jsp
        - 안녕하세요 출력
        - demo1.jsp 화면으로 이동하는 링크 있음.
        - form 태그
            1. 두개의 입력창 있음
            2. 첫번째 입력값은 param1, 두번째 입력값은 param2에 담겨서 demo2 주소로 post 방식으로 전송됨
            3. 전송된 값은 컨트롤러에서 콘솔에 출력하고 demo2.jsp 화면으로 이동함
    - tomcat 포트: 8090