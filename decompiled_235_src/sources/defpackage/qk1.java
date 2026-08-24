package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk1  reason: default package */
/* loaded from: classes.dex */
public abstract class qk1 extends mz6 {
    public int L;

    public qk1(int i) {
        super(0L, false);
        this.L = i;
    }

    public abstract r41 d();

    public Throwable e(Object obj) {
        av0 av0Var;
        if (obj instanceof av0) {
            av0Var = (av0) obj;
        } else {
            av0Var = null;
        }
        if (av0Var == null) {
            return null;
        }
        return av0Var.a;
    }

    public final void h(Throwable th) {
        f04.H(d().b(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        r4 = (defpackage.rc3) r5.Z(defpackage.vs0.h0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        eg7 eg7Var;
        try {
            r41 d = d();
            d.getClass();
            nk1 nk1Var = (nk1) d;
            s41 s41Var = nk1Var.X;
            Object obj = nk1Var.Z;
            l61 b = s41Var.b();
            Object c = k57.c(b, obj);
            rc3 rc3Var = null;
            if (c != k57.a) {
                eg7Var = mb3.O(s41Var, b, c);
            } else {
                eg7Var = null;
            }
            try {
                l61 b2 = s41Var.b();
                Object k = k();
                Throwable e = e(k);
                if (e == null) {
                    int i = this.L;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (rc3Var != null && !rc3Var.e()) {
                    CancellationException v = rc3Var.v();
                    c(v);
                    s41Var.i(oi2.p(v));
                } else if (e != null) {
                    s41Var.i(new em5(e));
                } else {
                    s41Var.i(g(k));
                }
                if (eg7Var == null || eg7Var.x0()) {
                    k57.a(b, c);
                }
            } catch (Throwable th) {
                if (eg7Var == null || eg7Var.x0()) {
                    k57.a(b, c);
                }
                throw th;
            }
        } catch (mk1 e2) {
            f04.H(d().b(), e2.A);
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
