package j7;

import a4.k2;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends m0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7506a;

    public b1(RecyclerView recyclerView) {
        this.f7506a = recyclerView;
    }

    @Override // j7.m0
    public final void a() {
        RecyclerView recyclerView = this.f7506a;
        recyclerView.k(null);
        recyclerView.f1621a1.f7555f = true;
        recyclerView.Z(true);
        if (!recyclerView.f1622b0.j()) {
            recyclerView.requestLayout();
        }
    }

    @Override // j7.m0
    public final void b(int i2, int i10, Object obj) {
        RecyclerView recyclerView = this.f7506a;
        recyclerView.k(null);
        k2 k2Var = recyclerView.f1622b0;
        ArrayList arrayList = (ArrayList) k2Var.f250c;
        if (i10 >= 1) {
            arrayList.add(k2Var.m(obj, 4, i2, i10));
            k2Var.f248a |= 4;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }

    @Override // j7.m0
    public final void c(int i2, int i10) {
        RecyclerView recyclerView = this.f7506a;
        recyclerView.k(null);
        k2 k2Var = recyclerView.f1622b0;
        ArrayList arrayList = (ArrayList) k2Var.f250c;
        if (i10 >= 1) {
            arrayList.add(k2Var.m(null, 1, i2, i10));
            k2Var.f248a |= 1;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }

    @Override // j7.m0
    public final void d(int i2, int i10) {
        RecyclerView recyclerView = this.f7506a;
        recyclerView.k(null);
        k2 k2Var = recyclerView.f1622b0;
        ArrayList arrayList = (ArrayList) k2Var.f250c;
        if (i2 != i10) {
            arrayList.add(k2Var.m(null, 8, i2, i10));
            k2Var.f248a |= 8;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }

    @Override // j7.m0
    public final void e(int i2, int i10) {
        RecyclerView recyclerView = this.f7506a;
        recyclerView.k(null);
        k2 k2Var = recyclerView.f1622b0;
        ArrayList arrayList = (ArrayList) k2Var.f250c;
        if (i10 >= 1) {
            arrayList.add(k2Var.m(null, 2, i2, i10));
            k2Var.f248a |= 2;
            if (arrayList.size() == 1) {
                f();
            }
        }
    }

    public final void f() {
        RecyclerView recyclerView = this.f7506a;
        if (recyclerView.f1651q0 && recyclerView.p0) {
            h0 h0Var = recyclerView.f1630f0;
            WeakHashMap weakHashMap = a6.x0.f533a;
            recyclerView.postOnAnimation(h0Var);
            return;
        }
        recyclerView.f1663x0 = true;
        recyclerView.requestLayout();
    }
}
