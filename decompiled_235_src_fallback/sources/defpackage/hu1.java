package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hu1 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.emulator.EmulatorActivity B;
    public final /* synthetic */ defpackage.pv1 L;

    public /* synthetic */ hu1(me.magnum.melonds.ui.emulator.EmulatorActivity r1, defpackage.pv1 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.A
            jg7 r1 = defpackage.jg7.a
            pv1 r2 = r10.L
            me.magnum.melonds.ui.emulator.EmulatorActivity r10 = r10.B
            switch(r0) {
                case 0: goto L73;
                case 1: goto L62;
                case 2: goto L51;
                case 3: goto L41;
                default: goto Lb;
            }
        Lb:
            r7 = r11
            c46 r7 = (defpackage.c46) r7
            int r11 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.getClass()
            sz1 r5 = r10.W()
            hu1 r4 = new hu1
            r11 = 0
            r4.<init>(r10, r2, r11)
            r5.getClass()
            tp6 r10 = r5.p0
            java.lang.Object r10 = r10.getValue()
            boolean r11 = r10 instanceof defpackage.dy1
            r0 = 0
            if (r11 == 0) goto L2f
            dy1 r10 = (defpackage.dy1) r10
            r6 = r10
            goto L30
        L2f:
            r6 = r0
        L30:
            if (r6 == 0) goto L40
            o41 r10 = r5.z
            l5 r3 = new l5
            r8 = 0
            r9 = 8
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11 = 3
            defpackage.hv.L(r10, r0, r0, r3, r11)
        L40:
            return r1
        L41:
            c46 r11 = (defpackage.c46) r11
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r11.getClass()
            r10.Q()
            qn2 r10 = r2.c
            r10.g(r11)
            return r1
        L51:
            java.util.List r11 = (java.util.List) r11
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r11.getClass()
            vs4 r10 = r10.N1
            pv1 r11 = defpackage.pv1.a(r2, r11)
            r10.setValue(r11)
            return r1
        L62:
            java.util.List r11 = (java.util.List) r11
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r11.getClass()
            vs4 r10 = r10.N1
            pv1 r11 = defpackage.pv1.a(r2, r11)
            r10.setValue(r11)
            return r1
        L73:
            java.util.List r11 = (java.util.List) r11
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r11.getClass()
            vs4 r10 = r10.N1
            pv1 r11 = defpackage.pv1.a(r2, r11)
            r10.setValue(r11)
            return r1
    }
}
