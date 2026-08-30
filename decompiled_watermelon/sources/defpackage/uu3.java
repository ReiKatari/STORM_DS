package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uu3  reason: default package */
/* loaded from: classes.dex */
public final class uu3 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ wu3 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(wu3 wu3Var, int i, int i2) {
        super(i, false);
        this.F = wu3Var;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.q65
    public final void A0(RecyclerView recyclerView, int i) {
        ti0 ti0Var = new ti0(recyclerView.getContext());
        ti0Var.a = i;
        B0(ti0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(c75 c75Var, int[] iArr) {
        wu3 wu3Var = this.F;
        RecyclerView recyclerView = wu3Var.c0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = wu3Var.c0.getWidth();
            return;
        }
        iArr[0] = recyclerView.getHeight();
        iArr[1] = wu3Var.c0.getHeight();
    }
}
