package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl3  reason: default package */
/* loaded from: classes.dex */
public final class gl3 implements android.widget.SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ gl3(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
            r1 = this;
            int r0 = r1.a
            java.lang.Object r1 = r1.b
            switch(r0) {
                case 0: goto Lec;
                case 1: goto L95;
                case 2: goto L3e;
                case 3: goto L26;
                default: goto L7;
            }
        L7:
            androidx.preference.SeekBarPreference r1 = (androidx.preference.SeekBarPreference) r1
            if (r4 == 0) goto L17
            boolean r4 = r1.f0
            if (r4 != 0) goto L13
            boolean r4 = r1.X
            if (r4 != 0) goto L17
        L13:
            r1.f(r2)
            goto L25
        L17:
            int r2 = r1.B
            int r3 = r3 + r2
            android.widget.TextView r1 = r1.Z
            if (r1 == 0) goto L25
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r1.setText(r2)
        L25:
            return
        L26:
            r2.getClass()
            float r2 = (float) r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            me.magnum.melonds.ui.layouteditor.b r1 = (me.magnum.melonds.ui.layouteditor.b) r1
            boolean r3 = r1.q0
            if (r3 == 0) goto L34
            goto L3d
        L34:
            nb1 r1 = r1.L
            java.lang.Object r1 = r1.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r1
            r1.setSelectedViewAlpha(r2)
        L3d:
            return
        L3e:
            r2.getClass()
            me.magnum.melonds.ui.layouteditor.b r1 = (me.magnum.melonds.ui.layouteditor.b) r1
            nb1 r2 = r1.L
            boolean r0 = r1.j0
            if (r0 == 0) goto L5b
            if (r4 == 0) goto L5b
            kl3 r4 = r1.m0
            java.lang.Float r4 = r4.getRatio()
            if (r4 == 0) goto L5b
            kl3 r3 = r1.m0
            il3 r4 = defpackage.il3.HEIGHT
            r1.q(r3, r4)
            goto L84
        L5b:
            float r3 = (float) r3
            java.lang.Object r4 = r2.q
            android.widget.SeekBar r4 = (android.widget.SeekBar) r4
            int r4 = r4.getMax()
            float r4 = (float) r4
            float r3 = r3 / r4
            r1.i0 = r3
            java.lang.Object r3 = r2.w
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r4 = r2.q
            android.widget.SeekBar r4 = (android.widget.SeekBar) r4
            int r4 = r4.getMax()
            float r4 = (float) r4
            float r0 = r1.i0
            float r4 = r4 * r0
            int r0 = r1.g0
            float r0 = (float) r0
            float r4 = r4 + r0
            int r4 = (int) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.setText(r4)
        L84:
            boolean r3 = r1.q0
            if (r3 == 0) goto L89
            goto L94
        L89:
            java.lang.Object r2 = r2.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r2
            float r3 = r1.h0
            float r1 = r1.i0
            r2.u(r3, r1)
        L94:
            return
        L95:
            r2.getClass()
            me.magnum.melonds.ui.layouteditor.b r1 = (me.magnum.melonds.ui.layouteditor.b) r1
            nb1 r2 = r1.L
            boolean r0 = r1.j0
            if (r0 == 0) goto Lb2
            if (r4 == 0) goto Lb2
            kl3 r4 = r1.m0
            java.lang.Float r4 = r4.getRatio()
            if (r4 == 0) goto Lb2
            kl3 r3 = r1.m0
            il3 r4 = defpackage.il3.WIDTH
            r1.q(r3, r4)
            goto Ldb
        Lb2:
            float r3 = (float) r3
            java.lang.Object r4 = r2.t
            android.widget.SeekBar r4 = (android.widget.SeekBar) r4
            int r4 = r4.getMax()
            float r4 = (float) r4
            float r3 = r3 / r4
            r1.h0 = r3
            java.lang.Object r3 = r2.z
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r4 = r2.t
            android.widget.SeekBar r4 = (android.widget.SeekBar) r4
            int r4 = r4.getMax()
            float r4 = (float) r4
            float r0 = r1.h0
            float r4 = r4 * r0
            int r0 = r1.g0
            float r0 = (float) r0
            float r4 = r4 + r0
            int r4 = (int) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.setText(r4)
        Ldb:
            boolean r3 = r1.q0
            if (r3 == 0) goto Le0
            goto Leb
        Le0:
            java.lang.Object r2 = r2.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r2
            float r3 = r1.h0
            float r1 = r1.i0
            r2.u(r3, r1)
        Leb:
            return
        Lec:
            me.magnum.melonds.ui.layouteditor.b r1 = (me.magnum.melonds.ui.layouteditor.b) r1
            nb1 r4 = r1.L
            r2.getClass()
            int r2 = r2.getMax()
            r0 = 1
            if (r2 >= r0) goto Lfb
            r2 = r0
        Lfb:
            float r3 = (float) r3
            float r2 = (float) r2
            float r3 = r3 / r2
            float r2 = r2 * r3
            int r0 = r1.g0
            float r0 = (float) r0
            float r2 = r2 + r0
            int r2 = (int) r2
            java.lang.Object r0 = r4.x
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.setText(r2)
            boolean r1 = r1.q0
            if (r1 == 0) goto L114
            goto L11b
        L114:
            java.lang.Object r1 = r4.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r1
            r1.t(r3)
        L11b:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L11;
                case 3: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.b
            androidx.preference.SeekBarPreference r1 = (androidx.preference.SeekBarPreference) r1
            r2 = 1
            r1.X = r2
            return
        Ld:
            r2.getClass()
            return
        L11:
            r2.getClass()
            return
        L15:
            r2.getClass()
            return
        L19:
            r2.getClass()
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L27;
                case 1: goto L23;
                case 2: goto L1f;
                case 3: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r2.b
            androidx.preference.SeekBarPreference r2 = (androidx.preference.SeekBarPreference) r2
            r0 = 0
            r2.X = r0
            int r0 = r3.getProgress()
            int r1 = r2.B
            int r0 = r0 + r1
            int r1 = r2.A
            if (r0 == r1) goto L1a
            r2.f(r3)
        L1a:
            return
        L1b:
            r3.getClass()
            return
        L1f:
            r3.getClass()
            return
        L23:
            r3.getClass()
            return
        L27:
            r3.getClass()
            return
    }
}
