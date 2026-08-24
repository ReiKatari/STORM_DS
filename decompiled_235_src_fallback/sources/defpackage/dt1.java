package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt1  reason: default package */
/* loaded from: classes.dex */
public final class dt1 extends defpackage.us1 implements java.lang.Runnable {
    public final java.lang.ref.WeakReference A;
    public final java.lang.ref.WeakReference B;

    public dt1(android.widget.TextView r2, defpackage.et1 r3) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.A = r0
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r1.B = r2
            return
    }

    @Override // defpackage.us1
    public final void b() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.A
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L14
            r0.post(r1)
        L14:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.A
            java.lang.Object r0 = r0.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.ref.WeakReference r5 = r5.B
            java.lang.Object r5 = r5.get()
            android.text.InputFilter r5 = (android.text.InputFilter) r5
            if (r5 == 0) goto L6d
            if (r0 != 0) goto L15
            goto L6d
        L15:
            android.text.InputFilter[] r1 = r0.getFilters()
            if (r1 != 0) goto L1c
            goto L6d
        L1c:
            r2 = 0
            r3 = r2
        L1e:
            int r4 = r1.length
            if (r3 >= r4) goto L6d
            r4 = r1[r3]
            if (r4 != r5) goto L6a
            boolean r5 = r0.isAttachedToWindow()
            if (r5 == 0) goto L6d
            java.lang.CharSequence r5 = r0.getText()
            ws1 r1 = defpackage.ws1.a()
            if (r5 != 0) goto L37
            r3 = r2
            goto L3e
        L37:
            r1.getClass()
            int r3 = r5.length()
        L3e:
            java.lang.CharSequence r1 = r1.g(r2, r3, r2, r5)
            if (r5 != r1) goto L45
            goto L6d
        L45:
            int r5 = android.text.Selection.getSelectionStart(r1)
            int r2 = android.text.Selection.getSelectionEnd(r1)
            r0.setText(r1)
            boolean r0 = r1 instanceof android.text.Spannable
            if (r0 == 0) goto L6d
            android.text.Spannable r1 = (android.text.Spannable) r1
            if (r5 < 0) goto L5e
            if (r2 < 0) goto L5e
            android.text.Selection.setSelection(r1, r5, r2)
            return
        L5e:
            if (r5 < 0) goto L64
            android.text.Selection.setSelection(r1, r5)
            return
        L64:
            if (r2 < 0) goto L6d
            android.text.Selection.setSelection(r1, r2)
            return
        L6a:
            int r3 = r3 + 1
            goto L1e
        L6d:
            return
    }
}
