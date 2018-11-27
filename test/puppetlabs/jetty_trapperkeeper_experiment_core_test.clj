(ns puppetlabs.jetty-trapperkeeper-experiment-core-test
  (:require [clojure.test :refer :all]
            [puppetlabs.jetty-trapperkeeper-experiment-core :refer :all]))

(deftest hello-test
  (testing "says hello to caller"
    (is (= "Hello, foo!" (hello "foo")))))
