(defproject game-shop "0.1.0-SNAPSHOT"
  :description "The answer of utilforever/ProgrammingPractice: Game Shop, Part 1"
  :url "https://github.com/ChalkPE/programming-practice-game-shop"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot game-shop.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})