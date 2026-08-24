package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg0  reason: default package */
/* loaded from: classes.dex */
public final class fg0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.gg0 Z;

    public /* synthetic */ fg0(defpackage.gg0 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            fg0 r2 = (defpackage.fg0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            fg0 r2 = (defpackage.fg0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            gg0 r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            fg0 r3 = new fg0
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            fg0 r3 = new fg0
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L34;
                default: goto L7;
            }
        L7:
            gg0 r0 = r7.Z
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r7.Y
            if (r4 == 0) goto L1b
            if (r4 != r1) goto L15
            defpackage.oi2.Y(r8)
            goto L2a
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            goto L33
        L1b:
            defpackage.oi2.Y(r8)
            gj7 r8 = r0.A
            r7.Y = r1
            java.lang.Object r7 = r8.e(r7)
            if (r7 != r3) goto L2a
            r2 = r3
            goto L33
        L2a:
            kj7 r7 = r0.R
            o41 r7 = r7.a
            defpackage.g04.x(r7, r2)
            jg7 r2 = defpackage.jg7.a
        L33:
            return r2
        L34:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r7.Y
            if (r3 == 0) goto L46
            if (r3 != r1) goto L40
            defpackage.oi2.Y(r8)
            goto L8b
        L40:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            goto L8d
        L46:
            defpackage.oi2.Y(r8)
            gg0 r8 = r7.Z
            sh0 r8 = r8.X
            tx r3 = new tx
            r4 = 8
            r3.<init>(r4)
            java.lang.Object r4 = r8.a
            monitor-enter(r4)
            boolean r5 = r8.g     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L5d
        L5b:
            monitor-exit(r4)
            goto L7d
        L5d:
            java.lang.String r5 = "CXCP"
            boolean r5 = defpackage.kj2.F(r5)     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L6f
            java.lang.String r5 = "CXCP"
            java.lang.String r6 = "Camera is removed, forcing state to CLOSED."
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r7 = move-exception
            goto L8e
        L6f:
            r8.g = r1     // Catch: java.lang.Throwable -> L6d
            dg0 r5 = defpackage.dg0.CLOSED     // Catch: java.lang.Throwable -> L6d
            r8.e = r5     // Catch: java.lang.Throwable -> L6d
            r8.f = r3     // Catch: java.lang.Throwable -> L6d
            r8.c(r5, r3)     // Catch: java.lang.Throwable -> L6d
            r8.d = r2     // Catch: java.lang.Throwable -> L6d
            goto L5b
        L7d:
            gg0 r8 = r7.Z
            gj7 r8 = r8.A
            r7.Y = r1
            java.lang.Object r7 = r8.e(r7)
            if (r7 != r0) goto L8b
            r2 = r0
            goto L8d
        L8b:
            jg7 r2 = defpackage.jg7.a
        L8d:
            return r2
        L8e:
            monitor-exit(r4)
            throw r7
    }
}
