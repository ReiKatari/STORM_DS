package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jq0 implements android.widget.CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jq0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
            r1 = this;
            int r0 = r1.a
            java.lang.Object r1 = r1.b
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L1b;
                default: goto L7;
            }
        L7:
            me.magnum.melonds.ui.layouteditor.b r1 = (me.magnum.melonds.ui.layouteditor.b) r1
            r2.getClass()
            boolean r2 = r1.q0
            if (r2 == 0) goto L11
            goto L1a
        L11:
            nb1 r1 = r1.L
            java.lang.Object r1 = r1.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r1
            r1.setSelectedScreenOnTop(r3)
        L1a:
            return
        L1b:
            qn2 r1 = (defpackage.qn2) r1
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r2.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1.g(r2)
            return
        L2a:
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            android.widget.CompoundButton$OnCheckedChangeListener r1 = r1.h0
            if (r1 == 0) goto L33
            r1.onCheckedChanged(r2, r3)
        L33:
            return
    }
}
