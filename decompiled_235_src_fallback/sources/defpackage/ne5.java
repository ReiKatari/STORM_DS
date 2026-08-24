package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ne5  reason: default package */
/* loaded from: classes.dex */
public final class ne5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.pe5 Z;
    public final /* synthetic */ defpackage.z23 d0;

    public /* synthetic */ ne5(defpackage.pe5 r1, defpackage.z23 r2, defpackage.r41 r3, int r4) {
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
            ne5 r2 = (defpackage.ne5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ne5 r2 = (defpackage.ne5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            z23 r0 = r2.d0
            pe5 r2 = r2.Z
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            ne5 r4 = new ne5
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            ne5 r4 = new ne5
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            z23 r1 = r7.d0
            pe5 r2 = r7.Z
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            switch(r0) {
                case 0: goto L2b;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L1e
            if (r6 != r5) goto L19
            defpackage.oi2.Y(r8)
            goto L2a
        L19:
            defpackage.i.m(r4)
            r8 = r3
            goto L2a
        L1e:
            defpackage.oi2.Y(r8)
            r7.Y = r5
            java.lang.Object r8 = defpackage.pe5.a(r2, r1, r5, r7)
            if (r8 != r0) goto L2a
            r8 = r0
        L2a:
            return r8
        L2b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r7.Y
            if (r6 == 0) goto L3b
            if (r6 != r5) goto L37
            defpackage.oi2.Y(r8)
            goto L49
        L37:
            defpackage.i.m(r4)
            goto L4d
        L3b:
            defpackage.oi2.Y(r8)
            r7.Y = r5
            r8 = 0
            java.lang.Object r8 = defpackage.pe5.a(r2, r1, r8, r7)
            if (r8 != r0) goto L49
            r3 = r0
            goto L4d
        L49:
            r7 = r8
            a33 r7 = (defpackage.a33) r7
            r3 = r8
        L4d:
            return r3
    }
}
