package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbsj<MessageType extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi<MessageType, BuilderType>> implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm {
    protected int zba;

    public zbsj() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zba = r0
            return
    }

    public int zbj(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc zbk() {
            r4 = this;
            int r0 = r4.zbo()     // Catch: java.io.IOException -> L16
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb     // Catch: java.io.IOException -> L16
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L16
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth     // Catch: java.io.IOException -> L16
            r3 = 0
            r2.<init>(r1, r3, r0)     // Catch: java.io.IOException -> L16
            r4.zbL(r2)     // Catch: java.io.IOException -> L16
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsy.zba(r2, r1)     // Catch: java.io.IOException -> L16
            return r4
        L16:
            r0 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "Serializing "
            java.lang.String r2 = " to a ByteString threw an IOException (should never happen)."
            java.lang.String r4 = defpackage.lb1.A(r1, r4, r2)
            defpackage.u34.p(r4, r0)
            r4 = 0
            return r4
    }

    public final byte[] zbl() {
            r4 = this;
            int r0 = r4.zbo()     // Catch: java.io.IOException -> L13
            byte[] r1 = new byte[r0]     // Catch: java.io.IOException -> L13
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth     // Catch: java.io.IOException -> L13
            r3 = 0
            r2.<init>(r1, r3, r0)     // Catch: java.io.IOException -> L13
            r4.zbL(r2)     // Catch: java.io.IOException -> L13
            r2.zbF()     // Catch: java.io.IOException -> L13
            return r1
        L13:
            r0 = move-exception
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "Serializing "
            java.lang.String r2 = " to a byte array threw an IOException (should never happen)."
            java.lang.String r4 = defpackage.lb1.A(r1, r4, r2)
            defpackage.u34.p(r4, r0)
            r4 = 0
            return r4
    }
}
