package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yr  reason: default package */
/* loaded from: classes.dex */
public final class yr implements defpackage.es, android.content.DialogInterface.OnClickListener {
    public defpackage.ac A;
    public defpackage.zr B;
    public java.lang.CharSequence L;
    public final /* synthetic */ defpackage.fs R;

    public yr(defpackage.fs r1) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            return
    }

    @Override // defpackage.es
    public final boolean a() {
            r0 = this;
            ac r0 = r0.A
            if (r0 == 0) goto L9
            boolean r0 = r0.isShowing()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // defpackage.es
    public final int b() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.es
    public final void c(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // defpackage.es
    public final java.lang.CharSequence d() {
            r0 = this;
            java.lang.CharSequence r0 = r0.L
            return r0
    }

    @Override // defpackage.es
    public final void dismiss() {
            r1 = this;
            ac r0 = r1.A
            if (r0 == 0) goto La
            r0.dismiss()
            r0 = 0
            r1.A = r0
        La:
            return
    }

    @Override // defpackage.es
    public final android.graphics.drawable.Drawable f() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.es
    public final void g(java.lang.CharSequence r1) {
            r0 = this;
            r0.L = r1
            return
    }

    @Override // defpackage.es
    public final void h(android.graphics.drawable.Drawable r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set popup background for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // defpackage.es
    public final void i(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // defpackage.es
    public final void k(int r1) {
            r0 = this;
            java.lang.String r0 = "AppCompatSpinner"
            java.lang.String r1 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
            android.util.Log.e(r0, r1)
            return
    }

    @Override // defpackage.es
    public final void l(int r5, int r6) {
            r4 = this;
            zr r0 = r4.B
            if (r0 != 0) goto L5
            return
        L5:
            zb r0 = new zb
            fs r1 = r4.R
            android.content.Context r2 = r1.getPopupContext()
            r0.<init>(r2)
            java.lang.Object r2 = r0.L
            wb r2 = (defpackage.wb) r2
            java.lang.CharSequence r3 = r4.L
            if (r3 == 0) goto L1a
            r2.d = r3
        L1a:
            zr r3 = r4.B
            int r1 = r1.getSelectedItemPosition()
            r2.r = r3
            r2.s = r4
            r2.y = r1
            r1 = 1
            r2.x = r1
            ac r0 = r0.l()
            r4.A = r0
            yb r0 = r0.Z
            androidx.appcompat.app.AlertController$RecycleListView r0 = r0.f
            r0.setTextDirection(r5)
            r0.setTextAlignment(r6)
            ac r4 = r4.A
            r4.show()
            return
    }

    @Override // defpackage.es
    public final int m() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.es
    public final void n(android.widget.ListAdapter r1) {
            r0 = this;
            zr r1 = (defpackage.zr) r1
            r0.B = r1
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            fs r4 = r3.R
            r4.setSelection(r5)
            android.widget.AdapterView$OnItemClickListener r0 = r4.getOnItemClickListener()
            if (r0 == 0) goto L15
            zr r0 = r3.B
            long r0 = r0.getItemId(r5)
            r2 = 0
            r4.performItemClick(r2, r5, r0)
        L15:
            r3.dismiss()
            return
    }
}
