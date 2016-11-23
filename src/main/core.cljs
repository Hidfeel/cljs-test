(ns main.core
  (:require [cljs.nodejs :as nodejs]
            [kvlt.core :as kvlt]
            [promesa.core :as p]
  ))

(nodejs/enable-util-print!)

(defn -main [& args]
  (println "Hello world!")
  (p/alet [{:keys [status]} (p/await (kvlt/request! {:url "http://www.baidu.com/"}))]
  (println (is (= status 200)))
  )
  )

(set! *main-cli-fn* -main)