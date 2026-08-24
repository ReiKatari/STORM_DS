package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee1  reason: default package */
/* loaded from: classes.dex */
public final class ee1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ ke1 L;

    public /* synthetic */ ee1(ke1 ke1Var, ArrayList arrayList, int i) {
        this.A = i;
        this.L = ke1Var;
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
                    ke1 ke1Var = this.L;
                    if (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        je1 je1Var = (je1) obj;
                        wg5 wg5Var = je1Var.a;
                        int i3 = je1Var.b;
                        int i4 = je1Var.c;
                        int i5 = je1Var.d;
                        int i6 = je1Var.e;
                        ke1Var.getClass();
                        View view2 = wg5Var.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view2.animate().translationX(RecyclerView.B1);
                        }
                        if (i8 != 0) {
                            view2.animate().translationY(RecyclerView.B1);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        ke1Var.p.add(wg5Var);
                        animate.setDuration(ke1Var.e).setListener(new ge1(ke1Var, wg5Var, i7, view2, i8, animate)).start();
                    } else {
                        arrayList.clear();
                        ke1Var.m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    ke1 ke1Var2 = this.L;
                    if (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        ie1 ie1Var = (ie1) obj2;
                        ArrayList arrayList2 = ke1Var2.r;
                        long j = ke1Var2.f;
                        wg5 wg5Var2 = ie1Var.a;
                        View view3 = null;
                        if (wg5Var2 == null) {
                            view = null;
                        } else {
                            view = wg5Var2.a;
                        }
                        wg5 wg5Var3 = ie1Var.b;
                        if (wg5Var3 != null) {
                            view3 = wg5Var3.a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList2.add(ie1Var.a);
                            duration.translationX(ie1Var.e - ie1Var.c);
                            duration.translationY(ie1Var.f - ie1Var.d);
                            duration.alpha(RecyclerView.B1).setListener(new he1(ke1Var2, ie1Var, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList2.add(ie1Var.b);
                            c = 0;
                            animate2.translationX(RecyclerView.B1).translationY(RecyclerView.B1).setDuration(j).alpha(1.0f).setListener(new he1(ke1Var2, ie1Var, animate2, view4, 1)).start();
                        } else {
                            c = 0;
                        }
                    } else {
                        arrayList.clear();
                        ke1Var2.n.remove(arrayList);
                        return;
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    ke1 ke1Var3 = this.L;
                    if (i2 < size3) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        wg5 wg5Var4 = (wg5) obj3;
                        ke1Var3.getClass();
                        View view5 = wg5Var4.a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        ke1Var3.o.add(wg5Var4);
                        animate3.alpha(1.0f).setDuration(ke1Var3.c).setListener(new fe1(ke1Var3, wg5Var4, view5, animate3)).start();
                    } else {
                        arrayList.clear();
                        ke1Var3.l.remove(arrayList);
                        return;
                    }
                }
        }
    }
}
