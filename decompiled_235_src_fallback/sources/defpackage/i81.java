package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i81  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i81 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment B;
    public final /* synthetic */ android.app.ProgressDialog L;

    public /* synthetic */ i81(me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r1, android.app.ProgressDialog r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            jg7 r1 = defpackage.jg7.a
            android.app.ProgressDialog r2 = r4.L
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r4 = r4.B
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            switch(r0) {
                case 0: goto L21;
                default: goto L11;
            }
        L11:
            androidx.fragment.app.p r4 = r4.getActivity()
            if (r4 == 0) goto L20
            j81 r0 = new j81
            r3 = 1
            r0.<init>(r2, r5, r3)
            r4.runOnUiThread(r0)
        L20:
            return r1
        L21:
            androidx.fragment.app.p r4 = r4.getActivity()
            if (r4 == 0) goto L30
            j81 r0 = new j81
            r3 = 0
            r0.<init>(r2, r5, r3)
            r4.runOnUiThread(r0)
        L30:
            return r1
    }
}
