(ns clojure-test.core
  (:gen-class)
  (:require [ring.adapter.jetty :as jetty]))

(def message (System/getenv "MESSAGE"))

(defn handler [request-map]
   {:status 200
    :headers {"Content-Type" "application/json"}
    :body (str "{\"message\": \"" message "\"}")})

(defn -main []
  (jetty/run-jetty
  handler
  {:port 8080
   :join? false}))