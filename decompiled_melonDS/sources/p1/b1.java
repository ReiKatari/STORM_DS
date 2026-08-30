package p1;

import android.os.Trace;
import y3.o1;
import y3.q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f11187a;

    /* renamed from: b  reason: collision with root package name */
    public final c1 f11188b;

    /* renamed from: c  reason: collision with root package name */
    public final mc.l f11189c;

    /* renamed from: d  reason: collision with root package name */
    public x4.a f11190d;

    /* renamed from: e  reason: collision with root package name */
    public o1 f11191e;

    /* renamed from: f  reason: collision with root package name */
    public y3.o0 f11192f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11193g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11194h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11195i;

    /* renamed from: j  reason: collision with root package name */
    public Object f11196j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11197k;

    /* renamed from: l  reason: collision with root package name */
    public a1 f11198l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public long f11199n;

    /* renamed from: o  reason: collision with root package name */
    public long f11200o;

    /* renamed from: p  reason: collision with root package name */
    public long f11201p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11202q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ e9.a f11203r;

    public b1(e9.a aVar, int i2, c1 c1Var, mc.l lVar) {
        this.f11203r = aVar;
        this.f11187a = i2;
        this.f11188b = c1Var;
        this.f11189c = lVar;
        int i10 = wc.m.f14209b;
        this.f11201p = System.nanoTime() - wc.m.f14208a;
    }

    @Override // p1.n0
    public final void a() {
        this.m = true;
    }

    public final void b() {
        n2.i1 i1Var;
        y3.o0 o0Var = this.f11192f;
        if (o0Var != null) {
            switch (o0Var.f14716a) {
                case 0:
                    break;
                default:
                    y3.h0 b10 = o0Var.b();
                    if (b10 != null) {
                        i1Var = b10.f14686f;
                    } else {
                        i1Var = null;
                    }
                    if (i1Var != null) {
                        y3.p0.c(o0Var.f14717b, o0Var.f14718c);
                        break;
                    }
                    break;
            }
        }
        this.f11192f = null;
        o1 o1Var = this.f11191e;
        if (o1Var != null) {
            o1Var.dispose();
        }
        this.f11191e = null;
        this.f11198l = null;
    }

    public final boolean c(l.g0 g0Var) {
        boolean d4;
        if (!this.f11203r.f4414a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                d4 = d(g0Var);
            } finally {
                Trace.endSection();
            }
        } else {
            d4 = d(g0Var);
        }
        p7.k.y(-1L, "compose:lazy:prefetch:execute:item");
        return d4;
    }

    @Override // p1.n0
    public final void cancel() {
        if (!this.f11194h) {
            this.f11194h = true;
            b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020e A[Catch: all -> 0x01d9, LOOP:2: B:106:0x01e2->B:120:0x020e, LOOP_END, TRY_ENTER, TryCatch #3 {all -> 0x01d9, blocks: (B:89:0x0198, B:91:0x01a0, B:93:0x01a6, B:98:0x01b4, B:100:0x01c0, B:102:0x01d6, B:101:0x01c3, B:105:0x01db, B:106:0x01e2, B:108:0x01ea, B:114:0x01fb, B:116:0x0200, B:120:0x020e, B:121:0x0214), top: B:188:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x020a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r9v23, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [p1.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(l.g0 r22) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b1.d(l.g0):boolean");
    }

    public final boolean e() {
        y3.o0 o0Var;
        if (this.f11195i || ((o0Var = this.f11192f) != null && o0Var.c())) {
            return true;
        }
        return false;
    }

    public final void f(Object obj, Object obj2, b bVar) {
        n2.i1 i1Var;
        y3.o0 o0Var;
        y3.o0 o0Var2 = this.f11192f;
        if (o0Var2 == null) {
            e9.a aVar = this.f11203r;
            mc.p a10 = ((y) aVar.f4415b).a(this.f11187a, obj, obj2);
            y3.p0 a11 = ((q1) aVar.f4416c).a();
            if (!a11.A.H()) {
                o0Var = new y3.o0(a11, obj, 0);
            } else {
                a11.k(obj, a10, true);
                o0Var = new y3.o0(a11, obj, 1);
            }
            o0Var2 = o0Var;
            this.f11192f = o0Var2;
            this.f11196j = obj;
        }
        this.f11202q = false;
        while (!o0Var2.c() && !this.f11202q) {
            bi.h hVar = new bi.h(8, this, bVar);
            switch (o0Var2.f14716a) {
                case 0:
                    break;
                default:
                    y3.h0 b10 = o0Var2.b();
                    mc.l lVar = null;
                    if (b10 != null) {
                        i1Var = b10.f14686f;
                    } else {
                        i1Var = null;
                    }
                    if (i1Var != null && !i1Var.c()) {
                        y3.p0 p0Var = o0Var2.f14717b;
                        z2.f e6 = z2.q.e();
                        if (e6 != null) {
                            lVar = e6.e();
                        }
                        z2.f h2 = z2.q.h(e6);
                        try {
                            a4.o0 o0Var3 = p0Var.A;
                            o0Var3.f288l0 = true;
                            i1Var.e(hVar);
                            o0Var3.f288l0 = false;
                            break;
                        } finally {
                            z2.q.k(e6, h2, lVar);
                        }
                    }
                    break;
            }
        }
        h();
        boolean z10 = this.f11202q;
        long j2 = this.f11200o;
        if (z10) {
            bVar.f11183b = b.a(j2, bVar.f11183b);
        } else {
            bVar.f11182a = b.a(j2, bVar.f11182a);
        }
    }

    public final boolean g(long j2, long j10) {
        if (this.m) {
            j10 = 0;
        }
        if (j2 > j10) {
            return true;
        }
        return false;
    }

    public final void h() {
        long j2;
        long j10;
        long j11;
        long j12;
        int i2 = wc.m.f14209b;
        long nanoTime = System.nanoTime() - wc.m.f14208a;
        long j13 = this.f11201p;
        wc.e eVar = wc.e.NANOSECONDS;
        eVar.getClass();
        long j14 = 0;
        if (((j13 - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j13) {
                l7.a aVar = wc.b.B;
            } else {
                if (j13 < 0) {
                    j12 = wc.b.R;
                } else {
                    j12 = wc.b.L;
                }
                j14 = wc.b.l(j12);
            }
        } else if (((nanoTime - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime < 0) {
                j10 = wc.b.R;
            } else {
                j10 = wc.b.L;
            }
            j14 = j10;
        } else {
            long j15 = nanoTime - j13;
            if (((~(j15 ^ j13)) & (j15 ^ nanoTime)) < 0) {
                wc.e eVar2 = wc.e.MILLISECONDS;
                if (eVar.compareTo(eVar2) < 0) {
                    eVar2.getClass();
                    long convert = eVar.getTimeUnit$kotlin_stdlib().convert(1L, eVar2.getTimeUnit$kotlin_stdlib());
                    long j16 = (nanoTime / convert) - (j13 / convert);
                    long j17 = (nanoTime % convert) - (j13 % convert);
                    l7.a aVar2 = wc.b.B;
                    j14 = wc.b.i(wc.j.m(j16, eVar2), wc.j.m(j17, eVar));
                } else {
                    if (j15 < 0) {
                        j2 = wc.b.R;
                    } else {
                        j2 = wc.b.L;
                    }
                    j14 = wc.b.l(j2);
                }
            } else {
                j14 = wc.j.m(j15, eVar);
            }
        }
        long j18 = j14 >> 1;
        l7.a aVar3 = wc.b.B;
        if ((1 & ((int) j14)) == 0) {
            j11 = j18;
        } else if (j18 > 9223372036854L) {
            j11 = Long.MAX_VALUE;
        } else if (j18 < -9223372036854L) {
            j11 = Long.MIN_VALUE;
        } else {
            j11 = j18 * 1000000;
        }
        this.f11200o = j11;
        long j19 = this.f11199n - j11;
        this.f11199n = j19;
        this.f11201p = nanoTime;
        p7.k.y(j19, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.f11187a + ", constraints = " + this.f11190d + ", isComposed = " + e() + ", isMeasured = " + this.f11193g + ", isCanceled = " + this.f11194h + " }";
    }
}
