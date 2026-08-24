package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e12  reason: default package */
/* loaded from: classes.dex */
public final class e12 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.sz1 Z;
    public final /* synthetic */ defpackage.pq5 d0;
    public final /* synthetic */ boolean e0;

    public /* synthetic */ e12(defpackage.sz1 r1, defpackage.pq5 r2, boolean r3, defpackage.r41 r4, int r5) {
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
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            e12 r2 = (defpackage.e12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            e12 r2 = (defpackage.e12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            e12 r2 = (defpackage.e12) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L21;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            e12 r0 = new e12
            boolean r3 = r7.e0
            r5 = 2
            sz1 r1 = r7.Z
            pq5 r2 = r7.d0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r5 = r8
            e12 r1 = new e12
            boolean r4 = r7.e0
            r6 = 1
            sz1 r2 = r7.Z
            pq5 r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L21:
            r5 = r8
            e12 r1 = new e12
            boolean r4 = r7.e0
            r6 = 0
            sz1 r2 = r7.Z
            pq5 r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            boolean r1 = r8.e0
            pq5 r2 = r8.d0
            sz1 r3 = r8.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L68;
                case 1: goto L3c;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L23
            if (r7 != r6) goto L1f
            defpackage.oi2.Y(r9)
            hm5 r9 = (defpackage.hm5) r9
            java.lang.Object r8 = r9.A
            goto L36
        L1f:
            defpackage.i.m(r5)
            goto L3b
        L23:
            defpackage.oi2.Y(r9)
            pn5 r9 = r3.g
            java.lang.String r2 = r2.i
            r8.Y = r6
            pl r9 = (defpackage.pl) r9
            java.lang.Object r8 = r9.A(r2, r1, r8)
            if (r8 != r0) goto L36
            r4 = r0
            goto L3b
        L36:
            hm5 r4 = new hm5
            r4.<init>(r8)
        L3b:
            return r4
        L3c:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L51
            if (r7 != r6) goto L4d
            defpackage.oi2.Y(r9)
            hm5 r9 = (defpackage.hm5) r9
            java.lang.Object r8 = r9.A
        L4b:
            r4 = r8
            goto L64
        L4d:
            defpackage.i.m(r5)
            goto L67
        L51:
            defpackage.oi2.Y(r9)
            pn5 r9 = r3.g
            java.lang.String r2 = r2.i
            r8.Y = r6
            pl r9 = (defpackage.pl) r9
            java.lang.Object r8 = r9.x(r2, r1, r8)
            if (r8 != r0) goto L4b
            r4 = r0
            goto L67
        L64:
            defpackage.oi2.Y(r4)
        L67:
            return r4
        L68:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L7c
            if (r7 != r6) goto L78
            defpackage.oi2.Y(r9)
            hm5 r9 = (defpackage.hm5) r9
            java.lang.Object r8 = r9.A
            goto L8f
        L78:
            defpackage.i.m(r5)
            goto L94
        L7c:
            defpackage.oi2.Y(r9)
            pn5 r9 = r3.g
            java.lang.String r2 = r2.i
            r8.Y = r6
            pl r9 = (defpackage.pl) r9
            java.lang.Object r8 = r9.j(r2, r1, r8)
            if (r8 != r0) goto L8f
            r4 = r0
            goto L94
        L8f:
            hm5 r4 = new hm5
            r4.<init>(r8)
        L94:
            return r4
    }
}
