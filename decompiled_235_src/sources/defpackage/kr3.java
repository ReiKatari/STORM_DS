package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kr3  reason: default package */
/* loaded from: classes.dex */
public final class kr3 implements gq3 {
    public final int a;
    public final List b;
    public final boolean c;
    public final c40 d;
    public final d40 e;
    public final kk3 f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final zp3 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;
    public int q = Integer.MIN_VALUE;
    public final int[] r;

    public kr3(int i, List list, boolean z, c40 c40Var, d40 d40Var, kk3 kk3Var, int i2, int i3, int i4, long j, Object obj, Object obj2, zp3 zp3Var, long j2) {
        int i5;
        int i6;
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = c40Var;
        this.e = d40Var;
        this.f = kk3Var;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = zp3Var;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            dx4 dx4Var = (dx4) list.get(i9);
            boolean z2 = this.c;
            if (z2) {
                i5 = dx4Var.B;
            } else {
                i5 = dx4Var.A;
            }
            i7 += i5;
            if (!z2) {
                i6 = dx4Var.B;
            } else {
                i6 = dx4Var.A;
            }
            i8 = Math.max(i8, i6);
        }
        this.m = i7;
        int i10 = i7 + this.g;
        this.n = i10 >= 0 ? i10 : 0;
        this.o = i8;
        this.r = new int[this.b.size() * 2];
    }

    @Override // defpackage.gq3
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.gq3
    public final int b() {
        return this.n;
    }

    @Override // defpackage.gq3
    public final int c() {
        return 1;
    }

    @Override // defpackage.gq3
    public final Object d(int i) {
        return ((dx4) this.b.get(i)).B();
    }

    @Override // defpackage.gq3
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.gq3
    public final void f() {
        this.p = true;
    }

    @Override // defpackage.gq3
    public final void g(int i, int i2, int i3) {
        k(i, i2, i3);
    }

    @Override // defpackage.gq3
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.gq3
    public final Object getKey() {
        return this.i;
    }

    @Override // defpackage.gq3
    public final long h(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.l;
            if (this.c) {
                return i2 & 4294967295L;
            }
            return i2 << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.r;
        int i4 = iArr[i3];
        return (iArr[i3 + 1] & 4294967295L) | (i4 << 32);
    }

    @Override // defpackage.gq3
    public final int i() {
        return 0;
    }

    public final void j(cx4 cx4Var) {
        if (this.q == Integer.MIN_VALUE) {
            s53.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dx4 dx4Var = (dx4) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = dx4Var.B;
            } else {
                int i3 = dx4Var.A;
            }
            long h = h(i);
            this.k.b(i, this.i);
            long c = i93.c(h, this.h);
            if (z) {
                cx4.r(cx4Var, dx4Var, c);
            } else {
                cx4.n(cx4Var, dx4Var, c);
            }
        }
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        int i5;
        this.l = i;
        boolean z = this.c;
        if (z) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.q = i4;
        List list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            dx4 dx4Var = (dx4) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.r;
            if (z) {
                c40 c40Var = this.d;
                if (c40Var != null) {
                    iArr[i7] = c40Var.a(dx4Var.A, i2, this.f);
                    iArr[i7 + 1] = i;
                    i5 = dx4Var.B;
                } else {
                    throw lb1.c("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                d40 d40Var = this.e;
                if (d40Var != null) {
                    iArr[i8] = d40Var.a(dx4Var.B, i3);
                    i5 = dx4Var.A;
                } else {
                    throw lb1.c("null verticalAlignment when isVertical == false");
                }
            }
            i += i5;
        }
    }
}
