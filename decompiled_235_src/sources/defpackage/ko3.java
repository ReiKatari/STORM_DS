package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko3  reason: default package */
/* loaded from: classes.dex */
public final class ko3 implements tp3 {
    public final ip3 a;

    public ko3(ip3 ip3Var) {
        this.a = ip3Var;
    }

    @Override // defpackage.tp3
    public final int a() {
        return this.a.h().p;
    }

    @Override // defpackage.tp3
    public final int b() {
        return ((xo3) gt0.Q0(this.a.h().m)).a;
    }

    @Override // defpackage.tp3
    public final int c() {
        long e;
        boolean z;
        int i;
        int i2;
        int i3;
        long j;
        ip3 ip3Var = this.a;
        int i4 = 0;
        if (ip3Var.h().m.isEmpty()) {
            return 0;
        }
        wo3 h = ip3Var.h();
        lo4 lo4Var = h.q;
        lo4 lo4Var2 = lo4.Vertical;
        if (lo4Var == lo4Var2) {
            e = h.e() & 4294967295L;
        } else {
            e = h.e() >> 32;
        }
        int i5 = (int) e;
        wo3 h2 = ip3Var.h();
        lo4 lo4Var3 = h2.q;
        List list = h2.m;
        if (lo4Var3 == lo4Var2) {
            z = true;
        } else {
            z = false;
        }
        if (!list.isEmpty()) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < list.size()) {
                xo3 xo3Var = (xo3) list.get(i6);
                if (z) {
                    i2 = xo3Var.p;
                } else {
                    i2 = xo3Var.q;
                }
                if (i2 == -1) {
                    i6++;
                } else {
                    int i9 = 0;
                    while (i6 < list.size()) {
                        xo3 xo3Var2 = (xo3) list.get(i6);
                        if (z) {
                            i3 = xo3Var2.p;
                        } else {
                            i3 = xo3Var2.q;
                        }
                        if (i3 != i2) {
                            break;
                        }
                        if (z) {
                            j = ((xo3) list.get(i6)).n & 4294967295L;
                        } else {
                            j = ((xo3) list.get(i6)).n >> 32;
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

    @Override // defpackage.tp3
    public final boolean d() {
        return !this.a.h().m.isEmpty();
    }

    @Override // defpackage.tp3
    public final int e() {
        return this.a.g();
    }
}
