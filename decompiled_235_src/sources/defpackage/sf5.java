package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sf5  reason: default package */
/* loaded from: classes.dex */
public final class sf5 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ RecyclerView B;

    public /* synthetic */ sf5(RecyclerView recyclerView, int i) {
        this.A = i;
        this.B = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        long j;
        int i = this.A;
        RecyclerView recyclerView = this.B;
        switch (i) {
            case 0:
                if (recyclerView.t0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.r0) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.w0) {
                        recyclerView.v0 = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                cg5 cg5Var = recyclerView.L0;
                if (cg5Var != null) {
                    ke1 ke1Var = (ke1) cg5Var;
                    long j2 = ke1Var.d;
                    ArrayList arrayList = ke1Var.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = ke1Var.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = ke1Var.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = ke1Var.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            wg5 wg5Var = (wg5) obj;
                            View view = wg5Var.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            ke1Var.q.add(wg5Var);
                            animate.setDuration(j2).alpha(RecyclerView.B1).setListener(new fe1(ke1Var, wg5Var, animate, view)).start();
                            arrayList = arrayList5;
                            isEmpty = isEmpty;
                            isEmpty2 = isEmpty2;
                        }
                        boolean z2 = isEmpty;
                        boolean z3 = isEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            ke1Var.m.add(arrayList6);
                            arrayList2.clear();
                            ee1 ee1Var = new ee1(ke1Var, arrayList6, 0);
                            if (!z2) {
                                View view2 = ((je1) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = ao7.a;
                                view2.postOnAnimationDelayed(ee1Var, j2);
                            } else {
                                ee1Var.run();
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            ke1Var.n.add(arrayList7);
                            arrayList3.clear();
                            ee1 ee1Var2 = new ee1(ke1Var, arrayList7, 1);
                            if (!z2) {
                                View view3 = ((ie1) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = ao7.a;
                                view3.postOnAnimationDelayed(ee1Var2, j2);
                            } else {
                                ee1Var2.run();
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            ke1Var.l.add(arrayList8);
                            arrayList4.clear();
                            ee1 ee1Var3 = new ee1(ke1Var, arrayList8, 2);
                            if (z2 && z3 && isEmpty3) {
                                ee1Var3.run();
                            } else {
                                long j3 = 0;
                                if (z2) {
                                    j2 = 0;
                                }
                                if (!z3) {
                                    j = ke1Var.e;
                                } else {
                                    j = 0;
                                }
                                if (!isEmpty3) {
                                    j3 = ke1Var.f;
                                }
                                long max = Math.max(j, j3) + j2;
                                z = false;
                                View view4 = ((wg5) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = ao7.a;
                                view4.postOnAnimationDelayed(ee1Var3, max);
                                recyclerView.j1 = z;
                                return;
                            }
                        }
                    }
                }
                z = false;
                recyclerView.j1 = z;
                return;
        }
    }
}
