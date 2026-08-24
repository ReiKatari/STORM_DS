package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tf4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tf4 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ defpackage.wf4 R;
    public final /* synthetic */ android.content.pm.ApplicationInfo X;

    public /* synthetic */ tf4(boolean r1, boolean r2, defpackage.wf4 r3, android.content.pm.ApplicationInfo r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.A
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            r3 = 2
            r4 = 1
            px0 r12 = (defpackage.px0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            switch(r0) {
                case 0: goto L75;
                default: goto L12;
            }
        L12:
            java.util.List r0 = defpackage.wf4.d0
            r0 = r13 & 3
            if (r0 == r3) goto L19
            r2 = r4
        L19:
            r13 = r13 & r4
            r7 = r12
            xq2 r7 = (defpackage.xq2) r7
            boolean r12 = r7.S(r13, r2)
            if (r12 == 0) goto L71
            wf4 r12 = r11.R
            boolean r13 = r7.h(r12)
            java.lang.Object r0 = r7.P()
            vs0 r2 = defpackage.ox0.a
            if (r13 != 0) goto L33
            if (r0 != r2) goto L3d
        L33:
            er2 r0 = new er2
            r13 = 10
            r0.<init>(r12, r13)
            r7.l0(r0)
        L3d:
            r5 = r0
            on2 r5 = (defpackage.on2) r5
            boolean r3 = r11.B
            boolean r13 = r7.g(r3)
            android.content.pm.ApplicationInfo r0 = r11.X
            boolean r4 = r7.h(r0)
            r13 = r13 | r4
            boolean r4 = r7.h(r12)
            r13 = r13 | r4
            boolean r4 = r11.L
            boolean r11 = r7.g(r4)
            r11 = r11 | r13
            java.lang.Object r13 = r7.P()
            if (r11 != 0) goto L61
            if (r13 != r2) goto L69
        L61:
            uf4 r13 = new uf4
            r13.<init>(r3, r0, r12, r4)
            r7.l0(r13)
        L69:
            r6 = r13
            on2 r6 = (defpackage.on2) r6
            r8 = 0
            defpackage.f04.j(r3, r4, r5, r6, r7, r8)
            goto L74
        L71:
            r7.V()
        L74:
            return r1
        L75:
            java.util.List r0 = defpackage.wf4.d0
            r0 = r13 & 3
            if (r0 == r3) goto L7d
            r0 = r4
            goto L7e
        L7d:
            r0 = r2
        L7e:
            r13 = r13 & r4
            xq2 r12 = (defpackage.xq2) r12
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto La2
            tf4 r5 = new tf4
            r10 = 1
            boolean r6 = r11.B
            boolean r7 = r11.L
            wf4 r8 = r11.R
            android.content.pm.ApplicationInfo r9 = r11.X
            r5.<init>(r6, r7, r8, r9, r10)
            r11 = -131556235(0xfffffffff8289c75, float:-1.3679362E34)
            zv0 r11 = defpackage.n16.I(r11, r5, r12)
            r13 = 48
            defpackage.bl2.e(r2, r11, r12, r13, r4)
            goto La5
        La2:
            r12.V()
        La5:
            return r1
    }
}
