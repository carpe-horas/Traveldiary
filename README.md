# 1. 프로젝트명 
- Travel Diary

---
<br/>

## 2. 프로젝트 소개
- 팀 프로젝트
- 팀원: 김강희, 배정현, 백송이, 설선우, 장병용, 최민석
- 개발 기간 : 2024. 05. 30. ~ 07. 02.
- Travel Diary는 여행 중 유저가 챗봇과의 질답을 통해 LLM모델이 여행 기록 기반의 여행일기를 작성해주는 앱 서비스로, 작성된 여행 일기를 유저들간 공유하고 피드백을 주고 받을 수 있도록 SNS 기능을 추가하여 개발했습니다. 

---
<br/>

## 3. 구현 기능

### 회원가입 및 로그인
- JWT 이용
- 소셜로그인(구글, 카카오, 네이버) 구현

### 일기쓰기
1. LLM 활용 일기작성
- 챗봇의 질문에 사용자 답변을 토대로 자동 여행일기 생성
- 일기 생성 후 수정페이지로 이동

2. 직접 일기쓰기
- 일기 작성, 수정, 삭제, 공개 설정 기능
- 텍스트 에디터 활용
- 사진 첨부 기능

### 앨범
- 앨범 생성, 삭제, 이름변경
- 작성된 일기를 원하는 앨범으로 이동
- 작성된 일기 수정, 삭제

### 피드
- 공개 설정된 일기만 피드로 자동 공유
- 최신순/인기순 필터 기능
- 다른 사용자들의 기록 열람
- 좋아요, 댓글/대댓글, 신고하기 기능

### 지도
- 사용자가 직접 마커 표시
- 표시된 마커의 순서대로 여행경로 생성, 저장
- 날짜별로 저장된 여행경로 확인

### 마이페이지
- 프로필 변경 : 프로필이미지, 닉네임, 한줄 소개 변경, 회원탈퇴
- 알림 설정 : 다이어리 작성, 댓글, 좋아요 알림
- FAQ
- 관리자 문의 : 메일 발송

---
<br/>

## 4. 사용 기술 및 개발환경

- **Frontend** : React Native 0.74.2
- **Backend** : Spring Boot 3.3.0
- **Database** :Amazon RDS for MySQL
- **DevOps** : AWS EC2(Docker), S3
- **Tools** : GitHub, PostMan, Workbench, Notion


---


