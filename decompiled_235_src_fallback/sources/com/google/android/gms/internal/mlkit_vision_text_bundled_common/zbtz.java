package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zbtz<MessageType extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz<MessageType, BuilderType>> extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi<MessageType, BuilderType> {
    protected com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf zba;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf zbb;

    public zbtz(MessageType r2) {
            r1 = this;
            r1.<init>()
            r1.zbb = r2
            boolean r0 = r2.zbG()
            if (r0 != 0) goto L12
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = r2.zbt()
            r1.zba = r2
            return
        L12:
            java.lang.String r1 = "Default instance must be immutable."
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    private static void zba(java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r0.zbb(r1)
            r0.zbg(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi
    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz r0 = r0.zbg()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi zbf() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz r0 = r0.zbg()
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz zbg() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r3.zbb
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.zbb(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r3 = r3.zbj()
            r0.zba = r3
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz zbh(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r1.zbb
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L18
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r1.zba
            boolean r0 = r0.zbG()
            if (r0 != 0) goto L13
            r1.zbo()
        L13:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r1.zba
            zba(r0, r2)
        L18:
            return r1
    }

    public final MessageType zbi() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = r1.zbj()
            r0 = 1
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbF(r1, r0)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwk
            r0.<init>(r1)
            throw r0
    }

    public MessageType zbj() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r2.zba
            boolean r0 = r0.zbG()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = r2.zba
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r1.zbB()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = r2.zba
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zbk() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r0.zbi()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zbl() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r0.zbj()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zbm() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final void zbn() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r1.zba
            boolean r0 = r0.zbG()
            if (r0 != 0) goto Lb
            r1.zbo()
        Lb:
            return
    }

    public void zbo() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r2.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r0.zbt()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = r2.zba
            zba(r0, r1)
            r2.zba = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final boolean zbp() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = r1.zba
            r0 = 0
            boolean r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf.zbF(r1, r0)
            return r1
    }
}
