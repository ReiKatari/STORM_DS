package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w30  reason: default package */
/* loaded from: classes.dex */
public final class w30 implements m93 {
    public static final w30 a = new Object();
    public static final vt4 b = new vt4("kotlin.Boolean", tt4.h);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        return Boolean.valueOf(b91Var.h());
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        mz1Var.w(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
