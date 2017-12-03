(let [lines (clojure.string/split-lines
             (slurp "../data.csv" ))]
  (dotimes [n 10]
    (time
     (print
      (->> lines
           (map #(Long/parseLong (nth (.split ^String % ",") 0)))
           (reduce max))))))
