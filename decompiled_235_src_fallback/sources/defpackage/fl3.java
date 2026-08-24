package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fl3  reason: default package */
/* loaded from: classes.dex */
public final class fl3 implements android.widget.SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b b;
    public final /* synthetic */ android.content.ContextWrapper c;

    public /* synthetic */ fl3(me.magnum.melonds.ui.layouteditor.b r1, android.content.ContextWrapper r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r8, int r9, boolean r10) {
            r7 = this;
            int r0 = r7.a
            r1 = 0
            android.content.ContextWrapper r2 = r7.c
            r3 = 1120403456(0x42c80000, float:100.0)
            java.lang.String r4 = "%"
            me.magnum.melonds.ui.layouteditor.b r7 = r7.b
            r5 = 0
            r8.getClass()
            switch(r0) {
                case 0: goto L75;
                default: goto L12;
            }
        L12:
            nb1 r8 = r7.L
            java.lang.Object r0 = r8.v
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r0.setText(r4)
            if (r10 == 0) goto L74
            java.lang.Object r10 = r8.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r10 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r10
            nj3 r10 = r10.getSelectedComponent()
            nj3 r0 = defpackage.nj3.BUTTONS
            if (r10 != r0) goto L74
            float r9 = (float) r9
            float r9 = r9 / r3
            java.lang.Object r8 = r8.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r8 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r8
            zj3 r8 = r8.d(r10)
            if (r8 == 0) goto L47
            android.view.View r8 = r8.a
            goto L48
        L47:
            r8 = r5
        L48:
            boolean r10 = r8 instanceof defpackage.s64
            if (r10 == 0) goto L4f
            r5 = r8
            s64 r5 = (defpackage.s64) r5
        L4f:
            if (r5 == 0) goto L54
            r5.setButtonInnerScale(r9)
        L54:
            java.lang.String r8 = defpackage.v15.b(r2)
            android.content.SharedPreferences r8 = r2.getSharedPreferences(r8, r1)
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r10 = "pref_button_cluster_inner_scale"
            android.content.SharedPreferences$Editor r8 = r8.putFloat(r10, r9)
            r8.apply()
            jl3 r7 = r7.getListener()
            if (r7 == 0) goto L74
            s63 r7 = (defpackage.s63) r7
            r7.x()
        L74:
            return
        L75:
            nb1 r8 = r7.L
            java.lang.Object r0 = r8.y
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r0.setText(r4)
            if (r10 == 0) goto Ld7
            java.lang.Object r10 = r8.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r10 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r10
            nj3 r10 = r10.getSelectedComponent()
            nj3 r0 = defpackage.nj3.BUTTONS
            if (r10 != r0) goto Ld7
            float r9 = (float) r9
            float r9 = r9 / r3
            java.lang.Object r8 = r8.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r8 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r8
            zj3 r8 = r8.d(r10)
            if (r8 == 0) goto Laa
            android.view.View r8 = r8.a
            goto Lab
        Laa:
            r8 = r5
        Lab:
            boolean r10 = r8 instanceof defpackage.s64
            if (r10 == 0) goto Lb2
            r5 = r8
            s64 r5 = (defpackage.s64) r5
        Lb2:
            if (r5 == 0) goto Lb7
            r5.setButtonSpread(r9)
        Lb7:
            java.lang.String r8 = defpackage.v15.b(r2)
            android.content.SharedPreferences r8 = r2.getSharedPreferences(r8, r1)
            android.content.SharedPreferences$Editor r8 = r8.edit()
            java.lang.String r10 = "pref_button_cluster_spread"
            android.content.SharedPreferences$Editor r8 = r8.putFloat(r10, r9)
            r8.apply()
            jl3 r7 = r7.getListener()
            if (r7 == 0) goto Ld7
            s63 r7 = (defpackage.s63) r7
            r7.x()
        Ld7:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            int r0 = r0.a
            r1.getClass()
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            int r0 = r0.a
            r1.getClass()
            return
    }
}
