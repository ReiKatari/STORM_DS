package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r70  reason: default package */
/* loaded from: classes.dex */
public final class r70 implements m93 {
    public static final r70 a = new Object();
    public static final vt4 b = new vt4("kotlin.Byte", tt4.i);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        return Byte.valueOf(b91Var.Q());
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        mz1Var.s(((Number) obj).byteValue());
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
