package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j7.f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, int i2, int i10) {
        super(i2, false);
        this.F = mVar;
        this.E = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, j7.u0
    public final void A0(RecyclerView recyclerView, int i2) {
        aa.b bVar = new aa.b(recyclerView.getContext());
        bVar.f7507a = i2;
        B0(bVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(f1 f1Var, int[] iArr) {
        m mVar = this.F;
        RecyclerView recyclerView = mVar.f3037b0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = mVar.f3037b0.getWidth();
            return;
        }
        iArr[0] = recyclerView.getHeight();
        iArr[1] = mVar.f3037b0.getHeight();
    }
}
