package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq4  reason: default package */
/* loaded from: classes.dex */
public final class yq4 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.ue1 Z;

    public /* synthetic */ yq4(defpackage.ue1 r1, defpackage.r41 r2, int r3) {
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
            yq4 r2 = (defpackage.yq4) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            yq4 r2 = (defpackage.yq4) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            yq4 r2 = (defpackage.yq4) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            ue1 r1 = r1.Z
            switch(r3) {
                case 0: goto L15;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            yq4 r3 = new yq4
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            yq4 r3 = new yq4
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            yq4 r3 = new yq4
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            ue1 r1 = r7.Z
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            jg7 r4 = defpackage.jg7.a
            r5 = 0
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L39;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L1e
            if (r6 != r3) goto L19
            defpackage.oi2.Y(r8)
            goto L38
        L19:
            defpackage.i.m(r2)
            r4 = r5
            goto L38
        L1e:
            defpackage.oi2.Y(r8)
            r7.Y = r3
            xa4 r8 = defpackage.xa4.Default
            wg r2 = new wg
            r3 = 2
            r6 = 9
            r2.<init>(r3, r5, r6)
            java.lang.Object r7 = defpackage.nr4.s(r1, r8, r2, r7)
            if (r7 != r0) goto L34
            goto L35
        L34:
            r7 = r4
        L35:
            if (r7 != r0) goto L38
            r4 = r0
        L38:
            return r4
        L39:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L4a
            if (r6 != r3) goto L45
            defpackage.oi2.Y(r8)
            goto L6c
        L45:
            defpackage.i.m(r2)
            r4 = r5
            goto L6c
        L4a:
            defpackage.oi2.Y(r8)
            r7.Y = r3
            or4 r8 = defpackage.pr4.a
            int r8 = r1.k()
            int r8 = r8 + r3
            int r2 = r1.n()
            if (r8 >= r2) goto L68
            int r8 = r1.k()
            int r8 = r8 + r3
            java.lang.Object r7 = defpackage.nr4.g(r1, r8, r7)
            if (r7 != r0) goto L68
            goto L69
        L68:
            r7 = r4
        L69:
            if (r7 != r0) goto L6c
            r4 = r0
        L6c:
            return r4
        L6d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L7e
            if (r6 != r3) goto L79
            defpackage.oi2.Y(r8)
            goto L9c
        L79:
            defpackage.i.m(r2)
            r4 = r5
            goto L9c
        L7e:
            defpackage.oi2.Y(r8)
            r7.Y = r3
            or4 r8 = defpackage.pr4.a
            int r8 = r1.k()
            int r8 = r8 - r3
            if (r8 < 0) goto L98
            int r8 = r1.k()
            int r8 = r8 - r3
            java.lang.Object r7 = defpackage.nr4.g(r1, r8, r7)
            if (r7 != r0) goto L98
            goto L99
        L98:
            r7 = r4
        L99:
            if (r7 != r0) goto L9c
            r4 = r0
        L9c:
            return r4
    }
}
