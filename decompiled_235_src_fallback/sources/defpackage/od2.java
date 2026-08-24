package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od2  reason: default package */
/* loaded from: classes.dex */
public final class od2 implements defpackage.gi7 {
    public final defpackage.op6 a;
    public defpackage.li7 b;
    public volatile int c;
    public defpackage.tu0 d;

    public od2(defpackage.sg0 r1, defpackage.op6 r2, defpackage.kj7 r3, defpackage.r87 r4, defpackage.d90 r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r2
            r1 = 2
            r0.c = r1
            jg7 r0 = defpackage.jg7.a
            defpackage.u24.b(r0)
            return
    }

    public final java.lang.Object a(defpackage.s41 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.nd2
            if (r0 == 0) goto L13
            r0 = r6
            nd2 r0 = (defpackage.nd2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            nd2 r0 = new nd2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            java.lang.String r4 = "CXCP"
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            int r5 = r0.R
            defpackage.oi2.Y(r6)
            goto L59
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L32:
            defpackage.oi2.Y(r6)
            boolean r6 = defpackage.kj2.F(r4)
            if (r6 == 0) goto L40
            java.lang.String r6 = "FlashControl: Waiting for any ongoing update to be completed"
            android.util.Log.d(r4, r6)
        L40:
            int r6 = r5.c
            tu0 r5 = r5.d
            if (r5 == 0) goto L47
            goto L4d
        L47:
            jg7 r5 = defpackage.jg7.a
            tu0 r5 = defpackage.u24.b(r5)
        L4d:
            r0.R = r6
            r0.Z = r3
            java.lang.Object r5 = r5.c0(r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            r5 = r6
        L59:
            boolean r6 = defpackage.kj2.F(r4)
            if (r6 == 0) goto L70
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "awaitFlashModeUpdate: initialFlashMode = "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r4, r6)
        L70:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r2) {
            r1 = this;
            r1.b = r2
            int r2 = r1.c
            r0 = 0
            r1.c(r2, r0)
            return
    }

    public final defpackage.tu0 c(int r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "CXCP"
            boolean r0 = defpackage.kj2.F(r0)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "CXCP"
            java.lang.String r1 = "setFlashAsync: flashMode = "
            java.lang.String r2 = ", requestControl = "
            java.lang.StringBuilder r1 = defpackage.xg6.t(r1, r4, r2)
            li7 r2 = r3.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L1e:
            tu0 r0 = new tu0
            r0.<init>()
            li7 r1 = r3.b
            if (r1 == 0) goto L52
            r3.c = r4
            tu0 r1 = r3.d
            if (r5 == 0) goto L38
            if (r1 == 0) goto L34
            java.lang.String r5 = "There is a new flash mode being set or camera was closed"
            defpackage.i61.A(r5, r1)
        L34:
            r5 = 0
            r3.d = r5
            goto L3d
        L38:
            if (r1 == 0) goto L3d
            defpackage.nc1.a0(r0, r1)
        L3d:
            r3.d = r0
            op6 r3 = r3.a
            java.lang.Object r5 = r3.d
            monitor-enter(r5)
            r3.h = r4     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r5)
            tu0 r3 = r3.f()
            defpackage.nc1.a0(r3, r0)
            return r0
        L4f:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L52:
            java.lang.String r3 = "Camera is not active."
            defpackage.i61.A(r3, r0)
            return r0
    }

    @Override // defpackage.gi7
    public final void reset() {
            r3 = this;
            r0 = 2
            r3.c = r0
            tu0 r1 = r3.d
            if (r1 == 0) goto Lc
            java.lang.String r2 = "There is a new flash mode being set or camera was closed"
            defpackage.i61.A(r2, r1)
        Lc:
            r1 = 0
            r3.d = r1
            r1 = 1
            r3.c(r0, r1)
            return
    }
}
