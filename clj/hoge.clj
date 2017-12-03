(let
  [ lines
    (seq
      (clojure.string/split-lines
        (slurp "../data.csv" ))) ]
  (dotimes [ n 10 ]
    (time
      (print
        (apply
          max
          (map
            #(read-string
              (nth
                (clojure.string/split % #",")
                0))
            lines))))))
