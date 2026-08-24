package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok1  reason: default package */
/* loaded from: classes.dex */
public abstract class ok1 {
    public static final gr1 a = new gr1("UNDEFINED", 9);
    public static final gr1 b = new gr1("REUSABLE_CLAIMED", 9);

    public static final void a(r41 r41Var, Object obj) {
        Object av0Var;
        eg7 eg7Var;
        if (r41Var instanceof nk1) {
            nk1 nk1Var = (nk1) r41Var;
            n61 n61Var = nk1Var.R;
            s41 s41Var = nk1Var.X;
            Throwable a2 = hm5.a(obj);
            if (a2 == null) {
                av0Var = obj;
            } else {
                av0Var = new av0(a2, false);
            }
            if (c(n61Var, s41Var.b())) {
                nk1Var.Y = av0Var;
                nk1Var.L = 1;
                b(n61Var, s41Var.b(), nk1Var);
                return;
            }
            l62 a3 = m57.a();
            if (a3.L >= 4294967296L) {
                nk1Var.Y = av0Var;
                nk1Var.L = 1;
                a3.o0(nk1Var);
                return;
            }
            a3.p0(true);
            try {
                rc3 rc3Var = (rc3) s41Var.b().Z(vs0.h0);
                if (rc3Var != null && !rc3Var.e()) {
                    nk1Var.i(oi2.p(rc3Var.v()));
                } else {
                    Object obj2 = nk1Var.Z;
                    l61 b2 = s41Var.b();
                    Object c = k57.c(b2, obj2);
                    if (c != k57.a) {
                        eg7Var = mb3.O(s41Var, b2, c);
                    } else {
                        eg7Var = null;
                    }
                    s41Var.i(obj);
                    if (eg7Var == null || eg7Var.x0()) {
                        k57.a(b2, c);
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
        r41Var.i(obj);
    }

    public static final void b(n61 n61Var, l61 l61Var, Runnable runnable) {
        try {
            n61Var.j0(l61Var, runnable);
        } catch (Throwable th) {
            throw new mk1(th, n61Var, l61Var);
        }
    }

    public static final boolean c(n61 n61Var, l61 l61Var) {
        try {
            return n61Var.l0(l61Var);
        } catch (Throwable th) {
            throw new mk1(th, n61Var, l61Var);
        }
    }
}
