package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d24  reason: default package */
/* loaded from: classes.dex */
public final class d24 extends androidx.recyclerview.widget.LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ defpackage.f24 F;

    public d24(defpackage.f24 r1, int r2, int r3) {
            r0 = this;
            r0.F = r1
            r0.E = r3
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final void A0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            bl0 r0 = new bl0
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r0.a = r3
            r1.B0(r0)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(defpackage.sg5 r4, int[] r5) {
            r3 = this;
            f24 r4 = r3.F
            androidx.recyclerview.widget.RecyclerView r0 = r4.d0
            r1 = 1
            r2 = 0
            int r3 = r3.E
            if (r3 != 0) goto L19
            int r3 = r0.getWidth()
            r5[r2] = r3
            androidx.recyclerview.widget.RecyclerView r3 = r4.d0
            int r3 = r3.getWidth()
            r5[r1] = r3
            return
        L19:
            int r3 = r0.getHeight()
            r5[r2] = r3
            androidx.recyclerview.widget.RecyclerView r3 = r4.d0
            int r3 = r3.getHeight()
            r5[r1] = r3
            return
    }
}
