package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d24  reason: default package */
/* loaded from: classes.dex */
public final class d24 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ f24 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d24(f24 f24Var, int i, int i2) {
        super(i, false);
        this.F = f24Var;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.gg5
    public final void A0(RecyclerView recyclerView, int i) {
        bl0 bl0Var = new bl0(recyclerView.getContext());
        bl0Var.a = i;
        B0(bl0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(sg5 sg5Var, int[] iArr) {
        f24 f24Var = this.F;
        RecyclerView recyclerView = f24Var.d0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = f24Var.d0.getWidth();
            return;
        }
        iArr[0] = recyclerView.getHeight();
        iArr[1] = f24Var.d0.getHeight();
    }
}
