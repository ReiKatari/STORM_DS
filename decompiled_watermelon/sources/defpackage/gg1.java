package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gg1  reason: default package */
/* loaded from: classes.dex */
public final class gg1 implements Closeable, Flushable {
    public static final h85 o0 = new h85("[a-z0-9_-]{1,120}");
    public static final String p0 = "CLEAN";
    public static final String q0 = "DIRTY";
    public static final String r0 = "REMOVE";
    public static final String s0 = "READ";
    public final jk4 A;
    public final eg1 B;
    public final long L;
    public final jk4 R;
    public final jk4 X;
    public final jk4 Y;
    public long Z;
    public r45 c0;
    public final LinkedHashMap d0;
    public int e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public final en6 m0;
    public final dg1 n0;

    /* JADX WARN: Type inference failed for: r0v0, types: [ff2, eg1] */
    public gg1(j62 j62Var, jk4 jk4Var, long j, fn6 fn6Var) {
        j62Var.getClass();
        fn6Var.getClass();
        this.A = jk4Var;
        this.B = new ff2(j62Var);
        this.L = j;
        this.d0 = new LinkedHashMap(0, 0.75f, true);
        this.m0 = fn6Var.d();
        this.n0 = new dg1(0, this, b31.q(new StringBuilder(), ik7.b, " Cache"));
        if (j > 0) {
            this.R = jk4Var.d("journal");
            this.X = jk4Var.d("journal.tmp");
            this.Y = jk4Var.d("journal.bkp");
            return;
        }
        i.i("maxSize <= 0");
        throw null;
    }

