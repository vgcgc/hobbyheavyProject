# 🧩 HobbyHeavy Project

---

## 🔍 프로젝트 개요
HobbyHeavy는 다양한 취미를 가진 사람들이 모여 서로의 취미를 공유하고, 같은 관심사를 가진 사람들과 소통할 수 있는 플랫폼입니다.
사용자 인증을 통해 보안이 강화된 환경에서 서비스 회원가입, 로그인, 회원정보 변경 및 탈퇴 등 기본 회원서비스를 제공하고, 모임 생성, 참가 신청, 모임 일정 및 투표, 후기와 알림서비스 기능을 제공합니다.

---

## 📱 와이어 프레임
![Frame 1](https://github.com/user-attachments/assets/daf19b09-5047-4995-98d8-b6da094ba42b)

---

## 📑 주요 기능

---

### 👥 1. 사용자 인증 및 회원 서비스
- **회원가입 및 로그인**:
    - 사용자는 아이디와 비밀번호를 사용하여 계정을 생성하고 로그인할 수 있습니다.
    - 회원가입시 유효성 검사 및 비밀번호는 암호화 처리 됩니다. 또한 회원가입 일자가 자동으로 기록됩니다.
    - 회원가입시 취미를 등록할수 있으며, 이후에 회원정보 변경 기능에서 수정이 가능합니다.
    - 로그인 시 `Access Token`과 `Refresh Token`이 발급됩니다.

- **회원 서비스**:
    - 비밀번호 변경 기능을 제공합니다.
    - 회원정보 변경 기능에서는 회원의 이름과, 알림 구독 설정 및 취미를 수정합니다. 또한 수정일자가 자동으로 기록됩니다.
    - 로그인한 회원의 회원탈퇴 기능을 제공합니다. 회원이 탈퇴한 일자가 자동으로 기록됩니다.
    - 로그인한 회원의 회원정보 조회 기능을 제공합니다.

- **JWT 인증 (Access Token & Refresh Token)**:
    - **Access Token**: 짧은 유효 기간을 가지며, 사용자 요청을 인증하는 데 사용됩니다.
    - **Refresh Token**: 유효 기간이 더 길며, Access Token이 만료되었을 때 새로운 토큰을 발급받기 위해 사용됩니다.
    - 토큰은 서버 측에서 사용자 정보나 권한을 확인하는 데 사용되며, 만료된 Access Token을 Refresh Token으로 갱신합니다.

- **권한 관리 및 인가 경로**:
    - 모든 API 요청은 JWT 토큰을 통해 인증되어야 합니다
    - `/user/**` 경로는 로그인을 정상적으로 완료하고, JWT 인증을 받은 사용자만 접근할 수 있습니다.
    - `/admin/**` 경로는 관리자 권한이 있는 사용자만 접근할 수 있습니다.

---

### 👫 2. 모임 서비스
- **모임 리스트 조회**:
    - 모임 리스트 조회 기능을 통해 등록된 모든 취미글을 조회합니다.
    - (모임 이름, 모임 장소, 취미)
 
- **모임 생성**:
    - 모임장이 새로운 취미글을 작성 및 생성합니다.
    - (필요한 정보: 모임 이름, 제목, 모임 장소, 인원 제한 등)

- **모임 수정**:
    - 모임장이 작성한 취미글을 수정합니다.
    - (모임 이름, 모임 설명, 모임 위치, 모임 반복 규칙, 인원 제한을 수정합니다.)
 
- **모임 삭제**:
    - 모임장이 작성한 취미글을 삭제합니다.
 
- **모임 상세페이지**:
    - 특정 모임글의 상세 정보를 조회합니다.
    - (모임 이름, 모임 설명, 모임장, 모임 반복 규칙, 인원 제한, 참가자, 생성 일자, 수정 일자 등 조회 가능)
 
- **모임 검색 - 취미**:
    - 조건에 맞는 취미글을 검색합니다.
 
- **나의 모임**:
    - 로그인한 회원이 작성한 게시글 목록을 조회합니다.

---

### 🙋🏻 3. 참가자 서비스
- **모임 참가 신청**:
    - 모임에 참가 신청합니다.

- **모임 참가 리스트**:
    - 모임의 대기중인 회원을 조회합니다.
    - (참가 대기자 이름, 성별, 나이가 조회됩니다.)
 
- **모임 승인 및 거절**:
    - 대기중인 회원 중 승인/거절을 합니다.

---

### 👩🏻‍💻 4. 댓글 서비스
- **모임별 댓글 조회**:
    - 특정 모임글의 댓글을 조회합니다.
 
- **댓글 생성**:
    - 댓글을 생성 및 작성합니다.
 
- **댓글 수정**:
    - 댓글을 작성한 작성자가 댓글을 수정합니다.
 
- **댓글 삭제**:
    - 댓글을 삭제합니다.

---

### ⏰ 5. 모임 일정 서비스
- **스케줄 생성**:
    - 모임 일정(스케줄)을 생성합니다.
    - (모임 날짜, 소요시간, 투표기한, 장소를 설정합니다.)
 
- **특정 스케줄 조회**:
    - 특정 모임 일정(스케줄)을 조회합니다.
 
- **스케줄 목록 조회**:
    - 모임 일정(스케줄) 목록을 조회합니다.
 
- **스케줄 수정**:
    - 모임 일정(스케줄)을 수정합니다.
    - (모임 날짜, 장소를 수정합니다.)
 
- **스케줄 삭제**:
    - 모임 일정(스케줄)을 삭제합니다.
 
- **스케줄 투표**:
    - 모임 일정(스케줄)을 투표합니다.
 
- **스케줄 확정**:
    - 투표된 모임 일정(스케줄)을 확정합니다.
 
- **스케줄 취소**:
    - 모임 일정(스케줄)을 취소합니다.
 
---

## ⚙️ 시스템 설계

### 1. **전체 아키텍처**

HobbyHeavy 는 Layered Architecture(계층형 아키텍처)를 따르며, 각 계층은 독립적으로 동작하여 유지보수와 확장이 용이하게 설계되었습니다.

### 2. **주요 모듈 설명**

#### 2.1 Auth
- **역할**: 인증 및 권한 관리를 담당하는 클래스들을 포함하고 있습니다. 사용자 정보를 기반으로 Spring Security에서 인증 및 권한 부여를 처리하는 데 사용됩니다.
- **주요 기능**:
    - 사용자에게 부여된 역할을 Spring Security가 처리할 수 있는 형태(GrantedAuthority)로 변환 처리
    - 사용자 인증 후 사용자 비밀번호와 ID를 반환

#### 2.2 Config
- **역할**: 프로젝트 전반의 설정과 관련된 클래스들을 포함하며, 애플리케이션의 동작 방식과 보안 정책을 정의하는 핵심적인 역할을 합니다.
- **주요 기능**:
    - Spring Security를 활용한 인증 및 권한 부여 설정을 정의
    - CORS 설정: 특정 출처에서의 요청을 허용하며, 모든 HTTP 메서드와 헤더를 지원
	  - CSRF 비활성화: CSRF 보호를 비활성화하여 REST API에 적합한 보안 환경을 제공
	  - JWT 기반 인증: Stateless 인증 방식을 사용하여 세션을 생성하지 않고 JWT로 인증을 처리
    - Swagger UI를 통해 API 문서를 자동 생성하고, JWT 인증을 통합
    - SecurityConfig는 보안 설정을 담당하며, 프로젝트의 인증 및 권한 정책을 Spring Security와 통합
    - SwaggerConfig API 문서화

#### 2.3 Controller Layer
- **역할**: 사용자로부터 들어오는 요청을 처리하고, 요청에 따라 적절한 서비스를 호출합니다.
- **주요 기능**:
    - 게시물 CRUD(Create, Read, Update, Delete) 관련 요청 처리
    - 사용자 인증 및 권한 검증 처리

#### 2.4 Service Layer
- **역할**: 비즈니스 로직을 처리하며, 데이터 흐름을 관리합니다.
- **주요 기능**:
    - 비즈니스 로직 처리
    - 사용자의 권한 및 인증 상태 검증
    - 데이터 유효성 검사

#### 2.5 Repository Layer
- **역할**: 데이터베이스와 상호작용하며, 데이터를 영속성 있게 저장하고 조회합니다.
- **주요 기능**:
    - 저장, 수정, 논리적 삭제, 조회 기능 처리
    - 사용자 데이터 저장 및 인증 정보 확인

#### 2.6 DTO (Request, Response)
- **역할**: 각 계층 간 데이터를 전달하기 위한 객체입니다.
- **주요 기능**:
    - 입력 및 출력 데이터의 구조를 정의하며, 계층 간 데이터 이동을 효율적으로 처리합니다.

#### 2.7 Entity
- **역할**: 데이터베이스의 테이블과 매핑되는 객체로, 데이터베이스의 스키마를 정의합니다.
- **주요 기능**:
    - 베이스 엔티티: 기본적인 정보 생성일자, 수정일자, 삭제일자, 삭제여부, 논리적 삭제 메서드 등의 정보를 포함합니다.
    - 댓글 엔티티: 댓글ID, 사용자, 모임, 댓글 내용 정보를 포함합니다.
    - 취미 엔티티: 취미ID, 취미명, 실/내외 정보, 카테고리 정보를 포함합니다.
    - 모임 엔티티: 모임ID, 취미, 모임장, 모임이름, 설명, 장소, 반복규칙, 인원제한, 썸네일 등의 정보를 포함합니다.
    - 알림 엔티티: 알림ID, 모임, 사용자, 알림 유형 및 메세지 내용, 알림 읽음 여부 등의 정보를 포함합니다.
    - 참가자 엔티티: 참가자ID, 모임, 사용자, 참가상태 등의 정보를 포함합니다.
    - 리프레시 엔티티: JWT 리프레시 토큰의 정보를 포함합니다.
    - 후기 엔티티: 후기ID, 스케줄, 별점, 내용 등의 정보를 포함합니다.
    - 스케줄 엔티티: 스케줄ID, 제안된 날짜 및 시간, 모임 활동 시간, 일정 상태, 투표한 사용자 목록, 모임 주소 등을 포함합니다.
    - 유저 엔티티: 사용자 아이디, 이름, 비밀번호, 이메일, 성별, 나이, 취미, 알림여부, 권한 정보 등을 포함합니다.

#### 2.8 Exception
- **역할**: 프로젝트 전반에서 발생하는 예외를 일관되게 처리하여 코드의 유지보수성을 높이고,
  각 예외 상황에 적합한 HTTP 상태 코드를 설정하여 클라이언트와 서버 간의 명확한 커뮤니케이션을 지원하며, 예외 발생 시 로그를 남겨 디버깅과 문제 해결을 용이하게 합니다.
- **주요 기능**:
    - CustomException:
      - 사용자 정의 예외 처리
	  -	ExceptionCode와 연계하여 예외 메시지와 HTTP 상태 코드를 관리
	  -	예외의 원인(스택 트레이스)을 추가로 포함 가능

    - ExceptionCode:
      - 프로젝트 전반에서 사용할 표준화된 예외 코드를 정의
      - 각 예외에 대해 HTTP 상태 코드와 메시지 매핑

    - GlobalExceptionHandler:
      - 전역적으로 예외를 처리하여 클라이언트에 일관된 응답을 제공
      - 다양한 예외 유형에 따라 적절한 HTTP 응답을 반환
 
#### 2.9 JWT
- **역할**: 인증 및 권한 부여와 관련된 작업을 처리하기 위해 설계
- **주요 기능**:
    - 하루에 한 번 (자정) 만료된 리프레시 토큰을 정리
    - 요청의 Access 토큰 유효성을 검사하며, Refresh 토큰을 통해 Access 토큰을 재발급
    - 로그아웃 요청 시 리프레시 토큰을 무효화
    - 사용자 로그인 요청 처리 및 JWT 발급
    - JWT 생성, 유효성 검증, 정보 추출 등 JWT 관련 모든 처리

#### 2.10 Type
- **역할**: 프로젝트에서 사용되는 열거형(enum)을 모아놓은 패키지로, 각종 상태, 역할, 메시지 템플릿 등을 관리
- **주요 기능**:
    - 상태값 정의: 다양한 상태나 역할을 명확히 정의하여 코드에서 오타나 잘못된 값 사용을 방지
    - 역할 및 권한 관리: 사용자 또는 참가자의 역할과 권한을 구체적으로 정의
    - 알림 메시지 템플릿 제공: 반복적으로 사용되는 알림 메시지를 템플릿 형태로 관리하여 동적으로 메시지를 생성
    - 알림 이벤트 분류: 알림 유형을 정의하여 시스템에서 발생하는 이벤트를 쉽게 구분하고 관리

#### 2.11 Util
- **역할**: 프로젝트에서 재사용성이 높은 유틸리티 클래스를 모아놓은 패키지입니다.
  일반적으로 특정 도메인에 국한되지 않는 공통 기능이나 보조 로직을 구현하며, 여러 클래스에서 활용될 수 있는 기능을 제공합니다.
- **주요 기능**:
    - CookieUtil: HTTP 쿠키와 관련된 작업을 수행하는 유틸리티
    - DurationParserUtil: 문자열로 표현된 기간(예: “2일 3시간 15분”)을 Duration 객체로 변환
    - ImageUtil: 이미지 업로드 및 저장을 처리하는 유틸리티
    - ScheduleUtil: 스케줄과 관련된 검증 및 계산 작업을 처리

### 3. **보안 설계**
- **JWT (JSON Web Token)**:
    - 사용자는 로그인 시 `Access Token`과 `Refresh Token`을 발급받으며, Access Token은 짧은 만료 시간을, Refresh Token은 더 긴 만료 시간을 가집니다.
    - Access Token이 만료되면 Refresh Token을 통해 새로운 Access Token을 발급받을 수 있습니다.

- **비밀번호 암호화**:
    - 사용자 비밀번호는 안전하게 암호화되어 저장되며, 복호화되지 않습니다.
 
- **권한 부여**:
    - 사용자가 접근할 수 있는 리소스를 제한

- **로깅 및 모니터링**:
    - 시스템의 보안 상태를 실시간으로 모니터링하고, 문제 발생 시 신속히 대응할 수 있는 기반을 마련합니다.

---

## 🗺️ ERD
![hobbyheavy (1) (1)](https://github.com/user-attachments/assets/ce2f6f68-c674-4591-b138-799c7b1a4494)

---

## 🛠️ 기술 스택

- **백엔드**: Java, Spring Boot
- **데이터베이스**: MySQL
- **인증 및 보안**: JWT (JSON Web Token), Spring Security
- **알림 서비스**: 이메일 전송(SendGrid)
- **빌드 도구**: gradle
- **버전 관리**: Git
- **API 문서화**: Swagger

---