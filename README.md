# cljbench
Performance Comparison(Java vs Clojure) on a simple test.  

Reading "../data.csv" and get maximum value of the first culumn.

```
kanatoko@ubuntu:~/cljbench$ cd java
kanatoko@ubuntu:~/cljbench/java$ ./run.sh 
OptionalInt[999]
1131 msecs
OptionalInt[999]
927 msecs
OptionalInt[999]
746 msecs
OptionalInt[999]
830 msecs
OptionalInt[999]
706 msecs
OptionalInt[999]
690 msecs
OptionalInt[999]
589 msecs
OptionalInt[999]
806 msecs
OptionalInt[999]
870 msecs
OptionalInt[999]
596 msecs
kanatoko@ubuntu:~/cljbench/java$ cd ../clj
kanatoko@ubuntu:~/cljbench/clj$ ./run.sh 
999"Elapsed time: 2343.33429 msecs"
999"Elapsed time: 1830.582367 msecs"
999"Elapsed time: 1645.542427 msecs"
999"Elapsed time: 1775.524959 msecs"
999"Elapsed time: 1581.4363 msecs"
999"Elapsed time: 1712.677261 msecs"
999"Elapsed time: 1572.896137 msecs"
999"Elapsed time: 1716.810819 msecs"
999"Elapsed time: 1595.251305 msecs"
999"Elapsed time: 1651.309988 msecs"
```

Java seems to be 60% faster.
