package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o73  reason: default package */
/* loaded from: classes.dex */
public final class o73 implements m93 {
    public static final o73 a = new Object();
    public static final j06 b = oo2.t("kotlinx.serialization.json.JsonElement", zp4.i, new h06[0], new qu1(22));

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        return sn2.m(b91Var).I();
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        k73 k73Var = (k73) obj;
        k73Var.getClass();
        sn2.j(mz1Var);
        if (k73Var instanceof k83) {
            mz1Var.l(n83.a, k73Var);
        } else if (k73Var instanceof f83) {
            mz1Var.l(i83.a, k73Var);
        } else if (k73Var instanceof y63) {
            mz1Var.l(b73.a, k73Var);
        } else {
            i.c();
        }
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
