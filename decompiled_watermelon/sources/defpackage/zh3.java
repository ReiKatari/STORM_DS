package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zh3  reason: default package */
/* loaded from: classes.dex */
public final class zh3 implements hj3 {
    public final int a;
    public final Object b;
    public final int c;
    public final sd3 d;
    public final List e;
    public final long f;
    public final Object g;
    public final bj3 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public int m = Integer.MIN_VALUE;
    public final long n;
    public long o;
    public int p;
    public int q;
    public boolean r;

    public zh3(int i, Object obj, int i2, int i3, sd3 sd3Var, int i4, int i5, List list, long j, Object obj2, bj3 bj3Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = sd3Var;
        this.e = list;
        this.f = j;
        this.g = obj2;
        this.h = bj3Var;
        this.i = i6;
        this.j = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((yn4) list.get(i9)).B);
        }
        this.k = i8;
        int i10 = i3 + i8;
        this.l = i10 >= 0 ? i10 : 0;
        this.n = (this.c << 32) | (i8 & 4294967295L);
        this.o = 0L;
        this.p = -1;
        this.q = -1;
    }

    @Override // defpackage.hj3
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.hj3
    public final boolean b() {
        return true;
    }

    @Override // defpackage.hj3
    public final void c() {
        this.r = true;
    }

    @Override // defpackage.hj3
    public final void d(int i, int i2, int i3) {
        k(i, 0, i2, i3, -1, -1);
    }

    @Override // defpackage.hj3
    public final int e() {
        return this.l;
    }

    @Override // defpackage.hj3
    public final long f(int i) {
        return this.o;
    }

    @Override // defpackage.hj3
    public final int g() {
        return this.j;
    }

    @Override // defpackage.hj3
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.hj3
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.hj3
    public final Object h(int i) {
        return ((yn4) this.e.get(i)).l();
    }

    @Override // defpackage.hj3
    public final int i() {
        return this.i;
    }

    public final void j(xn4 xn4Var) {
        if (this.m == Integer.MIN_VALUE) {
            pz2.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yn4 yn4Var = (yn4) list.get(i);
            int i2 = yn4Var.B;
            long j = this.o;
            this.h.b(i, this.b);
            xn4.s(xn4Var, yn4Var, a33.c(j, this.f));
        }
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        this.m = i4;
        if (this.d == sd3.Rtl) {
            i2 = (i3 - i2) - this.c;
        }
        this.o = (i2 << 32) | (i & 4294967295L);
        this.p = i5;
        this.q = i6;
    }
}
