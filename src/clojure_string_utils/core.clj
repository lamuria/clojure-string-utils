(ns clojure-string-utils.core
  (use [clojure.string :only (split join capitalize)]))

(defn capitalize-words
  "Capitalize every word in a string"
  [s]
  (->> (split (str s) #"\b")
       (map capitalize)
       (join)))
