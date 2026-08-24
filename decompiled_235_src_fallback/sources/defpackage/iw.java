package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iw implements defpackage.ne2, defpackage.no2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ iw(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r8, defpackage.r41 r9) {
            r7 = this;
            int r9 = r7.A
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r7 = r7.B
            switch(r9) {
                case 0: goto L96;
                default: goto L9;
            }
        L9:
            mz1 r8 = (defpackage.mz1) r8
            me.magnum.melonds.ui.emulator.EmulatorActivity r7 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r7
            int r9 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            long r1 = r8.b
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r3 = 1
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 >= 0) goto L1b
            r1 = r3
        L1b:
            r3 = 60
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 < 0) goto L3b
            long r5 = r1 / r3
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            long r1 = r1 % r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r1}
            r1 = 2131952640(0x7f130400, float:1.9541728E38)
            java.lang.String r9 = r7.getString(r1, r9)
            r9.getClass()
            goto L4d
        L3b:
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            r1 = 2131952641(0x7f130401, float:1.954173E38)
            java.lang.String r9 = r7.getString(r1, r9)
            r9.getClass()
        L4d:
            boolean r1 = r8.c
            if (r1 == 0) goto L55
            r1 = 2131952644(0x7f130404, float:1.9541737E38)
            goto L58
        L55:
            r1 = 2131952643(0x7f130403, float:1.9541735E38)
        L58:
            java.lang.String r2 = r8.a
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9}
            java.lang.String r9 = r7.getString(r1, r9)
            r9.getClass()
            zb r1 = new zb
            r1.<init>(r7)
            r7 = 2131952646(0x7f130406, float:1.954174E38)
            r1.z(r7)
            java.lang.Object r7 = r1.L
            wb r7 = (defpackage.wb) r7
            r7.f = r9
            r9 = 0
            r7.m = r9
            fv1 r7 = new fv1
            r7.<init>(r8, r9)
            r9 = 2131952642(0x7f130402, float:1.9541733E38)
            r1.y(r9, r7)
            fv1 r7 = new fv1
            r9 = 1
            r7.<init>(r8, r9)
            r8 = 2131952645(0x7f130405, float:1.9541739E38)
            r1.x(r8, r7)
            r1.B()
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            return r0
        L96:
            hw r8 = (defpackage.hw) r8
            lw r7 = (defpackage.lw) r7
            r7.k(r8)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            return r0
    }

    @Override // defpackage.no2
    public final defpackage.ao2 b() {
            r9 = this;
            int r0 = r9.A
            java.lang.Object r9 = r9.B
            switch(r0) {
                case 0: goto L18;
                default: goto L7;
            }
        L7:
            u9 r1 = new u9
            r5 = r9
            me.magnum.melonds.ui.emulator.EmulatorActivity r5 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r5
            java.lang.String r7 = "showHeavyShaderCompileDialog(Lme/magnum/melonds/ui/emulator/EmulatorViewModel$HeavyShaderCompileRequest;)V"
            r3 = 4
            r2 = 2
            java.lang.Class<me.magnum.melonds.ui.emulator.EmulatorActivity> r4 = me.magnum.melonds.ui.emulator.EmulatorActivity.class
            java.lang.String r6 = "showHeavyShaderCompileDialog"
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L18:
            u9 r2 = new u9
            r6 = r9
            lw r6 = (defpackage.lw) r6
            java.lang.String r8 = "updateState(Lcoil/compose/AsyncImagePainter$State;)V"
            r4 = 4
            r3 = 2
            java.lang.Class<lw> r5 = defpackage.lw.class
            java.lang.String r7 = "updateState"
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            r1 = 0
            switch(r0) {
                case 0: goto L1d;
                default: goto L6;
            }
        L6:
            boolean r0 = r3 instanceof defpackage.ne2
            if (r0 == 0) goto L1c
            boolean r0 = r3 instanceof defpackage.no2
            if (r0 == 0) goto L1c
            ao2 r2 = r2.b()
            no2 r3 = (defpackage.no2) r3
            ao2 r3 = r3.b()
            boolean r1 = r2.equals(r3)
        L1c:
            return r1
        L1d:
            boolean r0 = r3 instanceof defpackage.ne2
            if (r0 == 0) goto L33
            boolean r0 = r3 instanceof defpackage.no2
            if (r0 == 0) goto L33
            ao2 r2 = r2.b()
            no2 r3 = (defpackage.no2) r3
            ao2 r3 = r3.b()
            boolean r1 = r2.equals(r3)
        L33:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            ao2 r1 = r1.b()
            int r1 = r1.hashCode()
            return r1
        Le:
            ao2 r1 = r1.b()
            int r1 = r1.hashCode()
            return r1
    }
}
