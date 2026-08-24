package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub  reason: default package */
/* loaded from: classes.dex */
public final class ub implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ defpackage.yb A;
    public final /* synthetic */ defpackage.wb B;

    public ub(defpackage.wb r1, defpackage.yb r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.A = r2
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            wb r1 = r0.B
            android.content.DialogInterface$OnClickListener r2 = r1.s
            yb r0 = r0.A
            ac r4 = r0.b
            r2.onClick(r4, r3)
            boolean r1 = r1.x
            if (r1 != 0) goto L14
            ac r0 = r0.b
            r0.dismiss()
        L14:
            return
    }
}
