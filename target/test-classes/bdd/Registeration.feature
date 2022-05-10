	Feature: user registeration
	i want to check user can register at the website.
	
	Scenario Outline: user registeration
	Given the user in homepage
	When I click on register link
	And I entered "<fisrtname>" , "<lastname>" , "<email>" , "<password>"
	Then the registeration page displayed sucessfully
	
	Examples:
		| firstname | lastname | email | password |
		|	mostafa		| nasr		 | testa12@test.com | 147852 |
	  |	mostafa1		| nasr1		 | testa15@test.com | 147852 |
	