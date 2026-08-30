package j7;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ RecyclerView B;

    public /* synthetic */ h0(RecyclerView recyclerView, int i2) {
        this.A = i2;
        this.B = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        long j2;
        int i2 = this.A;
        RecyclerView recyclerView = this.B;
        switch (i2) {
            case 0:
                if (recyclerView.f1653r0 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.p0) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.f1659u0) {
                        recyclerView.f1657t0 = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                q0 q0Var = recyclerView.I0;
                if (q0Var != null) {
                    i iVar = (i) q0Var;
                    long j10 = iVar.f7653d;
                    ArrayList arrayList = iVar.f7580h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = iVar.f7582j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = iVar.f7583k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = iVar.f7581i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            int i11 = i10 + 1;
                            j1 j1Var = (j1) obj;
                            View view = j1Var.f7594a;
                            ViewPropertyAnimator animate = view.animate();
                            iVar.f7588q.add(j1Var);
                            animate.setDuration(j10).alpha(0.0f).setListener(new d(iVar, j1Var, animate, view)).start();
                            i10 = i11;
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z11 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            iVar.m.add(arrayList5);
                            arrayList2.clear();
                            c cVar = new c(iVar, arrayList5, 0);
                            if (!z11) {
                                View view2 = ((h) arrayList5.get(0)).f7573a.f7594a;
                                WeakHashMap weakHashMap = a6.x0.f533a;
                                view2.postOnAnimationDelayed(cVar, j10);
                            } else {
                                cVar.run();
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            iVar.f7585n.add(arrayList6);
                            arrayList3.clear();
                            c cVar2 = new c(iVar, arrayList6, 1);
                            if (!z11) {
                                View view3 = ((g) arrayList6.get(0)).f7563a.f7594a;
                                WeakHashMap weakHashMap2 = a6.x0.f533a;
                                view3.postOnAnimationDelayed(cVar2, j10);
                            } else {
                                cVar2.run();
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            iVar.f7584l.add(arrayList7);
                            arrayList4.clear();
                            c cVar3 = new c(iVar, arrayList7, 2);
                            if (z11 && isEmpty2 && isEmpty3) {
                                cVar3.run();
                            } else {
                                long j11 = 0;
                                if (z11) {
                                    j10 = 0;
                                }
                                if (!isEmpty2) {
                                    j2 = iVar.f7654e;
                                } else {
                                    j2 = 0;
                                }
                                if (!isEmpty3) {
                                    j11 = iVar.f7655f;
                                }
                                z10 = false;
                                View view4 = ((j1) arrayList7.get(0)).f7594a;
                                WeakHashMap weakHashMap3 = a6.x0.f533a;
                                view4.postOnAnimationDelayed(cVar3, Math.max(j2, j11) + j10);
                                recyclerView.f1633g1 = z10;
                                return;
                            }
                        }
                    }
                }
                z10 = false;
                recyclerView.f1633g1 = z10;
                return;
        }
    }
}
