package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg2  reason: default package */
/* loaded from: classes.dex */
public final class vg2 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.r94 Z;
    public final /* synthetic */ defpackage.qa4 d0;

    public /* synthetic */ vg2(defpackage.r94 r1, defpackage.qa4 r2, defpackage.r41 r3, int r4) {
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
            vg2 r2 = (defpackage.vg2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            vg2 r2 = (defpackage.vg2) r2
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
            vg2 r4 = new vg2
            qa4 r0 = r2.d0
            r1 = 1
            r94 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            vg2 r4 = new vg2
            qa4 r0 = r2.d0
            r1 = 0
            r94 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            qa4 r2 = r8.d0
            r94 r3 = r8.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L3c;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r9)
            goto L3b
        L1b:
            defpackage.i.m(r5)
            r1 = r4
            goto L3b
        L20:
            defpackage.oi2.Y(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            of6 r3 = r3.a
            ug2 r4 = new ug2
            r4.<init>(r9, r2, r6)
            r8.Y = r6
            r3.getClass()
            x61 r8 = defpackage.of6.m(r3, r4, r8)
            if (r8 != r0) goto L3b
            r1 = r0
        L3b:
            return r1
        L3c:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L4d
            if (r7 != r6) goto L48
            defpackage.oi2.Y(r9)
            goto L69
        L48:
            defpackage.i.m(r5)
            r1 = r4
            goto L69
        L4d:
            defpackage.oi2.Y(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            of6 r3 = r3.a
            ug2 r4 = new ug2
            r5 = 0
            r4.<init>(r9, r2, r5)
            r8.Y = r6
            r3.getClass()
            x61 r8 = defpackage.of6.m(r3, r4, r8)
            if (r8 != r0) goto L69
            r1 = r0
        L69:
            return r1
    }
}
