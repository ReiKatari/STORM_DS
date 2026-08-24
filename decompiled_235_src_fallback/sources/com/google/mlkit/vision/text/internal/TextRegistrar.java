package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextRegistrar implements defpackage.tv0 {
    public static final /* synthetic */ int zza = 0;

    public TextRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.tv0
    public final java.util.List getComponents() {
            r5 = this;
            java.lang.Class<com.google.mlkit.vision.text.internal.zzp> r5 = com.google.mlkit.vision.text.internal.zzp.class
            dk0 r0 = defpackage.bv0.a(r5)
            wh1 r1 = new wh1
            r2 = 1
            r3 = 0
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r4 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            r1.<init>(r2, r3, r4)
            r0.b(r1)
            com.google.mlkit.vision.text.internal.zzs r1 = new com.google.mlkit.vision.text.internal.zzs
            r1.<init>()
            r0.B = r1
            bv0 r0 = r0.j()
            java.lang.Class<com.google.mlkit.vision.text.internal.zzo> r1 = com.google.mlkit.vision.text.internal.zzo.class
            dk0 r1 = defpackage.bv0.a(r1)
            wh1 r4 = new wh1
            r4.<init>(r2, r3, r5)
            r1.b(r4)
            wh1 r5 = new wh1
            java.lang.Class<com.google.mlkit.common.sdkinternal.ExecutorSelector> r4 = com.google.mlkit.common.sdkinternal.ExecutorSelector.class
            r5.<init>(r2, r3, r4)
            r1.b(r5)
            com.google.mlkit.vision.text.internal.zzt r5 = new com.google.mlkit.vision.text.internal.zzt
            r5.<init>()
            r1.B = r5
            bv0 r5 = r1.j()
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r5 = com.google.android.gms.internal.mlkit_vision_text_common.zzbk.zzi(r0, r5)
            return r5
    }
}
