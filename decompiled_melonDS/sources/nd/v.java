package nd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements jd.a {

    /* renamed from: a  reason: collision with root package name */
    public static final v f10373a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final g1 f10374b = new g1("kotlin.time.Duration", ld.d.f9029w);

    @Override // jd.a
    public final Object a(md.c cVar) {
        boolean z10;
        l7.a aVar = wc.b.B;
        String B = cVar.B();
        B.getClass();
        try {
            long h2 = wc.j.h(B);
            if (h2 == wc.b.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return new wc.b(h2);
            }
            throw new IllegalStateException("invariant failed");
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException(kc.a.g("Invalid ISO duration string format: '", B, "'."), e6);
        }
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        long j2;
        boolean z10;
        boolean z11;
        long j10 = ((wc.b) obj).A;
        l7.a aVar = wc.b.B;
        StringBuilder sb2 = new StringBuilder();
        int i2 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i2 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        if (i2 < 0) {
            j2 = wc.b.l(j10);
        } else {
            j2 = j10;
        }
        long j11 = wc.b.j(j2, wc.e.HOURS);
        int e6 = wc.b.e(j2);
        int g10 = wc.b.g(j2);
        int f8 = wc.b.f(j2);
        if (wc.b.h(j10)) {
            j11 = 9999999999999L;
        }
        boolean z12 = false;
        if (j11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g10 == 0 && f8 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (e6 != 0 || (z11 && z10)) {
            z12 = true;
        }
        if (z10) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z12) {
            sb2.append(e6);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z12)) {
            wc.b.b(sb2, g10, f8, 9, "S", true);
        }
        dVar.r(sb2.toString());
    }

    @Override // jd.a
    public final ld.e e() {
        return f10374b;
    }
}
