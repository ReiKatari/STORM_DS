package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xm1  reason: default package */
/* loaded from: classes.dex */
public final class xm1 implements vm1 {
    public static final t71 a = new t71(12, new Object());
    public static final Set b = hi2.X(sm1.d);

    @Override // defpackage.vm1
    public final Set a() {
        return b;
    }

    @Override // defpackage.vm1
    public final Set b(sm1 sm1Var) {
        sm1Var.getClass();
        boolean equals = sm1.d.equals(sm1Var);
        nl2.y("DynamicRange is not supported: " + sm1Var, equals);
        return b;
    }

    @Override // defpackage.vm1
    public final DynamicRangeProfiles c() {
        return null;
    }
}
