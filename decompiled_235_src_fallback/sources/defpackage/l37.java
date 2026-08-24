package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l37  reason: default package */
/* loaded from: classes.dex */
public final class l37 extends defpackage.b2 {
    public final com.google.android.material.textfield.TextInputLayout R;

    public l37(com.google.android.material.textfield.TextInputLayout r1) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            return
    }

    @Override // defpackage.b2
    public final void d(android.view.View r14, defpackage.v2 r15) {
            r13 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.a
            android.view.View$AccessibilityDelegate r1 = r13.A
            r1.onInitializeAccessibilityNodeInfo(r14, r0)
            com.google.android.material.textfield.TextInputLayout r13 = r13.R
            android.widget.EditText r14 = r13.getEditText()
            if (r14 == 0) goto L14
            android.text.Editable r14 = r14.getText()
            goto L15
        L14:
            r14 = 0
        L15:
            java.lang.CharSequence r1 = r13.getHint()
            java.lang.CharSequence r2 = r13.getError()
            java.lang.CharSequence r3 = r13.getPlaceholderText()
            int r4 = r13.getCounterMaxLength()
            java.lang.CharSequence r5 = r13.getCounterOverflowDescription()
            boolean r6 = android.text.TextUtils.isEmpty(r14)
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            boolean r8 = r13.r1
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 == 0) goto L42
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            if (r10 != 0) goto L40
            goto L42
        L40:
            r10 = 0
            goto L43
        L42:
            r10 = 1
        L43:
            if (r7 != 0) goto L4a
            java.lang.String r1 = r1.toString()
            goto L4c
        L4a:
            java.lang.String r1 = ""
        L4c:
            fp6 r7 = r13.B
            qs r11 = r7.B
            int r12 = r11.getVisibility()
            if (r12 != 0) goto L5d
            r0.setLabelFor(r11)
            r0.setTraversalAfter(r11)
            goto L62
        L5d:
            com.google.android.material.internal.CheckableImageButton r7 = r7.R
            r0.setTraversalAfter(r7)
        L62:
            java.lang.String r7 = ", "
            if (r6 != 0) goto L6a
            r15.m(r14)
            goto L92
        L6a:
            boolean r11 = android.text.TextUtils.isEmpty(r1)
            if (r11 != 0) goto L8d
            r15.m(r1)
            if (r8 != 0) goto L92
            if (r3 == 0) goto L92
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r7)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r15.m(r3)
            goto L92
        L8d:
            if (r3 == 0) goto L92
            r15.m(r3)
        L92:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto Lcf
            int r3 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r3 < r8) goto Lae
            if (r3 < r8) goto La4
            defpackage.k2.u(r0, r1)
            goto Lc5
        La4:
            android.os.Bundle r7 = r0.getExtras()
            java.lang.String r11 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"
            r7.putCharSequence(r11, r1)
            goto Lc5
        Lae:
            if (r6 != 0) goto Lc2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            r11.append(r7)
            r11.append(r1)
            java.lang.String r1 = r11.toString()
        Lc2:
            r15.m(r1)
        Lc5:
            if (r3 < r8) goto Lcb
            defpackage.k2.w(r0, r6)
            goto Lcf
        Lcb:
            r1 = 4
            r15.h(r1, r6)
        Lcf:
            if (r14 == 0) goto Ld8
            int r14 = r14.length()
            if (r14 != r4) goto Ld8
            goto Ld9
        Ld8:
            r4 = -1
        Ld9:
            r0.setMaxTextLength(r4)
            if (r10 == 0) goto Le5
            if (r9 != 0) goto Le1
            goto Le2
        Le1:
            r2 = r5
        Le2:
            r0.setError(r2)
        Le5:
            q43 r14 = r13.j0
            qs r14 = r14.y
            if (r14 == 0) goto Lee
            r0.setLabelFor(r14)
        Lee:
            n42 r13 = r13.L
            o42 r13 = r13.b()
            r13.m(r15)
            return
    }

    @Override // defpackage.b2
    public final void e(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.e(r1, r2)
            com.google.android.material.textfield.TextInputLayout r0 = r0.R
            n42 r0 = r0.L
            o42 r0 = r0.b()
            r0.n(r2)
            return
    }
}
