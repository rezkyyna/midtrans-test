Feature: Transaksi

  Scenario: Transaction Midtrans Pillow
    When user access url midtrans
    And user click button buy now
    And user click button checkout
#    And user click button use promo
#    And user choose promo flash sale
#    And user click button use
    And user click metode payment
    Then user get code order id




