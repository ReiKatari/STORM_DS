package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc0  reason: default package */
/* loaded from: classes.dex */
public final class jc0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ jc0(long r1, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Z = r1
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public jc0(defpackage.gn r2, long r3, defpackage.r41 r5) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r2 = 2
            r1.<init>(r2, r5)
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
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            jc0 r2 = (defpackage.jc0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            jc0 r2 = (defpackage.jc0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            jc0 r2 = (defpackage.jc0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            int r10 = r8.X
            java.lang.Object r0 = r8.d0
            switch(r10) {
                case 0: goto L1f;
                case 1: goto L14;
                default: goto L7;
            }
        L7:
            jc0 r1 = new jc0
            r4 = r0
            mw6 r4 = (defpackage.mw6) r4
            r6 = 2
            long r2 = r8.Z
            r5 = r9
            r1.<init>(r2, r4, r5, r6)
            return r1
        L14:
            r5 = r9
            jc0 r9 = new jc0
            gn r0 = (defpackage.gn) r0
            long r1 = r8.Z
            r9.<init>(r0, r1, r5)
            return r9
        L1f:
            r5 = r9
            jc0 r2 = new jc0
            kc0 r0 = (defpackage.kc0) r0
            r7 = 0
            long r3 = r8.Z
            r6 = r5
            r5 = r0
            r2.<init>(r3, r5, r6, r7)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L89;
                case 1: goto L54;
                default: goto L7;
            }
        L7:
            long r3 = r11.Z
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r11.Y
            r6 = 8
            r8 = 2
            if (r5 == 0) goto L24
            if (r5 == r2) goto L20
            if (r5 != r8) goto L1a
            defpackage.oi2.Y(r12)
            goto L3c
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            goto L53
        L20:
            defpackage.oi2.Y(r12)
            goto L32
        L24:
            defpackage.oi2.Y(r12)
            long r9 = r3 - r6
            r11.Y = r2
            java.lang.Object r12 = defpackage.q60.t(r9, r11)
            if (r12 != r0) goto L32
            goto L3a
        L32:
            r11.Y = r8
            java.lang.Object r12 = defpackage.q60.t(r6, r11)
            if (r12 != r0) goto L3c
        L3a:
            r1 = r0
            goto L53
        L3c:
            java.lang.Object r11 = r11.d0
            mw6 r11 = (defpackage.mw6) r11
            rj0 r11 = r11.L
            if (r11 == 0) goto L51
            qy4 r12 = new qy4
            r12.<init>(r3)
            em5 r0 = new em5
            r0.<init>(r12)
            r11.i(r0)
        L51:
            jg7 r1 = defpackage.jg7.a
        L53:
            return r1
        L54:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r11.Y
            if (r3 == 0) goto L66
            if (r3 != r2) goto L60
            defpackage.oi2.Y(r12)
            goto L86
        L60:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            goto L88
        L66:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.d0
            r3 = r12
            gn r3 = (defpackage.gn) r3
            long r4 = r11.Z
            r5 = r4
            jk4 r4 = new jk4
            r4.<init>(r5)
            io6 r5 = defpackage.qa6.d
            r11.Y = r2
            r6 = 0
            r8 = 12
            r7 = r11
            java.lang.Object r11 = defpackage.gn.c(r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L86
            r1 = r0
            goto L88
        L86:
            jg7 r1 = defpackage.jg7.a
        L88:
            return r1
        L89:
            r7 = r11
            java.lang.String r11 = "Restarting "
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r7.Y
            if (r3 == 0) goto L9e
            if (r3 != r2) goto L98
            defpackage.oi2.Y(r12)
            goto Lad
        L98:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            goto Lf6
        L9e:
            defpackage.oi2.Y(r12)
            long r3 = r7.Z
            r7.Y = r2
            java.lang.Object r12 = defpackage.q60.t(r3, r7)
            if (r12 != r0) goto Lad
            r1 = r0
            goto Lf6
        Lad:
            java.lang.Object r12 = r7.d0
            kc0 r12 = (defpackage.kc0) r12
            java.lang.Object r1 = r12.q
            monitor-enter(r1)
            boolean r0 = r12.e()     // Catch: java.lang.Throwable -> Lf0
            if (r0 != 0) goto Lf3
            hf r0 = r12.s     // Catch: java.lang.Throwable -> Lf0
            xe0 r2 = defpackage.xe0.A     // Catch: java.lang.Throwable -> Lf0
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> Lf0
            if (r0 != 0) goto Lf3
            hf r0 = r12.s     // Catch: java.lang.Throwable -> Lf0
            xe0 r2 = defpackage.xe0.z     // Catch: java.lang.Throwable -> Lf0
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> Lf0
            if (r0 != 0) goto Lf3
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf0
            r2.<init>(r11)     // Catch: java.lang.Throwable -> Lf0
            r2.append(r12)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r11 = "..."
            r2.append(r11)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Throwable -> Lf0
            android.util.Log.d(r0, r11)     // Catch: java.lang.Throwable -> Lf0
            rv6 r11 = r12.f     // Catch: java.lang.Throwable -> Lf0
            r11.h()     // Catch: java.lang.Throwable -> Lf0
            defpackage.kc0.b(r12)     // Catch: java.lang.Throwable -> Lf0
            r12.f()     // Catch: java.lang.Throwable -> Lf0
            goto Lf3
        Lf0:
            r0 = move-exception
            r11 = r0
            goto Lf7
        Lf3:
            monitor-exit(r1)
            jg7 r1 = defpackage.jg7.a
        Lf6:
            return r1
        Lf7:
            monitor-exit(r1)
            throw r11
    }
}
