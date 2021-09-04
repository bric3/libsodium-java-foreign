// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$11 {

    static final FunctionDescriptor crypto_auth_hmacsha512_statebytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_auth_hmacsha512_statebytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha512_statebytes",
        "()J",
        constants$11.crypto_auth_hmacsha512_statebytes$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512_init$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle crypto_auth_hmacsha512_init$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha512_init",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$11.crypto_auth_hmacsha512_init$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512_update$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_auth_hmacsha512_update$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha512_update",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$11.crypto_auth_hmacsha512_update$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512_final$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_auth_hmacsha512_final$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha512_final",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.crypto_auth_hmacsha512_final$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_auth_hmacsha512_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha512_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$11.crypto_auth_hmacsha512_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha512256_bytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_auth_hmacsha512256_bytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha512256_bytes",
        "()J",
        constants$11.crypto_auth_hmacsha512256_bytes$FUNC, false
    );
}


