package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg2  reason: default package */
/* loaded from: classes.dex */
public final class kg2 implements m26 {
    public static final kg2 a = new Object();

    @Override // defpackage.m26
    public final a74 b(a74 a74Var, float f, boolean z) {
        if (f <= 0.0d) {
            n53.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return a74Var.d(new vn3(f, true));
    }
}
