// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$75 {

    static final FunctionDescriptor randombytes_buf_deterministic$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle randombytes_buf_deterministic$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "randombytes_buf_deterministic",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)V",
        constants$75.randombytes_buf_deterministic$FUNC, false
    );
    static final FunctionDescriptor randombytes_random$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle randombytes_random$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "randombytes_random",
        "()I",
        constants$75.randombytes_random$FUNC, false
    );
    static final FunctionDescriptor randombytes_uniform$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle randombytes_uniform$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "randombytes_uniform",
        "(I)I",
        constants$75.randombytes_uniform$FUNC, false
    );
    static final FunctionDescriptor randombytes_stir$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle randombytes_stir$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "randombytes_stir",
        "()V",
        constants$75.randombytes_stir$FUNC, false
    );
    static final FunctionDescriptor randombytes_close$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle randombytes_close$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "randombytes_close",
        "()I",
        constants$75.randombytes_close$FUNC, false
    );
    static final FunctionDescriptor randombytes_set_implementation$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle randombytes_set_implementation$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "randombytes_set_implementation",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$75.randombytes_set_implementation$FUNC, false
    );
}


