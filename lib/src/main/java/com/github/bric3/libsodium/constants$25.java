// Generated by jextract

package com.github.bric3.libsodium;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$25 {

    static final FunctionDescriptor crypto_box_afternm$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_box_afternm$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_box_afternm",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$25.crypto_box_afternm$FUNC, false
    );
    static final FunctionDescriptor crypto_box_open_afternm$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypto_box_open_afternm$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_box_open_afternm",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$25.crypto_box_open_afternm$FUNC, false
    );
    static final FunctionDescriptor crypto_core_hsalsa20_outputbytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_core_hsalsa20_outputbytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_core_hsalsa20_outputbytes",
        "()J",
        constants$25.crypto_core_hsalsa20_outputbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_core_hsalsa20_inputbytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_core_hsalsa20_inputbytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_core_hsalsa20_inputbytes",
        "()J",
        constants$25.crypto_core_hsalsa20_inputbytes$FUNC, false
    );
    static final FunctionDescriptor crypto_core_hsalsa20_keybytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_core_hsalsa20_keybytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_core_hsalsa20_keybytes",
        "()J",
        constants$25.crypto_core_hsalsa20_keybytes$FUNC, false
    );
    static final FunctionDescriptor crypto_core_hsalsa20_constbytes$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle crypto_core_hsalsa20_constbytes$MH = RuntimeHelper.downcallHandle(
        sodium_h.LIBRARIES, "crypto_core_hsalsa20_constbytes",
        "()J",
        constants$25.crypto_core_hsalsa20_constbytes$FUNC, false
    );
}


