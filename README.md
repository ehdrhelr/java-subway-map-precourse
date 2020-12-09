

# 지하철 노선도 미션
- 지하철 역과 노선을 관리하는 지하철 노선도 기능을 구현한다.

<br>

## 🔧 구현할 기능 목록
1. 프로그램 시작 시 역, 노선 등 필요한 정보를 미리 셋팅한다.

    - 지하철 역으로 교대역, 강남역, 역삼역, 남부터미널역, 양재역, 양재시민의숲역, 매봉역을 등록한다.
    - 지하철 노선으로 2호선, 3호선, 신분당선을 등록한다.
    - 노선에 역을 아래와 같이 등록한다. (왼쪽 끝이 상행 종점)
        - 2호선 : 교대역 - 강남역 - 역삼역
        - 3호선 : 교대역 - 남부터미널역 - 양재역 - 매봉역
        - 신분당선 : 강남역 - 양재역 - 양재시민의숲
2. 메인화면을 구현하고 원하는 기능을 입력받는다.

        ## 메인 화면
        1. 역 관리
        2. 노선 관리
        3. 구간 관리
        4. 지하철 노선도 출력
        Q. 종료
        
        ## 원하는 기능을 선택하세요.
    
    #### 2-1. 역 관리
    - '1' 입력 시 역 관리 화면으로 이동하고 원하는 기능을 입력받는다.
    
            ## 역 관리 화면
            1. 역 등록
            2. 역 삭제
            3. 역 조회
            B. 돌아가기
                
            ## 원하는 기능을 선택하세요.             

    - '1' 입력 시 등록할 역을 입력받아 등록하고 안내문을 출력한 후, 메인 화면을 돌아간다. (등록된 역은 등록된 노선이 없는 상태다)
        
            ## 등록할 역 이름을 입력하세요.
            잠실역
        
            [INFO] 지하철 역이 등록되었습니다.
        - (예외) 등록할 역 이름이 이미 등록되어 있다면 안내문을 출력하고 다시 입력받는다.
        - (예외) 등록할 역 이름이 2 - 5자 사이를 벗어나면 안내문을 출력하고 다시 입력받는다.
        
    - '2' 입력 시 삭제할 역을 입력받아 삭제하고 안내문을 출력한 후, 메인 화면으로 돌아간다.
    
            ## 삭제할 역 이름을 입력하세요.
            잠실역
        
            [INFO] 지하철 역이 삭제되었습니다.
        - (예외) 삭제할 역 이름이 존재하지 않으면 안내문을 출력하고 다시 입력받는다.
        - (예외) 삭제할 역이 노선에 등록되어 있을 경우, 삭제할 수 없다는 안내문을 출력하고 다시 입력받는다.
    - '3' 입력 시 등록되어 있는 역 이름 목록을 출력한 후, 메인 화면으로 돌아간다.
            
            ## 역 목록
            [INFO] 교대역 
            [INFO] 강남역
            [INFO] 역삼역
            [INFO] 남부터미널역
            [INFO] 양재역
            [INFO] 양재시민의숲역
            [INFO] 매봉역
            
    #### 2-2. 노선 관리        
    - '2' 입력 시 노선 관리 화면으로 이동하고 원하는 기능을 입력받는다.
    
            ## 노선 관리 화면
            1. 노선 등록
            2. 노선 삭제
            3. 노선 조회
            B. 돌아가기            
        
            ## 원하는 기능을 선택하세요.        

    - '1' 입력 시 등록할 노선을 입력받는다.
        - 등록할 노선을 입력받은 후, 등록할 노선의 상행 종점역을 입력받는다.
        - 등록할 노선의 상행 종점역을 입력받은 후, 하행 종점역을 입력받는다.
        - 정상적으로 등록되었음을 알리는 안내문을 출력한 후, 메인 화면으로 돌아간다. 
        
                ## 등록할 노선 이름을 입력하세요.
                1호선
                
                ## 등록할 노선의 상행 종점역 이름을 입력하세요.
                강남역
                
                ## 등록할 노선의 하행 종점역 이름을 입력하세요.
                잠실역
                
                [INFO] 지하철 노선이 등록되었습니다. 
                
            - (예외) 등록한 노선 이름이 이미 존재한다면 안내문을 출력하고 다시 입력받는다.
            - (예외) 등록할 노선 이름이 2 - 5자 사이를 벗어난다면 안내문을 출력하고 다시 입력받는다.
            - (예외) 등록할 노선의 상행 종점역 이름이 존재하지 않으면 안내문을 출력하고 다시 입력받는다.
            - (예외) 등록할 노선의 하행 종점역 이름이 존재하지 않으면 안내문을 출력하고 다시 입력받는다.
    - '2' 입력 시 삭제할 노선을 입력받아 삭제하고 안내문을 출력한 후, 메인 화면으로 돌아간다.
        
            ## 삭제할 노선 이름을 입력하세요.
            1호선
            
            [INFO] 지하철 노선이 삭제되었습니다.
            
        - (예외) 삭제할 노선 이름이 존재하지 않으면 안내문을 출력하고 다시 입력받는다.
    - '3' 입력 시 등록되어 있는 노선 이름을 출력한 후, 메인 화면으로 돌아간다.
    
            [INFO] 노선 목록
            [INFO] 2호선
            [INFO] 3호선
            [INFO] 신분당선
                
    #### 2-3. 구간관리                
    - '3' 입력 시 구간 관리 화면으로 이동한 후, 원하는 기능을 입력받는다.
    
            ## 구간 관리 화면
            1. 구간 등록
            2. 구간 삭제
            B. 돌아가기
            
            ## 원하는 기능을 선택하세요.
            
    - '1' 입력 시 등록할 구간을 입력받아 등록하고 안내문을 출력한 후, 메인 화면으로 돌아간다.
        - 등록할 구간의 노선 이름을 입력받는다.
        - 구간에 등록할 역 이름을 입력받는다.
        - 등록할 역이 위치할 순서를 받는다.
            
                ## 노선을 입력하세요.
                2호선
                
                ## 역이름을 입력하세요.
                잠실역
                
                ## 순서를 입력하세요.
                2
                
                [INFO] 구간이 등록되었습니다.
                
            - (예외) 구간에 등록할 역이름이 존재하지 않으면 안내문을 출력하고 다시 입력받는다.
            - (예외) 위치할 순서가 0보다 작으면 상행 종점(첫번째)역으로 등록된다.
            - (예외) 위치할 순서가 노선상 역의 개수보다 크다면 하행 종점(마지막)역으로 등록된다.
    - '2' 입력 시 삭제할 구간을 입력받아 삭제하고 안내문을 출력한 후, 메인 화면으로 돌아간다.
        - 삭제할 구간의 노선을 입력받는다.
        - 삭제할 구간의 역을 입력받는다. (역은 실제로 삭제되지 않고 구간에서만 삭제된다.)
        
                ## 삭제할 구간의 노선을 입력하세요.
                2호선
                
                ## 삭제할 구간의 역을 입력하세요.
                잠실역
                
                [INFO] 구간이 삭제되었습니다.
        
            - (예외) 삭제할 구간의 역 이름이 존재하지 않으면 안내문을 출력하고 다시 입력받는다.
    #### 2-4. 지하철 노선도 출력
    - '4' 입력 시 지하철 노선도를 출력한 후, 메인 화면으로 돌아간다.
    
            ## 지하철 노선도
            [INFO] 2호선
            [INFO] ---
            [INFO] 교대역
            [INFO] 강남역
            [INFO] 역삼역
            
            [INFO] 3호선
            [INFO] ---
            [INFO] 교대역
            [INFO] 남부터미널역
            [INFO] 양재역
            [INFO] 매봉역
            
            [INFO] 신분당선
            [INFO] ---
            [INFO] 강남역
            [INFO] 양재역
            [INFO] 양재시민의숲역