package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z82  reason: default package */
/* loaded from: classes.dex */
public final class z82 extends android.app.Presentation {
    public final me.magnum.melonds.ui.layouteditor.b A;

    public z82(defpackage.sw4 r4, me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r5, android.view.Display r6, defpackage.jl3 r7, defpackage.u66 r8) {
            r3 = this;
            r7.getClass()
            r3.<init>(r5, r6)
            me.magnum.melonds.ui.layouteditor.b r6 = new me.magnum.melonds.ui.layouteditor.b
            sn3 r0 = defpackage.sn3.SECONDARY_SCREEN
            y82 r1 = new y82
            android.content.Context r2 = r3.getContext()
            r2.getClass()
            r1.<init>(r5, r2)
            r6.<init>(r0, r4, r8, r1)
            r3.A = r6
            r4 = 0
            r3.setCancelable(r4)
            r8 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r6.setTag(r8, r5)
            r8 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r6.setTag(r8, r5)
            r8 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r6.setTag(r8, r5)
            r6.setListener(r7)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setBackgroundColor(r5)
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r5 = r6.getLayoutEditorView()
            wb1 r7 = new wb1
            r8 = 1
            r7.<init>(r8, r4)
            r5.setLayoutComponentViewBuilderFactory(r7)
            r3.setContentView(r6)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L5c
            android.window.OnBackInvokedDispatcher r4 = defpackage.a81.j(r3)
            vp r5 = new vp
            r6 = 2
            r5.<init>(r3, r6)
            defpackage.a81.p(r4, r5)
        L5c:
            return
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r0 = this;
            me.magnum.melonds.ui.layouteditor.b r0 = r0.A
            r0.s()
            return
    }
}
