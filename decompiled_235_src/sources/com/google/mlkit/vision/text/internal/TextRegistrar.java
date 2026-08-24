package com.google.mlkit.vision.text.internal;

import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TextRegistrar implements tv0 {
    public static final /* synthetic */ int zza = 0;

    @Override // defpackage.tv0
    public final List getComponents() {
        dk0 a = bv0.a(zzp.class);
        a.b(new wh1(1, 0, MlKitContext.class));
        a.B = new sv0() { // from class: com.google.mlkit.vision.text.internal.zzs
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new zzp((MlKitContext) ov0Var.a(MlKitContext.class));
            }
        };
        bv0 j = a.j();
        dk0 a2 = bv0.a(zzo.class);
        a2.b(new wh1(1, 0, zzp.class));
        a2.b(new wh1(1, 0, ExecutorSelector.class));
        a2.B = new sv0() { // from class: com.google.mlkit.vision.text.internal.zzt
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new zzo((zzp) ov0Var.a(zzp.class), (ExecutorSelector) ov0Var.a(ExecutorSelector.class));
            }
        };
        return zzbk.zzi(j, a2.j());
    }
}
