package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: si7  reason: default package */
/* loaded from: classes.dex */
public final class si7 implements defpackage.jk5 {
    public final /* synthetic */ defpackage.wi7 A;

    public si7(defpackage.wi7 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.jk5
    public final void F(defpackage.yk5 r4, long r5, defpackage.wk5 r7) {
            r3 = this;
            java.lang.String r5 = "Failed in framework level"
            wi7 r6 = r3.A
            uw r6 = r6.q
            int r6 = r6.a
            if (r6 != 0) goto Lb
            goto L66
        Lb:
            java.lang.String r6 = " with CaptureFailure.reason = "
            k54 r0 = defpackage.uy6.b
            java.lang.Object r4 = r4.b(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L66
            wi7 r0 = r3.A
            int r4 = r4.intValue()
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            pu r0 = r0.f     // Catch: java.lang.Throwable -> L63
            int r7 = r7.v()     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L63
            r2.append(r7)     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.Throwable r6 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L63
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L63
        L3b:
            boolean r5 = r0.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L61
            java.lang.Object r5 = r0.first()     // Catch: java.lang.Throwable -> L63
            ti7 r5 = (defpackage.ti7) r5     // Catch: java.lang.Throwable -> L63
            int r5 = r5.a     // Catch: java.lang.Throwable -> L63
            if (r5 > r4) goto L61
            java.lang.Object r5 = r0.first()     // Catch: java.lang.Throwable -> L63
            ti7 r5 = (defpackage.ti7) r5     // Catch: java.lang.Throwable -> L63
            tu0 r5 = r5.b     // Catch: java.lang.Throwable -> L63
            r5.v0(r6)     // Catch: java.lang.Throwable -> L63
            defpackage.gt0.X0(r0)     // Catch: java.lang.Throwable -> L63
            wi7 r5 = r3.A     // Catch: java.lang.Throwable -> L63
            uw r5 = r5.q     // Catch: java.lang.Throwable -> L63
            r5.a()     // Catch: java.lang.Throwable -> L63
            goto L3b
        L61:
            monitor-exit(r1)
            return
        L63:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L66:
            return
    }

    @Override // defpackage.jk5
    public final void x(defpackage.yk5 r2, long r3, defpackage.th r5) {
            r1 = this;
            wi7 r3 = r1.A
            uw r3 = r3.q
            int r3 = r3.a
            if (r3 != 0) goto L9
            goto L4b
        L9:
            k54 r3 = defpackage.uy6.b
            java.lang.Object r2 = r2.b(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L4b
            wi7 r3 = r1.A
            int r2 = r2.intValue()
            java.lang.Object r4 = r3.c
            monitor-enter(r4)
            pu r3 = r3.f     // Catch: java.lang.Throwable -> L48
        L1e:
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L46
            java.lang.Object r5 = r3.first()     // Catch: java.lang.Throwable -> L48
            ti7 r5 = (defpackage.ti7) r5     // Catch: java.lang.Throwable -> L48
            int r5 = r5.a     // Catch: java.lang.Throwable -> L48
            if (r5 > r2) goto L46
            java.lang.Object r5 = r3.first()     // Catch: java.lang.Throwable -> L48
            ti7 r5 = (defpackage.ti7) r5     // Catch: java.lang.Throwable -> L48
            tu0 r5 = r5.b     // Catch: java.lang.Throwable -> L48
            jg7 r0 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L48
            r5.b0(r0)     // Catch: java.lang.Throwable -> L48
            defpackage.gt0.X0(r3)     // Catch: java.lang.Throwable -> L48
            wi7 r5 = r1.A     // Catch: java.lang.Throwable -> L48
            uw r5 = r5.q     // Catch: java.lang.Throwable -> L48
            r5.a()     // Catch: java.lang.Throwable -> L48
            goto L1e
        L46:
            monitor-exit(r4)
            return
        L48:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L4b:
            return
    }
}
