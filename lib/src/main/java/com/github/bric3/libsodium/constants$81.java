// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$81 {

    static final FunctionDescriptor sodium_munlock$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle sodium_munlock$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_munlock",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$81.sodium_munlock$FUNC, false
    );
    static final FunctionDescriptor sodium_malloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG
    );
    static final MethodHandle sodium_malloc$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_malloc",
        "(J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$81.sodium_malloc$FUNC, false
    );
    static final FunctionDescriptor sodium_allocarray$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle sodium_allocarray$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_allocarray",
        "(JJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$81.sodium_allocarray$FUNC, false
    );
    static final FunctionDescriptor sodium_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle sodium_free$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$81.sodium_free$FUNC, false
    );
    static final FunctionDescriptor sodium_mprotect_noaccess$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle sodium_mprotect_noaccess$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_mprotect_noaccess",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$81.sodium_mprotect_noaccess$FUNC, false
    );
    static final FunctionDescriptor sodium_mprotect_readonly$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle sodium_mprotect_readonly$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_mprotect_readonly",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$81.sodium_mprotect_readonly$FUNC, false
    );
}


