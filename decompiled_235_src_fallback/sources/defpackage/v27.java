package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v27  reason: default package */
/* loaded from: classes.dex */
public final class v27 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.qn2 Z;

    public /* synthetic */ v27(int r1, defpackage.r41 r2, defpackage.qn2 r3) {
            r0 = this;
            r0.X = r1
            r0.Z = r3
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
            v27 r2 = (defpackage.v27) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            v27 r2 = (defpackage.v27) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            qn2 r1 = r1.Z
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            v27 r3 = new v27
            r0 = 1
            r3.<init>(r0, r2, r1)
            return r3
        Le:
            v27 r3 = new v27
            r0 = 0
            r3.<init>(r0, r2, r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            qn2 r1 = r6.Z
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L29;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L1c
            if (r5 != r4) goto L17
            defpackage.oi2.Y(r7)
            goto L28
        L17:
            defpackage.i.m(r3)
            r7 = r2
            goto L28
        L1c:
            defpackage.oi2.Y(r7)
            r6.Y = r4
            java.lang.Object r7 = r1.g(r6)
            if (r7 != r0) goto L28
            r7 = r0
        L28:
            return r7
        L29:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L39
            if (r5 != r4) goto L35
            defpackage.oi2.Y(r7)
            goto L46
        L35:
            defpackage.i.m(r3)
            goto L48
        L39:
            defpackage.oi2.Y(r7)
            r6.Y = r4
            java.lang.Object r6 = r1.g(r6)
            if (r6 != r0) goto L46
            r2 = r0
            goto L48
        L46:
            jg7 r2 = defpackage.jg7.a
        L48:
            return r2
    }
}
