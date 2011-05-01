(ns coloured-balls.collision
	(:use [clojure.contrib.math]))

(defn distance [a b]
	(let [ x1 (:x a)
		y1 (:y a)
		x2 (:x b)
		y2 (:y b)]
	(sqrt(+ (expt (abs (- x1 x2)) 2) (expt (abs (- y1 y2)) 2)))))