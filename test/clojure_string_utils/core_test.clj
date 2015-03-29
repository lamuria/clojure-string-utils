(ns clojure-string-utils.core-test
  (:require [clojure.test :refer :all]
            [clojure-string-utils.core :refer :all]))

(deftest capitalize-words-tests
  (is (= "Capitalized Words"
      (capitalize-words "capitalized words")))
  (is (= "Capitalized Words"
      (capitalize-words "capitalized Words")))
  (is (= ""
      (capitalize-words "")))
  (is (= ""
      (capitalize-words nil)))
  (is (= "Capitalized Words"
      (capitalize-words "Capitalized words"))))
