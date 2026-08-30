package f2;

import java.util.List;
import u1.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final l4.h f4779a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4780b;

    /* renamed from: c  reason: collision with root package name */
    public final l4.o0 f4781c;

    /* renamed from: d  reason: collision with root package name */
    public final q4.q f4782d;

    /* renamed from: e  reason: collision with root package name */
    public final h1 f4783e;

    /* renamed from: f  reason: collision with root package name */
    public long f4784f;

    /* renamed from: g  reason: collision with root package name */
    public final l4.h f4785g;

    /* renamed from: h  reason: collision with root package name */
    public final q4.x f4786h;

    /* renamed from: i  reason: collision with root package name */
    public final k1 f4787i;

    public r0(q4.x xVar, q4.q qVar, k1 k1Var, h1 h1Var) {
        l4.o0 o0Var;
        l4.h hVar = xVar.f12276a;
        long j2 = xVar.f12277b;
        if (k1Var != null) {
            o0Var = k1Var.f13358a;
        } else {
            o0Var = null;
        }
        this.f4779a = hVar;
        this.f4780b = j2;
        this.f4781c = o0Var;
        this.f4782d = qVar;
        this.f4783e = h1Var;
        this.f4784f = j2;
        this.f4785g = hVar;
        this.f4786h = xVar;
        this.f4787i = k1Var;
    }

    public final List a(mc.l lVar) {
        if (l4.q0.c(this.f4784f)) {
            q4.g gVar = (q4.g) lVar.k(this);
            if (gVar != null) {
                return p7.t.x(gVar);
            }
            return null;
        }
        return p7.t.y(new q4.a("", 0), new q4.w(l4.q0.f(this.f4784f), l4.q0.f(this.f4784f)));
    }

    public final Integer b() {
        l4.o0 o0Var = this.f4781c;
        if (o0Var != null) {
            l4.q qVar = o0Var.f8866b;
            int e6 = l4.q0.e(this.f4784f);
            q4.q qVar2 = this.f4782d;
            return Integer.valueOf(qVar2.l(qVar.c(qVar.d(qVar2.m(e6)), true)));
        }
        return null;
    }

    public final Integer c() {
        l4.o0 o0Var = this.f4781c;
        if (o0Var != null) {
            int f8 = l4.q0.f(this.f4784f);
            q4.q qVar = this.f4782d;
            return Integer.valueOf(qVar.l(o0Var.f(o0Var.f8866b.d(qVar.m(f8)))));
        }
        return null;
    }

    public final Integer d() {
        int length;
        l4.o0 o0Var = this.f4781c;
        if (o0Var != null) {
            int r5 = r();
            while (true) {
                l4.h hVar = this.f4779a;
                if (r5 >= hVar.B.length()) {
                    length = hVar.B.length();
                    break;
                }
                int length2 = this.f4785g.B.length() - 1;
                if (r5 <= length2) {
                    length2 = r5;
                }
                long i2 = o0Var.i(length2);
                int i10 = l4.q0.f8884c;
                int i11 = (int) (i2 & 4294967295L);
                if (i11 <= r5) {
                    r5++;
                } else {
                    length = this.f4782d.l(i11);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer e() {
        int i2;
        l4.o0 o0Var = this.f4781c;
        if (o0Var != null) {
            int r5 = r();
            while (true) {
                if (r5 <= 0) {
                    i2 = 0;
                    break;
                }
                int length = this.f4785g.B.length() - 1;
                if (r5 <= length) {
                    length = r5;
                }
                long i10 = o0Var.i(length);
                int i11 = l4.q0.f8884c;
                int i12 = (int) (i10 >> 32);
                if (i12 >= r5) {
                    r5--;
                } else {
                    i2 = this.f4782d.l(i12);
                    break;
                }
            }
            return Integer.valueOf(i2);
        }
        return null;
    }

    public final boolean f() {
        w4.j jVar;
        l4.o0 o0Var = this.f4781c;
        if (o0Var != null) {
            jVar = o0Var.g(r());
        } else {
            jVar = null;
        }
        if (jVar != w4.j.Rtl) {
            return true;
        }
        return false;
    }

    public final int g(l4.o0 o0Var, int i2) {
        int r5 = r();
        h1 h1Var = this.f4783e;
        if (h1Var.f4742a == null) {
            h1Var.f4742a = Float.valueOf(o0Var.c(r5).f6052a);
        }
        l4.q qVar = o0Var.f8866b;
        int d4 = qVar.d(r5) + i2;
        if (d4 < 0) {
            return 0;
        }
        if (d4 >= qVar.f8880f) {
            return this.f4785g.B.length();
        }
        float b10 = qVar.b(d4) - 1;
        Float f8 = h1Var.f4742a;
        f8.getClass();
        float floatValue = f8.floatValue();
        if ((f() && floatValue >= o0Var.e(d4)) || (!f() && floatValue <= o0Var.d(d4))) {
            return qVar.c(d4, true);
        }
        return this.f4782d.l(qVar.g((Float.floatToRawIntBits(b10) & 4294967295L) | (Float.floatToRawIntBits(f8.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r9 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(u1.k1 r9, int r10) {
        /*
            r8 = this;
            y3.z r0 = r9.f13359b
            l4.o0 r1 = r9.f13358a
            if (r0 == 0) goto L13
            y3.z r9 = r9.f13360c
            if (r9 == 0) goto L10
            r2 = 1
            h3.c r9 = r9.k(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            h3.c r9 = h3.c.f6051e
        L15:
            q4.x r0 = r8.f4786h
            long r2 = r0.f12277b
            int r0 = l4.q0.f8884c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            q4.q r2 = r8.f4782d
            int r0 = r2.m(r0)
            h3.c r0 = r1.c(r0)
            float r3 = r0.f6052a
            float r0 = r0.f6053b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            l4.q r0 = r1.f8866b
            int r9 = r0.g(r9)
            int r9 = r2.l(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.r0.h(u1.k1, int):int");
    }

    public final void i() {
        h1 h1Var = this.f4783e;
        h1Var.f4742a = null;
        l4.h hVar = this.f4785g;
        if (hVar.B.length() > 0) {
            if (f()) {
                k();
                return;
            }
            h1Var.f4742a = null;
            if (hVar.B.length() > 0) {
                String str = hVar.B;
                long j2 = this.f4784f;
                int i2 = l4.q0.f8884c;
                int q10 = u1.l0.q((int) (j2 & 4294967295L), str);
                if (q10 != -1) {
                    q(q10, q10);
                }
            }
        }
    }

    public final void j() {
        this.f4783e.f4742a = null;
        l4.h hVar = this.f4785g;
        String str = hVar.B;
        String str2 = hVar.B;
        if (str.length() > 0) {
            int r5 = u1.l0.r(l4.q0.e(this.f4784f), str2);
            if (r5 == l4.q0.e(this.f4784f) && r5 != str2.length()) {
                r5 = u1.l0.r(r5 + 1, str2);
            }
            q(r5, r5);
        }
    }

    public final void k() {
        this.f4783e.f4742a = null;
        l4.h hVar = this.f4785g;
        if (hVar.B.length() > 0) {
            String str = hVar.B;
            long j2 = this.f4784f;
            int i2 = l4.q0.f8884c;
            int t5 = u1.l0.t((int) (j2 & 4294967295L), str);
            if (t5 != -1) {
                q(t5, t5);
            }
        }
    }

    public final void l() {
        this.f4783e.f4742a = null;
        l4.h hVar = this.f4785g;
        String str = hVar.B;
        String str2 = hVar.B;
        if (str.length() > 0) {
            int s10 = u1.l0.s(l4.q0.f(this.f4784f), str2);
            if (s10 == l4.q0.f(this.f4784f) && s10 != 0) {
                s10 = u1.l0.s(s10 - 1, str2);
            }
            q(s10, s10);
        }
    }

    public final void m() {
        h1 h1Var = this.f4783e;
        h1Var.f4742a = null;
        l4.h hVar = this.f4785g;
        if (hVar.B.length() > 0) {
            if (f()) {
                h1Var.f4742a = null;
                if (hVar.B.length() > 0) {
                    String str = hVar.B;
                    long j2 = this.f4784f;
                    int i2 = l4.q0.f8884c;
                    int q10 = u1.l0.q((int) (j2 & 4294967295L), str);
                    if (q10 != -1) {
                        q(q10, q10);
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
        Integer b10;
        this.f4783e.f4742a = null;
        if (this.f4785g.B.length() > 0 && (b10 = b()) != null) {
            int intValue = b10.intValue();
            q(intValue, intValue);
        }
    }

    public final void o() {
        Integer c4;
        this.f4783e.f4742a = null;
        if (this.f4785g.B.length() > 0 && (c4 = c()) != null) {
            int intValue = c4.intValue();
            q(intValue, intValue);
        }
    }

    public final void p() {
        if (this.f4785g.B.length() > 0) {
            int i2 = l4.q0.f8884c;
            this.f4784f = l4.i0.b((int) (this.f4780b >> 32), (int) (this.f4784f & 4294967295L));
        }
    }

    public final void q(int i2, int i10) {
        this.f4784f = l4.i0.b(i2, i10);
    }

    public final int r() {
        long j2 = this.f4784f;
        int i2 = l4.q0.f8884c;
        return this.f4782d.m((int) (j2 & 4294967295L));
    }
}
