(ns eight-queens.core)

;; (def chess-board [[])

(def width 8)
(def height 8)

(def queen-locations [{:p [1 1]}
                      {:p [2 3]}])

(defn step-down-left
  [q]
  (let [[x y] (get q :p)]
    {:p (+ x 1) (- y 2)})

(defn step-up-right
  [q]
  (let [[x y] (get q :p)
    {:p (+ x 1) (+ y 2)}]))

;; first attempt
(defn same-row?
  [q1 q2]
  (let [[x y] (q1 :p)
        [x' y'] (q2 :p)]
    (= x x')))

(defn same-column?
  [q1 q2]
  (let [[x y] (q1 :p)
        [x' y'] (q2 :p)]
    (= y y')))

(defn )

(defn diagonal?
  [q q']
  )

(defn checkmate?
  [q1 q]
  (let [[x y] (q1 :p)
        remaining (filter (partial diagonal? q1) q)]
    (not (= (count q) (count remaining)))))

