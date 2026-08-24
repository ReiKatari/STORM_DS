package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g22  reason: default package */
/* loaded from: classes.dex */
public final class g22 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public java.lang.Object Y;
    public int Z;
    public final /* synthetic */ defpackage.sz1 d0;
    public final /* synthetic */ long e0;

    public /* synthetic */ g22(defpackage.sz1 r1, long r2, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.d0 = r1
            r0.e0 = r2
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            g22 r2 = (defpackage.g22) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            g22 r2 = (defpackage.g22) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            g22 r0 = new g22
            long r2 = r7.e0
            r5 = 1
            sz1 r1 = r7.d0
            r4 = r8
            r0.<init>(r1, r2, r4, r5)
            return r0
        L11:
            r4 = r8
            g22 r1 = new g22
            r5 = r4
            long r3 = r7.e0
            r6 = 0
            sz1 r2 = r7.d0
            r1.<init>(r2, r3, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            long r2 = r10.e0
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7 = 2
            sz1 r8 = r10.d0
            switch(r0) {
                case 0: goto L57;
                default: goto L10;
            }
        L10:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r10.Z
            if (r9 == 0) goto L2b
            if (r9 == r6) goto L23
            if (r9 != r7) goto L1e
            defpackage.oi2.Y(r11)
            goto L56
        L1e:
            defpackage.i.m(r5)
            r1 = r4
            goto L56
        L23:
            defpackage.oi2.Y(r11)
            hm5 r11 = (defpackage.hm5) r11
            java.lang.Object r11 = r11.A
            goto L3b
        L2b:
            defpackage.oi2.Y(r11)
            pn5 r11 = r8.g
            r10.Z = r6
            pl r11 = (defpackage.pl) r11
            java.lang.Object r11 = r11.h(r2, r10)
            if (r11 != r0) goto L3b
            goto L55
        L3b:
            boolean r2 = r11 instanceof defpackage.em5
            if (r2 != 0) goto L56
            r2 = r11
            o75 r2 = (defpackage.o75) r2
            if (r2 == 0) goto L56
            of6 r3 = r8.F0
            r95 r4 = new r95
            r4.<init>(r2)
            r10.Y = r11
            r10.Z = r7
            java.lang.Object r10 = r3.a(r4, r10)
            if (r10 != r0) goto L56
        L55:
            r1 = r0
        L56:
            return r1
        L57:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r10.Z
            if (r9 == 0) goto L72
            if (r9 == r6) goto L6a
            if (r9 != r7) goto L65
            defpackage.oi2.Y(r11)
            goto L9d
        L65:
            defpackage.i.m(r5)
            r1 = r4
            goto L9d
        L6a:
            defpackage.oi2.Y(r11)
            hm5 r11 = (defpackage.hm5) r11
            java.lang.Object r11 = r11.A
            goto L82
        L72:
            defpackage.oi2.Y(r11)
            pn5 r11 = r8.g
            r10.Z = r6
            pl r11 = (defpackage.pl) r11
            java.lang.Object r11 = r11.h(r2, r10)
            if (r11 != r0) goto L82
            goto L9c
        L82:
            boolean r2 = r11 instanceof defpackage.em5
            if (r2 != 0) goto L9d
            r2 = r11
            o75 r2 = (defpackage.o75) r2
            if (r2 == 0) goto L9d
            of6 r3 = r8.F0
            m95 r4 = new m95
            r4.<init>(r2)
            r10.Y = r11
            r10.Z = r7
            java.lang.Object r10 = r3.a(r4, r10)
            if (r10 != r0) goto L9d
        L9c:
            r1 = r0
        L9d:
            return r1
    }
}
