package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt1  reason: default package */
/* loaded from: classes.dex */
public final class nt1 implements android.text.TextWatcher {
    public final android.widget.EditText A;
    public defpackage.mt1 B;
    public boolean L;

    public nt1(android.widget.EditText r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r1 = 1
            r0.L = r1
            return
    }

    public static void a(android.widget.EditText r4, int r5) {
            r0 = 1
            if (r5 != r0) goto L3d
            if (r4 == 0) goto L3d
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L3d
            android.text.Editable r4 = r4.getEditableText()
            int r5 = android.text.Selection.getSelectionStart(r4)
            int r0 = android.text.Selection.getSelectionEnd(r4)
            ws1 r1 = defpackage.ws1.a()
            r2 = 0
            if (r4 != 0) goto L20
            r3 = r2
            goto L27
        L20:
            r1.getClass()
            int r3 = r4.length()
        L27:
            r1.g(r2, r3, r2, r4)
            if (r5 < 0) goto L32
            if (r0 < 0) goto L32
            android.text.Selection.setSelection(r4, r5, r0)
            return
        L32:
            if (r5 < 0) goto L38
            android.text.Selection.setSelection(r4, r5)
            return
        L38:
            if (r0 < 0) goto L3d
            android.text.Selection.setSelection(r4, r0)
        L3d:
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r1) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            r2 = this;
            android.widget.EditText r0 = r2.A
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L4a
            boolean r1 = r2.L
            if (r1 == 0) goto L4a
            boolean r1 = defpackage.ws1.d()
            if (r1 != 0) goto L13
            goto L4a
        L13:
            if (r5 > r6) goto L4a
            boolean r5 = r3 instanceof android.text.Spannable
            if (r5 == 0) goto L4a
            ws1 r5 = defpackage.ws1.a()
            int r5 = r5.c()
            if (r5 == 0) goto L36
            r1 = 1
            if (r5 == r1) goto L2a
            r3 = 3
            if (r5 == r3) goto L36
            goto L4a
        L2a:
            android.text.Spannable r3 = (android.text.Spannable) r3
            ws1 r2 = defpackage.ws1.a()
            int r6 = r6 + r4
            r5 = 0
            r2.g(r4, r6, r5, r3)
            return
        L36:
            ws1 r3 = defpackage.ws1.a()
            mt1 r4 = r2.B
            if (r4 != 0) goto L45
            mt1 r4 = new mt1
            r4.<init>(r0)
            r2.B = r4
        L45:
            mt1 r2 = r2.B
            r3.h(r2)
        L4a:
            return
    }
}
