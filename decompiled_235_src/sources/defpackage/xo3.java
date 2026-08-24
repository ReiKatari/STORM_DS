package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo3  reason: default package */
/* loaded from: classes.dex */
public final class xo3 implements gq3 {
    public final int a;
    public final Object b;
    public final int c;
    public final kk3 d;
    public final List e;
    public final long f;
    public final Object g;
    public final zp3 h;
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

    public xo3(int i, Object obj, int i2, int i3, kk3 kk3Var, int i4, int i5, List list, long j, Object obj2, zp3 zp3Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = kk3Var;
        this.e = list;
        this.f = j;
        this.g = obj2;
        this.h = zp3Var;
        this.i = i6;
        this.j = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = Math.max(i8, ((dx4) list.get(i9)).B);
        }
        this.k = i8;
        int i10 = i3 + i8;
        this.l = i10 >= 0 ? i10 : 0;
        this.n = (this.c << 32) | (i8 & 4294967295L);
        this.o = 0L;
        this.p = -1;
        this.q = -1;
    }

    @Override // defpackage.gq3
    public final int a() {
        return this.e.size();
    }

    @Override // defpackage.gq3
    public final int b() {
        return this.l;
    }

    @Override // defpackage.gq3
    public final int c() {
        return this.j;
    }

    @Override // defpackage.gq3
    public final Object d(int i) {
        return ((dx4) this.e.get(i)).B();
    }

    @Override // defpackage.gq3
    public final boolean e() {
        return true;
    }

    @Override // defpackage.gq3
    public final void f() {
        this.r = true;
    }

    @Override // defpackage.gq3
    public final void g(int i, int i2, int i3) {
        k(i, 0, i2, i3, -1, -1);
    }

    @Override // defpackage.gq3
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.gq3
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.gq3
    public final long h(int i) {
        return this.o;
    }

    @Override // defpackage.gq3
    public final int i() {
        return this.i;
    }

    public final void j(cx4 cx4Var) {
        if (this.m == Integer.MIN_VALUE) {
            s53.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dx4 dx4Var = (dx4) list.get(i);
            int i2 = dx4Var.B;
            long j = this.o;
            this.h.b(i, this.b);
            cx4.r(cx4Var, dx4Var, i93.c(j, this.f));
        }
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        this.m = i4;
        if (this.d == kk3.Rtl) {
            i2 = (i3 - i2) - this.c;
        }
        this.o = (i2 << 32) | (i & 4294967295L);
        this.p = i5;
        this.q = i6;
    }
}
