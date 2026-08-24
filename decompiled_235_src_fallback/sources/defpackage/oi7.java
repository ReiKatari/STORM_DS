package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi7  reason: default package */
/* loaded from: classes.dex */
public final class oi7 extends defpackage.hw6 implements defpackage.qn2 {
    public int X;
    public int Y;
    public final /* synthetic */ defpackage.ri7 Z;
    public final /* synthetic */ int d0;

    public oi7(defpackage.ri7 r1, int r2, defpackage.r41 r3) {
            r0 = this;
            r0.Z = r1
            r0.d0 = r2
            r1 = 1
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r3) {
            r2 = this;
            r41 r3 = (defpackage.r41) r3
            oi7 r0 = new oi7
            ri7 r1 = r2.Z
            int r2 = r2.d0
            r0.<init>(r1, r2, r3)
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r2 = r0.s(r2)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            r2 = 0
            r3 = 1
            java.lang.String r4 = "CXCP"
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L15
            int r14 = r14.X
            defpackage.oi2.Y(r15)     // Catch: java.util.concurrent.CancellationException -> L12
            goto L3f
        L12:
            r0 = move-exception
            r14 = r0
            goto L7c
        L15:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            return r2
        L1b:
            defpackage.oi2.Y(r15)
            boolean r15 = defpackage.kj2.F(r4)
            if (r15 == 0) goto L29
            java.lang.String r15 = "UseCaseCameraRequestControlImpl#setTorchOffAsync"
            android.util.Log.d(r4, r15)
        L29:
            ri7 r15 = r14.Z
            int r1 = r14.d0
            ej7 r15 = r15.c     // Catch: java.util.concurrent.CancellationException -> L12
            sf0 r15 = r15.a()     // Catch: java.util.concurrent.CancellationException -> L12
            r14.X = r1     // Catch: java.util.concurrent.CancellationException -> L12
            r14.Y = r3     // Catch: java.util.concurrent.CancellationException -> L12
            java.lang.Object r15 = r15.h(r14)     // Catch: java.util.concurrent.CancellationException -> L12
            if (r15 != r0) goto L3e
            return r0
        L3e:
            r14 = r1
        L3f:
            java.lang.AutoCloseable r15 = (java.lang.AutoCloseable) r15     // Catch: java.util.concurrent.CancellationException -> L12
            r0 = r15
            vf0 r0 = (defpackage.vf0) r0     // Catch: java.lang.Throwable -> L74
            oa r6 = new oa     // Catch: java.lang.Throwable -> L74
            r6.<init>(r14)     // Catch: java.lang.Throwable -> L74
            jb4 r14 = r0.A     // Catch: java.lang.Throwable -> L74
            boolean r14 = r14.a()     // Catch: java.lang.Throwable -> L74
            if (r14 != 0) goto L68
            t41 r5 = r0.L     // Catch: java.lang.Throwable -> L74
            r5.getClass()     // Catch: java.lang.Throwable -> L74
            pd2 r9 = new pd2     // Catch: java.lang.Throwable -> L74
            r14 = 0
            r9.<init>(r14)     // Catch: java.lang.Throwable -> L74
            r12 = 0
            r13 = 118(0x76, float:1.65E-43)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            tu0 r14 = defpackage.t41.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L74
            goto L70
        L68:
            java.lang.String r14 = "Cannot call setTorchOff on "
            java.lang.String r1 = " after close."
            defpackage.e41.g(r0, r1, r14)     // Catch: java.lang.Throwable -> L74
            r14 = r2
        L70:
            defpackage.lb4.p(r15, r2)     // Catch: java.util.concurrent.CancellationException -> L12
            return r14
        L74:
            r0 = move-exception
            r14 = r0
            throw r14     // Catch: java.lang.Throwable -> L77
        L77:
            r0 = move-exception
            defpackage.lb4.p(r15, r14)     // Catch: java.util.concurrent.CancellationException -> L12
            throw r0     // Catch: java.util.concurrent.CancellationException -> L12
        L7c:
            boolean r15 = defpackage.kj2.F(r4)
            if (r15 == 0) goto L87
            java.lang.String r15 = "Cannot acquire the CameraGraph.Session"
            android.util.Log.d(r4, r15, r14)
        L87:
            tu0 r14 = defpackage.ri7.l
            return r14
    }
}
