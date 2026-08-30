package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ys4  reason: default package */
/* loaded from: classes.dex */
public final class ys4 implements pj3 {
    public final int a;
    public final os b;
    public final mi2 c;
    public lz0 d;
    public wh6 e;
    public ig3 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public xs4 l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ xf1 r;

    public ys4(xf1 xf1Var, int i, os osVar, mi2 mi2Var) {
        this.r = xf1Var;
        this.a = i;
        this.b = osVar;
        this.c = mi2Var;
        int i2 = gz3.b;
        this.p = System.nanoTime() - gz3.a;
    }

    @Override // defpackage.pj3
    public final void a() {
        this.m = true;
    }

    public final void b() {
        ql4 ql4Var;
        ig3 ig3Var = this.f;
        if (ig3Var != null) {
            switch (ig3Var.a) {
                case 0:
                    break;
                default:
                    bg3 b = ig3Var.b();
                    if (b != null) {
                        ql4Var = b.f;
                    } else {
                        ql4Var = null;
                    }
                    if (ql4Var != null) {
                        jg3.c(ig3Var.b, ig3Var.c);
                        break;
                    }
                    break;
            }
        }
        this.f = null;
        wh6 wh6Var = this.e;
        if (wh6Var != null) {
            wh6Var.dispose();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(qj qjVar) {
        boolean d;
        if (!this.r.A) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d = d(qjVar);
            } finally {
                Trace.endSection();
            }
        } else {
            d = d(qjVar);
        }
        a53.U(-1L, "compose:lazy:prefetch:execute:item");
        return d;
    }

    @Override // defpackage.pj3
    public final void cancel() {
        if (!this.h) {
            this.h = true;
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0206 A[Catch: all -> 0x021f, LOOP:2: B:104:0x01da->B:118:0x0206, LOOP_END, TRY_ENTER, TryCatch #5 {all -> 0x021f, blocks: (B:89:0x0193, B:91:0x019b, B:93:0x01a1, B:98:0x01af, B:100:0x01bb, B:102:0x01d1, B:101:0x01be, B:103:0x01d3, B:104:0x01da, B:106:0x01e2, B:112:0x01f3, B:114:0x01f8, B:118:0x0206, B:119:0x020c), top: B:193:0x0193 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, yx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.qj r22) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys4.d(qj):boolean");
    }

    public final boolean e() {
        ig3 ig3Var;
        if (this.i || ((ig3Var = this.f) != null && ig3Var.c())) {
            return true;
        }
        return false;
    }

    public final void f(Object obj, Object obj2, yx yxVar) {
        ql4 ql4Var;
        ig3 ig3Var;
        ig3 ig3Var2 = this.f;
        if (ig3Var2 == null) {
            xf1 xf1Var = this.r;
            aj2 a = ((dj3) xf1Var.L).a(this.a, obj, obj2);
            jg3 a2 = ((yh6) xf1Var.B).a();
            if (!a2.A.H()) {
                ig3Var = new ig3(a2, obj, 0);
            } else {
                a2.k(obj, a, true);
                ig3Var = new ig3(a2, obj, 1);
            }
            ig3Var2 = ig3Var;
            this.f = ig3Var2;
            this.j = obj;
        }
        this.q = false;
        while (!ig3Var2.c() && !this.q) {
            hi0 hi0Var = new hi0(4, this, yxVar);
            switch (ig3Var2.a) {
                case 0:
                    break;
                default:
                    bg3 b = ig3Var2.b();
                    mi2 mi2Var = null;
                    if (b != null) {
                        ql4Var = b.f;
                    } else {
                        ql4Var = null;
                    }
                    if (ql4Var != null && !ql4Var.c()) {
                        ga6 z = io2.z();
                        if (z != null) {
                            mi2Var = z.e();
                        }
                        ga6 Y = io2.Y(z);
                        try {
                            ql4Var.e(hi0Var);
                            break;
                        } finally {
                        }
                    }
                    break;
            }
        }
        h();
        boolean z2 = this.q;
        long j = this.o;
        if (z2) {
            yxVar.b = yx.a(j, yxVar.b);
        } else {
            yxVar.a = yx.a(j, yxVar.a);
        }
    }

    public final boolean g(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        if (j > j2) {
            return true;
        }
        return false;
    }

    public final void h() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = gz3.b;
        long nanoTime = System.nanoTime() - gz3.a;
        long j5 = this.p;
        om1 om1Var = om1.NANOSECONDS;
        om1Var.getClass();
        long j6 = 0;
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j5) {
                hm1 hm1Var = im1.B;
            } else {
                if (j5 < 0) {
                    j4 = im1.R;
                } else {
                    j4 = im1.L;
                }
                j6 = im1.m(j4);
            }
        } else if (((nanoTime - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime < 0) {
                j2 = im1.R;
            } else {
                j2 = im1.L;
            }
            j6 = j2;
        } else {
            long j7 = nanoTime - j5;
            if (((~(j7 ^ j5)) & (j7 ^ nanoTime)) < 0) {
                om1 om1Var2 = om1.MILLISECONDS;
                if (om1Var.compareTo(om1Var2) < 0) {
                    om1Var2.getClass();
                    long convert = om1Var.getTimeUnit$kotlin_stdlib().convert(1L, om1Var2.getTimeUnit$kotlin_stdlib());
                    long j8 = (nanoTime / convert) - (j5 / convert);
                    long j9 = (nanoTime % convert) - (j5 % convert);
                    hm1 hm1Var2 = im1.B;
                    j6 = im1.j(b53.l0(j8, om1Var2), b53.l0(j9, om1Var));
                } else {
                    if (j7 < 0) {
                        j = im1.R;
                    } else {
                        j = im1.L;
                    }
                    j6 = im1.m(j);
                }
            } else {
                j6 = b53.l0(j7, om1Var);
            }
        }
        long j10 = j6 >> 1;
        hm1 hm1Var3 = im1.B;
        if ((1 & ((int) j6)) == 0) {
            j3 = j10;
        } else if (j10 > 9223372036854L) {
            j3 = Long.MAX_VALUE;
        } else if (j10 < -9223372036854L) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = j10 * 1000000;
        }
        this.o = j3;
        long j11 = this.n - j3;
        this.n = j11;
        this.p = nanoTime;
        a53.U(j11, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.a + ", constraints = " + this.d + ", isComposed = " + e() + ", isMeasured = " + this.g + ", isCanceled = " + this.h + " }";
    }
}
