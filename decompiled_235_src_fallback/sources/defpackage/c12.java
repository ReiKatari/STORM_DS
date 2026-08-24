package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c12  reason: default package */
/* loaded from: classes.dex */
public final class c12 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ c12(int r1, defpackage.r41 r2, defpackage.sz1 r3) {
            r0 = this;
            r0.X = r1
            r0.d0 = r3
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    public c12(defpackage.u63 r2, defpackage.eo2 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r2 = 3
            r1.<init>(r2, r4)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r3.d0
            switch(r0) {
                case 0: goto L34;
                case 1: goto L1f;
                default: goto L9;
            }
        L9:
            bd r4 = (defpackage.bd) r4
            s04 r5 = (defpackage.s04) r5
            r41 r6 = (defpackage.r41) r6
            c12 r4 = new c12
            java.lang.Object r3 = r3.Z
            u63 r3 = (defpackage.u63) r3
            eo2 r2 = (defpackage.eo2) r2
            r4.<init>(r3, r2, r6)
            java.lang.Object r3 = r4.s(r1)
            return r3
        L1f:
            ne2 r4 = (defpackage.ne2) r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r41 r6 = (defpackage.r41) r6
            c12 r3 = new c12
            sz1 r2 = (defpackage.sz1) r2
            r5 = 1
            r3.<init>(r5, r6, r2)
            r3.Z = r4
            java.lang.Object r3 = r3.s(r1)
            return r3
        L34:
            ne2 r4 = (defpackage.ne2) r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r41 r6 = (defpackage.r41) r6
            c12 r3 = new c12
            sz1 r2 = (defpackage.sz1) r2
            r5 = 0
            r3.<init>(r5, r6, r2)
            r3.Z = r4
            java.lang.Object r3 = r3.s(r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r8.d0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L35;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Y
            if (r6 == 0) goto L1e
            if (r6 != r4) goto L19
            defpackage.oi2.Y(r9)
            goto L34
        L19:
            defpackage.i.m(r3)
            r1 = r5
            goto L34
        L1e:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Z
            u63 r9 = (defpackage.u63) r9
            java.lang.Object r9 = r9.B
            cd r9 = (defpackage.cd) r9
            eo2 r2 = (defpackage.eo2) r2
            r8.Y = r4
            java.lang.Object r8 = r2.o(r9, r8)
            if (r8 != r0) goto L34
            r1 = r0
        L34:
            return r1
        L35:
            java.lang.Object r0 = r8.Z
            ne2 r0 = (defpackage.ne2) r0
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L4a
            if (r7 != r4) goto L45
            defpackage.oi2.Y(r9)
            goto L5e
        L45:
            defpackage.i.m(r3)
            r1 = r5
            goto L5e
        L4a:
            defpackage.oi2.Y(r9)
            sz1 r2 = (defpackage.sz1) r2
            cm0 r9 = defpackage.sz1.s(r2)
            r8.Z = r5
            r8.Y = r4
            java.lang.Object r8 = defpackage.f04.A(r0, r9, r8)
            if (r8 != r6) goto L5e
            r1 = r6
        L5e:
            return r1
        L5f:
            java.lang.Object r0 = r8.Z
            ne2 r0 = (defpackage.ne2) r0
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L74
            if (r7 != r4) goto L6f
            defpackage.oi2.Y(r9)
            goto L8c
        L6f:
            defpackage.i.m(r3)
            r1 = r5
            goto L8c
        L74:
            defpackage.oi2.Y(r9)
            sz1 r2 = (defpackage.sz1) r2
            wa3 r9 = r2.q
            java.util.UUID r2 = defpackage.fk3.h
            le2 r9 = r9.e(r2)
            r8.Z = r5
            r8.Y = r4
            java.lang.Object r8 = defpackage.f04.A(r0, r9, r8)
            if (r8 != r6) goto L8c
            r1 = r6
        L8c:
            return r1
    }
}
