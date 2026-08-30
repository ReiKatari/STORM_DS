package ri;

import a0.j;
import fj.k;
import fj.l;
import fj.x;
import fj.z;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import vc.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements Closeable, Flushable {

    /* renamed from: n0  reason: collision with root package name */
    public static final vc.f f12761n0 = new vc.f("[a-z0-9_-]{1,120}");

    /* renamed from: o0  reason: collision with root package name */
    public static final String f12762o0 = "CLEAN";
    public static final String p0 = "DIRTY";

    /* renamed from: q0  reason: collision with root package name */
    public static final String f12763q0 = "REMOVE";

    /* renamed from: r0  reason: collision with root package name */
    public static final String f12764r0 = "READ";
    public final x A;
    public final g B;
    public final long L;
    public final x R;
    public final x X;
    public final x Y;
    public long Z;

    /* renamed from: b0  reason: collision with root package name */
    public z f12765b0;

    /* renamed from: c0  reason: collision with root package name */
    public final LinkedHashMap f12766c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f12767d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f12768e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f12769f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f12770g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f12771h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12772i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f12773j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f12774k0;

    /* renamed from: l0  reason: collision with root package name */
    public final si.b f12775l0;

    /* renamed from: m0  reason: collision with root package name */
    public final f f12776m0;

    /* JADX WARN: Type inference failed for: r0v0, types: [ri.g, fj.l] */
    public h(k kVar, x xVar, long j2, si.c cVar) {
        kVar.getClass();
        cVar.getClass();
        this.A = xVar;
        this.B = new l(kVar);
        this.L = j2;
        this.f12766c0 = new LinkedHashMap(0, 0.75f, true);
        this.f12775l0 = cVar.d();
        this.f12776m0 = new f(0, this, w.d.s(new StringBuilder(), qi.g.f12553b, " Cache"));
        if (j2 > 0) {
            this.R = xVar.d("journal");
            this.X = xVar.d("journal.tmp");
            this.Y = xVar.d("journal.bkp");
            return;
        }
        j.h("maxSize <= 0");
        throw null;
    }

    public static void J(String str) {
        if (f12761n0.c(str)) {
            return;
        }
        j.e(kc.a.c('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            ri.g r2 = r13.B
            fj.x r3 = r13.R
            fj.g0 r4 = r2.J(r3)
            fj.a0 r4 = ij.a.x(r4)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r7 = r4.D(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r4.D(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = r4.D(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = r4.D(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = r4.D(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r12 = "libcore.io.DiskLruCache"
            boolean r12 = r12.equals(r7)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto La2
            java.lang.String r12 = "1"
            boolean r12 = r12.equals(r8)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto La2
            r12 = 201105(0x31191, float:2.81808E-40)
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L62
            boolean r9 = nc.k.a(r12, r9)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto La2
            r9 = 2
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L62
            boolean r9 = nc.k.a(r9, r10)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto La2
            int r9 = r11.length()     // Catch: java.lang.Throwable -> L62
            if (r9 > 0) goto La2
            r0 = 0
        L58:
            java.lang.String r1 = r4.D(r5)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            r13.F(r1)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            int r0 = r0 + 1
            goto L58
        L62:
            r0 = move-exception
            goto Lcb
        L64:
            java.util.LinkedHashMap r1 = r13.f12766c0     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            int r0 = r0 - r1
            r13.f12767d0 = r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L77
            r13.G()     // Catch: java.lang.Throwable -> L62
            goto L9b
        L77:
            fj.z r0 = r13.f12765b0     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L7e
            qi.e.b(r0)     // Catch: java.lang.Throwable -> L62
        L7e:
            r2.getClass()     // Catch: java.lang.Throwable -> L62
            r3.getClass()     // Catch: java.lang.Throwable -> L62
            fj.e0 r0 = r2.d(r3)     // Catch: java.lang.Throwable -> L62
            e9.f r1 = new e9.f     // Catch: java.lang.Throwable -> L62
            mh.z r2 = new mh.z     // Catch: java.lang.Throwable -> L62
            r3 = 18
            r2.<init>(r3, r13)     // Catch: java.lang.Throwable -> L62
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L62
            fj.z r0 = new fj.z     // Catch: java.lang.Throwable -> L62
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r13.f12765b0 = r0     // Catch: java.lang.Throwable -> L62
        L9b:
            r4.close()     // Catch: java.lang.Throwable -> La0
            r0 = 0
            goto Ld3
        La0:
            r0 = move-exception
            goto Ld3
        La2:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r3.append(r7)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r8)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r10)     // Catch: java.lang.Throwable -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            r3.append(r11)     // Catch: java.lang.Throwable -> L62
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L62
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        Lcb:
            r4.close()     // Catch: java.lang.Throwable -> Lcf
            goto Ld3
        Lcf:
            r1 = move-exception
            p7.t.a(r0, r1)
        Ld3:
            if (r0 != 0) goto Ld6
            return
        Ld6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.h.B():void");
    }

    public final void F(String str) {
        String substring;
        int g02 = vc.h.g0(' ', 0, 6, str);
        if (g02 != -1) {
            int i2 = g02 + 1;
            int g03 = vc.h.g0(' ', i2, 4, str);
            LinkedHashMap linkedHashMap = this.f12766c0;
            if (g03 == -1) {
                substring = str.substring(i2);
                String str2 = f12763q0;
                if (g02 == str2.length() && o.V(str, str2, false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i2, g03);
            }
            d dVar = (d) linkedHashMap.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring);
                linkedHashMap.put(substring, dVar);
            }
            if (g03 != -1) {
                String str3 = f12762o0;
                if (g02 == str3.length() && o.V(str, str3, false)) {
                    List u02 = vc.h.u0(str.substring(g03 + 1), new char[]{' '});
                    dVar.f12753e = true;
                    dVar.f12755g = null;
                    int size = u02.size();
                    dVar.f12758j.getClass();
                    if (size == 2) {
                        try {
                            int size2 = u02.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                dVar.f12750b[i10] = Long.parseLong((String) u02.get(i10));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            fj.j.n(u02, "unexpected journal line: ");
                            return;
                        }
                    }
                    fj.j.n(u02, "unexpected journal line: ");
                    return;
                }
            }
            if (g03 == -1) {
                String str4 = p0;
                if (g02 == str4.length() && o.V(str, str4, false)) {
                    dVar.f12755g = new e9.a(this, dVar);
                    return;
                }
            }
            if (g03 == -1) {
                String str5 = f12764r0;
                if (g02 == str5.length() && o.V(str, str5, false)) {
                    return;
                }
            }
            fj.j.h("unexpected journal line: ".concat(str));
            return;
        }
        fj.j.h("unexpected journal line: ".concat(str));
    }

    public final synchronized void G() {
        long[] jArr;
        try {
            z zVar = this.f12765b0;
            if (zVar != null) {
                zVar.close();
            }
            z w10 = ij.a.w(this.B.I(this.X));
            w10.P("libcore.io.DiskLruCache");
            w10.writeByte(10);
            w10.P("1");
            w10.writeByte(10);
            w10.Q(201105);
            w10.writeByte(10);
            w10.Q(2);
            w10.writeByte(10);
            w10.writeByte(10);
            for (Object obj : this.f12766c0.values()) {
                obj.getClass();
                d dVar = (d) obj;
                if (dVar.f12755g != null) {
                    w10.P(p0);
                    w10.writeByte(32);
                    w10.P(dVar.f12749a);
                    w10.writeByte(10);
                } else {
                    w10.P(f12762o0);
                    w10.writeByte(32);
                    w10.P(dVar.f12749a);
                    for (long j2 : dVar.f12750b) {
                        w10.writeByte(32);
                        w10.Q(j2);
                    }
                    w10.writeByte(10);
                }
            }
            try {
                w10.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (th == null) {
                boolean z10 = this.B.z(this.R);
                g gVar = this.B;
                if (z10) {
                    gVar.i(this.R, this.Y);
                    this.B.i(this.X, this.R);
                    qi.e.d(this.B, this.Y);
                } else {
                    gVar.i(this.X, this.R);
                }
                z zVar2 = this.f12765b0;
                if (zVar2 != null) {
                    qi.e.b(zVar2);
                }
                g gVar2 = this.B;
                x xVar = this.R;
                gVar2.getClass();
                xVar.getClass();
                this.f12765b0 = new z(new e9.f(gVar2.d(xVar), new mh.z(18, this)));
                this.f12768e0 = false;
                this.f12773j0 = false;
            } else {
                throw th;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void H(d dVar) {
        z zVar;
        String str = dVar.f12749a;
        if (!this.f12769f0) {
            if (dVar.f12756h > 0 && (zVar = this.f12765b0) != null) {
                zVar.P(p0);
                zVar.writeByte(32);
                zVar.P(str);
                zVar.writeByte(10);
                zVar.flush();
            }
            if (dVar.f12756h > 0 || dVar.f12755g != null) {
                dVar.f12754f = true;
                return;
            }
        }
        e9.a aVar = dVar.f12755g;
        if (aVar != null) {
            aVar.f();
        }
        for (int i2 = 0; i2 < 2; i2++) {
            qi.e.d(this.B, (x) dVar.f12751c.get(i2));
            long j2 = this.Z;
            long[] jArr = dVar.f12750b;
            this.Z = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.f12767d0++;
        z zVar2 = this.f12765b0;
        if (zVar2 != null) {
            zVar2.P(f12763q0);
            zVar2.writeByte(32);
            zVar2.P(str);
            zVar2.writeByte(10);
        }
        this.f12766c0.remove(str);
        if (w()) {
            this.f12775l0.c(this.f12776m0, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        H(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            r4 = this;
        L0:
            long r0 = r4.Z
            long r2 = r4.L
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2a
            java.util.LinkedHashMap r0 = r4.f12766c0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            r1.getClass()
            ri.d r1 = (ri.d) r1
            boolean r2 = r1.f12754f
            if (r2 != 0) goto L12
            r4.H(r1)
            goto L0
        L29:
            return
        L2a:
            r0 = 0
            r4.f12772i0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.h.I():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        d[] dVarArr;
        try {
            if (this.f12770g0 && !this.f12771h0) {
                Collection values = this.f12766c0.values();
                values.getClass();
                for (d dVar : (d[]) values.toArray(new d[0])) {
                    dVar.getClass();
                    e9.a aVar = dVar.f12755g;
                    if (aVar != null) {
                        aVar.f();
                    }
                }
                I();
                z zVar = this.f12765b0;
                if (zVar != null) {
                    qi.e.b(zVar);
                }
                this.f12765b0 = null;
                this.f12771h0 = true;
                return;
            }
            this.f12771h0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        if (this.f12771h0) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f12770g0) {
            return;
        }
        d();
        I();
        z zVar = this.f12765b0;
        zVar.getClass();
        zVar.flush();
    }

    public final synchronized void i(e9.a aVar, boolean z10) {
        long[] jArr;
        long j2;
        d dVar = (d) aVar.f4415b;
        if (nc.k.a(dVar.f12755g, aVar)) {
            if (z10 && !dVar.f12753e) {
                for (int i2 = 0; i2 < 2; i2++) {
                    boolean[] zArr = (boolean[]) aVar.f4416c;
                    zArr.getClass();
                    if (zArr[i2]) {
                        if (!this.B.z((x) dVar.f12752d.get(i2))) {
                            aVar.a();
                            return;
                        }
                    } else {
                        aVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            for (int i10 = 0; i10 < 2; i10++) {
                x xVar = (x) dVar.f12752d.get(i10);
                if (z10 && !dVar.f12754f) {
                    if (this.B.z(xVar)) {
                        x xVar2 = (x) dVar.f12751c.get(i10);
                        this.B.i(xVar, xVar2);
                        long j10 = dVar.f12750b[i10];
                        Long l10 = (Long) this.B.F(xVar2).f4858e;
                        if (l10 != null) {
                            j2 = l10.longValue();
                        } else {
                            j2 = 0;
                        }
                        dVar.f12750b[i10] = j2;
                        this.Z = (this.Z - j10) + j2;
                    }
                } else {
                    qi.e.d(this.B, xVar);
                }
            }
            dVar.f12755g = null;
            if (dVar.f12754f) {
                H(dVar);
                return;
            }
            this.f12767d0++;
            z zVar = this.f12765b0;
            zVar.getClass();
            if (!dVar.f12753e && !z10) {
                this.f12766c0.remove(dVar.f12749a);
                zVar.P(f12763q0);
                zVar.writeByte(32);
                zVar.P(dVar.f12749a);
                zVar.writeByte(10);
                zVar.flush();
                if (this.Z <= this.L || w()) {
                    this.f12775l0.c(this.f12776m0, 0L);
                }
                return;
            }
            dVar.f12753e = true;
            zVar.P(f12762o0);
            zVar.writeByte(32);
            zVar.P(dVar.f12749a);
            for (long j11 : dVar.f12750b) {
                zVar.writeByte(32);
                zVar.Q(j11);
            }
            zVar.writeByte(10);
            if (z10) {
                long j12 = this.f12774k0;
                this.f12774k0 = 1 + j12;
                dVar.f12757i = j12;
            }
            zVar.flush();
            if (this.Z <= this.L) {
            }
            this.f12775l0.c(this.f12776m0, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final synchronized e9.a m(long j2, String str) {
        e9.a aVar;
        str.getClass();
        v();
        d();
        J(str);
        d dVar = (d) this.f12766c0.get(str);
        if (j2 != -1 && (dVar == null || dVar.f12757i != j2)) {
            return null;
        }
        if (dVar != null) {
            aVar = dVar.f12755g;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return null;
        }
        if (dVar != null && dVar.f12756h != 0) {
            return null;
        }
        if (!this.f12772i0 && !this.f12773j0) {
            z zVar = this.f12765b0;
            zVar.getClass();
            zVar.P(p0);
            zVar.writeByte(32);
            zVar.P(str);
            zVar.writeByte(10);
            zVar.flush();
            if (this.f12768e0) {
                return null;
            }
            if (dVar == null) {
                dVar = new d(this, str);
                this.f12766c0.put(str, dVar);
            }
            e9.a aVar2 = new e9.a(this, dVar);
            dVar.f12755g = aVar2;
            return aVar2;
        }
        this.f12775l0.c(this.f12776m0, 0L);
        return null;
    }

    public final synchronized e t(String str) {
        str.getClass();
        v();
        d();
        J(str);
        d dVar = (d) this.f12766c0.get(str);
        if (dVar == null) {
            return null;
        }
        e a10 = dVar.a();
        if (a10 == null) {
            return null;
        }
        this.f12767d0++;
        z zVar = this.f12765b0;
        zVar.getClass();
        zVar.P(f12764r0);
        zVar.writeByte(32);
        zVar.P(str);
        zVar.writeByte(10);
        if (w()) {
            this.f12775l0.c(this.f12776m0, 0L);
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:37:0x0066, B:53:0x00c2, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:57:0x0003, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:37:0x0066, B:53:0x00c2, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:57:0x0003, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void v() {
        /*
            r7 = this;
            java.lang.String r0 = "DiskLruCache "
            monitor-enter(r7)
            java.util.TimeZone r1 = qi.g.f12552a     // Catch: java.lang.Throwable -> L27
            boolean r1 = r7.f12770g0     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lb
            monitor-exit(r7)
            return
        Lb:
            ri.g r1 = r7.B     // Catch: java.lang.Throwable -> L27
            fj.x r2 = r7.Y     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.z(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L2f
            ri.g r1 = r7.B     // Catch: java.lang.Throwable -> L27
            fj.x r2 = r7.R     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.z(r2)     // Catch: java.lang.Throwable -> L27
            ri.g r2 = r7.B
            fj.x r3 = r7.Y
            if (r1 == 0) goto L2a
            r2.w(r3)     // Catch: java.lang.Throwable -> L27
            goto L2f
        L27:
            r0 = move-exception
            goto Lc3
        L2a:
            fj.x r1 = r7.R     // Catch: java.lang.Throwable -> L27
            r2.i(r3, r1)     // Catch: java.lang.Throwable -> L27
        L2f:
            ri.g r1 = r7.B     // Catch: java.lang.Throwable -> L27
            fj.x r2 = r7.Y     // Catch: java.lang.Throwable -> L27
            byte[] r3 = qi.e.f12548a     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            r2.getClass()     // Catch: java.lang.Throwable -> L27
            fj.e0 r3 = r1.I(r2)     // Catch: java.lang.Throwable -> L27
            r4 = 1
            r5 = 0
            fj.k r6 = r1.B     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            r6.v(r2)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            if (r3 == 0) goto L4b
            r3.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            r1 = r4
            goto L6c
        L4d:
            r6 = move-exception
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.lang.Throwable -> L54
            goto L64
        L54:
            r3 = move-exception
            p7.t.a(r6, r3)     // Catch: java.lang.Throwable -> L27
            goto L64
        L59:
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.lang.Throwable -> L5f
            goto L62
        L5f:
            r3 = move-exception
        L60:
            r6 = r3
            goto L64
        L62:
            r3 = 0
            goto L60
        L64:
            if (r6 != 0) goto Lc2
            fj.k r1 = r1.B     // Catch: java.lang.Throwable -> L27
            r1.v(r2)     // Catch: java.lang.Throwable -> L27
            r1 = r5
        L6c:
            r7.f12769f0 = r1     // Catch: java.lang.Throwable -> L27
            ri.g r1 = r7.B     // Catch: java.lang.Throwable -> L27
            fj.x r2 = r7.R     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.z(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lbb
            r7.B()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            r7.z()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            r7.f12770g0 = r4     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            monitor-exit(r7)
            return
        L82:
            r1 = move-exception
            zi.f r2 = zi.f.f15151a     // Catch: java.lang.Throwable -> L27
            zi.f r2 = zi.f.f15151a     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L27
            fj.x r0 = r7.A     // Catch: java.lang.Throwable -> L27
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = " is corrupt: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L27
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", removing"
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L27
            r3 = 5
            r2.i(r0, r3, r1)     // Catch: java.lang.Throwable -> L27
            r7.close()     // Catch: java.lang.Throwable -> Lb7
            ri.g r0 = r7.B     // Catch: java.lang.Throwable -> Lb7
            fj.x r1 = r7.A     // Catch: java.lang.Throwable -> Lb7
            qi.e.c(r0, r1)     // Catch: java.lang.Throwable -> Lb7
            r7.f12771h0 = r5     // Catch: java.lang.Throwable -> L27
            goto Lbb
        Lb7:
            r0 = move-exception
            r7.f12771h0 = r5     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        Lbb:
            r7.G()     // Catch: java.lang.Throwable -> L27
            r7.f12770g0 = r4     // Catch: java.lang.Throwable -> L27
            monitor-exit(r7)
            return
        Lc2:
            throw r6     // Catch: java.lang.Throwable -> L27
        Lc3:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.h.v():void");
    }

    public final boolean w() {
        int i2 = this.f12767d0;
        if (i2 >= 2000 && i2 >= this.f12766c0.size()) {
            return true;
        }
        return false;
    }

    public final void z() {
        x xVar = this.X;
        g gVar = this.B;
        qi.e.d(gVar, xVar);
        Iterator it = this.f12766c0.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            d dVar = (d) next;
            int i2 = 0;
            if (dVar.f12755g == null) {
                while (i2 < 2) {
                    this.Z += dVar.f12750b[i2];
                    i2++;
                }
            } else {
                dVar.f12755g = null;
                while (i2 < 2) {
                    qi.e.d(gVar, (x) dVar.f12751c.get(i2));
                    qi.e.d(gVar, (x) dVar.f12752d.get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }
}
