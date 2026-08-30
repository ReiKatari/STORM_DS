package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ia1  reason: default package */
/* loaded from: classes.dex */
public final class ia1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ oa1 L;

    public /* synthetic */ ia1(oa1 oa1Var, ArrayList arrayList, int i) {
        this.A = i;
        this.L = oa1Var;
        this.B = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        char c;
        int i = this.A;
        int i2 = 0;
        ArrayList arrayList = this.B;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    oa1 oa1Var = this.L;
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        na1 na1Var = (na1) obj;
                        g75 g75Var = na1Var.a;
                        int i3 = na1Var.b;
                        int i4 = na1Var.c;
                        int i5 = na1Var.d;
                        int i6 = na1Var.e;
                        oa1Var.getClass();
                        View view2 = g75Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view2.animate().translationX(RecyclerView.A1);
                        }
                        if (i8 != 0) {
                            view2.animate().translationY(RecyclerView.A1);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        oa1Var.p.add(g75Var);
                        animate.setDuration(oa1Var.e).setListener(new ka1(oa1Var, g75Var, i7, view2, i8, animate)).start();
                    } else {
                        arrayList.clear();
                        oa1Var.m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    oa1 oa1Var2 = this.L;
                    if (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        ma1 ma1Var = (ma1) obj2;
                        ArrayList arrayList2 = oa1Var2.r;
                        long j = oa1Var2.f;
                        g75 g75Var2 = ma1Var.a;
                        View view3 = null;
                        if (g75Var2 == null) {
                            view = null;
                        } else {
                            view = g75Var2.a;
                        }
                        g75 g75Var3 = ma1Var.b;
                        if (g75Var3 != null) {
                            view3 = g75Var3.a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList2.add(ma1Var.a);
                            duration.translationX(ma1Var.e - ma1Var.c);
                            duration.translationY(ma1Var.f - ma1Var.d);
                            duration.alpha(RecyclerView.A1).setListener(new la1(oa1Var2, ma1Var, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList2.add(ma1Var.b);
                            c = 0;
                            animate2.translationX(RecyclerView.A1).translationY(RecyclerView.A1).setDuration(j).alpha(1.0f).setListener(new la1(oa1Var2, ma1Var, animate2, view4, 1)).start();
                        } else {
                            c = 0;
                        }
                    } else {
                        arrayList.clear();
                        oa1Var2.n.remove(arrayList);
                        return;
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    oa1 oa1Var3 = this.L;
                    if (i2 < size3) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        g75 g75Var4 = (g75) obj3;
                        oa1Var3.getClass();
                        View view5 = g75Var4.a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        oa1Var3.o.add(g75Var4);
                        animate3.alpha(1.0f).setDuration(oa1Var3.c).setListener(new ja1(oa1Var3, g75Var4, view5, animate3)).start();
                    } else {
                        arrayList.clear();
                        oa1Var3.l.remove(arrayList);
                        return;
                    }
                }
        }
    }
}
