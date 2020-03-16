 fun main() {
     val EMPTY: Long = 2147483648
     val REMOVE: Long = 2147483647
     val SIZE: Int = 10
     var hasht: Array<Long?> = arrayOfNulls(SIZE)
     for (i in 0..hasht.size - 1) hasht[i] = EMPTY

     fun hashofKey(v: Long): Long = v % SIZE

     fun problin(v: Long) {
         var dv = v
         var probK = hashofKey(dv).toInt()
         val stateProb = probK
         while (true) {
             if (hasht[probK] == EMPTY) {
                 hasht[probK] = v
                 break
             }
             dv++
             probK = hashofKey(dv).toInt()
             if (probK == stateProb) break
         }
     }

     fun probqua(v: Long) {

     }

     fun add(v: Long) {
         problin(v)
     }

     fun remove(key: Int) {
        if (hasht[key] != EMPTY) hasht[key] = REMOVE
     }

     add(1)
     add(3)
     add(4)
     add(4)
     add(1)
     add(23)
     remove(3)

     for (item in hasht) {
         println(item)
     }

    }



