package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ju1 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.o6 B;

    public /* synthetic */ ju1(defpackage.o6 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    public /* synthetic */ ju1(defpackage.o6 r1, int r2) {
            r0 = this;
            r2 = 1
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.A
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            o6 r5 = r5.B
            px0 r6 = (defpackage.px0) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            switch(r0) {
                case 0: goto L19;
                default: goto Le;
            }
        Le:
            r7.getClass()
            int r7 = defpackage.ii2.a0(r2)
            defpackage.g04.j(r5, r6, r7)
            return r1
        L19:
            int r7 = r7.intValue()
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0 = r7 & 3
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r4
        L28:
            r7 = r7 & r2
            xq2 r6 = (defpackage.xq2) r6
            boolean r7 = r6.S(r7, r0)
            if (r7 == 0) goto L35
            defpackage.g04.j(r5, r6, r4)
            goto L38
        L35:
            r6.V()
        L38:
            return r1
    }
}
