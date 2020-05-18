Feature: to test tags in cucu
@contact
Scenario: tags test1
Given contacts

@contact
Scenario: tags test2
Given name

@name
Scenario: tags test3
Given first name
@name
Scenario: tags test4
Given last name
@name @contact
Scenario: tags test5
Given mob
@name @contact
Scenario: tags test6
Given job