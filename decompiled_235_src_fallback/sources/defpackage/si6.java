package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: si6  reason: default package */
/* loaded from: classes.dex */
public final class si6 extends defpackage.gx0 {
    public java.lang.Object b;
    public java.lang.Object c;
    public defpackage.ka4 d;
    public defpackage.ka4 e;
    public defpackage.ob6 f;
    public final defpackage.ro5 g;
    public final defpackage.h61 h;

    public si6() {
            r3 = this;
            r0 = 2
            r3.<init>(r0)
            ro5 r0 = new ro5
            r1 = 12
            r0.<init>(r3, r1)
            r3.g = r0
            y36 r0 = new y36
            r1 = 5
            r0.<init>(r3, r1)
            r76 r1 = defpackage.bm6.a
            defpackage.bm6.e(r1)
            java.lang.Object r1 = defpackage.bm6.c
            monitor-enter(r1)
            java.util.List r2 = defpackage.bm6.h     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r2 = defpackage.gt0.U0(r0, r2)     // Catch: java.lang.Throwable -> L2e
            defpackage.bm6.h = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r1)
            h61 r1 = new h61
            r2 = 20
            r1.<init>(r0, r2)
            r3.h = r1
            return
        L2e:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }

    @Override // defpackage.gx0
    public final void c(defpackage.ob6 r1) {
            r0 = this;
            r1 = 0
            r0.c = r1
            r0.e = r1
            return
    }

    @Override // defpackage.gx0
    public final void d() {
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            java.lang.Object r1 = r3.c     // Catch: java.lang.Throwable -> Lf
            r3.b = r1     // Catch: java.lang.Throwable -> Lf
            ka4 r1 = r3.e     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            r1 = 0
            r3.d = r1     // Catch: java.lang.Throwable -> Lf
            goto L26
        Lf:
            r3 = move-exception
            goto L28
        L11:
            ka4 r1 = r3.d     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L1e
            ka4 r1 = defpackage.c66.a     // Catch: java.lang.Throwable -> Lf
            ka4 r1 = new ka4     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            r3.d = r1     // Catch: java.lang.Throwable -> Lf
        L1e:
            ka4 r1 = r3.d     // Catch: java.lang.Throwable -> Lf
            ka4 r2 = r3.e     // Catch: java.lang.Throwable -> Lf
            r3.d = r2     // Catch: java.lang.Throwable -> Lf
            r3.e = r1     // Catch: java.lang.Throwable -> Lf
        L26:
            monitor-exit(r0)
            return
        L28:
            monitor-exit(r0)
            throw r3
    }

    @Override // defpackage.gx0
    public final void e() {
            r2 = this;
            h61 r0 = r2.h
            r0.d()
            r0 = 0
            r2.c = r0
            r2.e = r0
            java.lang.Object r1 = r2.a
            monitor-enter(r1)
            r2.f = r0     // Catch: java.lang.Throwable -> L15
            r2.b = r0     // Catch: java.lang.Throwable -> L15
            r2.d = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            return
        L15:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // defpackage.gx0
    public final defpackage.qn2 j(defpackage.ob6 r2) {
            r1 = this;
            ob6 r0 = r1.f
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            goto L10
        Lb:
            java.lang.String r0 = "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"
            defpackage.r05.b(r0)
        L10:
            r1.f = r2
            ro5 r1 = r1.g
            return r1
    }

    @Override // defpackage.gx0
    public final void k(defpackage.ul0 r1) {
            r0 = this;
            r1 = 0
            r0.f = r1
            r0.c = r1
            r0.e = r1
            r0.d()
            return
    }
}
