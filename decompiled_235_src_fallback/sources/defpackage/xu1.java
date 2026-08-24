package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xu1 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ defpackage.nj5 L;

    public /* synthetic */ xu1(boolean r1, defpackage.nj5 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r2 = this;
            int r0 = r2.A
            nj5 r1 = r2.L
            boolean r2 = r2.B
            switch(r0) {
                case 0: goto L33;
                case 1: goto L25;
                case 2: goto L17;
                default: goto L9;
            }
        L9:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            if (r2 == 0) goto L10
            int r2 = r1.k
            goto L12
        L10:
            int r2 = r1.l
        L12:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L17:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            if (r2 == 0) goto L1e
            int r2 = r1.i
            goto L20
        L1e:
            int r2 = r1.j
        L20:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L25:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            if (r2 == 0) goto L2c
            int r2 = r1.g
            goto L2e
        L2c:
            int r2 = r1.h
        L2e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L33:
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            if (r2 == 0) goto L3a
            int r2 = r1.e
            goto L3c
        L3a:
            int r2 = r1.f
        L3c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }
}
