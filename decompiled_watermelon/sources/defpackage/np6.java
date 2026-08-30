package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: np6  reason: default package */
/* loaded from: classes.dex */
public final class np6 {
    public final to a;
    public final long b;
    public final lr6 c;
    public final pb4 d;
    public final ur6 e;
    public long f;
    public final to g;
    public final oq6 h;
    public final mr6 i;

    public np6(oq6 oq6Var, pb4 pb4Var, mr6 mr6Var, ur6 ur6Var) {
        lr6 lr6Var;
        to toVar = oq6Var.a;
        long j = oq6Var.b;
        if (mr6Var != null) {
            lr6Var = mr6Var.a;
        } else {
            lr6Var = null;
        }
        this.a = toVar;
        this.b = j;
        this.c = lr6Var;
        this.d = pb4Var;
        this.e = ur6Var;
        this.f = j;
        this.g = toVar;
        this.h = oq6Var;
        this.i = mr6Var;
    }

    public final List a(mi2 mi2Var) {
        if (vr6.c(this.f)) {
            tn1 tn1Var = (tn1) mi2Var.n(this);
            if (tn1Var != null) {
                return l07.b0(tn1Var);
            }
            return null;
        }
        return l07.c0(new cs0("", 0), new p16(vr6.f(this.f), vr6.f(this.f)));
    }

    public final Integer b() {
        lr6 lr6Var = this.c;
        if (lr6Var != null) {
            q04 q04Var = lr6Var.b;
            int e = vr6.e(this.f);
            pb4 pb4Var = this.d;
            return Integer.valueOf(pb4Var.n(q04Var.c(q04Var.d(pb4Var.r(e)), true)));
        }
        return null;
    }

    public final Integer c() {
        lr6 lr6Var = this.c;
        if (lr6Var != null) {
            int f = vr6.f(this.f);
            pb4 pb4Var = this.d;
            return Integer.valueOf(pb4Var.n(lr6Var.g(lr6Var.b.d(pb4Var.r(f)))));
        }
        return null;
    }

    public final Integer d() {
        int length;
        lr6 lr6Var = this.c;
        if (lr6Var != null) {
            int r = r();
            while (true) {
                to toVar = this.a;
                if (r >= toVar.B.length()) {
                    length = toVar.B.length();
                    break;
                }
                int length2 = this.g.B.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long j = lr6Var.j(length2);
                int i = vr6.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 <= r) {
                    r++;
                } else {
                    length = this.d.n(i2);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer e() {
        int i;
        lr6 lr6Var = this.c;
        if (lr6Var != null) {
            int r = r();
            while (true) {
                if (r <= 0) {
                    i = 0;
                    break;
                }
                int length = this.g.B.length() - 1;
                if (r <= length) {
                    length = r;
                }
                long j = lr6Var.j(length);
                int i2 = vr6.c;
                int i3 = (int) (j >> 32);
                if (i3 >= r) {
                    r--;
                } else {
                    i = this.d.n(i3);
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final boolean f() {
        rb5 rb5Var;
        lr6 lr6Var = this.c;
        if (lr6Var != null) {
            rb5Var = lr6Var.h(r());
        } else {
            rb5Var = null;
        }
        if (rb5Var != rb5.Rtl) {
            return true;
        }
        return false;
    }

    public final int g(lr6 lr6Var, int i) {
        int r = r();
        ur6 ur6Var = this.e;
        if (ur6Var.a == null) {
            ur6Var.a = Float.valueOf(lr6Var.c(r).a);
        }
        q04 q04Var = lr6Var.b;
        int d = q04Var.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= q04Var.f) {
            return this.g.B.length();
        }
        float b = q04Var.b(d) - 1.0f;
        Float f = ur6Var.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= lr6Var.f(d)) || (!f() && floatValue <= lr6Var.e(d))) {
            return q04Var.c(d, true);
        }
        return this.d.n(q04Var.g((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r9 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.mr6 r9, int r10) {
        /*
            r8 = this;
            rd3 r0 = r9.b
            lr6 r1 = r9.a
            if (r0 == 0) goto L13
            rd3 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            y55 r9 = r9.L(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            y55 r9 = defpackage.y55.e
        L15:
            oq6 r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.vr6.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            pb4 r8 = r8.d
            int r0 = r8.r(r0)
            y55 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            q04 r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.n(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.h(mr6, int):int");
    }

    public final void i() {
        ur6 ur6Var = this.e;
        ur6Var.a = null;
        to toVar = this.g;
        if (toVar.B.length() > 0) {
            if (f()) {
                k();
                return;
            }
            ur6Var.a = null;
            if (toVar.B.length() > 0) {
                String str = toVar.B;
                long j = this.f;
                int i = vr6.c;
                int F = oo2.F((int) (j & 4294967295L), str);
                if (F != -1) {
                    q(F, F);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        to toVar = this.g;
        String str = toVar.B;
        String str2 = toVar.B;
        if (str.length() > 0) {
            int s = io2.s(vr6.e(this.f), str2);
            if (s == vr6.e(this.f) && s != str2.length()) {
                s = io2.s(s + 1, str2);
            }
            q(s, s);
        }
    }

    public final void k() {
        this.e.a = null;
        to toVar = this.g;
        if (toVar.B.length() > 0) {
            String str = toVar.B;
            long j = this.f;
            int i = vr6.c;
            int G = oo2.G((int) (j & 4294967295L), str);
            if (G != -1) {
                q(G, G);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        to toVar = this.g;
        String str = toVar.B;
        String str2 = toVar.B;
        if (str.length() > 0) {
            int t = io2.t(vr6.f(this.f), str2);
            if (t == vr6.f(this.f) && t != 0) {
                t = io2.t(t - 1, str2);
            }
            q(t, t);
        }
    }

    public final void m() {
        ur6 ur6Var = this.e;
        ur6Var.a = null;
        to toVar = this.g;
        if (toVar.B.length() > 0) {
            if (f()) {
                ur6Var.a = null;
                if (toVar.B.length() > 0) {
                    String str = toVar.B;
                    long j = this.f;
                    int i = vr6.c;
                    int F = oo2.F((int) (j & 4294967295L), str);
                    if (F != -1) {
                        q(F, F);
                        return;
                    }
                    return;
                }
                return;
            }
            k();
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.B.length() > 0 && (b = b()) != null) {
            int intValue = b.intValue();
            q(intValue, intValue);
        }
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.B.length() > 0 && (c = c()) != null) {
            int intValue = c.intValue();
            q(intValue, intValue);
        }
    }

    public final void p() {
        if (this.g.B.length() > 0) {
            int i = vr6.c;
            this.f = ve2.g((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = ve2.g(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = vr6.c;
        return this.d.r((int) (j & 4294967295L));
    }
}
