Pucksea
=======

![alt tag](http://1.bp.blogspot.com/-dL2WkCZUxAI/VhXsdIzMfxI/AAAAAAAACOw/D8GKO1KkkoE/s1600/Screen%2BShot%2B2015-10-08%2Bat%2B12.08.06%2BAM.png)

Pucksea is a pucks program that defines certain movement pattern for a user puck; allowing it to be more artificially intelligent.

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

Check the [user.clj](https://github.com/nddave/Pucksea/blob/master/user.clj) and the [puckseaworld.clj](https://github.com/nddave/Pucksea/blob/master/puckseaworld.clj) file for the code and explaination.
To execute the pucks files, please locate [Lee Spector's orginal pucks doccumentation](https://github.com/lspector/pucks), and replace the user.clj in 'src/pucks/agents/'; while also add the pucksea.clj to 'src/pucks/worlds/ai/'.

# License information ![License: CC BY 4.0](https://img.shields.io/badge/License-CC%20BY%204.0-lightgrey.svg)

This work is licensed under a [Creative Commons Attribution 4.0 International License](https://creativecommons.org/licenses/by/4.0/). 

Program is created by [Nirman Dave](http://www.nirmandave.com) as a form of assignment for *Artificial Intelligence CS263* course at *Hampshire College, Amherst MA* under *Professor Lee Spector*.
