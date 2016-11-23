(defproject lein-cljsbuild-example "1.2.3"
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    ; [org.clojure/clojurescript "1.9.293" :exclusions [org.apache.ant/ant]]
    [org.clojure/clojurescript "1.8.51" :exclusions [org.apache.ant/ant]]
    [io.nervous/kvlt "0.1.4-SNAPSHOT"]
                  ]
  :plugins [[lein-cljsbuild "1.1.4"]
  ]
  :mirrors {"central" {:name "central"
                    :url "http://maven.aliyun.com/nexus/content/groups/public/"}}
  :cljsbuild {
    :builds [{
        ; The path to the top-level ClojureScript source directory:
        :source-paths ["src"]
        ; The standard ClojureScript compiler options:
        ; (See the ClojureScript compiler documentation for details.)
        :compiler {
          :main "main.core"
          :output-dir "js-src"
          :output-to "js-src/main.js"  ; default: target/cljsbuild-main.js
          :asset-path "/"
          :optimizations :none
          :target :nodejs
          :pretty-print true
          :source-map true
          ; :source-map "js-src/main.js.map"
          }}]})