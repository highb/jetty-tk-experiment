(ns puppetlabs.jetty-trapperkeeper-experiment-service
  (:require [clojure.tools.logging :as log]
            [puppetlabs.jetty-trapperkeeper-experiment-core :as core]
            [puppetlabs.trapperkeeper.core :as trapperkeeper]))

(defprotocol HelloService
  (hello [this caller]))

(trapperkeeper/defservice hello-service
  HelloService
  []
  (init [this context]
    (log/info "Initializing hello service")
    context)
  (start [this context]
    (log/info "Starting hello service")
    context)
  (stop [this context]
    (log/info "Shutting down hello service")
    context)
  (hello [this caller]
         (core/hello caller)))
