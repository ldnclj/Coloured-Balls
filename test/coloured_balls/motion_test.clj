(ns coloured-balls.core-test
	(:use coloured-balls.motion
		midje.sweet))
		
(fact (direction {:heading 45}) => [1 1])

(fact (direction {:heading 225}) => [-1 -1])