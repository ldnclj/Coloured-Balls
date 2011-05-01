(ns coloured-balls.collision-test
	(:use coloured-balls.collision
		midje.sweet))
		
(fact (distance {:x 1 :y 1} {:x 4 :y 5}) => 5)

(fact (distance {:x 4 :y 4} {:x 7 :y 0}) => 5)