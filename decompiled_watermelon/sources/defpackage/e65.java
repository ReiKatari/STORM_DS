package defpackage;

import android.util.Log;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e65  reason: default package */
/* loaded from: classes.dex */
public final class e65 implements kf1 {
    public final /* synthetic */ RecyclerView A;

    public /* synthetic */ e65(RecyclerView recyclerView) {
        this.A = recyclerView;
    }

    public void a(x9 x9Var) {
        int i = x9Var.a;
        RecyclerView recyclerView = this.A;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    recyclerView.l0.a0(x9Var.b, x9Var.d);
                    return;
                }
                recyclerView.l0.c0(x9Var.b, x9Var.d);
                return;
            }
            recyclerView.l0.b0(x9Var.b, x9Var.d);
            return;
        }
        recyclerView.l0.Y(x9Var.b, x9Var.d);
    }

    public g75 b(int i) {
        RecyclerView recyclerView = this.A;
        int q = recyclerView.d0.q();
        int i2 = 0;
        g75 g75Var = null;
        while (true) {
            if (i2 >= q) {
                break;
            }
            g75 N = RecyclerView.N(recyclerView.d0.p(i2));
            if (N != null && !N.h() && N.c == i) {
                if (((ArrayList) recyclerView.d0.b).contains(N.a)) {
                    g75Var = N;
                } else {
                    g75Var = N;
                    break;
                }
            }
            i2++;
        }
        if (g75Var != null) {
            if (((ArrayList) recyclerView.d0.b).contains(g75Var.a)) {
                if (RecyclerView.y1) {
                    Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                }
            } else {
                return g75Var;
            }
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A;
        int q = recyclerView.d0.q();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < q; i6++) {
            View p = recyclerView.d0.p(i6);
            g75 N = RecyclerView.N(p);
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
                ((r65) p.getLayoutParams()).c = true;
            }
        }
        w65 w65Var = recyclerView.L;
        ArrayList arrayList2 = (ArrayList) w65Var.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            g75 g75Var = (g75) arrayList2.get(size);
            if (g75Var != null && (i3 = g75Var.c) >= i && i3 < i5) {
                g75Var.a(2);
                w65Var.k(size);
            }
        }
        recyclerView.g1 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.A;
        int q = recyclerView.d0.q();
        for (int i3 = 0; i3 < q; i3++) {
            g75 N = RecyclerView.N(recyclerView.d0.p(i3));
            if (N != null && !N.o() && N.c >= i) {
                if (RecyclerView.y1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + N + " now at position " + (N.c + i2));
                }
                N.l(i2, false);
                recyclerView.c1.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.L.e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            g75 g75Var = (g75) arrayList.get(i4);
            if (g75Var != null && g75Var.c >= i) {
                if (RecyclerView.y1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + g75Var + " now at position " + (g75Var.c + i2));
                }
                g75Var.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1 = true;
    }

    @Override // defpackage.kf1
    public boolean e(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.A;
        if (recyclerView.l0.e()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.l0.d()) {
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
        return recyclerView.J(i, i2, 0, Preference.DEFAULT_ORDER);
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
        int q = recyclerView.d0.q();
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
        for (int i11 = 0; i11 < q; i11++) {
            g75 N = RecyclerView.N(recyclerView.d0.p(i11));
            if (N != null && (i9 = N.c) >= i4 && i9 <= i3) {
                if (RecyclerView.y1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + N);
                }
                if (N.c == i) {
                    N.l(i2 - i, false);
                } else {
                    N.l(i5, false);
                }
                recyclerView.c1.f = true;
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
            g75 g75Var = (g75) arrayList.get(i12);
            if (g75Var != null && (i8 = g75Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    g75Var.l(i2 - i, false);
                } else {
                    g75Var.l(i10, false);
                }
                if (RecyclerView.y1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + g75Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(defpackage.g75 r8, defpackage.hj7 r9, defpackage.hj7 r10) {
        /*
            r7 = this;
            r0 = 0
            r8.n(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r7.A
            m65 r0 = r7.K0
            r1 = r0
            oa1 r1 = (defpackage.oa1) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.a
            int r5 = r10.a
            if (r3 != r5) goto L1f
            int r0 = r9.b
            int r2 = r10.b
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.b
            int r6 = r10.b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.l(r2)
            android.view.View r8 = r2.a
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.X()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e65.g(g75, hj7, hj7):void");
    }

    public void h(g75 g75Var, hj7 hj7Var, hj7 hj7Var2) {
        int i;
        int i2;
        boolean z;
        RecyclerView recyclerView = this.A;
        recyclerView.L.p(g75Var);
        recyclerView.h(g75Var);
        g75Var.n(false);
        oa1 oa1Var = (oa1) recyclerView.K0;
        oa1Var.getClass();
        int i3 = hj7Var.a;
        int i4 = hj7Var.b;
        View view = g75Var.a;
        if (hj7Var2 == null) {
            i = view.getLeft();
        } else {
            i = hj7Var2.a;
        }
        int i5 = i;
        if (hj7Var2 == null) {
            i2 = view.getTop();
        } else {
            i2 = hj7Var2.b;
        }
        int i6 = i2;
        if (!g75Var.h() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            z = oa1Var.g(g75Var, i3, i4, i5, i6);
        } else {
            oa1Var.l(g75Var);
            oa1Var.h.add(g75Var);
            z = true;
        }
        if (z) {
            recyclerView.X();
        }
    }

    public void i(int i) {
        RecyclerView recyclerView = this.A;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // defpackage.kf1
    public float o() {
        float f;
        RecyclerView recyclerView = this.A;
        if (recyclerView.l0.e()) {
            f = recyclerView.X0;
        } else if (recyclerView.l0.d()) {
            f = recyclerView.W0;
        } else {
            return RecyclerView.A1;
        }
        return -f;
    }

    @Override // defpackage.kf1
    public void q() {
        this.A.p0();
    }
}
