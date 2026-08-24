package com.google.mlkit.vision.common.internal;

import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VisionCommonRegistrar implements tv0 {
    public static final /* synthetic */ int zza = 0;

    @Override // defpackage.tv0
    public final List getComponents() {
        dk0 a = bv0.a(MultiFlavorDetectorCreator.class);
        a.b(new wh1(2, 0, MultiFlavorDetectorCreator.Registration.class));
        zzf zzfVar = new sv0() { // from class: com.google.mlkit.vision.common.internal.zzf
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new MultiFlavorDetectorCreator(ov0Var.d(MultiFlavorDetectorCreator.Registration.class));
            }
        };
        ln2.k(zzfVar, "Null factory");
        a.B = zzfVar;
        return zzp.zzi(a.j());
    }
}
