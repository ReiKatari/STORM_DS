package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tb  reason: default package */
/* loaded from: classes.dex */
public final class tb extends android.widget.ArrayAdapter {
    public final /* synthetic */ androidx.appcompat.app.AlertController$RecycleListView A;
    public final /* synthetic */ defpackage.wb B;

    public tb(defpackage.wb r1, android.view.ContextThemeWrapper r2, int r3, java.lang.CharSequence[] r4, androidx.appcompat.app.AlertController$RecycleListView r5) {
            r0 = this;
            r0.B = r1
            r0.A = r5
            r1 = 16908308(0x1020014, float:2.3877285E-38)
            r0.<init>(r2, r3, r1, r4)
            return
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r2 = super.getView(r1, r2, r3)
            wb r3 = r0.B
            boolean[] r3 = r3.v
            if (r3 == 0) goto L14
            boolean r3 = r3[r1]
            if (r3 == 0) goto L14
            androidx.appcompat.app.AlertController$RecycleListView r0 = r0.A
            r3 = 1
            r0.setItemChecked(r1, r3)
        L14:
            return r2
    }
}
