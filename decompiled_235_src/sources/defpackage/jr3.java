package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr3  reason: default package */
/* loaded from: classes.dex */
public final class jr3 implements f34 {
    public final kr3 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final f34 e;
    public final float f;
    public final boolean g;
    public final w61 h;
    public final qh1 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final lo4 o;
    public final int p;
    public final int q;

    public jr3(kr3 kr3Var, int i, boolean z, float f, f34 f34Var, float f2, boolean z2, w61 w61Var, qh1 qh1Var, long j, List list, int i2, int i3, int i4, lo4 lo4Var, int i5, int i6) {
        this.a = kr3Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = f34Var;
        this.f = f2;
        this.g = z2;
        this.h = w61Var;
        this.i = qh1Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = lo4Var;
        this.p = i5;
        this.q = i6;
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

    public final jr3 d(int i, boolean z) {
        kr3 kr3Var;
        if (!this.g) {
            List list = this.k;
            if (!list.isEmpty() && (kr3Var = this.a) != null) {
                int i2 = kr3Var.n;
                int i3 = this.b - i;
                if (i3 >= 0 && i3 < i2) {
                    kr3 kr3Var2 = (kr3) gt0.H0(list);
                    kr3 kr3Var3 = (kr3) gt0.Q0(list);
                    if (!kr3Var2.p && !kr3Var3.p) {
                        int i4 = kr3Var2.l;
                        int i5 = this.m;
                        int i6 = this.l;
                        if (i < 0) {
                            if (Math.min((i4 + kr3Var2.n) - i6, (kr3Var3.l + kr3Var3.n) - i5) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i6 - i4, i5 - kr3Var3.l) <= i) {
                            return null;
                        }
                        int size = list.size();
                        boolean z2 = false;
                        for (int i7 = 0; i7 < size; i7++) {
                            kr3 kr3Var4 = (kr3) list.get(i7);
                            boolean z3 = kr3Var4.c;
                            int[] iArr = kr3Var4.r;
                            if (!kr3Var4.p) {
                                kr3Var4.l += i;
                                int length = iArr.length;
                                for (int i8 = 0; i8 < length; i8++) {
                                    int i9 = i8 & 1;
                                    if ((z3 && i9 != 0) || (!z3 && i9 == 0)) {
                                        iArr[i8] = iArr[i8] + i;
                                    }
                                }
                                if (z) {
                                    int size2 = kr3Var4.b.size();
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        kr3Var4.k.b(i10, kr3Var4.i);
                                    }
                                }
                            }
                        }
                        return new jr3(this.a, i3, (this.c || i > 0) ? true : true, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q);
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
