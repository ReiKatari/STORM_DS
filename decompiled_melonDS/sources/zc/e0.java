package zc;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e0 extends gd.i {
    public int L;

    public e0(int i2) {
        super(0L, false);
        this.L = i2;
    }

    public abstract cc.c c();

    public Throwable d(Object obj) {
        o oVar;
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            return null;
        }
        return oVar.f15025a;
    }

    public final void j(Throwable th2) {
        x.q(c().g(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object k();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        r4 = (zc.y0) r5.t(zc.r.B);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            cc.c r0 = r11.c()     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            r0.getClass()     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            ed.f r0 = (ed.f) r0     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            ec.c r1 = r0.X     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            java.lang.Object r0 = r0.Z     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            cc.g r2 = r1.g()     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            java.lang.Object r0 = ed.b.n(r2, r0)     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            a0.c r3 = ed.b.f4448d     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            r4 = 0
            if (r0 == r3) goto L25
            zc.t1 r3 = zc.x.E(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            goto L26
        L1f:
            r0 = move-exception
            goto L8c
        L22:
            r0 = move-exception
            goto L90
        L25:
            r3 = r4
        L26:
            cc.g r5 = r1.g()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r6 = r11.k()     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r7 = r11.d(r6)     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L4b
            int r8 = r11.L     // Catch: java.lang.Throwable -> L49
            r9 = 1
            if (r8 == r9) goto L3e
            r10 = 2
            if (r8 != r10) goto L3d
            goto L3e
        L3d:
            r9 = 0
        L3e:
            if (r9 == 0) goto L4b
            zc.r r4 = zc.r.B     // Catch: java.lang.Throwable -> L49
            cc.e r4 = r5.t(r4)     // Catch: java.lang.Throwable -> L49
            zc.y0 r4 = (zc.y0) r4     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r1 = move-exception
            goto L80
        L4b:
            if (r4 == 0) goto L62
            boolean r5 = r4.d()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L62
            java.util.concurrent.CancellationException r4 = r4.B()     // Catch: java.lang.Throwable -> L49
            r11.a(r4)     // Catch: java.lang.Throwable -> L49
            yb.k r4 = p7.j.o(r4)     // Catch: java.lang.Throwable -> L49
            r1.h(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L62:
            if (r7 == 0) goto L6d
            yb.k r4 = new yb.k     // Catch: java.lang.Throwable -> L49
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r1.h(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L6d:
            java.lang.Object r4 = r11.i(r6)     // Catch: java.lang.Throwable -> L49
            r1.h(r4)     // Catch: java.lang.Throwable -> L49
        L74:
            if (r3 == 0) goto L7c
            boolean r1 = r3.l0()     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            if (r1 == 0) goto L9d
        L7c:
            ed.b.g(r2, r0)     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.l0()     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
            if (r3 == 0) goto L8b
        L88:
            ed.b.g(r2, r0)     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L1f zc.c0 -> L22
        L8c:
            r11.j(r0)
            goto L9d
        L90:
            cc.c r1 = r11.c()
            cc.g r1 = r1.g()
            java.lang.Throwable r0 = r0.A
            zc.x.q(r1, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.e0.run():void");
    }

    public void a(CancellationException cancellationException) {
    }

    public Object i(Object obj) {
        return obj;
    }
}
