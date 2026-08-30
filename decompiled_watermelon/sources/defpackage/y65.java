package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y65  reason: default package */
/* loaded from: classes.dex */
public final class y65 extends i65 {
    public final /* synthetic */ RecyclerView a;

    public y65(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // defpackage.i65
    public final void a() {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        recyclerView.c1.f = true;
        recyclerView.Z(true);
        if (!recyclerView.c0.j()) {
            recyclerView.requestLayout();
        }
    }

    @Override // defpackage.i65
    public final void b(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.a;
        recyclerView.k(null);
        y9 y9Var = recyclerView.c0;
        ArrayList arrayList = (ArrayList) y9Var.c;
        if (i2 >= 1) {
            arrayList.add(y9Var.m(obj, 4, i, i2));
            y9Var.a |= 4;
            if (arrayList.size() == 1) {
                if (recyclerView.r0 && recyclerView.q0) {
                    c65 c65Var = recyclerView.g0;
                    WeakHashMap weakHashMap = aa7.a;
                    recyclerView.postOnAnimation(c65Var);
                    return;
                }
                recyclerView.y0 = true;
                recyclerView.requestLayout();
            }
        }
    }
}
