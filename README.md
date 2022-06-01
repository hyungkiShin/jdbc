### jdbc 이해
- https://www.h2database.com/html/main.html
- external libraries h2 버전과 동일한 버전을 다운 받아야 한다.
- 다운로드 받은 h2 폴더 > bin 에서 h2.sh 를 찾을수 있고, 아래와 같이 명령어 입력
  - chmod 755 h2.sh
  - ./h2.sh
  - jdbc:h2:~/test <- 입력후 바로 연결
  - 안되면 root 디렉토리 (맥북 기준 본인 계정 이름 하위 첫 디렉토리에)
    - touch test.mv.db <- 만들어 준 후 다시 접속.