package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl6  reason: default package */
/* loaded from: classes.dex */
public abstract class vl6 {
    public zl6 a;
    public long b;
    public boolean c;
    public int d;

    public vl6(long j, zl6 zl6Var) {
        int i;
        int numberOfTrailingZeros;
        this.a = zl6Var;
        this.b = j;
        r76 r76Var = bm6.a;
        if (j != 0) {
            zl6 d = d();
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
            synchronized (bm6.c) {
                i = bm6.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(vl6 vl6Var) {
        bm6.b.F(vl6Var);
    }

    public final void a() {
        synchronized (bm6.c) {
            b();
            p();
        }
    }

    public void b() {
        bm6.d = bm6.d.b(g());
    }

    public abstract void c();

    public zl6 d() {
        return this.a;
    }

    public abstract qn2 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract qn2 i();

    public final vl6 j() {
        m44 m44Var = bm6.b;
        vl6 vl6Var = (vl6) m44Var.f();
        m44Var.F(this);
        return vl6Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(eq6 eq6Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            bm6.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(zl6 zl6Var) {
        this.a = zl6Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract vl6 u(qn2 qn2Var);
}
