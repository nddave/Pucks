;; This is my canvas. This is my art.

;; Assignment information
;; ---
;; Class : Artificial Intelligence
;; Assignment : Make a pucks program that does anything
;; Student : Nirman Dave

;; Program information
;; ---
;; Name : Pucksea : The User Proposal File
;; Version : 1.0
;; Description : An AI pucks program that has a user puck which avoids zappers (loss of energy)
;;                and navigates towards vents (to gain energy). When faced with another fellow
;;                user puck, it moves away. Because they are too shy.
;; Language : Clojure

;; Importing default liberaries, name space and defining file(s) that contain
;; global variables that will be used throughout the program.
(ns pucks.agents.user  
  (:use [pucks globals util]
        [pucks.agents active]))

;; User proposal defines conditions for the user puck to execute a certain
;; kind of behavior. Here the user proposal is for three main tasks:
;; 1) Avoiding the zappers
;; 2) Navigating the vents and moving towards it
;; 3) Shying away from other fellow users
(defn user-proposals [p]
  ;; The accelereation of the user puck is defined to be 1
  {:acceleration 1

    ;; The rotation is the movement of a puck relative to its position
    ;; it is defined in radians. The rotation of a puck here, is triggered when
    ;; it senses other pucks.

    ;; The let function associates letters to conditions.
    ;; z = When the zapper is sensed
    ;; v = When the vent is sensed
    ;; u = When a fellow user is sensed

  	:rotation (let [z (filter :zapper (:sensed p))
  				v (filter :vent (:sensed p))
  			    u (filter :user (:sensed p))]

            ;; Once we associate a letter to what the puck senses,
            ;; we now give it a task to do. Which here, is to rotate.

  			    (cond
  
              ;; Everytime a puck senses something, it creates a map of it.
              ;; For example, if it sensed a zapper, it will create a map containing
              ;; a value that corresponds to a zapper.

              ;; If the map is empty (means no zapper), do the condition defined.
  			    	(not (empty? z)) 
              ;; Change the rotation relative to current position.
              ;; The negetive sign suggest opposite direction.
  			    	(-(relative-position->rotation (:position (first z))))
  			    	
              ;; The same goes for the following code lines.
  			    	(not (empty? v))
  			    	(relative-position->rotation (:position (first v)))
  			    	(not (empty? u))
  			    	(-(relative-position->rotation (:position (first u))))

              ;; If it doesnt sense anything, then it will continue to
              ;; go at the same velocity it did, without changing its rotation
  			    	:else (relative-position->rotation (:velocity p))))})

;; User settings below define what happens with the main frame when it loads up.
(defn user []
  (merge (active)
         {:user true
          :proposal-function user-proposals}))
