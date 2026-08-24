package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk1  reason: default package */
/* loaded from: classes.dex */
public final class kk1 implements Closeable, Flushable {
    public static final xh5 p0 = new xh5("[a-z0-9_-]{1,120}");
    public static final String q0 = "CLEAN";
    public static final String r0 = "DIRTY";
    public static final String s0 = "REMOVE";
    public static final String t0 = "READ";
    public final lt4 A;
    public final ik1 B;
    public final long L;
    public final lt4 R;
    public final lt4 X;
    public final lt4 Y;
    public long Z;
    public ee5 d0;
    public final LinkedHashMap e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public long m0;
    public final pz6 n0;
    public final hk1 o0;

    /* JADX WARN: Type inference failed for: r0v0, types: [ek2, ik1] */
    public kk1(db2 db2Var, lt4 lt4Var, long j, qz6 qz6Var) {
        db2Var.getClass();
        qz6Var.getClass();
        this.A = lt4Var;
        this.B = new ek2(db2Var);
        this.L = j;
        this.e0 = new LinkedHashMap(0, 0.75f, true);
        this.n0 = qz6Var.d();
        this.o0 = new hk1(i61.n(new StringBuilder(), az7.b, " Cache"), 0, this);
        if (j > 0) {
            this.R = lt4Var.d("journal");
            this.X = lt4Var.d("journal.tmp");
            this.Y = lt4Var.d("journal.bkp");
            return;
        }
        i.h("maxSize <= 0");
        throw null;
    }

