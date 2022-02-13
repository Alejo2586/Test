#languaje:en

Feature: Technical Test

  @ScenarioOne
  Scenario Outline:
    Given The user is on the Main Homepage
    When The user go to lets talk
    When the user type the "<firstName>" "<lastName>" "<workEmail>" "<companyName>" "<phoneNumber>" and "<message>"
    Then The user validates the message "<validationMessage>"
    Examples:
      | firstName| lastName|workEmail|companyName|phoneNumber|message|validationMessage|
      |Pepito|Perez|pepito.perez@mygreatmail.com|The best company in world|3333333|Hello, We need a loan|Thanks for throwing us a bone|

  @ScenarioOne
  Scenario Outline:
    Given The user is on the Main Homepage
    When The user go to lets talk
    When the user type the "<firstName1>" "<lastName1>" with an invalid "<invalidWorkEmail>" "<companyName1>" "<phoneNumber1>" and "<wrongMessage>"
    Then The user validates the message "<validationMessage>"
    Examples:
      | firstName1| lastName1|invalidWorkEmail|companyName1|phoneNumber1|wrongMessage|
      |MyName|MyLastName|MyName.MyLastName.InvalidFormat|The best company in world|3333333|Incorrect format|



