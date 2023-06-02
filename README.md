# Snake and Ladder

Snake and Ladder is a board Game.

## Problem Statement :
Snake and Ladder is played with a ***set of players***, ***one or more dice*** and ***a board of snakes and ladders***.
Set of players can be defined at runtime.
The number of dice is also modifiable. By default, it is taken to be 2.
The size of the board can also be given at runtime. And so can be the number of snakes and ladders.

Although the number of snakes and ladders can be given at runtime, the source and destination of the same is done randomlyby Java!
The behaviour of snake biting and ladder taking up is taken care of.

### Rules - 
- The players start at 0. 
- Each player gets only one chance what-so-ever.
- The dice is rolled turn-wise by each player.
- Here 2 die are rolled, so the sum of both is taken.
- 3 cases may arise, a snake, a ladder or nothing.
- As usual, the snake takes you down to the tail. Ladder takes you up. And if nothing, simply move up by the die.
- If the player reaches 100, he wins, and the game stops.

## Low Level Design :

There are many components. Each class has single responsibily.
Pls refer code for each class and the documentation.



