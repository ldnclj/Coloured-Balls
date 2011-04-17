(ns coloured-balls.core-test
	(:use coloured-balls.motion coloured-balls.collision
		midje.sweet))
		
(fact (:x (move {:x 0 :y 0 :heading 45 :velocity 5})) => 3)