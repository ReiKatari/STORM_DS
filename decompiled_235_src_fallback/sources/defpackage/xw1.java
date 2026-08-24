package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xw1 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.s9 B;

    public /* synthetic */ xw1(defpackage.s9 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            int r4 = r3.A
            java.lang.String r5 = "custom_firmware_entry_point"
            java.lang.String r0 = "entry_point"
            java.lang.Class<me.magnum.melonds.ui.settings.SettingsActivity> r1 = me.magnum.melonds.ui.settings.SettingsActivity.class
            s9 r3 = r3.B
            switch(r4) {
                case 0: goto La9;
                case 1: goto L95;
                case 2: goto L8d;
                case 3: goto L7c;
                case 4: goto L74;
                case 5: goto L60;
                case 6: goto L41;
                case 7: goto L39;
                case 8: goto L26;
                case 9: goto L1e;
                default: goto Ld;
            }
        Ld:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Object r5 = r3.a
            jq r5 = (defpackage.jq) r5
            r4.<init>(r5, r1)
            java.lang.Object r3 = r3.d
            i9 r3 = (defpackage.i9) r3
            r3.a(r4)
            return
        L1e:
            java.lang.Object r3 = r3.b
            ax1 r3 = (defpackage.ax1) r3
            r3.d()
            return
        L26:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Object r5 = r3.a
            jq r5 = (defpackage.jq) r5
            java.lang.Class<me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity> r0 = me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity.class
            r4.<init>(r5, r0)
            java.lang.Object r3 = r3.e
            i9 r3 = (defpackage.i9) r3
            r3.a(r4)
            return
        L39:
            java.lang.Object r3 = r3.b
            ax1 r3 = (defpackage.ax1) r3
            r3.d()
            return
        L41:
            vw1 r3 = r3.A()
            kd6 r4 = r3.c
            ng6 r4 = (defpackage.ng6) r4
            android.content.SharedPreferences r4 = r4.b
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r5 = "bios_dir"
            r4.remove(r5)
            java.lang.String r5 = "dsi_bios_dir"
            r4.remove(r5)
            r4.apply()
            r3.e()
            return
        L60:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Object r2 = r3.a
            jq r2 = (defpackage.jq) r2
            r4.<init>(r2, r1)
            r4.putExtra(r0, r5)
            java.lang.Object r3 = r3.d
            i9 r3 = (defpackage.i9) r3
            r3.a(r4)
            return
        L74:
            java.lang.Object r3 = r3.b
            ax1 r3 = (defpackage.ax1) r3
            r3.d()
            return
        L7c:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Object r5 = r3.a
            jq r5 = (defpackage.jq) r5
            r4.<init>(r5, r1)
            java.lang.Object r3 = r3.d
            i9 r3 = (defpackage.i9) r3
            r3.a(r4)
            return
        L8d:
            java.lang.Object r3 = r3.b
            ax1 r3 = (defpackage.ax1) r3
            r3.d()
            return
        L95:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Object r2 = r3.a
            jq r2 = (defpackage.jq) r2
            r4.<init>(r2, r1)
            r4.putExtra(r0, r5)
            java.lang.Object r3 = r3.d
            i9 r3 = (defpackage.i9) r3
            r3.a(r4)
            return
        La9:
            java.lang.Object r3 = r3.b
            ax1 r3 = (defpackage.ax1) r3
            r3.d()
            return
    }
}
