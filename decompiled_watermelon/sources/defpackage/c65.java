package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c65  reason: default package */
/* loaded from: classes.dex */
public final class c65 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ RecyclerView B;

    public /* synthetic */ c65(RecyclerView recyclerView, int i) {
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
                if (recyclerView.s0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.q0) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.v0) {
                        recyclerView.u0 = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                m65 m65Var = recyclerView.K0;
                if (m65Var != null) {
                    oa1 oa1Var = (oa1) m65Var;
                    long j2 = oa1Var.d;
                    ArrayList arrayList = oa1Var.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = oa1Var.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = oa1Var.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = oa1Var.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            g75 g75Var = (g75) obj;
                            View view = g75Var.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            oa1Var.q.add(g75Var);
                            animate.setDuration(j2).alpha(RecyclerView.A1).setListener(new ja1(oa1Var, g75Var, animate, view)).start();
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
                            oa1Var.m.add(arrayList6);
                            arrayList2.clear();
                            ia1 ia1Var = new ia1(oa1Var, arrayList6, 0);
                            if (!z2) {
                                View view2 = ((na1) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = aa7.a;
                                view2.postOnAnimationDelayed(ia1Var, j2);
                            } else {
                                ia1Var.run();
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            oa1Var.n.add(arrayList7);
                            arrayList3.clear();
                            ia1 ia1Var2 = new ia1(oa1Var, arrayList7, 1);
                            if (!z2) {
                                View view3 = ((ma1) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = aa7.a;
                                view3.postOnAnimationDelayed(ia1Var2, j2);
                            } else {
                                ia1Var2.run();
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            oa1Var.l.add(arrayList8);
                            arrayList4.clear();
                            ia1 ia1Var3 = new ia1(oa1Var, arrayList8, 2);
                            if (z2 && z3 && isEmpty3) {
                                ia1Var3.run();
                            } else {
                                long j3 = 0;
                                if (z2) {
                                    j2 = 0;
                                }
                                if (!z3) {
                                    j = oa1Var.e;
                                } else {
                                    j = 0;
                                }
                                if (!isEmpty3) {
                                    j3 = oa1Var.f;
                                }
                                long max = Math.max(j, j3) + j2;
                                z = false;
                                View view4 = ((g75) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = aa7.a;
                                view4.postOnAnimationDelayed(ia1Var3, max);
                                recyclerView.i1 = z;
                                return;
                            }
                        }
                    }
                }
                z = false;
                recyclerView.i1 = z;
                return;
        }
    }
}
