package net.hamnaberg.json.codec.kotlin

import net.hamnaberg.json.codec.DecodeJson
import net.hamnaberg.json.kotlin.toJava
import net.hamnaberg.json.codec.Decoders as JDecoders
import net.hamnaberg.json.codec.FieldDecoder as FD

object KotlinDecoders {
    fun <T1, TT> decode(fd1: FD<T1>, f: (T1) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, f.toJava())
    }

    fun <T1, T2, TT> decode(fd1: FD<T1>, fd2: FD<T2>, f: (T1, T2) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, f.toJava())
    }

    fun <T1, T2, T3, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, f: (T1, T2, T3) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, f.toJava())
    }

    fun <T1, T2, T3, T4, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, f: (T1, T2, T3, T4) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, f: (T1, T2, T3, T4, T5) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, f: (T1, T2, T3, T4, T5, T6) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, f: (T1, T2, T3, T4, T5, T6, T7) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, f: (T1, T2, T3, T4, T5, T6, T7, T8) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, fd20: FD<T20>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, fd20, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, fd20: FD<T20>, fd21: FD<T21>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, fd20, fd21, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, fd20: FD<T20>, fd21: FD<T21>, fd22: FD<T22>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, fd20, fd21, fd22, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, fd20: FD<T20>, fd21: FD<T21>, fd22: FD<T22>, fd23: FD<T23>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, fd20, fd21, fd22, fd23, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, fd20: FD<T20>, fd21: FD<T21>, fd22: FD<T22>, fd23: FD<T23>, fd24: FD<T24>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, fd20, fd21, fd22, fd23, fd24, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, fd20: FD<T20>, fd21: FD<T21>, fd22: FD<T22>, fd23: FD<T23>, fd24: FD<T24>, fd25: FD<T25>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, fd20, fd21, fd22, fd23, fd24, fd25, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, fd20: FD<T20>, fd21: FD<T21>, fd22: FD<T22>, fd23: FD<T23>, fd24: FD<T24>, fd25: FD<T25>, fd26: FD<T26>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, fd20, fd21, fd22, fd23, fd24, fd25, fd26, f.toJava())
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, TT> decode(fd1: FD<T1>, fd2: FD<T2>, fd3: FD<T3>, fd4: FD<T4>, fd5: FD<T5>, fd6: FD<T6>, fd7: FD<T7>, fd8: FD<T8>, fd9: FD<T9>, fd10: FD<T10>, fd11: FD<T11>, fd12: FD<T12>, fd13: FD<T13>, fd14: FD<T14>, fd15: FD<T15>, fd16: FD<T16>, fd17: FD<T17>, fd18: FD<T18>, fd19: FD<T19>, fd20: FD<T20>, fd21: FD<T21>, fd22: FD<T22>, fd23: FD<T23>, fd24: FD<T24>, fd25: FD<T25>, fd26: FD<T26>, fd27: FD<T27>, f: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27) -> TT): DecodeJson<TT> {
        return JDecoders.decode(fd1, fd2, fd3, fd4, fd5, fd6, fd7, fd8, fd9, fd10, fd11, fd12, fd13, fd14, fd15, fd16, fd17, fd18, fd19, fd20, fd21, fd22, fd23, fd24, fd25, fd26, fd27, f.toJava())
    }

}

