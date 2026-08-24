package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e0  reason: default package */
/* loaded from: classes.dex */
public final class e0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.r94 Z;
    public final /* synthetic */ defpackage.l25 d0;
    public final /* synthetic */ defpackage.h0 e0;

    public /* synthetic */ e0(defpackage.r94 r1, defpackage.l25 r2, defpackage.h0 r3, defpackage.r41 r4, int r5) {
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            e0 r2 = (defpackage.e0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            e0 r2 = (defpackage.e0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            e0 r0 = new e0
            h0 r3 = r7.e0
            r5 = 1
            r94 r1 = r7.Z
            l25 r2 = r7.d0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r8
            e0 r1 = new e0
            r5 = r4
            h0 r4 = r7.e0
            r6 = 0
            r94 r2 = r7.Z
            l25 r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r1 = defpackage.jg7.a
            h0 r2 = r10.e0
            r94 r3 = r10.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7 = 2
            l25 r8 = r10.d0
            switch(r0) {
                case 0: goto L44;
                default: goto L12;
            }
        L12:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r10.Y
            if (r9 == 0) goto L29
            if (r9 == r6) goto L25
            if (r9 != r7) goto L20
            defpackage.oi2.Y(r11)
            goto L41
        L20:
            defpackage.i.m(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.oi2.Y(r11)
            goto L37
        L29:
            defpackage.oi2.Y(r11)
            long r4 = defpackage.pr0.a
            r10.Y = r6
            java.lang.Object r11 = defpackage.q60.t(r4, r10)
            if (r11 != r0) goto L37
            goto L3f
        L37:
            r10.Y = r7
            java.lang.Object r10 = r3.a(r8, r10)
            if (r10 != r0) goto L41
        L3f:
            r1 = r0
            goto L43
        L41:
            r2.x0 = r8
        L43:
            return r1
        L44:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r10.Y
            if (r9 == 0) goto L5b
            if (r9 == r6) goto L57
            if (r9 != r7) goto L52
            defpackage.oi2.Y(r11)
            goto L73
        L52:
            defpackage.i.m(r5)
            r1 = r4
            goto L75
        L57:
            defpackage.oi2.Y(r11)
            goto L69
        L5b:
            defpackage.oi2.Y(r11)
            long r4 = defpackage.pr0.a
            r10.Y = r6
            java.lang.Object r11 = defpackage.q60.t(r4, r10)
            if (r11 != r0) goto L69
            goto L71
        L69:
            r10.Y = r7
            java.lang.Object r10 = r3.a(r8, r10)
            if (r10 != r0) goto L73
        L71:
            r1 = r0
            goto L75
        L73:
            r2.B0 = r8
        L75:
            return r1
    }
}
