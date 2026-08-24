package me.magnum.melonds.ui.shortcutsetup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ShortcutSetupActivity extends defpackage.sx2 {
    public static final /* synthetic */ int C0 = 0;
    public final defpackage.uo7 B0;

    public ShortcutSetupActivity() {
            r6 = this;
            r0 = 4
            r6.<init>(r0)
            ih6 r0 = new ih6
            r1 = 0
            r0.<init>(r6, r1)
            uo7 r1 = new uo7
            java.lang.Class<tz5> r2 = defpackage.tz5.class
            ar0 r2 = defpackage.gh5.a(r2)
            ih6 r3 = new ih6
            r4 = 1
            r3.<init>(r6, r4)
            ih6 r4 = new ih6
            r5 = 2
            r4.<init>(r6, r5)
            r1.<init>(r2, r3, r0, r4)
            r6.B0 = r1
            return
    }

    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r7) {
            r6 = this;
            g57 r0 = defpackage.ht.a()
            int r0 = r0.getThemeResId()
            r6.setTheme(r0)
            ix6 r0 = new ix6
            r76 r1 = new r76
            r2 = 18
            r1.<init>(r2)
            r2 = 0
            r3 = 2
            r0.<init>(r2, r2, r3, r1)
            defpackage.tr1.a(r6, r0)
            super.onCreate(r7)
            android.view.LayoutInflater r0 = r6.getLayoutInflater()
            r1 = 2131623967(0x7f0e001f, float:1.88751E38)
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r1 = 2131427668(0x7f0b0154, float:1.8476959E38)
            android.view.View r2 = defpackage.gi2.B(r0, r1)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            if (r2 == 0) goto Lc6
            r1 = 2131428016(0x7f0b02b0, float:1.8477665E38)
            android.view.View r3 = defpackage.gi2.B(r0, r1)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            if (r3 == 0) goto Lc6
            r1 = 2131428072(0x7f0b02e8, float:1.8477778E38)
            android.view.View r4 = defpackage.gi2.B(r0, r1)
            if (r4 == 0) goto Lc6
            bt r1 = new bt
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r1.<init>(r0, r2, r3, r4)
            r6.setContentView(r0)
            r6.y(r3)
            bh5 r3 = new bh5
            r3.<init>()
            r4 = -1
            r3.A = r4
            pk0 r4 = new pk0
            r5 = 7
            r4.<init>(r5, r3, r1)
            java.util.WeakHashMap r1 = defpackage.ao7.a
            defpackage.sn7.c(r0, r4)
            java.lang.String r0 = "rom_list"
            if (r7 != 0) goto Lae
            me.magnum.melonds.ui.romlist.a$a r7 = me.magnum.melonds.ui.romlist.a.EnumC0004a.ENABLE_ALL
            r7.getClass()
            me.magnum.melonds.ui.romlist.a r1 = new me.magnum.melonds.ui.romlist.a
            r1.<init>()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            vr4 r4 = new vr4
            java.lang.String r5 = "allow_rom_configuration"
            r4.<init>(r5, r3)
            java.lang.String r7 = r7.toString()
            vr4 r3 = new vr4
            java.lang.String r5 = "rom_enable_criteria"
            r3.<init>(r5, r7)
            vr4[] r7 = new defpackage.vr4[]{r4, r3}
            android.os.Bundle r7 = defpackage.jw2.l(r7)
            r1.setArguments(r7)
            ll2 r7 = r6.t()
            r7.getClass()
            androidx.fragment.app.a r3 = new androidx.fragment.app.a
            r3.<init>(r7)
            int r7 = r2.getId()
            r3.e(r7, r1, r0)
            r3.h()
            goto Lbc
        Lae:
            ll2 r7 = r6.t()
            androidx.fragment.app.o r7 = r7.D(r0)
            r7.getClass()
            r1 = r7
            me.magnum.melonds.ui.romlist.a r1 = (me.magnum.melonds.ui.romlist.a) r1
        Lbc:
            ro5 r7 = new ro5
            r0 = 11
            r7.<init>(r6, r0)
            r1.e0 = r7
            return
        Lc6:
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r6 = r6.getResourceName(r1)
            java.lang.String r7 = "Missing required view with ID: "
            java.lang.String r6 = r7.concat(r6)
            defpackage.u34.x(r6)
            return
    }
}
