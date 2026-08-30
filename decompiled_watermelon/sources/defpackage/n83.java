package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n83  reason: default package */
/* loaded from: classes.dex */
public final class n83 implements m93 {
    public static final n83 a = new Object();
    public static final j06 b = oo2.u("kotlinx.serialization.json.JsonPrimitive", tt4.p, new h06[0]);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        String str;
        f73 m = sn2.m(b91Var);
        k73 I = m.I();
        if (!(I instanceof k83)) {
            String str2 = "Unexpected JSON element, expected JsonPrimitive, had " + q75.a(I.getClass());
            if (m.D().a.g) {
                str = io2.Z(-1, I.toString()).toString();
            } else {
                str = null;
            }
            throw new t73(io2.u(str2, null, -1, null, str));
        }
        return (k83) I;
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        k83 k83Var = (k83) obj;
        k83Var.getClass();
        sn2.j(mz1Var);
        if (k83Var instanceof b83) {
            mz1Var.l(d83.a, b83.INSTANCE);
        } else {
            mz1Var.l(y73.a, (x73) k83Var);
        }
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
