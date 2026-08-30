package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ga6  reason: default package */
/* loaded from: classes.dex */
public abstract class ga6 {
    public ka6 a;
    public long b;
    public boolean c;
    public int d;

    public ga6(long j, ka6 ka6Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = ka6Var;
        this.b = j;
        d96 d96Var = ma6.a;
        if (j != 0) {
            ka6 d = d();
            long j2 = d.L;
            long[] jArr = d.R;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.B;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.A;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (ma6.c) {
                i = ma6.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(ga6 ga6Var) {
        ma6.b.u(ga6Var);
    }

    public final void a() {
        synchronized (ma6.c) {
            b();
            p();
        }
    }

    public void b() {
        ma6.d = ma6.d.c(g());
    }

    public abstract void c();

    public ka6 d() {
        return this.a;
    }

    public abstract mi2 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract mi2 i();

    public final ga6 j() {
        n85 n85Var = ma6.b;
        ga6 ga6Var = (ga6) n85Var.d();
        n85Var.u(this);
        return ga6Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(pe6 pe6Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            ma6.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(ka6 ka6Var) {
        this.a = ka6Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ga6 u(mi2 mi2Var);
}
