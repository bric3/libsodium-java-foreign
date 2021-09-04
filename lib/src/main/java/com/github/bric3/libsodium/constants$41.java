// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$41 {

    static final FunctionDescriptor crypto_onetimeauth_update$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_onetimeauth_update$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_update",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$41.crypto_onetimeauth_update$FUNC, false
    );
    static final FunctionDescriptor crypto_onetimeauth_final$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_onetimeauth_final$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_final",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$41.crypto_onetimeauth_final$FUNC, false
    );
    static final FunctionDescriptor crypto_onetimeauth_keygen$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle crypto_onetimeauth_keygen$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_onetimeauth_keygen",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$41.crypto_onetimeauth_keygen$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_alg_argon2i13$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle crypto_pwhash_argon2i_alg_argon2i13$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_alg_argon2i13",
        "()I",
        constants$41.crypto_pwhash_argon2i_alg_argon2i13$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_bytes_min$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2i_bytes_min$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_bytes_min",
        "()J",
        constants$41.crypto_pwhash_argon2i_bytes_min$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_bytes_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2i_bytes_max$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_bytes_max",
        "()J",
        constants$41.crypto_pwhash_argon2i_bytes_max$FUNC, false
    );
}


