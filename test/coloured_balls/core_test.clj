(ns coloured-balls.core-test
	(:use coloured-balls.motion coloured-balls.collision
		midje.sweet))
		
(fact (:x (move {:x 0 :y 0 :heading 45 :velocity 5})) => 4)

(fact (:y (move {:x 0 :y 0 :heading 45 :velocity 5})) => 4)

(fact (:x (move {:x 4 :y 4 :heading 225 :velocity 5})) => 0)

(fact (:y (move {:x 4 :y 4 :heading 225 :velocity 5})) => 0)