 fun main() {
     val EMPTY: Long = 2147483648
     val REMOVE: Long = 2147483647
     val SIZE: Int = 10
     var hasht: Array<Long?> = arrayOfNulls(SIZE)
     for (i in 0..hasht.size - 1) hasht[i] = EMPTY

     fun hashofKey(v: Long): Int = (v % SIZE).toInt()

     fun problin(v: Long) {
         var dv = v
         var probK = hashofKey(dv)
         val stateProb = probK
         while (true) {
             if (hasht[probK] == EMPTY) {
                 hasht[probK] = v
                 break
             }
             dv++
             probK = hashofKey(dv)
             if (probK == stateProb) break

         }
     }

     fun probqua(v: Long) {
         var dk = 0
         var probK = hashofKey(v)
         while (true) {
             var temp_key = probK + dk*dk
             if (temp_key >= hasht.size) break
             if (hasht[temp_key] == EMPTY) {
                 hasht[temp_key] = v
                 break
             }
             dk++

         }
     }



     fun addlin(v: Long) {
         problin(v)
     }

     fun remove(key: Int) {
        if (hasht[key] != EMPTY) hasht[key] = REMOVE
     }

     fun addqua(v: Long) {
         probqua(v)
     }


     /*
     addlin(3)
     addlin(4)
     addlin(4)
     addlin(1)
     addlin(1)
     addlin(23)
     remove(3)
     */

     addqua(0)
     addqua(0)
     addqua(0)
     addqua(0)
     addqua(0)

     for (item in hasht) {
         println(item)
     }

    }



