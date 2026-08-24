package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o5  reason: default package */
/* loaded from: classes.dex */
public final class o5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.pr3 Z;
    public final /* synthetic */ float d0;

    public /* synthetic */ o5(defpackage.pr3 r1, float r2, defpackage.r41 r3, int r4) {
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
            o5 r2 = (defpackage.o5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            o5 r2 = (defpackage.o5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            switch(r4) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            o5 r4 = new o5
            float r0 = r2.d0
            r1 = 1
            pr3 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            o5 r4 = new o5
            float r0 = r2.d0
            r1 = 0
            pr3 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            r2 = 7
            r3 = 0
            float r4 = r10.d0
            pr3 r5 = r10.Z
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L33;
                default: goto L11;
            }
        L11:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r10.Y
            if (r9 == 0) goto L22
            if (r9 != r7) goto L1d
            defpackage.oi2.Y(r11)
            goto L32
        L1d:
            defpackage.i.m(r6)
            r1 = r8
            goto L32
        L22:
            defpackage.oi2.Y(r11)
            r10.Y = r7
            io6 r11 = defpackage.ge7.U(r3, r3, r8, r2)
            java.lang.Object r10 = defpackage.yh2.i(r5, r4, r11, r10)
            if (r10 != r0) goto L32
            r1 = r0
        L32:
            return r1
        L33:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r10.Y
            if (r9 == 0) goto L44
            if (r9 != r7) goto L3f
            defpackage.oi2.Y(r11)
            goto L55
        L3f:
            defpackage.i.m(r6)
            r1 = r8
            goto L55
        L44:
            defpackage.oi2.Y(r11)
            float r11 = -r4
            r10.Y = r7
            io6 r2 = defpackage.ge7.U(r3, r3, r8, r2)
            java.lang.Object r10 = defpackage.yh2.i(r5, r11, r2, r10)
            if (r10 != r0) goto L55
            r1 = r0
        L55:
            return r1
    }
}
