(defproject clojure-test "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
    [org.clojure/clojure "1.10.3"]
    [ring "1.8.2"]
    [hiccup "1.0.5"]
    [org.clojure/java.jdbc "0.6.0"]
    [com.h2database/h2 "1.4.193"]
    ]
  :main ^:skip-aot clojure-test.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all 
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
