// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$76 {

    static final FunctionDescriptor randombytes_implementation_name$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle randombytes_implementation_name$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "randombytes_implementation_name",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$76.randombytes_implementation_name$FUNC, false
    );
    static final FunctionDescriptor randombytes$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle randombytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "randombytes",
        "(Ljdk/incubator/foreign/MemoryAddress;J)V",
        constants$76.randombytes$FUNC, false
    );
    static final MemoryLayout randombytes_internal_implementation$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("implementation_name"),
        C_POINTER.withName("random"),
        C_POINTER.withName("stir"),
        C_POINTER.withName("uniform"),
        C_POINTER.withName("buf"),
        C_POINTER.withName("close")
    ).withName("randombytes_implementation");
    static final MemorySegment randombytes_internal_implementation$SEGMENT = RuntimeHelper.lookupGlobalVariable(sodium_h.LIBRARIES, "randombytes_internal_implementation", constants$76.randombytes_internal_implementation$LAYOUT);
    static final MemoryLayout randombytes_sysrandom_implementation$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("implementation_name"),
        C_POINTER.withName("random"),
        C_POINTER.withName("stir"),
        C_POINTER.withName("uniform"),
        C_POINTER.withName("buf"),
        C_POINTER.withName("close")
    ).withName("randombytes_implementation");
    static final MemorySegment randombytes_sysrandom_implementation$SEGMENT = RuntimeHelper.lookupGlobalVariable(sodium_h.LIBRARIES, "randombytes_sysrandom_implementation", constants$76.randombytes_sysrandom_implementation$LAYOUT);
    static final FunctionDescriptor sodium_runtime_has_neon$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle sodium_runtime_has_neon$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_runtime_has_neon",
        "()I",
        constants$76.sodium_runtime_has_neon$FUNC, false
    );
    static final FunctionDescriptor sodium_runtime_has_sse2$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle sodium_runtime_has_sse2$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "sodium_runtime_has_sse2",
        "()I",
        constants$76.sodium_runtime_has_sse2$FUNC, false
    );
}


