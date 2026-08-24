package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class al3 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

    public /* synthetic */ al3(me.magnum.melonds.ui.layouteditor.b r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.A
            jg7 r1 = defpackage.jg7.a
            me.magnum.melonds.ui.layouteditor.b r5 = r5.B
            switch(r0) {
                case 0: goto L25;
                case 1: goto L19;
                default: goto L9;
            }
        L9:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            me.magnum.melonds.ui.layouteditor.b.k(r5, r6, r7)
            return r1
        L19:
            px0 r6 = (defpackage.px0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            me.magnum.melonds.ui.layouteditor.b.j(r5, r6, r7)
            return r1
        L25:
            px0 r6 = (defpackage.px0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = r7 & 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L36
            r0 = r3
            goto L37
        L36:
            r0 = r4
        L37:
            r7 = r7 & r3
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L52
            al3 r7 = new al3
            r7.<init>(r5, r3)
            r5 = 1815524482(0x6c36b482, float:8.835077E26)
            zv0 r5 = defpackage.n16.I(r5, r7, r6)
            r7 = 48
            defpackage.bl2.e(r4, r5, r6, r7, r3)
            goto L55
        L52:
            r6.V()
        L55:
            return r1
    }
}
