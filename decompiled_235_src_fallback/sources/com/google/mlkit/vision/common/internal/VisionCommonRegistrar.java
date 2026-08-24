package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements defpackage.tv0 {
    public static final /* synthetic */ int zza = 0;

    public VisionCommonRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.tv0
    public final java.util.List getComponents() {
            r4 = this;
            java.lang.Class<com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator> r4 = com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class
            dk0 r4 = defpackage.bv0.a(r4)
            wh1 r0 = new wh1
            r1 = 2
            r2 = 0
            java.lang.Class<com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator$Registration> r3 = com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.Registration.class
            r0.<init>(r1, r2, r3)
            r4.b(r0)
            com.google.mlkit.vision.common.internal.zzf r0 = com.google.mlkit.vision.common.internal.zzf.zza
            java.lang.String r1 = "Null factory"
            defpackage.ln2.k(r0, r1)
            r4.B = r0
            bv0 r4 = r4.j()
            com.google.android.gms.internal.mlkit_vision_common.zzp r4 = com.google.android.gms.internal.mlkit_vision_common.zzp.zzi(r4)
            return r4
    }
}
