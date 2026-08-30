package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i24  reason: default package */
/* loaded from: classes.dex */
public class i24 extends ga6 {
    public static final int[] n = new int[0];
    public final mi2 e;
    public final mi2 f;
    public int g;
    public e24 h;
    public ArrayList i;
    public ka6 j;
    public int[] k;
    public int l;
    public boolean m;

    public i24(long j, ka6 ka6Var, mi2 mi2Var, mi2 mi2Var2) {
        super(j, ka6Var);
        this.e = mi2Var;
        this.f = mi2Var2;
        this.j = ka6.X;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (ma6.c) {
            this.j = this.j.j(j);
        }
    }

    public void B(e24 e24Var) {
        this.h = e24Var;
    }

    public i24 C(mi2 mi2Var, mi2 mi2Var2) {
        r54 r54Var;
        if (this.c) {
            or4.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            or4.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = ma6.c;
        synchronized (obj) {
            long j = ma6.e;
            ma6.e = j + 1;
            ma6.d = ma6.d.j(j);
            ka6 d = d();
            r(d.j(j));
            r54Var = new r54(j, ma6.d(d, g() + 1, j), ma6.k(mi2Var, e(), true), ma6.l(mi2Var2, i()), this);
        }
        if (!this.m && !this.c) {
            long g = g();
            synchronized (obj) {
                long j2 = ma6.e;
                ma6.e = j2 + 1;
                s(j2);
                ma6.d = ma6.d.j(g());
            }
            r(ma6.d(d(), g + 1, g()));
            return r54Var;
        }
        return r54Var;
    }

    @Override // defpackage.ga6
    public final void b() {
        ma6.d = ma6.d.c(g()).b(this.j);
    }

    @Override // defpackage.ga6
    public void c() {
        if (!this.c) {
            this.c = true;
            synchronized (ma6.c) {
                o();
            }
            l();
        }
    }

    @Override // defpackage.ga6
    public boolean f() {
        return false;
    }

    @Override // defpackage.ga6
    public int h() {
        return this.g;
    }

    @Override // defpackage.ga6
    public mi2 i() {
        return this.f;
    }

    @Override // defpackage.ga6
    public void k() {
        this.l++;
    }

    @Override // defpackage.ga6
    public void l() {
        if (this.l <= 0) {
            or4.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i == 0 && !this.m) {
            e24 x = x();
            if (x != null) {
                if (this.m) {
                    or4.b("Unsupported operation on a snapshot that has been applied");
                }
                B(null);
                long g = g();
                Object[] objArr = x.b;
                long[] jArr = x.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    for (se6 b = ((pe6) objArr[(i2 << 3) + i4]).b(); b != null; b = b.b) {
                                        long j2 = b.a;
                                        if (j2 == g || tq0.F0(this.j, Long.valueOf(j2))) {
                                            d96 d96Var = ma6.a;
                                            b.a = 0L;
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            a();
        }
    }

    @Override // defpackage.ga6
    public void m() {
        if (!this.m && !this.c) {
            v();
        }
    }

    @Override // defpackage.ga6
    public void n(pe6 pe6Var) {
        e24 x = x();
        if (x == null) {
            e24 e24Var = xu5.a;
            x = new e24();
            B(x);
        }
        x.a(pe6Var);
    }

    @Override // defpackage.ga6
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            ma6.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.ga6
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.ga6
    public ga6 u(mi2 mi2Var) {
        s54 s54Var;
        if (this.c) {
            or4.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            or4.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = ma6.c;
        synchronized (obj) {
            long j = ma6.e;
            ma6.e = j + 1;
            ma6.d = ma6.d.j(j);
            s54Var = new s54(j, ma6.d(d(), g + 1, j), ma6.k(mi2Var, e(), true), this);
        }
        if (!this.m && !this.c) {
            long g2 = g();
            synchronized (obj) {
                long j2 = ma6.e;
                ma6.e = j2 + 1;
                s(j2);
                ma6.d = ma6.d.j(g());
            }
            r(ma6.d(d(), g2 + 1, g()));
            return s54Var;
        }
        return s54Var;
    }

    public final void v() {
        A(g());
        if (!this.m && !this.c) {
            long g = g();
            synchronized (ma6.c) {
                long j = ma6.e;
                ma6.e = j + 1;
                s(j);
                ma6.d = ma6.d.j(g());
            }
            r(ma6.d(d(), g + 1, g()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[LOOP:1: B:39:0x00a9->B:40:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.oo2 w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i24.w():oo2");
    }

    public e24 x() {
        return this.h;
    }

    @Override // defpackage.ga6
    /* renamed from: y */
    public mi2 e() {
        return this.e;
    }

    public final oo2 z(long j, e24 e24Var, HashMap hashMap, ka6 ka6Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ka6 ka6Var2;
        Object[] objArr;
        long[] jArr;
        ka6 ka6Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        se6 c;
        ti4 ti4Var;
        ArrayList arrayList5;
        ka6 i2 = d().j(g()).i(this.j);
        Object[] objArr3 = e24Var.b;
        long[] jArr3 = e24Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            pe6 pe6Var = (pe6) objArr3[(i3 << 3) + i5];
                            jArr2 = jArr3;
                            se6 b = pe6Var.b();
                            i = i5;
                            ArrayList arrayList6 = arrayList3;
                            se6 s = ma6.s(b, j, ka6Var);
                            if (s == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                se6 s2 = ma6.s(b, g(), i2);
                                if (s2 != null && s2.a != 1 && !s.equals(s2)) {
                                    ka6Var3 = i2;
                                    se6 s3 = ma6.s(b, g(), d());
                                    if (s3 != null) {
                                        if (hashMap == null || (c = (se6) hashMap.get(s)) == null) {
                                            c = pe6Var.c(s2, s, s3);
                                        }
                                        if (c == null) {
                                            return new ha6(this);
                                        }
                                        if (!c.equals(s3)) {
                                            if (c.equals(s)) {
                                                if (arrayList6 == null) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList6;
                                                }
                                                arrayList5.add(new ti4(pe6Var, s.b(g())));
                                                if (arrayList4 == null) {
                                                    arrayList2 = new ArrayList();
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                arrayList2.add(pe6Var);
                                                arrayList3 = arrayList5;
                                            } else {
                                                if (arrayList6 == null) {
                                                    arrayList3 = new ArrayList();
                                                } else {
                                                    arrayList3 = arrayList6;
                                                }
                                                if (!c.equals(s2)) {
                                                    ti4Var = new ti4(pe6Var, c);
                                                } else {
                                                    ti4Var = new ti4(pe6Var, s2.b(g()));
                                                }
                                                arrayList3.add(ti4Var);
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                        arrayList3 = arrayList6;
                                        arrayList2 = arrayList4;
                                    } else {
                                        ma6.r();
                                        throw null;
                                    }
                                }
                            }
                            ka6Var3 = i2;
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            ka6Var3 = i2;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i5;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i5 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        i2 = ka6Var3;
                    }
                    ka6Var2 = i2;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    ka6Var2 = i2;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i3 != length) {
                    i3++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    i2 = ka6Var2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i6 = 0; i6 < size; i6++) {
                ti4 ti4Var2 = (ti4) arrayList3.get(i6);
                pe6 pe6Var2 = (pe6) ti4Var2.A;
                se6 se6Var = (se6) ti4Var2.B;
                se6Var.a = j;
                synchronized (ma6.c) {
                    se6Var.b = pe6Var2.b();
                    pe6Var2.d(se6Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                e24Var.l((pe6) arrayList2.get(i7));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = tq0.X0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return ia6.m;
    }
}
