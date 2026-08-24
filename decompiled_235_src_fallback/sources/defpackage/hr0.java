package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hr0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ hr0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            java.lang.Object r3 = r3.B
            switch(r0) {
                case 0: goto L62;
                case 1: goto L5c;
                case 2: goto L4a;
                case 3: goto L44;
                case 4: goto L10;
                default: goto L8;
            }
        L8:
            ac r3 = (defpackage.ac) r3
            int r4 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            r3.dismiss()
            return
        L10:
            it4 r3 = (defpackage.it4) r3
            android.widget.EditText r4 = r3.f
            if (r4 != 0) goto L17
            goto L43
        L17:
            int r4 = r4.getSelectionEnd()
            android.widget.EditText r0 = r3.f
            if (r0 == 0) goto L29
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            android.widget.EditText r2 = r3.f
            if (r0 == 0) goto L32
            r2.setTransformationMethod(r1)
            goto L39
        L32:
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r2.setTransformationMethod(r0)
        L39:
            if (r4 < 0) goto L40
            android.widget.EditText r0 = r3.f
            r0.setSelection(r4)
        L40:
            r3.p()
        L43:
            return
        L44:
            k24 r3 = (defpackage.k24) r3
            r3.i()
            throw r1
        L4a:
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r3 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r3
            zj3 r0 = r3.h0
            if (r0 == 0) goto L54
            r3.n()
            goto L5b
        L54:
            android.view.View$OnClickListener r3 = r3.e0
            if (r3 == 0) goto L5b
            r3.onClick(r4)
        L5b:
            return
        L5c:
            vp1 r3 = (defpackage.vp1) r3
            r3.t()
            return
        L62:
            lr0 r3 = (defpackage.lr0) r3
            android.widget.EditText r4 = r3.i
            if (r4 != 0) goto L69
            goto L75
        L69:
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L72
            r4.clear()
        L72:
            r3.p()
        L75:
            return
    }
}
