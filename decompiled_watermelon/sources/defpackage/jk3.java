package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jk3  reason: default package */
/* loaded from: classes.dex */
public final class jk3 implements uv3 {
    public final kk3 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final uv3 e;
    public final float f;
    public final boolean g;
    public final o31 h;
    public final od1 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final jf4 o;
    public final int p;
    public final int q;

    public jk3(kk3 kk3Var, int i, boolean z, float f, uv3 uv3Var, float f2, boolean z2, o31 o31Var, od1 od1Var, long j, List list, int i2, int i3, int i4, jf4 jf4Var, int i5, int i6) {
        this.a = kk3Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = uv3Var;
        this.f = f2;
        this.g = z2;
        this.h = o31Var;
        this.i = od1Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = jf4Var;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.uv3
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.uv3
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.uv3
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.uv3
    public final mi2 d() {
        return this.e.d();
    }

    @Override // defpackage.uv3
    public final Map e() {
        return this.e.e();
    }

    public final jk3 f(int i, boolean z) {
        kk3 kk3Var;
        if (!this.g) {
            List list = this.k;
            if (!list.isEmpty() && (kk3Var = this.a) != null) {
                int i2 = kk3Var.n;
                int i3 = this.b - i;
                if (i3 >= 0 && i3 < i2) {
                    kk3 kk3Var2 = (kk3) tq0.K0(list);
                    kk3 kk3Var3 = (kk3) tq0.T0(list);
                    if (!kk3Var2.p && !kk3Var3.p) {
                        int i4 = kk3Var2.l;
                        int i5 = this.m;
                        int i6 = this.l;
                        if (i < 0) {
                            if (Math.min((i4 + kk3Var2.n) - i6, (kk3Var3.l + kk3Var3.n) - i5) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i6 - i4, i5 - kk3Var3.l) <= i) {
                            return null;
                        }
                        int size = list.size();
                        boolean z2 = false;
                        for (int i7 = 0; i7 < size; i7++) {
                            kk3 kk3Var4 = (kk3) list.get(i7);
                            boolean z3 = kk3Var4.c;
                            int[] iArr = kk3Var4.r;
                            if (!kk3Var4.p) {
                                kk3Var4.l += i;
                                int length = iArr.length;
                                for (int i8 = 0; i8 < length; i8++) {
                                    int i9 = i8 & 1;
                                    if ((z3 && i9 != 0) || (!z3 && i9 == 0)) {
                                        iArr[i8] = iArr[i8] + i;
                                    }
                                }
                                if (z) {
                                    int size2 = kk3Var4.b.size();
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        kk3Var4.k.b(i10, kk3Var4.i);
                                    }
                                }
                            }
                        }
                        return new jk3(this.a, i3, (this.c || i > 0) ? true : true, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long g() {
        uv3 uv3Var = this.e;
        return (uv3Var.c() << 32) | (uv3Var.a() & 4294967295L);
    }
}
