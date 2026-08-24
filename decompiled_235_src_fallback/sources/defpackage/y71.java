package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y71  reason: default package */
/* loaded from: classes.dex */
public final class y71 extends android.database.DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ y71(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
            r1 = this;
            int r0 = r1.a
            java.lang.Object r1 = r1.b
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            ax3 r1 = (defpackage.ax3) r1
            pr r0 = r1.v0
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L14
            r1.e()
        L14:
            return
        L15:
            du6 r1 = (defpackage.du6) r1
            r0 = 1
            r1.A = r0
            r1.notifyDataSetChanged()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
            r1 = this;
            int r0 = r1.a
            java.lang.Object r1 = r1.b
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            ax3 r1 = (defpackage.ax3) r1
            r1.dismiss()
            return
        Ld:
            du6 r1 = (defpackage.du6) r1
            r0 = 0
            r1.A = r0
            r1.notifyDataSetInvalidated()
            return
    }
}