    public static void N(String str) {
        if (o0.d(str)) {
            return;
        }
        i.g(b31.n('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final boolean B() {
        int i = this.e0;
        if (i >= 2000 && i >= this.d0.size()) {
            return true;
        }
        return false;
    }

    public final void C() {
        jk4 jk4Var = this.X;
        eg1 eg1Var = this.B;
        gk7.d(eg1Var, jk4Var);
        Iterator it = this.d0.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            zf1 zf1Var = (zf1) next;
            int i = 0;
            if (zf1Var.g == null) {
                while (i < 2) {
                    this.Z += zf1Var.b[i];
                    i++;
                }
            } else {
                zf1Var.g = null;
                while (i < 2) {
                    gk7.d(eg1Var, (jk4) zf1Var.c.get(i));
                    gk7.d(eg1Var, (jk4) zf1Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            eg1 r2 = r13.B
            jk4 r3 = r13.R
            sb6 r4 = r2.N(r3)
            s45 r4 = defpackage.sn2.o(r4)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r7 = r4.O(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r4.O(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = r4.O(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = r4.O(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = r4.O(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r12 = "libcore.io.DiskLruCache"
            boolean r12 = r12.equals(r7)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto La2
            java.lang.String r12 = "1"
            boolean r12 = r12.equals(r8)     // Catch: java.lang.Throwable -> L62
            if (r12 == 0) goto La2
            r12 = 201105(0x31191, float:2.81808E-40)
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L62
            boolean r9 = defpackage.b53.x(r12, r9)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto La2
            r9 = 2
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L62
            boolean r9 = defpackage.b53.x(r9, r10)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto La2
            int r9 = r11.length()     // Catch: java.lang.Throwable -> L62
            if (r9 > 0) goto La2
            r0 = 0
        L58:
            java.lang.String r1 = r4.O(r5)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            r13.F(r1)     // Catch: java.lang.Throwable -> L62 java.io.EOFException -> L64
            int r0 = r0 + 1
            goto L58
        L62:
            r13 = move-exception
            goto Lcb
        L64:
            java.util.LinkedHashMap r1 = r13.d0     // Catch: java.lang.Throwable -> L62
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L62
            int r0 = r0 - r1
            r13.e0 = r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L77
            r13.I()     // Catch: java.lang.Throwable -> L62
            goto L9b
        L77:
            r45 r0 = r13.c0     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L7e
            defpackage.gk7.b(r0)     // Catch: java.lang.Throwable -> L62
        L7e:
            r2.getClass()     // Catch: java.lang.Throwable -> L62
            r3.getClass()     // Catch: java.lang.Throwable -> L62
            g76 r0 = r2.d(r3)     // Catch: java.lang.Throwable -> L62
            c52 r1 = new c52     // Catch: java.lang.Throwable -> L62
            j0 r2 = new j0     // Catch: java.lang.Throwable -> L62
            r3 = 19
            r2.<init>(r3, r13)     // Catch: java.lang.Throwable -> L62
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L62
            r45 r0 = new r45     // Catch: java.lang.Throwable -> L62
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r13.c0 = r0     // Catch: java.lang.Throwable -> L62
        L9b:
            r4.close()     // Catch: java.lang.Throwable -> La0
            r13 = 0
            goto Ld3
        La0:
            r13 = move-exception
            goto Ld3
        La2:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r2.append(r7)     // Catch: java.lang.Throwable -> L62
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            r2.append(r8)     // Catch: java.lang.Throwable -> L62
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            r2.append(r10)     // Catch: java.lang.Throwable -> L62
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            r2.append(r11)     // Catch: java.lang.Throwable -> L62
            r0 = 93
            r2.append(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L62
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r13     // Catch: java.lang.Throwable -> L62
        Lcb:
            r4.close()     // Catch: java.lang.Throwable -> Lcf
            goto Ld3
        Lcf:
            r0 = move-exception
            defpackage.pu.k(r13, r0)
        Ld3:
            if (r13 != 0) goto Ld6
            return
        Ld6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg1.D():void");
    }

    public final void F(String str) {
        String substring;
        int y0 = zg6.y0(' ', 0, 6, str);
        if (y0 != -1) {
            int i = y0 + 1;
            int y02 = zg6.y0(' ', i, 4, str);
            LinkedHashMap linkedHashMap = this.d0;
            if (y02 == -1) {
                substring = str.substring(i);
                String str2 = r0;
                if (y0 == str2.length() && gh6.n0(str, str2, false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, y02);
            }
            zf1 zf1Var = (zf1) linkedHashMap.get(substring);
            if (zf1Var == null) {
                zf1Var = new zf1(this, substring);
                linkedHashMap.put(substring, zf1Var);
            }
            if (y02 != -1) {
                String str3 = p0;
                if (y0 == str3.length() && gh6.n0(str, str3, false)) {
                    List P0 = zg6.P0(str.substring(y02 + 1), new char[]{' '}, 6);
                    zf1Var.e = true;
                    zf1Var.g = null;
                    int size = P0.size();
                    zf1Var.j.getClass();
                    if (size == 2) {
                        try {
                            int size2 = P0.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                zf1Var.b[i2] = Long.parseLong((String) P0.get(i2));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            vd6.d(P0, "unexpected journal line: ");
                            return;
                        }
                    }
                    vd6.d(P0, "unexpected journal line: ");
                    return;
                }
            }
            if (y02 == -1) {
                String str4 = q0;
                if (y0 == str4.length() && gh6.n0(str, str4, false)) {
                    zf1Var.g = new xf1(this, zf1Var);
                    return;
                }
            }
            if (y02 == -1) {
                String str5 = s0;
                if (y0 == str5.length() && gh6.n0(str, str5, false)) {
                    return;
                }
            }
            f81.j("unexpected journal line: ".concat(str));
            return;
        }
        f81.j("unexpected journal line: ".concat(str));
    }

    public final synchronized void I() {
        long[] jArr;
        try {
            r45 r45Var = this.c0;
            if (r45Var != null) {
                r45Var.close();
            }
            r45 n = sn2.n(this.B.K(this.X));
            n.c0("libcore.io.DiskLruCache");
            n.writeByte(10);
            n.c0("1");
            n.writeByte(10);
            n.d0(201105L);
            n.writeByte(10);
            n.d0(2L);
            n.writeByte(10);
            n.writeByte(10);
            for (Object obj : this.d0.values()) {
                obj.getClass();
                zf1 zf1Var = (zf1) obj;
                if (zf1Var.g != null) {
                    n.c0(q0);
                    n.writeByte(32);
                    n.c0(zf1Var.a);
                    n.writeByte(10);
                } else {
                    n.c0(p0);
                    n.writeByte(32);
                    n.c0(zf1Var.a);
                    for (long j : zf1Var.b) {
                        n.writeByte(32);
                        n.d0(j);
                    }
                    n.writeByte(10);
                }
            }
            try {
                n.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                boolean C = this.B.C(this.R);
                eg1 eg1Var = this.B;
                if (C) {
                    eg1Var.i(this.R, this.Y);
                    this.B.i(this.X, this.R);
                    gk7.d(this.B, this.Y);
                } else {
                    eg1Var.i(this.X, this.R);
                }
                r45 r45Var2 = this.c0;
                if (r45Var2 != null) {
                    gk7.b(r45Var2);
                }
                eg1 eg1Var2 = this.B;
                jk4 jk4Var = this.R;
                eg1Var2.getClass();
                jk4Var.getClass();
                this.c0 = new r45(new c52(eg1Var2.d(jk4Var), (mi2) new j0(19, this)));
                this.f0 = false;
                this.k0 = false;
            } else {
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void J(zf1 zf1Var) {
        r45 r45Var;
        String str = zf1Var.a;
        if (!this.g0) {
            if (zf1Var.h > 0 && (r45Var = this.c0) != null) {
                r45Var.c0(q0);
                r45Var.writeByte(32);
                r45Var.c0(str);
                r45Var.writeByte(10);
                r45Var.flush();
            }
            if (zf1Var.h > 0 || zf1Var.g != null) {
                zf1Var.f = true;
                return;
            }
        }
        xf1 xf1Var = zf1Var.g;
        if (xf1Var != null) {
            xf1Var.g();
        }
        for (int i = 0; i < 2; i++) {
            gk7.d(this.B, (jk4) zf1Var.c.get(i));
            long j = this.Z;
            long[] jArr = zf1Var.b;
            this.Z = j - jArr[i];
            jArr[i] = 0;
        }
        this.e0++;
        r45 r45Var2 = this.c0;
        if (r45Var2 != null) {
            r45Var2.c0(r0);
            r45Var2.writeByte(32);
            r45Var2.c0(str);
            r45Var2.writeByte(10);
        }
        this.d0.remove(str);
        if (B()) {
            this.m0.c(this.n0, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        J(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K() {
        /*
            r4 = this;
        L0:
            long r0 = r4.Z
            long r2 = r4.L
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2a
            java.util.LinkedHashMap r0 = r4.d0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            r1.getClass()
            zf1 r1 = (defpackage.zf1) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.J(r1)
            goto L0
        L29:
            return
        L2a:
            r0 = 0
            r4.j0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg1.K():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        zf1[] zf1VarArr;
        try {
            if (this.h0 && !this.i0) {
                Collection values = this.d0.values();
                values.getClass();
                for (zf1 zf1Var : (zf1[]) values.toArray(new zf1[0])) {
                    zf1Var.getClass();
                    xf1 xf1Var = zf1Var.g;
                    if (xf1Var != null) {
                        xf1Var.g();
                    }
                }
                K();
                r45 r45Var = this.c0;
                if (r45Var != null) {
                    gk7.b(r45Var);
                }
                this.c0 = null;
                this.i0 = true;
                return;
            }
            this.i0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        if (this.i0) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.h0) {
            return;
        }
        d();
        K();
        r45 r45Var = this.c0;
        r45Var.getClass();
        r45Var.flush();
    }

    public final synchronized void i(xf1 xf1Var, boolean z) {
        long[] jArr;
        long j;
        zf1 zf1Var = (zf1) xf1Var.L;
        if (b53.x(zf1Var.g, xf1Var)) {
            if (z && !zf1Var.e) {
                for (int i = 0; i < 2; i++) {
                    boolean[] zArr = (boolean[]) xf1Var.B;
                    zArr.getClass();
                    if (zArr[i]) {
                        if (!this.B.C((jk4) zf1Var.d.get(i))) {
                            xf1Var.a();
                            return;
                        }
                    } else {
                        xf1Var.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < 2; i2++) {
                jk4 jk4Var = (jk4) zf1Var.d.get(i2);
                if (z && !zf1Var.f) {
                    if (this.B.C(jk4Var)) {
                        jk4 jk4Var2 = (jk4) zf1Var.c.get(i2);
                        this.B.i(jk4Var, jk4Var2);
                        long j2 = zf1Var.b[i2];
                        Long l = (Long) this.B.F(jk4Var2).e;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        zf1Var.b[i2] = j;
                        this.Z = (this.Z - j2) + j;
                    }
                } else {
                    gk7.d(this.B, jk4Var);
                }
            }
            zf1Var.g = null;
            if (zf1Var.f) {
                J(zf1Var);
                return;
            }
            this.e0++;
            r45 r45Var = this.c0;
            r45Var.getClass();
            if (!zf1Var.e && !z) {
                this.d0.remove(zf1Var.a);
                r45Var.c0(r0);
                r45Var.writeByte(32);
                r45Var.c0(zf1Var.a);
                r45Var.writeByte(10);
                r45Var.flush();
                if (this.Z <= this.L || B()) {
                    this.m0.c(this.n0, 0L);
                }
                return;
            }
            zf1Var.e = true;
            r45Var.c0(p0);
            r45Var.writeByte(32);
            r45Var.c0(zf1Var.a);
            for (long j3 : zf1Var.b) {
                r45Var.writeByte(32);
                r45Var.d0(j3);
            }
            r45Var.writeByte(10);
            if (z) {
                long j4 = this.l0;
                this.l0 = 1 + j4;
                zf1Var.i = j4;
            }
            r45Var.flush();
            if (this.Z <= this.L) {
            }
            this.m0.c(this.n0, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final synchronized xf1 p(long j, String str) {
        xf1 xf1Var;
        str.getClass();
        x();
        d();
        N(str);
        zf1 zf1Var = (zf1) this.d0.get(str);
        if (j != -1 && (zf1Var == null || zf1Var.i != j)) {
            return null;
        }
        if (zf1Var != null) {
            xf1Var = zf1Var.g;
        } else {
            xf1Var = null;
        }
        if (xf1Var != null) {
            return null;
        }
        if (zf1Var != null && zf1Var.h != 0) {
            return null;
        }
        if (!this.j0 && !this.k0) {
            r45 r45Var = this.c0;
            r45Var.getClass();
            r45Var.c0(q0);
            r45Var.writeByte(32);
            r45Var.c0(str);
            r45Var.writeByte(10);
            r45Var.flush();
            if (this.f0) {
                return null;
            }
            if (zf1Var == null) {
                zf1Var = new zf1(this, str);
                this.d0.put(str, zf1Var);
            }
            xf1 xf1Var2 = new xf1(this, zf1Var);
            zf1Var.g = xf1Var2;
            return xf1Var2;
        }
        this.m0.c(this.n0, 0L);
        return null;
    }

    public final synchronized bg1 w(String str) {
        str.getClass();
        x();
        d();
        N(str);
        zf1 zf1Var = (zf1) this.d0.get(str);
        if (zf1Var == null) {
            return null;
        }
        bg1 a = zf1Var.a();
        if (a == null) {
            return null;
        }
        this.e0++;
        r45 r45Var = this.c0;
        r45Var.getClass();
        r45Var.c0(s0);
        r45Var.writeByte(32);
        r45Var.c0(str);
        r45Var.writeByte(10);
        if (B()) {
            this.m0.c(this.n0, 0L);
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:37:0x0066, B:53:0x00c2, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:57:0x0003, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:37:0x0066, B:53:0x00c2, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:57:0x0003, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void x() {
        /*
            r7 = this;
            java.lang.String r0 = "DiskLruCache "
            monitor-enter(r7)
            java.util.TimeZone r1 = defpackage.ik7.a     // Catch: java.lang.Throwable -> L27
            boolean r1 = r7.h0     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lb
            monitor-exit(r7)
            return
        Lb:
            eg1 r1 = r7.B     // Catch: java.lang.Throwable -> L27
            jk4 r2 = r7.Y     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.C(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L2f
            eg1 r1 = r7.B     // Catch: java.lang.Throwable -> L27
            jk4 r2 = r7.R     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.C(r2)     // Catch: java.lang.Throwable -> L27
            eg1 r2 = r7.B
            jk4 r3 = r7.Y
            if (r1 == 0) goto L2a
            r2.B(r3)     // Catch: java.lang.Throwable -> L27
            goto L2f
        L27:
            r0 = move-exception
            goto Lc3
        L2a:
            jk4 r1 = r7.R     // Catch: java.lang.Throwable -> L27
            r2.i(r3, r1)     // Catch: java.lang.Throwable -> L27
        L2f:
            eg1 r1 = r7.B     // Catch: java.lang.Throwable -> L27
            jk4 r2 = r7.Y     // Catch: java.lang.Throwable -> L27
            byte[] r3 = defpackage.gk7.a     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            r2.getClass()     // Catch: java.lang.Throwable -> L27
            g76 r3 = r1.K(r2)     // Catch: java.lang.Throwable -> L27
            r4 = 1
            r5 = 0
            j62 r6 = r1.B     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            r6.x(r2)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
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
            defpackage.pu.k(r6, r3)     // Catch: java.lang.Throwable -> L27
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
            j62 r1 = r1.B     // Catch: java.lang.Throwable -> L27
            r1.x(r2)     // Catch: java.lang.Throwable -> L27
            r1 = r5
        L6c:
            r7.g0 = r1     // Catch: java.lang.Throwable -> L27
            eg1 r1 = r7.B     // Catch: java.lang.Throwable -> L27
            jk4 r2 = r7.R     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.C(r2)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto Lbb
            r7.D()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            r7.C()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            r7.h0 = r4     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L82
            monitor-exit(r7)
            return
        L82:
            r1 = move-exception
            fo4 r2 = defpackage.fo4.a     // Catch: java.lang.Throwable -> L27
            fo4 r2 = defpackage.fo4.a     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L27
            jk4 r0 = r7.A     // Catch: java.lang.Throwable -> L27
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = " is corrupt: "
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L27
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", removing"
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L27
            r3 = 5
            r2.i(r3, r0, r1)     // Catch: java.lang.Throwable -> L27
            r7.close()     // Catch: java.lang.Throwable -> Lb7
            eg1 r0 = r7.B     // Catch: java.lang.Throwable -> Lb7
            jk4 r1 = r7.A     // Catch: java.lang.Throwable -> Lb7
            defpackage.gk7.c(r0, r1)     // Catch: java.lang.Throwable -> Lb7
            r7.i0 = r5     // Catch: java.lang.Throwable -> L27
            goto Lbb
        Lb7:
            r0 = move-exception
            r7.i0 = r5     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        Lbb:
            r7.I()     // Catch: java.lang.Throwable -> L27
            r7.h0 = r4     // Catch: java.lang.Throwable -> L27
            monitor-exit(r7)
            return
        Lc2:
            throw r6     // Catch: java.lang.Throwable -> L27
        Lc3:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg1.x():void");
    }
}
