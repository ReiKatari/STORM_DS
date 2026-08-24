package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x5  reason: default package */
/* loaded from: classes.dex */
public final class x5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.qa4 Z;

    public /* synthetic */ x5(defpackage.qa4 r1, defpackage.r41 r2, int r3) {
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
            x5 r2 = (defpackage.x5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            x5 r2 = (defpackage.x5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            x5 r2 = (defpackage.x5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            switch(r3) {
                case 0: goto L17;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            x5 r3 = new x5
            qa4 r1 = r1.Z
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            x5 r3 = new x5
            qa4 r1 = r1.Z
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L17:
            x5 r3 = new x5
            qa4 r1 = r1.Z
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            r1 = 500(0x1f4, double:2.47E-321)
            jg7 r3 = defpackage.jg7.a
            qa4 r4 = r10.Z
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            switch(r0) {
                case 0: goto L59;
                case 1: goto L33;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r10.Y
            if (r8 == 0) goto L20
            if (r8 != r7) goto L1b
            defpackage.oi2.Y(r11)
            goto L2d
        L1b:
            defpackage.i.m(r6)
            r3 = r5
            goto L32
        L20:
            defpackage.oi2.Y(r11)
            r10.Y = r7
            java.lang.Object r10 = defpackage.q60.t(r1, r10)
            if (r10 != r0) goto L2d
            r3 = r0
            goto L32
        L2d:
            j14 r10 = defpackage.j14.SHOW_FULL
            r4.setValue(r10)
        L32:
            return r3
        L33:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r10.Y
            if (r1 == 0) goto L44
            if (r1 != r7) goto L3f
            defpackage.oi2.Y(r11)
            goto L53
        L3f:
            defpackage.i.m(r6)
            r3 = r5
            goto L58
        L44:
            defpackage.oi2.Y(r11)
            r10.Y = r7
            r1 = 650(0x28a, double:3.21E-321)
            java.lang.Object r10 = defpackage.q60.t(r1, r10)
            if (r10 != r0) goto L53
            r3 = r0
            goto L58
        L53:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r4.setValue(r10)
        L58:
            return r3
        L59:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r10.Y
            r9 = 2
            if (r8 == 0) goto L71
            if (r8 == r7) goto L6d
            if (r8 != r9) goto L68
            defpackage.oi2.Y(r11)
            goto L8e
        L68:
            defpackage.i.m(r6)
            r3 = r5
            goto L93
        L6d:
            defpackage.oi2.Y(r11)
            goto L7d
        L71:
            defpackage.oi2.Y(r11)
            r10.Y = r7
            java.lang.Object r11 = defpackage.q60.t(r1, r10)
            if (r11 != r0) goto L7d
            goto L8c
        L7d:
            h05 r11 = defpackage.h05.SHOW_TITLE
            r4.setValue(r11)
            r10.Y = r9
            r1 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r10 = defpackage.q60.t(r1, r10)
            if (r10 != r0) goto L8e
        L8c:
            r3 = r0
            goto L93
        L8e:
            h05 r10 = defpackage.h05.SHOW_DESCRIPTION
            r4.setValue(r10)
        L93:
            return r3
    }
}
