package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo3  reason: default package */
/* loaded from: classes.dex */
public final class wo3 implements f34 {
    public final yo3 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final f34 e;
    public final float f;
    public final boolean g;
    public final w61 h;
    public final qh1 i;
    public final int j;
    public final qn2 k;
    public final qn2 l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final lo4 q;
    public final int r;
    public final int s;

    public wo3(yo3 yo3Var, int i, boolean z, float f, f34 f34Var, float f2, boolean z2, w61 w61Var, qh1 qh1Var, int i2, qn2 qn2Var, qn2 qn2Var2, List list, int i3, int i4, int i5, lo4 lo4Var, int i6, int i7) {
        this.a = yo3Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = f34Var;
        this.f = f2;
        this.g = z2;
        this.h = w61Var;
        this.i = qh1Var;
        this.j = i2;
        this.k = qn2Var;
        this.l = qn2Var2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = lo4Var;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.f34
    public final void a() {
        this.e.a();
    }

    @Override // defpackage.f34
    public final Map b() {
        return this.e.b();
    }

    @Override // defpackage.f34
    public final qn2 c() {
        return this.e.c();
    }

    public final wo3 d(int i, boolean z) {
        yo3 yo3Var;
        if (!this.g) {
            List list = this.m;
            if (!list.isEmpty() && (yo3Var = this.a) != null) {
                int i2 = yo3Var.g;
                int i3 = this.b - i;
                if (i3 >= 0 && i3 < i2) {
                    xo3 xo3Var = (xo3) gt0.H0(list);
                    xo3 xo3Var2 = (xo3) gt0.Q0(list);
                    if (!xo3Var.r && !xo3Var2.r) {
                        int i4 = this.o;
                        int i5 = this.n;
                        lo4 lo4Var = this.q;
                        if (i < 0) {
                            if (Math.min((oi2.O(xo3Var, lo4Var) + xo3Var.l) - i5, (oi2.O(xo3Var2, lo4Var) + xo3Var2.l) - i4) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i5 - oi2.O(xo3Var, lo4Var), i4 - oi2.O(xo3Var2, lo4Var)) <= i) {
                            return null;
                        }
                        int size = list.size();
                        boolean z2 = false;
                        for (int i6 = 0; i6 < size; i6++) {
                            xo3 xo3Var3 = (xo3) list.get(i6);
                            xo3Var3.getClass();
                            if (!xo3Var3.r) {
                                long j = xo3Var3.o;
                                xo3Var3.o = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + i) & 4294967295L);
                                if (z) {
                                    int size2 = xo3Var3.e.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        xo3Var3.h.b(i7, xo3Var3.b);
                                    }
                                }
                            }
                        }
                        return new wo3(this.a, i3, (this.c || i > 0) ? true : true, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list, this.n, this.o, this.p, this.q, this.r, this.s);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long e() {
        f34 f34Var = this.e;
        return (f34Var.getWidth() << 32) | (f34Var.getHeight() & 4294967295L);
    }

    @Override // defpackage.f34
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.f34
    public final int getWidth() {
        return this.e.getWidth();
    }
}
