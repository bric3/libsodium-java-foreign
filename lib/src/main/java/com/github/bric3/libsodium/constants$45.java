// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$45 {

    static final FunctionDescriptor crypto_pwhash_argon2i_str_needs_rehash$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_LONG
    );
    static final MethodHandle crypto_pwhash_argon2i_str_needs_rehash$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2i_str_needs_rehash",
        "(Ljdk/incubator/foreign/MemoryAddress;JJ)I",
        constants$45.crypto_pwhash_argon2i_str_needs_rehash$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2id_alg_argon2id13$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle crypto_pwhash_argon2id_alg_argon2id13$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2id_alg_argon2id13",
        "()I",
        constants$45.crypto_pwhash_argon2id_alg_argon2id13$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2id_bytes_min$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2id_bytes_min$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2id_bytes_min",
        "()J",
        constants$45.crypto_pwhash_argon2id_bytes_min$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2id_bytes_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2id_bytes_max$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2id_bytes_max",
        "()J",
        constants$45.crypto_pwhash_argon2id_bytes_max$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2id_passwd_min$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2id_passwd_min$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2id_passwd_min",
        "()J",
        constants$45.crypto_pwhash_argon2id_passwd_min$FUNC, false
    );
    static final FunctionDescriptor crypto_pwhash_argon2id_passwd_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_pwhash_argon2id_passwd_max$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_pwhash_argon2id_passwd_max",
        "()J",
        constants$45.crypto_pwhash_argon2id_passwd_max$FUNC, false
    );
}


