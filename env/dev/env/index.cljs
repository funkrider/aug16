(ns env.index
  (:require [env.dev :as dev]))

;; undo main.js goog preamble hack
(set! js/window.goog js/undefined)

(-> (js/require "figwheel-bridge")
    (.withModules #js {"./assets/images/cljs.png" (js/require "../../../assets/images/cljs.png"), "react" (js/require "react"), "react-native" (js/require "react-native"), "expo" (js/require "expo"), "create-react-class" (js/require "create-react-class"), "./assets/icons/loading.png" (js/require "../../../assets/icons/loading.png"), "./assets/icons/app.png" (js/require "../../../assets/icons/app.png")}
)
    (.start "main" "expo" "localhost"))
