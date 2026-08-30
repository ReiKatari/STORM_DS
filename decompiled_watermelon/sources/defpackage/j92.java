package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j92  reason: default package */
/* loaded from: classes.dex */
public final class j92 implements m93 {
    public static final j92 a = new Object();
    public static final vt4 b = new vt4("kotlin.Float", tt4.l);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        return Float.valueOf(b91Var.Z());
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        mz1Var.H(((Number) obj).floatValue());
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
