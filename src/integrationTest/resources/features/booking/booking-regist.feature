Feature: 영화 예매
  #사용자 A는 주말에 "모아나 2" 영화를 보려 합니다.
  #A는 가장 가까운 영화관 "홍대 영화관"에서 상영 중인 시간표를 확인하고, "현재일자" "12시 30분" 상영을 선택합니다.
  #상영관은 "8층 1관"이며, "A3 좌석"을 선택합니다.
  #좌석이 예약 가능하여 예매를 신청 후 결제를 진행하고, 성공적으로 예매를 완료합니다.
  #결제 완료 후, A는 예매 내역을 확인하여 자신이 예약한 정보가 정확한지 검토합니다.
  Scenario:
    Given 회원:
      | id | nickname |
      | A  | userA    |
    Given 영화관:
      | id | name     |
      | 1  | 홍대 영화관 |
    Given 영화:
      | id | title | description | releaseDate | duration |
      | 1  | 모아나2  |             | now         | 120      |
    Given 상영관:
    | id |


