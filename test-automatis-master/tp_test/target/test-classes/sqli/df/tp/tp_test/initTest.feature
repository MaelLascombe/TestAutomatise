#Author: dfrances@sqli.com
Feature: Init test
	
	Background:
		Given un bar à 10 places
	
	Scenario Outline: Premier Scenario
		Given le bar à déjà <place_used> places d'occupées
		When un groupe de personne rentre
			| Mr Leblanc |
			| Mr Pignon  |
		Then ils se font refuser à l'entrée
		
		
		Examples:
		
		| place_used | 
		|    9       |
		
	Scenario Outline: Deuxieme Scenario
		Given le bar à déjà <place_used> places d'occupées
	  When un groupe de personne rentre
			| Mr Leblanc |
			| Mr Pignon  |
		Then la personne derrière eux se voit refuser l'entrée car le bar affiche complet
		When les personnes ci dessous commandent chacuns un bon coktail à <cocktail_price>
		  | Mr Leblanc |
			| Mr Pignon  |
		Then ils vérifient la note de <note>
		When Mr Pignon paie
		Then  Mr Pignon est heureux de n'avoir commandé qu'un verre
		
		Examples:
		
		| place_used | cocktail_price | note | 
		|    8       |       10				|  20  |
		
	Scenario Outline: Troisème Scenario
		Given le bar à déjà <place_used> places d'occupées
	  When un groupe de personne rentre
			| Mr Leblanc |
			| Mr Pignon  |
		Then ils s'assoient. 
		When les personnes ci dessous commandent chacuns un bon coktail à <cocktail_price>
		  | Mr Leblanc |
			| Mr Pignon  |
		Then ils vérifient chacun leurs notes de 10.
		When Mr Pignon paie
		Then Mr Leblanc leurs commandent 2 autres cocktails du mois à <cocktail_price>
		When Mr Leblanc vérifie sa note de 30
		Then Mr Leblanc paye
		And  Mr Pignon est triste d'avoir bu plus d'un verre
		
		Examples:
		
		| place_used | cocktail_price |
		|    3       |       10				| 
		