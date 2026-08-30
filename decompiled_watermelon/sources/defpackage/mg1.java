package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mg1  reason: default package */
/* loaded from: classes.dex */
public abstract class mg1 extends cn6 {
    public int L;

    public mg1(int i) {
        super(0L, false);
        this.L = i;
    }

    public abstract j11 d();

    public Throwable e(Object obj) {
        ns0 ns0Var;
        if (obj instanceof ns0) {
            ns0Var = (ns0) obj;
        } else {
            ns0Var = null;
        }
        if (ns0Var == null) {
            return null;
        }
        return ns0Var.a;
    }

    public final void h(Throwable th) {
        w81.t(d().a(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        r4 = (defpackage.c63) r5.I(defpackage.k45.d0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            j11 r0 = r11.d()     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            r0.getClass()     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            jg1 r0 = (defpackage.jg1) r0     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            k11 r1 = r0.X     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            java.lang.Object r0 = r0.Z     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            e31 r2 = r1.a()     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            java.lang.Object r0 = defpackage.ts6.c(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            an1 r3 = defpackage.ts6.a     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            r4 = 0
            if (r0 == r3) goto L25
            j27 r3 = defpackage.pu.O(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
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
            e31 r5 = r1.a()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r6 = r11.i()     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r7 = r11.e(r6)     // Catch: java.lang.Throwable -> L49
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
            k45 r4 = defpackage.k45.d0     // Catch: java.lang.Throwable -> L49
            c31 r4 = r5.I(r4)     // Catch: java.lang.Throwable -> L49
            c63 r4 = (defpackage.c63) r4     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r1 = move-exception
            goto L80
        L4b:
            if (r4 == 0) goto L62
            boolean r5 = r4.d()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L62
            java.util.concurrent.CancellationException r4 = r4.K()     // Catch: java.lang.Throwable -> L49
            r11.c(r4)     // Catch: java.lang.Throwable -> L49
            kc5 r4 = defpackage.me2.o(r4)     // Catch: java.lang.Throwable -> L49
            r1.k(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L62:
            if (r7 == 0) goto L6d
            kc5 r4 = new kc5     // Catch: java.lang.Throwable -> L49
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r1.k(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L6d:
            java.lang.Object r4 = r11.f(r6)     // Catch: java.lang.Throwable -> L49
            r1.k(r4)     // Catch: java.lang.Throwable -> L49
        L74:
            if (r3 == 0) goto L7c
            boolean r1 = r3.x0()     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            if (r1 == 0) goto L9d
        L7c:
            defpackage.ts6.a(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.x0()     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
            if (r3 == 0) goto L8b
        L88:
            defpackage.ts6.a(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L1f defpackage.ig1 -> L22
        L8c:
            r11.h(r0)
            goto L9d
        L90:
            j11 r11 = r11.d()
            e31 r11 = r11.a()
            java.lang.Throwable r0 = r0.A
            defpackage.w81.t(r11, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg1.run():void");
    }

    public void c(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
