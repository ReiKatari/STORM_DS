package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lk1  reason: default package */
/* loaded from: classes.dex */
public final class lk1 implements Closeable, Flushable {
    public static final xh5 m0 = new xh5("[a-z0-9_-]{1,120}");
    public final lt4 A;
    public final long B;
    public final lt4 L;
    public final lt4 R;
    public final lt4 X;
    public final LinkedHashMap Y;
    public final o41 Z;
    public long d0;
    public int e0;
    public ee5 f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public final jk1 l0;

    /* JADX WARN: Type inference failed for: r3v12, types: [jk1, ek2] */
    public lk1(long j, n61 n61Var, db2 db2Var, lt4 lt4Var) {
        this.A = lt4Var;
        this.B = j;
        if (j > 0) {
            this.L = lt4Var.d("journal");
            this.R = lt4Var.d("journal.tmp");
            this.X = lt4Var.d("journal.bkp");
            this.Y = new LinkedHashMap(0, 0.75f, true);
            this.Z = g04.i(jw2.y(oi2.c(), n61Var.m0(1)));
            this.l0 = new ek2(db2Var);
            return;
        }
        i.h("maxSize <= 0");
        throw null;
    }

    public static void F(String str) {
        if (m0.d(str)) {
            return;
        }
        i.f(i61.k('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        if (r2 != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x0081, B:34:0x0088, B:27:0x005c, B:29:0x006a, B:38:0x00a8, B:40:0x00af, B:43:0x00b4, B:45:0x00c5, B:48:0x00ca, B:53:0x0105, B:55:0x0110, B:59:0x0119, B:49:0x00e2, B:51:0x00f7, B:52:0x0102, B:37:0x0098, B:62:0x011e, B:63:0x0125), top: B:66:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(lk1 lk1Var, bk1 bk1Var, boolean z) {
        long[] jArr;
        long j;
        synchronized (lk1Var) {
            ek1 ek1Var = (ek1) bk1Var.L;
            if (nb3.k(ek1Var.g, bk1Var)) {
                boolean z2 = false;
                if (z && !ek1Var.f) {
                    for (int i = 0; i < 2; i++) {
                        if (((boolean[]) bk1Var.B)[i] && !lk1Var.l0.v((lt4) ek1Var.d.get(i))) {
                            bk1Var.e(false);
                            return;
                        }
                    }
                    for (int i2 = 0; i2 < 2; i2++) {
                        lt4 lt4Var = (lt4) ek1Var.d.get(i2);
                        lt4 lt4Var2 = (lt4) ek1Var.c.get(i2);
                        boolean v = lk1Var.l0.v(lt4Var);
                        jk1 jk1Var = lk1Var.l0;
                        if (v) {
                            jk1Var.h(lt4Var, lt4Var2);
                        } else {
                            lt4 lt4Var3 = (lt4) ek1Var.c.get(i2);
                            if (!jk1Var.v(lt4Var3)) {
                                k.a(jk1Var.J(lt4Var3));
                            }
                        }
                        long j2 = ek1Var.b[i2];
                        Long l = (Long) lk1Var.l0.A(lt4Var2).e;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        ek1Var.b[i2] = j;
                        lk1Var.d0 = (lk1Var.d0 - j2) + j;
                    }
                } else {
                    for (int i3 = 0; i3 < 2; i3++) {
                        lk1Var.l0.u((lt4) ek1Var.d.get(i3));
                    }
                }
                ek1Var.g = null;
                if (ek1Var.f) {
                    lk1Var.A(ek1Var);
                    return;
                }
                lk1Var.e0++;
                ee5 ee5Var = lk1Var.f0;
                ee5Var.getClass();
                if (!z && !ek1Var.e) {
                    lk1Var.Y.remove(ek1Var.a);
                    ee5Var.H("REMOVE");
                    ee5Var.writeByte(32);
                    ee5Var.H(ek1Var.a);
                    ee5Var.writeByte(10);
                    ee5Var.flush();
                    if (lk1Var.d0 <= lk1Var.B) {
                        if (lk1Var.e0 >= 2000) {
                            z2 = true;
                        }
                    }
                    lk1Var.r();
                    return;
                }
                ek1Var.e = true;
                ee5Var.H("CLEAN");
                ee5Var.writeByte(32);
                ee5Var.H(ek1Var.a);
                for (long j3 : ek1Var.b) {
                    ee5Var.writeByte(32);
                    ee5Var.h0(j3);
                }
                ee5Var.writeByte(10);
                ee5Var.flush();
                if (lk1Var.d0 <= lk1Var.B) {
                }
                lk1Var.r();
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void A(ek1 ek1Var) {
        ee5 ee5Var;
        int i = ek1Var.h;
        String str = ek1Var.a;
        if (i > 0 && (ee5Var = this.f0) != null) {
            ee5Var.H("DIRTY");
            ee5Var.writeByte(32);
            ee5Var.H(str);
            ee5Var.writeByte(10);
            ee5Var.flush();
        }
        if (ek1Var.h <= 0 && ek1Var.g == null) {
            for (int i2 = 0; i2 < 2; i2++) {
                this.l0.u((lt4) ek1Var.c.get(i2));
                long j = this.d0;
                long[] jArr = ek1Var.b;
                this.d0 = j - jArr[i2];
                jArr[i2] = 0;
            }
            this.e0++;
            ee5 ee5Var2 = this.f0;
            if (ee5Var2 != null) {
                ee5Var2.H("REMOVE");
                ee5Var2.writeByte(32);
                ee5Var2.H(str);
                ee5Var2.writeByte(10);
            }
            this.Y.remove(str);
            if (this.e0 >= 2000) {
                r();
                return;
            }
            return;
        }
        ek1Var.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        A(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D() {
        while (this.d0 > this.B) {
            for (ek1 ek1Var : this.Y.values()) {
                if (!ek1Var.f) {
                    break;
                }
            }
            return;
        }
        this.j0 = false;
    }

    public final synchronized void J() {
        long[] jArr;
        try {
            ee5 ee5Var = this.f0;
            if (ee5Var != null) {
                ee5Var.close();
            }
            ee5 t = hi2.t(this.l0.J(this.R));
            t.H("libcore.io.DiskLruCache");
            t.writeByte(10);
            t.H("1");
            t.writeByte(10);
            t.h0(1L);
            t.writeByte(10);
            t.h0(2L);
            t.writeByte(10);
            t.writeByte(10);
            for (ek1 ek1Var : this.Y.values()) {
                if (ek1Var.g != null) {
                    t.H("DIRTY");
                    t.writeByte(32);
                    t.H(ek1Var.a);
                    t.writeByte(10);
                } else {
                    t.H("CLEAN");
                    t.writeByte(32);
                    t.H(ek1Var.a);
                    for (long j : ek1Var.b) {
                        t.writeByte(32);
                        t.h0(j);
                    }
                    t.writeByte(10);
                }
            }
            try {
                t.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                boolean v = this.l0.v(this.L);
                jk1 jk1Var = this.l0;
                if (v) {
                    jk1Var.h(this.L, this.X);
                    this.l0.h(this.R, this.L);
                    this.l0.u(this.X);
                } else {
                    jk1Var.h(this.R, this.L);
                }
                jk1 jk1Var2 = this.l0;
                lt4 lt4Var = this.L;
                jk1Var2.getClass();
                lt4Var.getClass();
                this.f0 = new ee5(new v92(jk1Var2.e(lt4Var), new k0(this, 20)));
                this.e0 = 0;
                this.g0 = false;
                this.k0 = false;
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
            if (this.h0 && !this.i0) {
                for (ek1 ek1Var : (ek1[]) this.Y.values().toArray(new ek1[0])) {
                    bk1 bk1Var = ek1Var.g;
                    if (bk1Var != null) {
                        ek1 ek1Var2 = (ek1) bk1Var.L;
                        if (nb3.k(ek1Var2.g, bk1Var)) {
                            ek1Var2.f = true;
                        }
                    }
                }
                D();
                g04.x(this.Z, null);
                ee5 ee5Var = this.f0;
                ee5Var.getClass();
                ee5Var.close();
                this.f0 = null;
                this.i0 = true;
                return;
            }
            this.i0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.h0) {
            return;
        }
        if (!this.i0) {
            D();
            ee5 ee5Var = this.f0;
            ee5Var.getClass();
            ee5Var.flush();
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized bk1 h(String str) {
        bk1 bk1Var;
        if (!this.i0) {
            F(str);
            n();
            ek1 ek1Var = (ek1) this.Y.get(str);
            if (ek1Var != null) {
                bk1Var = ek1Var.g;
            } else {
                bk1Var = null;
            }
            if (bk1Var != null) {
                return null;
            }
            if (ek1Var != null && ek1Var.h != 0) {
                return null;
            }
            if (!this.j0 && !this.k0) {
                ee5 ee5Var = this.f0;
                ee5Var.getClass();
                ee5Var.H("DIRTY");
                ee5Var.writeByte(32);
                ee5Var.H(str);
                ee5Var.writeByte(10);
                ee5Var.flush();
                if (this.g0) {
                    return null;
                }
                if (ek1Var == null) {
                    ek1Var = new ek1(this, str);
                    this.Y.put(str, ek1Var);
                }
                bk1 bk1Var2 = new bk1(this, ek1Var);
                ek1Var.g = bk1Var2;
                return bk1Var2;
            }
            r();
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized gk1 k(String str) {
        gk1 a;
        if (!this.i0) {
            F(str);
            n();
            ek1 ek1Var = (ek1) this.Y.get(str);
            if (ek1Var != null && (a = ek1Var.a()) != null) {
                boolean z = true;
                this.e0++;
                ee5 ee5Var = this.f0;
                ee5Var.getClass();
                ee5Var.H("READ");
                ee5Var.writeByte(32);
                ee5Var.H(str);
                ee5Var.writeByte(10);
                if (this.e0 < 2000) {
                    z = false;
                }
                if (z) {
                    r();
                }
                return a;
            }
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void n() {
        try {
            if (this.h0) {
                return;
            }
            this.l0.u(this.R);
            if (this.l0.v(this.X)) {
                boolean v = this.l0.v(this.L);
                jk1 jk1Var = this.l0;
                lt4 lt4Var = this.X;
                if (v) {
                    jk1Var.u(lt4Var);
                } else {
                    jk1Var.h(lt4Var, this.L);
                }
            }
            if (this.l0.v(this.L)) {
                try {
                    v();
                    u();
                    this.h0 = true;
                    return;
                } catch (IOException unused) {
                    close();
                    u24.i(this.l0, this.A);
                    this.i0 = false;
                }
            }
            J();
            this.h0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void r() {
        hv.L(this.Z, null, null, new y3(this, (r41) null, 9), 3);
    }

    public final void u() {
        Iterator it = this.Y.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            ek1 ek1Var = (ek1) it.next();
            int i = 0;
            if (ek1Var.g == null) {
                while (i < 2) {
                    j += ek1Var.b[i];
                    i++;
                }
            } else {
                ek1Var.g = null;
                while (i < 2) {
                    jk1 jk1Var = this.l0;
                    jk1Var.u((lt4) ek1Var.c.get(i));
                    jk1Var.u((lt4) ek1Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.d0 = j;
    }

    public final void v() {
        jk1 jk1Var = this.l0;
        lt4 lt4Var = this.L;
        fe5 u = hi2.u(jk1Var.N(lt4Var));
        try {
            String y = u.y(Long.MAX_VALUE);
            String y2 = u.y(Long.MAX_VALUE);
            String y3 = u.y(Long.MAX_VALUE);
            String y4 = u.y(Long.MAX_VALUE);
            String y5 = u.y(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(y) && "1".equals(y2) && nb3.k(String.valueOf(1), y3) && nb3.k(String.valueOf(2), y4) && y5.length() <= 0) {
                int i = 0;
                while (true) {
                    try {
                        x(u.y(Long.MAX_VALUE));
                        i++;
                    } catch (EOFException unused) {
                        this.e0 = i - this.Y.size();
                        if (!u.e()) {
                            J();
                        } else {
                            jk1Var.getClass();
                            lt4Var.getClass();
                            this.f0 = new ee5(new v92(jk1Var.e(lt4Var), new k0(this, 20)));
                        }
                        try {
                            u.close();
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
                throw new IOException("unexpected journal header: [" + y + ", " + y2 + ", " + y3 + ", " + y4 + ", " + y5 + ']');
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                u.close();
            } catch (Throwable th3) {
                mb3.q(th, th3);
            }
        }
    }

    public final void x(String str) {
        String substring;
        int s0 = qs6.s0(' ', 0, 6, str);
        if (s0 != -1) {
            int i = s0 + 1;
            int s02 = qs6.s0(' ', i, 4, str);
            LinkedHashMap linkedHashMap = this.Y;
            if (s02 == -1) {
                substring = str.substring(i);
                if (s0 == 6 && xs6.g0(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, s02);
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new ek1(this, substring);
                linkedHashMap.put(substring, obj);
            }
            ek1 ek1Var = (ek1) obj;
            if (s02 != -1 && s0 == 5 && xs6.g0(str, "CLEAN", false)) {
                List J0 = qs6.J0(str.substring(s02 + 1), new char[]{' '}, 6);
                ek1Var.e = true;
                ek1Var.g = null;
                if (J0.size() == 2) {
                    try {
                        int size = J0.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ek1Var.b[i2] = Long.parseLong((String) J0.get(i2));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        fa6.d(J0, "unexpected journal line: ");
                        return;
                    }
                }
                fa6.d(J0, "unexpected journal line: ");
                return;
            } else if (s02 == -1 && s0 == 5 && xs6.g0(str, "DIRTY", false)) {
                ek1Var.g = new bk1(this, ek1Var);
                return;
            } else if (s02 == -1 && s0 == 4 && xs6.g0(str, "READ", false)) {
                return;
            } else {
                e41.i("unexpected journal line: ".concat(str));
                return;
            }
        }
        e41.i("unexpected journal line: ".concat(str));
    }
}
