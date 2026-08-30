package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kh3  reason: default package */
/* loaded from: classes.dex */
public final class kh3 implements vi3 {
    public final ki3 a;

    public kh3(ki3 ki3Var) {
        this.a = ki3Var;
    }

    @Override // defpackage.vi3
    public final int a() {
        return this.a.h().p;
    }

    @Override // defpackage.vi3
    public final int b() {
        return ((zh3) tq0.T0(this.a.h().m)).a;
    }

    @Override // defpackage.vi3
    public final boolean c() {
        return !this.a.h().m.isEmpty();
    }

    @Override // defpackage.vi3
    public final int d() {
        long g;
        boolean z;
        int i;
        int i2;
        int i3;
        long j;
        ki3 ki3Var = this.a;
        int i4 = 0;
        if (ki3Var.h().m.isEmpty()) {
            return 0;
        }
        yh3 h = ki3Var.h();
        jf4 jf4Var = h.q;
        jf4 jf4Var2 = jf4.Vertical;
        if (jf4Var == jf4Var2) {
            g = h.g() & 4294967295L;
        } else {
            g = h.g() >> 32;
        }
        int i5 = (int) g;
        yh3 h2 = ki3Var.h();
        jf4 jf4Var3 = h2.q;
        List list = h2.m;
        if (jf4Var3 == jf4Var2) {
            z = true;
        } else {
            z = false;
        }
        if (!list.isEmpty()) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < list.size()) {
                zh3 zh3Var = (zh3) list.get(i6);
                if (z) {
                    i2 = zh3Var.p;
                } else {
                    i2 = zh3Var.q;
                }
                if (i2 == -1) {
                    i6++;
                } else {
                    int i9 = 0;
                    while (i6 < list.size()) {
                        zh3 zh3Var2 = (zh3) list.get(i6);
                        if (z) {
                            i3 = zh3Var2.p;
                        } else {
                            i3 = zh3Var2.q;
                        }
                        if (i3 != i2) {
                            break;
                        }
                        if (z) {
                            j = ((zh3) list.get(i6)).n & 4294967295L;
                        } else {
                            j = ((zh3) list.get(i6)).n >> 32;
                        }
                        i9 = Math.max(i9, (int) j);
                        i6++;
                    }
                    i7 += i9;
                    i8++;
                }
            }
            i4 = (i7 / i8) + h2.s;
        }
        if (i4 == 0 || (i = i5 / i4) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.vi3
    public final int e() {
        return this.a.g();
    }
}
