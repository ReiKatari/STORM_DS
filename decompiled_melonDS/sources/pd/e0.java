package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends d0.d implements od.j {

    /* renamed from: o  reason: collision with root package name */
    public final od.c f11571o;

    /* renamed from: p  reason: collision with root package name */
    public final k0 f11572p;

    /* renamed from: q  reason: collision with root package name */
    public final a f11573q;

    /* renamed from: r  reason: collision with root package name */
    public final k0.g f11574r;

    /* renamed from: s  reason: collision with root package name */
    public int f11575s;

    /* renamed from: t  reason: collision with root package name */
    public a0.c f11576t;

    /* renamed from: u  reason: collision with root package name */
    public final q f11577u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(od.c cVar, k0 k0Var, a aVar, ld.e eVar, a0.c cVar2) {
        super(25);
        q qVar;
        k0Var.getClass();
        eVar.getClass();
        this.f11571o = cVar;
        this.f11572p = k0Var;
        this.f11573q = aVar;
        this.f11574r = cVar.f10886b;
        this.f11575s = -1;
        this.f11576t = cVar2;
        if (cVar.f10885a.f9966c) {
            qVar = null;
        } else {
            qVar = new q(eVar);
        }
        this.f11577u = qVar;
    }

    @Override // d0.d, md.c
    public final short A() {
        a aVar = this.f11573q;
        long i2 = aVar.i();
        short s10 = (short) i2;
        if (i2 == s10) {
            return s10;
        }
        a.p(aVar, "Failed to parse short for input '" + i2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // d0.d, md.c
    public final String B() {
        return this.f11573q.j();
    }

    @Override // d0.d, md.c
    public final float C() {
        a aVar = this.f11573q;
        String l10 = aVar.l();
        try {
            float parseFloat = Float.parseFloat(l10);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            t.r(aVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            a.p(aVar, kc.a.c('\'', "Failed to parse type 'float' for input '", l10), 0, null, 6);
            throw null;
        }
    }

    @Override // d0.d, md.c
    public final double D() {
        a aVar = this.f11573q;
        String l10 = aVar.l();
        try {
            double parseDouble = Double.parseDouble(l10);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            t.r(aVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            a.p(aVar, kc.a.c('\'', "Failed to parse type 'double' for input '", l10), 0, null, 6);
            throw null;
        }
    }

    @Override // d0.d, md.c
    public final md.a a(ld.e eVar) {
        eVar.getClass();
        od.c cVar = this.f11571o;
        k0 q10 = t.q(eVar, cVar);
        a aVar = this.f11573q;
        c8.c0 c0Var = aVar.f11552b;
        int i2 = c0Var.f2624b + 1;
        c0Var.f2624b = i2;
        if (i2 == ((Object[]) c0Var.f2625c).length) {
            c0Var.l();
        }
        ((Object[]) c0Var.f2625c)[i2] = eVar;
        aVar.h(q10.begin);
        if (aVar.u() != 4) {
            int i10 = d0.f11570a[q10.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (this.f11572p == q10 && cVar.f10885a.f9966c) {
                    return this;
                }
                return new e0(cVar, q10, aVar, eVar, this.f11576t);
            }
            return new e0(cVar, q10, aVar, eVar, this.f11576t);
        }
        a.p(aVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // d0.d, md.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(ld.e r6) {
        /*
            r5 = this;
            r6.getClass()
            int r0 = r6.d()
            r1 = -1
            if (r0 != 0) goto L18
            od.c r0 = r5.f11571o
            boolean r0 = pd.t.l(r6, r0)
            if (r0 == 0) goto L18
        L12:
            int r0 = r5.g(r6)
            if (r0 != r1) goto L12
        L18:
            pd.a r6 = r5.f11573q
            boolean r0 = r6.z()
            if (r0 != 0) goto L41
            pd.k0 r0 = r5.f11572p
            char r0 = r0.end
            r6.h(r0)
            c8.c0 r6 = r6.f11552b
            int r0 = r6.f2624b
            java.lang.Object r2 = r6.f2626d
            int[] r2 = (int[]) r2
            r3 = r2[r0]
            r4 = -2
            if (r3 != r4) goto L39
            r2[r0] = r1
            int r0 = r0 + r1
            r6.f2624b = r0
        L39:
            int r0 = r6.f2624b
            if (r0 == r1) goto L40
            int r0 = r0 + r1
            r6.f2624b = r0
        L40:
            return
        L41:
            java.lang.String r0 = ""
            pd.t.m(r6, r0)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.e0.b(ld.e):void");
    }

    @Override // md.a
    public final k0.g c() {
        return this.f11574r;
    }

    @Override // d0.d, md.c
    public final md.c d(ld.e eVar) {
        eVar.getClass();
        if (h0.a(eVar)) {
            return new o(this.f11573q, this.f11571o);
        }
        return this;
    }

    @Override // d0.d, md.c
    public final long e() {
        return this.f11573q.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        r1 = r3.f2624b;
        r5 = (int[]) r3.f2626d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
        if (r5[r1] != (-2)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        r5[r1] = -1;
        r3.f2624b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r1 = r3.f2624b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        if (r1 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
        r3.f2624b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r1 = vc.h.m0(r2.y(0, r2.f11551a), r4, 0, 6);
        r3 = r3.g();
        r2 = pd.t.n(r1, r2.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
        throw new java.lang.IllegalArgumentException("Encountered an unknown key '" + r4 + "' at offset " + r1 + " at path: " + r3 + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((java.lang.Object) r2));
     */
    @Override // md.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(ld.e r22) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.e0.g(ld.e):int");
    }

    @Override // d0.d, md.c
    public final boolean h() {
        boolean z10;
        boolean z11;
        a aVar = this.f11573q;
        int x9 = aVar.x();
        if (x9 != aVar.r().length()) {
            if (aVar.r().charAt(x9) == '\"') {
                x9++;
                z10 = true;
            } else {
                z10 = false;
            }
            int w10 = aVar.w(x9);
            if (w10 < aVar.r().length() && w10 != -1) {
                int i2 = w10 + 1;
                int charAt = aVar.r().charAt(w10) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        aVar.d(i2, "rue");
                        z11 = true;
                    } else {
                        a.p(aVar, "Expected valid boolean literal prefix, but had '" + aVar.l() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    aVar.d(i2, "alse");
                    z11 = false;
                }
                if (z10) {
                    if (aVar.f11551a != aVar.r().length()) {
                        if (aVar.r().charAt(aVar.f11551a) == '\"') {
                            aVar.f11551a++;
                            return z11;
                        }
                        a.p(aVar, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    a.p(aVar, "EOF", 0, null, 6);
                    throw null;
                }
                return z11;
            }
            a.p(aVar, "EOF", 0, null, 6);
            throw null;
        }
        a.p(aVar, "EOF", 0, null, 6);
        throw null;
    }

    @Override // d0.d, md.c
    public final boolean i() {
        boolean z10;
        q qVar = this.f11577u;
        if (qVar != null) {
            z10 = qVar.f11601b;
        } else {
            z10 = false;
        }
        if (!z10) {
            a aVar = this.f11573q;
            int w10 = aVar.w(aVar.x());
            int length = aVar.r().length() - w10;
            boolean z11 = false;
            if (length >= 4 && w10 != -1) {
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        if ("null".charAt(i2) != aVar.r().charAt(w10 + i2)) {
                            break;
                        }
                        i2++;
                    } else if (length <= 4 || t.g(aVar.r().charAt(w10 + 4)) != 0) {
                        z11 = true;
                        aVar.f11551a = w10 + 4;
                    }
                }
            }
            if (!z11) {
                return true;
            }
        }
        return false;
    }

    @Override // d0.d, md.c
    public final char j() {
        a aVar = this.f11573q;
        String l10 = aVar.l();
        if (l10.length() == 1) {
            return l10.charAt(0);
        }
        a.p(aVar, kc.a.c('\'', "Expected single char, but got '", l10), 0, null, 6);
        throw null;
    }

    @Override // d0.d, md.a
    public final Object o(ld.e eVar, int i2, jd.a aVar, Object obj) {
        boolean z10;
        c8.c0 c0Var = this.f11573q.f11552b;
        eVar.getClass();
        aVar.getClass();
        if (this.f11572p == k0.MAP && (i2 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = c0Var.f2624b;
            if (((int[]) c0Var.f2626d)[i10] == -2) {
                ((Object[]) c0Var.f2625c)[i10] = u.f11603a;
            }
        }
        Object t5 = t(aVar);
        if (z10) {
            int i11 = c0Var.f2624b;
            if (((int[]) c0Var.f2626d)[i11] != -2) {
                int i12 = i11 + 1;
                c0Var.f2624b = i12;
                if (i12 == ((Object[]) c0Var.f2625c).length) {
                    c0Var.l();
                }
            }
            int i13 = c0Var.f2624b;
            ((Object[]) c0Var.f2625c)[i13] = t5;
            ((int[]) c0Var.f2626d)[i13] = -2;
        }
        return t5;
    }

    @Override // d0.d, md.c
    public final int p(ld.e eVar) {
        eVar.getClass();
        a aVar = this.f11573q;
        return t.k(eVar, this.f11571o, aVar.j(), " at path ".concat(aVar.f11552b.g()));
    }

    @Override // od.j
    public final od.l s() {
        return new bk.a(this.f11571o.f10885a, this.f11573q).n();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    @Override // md.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(jd.a r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.e0.t(jd.a):java.lang.Object");
    }

    @Override // d0.d, md.c
    public final int u() {
        a aVar = this.f11573q;
        long i2 = aVar.i();
        int i10 = (int) i2;
        if (i2 == i10) {
            return i10;
        }
        a.p(aVar, "Failed to parse int for input '" + i2 + '\'', 0, null, 6);
        throw null;
    }

    @Override // d0.d, md.c
    public final byte v() {
        a aVar = this.f11573q;
        long i2 = aVar.i();
        byte b10 = (byte) i2;
        if (i2 == b10) {
            return b10;
        }
        a.p(aVar, "Failed to parse byte for input '" + i2 + '\'', 0, null, 6);
        throw null;
    }
}
