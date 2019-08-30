(defn app-a [f m] (f (:a m)))

(deftest app-a-test
  (is (= (app-a inc {:a 42})
         43))
  (is (= (app-a dec {:a 42})
         41)))
