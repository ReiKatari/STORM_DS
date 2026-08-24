package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mo5  reason: default package */
/* loaded from: classes.dex */
public final class mo5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.qv5 Z;
    public final /* synthetic */ java.lang.String d0;
    public final /* synthetic */ java.lang.String e0;

    public /* synthetic */ mo5(defpackage.qv5 r1, java.lang.String r2, java.lang.String r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 2
            r0.<init>(r1, r4)
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
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            mo5 r2 = (defpackage.mo5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            mo5 r2 = (defpackage.mo5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            mo5 r2 = (defpackage.mo5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            mo5 r2 = (defpackage.mo5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L2f;
                case 1: goto L21;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            mo5 r0 = new mo5
            java.lang.String r3 = r7.e0
            r5 = 3
            qv5 r1 = r7.Z
            java.lang.String r2 = r7.d0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r5 = r8
            mo5 r1 = new mo5
            java.lang.String r4 = r7.e0
            r6 = 2
            qv5 r2 = r7.Z
            java.lang.String r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L21:
            r5 = r8
            mo5 r1 = new mo5
            java.lang.String r4 = r7.e0
            r6 = 1
            qv5 r2 = r7.Z
            java.lang.String r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L2f:
            r5 = r8
            mo5 r1 = new mo5
            java.lang.String r4 = r7.e0
            r6 = 0
            qv5 r2 = r7.Z
            java.lang.String r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            java.lang.String r1 = r9.e0
            java.lang.String r2 = r9.d0
            qv5 r3 = r9.Z
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L84;
                case 1: goto L58;
                case 2: goto L38;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L23
            if (r7 != r5) goto L1f
            defpackage.oi2.Y(r10)
            hm5 r10 = (defpackage.hm5) r10
            java.lang.Object r9 = r10.A
            goto L32
        L1f:
            defpackage.i.m(r4)
            goto L37
        L23:
            defpackage.oi2.Y(r10)
            vk6 r10 = r3.l
            r9.Y = r5
            java.lang.Object r9 = r10.e(r2, r1, r9)
            if (r9 != r0) goto L32
            r6 = r0
            goto L37
        L32:
            hm5 r6 = new hm5
            r6.<init>(r9)
        L37:
            return r6
        L38:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L49
            if (r7 != r5) goto L44
            defpackage.oi2.Y(r10)
            goto L57
        L44:
            defpackage.i.m(r4)
            r10 = r6
            goto L57
        L49:
            defpackage.oi2.Y(r10)
            oj4 r10 = r3.j
            r9.Y = r5
            java.lang.Object r10 = r10.g(r2, r1, r9)
            if (r10 != r0) goto L57
            r10 = r0
        L57:
            return r10
        L58:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            r8 = 0
            if (r7 == 0) goto L69
            if (r7 != r5) goto L65
            defpackage.oi2.Y(r10)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L82
            goto L78
        L65:
            defpackage.i.m(r4)
            goto L81
        L69:
            defpackage.oi2.Y(r10)
            ck4 r10 = r3.k     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L82
            r9.Y = r5     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L82
            java.lang.Object r10 = r10.b(r2, r1, r9)     // Catch: java.lang.Exception -> L7d java.util.concurrent.CancellationException -> L82
            if (r10 != r0) goto L78
            r6 = r0
            goto L81
        L78:
            if (r10 == 0) goto L7b
            goto L7c
        L7b:
            r5 = r8
        L7c:
            r8 = r5
        L7d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)
        L81:
            return r6
        L82:
            r9 = move-exception
            throw r9
        L84:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L98
            if (r7 != r5) goto L94
            defpackage.oi2.Y(r10)
            hm5 r10 = (defpackage.hm5) r10
            java.lang.Object r9 = r10.A
            goto La9
        L94:
            defpackage.i.m(r4)
            goto Lbd
        L98:
            defpackage.oi2.Y(r10)
            pn5 r10 = r3.b
            r9.Y = r5
            pl r10 = (defpackage.pl) r10
            java.lang.Object r9 = r10.v(r2, r1, r9)
            if (r9 != r0) goto La9
            r6 = r0
            goto Lbd
        La9:
            boolean r9 = r9 instanceof defpackage.em5
            if (r9 != 0) goto Lb1
            r3.m()
            goto Lbb
        Lb1:
            tp6 r9 = r3.d
            r9.getClass()
            h06 r10 = defpackage.h06.a
            r9.m(r6, r10)
        Lbb:
            jg7 r6 = defpackage.jg7.a
        Lbd:
            return r6
    }
}
