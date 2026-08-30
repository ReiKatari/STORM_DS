package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e84  reason: default package */
/* loaded from: classes.dex */
public final class e84 implements m93 {
    public static final e84 a = new Object();
    public static final d84 b = d84.a;

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        throw new IllegalArgumentException("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        ((Void) obj).getClass();
        throw new IllegalArgumentException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
