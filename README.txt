Projet contenant des tests sans SUT en JUnit Jupiter. Chaque test contient une simple assertion sur un calcul basé sur deux variables.
Ce projet est composé de 2 classes, le résultat du test est défini selon les paramètres envoyés.
Trois paramètres sont nécessaires (attention : dans Squash TM ces valeurs ne doivent pas contenir les "DS_". Ceci sera automatiquement ajouté lors du transfert de paramètre de Squash TM à Squash TF):
    - DS_VAR1 : Première valeur du calcul
    - DS_VAR2 : Seconde valeur du calcul
    - DS_RES : Résultat attendu par le calcul

Calculator.java : - add(displayName = "Addition")
		          - mult

CalcSecondPart.java : - sub(displayName = "Substraction")
