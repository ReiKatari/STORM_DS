package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: om0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class om0 implements kl2 {
    public static final om0 a;
    private static final h06 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [kl2, om0, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        hp4 hp4Var = new hp4("me.magnum.melonds.ui.cheats.CheatsNavigation.FolderCheats", obj, 1);
        hp4Var.l("folderName", false);
        descriptor = hp4Var;
    }

    @Override // defpackage.kl2
    public final m93[] a() {
        return new m93[]{l07.R(yg6.a)};
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        h06 h06Var = descriptor;
        yu0 c = b91Var.c(h06Var);
        c.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int v = c.v(h06Var);
            if (v != -1) {
                if (v == 0) {
                    str = (String) c.u(h06Var, 0, yg6.a, str);
                    i = 1;
                } else {
                    throw new q27(v);
                }
            } else {
                z = false;
            }
        }
        c.a(h06Var);
        return new qm0(i, str);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        qm0 qm0Var = (qm0) obj;
        qm0Var.getClass();
        h06 h06Var = descriptor;
        zu0 c = mz1Var.c(h06Var);
        c.N(h06Var, 0, yg6.a, qm0Var.t);
        c.a(h06Var);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return descriptor;
    }
}
