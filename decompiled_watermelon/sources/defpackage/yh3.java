package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yh3  reason: default package */
/* loaded from: classes.dex */
public final class yh3 implements uv3 {
    public final ai3 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final uv3 e;
    public final float f;
    public final boolean g;
    public final o31 h;
    public final od1 i;
    public final int j;
    public final mi2 k;
    public final mi2 l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final jf4 q;
    public final int r;
    public final int s;

    public yh3(ai3 ai3Var, int i, boolean z, float f, uv3 uv3Var, float f2, boolean z2, o31 o31Var, od1 od1Var, int i2, mi2 mi2Var, mi2 mi2Var2, List list, int i3, int i4, int i5, jf4 jf4Var, int i6, int i7) {
        this.a = ai3Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = uv3Var;
        this.f = f2;
        this.g = z2;
        this.h = o31Var;
        this.i = od1Var;
        this.j = i2;
        this.k = mi2Var;
        this.l = mi2Var2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = jf4Var;
        this.r = i6;
        this.s = i7;
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

    public final yh3 f(int i, boolean z) {
        ai3 ai3Var;
        if (!this.g) {
            List list = this.m;
            if (!list.isEmpty() && (ai3Var = this.a) != null) {
                int i2 = ai3Var.g;
                int i3 = this.b - i;
                if (i3 >= 0 && i3 < i2) {
                    zh3 zh3Var = (zh3) tq0.K0(list);
                    zh3 zh3Var2 = (zh3) tq0.T0(list);
                    if (!zh3Var.r && !zh3Var2.r) {
                        int i4 = this.o;
                        int i5 = this.n;
                        jf4 jf4Var = this.q;
                        if (i < 0) {
                            if (Math.min((me2.H(zh3Var, jf4Var) + zh3Var.l) - i5, (me2.H(zh3Var2, jf4Var) + zh3Var2.l) - i4) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i5 - me2.H(zh3Var, jf4Var), i4 - me2.H(zh3Var2, jf4Var)) <= i) {
                            return null;
                        }
                        int size = list.size();
                        boolean z2 = false;
                        for (int i6 = 0; i6 < size; i6++) {
                            zh3 zh3Var3 = (zh3) list.get(i6);
                            zh3Var3.getClass();
                            if (!zh3Var3.r) {
                                long j = zh3Var3.o;
                                zh3Var3.o = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + i) & 4294967295L);
                                if (z) {
                                    int size2 = zh3Var3.e.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        zh3Var3.h.b(i7, zh3Var3.b);
                                    }
                                }
                            }
                        }
                        return new yh3(this.a, i3, (this.c || i > 0) ? true : true, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list, this.n, this.o, this.p, this.q, this.r, this.s);
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
