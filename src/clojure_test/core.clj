(ns clojure-test.core
  (:gen-class)
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request-map]
   {:status 200
    :headers {"Content-Type" "text/html"}
    :body (str "<html><body>Hello Clojure!</body></html>")})

(defn -main []
  (jetty/run-jetty
  handler
  {:port 8080
   :join? false}))