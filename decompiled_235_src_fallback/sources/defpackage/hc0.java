package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc0  reason: default package */
/* loaded from: classes.dex */
public final class hc0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.kc0 Z;

    public /* synthetic */ hc0(defpackage.kc0 r1, defpackage.r41 r2, int r3) {
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
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            hc0 r2 = (defpackage.hc0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            hc0 r2 = (defpackage.hc0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            hc0 r2 = (defpackage.hc0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            kc0 r1 = r1.Z
            switch(r3) {
                case 0: goto L15;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            hc0 r3 = new hc0
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            hc0 r3 = new hc0
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            hc0 r3 = new hc0
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L80;
                case 1: goto L50;
                default: goto L7;
            }
        L7:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r6.Y
            if (r3 == 0) goto L19
            if (r3 != r2) goto L13
            defpackage.oi2.Y(r7)
            goto L4a
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            goto L4c
        L19:
            defpackage.oi2.Y(r7)
            kc0 r7 = r6.Z
            r6.Y = r2
            dh5 r1 = new dh5
            r1.<init>()
            java.lang.Object r3 = r7.q
            monitor-enter(r3)
            pq7 r4 = r7.y     // Catch: java.lang.Throwable -> L4d
            yk0 r5 = r7.z     // Catch: java.lang.Throwable -> L4d
            r1.A = r5     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)
            if (r4 == 0) goto L44
            if (r5 == 0) goto L44
            le2 r3 = r4.i
            zb0 r4 = new zb0
            r4.<init>(r2, r1, r7)
            java.lang.Object r6 = r3.b(r4, r6)
            if (r6 != r0) goto L41
            goto L46
        L41:
            jg7 r6 = defpackage.jg7.a
            goto L46
        L44:
            jg7 r6 = defpackage.jg7.a
        L46:
            if (r6 != r0) goto L4a
            r1 = r0
            goto L4c
        L4a:
            jg7 r1 = defpackage.jg7.a
        L4c:
            return r1
        L4d:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        L50:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r6.Y
            if (r3 == 0) goto L62
            if (r3 == r2) goto L5e
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            goto L7f
        L5e:
            defpackage.oi2.Y(r7)
            goto L7c
        L62:
            defpackage.oi2.Y(r7)
            kc0 r7 = r6.Z
            sc0 r3 = r7.g
            be5 r3 = r3.e0
            gc0 r4 = new gc0
            r4.<init>(r7, r2)
            r6.Y = r2
            kf6 r7 = r3.A
            java.lang.Object r6 = r7.b(r4, r6)
            if (r6 != r0) goto L7c
            r1 = r0
            goto L7f
        L7c:
            defpackage.e41.c()
        L7f:
            return r1
        L80:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r6.Y
            if (r3 == 0) goto L92
            if (r3 == r2) goto L8e
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            goto Lb0
        L8e:
            defpackage.oi2.Y(r7)
            goto Lad
        L92:
            defpackage.oi2.Y(r7)
            kc0 r7 = r6.Z
            sc0 r3 = r7.g
            de5 r3 = r3.Z
            gc0 r4 = new gc0
            r5 = 0
            r4.<init>(r7, r5)
            r6.Y = r2
            rp6 r7 = r3.A
            java.lang.Object r6 = r7.b(r4, r6)
            if (r6 != r0) goto Lad
            r1 = r0
            goto Lb0
        Lad:
            defpackage.e41.c()
        Lb0:
            return r1
    }
}
