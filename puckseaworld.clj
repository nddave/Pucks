;; This is my canvas. This is my art.

;; Assignment information
;; ---
;; Class : Artificial Intelligence
;; Assignment : Make a pucks program that does anything
;; Student : Nirman Dave

;; Program information
;; ---
;; Name : Pucksea : The world file
;; Version : 1.0
;; Description : An AI pucks program that has a user puck which avoids zappers (loss of energy)
;;                and navigates towards vents (to gain energy). When faced with another fellow
;;                user puck, it moves away. Because they are too shy.
;;				  This file is the Pucksea file, which is the "world" the "pucks" will live in.
;; Language : Clojure

;; Importing default liberaries, name space and defining file(s) that contain
;; global variables that will be used throughout the program.
(ns pucks.worlds.ai.puckseaworld 
  (:use [pucks core globals]
        [pucks.agents stone vent zapper user]))

;; The agents are the things you will see when the world starts up.
;; This is a set of different pucks floating in the Pucksea world.
(defn agents []
  (concat 
          [
           ;; The following define the zapper puck and thier relative position
           ;; in the Pucksea world.
           (merge (zapper) {:position [200 600]})
           (merge (zapper) {:position [200 200]})
           (merge (zapper) {:position [600 200]})

           ;; The following define the vent puck and its relative position
           ;; in the Pucksea world.
           (merge (vent) {:position [600 600]})

           ;; There are two sets of user pucks in this world.
           ;; The user pucks are mobile (unlike zapper and vent).

           ;; == User pucks : First Set ==
           ;; The first set contains a set of user pucks from one single location
           ;; facing in one single direction.
           (merge (user) {:position [1 1] :rotation (/ Math/PI 2)})
           (merge (user) {:position [1 1] :rotation (/ Math/PI 2)})
           (merge (user) {:position [1 1] :rotation (/ Math/PI 2)})
           (merge (user) {:position [1 1] :rotation (/ Math/PI 2)})
           (merge (user) {:position [1 1] :rotation (/ Math/PI 2)})
           (merge (user) {:position [1 1] :rotation (/ Math/PI 2)})
           (merge (user) {:position [1 1] :rotation (/ Math/PI 2)})
           (merge (user) {:position [1 1] :rotation (/ Math/PI 2)})

           ;; == User pucks : Second Set ==
           ;; The first set contains a set of user pucks from random locations
           ;; facing in one single direction.
           ;; --
           ;; To unlock this set, uncomment the lines below.
           ;; and comment the first set.
           ;; --
           ; (merge (user) {:position [20 400] :rotation (/ Math/PI 2)})
           ; (merge (user) {:position [230 300] :rotation (/ Math/PI 2)})
           ; (merge (user) {:position [90 80] :rotation (/ Math/PI 2)})
           ; (merge (user) {:position [50 70] :rotation (/ Math/PI 2)})
           ; (merge (user) {:position [170 150] :rotation (/ Math/PI 2)})
           ; (merge (user) {:position [100 30] :rotation (/ Math/PI 2)})
           ; (merge (user) {:position [0 0] :rotation (/ Math/PI 2)})
           ; (merge (user) {:position [32 16] :rotation (/ Math/PI 2)})
           ; (merge (user) {:position [413 567] :rotation (/ Math/PI 2)})
           ]))

;; User settings below define what happens with the main frame when it loads up.
(defn settings []
  ;; Pauses the game play when it starts. So the user has to trigger the spacebar
  ;; to resume the game play.
  {:pause-on-start true})

;; For wierd people who use night code instead of sublime text or other IDES.
;; Please uncomment the code below to make this run properly.
;(run-pucks (agents) (settings))
