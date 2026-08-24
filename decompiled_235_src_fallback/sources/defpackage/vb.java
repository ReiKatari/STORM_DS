package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb  reason: default package */
/* loaded from: classes.dex */
public final class vb implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ androidx.appcompat.app.AlertController$RecycleListView A;
    public final /* synthetic */ defpackage.yb B;
    public final /* synthetic */ defpackage.wb L;

    public vb(defpackage.wb r1, androidx.appcompat.app.AlertController$RecycleListView r2, defpackage.yb r3) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.A = r2
            r0.B = r3
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            wb r1 = r0.L
            boolean[] r2 = r1.v
            androidx.appcompat.app.AlertController$RecycleListView r4 = r0.A
            if (r2 == 0) goto Le
            boolean r5 = r4.isItemChecked(r3)
            r2[r3] = r5
        Le:
            android.content.DialogInterface$OnMultiChoiceClickListener r1 = r1.z
            yb r0 = r0.B
            ac r0 = r0.b
            boolean r2 = r4.isItemChecked(r3)
            r1.onClick(r0, r3, r2)
            return
    }
}
