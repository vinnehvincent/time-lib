(ns hello-time
 (:require [java-time.api :as t]))
 
(defn now
  "Returns current datetime"
  []
  (t/instant))
  
(defn time-str
  "Returns a string representation of a datetime in the local timezone"
  [instant]
  (t/format
    (t/with-zone (t/formatter "hh:mm a") (t/zone-id))
     instant))
     
     
