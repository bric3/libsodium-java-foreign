// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$15 {

    static final FunctionDescriptor crypto_hash_sha256_update$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_hash_sha256_update$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_hash_sha256_update",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$15.crypto_hash_sha256_update$FUNC, false
    );
    static final FunctionDescriptor crypto_hash_sha256_final$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_hash_sha256_final$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_hash_sha256_final",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$15.crypto_hash_sha256_final$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha256_bytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_auth_hmacsha256_bytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256_bytes",
        "()J",
        constants$15.crypto_auth_hmacsha256_bytes$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha256_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_auth_hmacsha256_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256_keybytes",
        "()J",
        constants$15.crypto_auth_hmacsha256_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha256$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle crypto_auth_hmacsha256$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$15.crypto_auth_hmacsha256$FUNC, false
    );
    static final FunctionDescriptor crypto_auth_hmacsha256_verify$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle crypto_auth_hmacsha256_verify$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_auth_hmacsha256_verify",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$15.crypto_auth_hmacsha256_verify$FUNC, false
    );
}


