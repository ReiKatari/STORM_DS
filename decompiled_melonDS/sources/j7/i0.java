package j7;

import android.util.Log;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import c1.h2;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 implements a6.i {
    public final /* synthetic */ RecyclerView A;

    public /* synthetic */ i0(RecyclerView recyclerView) {
        this.A = recyclerView;
    }

    public void a(a aVar) {
        int i2 = aVar.f7486a;
        RecyclerView recyclerView = this.A;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return;
                    }
                    recyclerView.f1640k0.a0(aVar.f7487b, aVar.f7489d);
                    return;
                }
                recyclerView.f1640k0.c0(aVar.f7487b, aVar.f7489d);
                return;
            }
            recyclerView.f1640k0.b0(aVar.f7487b, aVar.f7489d);
            return;
        }
        recyclerView.f1640k0.Y(aVar.f7487b, aVar.f7489d);
    }

    public j1 b(int i2) {
        RecyclerView recyclerView = this.A;
        int o5 = recyclerView.f1624c0.o();
        int i10 = 0;
        j1 j1Var = null;
        while (true) {
            if (i10 >= o5) {
                break;
            }
            j1 M = RecyclerView.M(recyclerView.f1624c0.n(i10));
            if (M != null && !M.h() && M.f7596c == i2) {
                if (((ArrayList) recyclerView.f1624c0.f3863e).contains(M.f7594a)) {
                    j1Var = M;
                } else {
                    j1Var = M;
                    break;
                }
            }
            i10++;
        }
        if (j1Var != null) {
            if (((ArrayList) recyclerView.f1624c0.f3863e).contains(j1Var.f7594a)) {
                if (RecyclerView.f1617w1) {
                    Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
                }
            } else {
                return j1Var;
            }
        }
        return null;
    }

    public void c(int i2, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.A;
        int o5 = recyclerView.f1624c0.o();
        int i13 = i10 + i2;
        for (int i14 = 0; i14 < o5; i14++) {
            View n10 = recyclerView.f1624c0.n(i14);
            j1 M = RecyclerView.M(n10);
            if (M != null && !M.o() && (i12 = M.f7596c) >= i2 && i12 < i13) {
                M.a(2);
                if (obj == null) {
                    M.a(1024);
                } else if ((1024 & M.f7603j) == 0) {
                    if (M.f7604k == null) {
                        ArrayList arrayList = new ArrayList();
                        M.f7604k = arrayList;
                        M.f7605l = Collections.unmodifiableList(arrayList);
                    }
                    M.f7604k.add(obj);
                }
                ((v0) n10.getLayoutParams()).f7724c = true;
            }
        }
        h2 h2Var = recyclerView.L;
        ArrayList arrayList2 = (ArrayList) h2Var.f2433e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            j1 j1Var = (j1) arrayList2.get(size);
            if (j1Var != null && (i11 = j1Var.f7596c) >= i2 && i11 < i13) {
                j1Var.a(2);
                h2Var.k(size);
            }
        }
        recyclerView.f1629e1 = true;
    }

    public void d(int i2, int i10) {
        RecyclerView recyclerView = this.A;
        int o5 = recyclerView.f1624c0.o();
        for (int i11 = 0; i11 < o5; i11++) {
            j1 M = RecyclerView.M(recyclerView.f1624c0.n(i11));
            if (M != null && !M.o() && M.f7596c >= i2) {
                if (RecyclerView.f1617w1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i11 + " holder " + M + " now at position " + (M.f7596c + i10));
                }
                M.l(i10, false);
                recyclerView.f1621a1.f7555f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.L.f2433e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            j1 j1Var = (j1) arrayList.get(i12);
            if (j1Var != null && j1Var.f7596c >= i2) {
                if (RecyclerView.f1617w1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + j1Var + " now at position " + (j1Var.f7596c + i10));
                }
                j1Var.l(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1627d1 = true;
    }

    public void e(int i2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.A;
        int o5 = recyclerView.f1624c0.o();
        if (i2 < i10) {
            i12 = i2;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i2;
            i12 = i10;
            i13 = 1;
        }
        boolean z10 = false;
        for (int i19 = 0; i19 < o5; i19++) {
            j1 M = RecyclerView.M(recyclerView.f1624c0.n(i19));
            if (M != null && (i18 = M.f7596c) >= i12 && i18 <= i11) {
                if (RecyclerView.f1617w1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i19 + " holder " + M);
                }
                if (M.f7596c == i2) {
                    M.l(i10 - i2, false);
                } else {
                    M.l(i13, false);
                }
                recyclerView.f1621a1.f7555f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.L.f2433e;
        if (i2 < i10) {
            i15 = i2;
            i14 = i10;
            i16 = -1;
        } else {
            i14 = i2;
            i15 = i10;
            i16 = 1;
        }
        int size = arrayList.size();
        int i20 = 0;
        while (i20 < size) {
            j1 j1Var = (j1) arrayList.get(i20);
            if (j1Var != null && (i17 = j1Var.f7596c) >= i15 && i17 <= i14) {
                if (i17 == i2) {
                    j1Var.l(i10 - i2, z10);
                } else {
                    j1Var.l(i16, z10);
                }
                if (RecyclerView.f1617w1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i20 + " holder " + j1Var);
                }
            }
            i20++;
            z10 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1627d1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(j7.j1 r9, a6.u r10, a6.u r11) {
        /*
            r8 = this;
            r0 = 0
            r9.n(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r8.A
            j7.q0 r1 = r0.I0
            r2 = r1
            j7.i r2 = (j7.i) r2
            if (r10 == 0) goto L1d
            r2.getClass()
            int r4 = r10.f515a
            int r6 = r11.f515a
            if (r4 != r6) goto L1f
            int r1 = r10.f516b
            int r3 = r11.f516b
            if (r1 == r3) goto L1d
            goto L1f
        L1d:
            r3 = r9
            goto L29
        L1f:
            int r5 = r10.f516b
            int r7 = r11.f516b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L38
        L29:
            r2.l(r3)
            android.view.View r9 = r3.f7594a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f7581i
            r9.add(r3)
            r9 = 1
        L38:
            if (r9 == 0) goto L3d
            r0.X()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.i0.f(j7.j1, a6.u, a6.u):void");
    }

    public void g(j1 j1Var, a6.u uVar, a6.u uVar2) {
        int i2;
        int i10;
        boolean z10;
        RecyclerView recyclerView = this.A;
        recyclerView.L.p(j1Var);
        recyclerView.h(j1Var);
        j1Var.n(false);
        i iVar = (i) recyclerView.I0;
        iVar.getClass();
        int i11 = uVar.f515a;
        int i12 = uVar.f516b;
        View view = j1Var.f7594a;
        if (uVar2 == null) {
            i2 = view.getLeft();
        } else {
            i2 = uVar2.f515a;
        }
        int i13 = i2;
        if (uVar2 == null) {
            i10 = view.getTop();
        } else {
            i10 = uVar2.f516b;
        }
        int i14 = i10;
        if (!j1Var.h() && (i11 != i13 || i12 != i14)) {
            view.layout(i13, i14, view.getWidth() + i13, view.getHeight() + i14);
            z10 = iVar.g(j1Var, i11, i12, i13, i14);
        } else {
            iVar.l(j1Var);
            iVar.f7580h.add(j1Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.X();
        }
    }

    public void h(int i2) {
        RecyclerView recyclerView = this.A;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i2);
    }

    @Override // a6.i
    public boolean i(float f8) {
        int i2;
        int i10;
        RecyclerView recyclerView = this.A;
        if (recyclerView.f1640k0.e()) {
            i10 = (int) f8;
            i2 = 0;
        } else if (recyclerView.f1640k0.d()) {
            i2 = (int) f8;
            i10 = 0;
        } else {
            i2 = 0;
            i10 = 0;
        }
        if (i2 == 0 && i10 == 0) {
            return false;
        }
        recyclerView.p0();
        return recyclerView.I(i2, i10, 0, Preference.DEFAULT_ORDER);
    }

    @Override // a6.i
    public float o() {
        float f8;
        RecyclerView recyclerView = this.A;
        if (recyclerView.f1640k0.e()) {
            f8 = recyclerView.V0;
        } else if (recyclerView.f1640k0.d()) {
            f8 = recyclerView.U0;
        } else {
            return 0.0f;
        }
        return -f8;
    }

    @Override // a6.i
    public void r() {
        this.A.p0();
    }
}
