(ns learnclojure.core
  (:gen-class)
  (:import (clojure.java.api Clojure))
  (:require [clojure.string :as str])) 


                                        ;Clojure Cookbook

;; Say Hello
(defn sayHello [x]
  (str "Hello " x))

(sayHello "Thinh")

;; Check blank string
(str/blank? "")

;; Capitalize the first character in a string
(str/capitalize "this is a proper sentence.")

;; Uppercase
(str/upper-case "loud noises!")

;; lowercase
(str/lower-case "COLUMN_HEADER_ONE")

;; trim
(str/trim " \t Bacon ipsum dolor sit. \n")

;; Collapse whitespace into a single space
(str/replace "Who\t\nput  all this\fwhitespace here?" #"\s+" " ")

;; Replace Window-style line endings with Unix-style newlines
(str/replace "Line 1\r\nLine 2" "\r\n" "\n")

;; Trim left
(str/triml "  Column header\t")

;; Trim right
(str/trimr "\t\t* Second-level bullet.\n")

;; apply str
(apply str ["a" "b" "c"]) ;; is functionally equivalent to

;; Constructing a CSV from a header string and vector of rows
(def header "first_name, last_name, employee_number\n")
(def rows ["luke,vanderhart,1" "ryan, neufeld, 2"])

(interpose "\n" rows)("luke,vanderhart,1" "\n" "ryan, neufeld, 2")

 





;Bindings
;Giving names to values is called assignment in many programming languages.
;However, we call the mapping between names and values binding in Clojure.

;Loop in Clojure
;recur

(defn power
  ([x y] (power x y 1))
  ([x y current]
   (if (= y 0)
     current
     (if (> y 0)
       (recur x (- y 1) (* x current))
       (recur x (+ y 1) (/ current x))))))

(defn counttoN
  [n]
  (loop [count n
         current 0]
    (if (= count 0)
      current
      (recur (- count 1) (+ current count)))))




(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
