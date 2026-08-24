package com.google.mlkit.vision.text.pipeline;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbn {
    public zbn() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.vision.text.pipeline.zbn zbe(com.google.mlkit.vision.text.pipeline.zbo r4) {
            com.google.mlkit.vision.text.pipeline.zba r0 = new com.google.mlkit.vision.text.pipeline.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok
            java.lang.String r2 = ""
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbh()
            r1.<init>(r2, r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbh()
            r3 = 0
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    public abstract com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx zba();

    public abstract com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok zbb();

    public abstract com.google.mlkit.vision.text.pipeline.zbo zbc();

    public abstract boolean zbd();
}
