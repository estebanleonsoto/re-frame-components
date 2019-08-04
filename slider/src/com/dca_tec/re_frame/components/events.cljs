(ns com.dca-tec.re-frame.components.events
  (:require
    [re-frame.core :as re-frame]))

(re-frame/reg-event-db
  ::initialize-db
  (fn [_ _]
    {:com-dca-tec {:initialized true}}))
