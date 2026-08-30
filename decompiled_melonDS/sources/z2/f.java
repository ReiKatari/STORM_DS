package z2;

import p1.c1;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public j f14910a;

    /* renamed from: b  reason: collision with root package name */
    public long f14911b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14912c;

    /* renamed from: d  reason: collision with root package name */
    public int f14913d;

    public f(long j2, j jVar) {
        int i2;
        int numberOfTrailingZeros;
        this.f14910a = jVar;
        this.f14911b = j2;
        h1 h1Var = l.f14917a;
        if (j2 != 0) {
            j d4 = d();
            long j10 = d4.L;
            long[] jArr = d4.R;
            if (jArr != null) {
                j2 = jArr[0];
            } else {
                long j11 = d4.B;
                if (j11 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                } else {
                    long j12 = d4.A;
                    if (j12 != 0) {
                        j10 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                    }
                }
                j2 = numberOfTrailingZeros + j10;
            }
            synchronized (l.f14919c) {
                i2 = l.f14922f.a(j2);
            }
        } else {
            i2 = -1;
        }
        this.f14913d = i2;
    }

    public static void q(f fVar) {
        l.f14918b.r(fVar);
    }

    public final void a() {
        synchronized (l.f14919c) {
            b();
            p();
        }
    }

    public void b() {
        l.f14920d = l.f14920d.b(g());
    }

    public abstract void c();

    public j d() {
        return this.f14910a;
    }

    public abstract mc.l e();

    public abstract boolean f();

    public long g() {
        return this.f14911b;
    }

    public int h() {
        return 0;
    }

    public abstract mc.l i();

    public final f j() {
        c1 c1Var = l.f14918b;
        f fVar = (f) c1Var.d();
        c1Var.r(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(y yVar);

    public final void o() {
        int i2 = this.f14913d;
        if (i2 >= 0) {
            l.u(i2);
            this.f14913d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f14910a = jVar;
    }

    public void s(long j2) {
        this.f14911b = j2;
    }

    public void t(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(mc.l lVar);
}
