package y;

import android.hardware.camera2.params.DynamicRangeProfiles;
import d0.a0;
import java.util.Collections;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final rd.k f14634a = new rd.k(23, new Object());

    /* renamed from: b  reason: collision with root package name */
    public static final Set f14635b = Collections.singleton(a0.f3320d);

    @Override // y.b
    public final Set a() {
        return f14635b;
    }

    @Override // y.b
    public final Set b(a0 a0Var) {
        boolean equals = a0.f3320d.equals(a0Var);
        p7.m.g("DynamicRange is not supported: " + a0Var, equals);
        return f14635b;
    }

    @Override // y.b
    public final DynamicRangeProfiles c() {
        return null;
    }
}
