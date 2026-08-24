package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s81  reason: default package */
/* loaded from: classes.dex */
public final class s81 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public defpackage.c97 Y;
    public int Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ defpackage.m16 g0;
    public final /* synthetic */ defpackage.qn2 h0;

    public /* synthetic */ s81(boolean r1, boolean r2, defpackage.m16 r3, defpackage.r41 r4, defpackage.qn2 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.e0 = r1
            r0.f0 = r2
            r0.g0 = r3
            r0.h0 = r5
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            d97 r3 = (defpackage.d97) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            s81 r2 = (defpackage.s81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            s81 r2 = (defpackage.s81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.X
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            s81 r1 = new s81
            qn2 r6 = r9.h0
            r7 = 1
            boolean r2 = r9.e0
            boolean r3 = r9.f0
            m16 r4 = r9.g0
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.d0 = r11
            return r1
        L17:
            r5 = r10
            s81 r2 = new s81
            qn2 r7 = r9.h0
            r8 = 0
            boolean r3 = r9.e0
            boolean r4 = r9.f0
            m16 r9 = r9.g0
            r6 = r5
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2.d0 = r11
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.X
            boolean r1 = r13.e0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 2
            r4 = 3
            r5 = 4
            boolean r6 = r13.f0
            m16 r7 = r13.g0
            qn2 r8 = r13.h0
            r9 = 1
            r10 = 0
            switch(r0) {
                case 0: goto Ld5;
                default: goto L14;
            }
        L14:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r11 = r13.Z
            if (r11 == 0) goto L4c
            if (r11 == r9) goto L42
            if (r11 == r3) goto L38
            if (r11 == r4) goto L2f
            if (r11 != r5) goto L2a
            java.lang.Object r13 = r13.d0
            defpackage.oi2.Y(r14)
            r10 = r13
            goto Laf
        L2a:
            defpackage.i.m(r2)
            goto Ld4
        L2f:
            java.lang.Object r1 = r13.d0
            d97 r1 = (defpackage.d97) r1
            defpackage.oi2.Y(r14)
            goto L9f
        L38:
            c97 r1 = r13.Y
            java.lang.Object r2 = r13.d0
            d97 r2 = (defpackage.d97) r2
            defpackage.oi2.Y(r14)
            goto L87
        L42:
            c97 r1 = r13.Y
            java.lang.Object r2 = r13.d0
            d97 r2 = (defpackage.d97) r2
            defpackage.oi2.Y(r14)
            goto L6e
        L4c:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r13.d0
            d97 r14 = (defpackage.d97) r14
            if (r1 == 0) goto Lc7
            if (r6 == 0) goto L5a
            c97 r1 = defpackage.c97.DEFERRED
            goto L5c
        L5a:
            c97 r1 = defpackage.c97.IMMEDIATE
        L5c:
            if (r6 != 0) goto L8a
            r13.d0 = r14
            r13.Y = r1
            r13.Z = r9
            java.lang.Boolean r2 = r14.c(r13)
            if (r2 != r0) goto L6b
            goto Lab
        L6b:
            r12 = r2
            r2 = r14
            r14 = r12
        L6e:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L87
            zb3 r14 = r7.g()
            r13.d0 = r2
            r13.Y = r1
            r13.Z = r3
            java.lang.Object r14 = r14.a(r13)
            if (r14 != r0) goto L87
            goto Lab
        L87:
            r14 = r1
            r1 = r2
            goto L8d
        L8a:
            r12 = r1
            r1 = r14
            r14 = r12
        L8d:
            r81 r2 = new r81
            r2.<init>(r9, r10, r8)
            r13.d0 = r1
            r13.Y = r10
            r13.Z = r4
            java.lang.Object r14 = r1.a(r14, r2, r13)
            if (r14 != r0) goto L9f
            goto Lab
        L9f:
            if (r6 != 0) goto Lc5
            r13.d0 = r14
            r13.Z = r5
            java.lang.Boolean r13 = r1.c(r13)
            if (r13 != r0) goto Lad
        Lab:
            r10 = r0
            goto Ld4
        Lad:
            r10 = r14
            r14 = r13
        Laf:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            if (r13 != 0) goto Ld4
            zb3 r13 = r7.g()
            nc7 r14 = r13.b
            ns1 r0 = r13.e
            ns1 r13 = r13.f
            r14.e(r0, r13)
            goto Ld4
        Lc5:
            r10 = r14
            goto Ld4
        Lc7:
            r14.getClass()
            ud5 r14 = (defpackage.ud5) r14
            e36 r13 = r14.d()
            java.lang.Object r10 = r8.g(r13)
        Ld4:
            return r10
        Ld5:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r11 = r13.Z
            if (r11 == 0) goto L10d
            if (r11 == r9) goto L103
            if (r11 == r3) goto Lf9
            if (r11 == r4) goto Lf0
            if (r11 != r5) goto Leb
            java.lang.Object r13 = r13.d0
            defpackage.oi2.Y(r14)
            r10 = r13
            goto L171
        Leb:
            defpackage.i.m(r2)
            goto L196
        Lf0:
            java.lang.Object r1 = r13.d0
            d97 r1 = (defpackage.d97) r1
            defpackage.oi2.Y(r14)
            goto L161
        Lf9:
            c97 r1 = r13.Y
            java.lang.Object r2 = r13.d0
            d97 r2 = (defpackage.d97) r2
            defpackage.oi2.Y(r14)
            goto L148
        L103:
            c97 r1 = r13.Y
            java.lang.Object r2 = r13.d0
            d97 r2 = (defpackage.d97) r2
            defpackage.oi2.Y(r14)
            goto L12f
        L10d:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r13.d0
            d97 r14 = (defpackage.d97) r14
            if (r1 == 0) goto L189
            if (r6 == 0) goto L11b
            c97 r1 = defpackage.c97.DEFERRED
            goto L11d
        L11b:
            c97 r1 = defpackage.c97.IMMEDIATE
        L11d:
            if (r6 != 0) goto L14b
            r13.d0 = r14
            r13.Y = r1
            r13.Z = r9
            java.lang.Boolean r2 = r14.c(r13)
            if (r2 != r0) goto L12c
            goto L16d
        L12c:
            r12 = r2
            r2 = r14
            r14 = r12
        L12f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L148
            zb3 r14 = r7.g()
            r13.d0 = r2
            r13.Y = r1
            r13.Z = r3
            java.lang.Object r14 = r14.a(r13)
            if (r14 != r0) goto L148
            goto L16d
        L148:
            r14 = r1
            r1 = r2
            goto L14e
        L14b:
            r12 = r1
            r1 = r14
            r14 = r12
        L14e:
            r81 r2 = new r81
            r3 = 0
            r2.<init>(r3, r10, r8)
            r13.d0 = r1
            r13.Y = r10
            r13.Z = r4
            java.lang.Object r14 = r1.a(r14, r2, r13)
            if (r14 != r0) goto L161
            goto L16d
        L161:
            if (r6 != 0) goto L187
            r13.d0 = r14
            r13.Z = r5
            java.lang.Boolean r13 = r1.c(r13)
            if (r13 != r0) goto L16f
        L16d:
            r10 = r0
            goto L196
        L16f:
            r10 = r14
            r14 = r13
        L171:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            if (r13 != 0) goto L196
            zb3 r13 = r7.g()
            nc7 r14 = r13.b
            ns1 r0 = r13.e
            ns1 r13 = r13.f
            r14.e(r0, r13)
            goto L196
        L187:
            r10 = r14
            goto L196
        L189:
            r14.getClass()
            ud5 r14 = (defpackage.ud5) r14
            e36 r13 = r14.d()
            java.lang.Object r10 = r8.g(r13)
        L196:
            return r10
    }
}