    public static void N(String str) {
        if (p0.d(str)) {
            return;
        }
        i.f(i61.k('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final void A(String str) {
        String substring;
        int s02 = qs6.s0(' ', 0, 6, str);
        if (s02 != -1) {
            int i = s02 + 1;
            int s03 = qs6.s0(' ', i, 4, str);
            LinkedHashMap linkedHashMap = this.e0;
            if (s03 == -1) {
                substring = str.substring(i);
                String str2 = s0;
                if (s02 == str2.length() && xs6.g0(str, str2, false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, s03);
            }
            dk1 dk1Var = (dk1) linkedHashMap.get(substring);
            if (dk1Var == null) {
                dk1Var = new dk1(this, substring);
                linkedHashMap.put(substring, dk1Var);
            }
            if (s03 != -1) {
                String str3 = q0;
                if (s02 == str3.length() && xs6.g0(str, str3, false)) {
                    List J0 = qs6.J0(str.substring(s03 + 1), new char[]{' '}, 6);
                    dk1Var.e = true;
                    dk1Var.g = null;
                    int size = J0.size();
                    dk1Var.j.getClass();
                    if (size == 2) {
                        try {
                            int size2 = J0.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                dk1Var.b[i2] = Long.parseLong((String) J0.get(i2));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            fa6.d(J0, "unexpected journal line: ");
                            return;
                        }
                    }
                    fa6.d(J0, "unexpected journal line: ");
                    return;
                }
            }
            if (s03 == -1) {
                String str4 = r0;
                if (s02 == str4.length() && xs6.g0(str, str4, false)) {
                    dk1Var.g = new bk1(this, dk1Var);
                    return;
                }
            }
            if (s03 == -1) {
                String str5 = t0;
                if (s02 == str5.length() && xs6.g0(str, str5, false)) {
                    return;
                }
            }
            e41.i("unexpected journal line: ".concat(str));
            return;
        }
        e41.i("unexpected journal line: ".concat(str));
    }

    public final synchronized void D() {
        long[] jArr;
        try {
            ee5 ee5Var = this.d0;
            if (ee5Var != null) {
                ee5Var.close();
            }
            ee5 t = hi2.t(this.B.J(this.X));
            t.H("libcore.io.DiskLruCache");
            t.writeByte(10);
            t.H("1");
            t.writeByte(10);
            t.h0(201105L);
            t.writeByte(10);
            t.h0(2L);
            t.writeByte(10);
            t.writeByte(10);
            for (Object obj : this.e0.values()) {
                obj.getClass();
                dk1 dk1Var = (dk1) obj;
                if (dk1Var.g != null) {
                    t.H(r0);
                    t.writeByte(32);
                    t.H(dk1Var.a);
                    t.writeByte(10);
                } else {
                    t.H(q0);
                    t.writeByte(32);
                    t.H(dk1Var.a);
                    for (long j : dk1Var.b) {
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
                boolean v = this.B.v(this.R);
                ik1 ik1Var = this.B;
                if (v) {
                    ik1Var.h(this.R, this.Y);
                    this.B.h(this.X, this.R);
                    yy7.d(this.B, this.Y);
                } else {
                    ik1Var.h(this.X, this.R);
                }
                ee5 ee5Var2 = this.d0;
                if (ee5Var2 != null) {
                    yy7.b(ee5Var2);
                }
                ik1 ik1Var2 = this.B;
                lt4 lt4Var = this.R;
                ik1Var2.getClass();
                lt4Var.getClass();
                this.d0 = new ee5(new v92(ik1Var2.e(lt4Var), (qn2) new k0(this, 19)));
                this.g0 = false;
                this.l0 = false;
            } else {
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void F(dk1 dk1Var) {
        ee5 ee5Var;
        String str = dk1Var.a;
        if (!this.h0) {
            if (dk1Var.h > 0 && (ee5Var = this.d0) != null) {
                ee5Var.H(r0);
                ee5Var.writeByte(32);
                ee5Var.H(str);
                ee5Var.writeByte(10);
                ee5Var.flush();
            }
            if (dk1Var.h > 0 || dk1Var.g != null) {
                dk1Var.f = true;
                return;
            }
        }
        bk1 bk1Var = dk1Var.g;
        if (bk1Var != null) {
            bk1Var.g();
        }
        for (int i = 0; i < 2; i++) {
            yy7.d(this.B, (lt4) dk1Var.c.get(i));
            long j = this.Z;
            long[] jArr = dk1Var.b;
            this.Z = j - jArr[i];
            jArr[i] = 0;
        }
        this.f0++;
        ee5 ee5Var2 = this.d0;
        if (ee5Var2 != null) {
            ee5Var2.H(s0);
            ee5Var2.writeByte(32);
            ee5Var2.H(str);
            ee5Var2.writeByte(10);
        }
        this.e0.remove(str);
        if (u()) {
            this.n0.c(this.o0, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        F(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        while (this.Z > this.L) {
            for (Object obj : this.e0.values()) {
                obj.getClass();
                dk1 dk1Var = (dk1) obj;
                if (!dk1Var.f) {
                    break;
                }
            }
            return;
        }
        this.k0 = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        dk1[] dk1VarArr;
        try {
            if (this.i0 && !this.j0) {
                Collection values = this.e0.values();
                values.getClass();
                for (dk1 dk1Var : (dk1[]) values.toArray(new dk1[0])) {
                    dk1Var.getClass();
                    bk1 bk1Var = dk1Var.g;
                    if (bk1Var != null) {
                        bk1Var.g();
                    }
                }
                J();
                ee5 ee5Var = this.d0;
                if (ee5Var != null) {
                    yy7.b(ee5Var);
                }
                this.d0 = null;
                this.j0 = true;
                return;
            }
            this.j0 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        if (this.j0) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.i0) {
            return;
        }
        e();
        J();
        ee5 ee5Var = this.d0;
        ee5Var.getClass();
        ee5Var.flush();
    }

    public final synchronized void h(bk1 bk1Var, boolean z) {
        long[] jArr;
        long j;
        dk1 dk1Var = (dk1) bk1Var.L;
        if (nb3.k(dk1Var.g, bk1Var)) {
            if (z && !dk1Var.e) {
                for (int i = 0; i < 2; i++) {
                    boolean[] zArr = (boolean[]) bk1Var.B;
                    zArr.getClass();
                    if (zArr[i]) {
                        if (!this.B.v((lt4) dk1Var.d.get(i))) {
                            bk1Var.a();
                            return;
                        }
                    } else {
                        bk1Var.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < 2; i2++) {
                lt4 lt4Var = (lt4) dk1Var.d.get(i2);
                if (z && !dk1Var.f) {
                    if (this.B.v(lt4Var)) {
                        lt4 lt4Var2 = (lt4) dk1Var.c.get(i2);
                        this.B.h(lt4Var, lt4Var2);
                        long j2 = dk1Var.b[i2];
                        Long l = (Long) this.B.A(lt4Var2).e;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        dk1Var.b[i2] = j;
                        this.Z = (this.Z - j2) + j;
                    }
                } else {
                    yy7.d(this.B, lt4Var);
                }
            }
            dk1Var.g = null;
            if (dk1Var.f) {
                F(dk1Var);
                return;
            }
            this.f0++;
            ee5 ee5Var = this.d0;
            ee5Var.getClass();
            if (!dk1Var.e && !z) {
                this.e0.remove(dk1Var.a);
                ee5Var.H(s0);
                ee5Var.writeByte(32);
                ee5Var.H(dk1Var.a);
                ee5Var.writeByte(10);
                ee5Var.flush();
                if (this.Z <= this.L || u()) {
                    this.n0.c(this.o0, 0L);
                }
                return;
            }
            dk1Var.e = true;
            ee5Var.H(q0);
            ee5Var.writeByte(32);
            ee5Var.H(dk1Var.a);
            for (long j3 : dk1Var.b) {
                ee5Var.writeByte(32);
                ee5Var.h0(j3);
            }
            ee5Var.writeByte(10);
            if (z) {
                long j4 = this.m0;
                this.m0 = 1 + j4;
                dk1Var.i = j4;
            }
            ee5Var.flush();
            if (this.Z <= this.L) {
            }
            this.n0.c(this.o0, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final synchronized bk1 k(long j, String str) {
        bk1 bk1Var;
        str.getClass();
        r();
        e();
        N(str);
        dk1 dk1Var = (dk1) this.e0.get(str);
        if (j != -1 && (dk1Var == null || dk1Var.i != j)) {
            return null;
        }
        if (dk1Var != null) {
            bk1Var = dk1Var.g;
        } else {
            bk1Var = null;
        }
        if (bk1Var != null) {
            return null;
        }
        if (dk1Var != null && dk1Var.h != 0) {
            return null;
        }
        if (!this.k0 && !this.l0) {
            ee5 ee5Var = this.d0;
            ee5Var.getClass();
            ee5Var.H(r0);
            ee5Var.writeByte(32);
            ee5Var.H(str);
            ee5Var.writeByte(10);
            ee5Var.flush();
            if (this.g0) {
                return null;
            }
            if (dk1Var == null) {
                dk1Var = new dk1(this, str);
                this.e0.put(str, dk1Var);
            }
            bk1 bk1Var2 = new bk1(this, dk1Var);
            dk1Var.g = bk1Var2;
            return bk1Var2;
        }
        this.n0.c(this.o0, 0L);
        return null;
    }

    public final synchronized fk1 n(String str) {
        str.getClass();
        r();
        e();
        N(str);
        dk1 dk1Var = (dk1) this.e0.get(str);
        if (dk1Var == null) {
            return null;
        }
        fk1 a = dk1Var.a();
        if (a == null) {
            return null;
        }
        this.f0++;
        ee5 ee5Var = this.d0;
        ee5Var.getClass();
        ee5Var.H(t0);
        ee5Var.writeByte(32);
        ee5Var.H(str);
        ee5Var.writeByte(10);
        if (u()) {
            this.n0.c(this.o0, 0L);
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:37:0x0066, B:53:0x00c2, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:57:0x0003, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:37:0x0066, B:53:0x00c2, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:57:0x0003, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void r() {
        boolean z;
        try {
            TimeZone timeZone = az7.a;
            if (this.i0) {
                return;
            }
            if (this.B.v(this.Y)) {
                boolean v = this.B.v(this.R);
                ik1 ik1Var = this.B;
                lt4 lt4Var = this.Y;
                if (v) {
                    ik1Var.u(lt4Var);
                } else {
                    ik1Var.h(lt4Var, this.R);
                }
            }
            ik1 ik1Var2 = this.B;
            lt4 lt4Var2 = this.Y;
            byte[] bArr = yy7.a;
            ik1Var2.getClass();
            lt4Var2.getClass();
            ui6 J = ik1Var2.J(lt4Var2);
            try {
                ik1Var2.B.r(lt4Var2);
                if (J != null) {
                    try {
                        J.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (J != null) {
                    try {
                        J.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th == null) {
                            ik1Var2.B.r(lt4Var2);
                            z = false;
                            this.h0 = z;
                            if (this.B.v(this.R)) {
                            }
                            D();
                            this.i0 = true;
                        }
                        throw th;
                    }
                }
                th = null;
                th = th;
                if (th == null) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (J != null) {
                    J.close();
                }
                if (th == null) {
                }
            }
            this.h0 = z;
            if (this.B.v(this.R)) {
                try {
                    x();
                    v();
                    this.i0 = true;
                    return;
                } catch (IOException e) {
                    kx4 kx4Var = kx4.a;
                    kx4.a.i("DiskLruCache " + this.A + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    close();
                    yy7.c(this.B, this.A);
                    this.j0 = false;
                }
            }
            D();
            this.i0 = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final boolean u() {
        int i = this.f0;
        if (i >= 2000 && i >= this.e0.size()) {
            return true;
        }
        return false;
    }

    public final void v() {
        lt4 lt4Var = this.X;
        ik1 ik1Var = this.B;
        yy7.d(ik1Var, lt4Var);
        Iterator it = this.e0.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            dk1 dk1Var = (dk1) next;
            int i = 0;
            if (dk1Var.g == null) {
                while (i < 2) {
                    this.Z += dk1Var.b[i];
                    i++;
                }
            } else {
                dk1Var.g = null;
                while (i < 2) {
                    yy7.d(ik1Var, (lt4) dk1Var.c.get(i));
                    yy7.d(ik1Var, (lt4) dk1Var.d.get(i));
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
    */
    public final void x() {
        ik1 ik1Var = this.B;
        lt4 lt4Var = this.R;
        fe5 u = hi2.u(ik1Var.N(lt4Var));
        try {
            String y = u.y(Long.MAX_VALUE);
            String y2 = u.y(Long.MAX_VALUE);
            String y3 = u.y(Long.MAX_VALUE);
            String y4 = u.y(Long.MAX_VALUE);
            String y5 = u.y(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(y) && "1".equals(y2) && nb3.k(String.valueOf(201105), y3) && nb3.k(String.valueOf(2), y4) && y5.length() <= 0) {
                int i = 0;
                while (true) {
                    try {
                        A(u.y(Long.MAX_VALUE));
                        i++;
                    } catch (EOFException unused) {
                        this.f0 = i - this.e0.size();
                        if (!u.e()) {
                            D();
                        } else {
                            ee5 ee5Var = this.d0;
                            if (ee5Var != null) {
                                yy7.b(ee5Var);
                            }
                            ik1Var.getClass();
                            lt4Var.getClass();
                            this.d0 = new ee5(new v92(ik1Var.e(lt4Var), (qn2) new k0(this, 19)));
                        }
                        try {
                            u.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (th != null) {
                            return;
                        }
                        throw th;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + y + ", " + y2 + ", " + y4 + ", " + y5 + ']');
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                u.close();
            } catch (Throwable th3) {
                mb3.q(th, th3);
            }
            if (th != null) {
            }
        }
    }
}
