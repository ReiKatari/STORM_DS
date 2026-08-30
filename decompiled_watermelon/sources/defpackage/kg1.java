package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kg1  reason: default package */
/* loaded from: classes.dex */
public abstract class kg1 {
    public static final an1 a = new an1("UNDEFINED", 9);
    public static final an1 b = new an1("REUSABLE_CLAIMED", 9);

    public static final void a(j11 j11Var, Object obj) {
        Object ns0Var;
        j27 j27Var;
        if (j11Var instanceof jg1) {
            jg1 jg1Var = (jg1) j11Var;
            g31 g31Var = jg1Var.R;
            k11 k11Var = jg1Var.X;
            Throwable a2 = nc5.a(obj);
            if (a2 == null) {
                ns0Var = obj;
            } else {
                ns0Var = new ns0(a2, false);
            }
            if (c(g31Var, k11Var.a())) {
                jg1Var.Y = ns0Var;
                jg1Var.L = 1;
                b(g31Var, k11Var.a(), jg1Var);
                return;
            }
            u12 a3 = vs6.a();
            if (a3.L >= 4294967296L) {
                jg1Var.Y = ns0Var;
                jg1Var.L = 1;
                a3.o0(jg1Var);
                return;
            }
            a3.p0(true);
            try {
                c63 c63Var = (c63) k11Var.a().I(k45.d0);
                if (c63Var != null && !c63Var.d()) {
                    jg1Var.k(me2.o(c63Var.K()));
                } else {
                    Object obj2 = jg1Var.Z;
                    e31 a4 = k11Var.a();
                    Object c = ts6.c(a4, obj2);
                    if (c != ts6.a) {
                        j27Var = pu.O(k11Var, a4, c);
                    } else {
                        j27Var = null;
                    }
                    k11Var.k(obj);
                    if (j27Var == null || j27Var.x0()) {
                        ts6.a(a4, c);
                    }
                }
                do {
                } while (a3.r0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        j11Var.k(obj);
    }

    public static final void b(g31 g31Var, e31 e31Var, Runnable runnable) {
        try {
            g31Var.j0(e31Var, runnable);
        } catch (Throwable th) {
            throw new ig1(th, g31Var, e31Var);
        }
    }

    public static final boolean c(g31 g31Var, e31 e31Var) {
        try {
            return g31Var.l0(e31Var);
        } catch (Throwable th) {
            throw new ig1(th, g31Var, e31Var);
        }
    }
}
