(ns clojure-string-utils.core
  (use [clojure.string :only (split join trim capitalize lower-case)]))

(defn capitalize-words
  "Capitalize every word in a string"
  [input]
  (->> (split (str input) #"\b")
       (map capitalize)
       (join)))

(defn- compact-spaces
  [raw]
  (join " "
    (split
      (trim raw) #"\s+")))

(defn to-snake-case
  "Converts string to snake case"
  [input]
  (join "_"
    (split
      (lower-case
        (compact-spaces input)) #" ")))
