package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pz5  reason: default package */
/* loaded from: classes.dex */
public final class pz5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public defpackage.tp6 Y;
    public int Z;
    public final /* synthetic */ defpackage.tz5 d0;

    public /* synthetic */ pz5(defpackage.tz5 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.d0 = r1
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
            pz5 r2 = (defpackage.pz5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            pz5 r2 = (defpackage.pz5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            tz5 r1 = r1.d0
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            pz5 r3 = new pz5
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            pz5 r3 = new pz5
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            tz5 r2 = r8.d0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L42;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Z
            if (r6 == 0) goto L20
            if (r6 != r4) goto L1b
            tp6 r8 = r8.Y
            defpackage.oi2.Y(r9)
            goto L3e
        L1b:
            defpackage.i.m(r3)
            r1 = r5
            goto L41
        L20:
            defpackage.oi2.Y(r9)
            tp6 r9 = r2.E
            r8.Y = r9
            r8.Z = r4
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            dz5 r4 = new dz5
            r6 = 2
            r4.<init>(r2, r5, r6)
            java.lang.Object r8 = defpackage.hv.d0(r3, r4, r8)
            if (r8 != r0) goto L3b
            r1 = r0
            goto L41
        L3b:
            r7 = r9
            r9 = r8
            r8 = r7
        L3e:
            r8.l(r9)
        L41:
            return r1
        L42:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r8.Z
            if (r6 == 0) goto L55
            if (r6 != r4) goto L50
            tp6 r8 = r8.Y
            defpackage.oi2.Y(r9)
            goto L6d
        L50:
            defpackage.i.m(r3)
            r1 = r5
            goto L70
        L55:
            defpackage.oi2.Y(r9)
            tp6 r9 = r2.u
            pn5 r2 = r2.h
            r8.Y = r9
            r8.Z = r4
            pl r2 = (defpackage.pl) r2
            java.lang.Object r8 = r2.s(r8)
            if (r8 != r0) goto L6a
            r1 = r0
            goto L70
        L6a:
            r7 = r9
            r9 = r8
            r8 = r7
        L6d:
            r8.l(r9)
        L70:
            return r1
    }
}
