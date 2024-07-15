Feature: Register Foto




 #TCC.JS.001
  Scenario Outline: Register Foto Page
    When click register foto menu
    When select opsi penukaran
    And input phone number "<phoneNumber>"
    And input customer name "<customerName>"
    And select merchant name one
    And input amount shop one "<amountShop>"
    And input rrn code one "<rrnCode>"
    And upload struk file "<pathFile>"
    And click btn kirim
    Then validate register foto form "<statusTest>"

    Examples:
      | phoneNumber | customerName | amountShop | rrnCode | pathFile | statusTest |
      | 0873467673  | nia          | 1200000    | D63564  | jhdhjf   | success    |