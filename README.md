# bowling-game-kata
### Bowling Rules
The game consists of 10 frames. In each frame the player has two rolls to knock down 10 pins. The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two rolls. The bonus for that frame is the number of pins knocked down by the next roll.

A strike is when the player knocks down all 10 pins on their first roll. The frame is then completed with a single roll. The bonus for that frame is the value of the next two rolls.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame. However no more than three balls can be rolled in tenth frame.

For more information on the rules, see:
https://www.topendsports.com/sport/tenpin/scoring.htm

The following '10 pin calculator' can be used to see the scoring in action too:
http://www.bowlinggenius.com/

### Requirements
Write a program to score a game of Ten-Pin Bowling; you should create a class or module that exposes two methods or functions:
- `void roll(int pins)`
- `int score()`

### Suggested Test Cases
Key: “X” indicates a strike, “/” indicates a spare and “-” indicates a miss.

`X X X X X X X X X X X X` 
(12 rolls: 12 strikes) = 10 frames * 30 points = 300

`9- 9- 9- 9- 9- 9- 9- 9- 9- 9-` 
(20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points = 90

`5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5`
(21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150
