# Development manual

## Introduction
This is a development manual for a game called Tic Tac Toe made by DreamTeam for the course SC-T-303 Hugbúnaðarfræði at Reykjavik University. The source control client in use is github.
This project is a remake of the well known game of Tic Tac Toe. If you are not familiar with Tic Tac Toe, you can find the rules of the game [here](https://en.wikipedia.org/wiki/Tic-tac-toe). It can be ccessed by opening a browser and following this [link](http://sleepy-bastion81869.herokuapp.com/).

## Access to source
You have to contact one of the administrators to get access to the source control. They will then give you access to the source code on github.

## Build environment
To be able to build the project the following is required:

1. A Github account.
2. The JRE(Java Runtime Environment) needs to be installed on your computer.
    * It can be downloaded [here](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
3. Clone the project to your local machine from [here](https://github.com/DreamTeamHR/TicTacToe).

To be able to run the project locally in separate steps, follow these instructions:
Use the commands

* gradle build
* gradle run

## Tests
1. Travis takes care of the unit tests automatically and pushes the code on to a heroku server which deploys the game. [Here](https://travis-ci.org/DreamTeamHR/TicTacToe) is the link to the project on Travis.
2. Code Coverage can be accessed on [here](https://codecov.io/gh/DreamTeamHR/TicTacToe).
