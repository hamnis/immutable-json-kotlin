package net.hamnaberg.json.kotlin

fun <T1,TT>((T1) -> TT).toJava(): io.vavr.Function1<T1,TT> {
  return object: io.vavr.Function1<T1, TT> {
    override fun apply(t1: T1): TT {
      return invoke(t1)
    }
  }
}
   
fun <T1,T2,TT>((T1,T2) -> TT).toJava(): io.vavr.Function2<T1,T2,TT> {
  return object: io.vavr.Function2<T1,T2, TT> {
    override fun apply(t1: T1,t2: T2): TT {
      return invoke(t1,t2)
    }
  }
}
   
fun <T1,T2,T3,TT>((T1,T2,T3) -> TT).toJava(): io.vavr.Function3<T1,T2,T3,TT> {
  return object: io.vavr.Function3<T1,T2,T3, TT> {
    override fun apply(t1: T1,t2: T2,t3: T3): TT {
      return invoke(t1,t2,t3)
    }
  }
}
   
fun <T1,T2,T3,T4,TT>((T1,T2,T3,T4) -> TT).toJava(): io.vavr.Function4<T1,T2,T3,T4,TT> {
  return object: io.vavr.Function4<T1,T2,T3,T4, TT> {
    override fun apply(t1: T1,t2: T2,t3: T3,t4: T4): TT {
      return invoke(t1,t2,t3,t4)
    }
  }
}
   
fun <T1,T2,T3,T4,T5,TT>((T1,T2,T3,T4,T5) -> TT).toJava(): io.vavr.Function5<T1,T2,T3,T4,T5,TT> {
  return object: io.vavr.Function5<T1,T2,T3,T4,T5, TT> {
    override fun apply(t1: T1,t2: T2,t3: T3,t4: T4,t5: T5): TT {
      return invoke(t1,t2,t3,t4,t5)
    }
  }
}
   
fun <T1,T2,T3,T4,T5,T6,TT>((T1,T2,T3,T4,T5,T6) -> TT).toJava(): io.vavr.Function6<T1,T2,T3,T4,T5,T6,TT> {
  return object: io.vavr.Function6<T1,T2,T3,T4,T5,T6, TT> {
    override fun apply(t1: T1,t2: T2,t3: T3,t4: T4,t5: T5,t6: T6): TT {
      return invoke(t1,t2,t3,t4,t5,t6)
    }
  }
}
   
fun <T1,T2,T3,T4,T5,T6,T7,TT>((T1,T2,T3,T4,T5,T6,T7) -> TT).toJava(): io.vavr.Function7<T1,T2,T3,T4,T5,T6,T7,TT> {
  return object: io.vavr.Function7<T1,T2,T3,T4,T5,T6,T7, TT> {
    override fun apply(t1: T1,t2: T2,t3: T3,t4: T4,t5: T5,t6: T6,t7: T7): TT {
      return invoke(t1,t2,t3,t4,t5,t6,t7)
    }
  }
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,TT>((T1,T2,T3,T4,T5,T6,T7,T8) -> TT).toJava(): io.vavr.Function8<T1,T2,T3,T4,T5,T6,T7,T8,TT> {
  return object: io.vavr.Function8<T1,T2,T3,T4,T5,T6,T7,T8, TT> {
    override fun apply(t1: T1,t2: T2,t3: T3,t4: T4,t5: T5,t6: T6,t7: T7,t8: T8): TT {
      return invoke(t1,t2,t3,t4,t5,t6,t7,t8)
    }
  }
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9) -> TT).toJava(): net.hamnaberg.json.util.F9<T1,T2,T3,T4,T5,T6,T7,T8,T9,TT> {
  return net.hamnaberg.json.util.F9(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) -> TT).toJava(): net.hamnaberg.json.util.F10<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,TT> {
  return net.hamnaberg.json.util.F10(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) -> TT).toJava(): net.hamnaberg.json.util.F11<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,TT> {
  return net.hamnaberg.json.util.F11(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) -> TT).toJava(): net.hamnaberg.json.util.F12<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,TT> {
  return net.hamnaberg.json.util.F12(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) -> TT).toJava(): net.hamnaberg.json.util.F13<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,TT> {
  return net.hamnaberg.json.util.F13(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) -> TT).toJava(): net.hamnaberg.json.util.F14<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,TT> {
  return net.hamnaberg.json.util.F14(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) -> TT).toJava(): net.hamnaberg.json.util.F15<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,TT> {
  return net.hamnaberg.json.util.F15(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) -> TT).toJava(): net.hamnaberg.json.util.F16<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,TT> {
  return net.hamnaberg.json.util.F16(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) -> TT).toJava(): net.hamnaberg.json.util.F17<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,TT> {
  return net.hamnaberg.json.util.F17(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) -> TT).toJava(): net.hamnaberg.json.util.F18<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,TT> {
  return net.hamnaberg.json.util.F18(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) -> TT).toJava(): net.hamnaberg.json.util.F19<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,TT> {
  return net.hamnaberg.json.util.F19(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) -> TT).toJava(): net.hamnaberg.json.util.F20<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,TT> {
  return net.hamnaberg.json.util.F20(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21) -> TT).toJava(): net.hamnaberg.json.util.F21<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,TT> {
  return net.hamnaberg.json.util.F21(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22) -> TT).toJava(): net.hamnaberg.json.util.F22<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,TT> {
  return net.hamnaberg.json.util.F22(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23) -> TT).toJava(): net.hamnaberg.json.util.F23<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,TT> {
  return net.hamnaberg.json.util.F23(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24) -> TT).toJava(): net.hamnaberg.json.util.F24<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,TT> {
  return net.hamnaberg.json.util.F24(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25) -> TT).toJava(): net.hamnaberg.json.util.F25<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,TT> {
  return net.hamnaberg.json.util.F25(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26) -> TT).toJava(): net.hamnaberg.json.util.F26<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,TT> {
  return net.hamnaberg.json.util.F26(this)
}
   
fun <T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27,TT>((T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27) -> TT).toJava(): net.hamnaberg.json.util.F27<T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27,TT> {
  return net.hamnaberg.json.util.F27(this)
}
   

