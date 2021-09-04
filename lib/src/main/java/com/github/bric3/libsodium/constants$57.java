// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$57 {

    static final FunctionDescriptor crypto_secretbox_easy$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_secretbox_easy$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox_easy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$57.crypto_secretbox_easy$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_open_easy$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_secretbox_open_easy$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox_open_easy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$57.crypto_secretbox_open_easy$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_detached$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_secretbox_detached$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox_detached",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$57.crypto_secretbox_detached$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_open_detached$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_secretbox_open_detached$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox_open_detached",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$57.crypto_secretbox_open_detached$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_secretbox_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$57.crypto_secretbox_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_secretbox_zerobytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_secretbox_zerobytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_secretbox_zerobytes",
        "()J",
        constants$57.crypto_secretbox_zerobytes$FUNC, false
    );
}


