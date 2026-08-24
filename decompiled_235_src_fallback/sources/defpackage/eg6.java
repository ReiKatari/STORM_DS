package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg6  reason: default package */
/* loaded from: classes.dex */
public final class eg6 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ defpackage.wf6 Y;
    public /* synthetic */ boolean Z;

    public /* synthetic */ eg6(int r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r3 = r3.X
            jg7 r0 = defpackage.jg7.a
            r1 = 3
            wf6 r4 = (defpackage.wf6) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            switch(r3) {
                case 0: goto L36;
                case 1: goto L21;
                default: goto Lc;
            }
        Lc:
            boolean r3 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            eg6 r5 = new eg6
            r2 = 2
            r5.<init>(r1, r6, r2)
            r5.Y = r4
            r5.Z = r3
            java.lang.Object r3 = r5.s(r0)
            return r3
        L21:
            boolean r3 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            eg6 r5 = new eg6
            r2 = 1
            r5.<init>(r1, r6, r2)
            r5.Y = r4
            r5.Z = r3
            java.lang.Object r3 = r5.s(r0)
            return r3
        L36:
            boolean r3 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            eg6 r5 = new eg6
            r2 = 0
            r5.<init>(r1, r6, r2)
            r5.Y = r4
            r5.Z = r3
            java.lang.Object r3 = r5.s(r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.X
            r1 = 0
            switch(r0) {
                case 0: goto L26;
                case 1: goto L16;
                default: goto L6;
            }
        L6:
            wf6 r0 = r3.Y
            boolean r3 = r3.Z
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            r4 = 127(0x7f, float:1.78E-43)
            wf6 r3 = defpackage.wf6.a(r0, r1, r1, r3, r4)
            return r3
        L16:
            wf6 r0 = r3.Y
            boolean r3 = r3.Z
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            r4 = 191(0xbf, float:2.68E-43)
            wf6 r3 = defpackage.wf6.a(r0, r1, r3, r1, r4)
            return r3
        L26:
            wf6 r0 = r3.Y
            boolean r3 = r3.Z
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            r4 = 223(0xdf, float:3.12E-43)
            wf6 r3 = defpackage.wf6.a(r0, r3, r1, r1, r4)
            return r3
    }
}
