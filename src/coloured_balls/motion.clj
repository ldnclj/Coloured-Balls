(ns coloured-balls.motion
	(:use [clojure.contrib.generic.math-functions :only (round, cos, sin)]))
	
(defn degrees-to-radians [degrees]
	(* (/ Math/PI 180) degrees))

(defn move [item]
	(let [heading (degrees-to-radians (:heading item))
		velocity (:velocity item)
		old-x (:x item)
		old-y (:y item)
		new-x (round (* velocity (cos heading)))
		new-y (round (* velocity (sin heading)))]
		(conj {:x (+ old-x new-x) :y (+ old-y new-y)} (dissoc item :x :y))))
		
