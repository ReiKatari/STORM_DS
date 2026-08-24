package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment B;

    public /* synthetic */ k(me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            int r5 = r4.A
            r0 = 3
            r1 = 0
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment r4 = r4.B
            switch(r5) {
                case 0: goto L16;
                default: goto L9;
            }
        L9:
            au3 r5 = defpackage.bl2.C(r4)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1 r6 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$confirmShaderUninstall$1$1
            r6.<init>(r4, r1)
            defpackage.hv.L(r5, r1, r1, r6, r0)
            return
        L16:
            if (r6 == 0) goto L61
            r5 = 1
            if (r6 == r5) goto L5d
            r0 = 2
            if (r6 == r0) goto L1f
            goto L7c
        L1f:
            android.content.Context r6 = r4.requireContext()
            cp5 r0 = r4.p()
            long r2 = r0.f()
            java.lang.String r6 = android.text.format.Formatter.formatShortFileSize(r6, r2)
            zb r0 = new zb
            android.content.Context r2 = r4.requireContext()
            r0.<init>(r2)
            r2 = 2131952866(0x7f1304e2, float:1.9542187E38)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r6 = r4.getString(r2, r6)
            java.lang.Object r2 = r0.L
            wb r2 = (defpackage.wb) r2
            r2.f = r6
            me.magnum.melonds.ui.settings.fragments.k r6 = new me.magnum.melonds.ui.settings.fragments.k
            r6.<init>(r4, r5)
            r4 = 2131952865(0x7f1304e1, float:1.9542185E38)
            r0.y(r4, r6)
            r4 = 17039360(0x1040000, float:2.424457E-38)
            r0.x(r4, r1)
            r0.B()
            goto L7c
        L5d:
            r4.D()
            goto L7c
        L61:
            android.content.Context r5 = r4.requireContext()
            r6 = 2131952829(0x7f1304bd, float:1.9542112E38)
            r2 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
            au3 r5 = defpackage.bl2.C(r4)
            me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1 r6 = new me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$checkShaderUpdates$1
            r6.<init>(r4, r1)
            defpackage.hv.L(r5, r1, r1, r6, r0)
        L7c:
            return
    }
}
