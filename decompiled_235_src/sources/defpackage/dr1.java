package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr1  reason: default package */
/* loaded from: classes.dex */
public final class dr1 implements br1 {
    public static final d51 a = new d51(new Object(), 14);
    public static final Set b = ii2.R(yq1.d);

    @Override // defpackage.br1
    public final Set a() {
        return b;
    }

    @Override // defpackage.br1
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // defpackage.br1
    public final Set c(yq1 yq1Var) {
        yq1Var.getClass();
        boolean equals = yq1.d.equals(yq1Var);
        np2.s("DynamicRange is not supported: " + yq1Var, equals);
        return b;
    }
}
