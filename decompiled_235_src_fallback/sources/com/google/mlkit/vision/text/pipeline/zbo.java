package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbo {
    public zbo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.vision.text.pipeline.zbo zbc(int r1, android.os.RemoteException r2) {
            com.google.mlkit.vision.text.pipeline.zbb r0 = new com.google.mlkit.vision.text.pipeline.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbe(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public abstract int zba();

    public abstract com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki zbb();

    public final boolean zbd() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r0 = r0.zbb()
            boolean r0 = r0.zbc()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }
}
