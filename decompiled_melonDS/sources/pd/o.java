package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends d0.d {

    /* renamed from: o  reason: collision with root package name */
    public final a f11598o;

    /* renamed from: p  reason: collision with root package name */
    public final k0.g f11599p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a aVar, od.c cVar) {
        super(25);
        cVar.getClass();
        this.f11598o = aVar;
        this.f11599p = cVar.f10886b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    @Override // d0.d, md.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short A() {
        /*
            r6 = this;
            pd.a r0 = r6.f11598o
            java.lang.String r1 = r0.l()
            r2 = 0
            r1.getClass()     // Catch: java.lang.IllegalArgumentException -> L32
            r3 = 10
            yb.r r3 = p7.n.z(r3, r1)     // Catch: java.lang.IllegalArgumentException -> L32
            if (r3 == 0) goto L28
            int r3 = r3.A     // Catch: java.lang.IllegalArgumentException -> L32
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 ^ r3
            r5 = -2147418113(0xffffffff8000ffff, float:-9.1834E-41)
            int r4 = java.lang.Integer.compare(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L32
            if (r4 <= 0) goto L21
            goto L28
        L21:
            short r3 = (short) r3     // Catch: java.lang.IllegalArgumentException -> L32
            yb.w r4 = new yb.w     // Catch: java.lang.IllegalArgumentException -> L32
            r4.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L32
            goto L29
        L28:
            r4 = r2
        L29:
            if (r4 == 0) goto L2e
            short r0 = r4.A     // Catch: java.lang.IllegalArgumentException -> L32
            return r0
        L2e:
            vc.o.Q(r1)     // Catch: java.lang.IllegalArgumentException -> L32
            throw r2     // Catch: java.lang.IllegalArgumentException -> L32
        L32:
            java.lang.String r3 = "Failed to parse type 'UShort' for input '"
            r4 = 39
            java.lang.String r1 = kc.a.c(r4, r3, r1)
            r3 = 0
            r4 = 6
            pd.a.p(r0, r1, r3, r2, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.o.A():short");
    }

    @Override // md.a
    public final k0.g c() {
        return this.f11599p;
    }

    @Override // d0.d, md.c
    public final long e() {
        a aVar = this.f11598o;
        String l10 = aVar.l();
        try {
            l10.getClass();
            yb.t A = p7.n.A(l10);
            if (A != null) {
                return A.A;
            }
            vc.o.Q(l10);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.p(aVar, kc.a.c('\'', "Failed to parse type 'ULong' for input '", l10), 0, null, 6);
            throw null;
        }
    }

    @Override // md.a
    public final int g(ld.e eVar) {
        eVar.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // d0.d, md.c
    public final int u() {
        a aVar = this.f11598o;
        String l10 = aVar.l();
        try {
            l10.getClass();
            yb.r z10 = p7.n.z(10, l10);
            if (z10 != null) {
                return z10.A;
            }
            vc.o.Q(l10);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.p(aVar, kc.a.c('\'', "Failed to parse type 'UInt' for input '", l10), 0, null, 6);
            throw null;
        }
    }

    @Override // d0.d, md.c
    public final byte v() {
        a aVar = this.f11598o;
        String l10 = aVar.l();
        try {
            l10.getClass();
            yb.p y10 = p7.n.y(10, l10);
            if (y10 != null) {
                return y10.A;
            }
            vc.o.Q(l10);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.p(aVar, kc.a.c('\'', "Failed to parse type 'UByte' for input '", l10), 0, null, 6);
            throw null;
        }
    }
}
