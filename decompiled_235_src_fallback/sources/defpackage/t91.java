package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t91  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t91 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ android.content.Context B;
    public final /* synthetic */ defpackage.j04 L;

    public /* synthetic */ t91(android.content.Context r1, defpackage.j04 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r6 = this;
            int r0 = r6.A
            java.lang.String r1 = "custom_firmware_entry_point"
            java.lang.String r2 = "entry_point"
            java.lang.Class<me.magnum.melonds.ui.settings.SettingsActivity> r3 = me.magnum.melonds.ui.settings.SettingsActivity.class
            jg7 r4 = defpackage.jg7.a
            j04 r5 = r6.L
            android.content.Context r6 = r6.B
            switch(r0) {
                case 0: goto L28;
                case 1: goto L1c;
                default: goto L11;
            }
        L11:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.layouteditor.LayoutEditorActivity> r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.class
            r0.<init>(r6, r1)
            r5.a(r0)
            return r4
        L1c:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6, r3)
            r0.putExtra(r2, r1)
            r5.a(r0)
            return r4
        L28:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6, r3)
            r0.putExtra(r2, r1)
            r5.a(r0)
            return r4
    }
}
