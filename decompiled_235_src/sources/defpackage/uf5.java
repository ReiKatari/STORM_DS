package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf5  reason: default package */
/* loaded from: classes.dex */
public final class uf5 implements oj1 {
    public final /* synthetic */ RecyclerView A;

    public /* synthetic */ uf5(RecyclerView recyclerView) {
        this.A = recyclerView;
    }

    public void a(y9 y9Var) {
        int i = y9Var.a;
        RecyclerView recyclerView = this.A;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    recyclerView.m0.a0(y9Var.b, y9Var.d);
                    return;
                }
                recyclerView.m0.c0(y9Var.b, y9Var.d);
                return;
            }
            recyclerView.m0.b0(y9Var.b, y9Var.d);
            return;
        }
        recyclerView.m0.Y(y9Var.b, y9Var.d);
    }

    public wg5 b(int i) {
        RecyclerView recyclerView = this.A;
        int t = recyclerView.e0.t();
        int i2 = 0;
        wg5 wg5Var = null;
        while (true) {
            if (i2 >= t) {
                break;
            }
            wg5 N = RecyclerView.N(recyclerView.e0.s(i2));
            if (N != null && !N.h() && N.c == i) {
                if (((ArrayList) recyclerView.e0.B).contains(N.a)) {
                    wg5Var = N;
                } else {
                    wg5Var = N;
                    break;
                }
            }
            i2++;
        }
        if (wg5Var != null) {
            if (((ArrayList) recyclerView.e0.B).contains(wg5Var.a)) {
                if (RecyclerView.z1) {
                    Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                }
            } else {
                return wg5Var;
            }
        }
        return null;
    }

    @Override // defpackage.oj1
    public boolean c(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.A;
        if (recyclerView.m0.e()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.m0.d()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.p0();
        return recyclerView.J(i, i2, 0, Integer.MAX_VALUE);
    }

    public void d(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A;
        int t = recyclerView.e0.t();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < t; i6++) {
            View s = recyclerView.e0.s(i6);
            wg5 N = RecyclerView.N(s);
            if (N != null && !N.o() && (i4 = N.c) >= i && i4 < i5) {
                N.a(2);
                if (obj == null) {
                    N.a(1024);
                } else if ((1024 & N.j) == 0) {
                    if (N.k == null) {
                        ArrayList arrayList = new ArrayList();
                        N.k = arrayList;
                        N.l = Collections.unmodifiableList(arrayList);
                    }
                    N.k.add(obj);
                }
                ((hg5) s.getLayoutParams()).c = true;
            }
        }
        mg5 mg5Var = recyclerView.L;
        ArrayList arrayList2 = (ArrayList) mg5Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            wg5 wg5Var = (wg5) arrayList2.get(size);
            if (wg5Var != null && (i3 = wg5Var.c) >= i && i3 < i5) {
                wg5Var.a(2);
                mg5Var.k(size);
            }
        }
        recyclerView.h1 = true;
    }

    public void e(int i, int i2) {
        RecyclerView recyclerView = this.A;
        int t = recyclerView.e0.t();
        for (int i3 = 0; i3 < t; i3++) {
            wg5 N = RecyclerView.N(recyclerView.e0.s(i3));
            if (N != null && !N.o() && N.c >= i) {
                if (RecyclerView.z1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + N + " now at position " + (N.c + i2));
                }
                N.l(i2, false);
                recyclerView.d1.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.L.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            wg5 wg5Var = (wg5) arrayList.get(i4);
            if (wg5Var != null && wg5Var.c >= i) {
                if (RecyclerView.z1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + wg5Var + " now at position " + (wg5Var.c + i2));
                }
                wg5Var.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.g1 = true;
    }

    public void f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.A;
        int t = recyclerView.e0.t();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < t; i11++) {
            wg5 N = RecyclerView.N(recyclerView.e0.s(i11));
            if (N != null && (i9 = N.c) >= i4 && i9 <= i3) {
                if (RecyclerView.z1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + N);
                }
                if (N.c == i) {
                    N.l(i2 - i, false);
                } else {
                    N.l(i5, false);
                }
                recyclerView.d1.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.L.e;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            wg5 wg5Var = (wg5) arrayList.get(i12);
            if (wg5Var != null && (i8 = wg5Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    wg5Var.l(i2 - i, false);
                } else {
                    wg5Var.l(i10, false);
                }
                if (RecyclerView.z1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + wg5Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.g1 = true;
    }

    @Override // defpackage.oj1
    public float g() {
        float f;
        RecyclerView recyclerView = this.A;
        if (recyclerView.m0.e()) {
            f = recyclerView.Y0;
        } else if (recyclerView.m0.d()) {
            f = recyclerView.X0;
        } else {
            return RecyclerView.B1;
        }
        return -f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(wg5 wg5Var, dy7 dy7Var, dy7 dy7Var2) {
        boolean z;
        wg5Var.n(false);
        RecyclerView recyclerView = this.A;
        ke1 ke1Var = (ke1) recyclerView.L0;
        if (dy7Var != null) {
            ke1Var.getClass();
            int i = dy7Var.a;
            int i2 = dy7Var2.a;
            if (i != i2 || dy7Var.b != dy7Var2.b) {
                z = ke1Var.g(wg5Var, i, dy7Var.b, i2, dy7Var2.b);
                if (!z) {
                    recyclerView.X();
                    return;
                }
                return;
            }
        }
        ke1Var.l(wg5Var);
        wg5Var.a.setAlpha(RecyclerView.B1);
        ke1Var.i.add(wg5Var);
        z = true;
        if (!z) {
        }
    }

    public void i(wg5 wg5Var, dy7 dy7Var, dy7 dy7Var2) {
        int i;
        int i2;
        boolean z;
        RecyclerView recyclerView = this.A;
        recyclerView.L.p(wg5Var);
        recyclerView.h(wg5Var);
        wg5Var.n(false);
        ke1 ke1Var = (ke1) recyclerView.L0;
        ke1Var.getClass();
        int i3 = dy7Var.a;
        int i4 = dy7Var.b;
        View view = wg5Var.a;
        if (dy7Var2 == null) {
            i = view.getLeft();
        } else {
            i = dy7Var2.a;
        }
        int i5 = i;
        if (dy7Var2 == null) {
            i2 = view.getTop();
        } else {
            i2 = dy7Var2.b;
        }
        int i6 = i2;
        if (!wg5Var.h() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            z = ke1Var.g(wg5Var, i3, i4, i5, i6);
        } else {
            ke1Var.l(wg5Var);
            ke1Var.h.add(wg5Var);
            z = true;
        }
        if (z) {
            recyclerView.X();
        }
    }

    public void j(int i) {
        RecyclerView recyclerView = this.A;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // defpackage.oj1
    public void k() {
        this.A.p0();
    }
}
