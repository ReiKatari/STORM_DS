package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og5  reason: default package */
/* loaded from: classes.dex */
public final class og5 extends yf5 {
    public final /* synthetic */ RecyclerView a;

    public og5(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.yf5
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        recyclerView.d1.f = true;
        recyclerView.Z(true);
        if (!recyclerView.d0.j()) {
            recyclerView.requestLayout();
        }
    }

    @Override // defpackage.yf5
    public final void b(Object obj, int i, int i2) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        z9 z9Var = recyclerView.d0;
        ArrayList arrayList = (ArrayList) z9Var.c;
        if (i2 >= 1) {
            arrayList.add(z9Var.m(obj, 4, i, i2));
            z9Var.a |= 4;
            if (arrayList.size() == 1) {
                if (recyclerView.s0 && recyclerView.r0) {
                    sf5 sf5Var = recyclerView.h0;
                    WeakHashMap weakHashMap = ao7.a;
                    recyclerView.postOnAnimation(sf5Var);
                    return;
                }
                recyclerView.z0 = true;
                recyclerView.requestLayout();
            }
        }
    }
}
