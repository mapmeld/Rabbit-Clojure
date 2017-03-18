(ns rabbit-converter.core-test
  (:require [clojure.test :refer :all]
            [rabbit-converter.core :refer :all]))


(deftest unicodezawgyitest
  (testing "Unicode to Zawgyi"
    (is (= "မဂၤလာပါ" (uni2zg "မင်္ဂလာပါ")))))

(deftest zawgyiunicodetest
  (testing "Zawgyi to Unicode"
    (is (= "မင်္ဂလာပါ" (zg2uni "မဂၤလာပါ")))))

