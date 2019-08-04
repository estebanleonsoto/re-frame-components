(ns com.dca-tec.re-frame.components.sampler
  (:require
    [re-frame.core :as re-frame]
    [reagent.core :as reagent]
    [com.dca-tec.re-frame.components.events :as events]
    [com.dca-tec.re-frame.components.views :as views]))

(def debug?
  ^boolean goog.DEBUG)

(defn dev-setup []
  (when debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
