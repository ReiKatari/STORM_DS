package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o12  reason: default package */
/* loaded from: classes.dex */
public final class o12 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;

    public /* synthetic */ o12(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.e0 = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    public /* synthetic */ o12(defpackage.r41 r1, defpackage.ao2 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.e0 = r2
            r2 = 3
            r0.<init>(r2, r1)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r3 = r3.e0
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L65;
                case 2: goto L4e;
                case 3: goto L37;
                case 4: goto L20;
                default: goto L9;
            }
        L9:
            ne2 r4 = (defpackage.ne2) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r41 r6 = (defpackage.r41) r6
            o12 r0 = new o12
            fo2 r3 = (defpackage.fo2) r3
            r2 = 5
            r0.<init>(r3, r6, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L20:
            ne2 r4 = (defpackage.ne2) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r41 r6 = (defpackage.r41) r6
            o12 r0 = new o12
            io2 r3 = (defpackage.io2) r3
            r2 = 4
            r0.<init>(r6, r3, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L37:
            ne2 r4 = (defpackage.ne2) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r41 r6 = (defpackage.r41) r6
            o12 r0 = new o12
            ho2 r3 = (defpackage.ho2) r3
            r2 = 3
            r0.<init>(r6, r3, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L4e:
            ne2 r4 = (defpackage.ne2) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r41 r6 = (defpackage.r41) r6
            o12 r0 = new o12
            go2 r3 = (defpackage.go2) r3
            r2 = 2
            r0.<init>(r6, r3, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L65:
            ne2 r4 = (defpackage.ne2) r4
            r41 r6 = (defpackage.r41) r6
            o12 r0 = new o12
            eo2 r3 = (defpackage.eo2) r3
            r2 = 1
            r0.<init>(r3, r6, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L7a:
            o75 r4 = (defpackage.o75) r4
            hb5 r5 = (defpackage.hb5) r5
            r41 r6 = (defpackage.r41) r6
            o12 r0 = new o12
            sz1 r3 = (defpackage.sz1) r3
            r2 = 0
            r0.<init>(r3, r6, r2)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.X
            r1 = 3
            r2 = 0
            jg7 r7 = defpackage.jg7.a
            r8 = 2
            java.lang.Object r3 = r14.e0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r9 = 0
            switch(r0) {
                case 0: goto L179;
                case 1: goto L13b;
                case 2: goto Lf5;
                case 3: goto La7;
                case 4: goto L54;
                default: goto L10;
            }
        L10:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L23
            if (r1 != r8) goto L1e
            defpackage.oi2.Y(r15)
            goto L53
        L1e:
            defpackage.i.m(r4)
            r7 = r9
            goto L53
        L23:
            java.lang.Object r1 = r14.Z
            ne2 r1 = (defpackage.ne2) r1
            defpackage.oi2.Y(r15)
            r2 = r15
            goto L48
        L2c:
            defpackage.oi2.Y(r15)
            java.lang.Object r1 = r14.Z
            ne2 r1 = (defpackage.ne2) r1
            java.lang.Object r4 = r14.d0
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            fo2 r3 = (defpackage.fo2) r3
            r2 = r4[r2]
            r4 = r4[r6]
            r14.Z = r1
            r14.Y = r6
            java.lang.Object r2 = r3.e(r2, r4, r14)
            if (r2 != r0) goto L48
            goto L52
        L48:
            r14.Z = r9
            r14.Y = r8
            java.lang.Object r1 = r1.a(r2, r14)
            if (r1 != r0) goto L53
        L52:
            r7 = r0
        L53:
            return r7
        L54:
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r14.Y
            if (r0 == 0) goto L71
            if (r0 == r6) goto L67
            if (r0 != r8) goto L62
            defpackage.oi2.Y(r15)
            goto La6
        L62:
            defpackage.i.m(r4)
            r7 = r9
            goto La6
        L67:
            java.lang.Object r0 = r14.Z
            ne2 r0 = (defpackage.ne2) r0
            defpackage.oi2.Y(r15)
            r11 = r0
            r0 = r15
            goto L9b
        L71:
            defpackage.oi2.Y(r15)
            java.lang.Object r0 = r14.Z
            r11 = r0
            ne2 r11 = (defpackage.ne2) r11
            java.lang.Object r0 = r14.d0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            io2 r3 = (defpackage.io2) r3
            r12 = r1
            r1 = r0[r2]
            r2 = r0[r6]
            r4 = r0
            r0 = r3
            r3 = r4[r8]
            r13 = r4
            r4 = r13[r12]
            r12 = 4
            r12 = r13[r12]
            r14.Z = r11
            r14.Y = r6
            r6 = r14
            r5 = r12
            java.lang.Object r0 = r0.n(r1, r2, r3, r4, r5, r6)
            if (r0 != r10) goto L9b
            goto La5
        L9b:
            r14.Z = r9
            r14.Y = r8
            java.lang.Object r0 = r11.a(r0, r14)
            if (r0 != r10) goto La6
        La5:
            r7 = r10
        La6:
            return r7
        La7:
            r12 = r1
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r14.Y
            if (r0 == 0) goto Lc5
            if (r0 == r6) goto Lbb
            if (r0 != r8) goto Lb6
            defpackage.oi2.Y(r15)
            goto Lf4
        Lb6:
            defpackage.i.m(r4)
            r7 = r9
            goto Lf4
        Lbb:
            java.lang.Object r0 = r14.Z
            ne2 r0 = (defpackage.ne2) r0
            defpackage.oi2.Y(r15)
            r11 = r0
            r0 = r15
            goto Le9
        Lc5:
            defpackage.oi2.Y(r15)
            java.lang.Object r0 = r14.Z
            r11 = r0
            ne2 r11 = (defpackage.ne2) r11
            java.lang.Object r0 = r14.d0
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            ho2 r3 = (defpackage.ho2) r3
            r1 = r0[r2]
            r2 = r0[r6]
            r4 = r0
            r0 = r3
            r3 = r4[r8]
            r4 = r4[r12]
            r14.Z = r11
            r14.Y = r6
            r5 = r14
            java.lang.Object r0 = r0.p(r1, r2, r3, r4, r5)
            if (r0 != r10) goto Le9
            goto Lf3
        Le9:
            r14.Z = r9
            r14.Y = r8
            java.lang.Object r0 = r11.a(r0, r14)
            if (r0 != r10) goto Lf4
        Lf3:
            r7 = r10
        Lf4:
            return r7
        Lf5:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            if (r1 == 0) goto L111
            if (r1 == r6) goto L108
            if (r1 != r8) goto L103
            defpackage.oi2.Y(r15)
            goto L13a
        L103:
            defpackage.i.m(r4)
            r7 = r9
            goto L13a
        L108:
            java.lang.Object r1 = r14.Z
            ne2 r1 = (defpackage.ne2) r1
            defpackage.oi2.Y(r15)
            r2 = r15
            goto L12f
        L111:
            defpackage.oi2.Y(r15)
            java.lang.Object r1 = r14.Z
            ne2 r1 = (defpackage.ne2) r1
            java.lang.Object r4 = r14.d0
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            go2 r3 = (defpackage.go2) r3
            r2 = r4[r2]
            r10 = r4[r6]
            r4 = r4[r8]
            r14.Z = r1
            r14.Y = r6
            java.lang.Object r2 = r3.l(r2, r10, r4, r14)
            if (r2 != r0) goto L12f
            goto L139
        L12f:
            r14.Z = r9
            r14.Y = r8
            java.lang.Object r1 = r1.a(r2, r14)
            if (r1 != r0) goto L13a
        L139:
            r7 = r0
        L13a:
            return r7
        L13b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            if (r1 == 0) goto L157
            if (r1 == r6) goto L14e
            if (r1 != r8) goto L149
            defpackage.oi2.Y(r15)
            goto L178
        L149:
            defpackage.i.m(r4)
            r7 = r9
            goto L178
        L14e:
            java.lang.Object r1 = r14.Z
            ne2 r1 = (defpackage.ne2) r1
            defpackage.oi2.Y(r15)
            r2 = r15
            goto L16d
        L157:
            defpackage.oi2.Y(r15)
            java.lang.Object r1 = r14.Z
            ne2 r1 = (defpackage.ne2) r1
            java.lang.Object r2 = r14.d0
            eo2 r3 = (defpackage.eo2) r3
            r14.Z = r1
            r14.Y = r6
            java.lang.Object r2 = r3.o(r2, r14)
            if (r2 != r0) goto L16d
            goto L177
        L16d:
            r14.Z = r9
            r14.Y = r8
            java.lang.Object r1 = r1.a(r2, r14)
            if (r1 != r0) goto L178
        L177:
            r7 = r0
        L178:
            return r7
        L179:
            java.lang.Object r0 = r14.Z
            o75 r0 = (defpackage.o75) r0
            java.lang.Object r1 = r14.d0
            hb5 r1 = (defpackage.hb5) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r14.Y
            if (r7 == 0) goto L196
            if (r7 != r6) goto L192
            defpackage.oi2.Y(r15)
            r0 = r15
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r0 = r0.A
            goto L1ad
        L192:
            defpackage.i.m(r4)
            goto L1b2
        L196:
            defpackage.oi2.Y(r15)
            sz1 r3 = (defpackage.sz1) r3
            pn5 r3 = r3.g
            r14.Z = r9
            r14.d0 = r9
            r14.Y = r6
            pl r3 = (defpackage.pl) r3
            java.lang.Object r0 = r3.c(r0, r6, r1, r14)
            if (r0 != r2) goto L1ad
            r9 = r2
            goto L1b2
        L1ad:
            hm5 r9 = new hm5
            r9.<init>(r0)
        L1b2:
            return r9
    }
}
