package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul3  reason: default package */
/* loaded from: classes.dex */
public final class ul3 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.yl3 Z;
    public final /* synthetic */ java.util.UUID d0;
    public final /* synthetic */ me.magnum.melonds.domain.model.layout.BackgroundMode e0;

    public /* synthetic */ ul3(defpackage.yl3 r1, java.util.UUID r2, me.magnum.melonds.domain.model.layout.BackgroundMode r3, defpackage.r41 r4, int r5) {
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
            ul3 r2 = (defpackage.ul3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ul3 r2 = (defpackage.ul3) r2
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
            ul3 r0 = new ul3
            me.magnum.melonds.domain.model.layout.BackgroundMode r3 = r7.e0
            r5 = 1
            yl3 r1 = r7.Z
            java.util.UUID r2 = r7.d0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r8
            ul3 r1 = new ul3
            r5 = r4
            me.magnum.melonds.domain.model.layout.BackgroundMode r4 = r7.e0
            r6 = 0
            yl3 r2 = r7.Z
            java.util.UUID r3 = r7.d0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            jg7 r1 = defpackage.jg7.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r2 = r9.e0
            java.util.UUID r3 = r9.d0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            yl3 r6 = r9.Z
            r7 = 0
            switch(r0) {
                case 0: goto L41;
                default: goto L11;
            }
        L11:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L22
            if (r8 != r5) goto L1d
            defpackage.oi2.Y(r10)
            goto L31
        L1d:
            defpackage.i.m(r4)
            r1 = r7
            goto L40
        L22:
            defpackage.oi2.Y(r10)
            ha3 r10 = r6.c
            r9.Y = r5
            java.lang.Object r10 = r10.c(r3, r9)
            if (r10 != r0) goto L31
            r1 = r0
            goto L40
        L31:
            n00 r10 = (defpackage.n00) r10
            tp6 r9 = r6.m
            t26 r0 = new t26
            r0.<init>(r10, r2)
            r9.getClass()
            r9.m(r7, r0)
        L40:
            return r1
        L41:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L52
            if (r8 != r5) goto L4d
            defpackage.oi2.Y(r10)
            goto L61
        L4d:
            defpackage.i.m(r4)
            r1 = r7
            goto L70
        L52:
            defpackage.oi2.Y(r10)
            ha3 r10 = r6.c
            r9.Y = r5
            java.lang.Object r10 = r10.c(r3, r9)
            if (r10 != r0) goto L61
            r1 = r0
            goto L70
        L61:
            n00 r10 = (defpackage.n00) r10
            tp6 r9 = r6.k
            t26 r0 = new t26
            r0.<init>(r10, r2)
            r9.getClass()
            r9.m(r7, r0)
        L70:
            return r1
    }
}
