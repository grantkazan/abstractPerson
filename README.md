# C05A Abstract Person
#### Authors: Grant Kazan & Samuel Wasserman

## Person Class
- abstract class for a person
- two instance variables, name and occupation

## Extensions of Person Class:
### Steelers Fan Class
- const string array instance variable
- answerQuestion response is chosen from string array

### Bengals Fan Class
- meal instance variable w/ parameter in constructor
- all @Override methods use meal

### Browns Fan Class
- Has a character array instance variable
- overrides whatIDo and adds some gibberish
- answerQuestion() generates a random string of characters

### Chiefs Fan Class
- favoritePlayer instance variable
- whatIDo() uses favoritePlayer instance variable
- answerQuestion() uses Random class to determine answer.
