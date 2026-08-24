package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o86  reason: default package */
/* loaded from: classes.dex */
public final class o86 implements android.text.TextWatcher {
    public final /* synthetic */ androidx.appcompat.widget.SearchView A;

    public o86(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
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
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            androidx.appcompat.widget.SearchView r0 = r0.A
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r0.o0
            android.text.Editable r2 = r2.getText()
            r0.W0 = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = r2 ^ 1
            r0.v(r3)
            boolean r3 = r0.U0
            r4 = 8
            if (r3 == 0) goto L25
            boolean r3 = r0.N0
            if (r3 != 0) goto L25
            if (r2 == 0) goto L25
            android.widget.ImageView r2 = r0.t0
            r2.setVisibility(r4)
            r4 = 0
        L25:
            android.widget.ImageView r2 = r0.v0
            r2.setVisibility(r4)
            r0.r()
            r0.u()
            t86 r2 = r0.J0
            if (r2 == 0) goto L59
            java.lang.String r2 = r0.V0
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 != 0) goto L59
            t86 r2 = r0.J0
            java.lang.String r3 = r1.toString()
            hy5 r2 = (defpackage.hy5) r2
            me.magnum.melonds.ui.romlist.RomListActivity r2 = r2.A
            int r4 = me.magnum.melonds.ui.romlist.RomListActivity.K0
            tz5 r2 = r2.C()
            tp6 r2 = r2.k
            if (r3 != 0) goto L52
            java.lang.String r3 = ""
        L52:
            r2.getClass()
            r4 = 0
            r2.m(r4, r3)
        L59:
            java.lang.String r1 = r1.toString()
            r0.V0 = r1
            return
    }
}
