package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k37  reason: default package */
/* loaded from: classes.dex */
public final class k37 implements android.text.TextWatcher {
    public int A;
    public final /* synthetic */ android.widget.EditText B;
    public final /* synthetic */ com.google.android.material.textfield.TextInputLayout L;

    public k37(com.google.android.material.textfield.TextInputLayout r1, android.widget.EditText r2) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.B = r2
            int r1 = r2.getLineCount()
            r0.A = r1
            return
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable r4) {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.L
            boolean r1 = r0.x1
            r1 = r1 ^ 1
            r2 = 0
            r0.w(r1, r2)
            boolean r1 = r0.k0
            if (r1 == 0) goto L11
            r0.p(r4)
        L11:
            boolean r1 = r0.s0
            if (r1 == 0) goto L18
            r0.x(r4)
        L18:
            android.widget.EditText r4 = r3.B
            int r1 = r4.getLineCount()
            int r2 = r3.A
            if (r1 == r2) goto L31
            if (r1 >= r2) goto L2f
            int r2 = r4.getMinimumHeight()
            int r0 = r0.q1
            if (r2 == r0) goto L2f
            r4.setMinimumHeight(r0)
        L2f:
            r3.A = r1
        L31:
            return
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }
}
