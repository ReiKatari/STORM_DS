package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nz implements kl2 {
    public static final nz a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, java.lang.Object, nz] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.parcelables.BackgroundParcelable", obj, 3);
        hp4Var.l("uuid", false);
        hp4Var.l("name", false);
        hp4Var.l("uri", false);
        descriptor = hp4Var;
    }

    @Override // defpackage.kl2
    public final m93[] a() {
        yg6 yg6Var = yg6.a;
        return new m93[]{yg6Var, yg6Var, yg6Var};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        c.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = c.v(h06Var);
            if (v != -1) {
                if (v != 0) {
                    if (v != 1) {
                        if (v == 2) {
                            str3 = c.K(h06Var, 2);
                            i |= 4;
                        } else {
                            throw new q27(v);
                        }
                    } else {
                        str2 = c.K(h06Var, 1);
                        i |= 2;
                    }
                } else {
                    str = c.K(h06Var, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.a(h06Var);
        return new pz(i, str, str2, str3);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        pz pzVar = (pz) obj;
        pzVar.getClass();
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        c.z(h06Var, 0, pzVar.A);
        c.z(h06Var, 1, pzVar.B);
        c.z(h06Var, 2, pzVar.L);
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
