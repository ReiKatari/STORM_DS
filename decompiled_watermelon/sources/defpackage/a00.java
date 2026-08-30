package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a00 implements kl2 {
    public static final a00 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [a00, kl2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.ui.backgrounds.BackgroundsNavigation.BackgroundPreview", obj, 1);
        hp4Var.l("backgroundParcelable", false);
        descriptor = hp4Var;
    }

    @Override // defpackage.kl2
    public final m93[] a() {
        return new m93[]{nz.a};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        c.getClass();
        pz pzVar = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int v = c.v(h06Var);
            if (v != -1) {
                if (v == 0) {
                    pzVar = (pz) c.U(h06Var, 0, nz.a, pzVar);
                    i = 1;
                } else {
                    throw new q27(v);
                }
            } else {
                z = false;
            }
        }
        c.a(h06Var);
        return new c00(i, pzVar);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        c00 c00Var = (c00) obj;
        c00Var.getClass();
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        c.F(h06Var, 0, nz.a, c00Var.o);
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
