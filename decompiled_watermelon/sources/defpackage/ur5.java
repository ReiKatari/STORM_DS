package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ur5  reason: default package */
/* loaded from: classes.dex */
public final class ur5 implements tr5 {
    public static final ur5 a = new Object();

    @Override // defpackage.tr5
    public final zy3 a(zy3 zy3Var, float f, boolean z) {
        if (f <= 0.0d) {
            kz2.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return zy3Var.f(new xg3(f, z));
    }
}
