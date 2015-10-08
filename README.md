Pucksea
=======

![alt tag](http://1.bp.blogspot.com/-dL2WkCZUxAI/VhXsdIzMfxI/AAAAAAAACOw/D8GKO1KkkoE/s1600/Screen%2BShot%2B2015-10-08%2Bat%2B12.08.06%2BAM.png)

Pucksea is a pucks program that denies certain movement pattern for a user puck; allowing it to be more artificially intelligent.

What are pucks?
=======
Pucks  is an open source artificially intelligent simulation platform created by [Lee Spector](https://github.com/lspector).
The code files for pucks can be found [here](https://github.com/lspector/pucks).

What is pucksea?
=======
When you edit pucks file to change the the way pucks behave than defined previously, you create a new AI simulation.
Using the maps of pucks defined by Lee Spector. I have edited the following files from the pucks repository:
- user.clj
- ai/world1.clj

Editing these files has allowed me to change the way pucks behave with each other. Hence bringing out an artifially intelligent behavior from these pucks.

Assignment information
=======
This program is written as a part of the Artificial Intelligence Assignment.

- Program Name : Pucksea
- Program Description : An AI pucks program that has a user puck which avoids zappers (loss of energy) and navigates towards vents (to gain energy). When faced with another fellow user puck, it moves away. Because they are too shy.
- Subject : Artificial Intelligence
- Assignment : Write a pucks code that does anything
- Language : Clojure

Check the [user.clj](https://github.com/nddave/Pucksea/blob/master/user.clj) and the [puckseaworld.clj](https://github.com/nddave/Pucksea/blob/master/puckseaworld.clj) file for the code and explaination.
To execute the pucks files, please locate [Lee Spector's orginal pucks doccumentation](https://github.com/lspector/pucks), and replace the user.clj in 'src/pucks/agents/'; while also add the pucksea.clj to 'src/pucks/worlds/ai/'.
