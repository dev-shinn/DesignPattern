커맨드 객체
 - 특정 객체에 관한 특정 작업요청을 캡슐화
 
 커맨드 패턴
 - 요청 내역을 객체로 캡슐화해서 객체를 서로 다른 요청 내역에 따라 매개변수화할 수 있다
 - 요청을 큐에 저장하거나 로그로 기록하거나 작업 취소 기능을 사용할 수 있다.

- 인보커 로딩
 - 클라이언트에서 커맨듣 객체 생성
 - setCommand()를 호출해서 인보커에 커맨드 객체를 저장
 - 나중에 클라이언트에서 인보커에게 그 명령을 실행하라고 요청
 
- 핵심정리
 - 커맨드 패턴을 사용하면 요청하는 객체와 요청을 수행하는 객체를 분리할 수 있다.
 - 분리하는 과정의 중심에는 커맨드 객체가 있으며, 이 객체가 행동이 들어있는 리시버를 캡슐화한다.
 - 인보커는 무언가 요청할 때 커맨드 객체의 execute() 메소드를 호출하면 됨.
   execute() 메소드는 리시버에 있는 행동을 호출한다.
 - 커맨드는 인보커를 매개변수화 할 수 있다 실행 중에 동적으로 매개변수화를 설정할 수도 있다.
 - execute() 메소드가 마지막으로 호출되기 전의 상태로 되돌리는 작업 취소 메소드를 구현하면
   커맨드 패턴으로 작업 취소 기능을 구현할 수도 있다.
 - 매크로 커맨드는 커맨드를 확장해서 여러 개의 커맨드를 한 번에 호출할 수 있게 해 주는 가장 간편한 방법.
   매크로 커맨드로도 작업 취소 기능을 구현할 수 있다.
 - 요청을 스스로 처리하는 '스마트'커맨드 객체를 사용하는 경우도 있다.
 - 커맨드 패턴을 활용해서 로그 및 트랜잭션 시스템을 구현할 수 있다.
 