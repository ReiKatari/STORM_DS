package e9;

import a0.j;
import ah.h0;
import fj.a0;
import fj.k;
import fj.l;
import fj.x;
import fj.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p7.t;
import vc.o;
import zc.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements Closeable, Flushable {

    /* renamed from: k0  reason: collision with root package name */
    public static final vc.f f4427k0 = new vc.f("[a-z0-9_-]{1,120}");
    public final x A;
    public final long B;
    public final x L;
    public final x R;
    public final x X;
    public final LinkedHashMap Y;
    public final h0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public long f4428b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4429c0;

    /* renamed from: d0  reason: collision with root package name */
    public z f4430d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f4431e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4432f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4433g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4434h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4435i0;

    /* renamed from: j0  reason: collision with root package name */
    public final d f4436j0;

    /* JADX WARN: Type inference failed for: r3v14, types: [e9.d, fj.l] */
    public e(long j2, k kVar, x xVar, q qVar) {
        this.A = xVar;
        this.B = j2;
        if (j2 > 0) {
            this.L = xVar.d("journal");
            this.R = xVar.d("journal.tmp");
            this.X = xVar.d("journal.bkp");
            this.Y = new LinkedHashMap(0, 0.75f, true);
            this.Z = zc.x.a(pc.a.G(zc.x.c(), qVar.a0(1)));
            this.f4436j0 = new l(kVar);
            return;
        }
        j.h("maxSize <= 0");
        throw null;
    }

    public static void H(String str) {
        if (f4427k0.c(str)) {
            return;
        }
        j.e(kc.a.c('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        if (r2 != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x0081, B:34:0x0088, B:27:0x005c, B:29:0x006a, B:38:0x00a8, B:40:0x00af, B:43:0x00b4, B:45:0x00c5, B:48:0x00ca, B:53:0x0105, B:55:0x0110, B:59:0x0119, B:49:0x00e2, B:51:0x00f7, B:52:0x0102, B:37:0x0098, B:62:0x011e, B:63:0x0125), top: B:66:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(e9.e r9, e9.a r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.e.d(e9.e, e9.a, boolean):void");
    }

    public final void B(String str) {
        String substring;
        int g02 = vc.h.g0(' ', 0, 6, str);
        if (g02 != -1) {
            int i2 = g02 + 1;
            int g03 = vc.h.g0(' ', i2, 4, str);
            LinkedHashMap linkedHashMap = this.Y;
            if (g03 == -1) {
                substring = str.substring(i2);
                if (g02 == 6 && o.V(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i2, g03);
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new b(this, substring);
                linkedHashMap.put(substring, obj);
            }
            b bVar = (b) obj;
            if (g03 != -1 && g02 == 5 && o.V(str, "CLEAN", false)) {
                List u02 = vc.h.u0(str.substring(g03 + 1), new char[]{' '});
                bVar.f4422e = true;
                bVar.f4424g = null;
                if (u02.size() == 2) {
                    try {
                        int size = u02.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            bVar.f4419b[i10] = Long.parseLong((String) u02.get(i10));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        fj.j.n(u02, "unexpected journal line: ");
                        return;
                    }
                }
                fj.j.n(u02, "unexpected journal line: ");
                return;
            } else if (g03 == -1 && g02 == 5 && o.V(str, "DIRTY", false)) {
                bVar.f4424g = new a(this, bVar);
                return;
            } else if (g03 == -1 && g02 == 4 && o.V(str, "READ", false)) {
                return;
            } else {
                fj.j.h("unexpected journal line: ".concat(str));
                return;
            }
        }
        fj.j.h("unexpected journal line: ".concat(str));
    }

    public final void F(b bVar) {
        z zVar;
        int i2 = bVar.f4425h;
        String str = bVar.f4418a;
        if (i2 > 0 && (zVar = this.f4430d0) != null) {
            zVar.P("DIRTY");
            zVar.writeByte(32);
            zVar.P(str);
            zVar.writeByte(10);
            zVar.flush();
        }
        if (bVar.f4425h <= 0 && bVar.f4424g == null) {
            for (int i10 = 0; i10 < 2; i10++) {
                this.f4436j0.w((x) bVar.f4420c.get(i10));
                long j2 = this.f4428b0;
                long[] jArr = bVar.f4419b;
                this.f4428b0 = j2 - jArr[i10];
                jArr[i10] = 0;
            }
            this.f4429c0++;
            z zVar2 = this.f4430d0;
            if (zVar2 != null) {
                zVar2.P("REMOVE");
                zVar2.writeByte(32);
                zVar2.P(str);
                zVar2.writeByte(10);
            }
            this.Y.remove(str);
            if (this.f4429c0 >= 2000) {
                v();
                return;
            }
            return;
        }
        bVar.f4423f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        F(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f4428b0
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
            e9.b r1 = (e9.b) r1
            boolean r2 = r1.f4423f
            if (r2 != 0) goto L12
            r4.F(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f4434h0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.e.G():void");
    }

    public final synchronized void I() {
        long[] jArr;
        try {
            z zVar = this.f4430d0;
            if (zVar != null) {
                zVar.close();
            }
            z w10 = ij.a.w(this.f4436j0.I(this.R));
            w10.P("libcore.io.DiskLruCache");
            w10.writeByte(10);
            w10.P("1");
            w10.writeByte(10);
            w10.Q(1);
            w10.writeByte(10);
            w10.Q(2);
            w10.writeByte(10);
            w10.writeByte(10);
            for (b bVar : this.Y.values()) {
                if (bVar.f4424g != null) {
                    w10.P("DIRTY");
                    w10.writeByte(32);
                    w10.P(bVar.f4418a);
                    w10.writeByte(10);
                } else {
                    w10.P("CLEAN");
                    w10.writeByte(32);
                    w10.P(bVar.f4418a);
                    for (long j2 : bVar.f4419b) {
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
                boolean z10 = this.f4436j0.z(this.L);
                d dVar = this.f4436j0;
                if (z10) {
                    dVar.i(this.L, this.X);
                    this.f4436j0.i(this.R, this.L);
                    this.f4436j0.w(this.X);
                } else {
                    dVar.i(this.R, this.L);
                }
                d dVar2 = this.f4436j0;
                x xVar = this.L;
                dVar2.getClass();
                xVar.getClass();
                this.f4430d0 = new z(new f(dVar2.d(xVar), new a2.c(10, this)));
                this.f4429c0 = 0;
                this.f4431e0 = false;
                this.f4435i0 = false;
            } else {
                throw th;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f4432f0 && !this.f4433g0) {
                for (b bVar : (b[]) this.Y.values().toArray(new b[0])) {
                    a aVar = bVar.f4424g;
                    if (aVar != null) {
                        b bVar2 = (b) aVar.f4415b;
                        if (nc.k.a(bVar2.f4424g, aVar)) {
                            bVar2.f4423f = true;
                        }
                    }
                }
                G();
                zc.x.f(this.Z, null);
                z zVar = this.f4430d0;
                zVar.getClass();
                zVar.close();
                this.f4430d0 = null;
                this.f4433g0 = true;
                return;
            }
            this.f4433g0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f4432f0) {
            return;
        }
        if (!this.f4433g0) {
            G();
            z zVar = this.f4430d0;
            zVar.getClass();
            zVar.flush();
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized a i(String str) {
        a aVar;
        if (!this.f4433g0) {
            H(str);
            t();
            b bVar = (b) this.Y.get(str);
            if (bVar != null) {
                aVar = bVar.f4424g;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                return null;
            }
            if (bVar != null && bVar.f4425h != 0) {
                return null;
            }
            if (!this.f4434h0 && !this.f4435i0) {
                z zVar = this.f4430d0;
                zVar.getClass();
                zVar.P("DIRTY");
                zVar.writeByte(32);
                zVar.P(str);
                zVar.writeByte(10);
                zVar.flush();
                if (this.f4431e0) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.Y.put(str, bVar);
                }
                a aVar2 = new a(this, bVar);
                bVar.f4424g = aVar2;
                return aVar2;
            }
            v();
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized c m(String str) {
        c a10;
        if (!this.f4433g0) {
            H(str);
            t();
            b bVar = (b) this.Y.get(str);
            if (bVar != null && (a10 = bVar.a()) != null) {
                boolean z10 = true;
                this.f4429c0++;
                z zVar = this.f4430d0;
                zVar.getClass();
                zVar.P("READ");
                zVar.writeByte(32);
                zVar.P(str);
                zVar.writeByte(10);
                if (this.f4429c0 < 2000) {
                    z10 = false;
                }
                if (z10) {
                    v();
                }
                return a10;
            }
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void t() {
        try {
            if (this.f4432f0) {
                return;
            }
            this.f4436j0.w(this.R);
            if (this.f4436j0.z(this.X)) {
                boolean z10 = this.f4436j0.z(this.L);
                d dVar = this.f4436j0;
                x xVar = this.X;
                if (z10) {
                    dVar.w(xVar);
                } else {
                    dVar.i(xVar, this.L);
                }
            }
            if (this.f4436j0.z(this.L)) {
                try {
                    z();
                    w();
                    this.f4432f0 = true;
                    return;
                } catch (IOException unused) {
                    close();
                    p7.j.t(this.f4436j0, this.A);
                    this.f4433g0 = false;
                }
            }
            I();
            this.f4432f0 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void v() {
        zc.x.v(this.Z, null, null, new a9.k(3, null, this), 3);
    }

    public final void w() {
        Iterator it = this.Y.values().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i2 = 0;
            if (bVar.f4424g == null) {
                while (i2 < 2) {
                    j2 += bVar.f4419b[i2];
                    i2++;
                }
            } else {
                bVar.f4424g = null;
                while (i2 < 2) {
                    d dVar = this.f4436j0;
                    dVar.w((x) bVar.f4420c.get(i2));
                    dVar.w((x) bVar.f4421d.get(i2));
                    i2++;
                }
                it.remove();
            }
        }
        this.f4428b0 = j2;
    }

    public final void z() {
        d dVar = this.f4436j0;
        x xVar = this.L;
        a0 x9 = ij.a.x(dVar.J(xVar));
        try {
            String D = x9.D(Long.MAX_VALUE);
            String D2 = x9.D(Long.MAX_VALUE);
            String D3 = x9.D(Long.MAX_VALUE);
            String D4 = x9.D(Long.MAX_VALUE);
            String D5 = x9.D(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(D) && "1".equals(D2) && nc.k.a(String.valueOf(1), D3) && nc.k.a(String.valueOf(2), D4) && D5.length() <= 0) {
                int i2 = 0;
                while (true) {
                    try {
                        B(x9.D(Long.MAX_VALUE));
                        i2++;
                    } catch (EOFException unused) {
                        this.f4429c0 = i2 - this.Y.size();
                        if (!x9.d()) {
                            I();
                        } else {
                            dVar.getClass();
                            xVar.getClass();
                            this.f4430d0 = new z(new f(dVar.d(xVar), new a2.c(10, this)));
                        }
                        try {
                            x9.close();
                            th = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (th == null) {
                            return;
                        }
                        throw th;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + D + ", " + D2 + ", " + D3 + ", " + D4 + ", " + D5 + ']');
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                x9.close();
            } catch (Throwable th4) {
                t.a(th, th4);
            }
        }
    }
}
