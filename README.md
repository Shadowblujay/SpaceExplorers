# SpaceExplorers
**The Game**  

The Game
Premise
Space Explorers is a game where two players are pitted against each other in a system of interconnected planets. The players each start out on a home planet and the object of the game is to have the largest population by the end of the game.

Game Board
The game board is set up as a graph of planets interconnected by weighted edges.

Population growth occurs at a set rate on each planet.

If two planets are connected by an edge, then shuttles can be sent between these planets. The distance between the planets affects how many turns it takes for shuttles to move from one planet to the other.

The planets vary by two factors:

Size correlates to the total population the planet can support. Once a planet hits its maximum population, population growth will cease and any population that exceeds the maximum will decrease by the rate described below.

Habitability correlates to the population growth rate on a planet. Population change after one turn for a given planet is defined below.

Let c = current population, m = max population, g = growth rate, and p = overpopulation penalty.

If c < m, pop next turn = c*g
If c >= m, pop next turn = c - (c-m)*p
Currently, p = 0.1 and g = 1 + (habitability / 100)

Each player starts out with one planet with a given population. A player can send shuttles with explorers to neighboring planets on their turn.

Each player receives information about the entire game board, including the planet IDs of all planets and which planets are interconnected. However, a player can only see detailed information (population percentages, size, habitability, incoming shuttles) about the planets that their people have the majority on and their neighboring planets.

Game Flow
In one turn, a player

Receives information about the game state
Adds moves to the event queue
A ‘move’ is sending a shuttle from one planet to a neighboring planet. The player can set how many explorers are sent in the shuttle.
A player can make as many moves as they want in a turn.
Returns the event queue to the game engine
The game engine will then make all legal moves in the event queue, and allow one unit of time (one full turn cycle) to pass, in which

Population growth (or decay, if overpopulation cap) occurs on all planets
All shuttles move one step
The game play then passes to the other player.

Shuttles and Landings
A shuttle carries some amount of population from Planet A to Planet B. Let’s say that Player 1 sent a shuttle with 100 explorers, and the distance between the planets is 2. The shuttle takes two full turn cycles to arrive at Planet B, and during that time, no population growth occurs on the shuttle. There are several possibilities when the shuttle arrives at Planet B.

Player 1 Has Majority on Planet B
Since Player 1’s population is the majority on the planet, the explorers in the shuttle will always be added to the population as their people are able to accommodate some overcrowding with their own people if necessary.  
Player 2 Has Majority on Planet B
If the population on Planet B has not hit the population cap, the explorers in the shuttle will simply be added to Player 1’s population on the planet. If the population cap has been reached, the explorers on the shuttle will be lost since the player’s population on the planet does not have resources necessary to accommodate overpopulation.  

Planet B is Neutral
Player 1’s explorers are added to the population if the population cap has not been reached. Majority populations will give precedence to shuttles that they recognize (“friendly shuttles”), so all friendly shuttles will land before any others are able to land.
End of the Game
The game ends when one player has a majority population on all planets or a maximum number of turns is reached. If the maximum number of turns is reached, the player with the larger total population at that point wins the game.

For more information about the game flow, see the “SpaceExplorers_ExampleRound.pdf” document we posted on Canvas along with this assignment, which walks through an example round of the game.