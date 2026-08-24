package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz5  reason: default package */
/* loaded from: classes.dex */
public final class dz5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.tz5 Z;

    public /* synthetic */ dz5(defpackage.tz5 r1, defpackage.r41 r2, int r3) {
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
            dz5 r2 = (defpackage.dz5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            dz5 r2 = (defpackage.dz5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            dz5 r2 = (defpackage.dz5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            tz5 r1 = r1.Z
            switch(r3) {
                case 0: goto L15;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            dz5 r3 = new dz5
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            dz5 r3 = new dz5
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            dz5 r3 = new dz5
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            tz5 r3 = r10.Z
            r4 = 2
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto Lc4;
                case 1: goto L7b;
                default: goto Le;
            }
        Le:
            fg r0 = r3.g
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r10.Y
            if (r7 == 0) goto L28
            if (r7 == r5) goto L24
            if (r7 != r4) goto L20
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L1e
            goto L49
        L1e:
            r10 = move-exception
            goto L77
        L20:
            defpackage.i.m(r2)
            goto L76
        L24:
            defpackage.oi2.Y(r11)
            goto L34
        L28:
            defpackage.oi2.Y(r11)
            r10.Y = r5
            java.lang.Enum r11 = r0.i(r10)
            if (r11 != r1) goto L34
            goto L47
        L34:
            mm4 r11 = (defpackage.mm4) r11
            boolean r11 = r11.isFailure()
            if (r11 == 0) goto L3f
            yt1 r6 = defpackage.yt1.A
            goto L76
        L3f:
            r10.Y = r4     // Catch: java.lang.Throwable -> L1e
            java.io.Serializable r11 = r0.h(r10)     // Catch: java.lang.Throwable -> L1e
            if (r11 != r1) goto L49
        L47:
            r6 = r1
            goto L76
        L49:
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r1 = 10
            int r1 = defpackage.ht0.v0(r11, r1)     // Catch: java.lang.Throwable -> L1e
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L1e
        L5a:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L72
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> L1e
            me.magnum.melonds.domain.model.DSiWareTitle r1 = (me.magnum.melonds.domain.model.DSiWareTitle) r1     // Catch: java.lang.Throwable -> L1e
            pq5 r1 = defpackage.tz5.h(r3, r1)     // Catch: java.lang.Throwable -> L1e
            kz5 r1 = defpackage.tz5.e(r3, r1, r6)     // Catch: java.lang.Throwable -> L1e
            r10.add(r1)     // Catch: java.lang.Throwable -> L1e
            goto L5a
        L72:
            r0.b()
            r6 = r10
        L76:
            return r6
        L77:
            r0.b()
            throw r10
        L7b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r10.Y
            if (r7 == 0) goto L8c
            if (r7 != r5) goto L87
            defpackage.oi2.Y(r11)
            goto Lc3
        L87:
            defpackage.i.m(r2)
            r1 = r6
            goto Lc3
        L8c:
            defpackage.oi2.Y(r11)
            tp6 r11 = r3.F
            p06 r2 = r3.b
            xb2 r2 = (defpackage.xb2) r2
            tp6 r2 = r2.r
            de5 r7 = new de5
            r7.<init>(r2)
            kz0 r2 = new kz0
            r2.<init>(r3, r6, r4)
            bz5 r8 = new bz5
            r9 = 3
            r8.<init>(r3, r9)
            r10.Y = r5
            le2[] r3 = new defpackage.le2[r4]
            r4 = 0
            r3[r4] = r11
            r3[r5] = r7
            jz r11 = defpackage.jz.R
            o12 r4 = new o12
            r5 = 5
            r4.<init>(r2, r6, r5)
            java.lang.Object r10 = defpackage.nb3.o(r10, r8, r11, r4, r3)
            if (r10 != r0) goto Lbf
            goto Lc0
        Lbf:
            r10 = r1
        Lc0:
            if (r10 != r0) goto Lc3
            r1 = r0
        Lc3:
            return r1
        Lc4:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r10.Y
            if (r4 == 0) goto Ld5
            if (r4 != r5) goto Ld0
            defpackage.oi2.Y(r11)
            goto Lee
        Ld0:
            defpackage.i.m(r2)
            r1 = r6
            goto Lee
        Ld5:
            defpackage.oi2.Y(r11)
            p06 r11 = r3.b
            xb2 r11 = (defpackage.xb2) r11
            g21 r11 = r11.o()
            bz5 r2 = new bz5
            r2.<init>(r3, r5)
            r10.Y = r5
            java.lang.Object r10 = r11.b(r2, r10)
            if (r10 != r0) goto Lee
            r1 = r0
        Lee:
            return r1
    }
}
