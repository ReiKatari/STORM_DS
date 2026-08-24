package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez6  reason: default package */
/* loaded from: classes.dex */
public final class ez6 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.fo2 Z;
    public final /* synthetic */ defpackage.j25 d0;
    public final /* synthetic */ defpackage.vy4 e0;

    public /* synthetic */ ez6(defpackage.fo2 r1, defpackage.j25 r2, defpackage.vy4 r3, defpackage.r41 r4, int r5) {
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
            ez6 r2 = (defpackage.ez6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ez6 r2 = (defpackage.ez6) r2
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
            ez6 r0 = new ez6
            vy4 r3 = r7.e0
            r5 = 1
            fo2 r1 = r7.Z
            j25 r2 = r7.d0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r8
            ez6 r1 = new ez6
            r5 = r4
            vy4 r4 = r7.e0
            r6 = 0
            fo2 r2 = r7.Z
            j25 r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            jg7 r1 = defpackage.jg7.a
            vy4 r2 = r9.e0
            j25 r3 = r9.d0
            fo2 r4 = r9.Z
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            switch(r0) {
                case 0: goto L36;
                default: goto L11;
            }
        L11:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L22
            if (r8 != r7) goto L1d
            defpackage.oi2.Y(r10)
            goto L35
        L1d:
            defpackage.i.m(r6)
            r1 = r5
            goto L35
        L22:
            defpackage.oi2.Y(r10)
            long r5 = r2.c
            jk4 r10 = new jk4
            r10.<init>(r5)
            r9.Y = r7
            java.lang.Object r9 = r4.e(r3, r10, r9)
            if (r9 != r0) goto L35
            r1 = r0
        L35:
            return r1
        L36:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L47
            if (r8 != r7) goto L42
            defpackage.oi2.Y(r10)
            goto L5a
        L42:
            defpackage.i.m(r6)
            r1 = r5
            goto L5a
        L47:
            defpackage.oi2.Y(r10)
            long r5 = r2.c
            jk4 r10 = new jk4
            r10.<init>(r5)
            r9.Y = r7
            java.lang.Object r9 = r4.e(r3, r10, r9)
            if (r9 != r0) goto L5a
            r1 = r0
        L5a:
            return r1
    }
}
