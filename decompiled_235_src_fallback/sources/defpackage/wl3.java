package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl3  reason: default package */
/* loaded from: classes.dex */
public final class wl3 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.yl3 Z;
    public final /* synthetic */ defpackage.fk3 d0;

    public /* synthetic */ wl3(defpackage.yl3 r1, defpackage.fk3 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
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
            wl3 r2 = (defpackage.wl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            wl3 r2 = (defpackage.wl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            fk3 r0 = r2.d0
            yl3 r2 = r2.Z
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            wl3 r4 = new wl3
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            wl3 r4 = new wl3
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.X
            jg7 r2 = defpackage.jg7.a
            yl3 r3 = r0.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r1) {
                case 0: goto L3f;
                default: goto Lf;
            }
        Lf:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r0.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r17)
            goto L3e
        L1b:
            defpackage.i.m(r5)
            r2 = r4
            goto L3e
        L20:
            defpackage.oi2.Y(r17)
            wa3 r3 = r3.b
            dk3 r10 = defpackage.dk3.CUSTOM
            r14 = 0
            r15 = 122(0x7a, float:1.71E-43)
            fk3 r7 = r0.d0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            fk3 r4 = defpackage.fk3.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.Y = r6
            java.lang.Object r0 = r3.f(r4, r0)
            if (r0 != r1) goto L3e
            r2 = r1
        L3e:
            return r2
        L3f:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r0.Y
            if (r7 == 0) goto L50
            if (r7 != r6) goto L4b
            defpackage.oi2.Y(r17)
            goto L60
        L4b:
            defpackage.i.m(r5)
            r2 = r4
            goto L60
        L50:
            defpackage.oi2.Y(r17)
            wa3 r3 = r3.b
            r0.Y = r6
            fk3 r4 = r0.d0
            java.lang.Object r0 = r3.f(r4, r0)
            if (r0 != r1) goto L60
            r2 = r1
        L60:
            return r2
    }
}
