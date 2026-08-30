package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hg1  reason: default package */
/* loaded from: classes.dex */
public final class hg1 implements Closeable, Flushable {
    public static final h85 l0 = new h85("[a-z0-9_-]{1,120}");
    public final jk4 A;
    public final long B;
    public final jk4 L;
    public final jk4 R;
    public final jk4 X;
    public final LinkedHashMap Y;
    public final g11 Z;
    public long c0;
    public int d0;
    public r45 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public final fg1 k0;

    /* JADX WARN: Type inference failed for: r3v12, types: [fg1, ff2] */
    public hg1(long j, g31 g31Var, j62 j62Var, jk4 jk4Var) {
        this.A = jk4Var;
        this.B = j;
        if (j > 0) {
            this.L = jk4Var.d("journal");
            this.R = jk4Var.d("journal.tmp");
            this.X = jk4Var.d("journal.bkp");
            this.Y = new LinkedHashMap(0, 0.75f, true);
            this.Z = iq2.c(se.O(hi2.c(), g31Var.m0(1)));
            this.k0 = new ff2(j62Var);
            return;
        }
        i.i("maxSize <= 0");
        throw null;
    }

    public static void J(String str) {
        if (l0.d(str)) {
            return;
        }
        i.g(b31.n('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        if (r2 != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x0081, B:34:0x0088, B:27:0x005c, B:29:0x006a, B:38:0x00a8, B:40:0x00af, B:43:0x00b4, B:45:0x00c5, B:48:0x00ca, B:53:0x0105, B:55:0x0110, B:59:0x0119, B:49:0x00e2, B:51:0x00f7, B:52:0x0102, B:37:0x0098, B:62:0x011e, B:63:0x0125), top: B:66:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.hg1 r9, defpackage.xf1 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg1.d(hg1, xf1, boolean):void");
    }

    public final void B() {
        Iterator it = this.Y.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            ag1 ag1Var = (ag1) it.next();
            int i = 0;
            if (ag1Var.g == null) {
                while (i < 2) {
                    j += ag1Var.b[i];
                    i++;
                }
            } else {
                ag1Var.g = null;
                while (i < 2) {
                    fg1 fg1Var = this.k0;
                    fg1Var.B((jk4) ag1Var.c.get(i));
                    fg1Var.B((jk4) ag1Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.c0 = j;
    }

    public final void C() {
        fg1 fg1Var = this.k0;
        jk4 jk4Var = this.L;
        s45 o = sn2.o(fg1Var.N(jk4Var));
        try {
            String O = o.O(Long.MAX_VALUE);
            String O2 = o.O(Long.MAX_VALUE);
            String O3 = o.O(Long.MAX_VALUE);
            String O4 = o.O(Long.MAX_VALUE);
            String O5 = o.O(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(O) && "1".equals(O2) && b53.x(String.valueOf(1), O3) && b53.x(String.valueOf(2), O4) && O5.length() <= 0) {
                int i = 0;
                while (true) {
                    try {
                        D(o.O(Long.MAX_VALUE));
                        i++;
                    } catch (EOFException unused) {
                        this.d0 = i - this.Y.size();
                        if (!o.d()) {
                            K();
                        } else {
                            fg1Var.getClass();
                            jk4Var.getClass();
                            this.e0 = new r45(new c52(fg1Var.d(jk4Var), new j0(20, this)));
                        }
                        try {
                            o.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (th == null) {
                            return;
                        }
                        throw th;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + O + ", " + O2 + ", " + O3 + ", " + O4 + ", " + O5 + ']');
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                o.close();
            } catch (Throwable th3) {
                pu.k(th, th3);
            }
        }
    }

    public final void D(String str) {
        String substring;
        int y0 = zg6.y0(' ', 0, 6, str);
        if (y0 != -1) {
            int i = y0 + 1;
            int y02 = zg6.y0(' ', i, 4, str);
            LinkedHashMap linkedHashMap = this.Y;
            if (y02 == -1) {
                substring = str.substring(i);
                if (y0 == 6 && gh6.n0(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, y02);
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new ag1(this, substring);
                linkedHashMap.put(substring, obj);
            }
            ag1 ag1Var = (ag1) obj;
            if (y02 != -1 && y0 == 5 && gh6.n0(str, "CLEAN", false)) {
                List P0 = zg6.P0(str.substring(y02 + 1), new char[]{' '}, 6);
                ag1Var.e = true;
                ag1Var.g = null;
                if (P0.size() == 2) {
                    try {
                        int size = P0.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ag1Var.b[i2] = Long.parseLong((String) P0.get(i2));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        vd6.d(P0, "unexpected journal line: ");
                        return;
                    }
                }
                vd6.d(P0, "unexpected journal line: ");
                return;
            } else if (y02 == -1 && y0 == 5 && gh6.n0(str, "DIRTY", false)) {
                ag1Var.g = new xf1(this, ag1Var);
                return;
            } else if (y02 == -1 && y0 == 4 && gh6.n0(str, "READ", false)) {
                return;
            } else {
                f81.j("unexpected journal line: ".concat(str));
                return;
            }
        }
        f81.j("unexpected journal line: ".concat(str));
    }

    public final void F(ag1 ag1Var) {
        r45 r45Var;
        int i = ag1Var.h;
        String str = ag1Var.a;
        if (i > 0 && (r45Var = this.e0) != null) {
            r45Var.c0("DIRTY");
            r45Var.writeByte(32);
            r45Var.c0(str);
            r45Var.writeByte(10);
            r45Var.flush();
        }
        if (ag1Var.h <= 0 && ag1Var.g == null) {
            for (int i2 = 0; i2 < 2; i2++) {
                this.k0.B((jk4) ag1Var.c.get(i2));
                long j = this.c0;
                long[] jArr = ag1Var.b;
                this.c0 = j - jArr[i2];
                jArr[i2] = 0;
            }
            this.d0++;
            r45 r45Var2 = this.e0;
            if (r45Var2 != null) {
                r45Var2.c0("REMOVE");
                r45Var2.writeByte(32);
                r45Var2.c0(str);
                r45Var2.writeByte(10);
            }
            this.Y.remove(str);
            if (this.d0 >= 2000) {
                x();
                return;
            }
            return;
        }
        ag1Var.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        F(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            r4 = this;
        L0:
            long r0 = r4.c0
            long r2 = r4.B
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.Y
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            ag1 r1 = (defpackage.ag1) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.F(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.i0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg1.I():void");
    }

    public final synchronized void K() {
        long[] jArr;
        try {
            r45 r45Var = this.e0;
            if (r45Var != null) {
                r45Var.close();
            }
            r45 n = sn2.n(this.k0.K(this.R));
            n.c0("libcore.io.DiskLruCache");
            n.writeByte(10);
            n.c0("1");
            n.writeByte(10);
            n.d0(1L);
            n.writeByte(10);
            n.d0(2L);
            n.writeByte(10);
            n.writeByte(10);
            for (ag1 ag1Var : this.Y.values()) {
                if (ag1Var.g != null) {
                    n.c0("DIRTY");
                    n.writeByte(32);
                    n.c0(ag1Var.a);
                    n.writeByte(10);
                } else {
                    n.c0("CLEAN");
                    n.writeByte(32);
                    n.c0(ag1Var.a);
                    for (long j : ag1Var.b) {
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
                boolean C = this.k0.C(this.L);
                fg1 fg1Var = this.k0;
                if (C) {
                    fg1Var.i(this.L, this.X);
                    this.k0.i(this.R, this.L);
                    this.k0.B(this.X);
                } else {
                    fg1Var.i(this.R, this.L);
                }
                fg1 fg1Var2 = this.k0;
                jk4 jk4Var = this.L;
                fg1Var2.getClass();
                jk4Var.getClass();
                this.e0 = new r45(new c52(fg1Var2.d(jk4Var), new j0(20, this)));
                this.d0 = 0;
                this.f0 = false;
                this.j0 = false;
            } else {
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.g0 && !this.h0) {
                for (ag1 ag1Var : (ag1[]) this.Y.values().toArray(new ag1[0])) {
                    xf1 xf1Var = ag1Var.g;
                    if (xf1Var != null) {
                        ag1 ag1Var2 = (ag1) xf1Var.L;
                        if (b53.x(ag1Var2.g, xf1Var)) {
                            ag1Var2.f = true;
                        }
                    }
                }
                I();
                iq2.f(this.Z, null);
                r45 r45Var = this.e0;
                r45Var.getClass();
                r45Var.close();
                this.e0 = null;
                this.h0 = true;
                return;
            }
            this.h0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.g0) {
            return;
        }
        if (!this.h0) {
            I();
            r45 r45Var = this.e0;
            r45Var.getClass();
            r45Var.flush();
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized xf1 i(String str) {
        xf1 xf1Var;
        if (!this.h0) {
            J(str);
            w();
            ag1 ag1Var = (ag1) this.Y.get(str);
            if (ag1Var != null) {
                xf1Var = ag1Var.g;
            } else {
                xf1Var = null;
            }
            if (xf1Var != null) {
                return null;
            }
            if (ag1Var != null && ag1Var.h != 0) {
                return null;
            }
            if (!this.i0 && !this.j0) {
                r45 r45Var = this.e0;
                r45Var.getClass();
                r45Var.c0("DIRTY");
                r45Var.writeByte(32);
                r45Var.c0(str);
                r45Var.writeByte(10);
                r45Var.flush();
                if (this.f0) {
                    return null;
                }
                if (ag1Var == null) {
                    ag1Var = new ag1(this, str);
                    this.Y.put(str, ag1Var);
                }
                xf1 xf1Var2 = new xf1(this, ag1Var);
                ag1Var.g = xf1Var2;
                return xf1Var2;
            }
            x();
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized cg1 p(String str) {
        cg1 a;
        if (!this.h0) {
            J(str);
            w();
            ag1 ag1Var = (ag1) this.Y.get(str);
            if (ag1Var != null && (a = ag1Var.a()) != null) {
                boolean z = true;
                this.d0++;
                r45 r45Var = this.e0;
                r45Var.getClass();
                r45Var.c0("READ");
                r45Var.writeByte(32);
                r45Var.c0(str);
                r45Var.writeByte(10);
                if (this.d0 < 2000) {
                    z = false;
                }
                if (z) {
                    x();
                }
                return a;
            }
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void w() {
        try {
            if (this.g0) {
                return;
            }
            this.k0.B(this.R);
            if (this.k0.C(this.X)) {
                boolean C = this.k0.C(this.L);
                fg1 fg1Var = this.k0;
                jk4 jk4Var = this.X;
                if (C) {
                    fg1Var.B(jk4Var);
                } else {
                    fg1Var.i(jk4Var, this.L);
                }
            }
            if (this.k0.C(this.L)) {
                try {
                    C();
                    B();
                    this.g0 = true;
                    return;
                } catch (IOException unused) {
                    close();
                    n40.I(this.k0, this.A);
                    this.h0 = false;
                }
            }
            K();
            this.g0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void x() {
        tq5.w(this.Z, null, null, new x3(this, (j11) null, 8), 3);
    }
}
