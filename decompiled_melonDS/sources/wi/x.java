package wi;

import fj.e0;
import fj.f0;
import fj.g0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements f0 {
    public final int A;
    public final p B;
    public final l.f0 L;
    public long R;
    public long X;
    public final ArrayDeque Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public final v f14285b0;

    /* renamed from: c0  reason: collision with root package name */
    public final u f14286c0;

    /* renamed from: d0  reason: collision with root package name */
    public final w f14287d0;

    /* renamed from: e0  reason: collision with root package name */
    public final w f14288e0;

    /* renamed from: f0  reason: collision with root package name */
    public c f14289f0;

    /* renamed from: g0  reason: collision with root package name */
    public IOException f14290g0;

    public x(int i2, p pVar, boolean z10, boolean z11, pi.q qVar) {
        pVar.getClass();
        this.A = i2;
        this.B = pVar;
        this.L = new l.f0(i2);
        this.X = pVar.f14269l0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.Y = arrayDeque;
        this.f14285b0 = new v(this, pVar.f14268k0.a(), z11);
        this.f14286c0 = new u(this, z10);
        this.f14287d0 = new w(this);
        this.f14288e0 = new w(this);
        if (qVar != null) {
            if (!g()) {
                arrayDeque.add(qVar);
            } else {
                a0.j.p("locally-initiated streams shouldn't have headers yet");
                throw null;
            }
        } else if (g()) {
        } else {
            a0.j.p("remotely-initiated streams should have headers");
            throw null;
        }
    }

    public final void a() {
        boolean z10;
        boolean h2;
        TimeZone timeZone = qi.g.f12552a;
        synchronized (this) {
            try {
                v vVar = this.f14285b0;
                if (!vVar.B && vVar.X) {
                    u uVar = this.f14286c0;
                    if (!uVar.A) {
                        if (uVar.L) {
                        }
                    }
                    z10 = true;
                    h2 = h();
                }
                z10 = false;
                h2 = h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            c(c.CANCEL, null);
        } else if (!h2) {
            this.B.m(this.A);
        }
    }

    public final void b() {
        u uVar = this.f14286c0;
        if (!uVar.L) {
            if (!uVar.A) {
                if (f() != null) {
                    IOException iOException = this.f14290g0;
                    if (iOException == null) {
                        c f8 = f();
                        f8.getClass();
                        throw new c0(f8);
                    }
                    throw iOException;
                }
                return;
            }
            fj.j.h("stream finished");
            return;
        }
        fj.j.h("stream closed");
    }

    public final void c(c cVar, IOException iOException) {
        cVar.getClass();
        if (!d(cVar, iOException)) {
            return;
        }
        p pVar = this.B;
        pVar.getClass();
        pVar.f14273q0.z(this.A, cVar);
    }

    public final boolean d(c cVar, IOException iOException) {
        TimeZone timeZone = qi.g.f12552a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.f14289f0 = cVar;
            this.f14290g0 = iOException;
            notifyAll();
            if (this.f14285b0.B) {
                if (this.f14286c0.A) {
                    return false;
                }
            }
            this.B.m(this.A);
            return true;
        }
    }

    public final void e(c cVar) {
        cVar.getClass();
        if (!d(cVar, null)) {
            return;
        }
        this.B.z(this.A, cVar);
    }

    public final c f() {
        c cVar;
        synchronized (this) {
            cVar = this.f14289f0;
        }
        return cVar;
    }

    public final boolean g() {
        boolean z10;
        if ((this.A & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.B.getClass();
        if (true == z10) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                v vVar = this.f14285b0;
                if (!vVar.B) {
                    if (vVar.X) {
                    }
                    return true;
                }
                u uVar = this.f14286c0;
                if (uVar.A || uVar.L) {
                    if (this.Z) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0006, B:6:0x000b, B:8:0x0013, B:11:0x001c, B:16:0x002d, B:17:0x0031, B:14:0x0024), top: B:24:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(pi.q r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = qi.g.f12552a
            monitor-enter(r2)
            boolean r0 = r2.Z     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 == 0) goto L24
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            wi.v r3 = r2.f14285b0     // Catch: java.lang.Throwable -> L22
            r3.getClass()     // Catch: java.lang.Throwable -> L22
            goto L2b
        L22:
            r3 = move-exception
            goto L43
        L24:
            r2.Z = r1     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r0 = r2.Y     // Catch: java.lang.Throwable -> L22
            r0.add(r3)     // Catch: java.lang.Throwable -> L22
        L2b:
            if (r4 == 0) goto L31
            wi.v r3 = r2.f14285b0     // Catch: java.lang.Throwable -> L22
            r3.B = r1     // Catch: java.lang.Throwable -> L22
        L31:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L22
            r2.notifyAll()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            if (r3 != 0) goto L42
            wi.p r3 = r2.B
            int r4 = r2.A
            r3.m(r4)
        L42:
            return
        L43:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.x.i(pi.q, boolean):void");
    }

    @Override // fj.f0
    public final g0 j() {
        return this.f14285b0;
    }

    @Override // fj.f0
    public final e0 m() {
        return this.f14286c0;
    }
}
