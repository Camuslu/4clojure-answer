(fn [str] (sort-by #(.toLowerCase %) (re-seq #"\w+" str)))