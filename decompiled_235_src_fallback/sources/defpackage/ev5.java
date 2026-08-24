package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev5  reason: default package */
/* loaded from: classes.dex */
public final class ev5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ me.magnum.melonds.ui.romdetails.RomDetailsActivity d0;
    public final /* synthetic */ defpackage.pq5 e0;
    public final /* synthetic */ android.net.Uri f0;

    public /* synthetic */ ev5(me.magnum.melonds.ui.romdetails.RomDetailsActivity r1, defpackage.pq5 r2, android.net.Uri r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.d0 = r1
            r0.e0 = r2
            r0.f0 = r3
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
            ev5 r2 = (defpackage.ev5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ev5 r2 = (defpackage.ev5) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.X
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            ev5 r1 = new ev5
            android.net.Uri r4 = r8.f0
            r6 = 1
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r2 = r8.d0
            pq5 r3 = r8.e0
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r1.Z = r10
            return r1
        L15:
            r5 = r9
            ev5 r2 = new ev5
            r6 = r5
            android.net.Uri r5 = r8.f0
            r7 = 0
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r3 = r8.d0
            pq5 r4 = r8.e0
            r2.<init>(r3, r4, r5, r6, r7)
            r2.Z = r10
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.X
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            jg7 r3 = defpackage.jg7.a
            r4 = 0
            switch(r0) {
                case 0: goto La3;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r12.Z
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r12.Y
            android.net.Uri r6 = r12.f0
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r7 = r12.d0
            if (r5 == 0) goto L28
            if (r5 != r2) goto L22
            defpackage.oi2.Y(r13)     // Catch: java.lang.Throwable -> L1f
            goto L42
        L1f:
            r0 = move-exception
            r13 = r0
            goto L48
        L22:
            defpackage.i.m(r1)
            r3 = r4
            goto La2
        L28:
            defpackage.oi2.Y(r13)
            xe1 r13 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L1f
            de1 r13 = defpackage.de1.L     // Catch: java.lang.Throwable -> L1f
            m5 r1 = new m5     // Catch: java.lang.Throwable -> L1f
            r5 = 27
            r1.<init>(r7, r6, r4, r5)     // Catch: java.lang.Throwable -> L1f
            r12.Z = r4     // Catch: java.lang.Throwable -> L1f
            r12.Y = r2     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r13 = defpackage.hv.d0(r13, r1, r12)     // Catch: java.lang.Throwable -> L1f
            if (r13 != r0) goto L42
            r3 = r0
            goto La2
        L42:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L1f
            r13.getClass()     // Catch: java.lang.Throwable -> L1f
            goto L4e
        L48:
            em5 r0 = new em5
            r0.<init>(r13)
            r13 = r0
        L4e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r13 instanceof defpackage.em5
            if (r1 == 0) goto L55
            r13 = r0
        L55:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L68
            r12 = 2131952559(0x7f1303af, float:1.9541564E38)
            android.widget.Toast r12 = android.widget.Toast.makeText(r7, r12, r2)
            r12.show()
            goto La2
        L68:
            zb r13 = new zb
            r13.<init>(r7)
            r0 = 2131952562(0x7f1303b2, float:1.954157E38)
            r13.z(r0)
            pq5 r12 = r12.e0
            jt5 r0 = r12.f
            java.lang.String r0 = r0.e
            if (r0 != 0) goto L7d
            java.lang.String r0 = r12.a
        L7d:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 2131952560(0x7f1303b0, float:1.9541566E38)
            java.lang.String r0 = r7.getString(r1, r0)
            java.lang.Object r1 = r13.L
            wb r1 = (defpackage.wb) r1
            r1.f = r0
            qu1 r0 = new qu1
            r1 = 4
            r0.<init>(r7, r12, r6, r1)
            r12 = 17039370(0x104000a, float:2.42446E-38)
            r13.y(r12, r0)
            r12 = 17039360(0x1040000, float:2.424457E-38)
            r13.x(r12, r4)
            r13.B()
        La2:
            return r3
        La3:
            java.lang.Object r0 = r12.Z
            w61 r0 = (defpackage.w61) r0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r12.Y
            me.magnum.melonds.ui.romdetails.RomDetailsActivity r7 = r12.d0
            if (r5 == 0) goto Lbd
            if (r5 != r2) goto Lb8
            defpackage.oi2.Y(r13)     // Catch: java.lang.Throwable -> Lb5
            goto Ldc
        Lb5:
            r0 = move-exception
            r12 = r0
            goto Lde
        Lb8:
            defpackage.i.m(r1)
            r3 = r4
            goto Lf5
        Lbd:
            defpackage.oi2.Y(r13)
            pq5 r8 = r12.e0
            android.net.Uri r9 = r12.f0
            xe1 r13 = defpackage.xk1.a     // Catch: java.lang.Throwable -> Lb5
            de1 r13 = defpackage.de1.L     // Catch: java.lang.Throwable -> Lb5
            ag r6 = new ag     // Catch: java.lang.Throwable -> Lb5
            r11 = 12
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb5
            r12.Z = r10     // Catch: java.lang.Throwable -> Lb5
            r12.Y = r2     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r12 = defpackage.hv.d0(r13, r6, r12)     // Catch: java.lang.Throwable -> Lb5
            if (r12 != r0) goto Ldc
            r3 = r0
            goto Lf5
        Ldc:
            r13 = r3
            goto Le3
        Lde:
            em5 r13 = new em5
            r13.<init>(r12)
        Le3:
            boolean r12 = r13 instanceof defpackage.em5
            if (r12 != 0) goto Leb
            r12 = 2131952561(0x7f1303b1, float:1.9541568E38)
            goto Lee
        Leb:
            r12 = 2131952558(0x7f1303ae, float:1.9541562E38)
        Lee:
            android.widget.Toast r12 = android.widget.Toast.makeText(r7, r12, r2)
            r12.show()
        Lf5:
            return r3
    }
}
