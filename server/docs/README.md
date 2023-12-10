> 채팅 프로그램 핵심: 채팅방에서 텍스트 메시지를 다른 클라이언트와 주고 받을 수 있다.

## 기능 목록 작성

- [x] 사용자의 요청을 처리하는 컨트롤러
    - [x] sns 사용자 로그인 요청 - MemberController#snsSignUp()
    - [x] 사용자 친구 목록 요청 - MemberController#searchByFriends()
    - [x] 사용자 친구 추가 요청 - FriendController#addMemberOfFriends()
- [x] 채팅 요청을 처리하는 컨트롤러
    - [x] 새로운 채팅방 생성 - RoomController#createRoom()
    - [x] 전체 채팅방 목록 조회 - RoomController#getRooms()
    - [x] 특정 채팅방 조회 - RoomController#getRoom()
    - [x] 클라이언트 메시지 SEND COMMAND 전달 - StompChatController#clientEnter()
    - [x] 클라이언트 메시지 MESSAGE COMMAND 전달 - StompChatController#clientMessage()
- [x] 서버 환경 설정
    - [x] Web API 문서 Server, Contact, Info, License 정의 - SwaggerConfig#chatOpenApi()
    - [x] 웹 소켓 통신 경로 및 허용 endpoint 설정 - WebSocketConfig#registerWebSocketHandlers()
    - [x] 사용자 정의 소켓 핸들러 Spring 제공 웹 소켓 연결 설정 - WebSocketConfig#webSocketHandler()
    - [x] STOMP 소켓 통신 경로 및 허용 endpoint 설정 - StompWebSocketConfig#registerStompEndpoints()
    - [x] STOMP 게시/구독 처리 브로커 설정 - StompWebSocketConfig#configureMessageBroker()
- [x] 공통 상수
    - [x] HTTP 상태코드 래핑 상수 - ResponseType
- [x] 데이터 처리를 위한 서비스 로직
    - [x] 사용자 고유 키 값을 통해 친구 테이블 데이터 저장 - FriendService#saveFromMemberId()
    - [x] 사용자 고유 키 값과 친구 고유 키 값을 통해 데이터 저장 - FriendService#addFriendToMember()
    - [x] 사용자와 연결된 친구 목록을 조회 - MemberService#getMemberFriends()
    - [x] 사용자 정보를 저장 - MemberService#saveEntity()
    - [x] sns 토큰 정보 저장 - SnsInfoService#saveEntity()
- [x] 소켓 통신을 위한 핸들러
    - [x] 웹 소켓 세션을 통해 들어오는 메시지 내용 처리 - CustomSocketHandler#handleTextMessage()
    - [x] 클라이언트가 접속 시 호출되어 웹 소켓 세션 추가 - CustomSocketHandler#afterConnectionEstablished()
    - [x] 클라이언트가 접속 해제 시 호출되어 웹 소켓 세션 제거 - CustomSocketHandler#afterConnectionClosed()
- [x] 데이터 전달을 위한 DTO
    - [x] 채팅 메시지 정보 전달 - ChatMessageDTO
    - [x] 채팅방 정보 전달 - ChatRoomDTO
    - [x] 친구 정보 전달 - FriendDTO
    - [x] 친구 추가 정보 전달 - FriendAddDTO
    - [x] 사용자 정보 전달 - MemberDTO
