package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fr5  reason: default package */
/* loaded from: classes.dex */
public final class fr5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.qn2 Y;
    public final /* synthetic */ defpackage.pq5 Z;
    public final /* synthetic */ defpackage.qa4 d0;

    public /* synthetic */ fr5(defpackage.qn2 r1, defpackage.pq5 r2, defpackage.qa4 r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
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
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            fr5 r2 = (defpackage.fr5) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            fr5 r2 = (defpackage.fr5) r2
            r2.s(r1)
            return r1
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
            fr5 r0 = new fr5
            qa4 r3 = r7.d0
            r5 = 1
            qn2 r1 = r7.Y
            pq5 r2 = r7.Z
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r8
            fr5 r1 = new fr5
            r5 = r4
            qa4 r4 = r7.d0
            r6 = 0
            qn2 r2 = r7.Y
            pq5 r3 = r7.Z
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.X
            jg7 r1 = defpackage.jg7.a
            pq5 r2 = r4.Z
            qn2 r3 = r4.Y
            qa4 r4 = r4.d0
            switch(r0) {
                case 0: goto L22;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            r3.g(r2)
        L21:
            return r1
        L22:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L36
            r3.g(r2)
        L36:
            return r1
    }
}
