// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$44 {

    static final FunctionDescriptor crypto_pwhash_argon2i_memlimit_moderate$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2i_memlimit_moderate$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_memlimit_moderate",
        "()J",
        constants$44.crypto_pwhash_argon2i_memlimit_moderate$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_opslimit_sensitive$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2i_opslimit_sensitive$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_opslimit_sensitive",
        "()J",
        constants$44.crypto_pwhash_argon2i_opslimit_sensitive$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_memlimit_sensitive$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2i_memlimit_sensitive$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_memlimit_sensitive",
        "()J",
        constants$44.crypto_pwhash_argon2i_memlimit_sensitive$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_LONG,
        C_INT
    );
    static final MethodHandle crypto_pwhash_argon2i$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;JJI)I",
        constants$44.crypto_pwhash_argon2i$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_str$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_LONG
    );
    static final MethodHandle crypto_pwhash_argon2i_str$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_str",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJJ)I",
        constants$44.crypto_pwhash_argon2i_str$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2i_str_verify$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle crypto_pwhash_argon2i_str_verify$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_str_verify",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$44.crypto_pwhash_argon2i_str_verify$FUNC, false
    );
}


