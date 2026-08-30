package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d83  reason: default package */
/* loaded from: classes.dex */
public final class d83 implements m93 {
    public static final d83 a = new Object();
    public static final j06 b = oo2.u("kotlinx.serialization.json.JsonNull", m06.h, new h06[0]);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        sn2.m(b91Var);
        if (!b91Var.i()) {
            return b83.INSTANCE;
        }
        throw new t73(io2.u("Expected 'null' literal", null, -1, null, null));
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        ((b83) obj).getClass();
        sn2.j(mz1Var);
        mz1Var.g();
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
