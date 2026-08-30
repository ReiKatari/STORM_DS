package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kk3  reason: default package */
/* loaded from: classes.dex */
public final class kk3 implements hj3 {
    public final int a;
    public final List b;
    public final boolean c;
    public final h20 d;
    public final i20 e;
    public final sd3 f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final bj3 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;
    public int q = Integer.MIN_VALUE;
    public final int[] r;

    public kk3(int i, List list, boolean z, h20 h20Var, i20 i20Var, sd3 sd3Var, int i2, int i3, int i4, long j, Object obj, Object obj2, bj3 bj3Var, long j2) {
        int i5;
        int i6;
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = h20Var;
        this.e = i20Var;
        this.f = sd3Var;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = bj3Var;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            yn4 yn4Var = (yn4) list.get(i9);
            boolean z2 = this.c;
            if (z2) {
                i5 = yn4Var.B;
            } else {
                i5 = yn4Var.A;
            }
            i7 += i5;
            if (!z2) {
                i6 = yn4Var.B;
            } else {
                i6 = yn4Var.A;
            }
            i8 = Math.max(i8, i6);
        }
        this.m = i7;
        int i10 = i7 + this.g;
        this.n = i10 >= 0 ? i10 : 0;
        this.o = i8;
        this.r = new int[this.b.size() * 2];
    }

    @Override // defpackage.hj3
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.hj3
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.hj3
    public final void c() {
        this.p = true;
    }

    @Override // defpackage.hj3
    public final void d(int i, int i2, int i3) {
        k(i, i2, i3);
    }

    @Override // defpackage.hj3
    public final int e() {
        return this.n;
    }

    @Override // defpackage.hj3
    public final long f(int i) {
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

    @Override // defpackage.hj3
    public final int g() {
        return 1;
    }

    @Override // defpackage.hj3
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.hj3
    public final Object getKey() {
        return this.i;
    }

    @Override // defpackage.hj3
    public final Object h(int i) {
        return ((yn4) this.b.get(i)).l();
    }

    @Override // defpackage.hj3
    public final int i() {
        return 0;
    }

    public final void j(xn4 xn4Var) {
        if (this.q == Integer.MIN_VALUE) {
            pz2.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            yn4 yn4Var = (yn4) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = yn4Var.B;
            } else {
                int i3 = yn4Var.A;
            }
            long f = f(i);
            this.k.b(i, this.i);
            long c = a33.c(f, this.h);
            if (z) {
                xn4.s(xn4Var, yn4Var, c);
            } else {
                xn4.p(xn4Var, yn4Var, c);
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
            yn4 yn4Var = (yn4) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.r;
            if (z) {
                h20 h20Var = this.d;
                if (h20Var != null) {
                    iArr[i7] = h20Var.a(yn4Var.A, i2, this.f);
                    iArr[i7 + 1] = i;
                    i5 = yn4Var.B;
                } else {
                    throw wh1.c("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                i20 i20Var = this.e;
                if (i20Var != null) {
                    iArr[i8] = i20Var.a(yn4Var.B, i3);
                    i5 = yn4Var.A;
                } else {
                    throw wh1.c("null verticalAlignment when isVertical == false");
                }
            }
            i += i5;
        }
    }
}
