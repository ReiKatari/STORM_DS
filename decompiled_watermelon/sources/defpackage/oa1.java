package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oa1  reason: default package */
/* loaded from: classes.dex */
public final class oa1 extends m65 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g75) arrayList.get(size)).a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, ma1] */
    @Override // defpackage.m65
    public final boolean a(g75 g75Var, g75 g75Var2, hj7 hj7Var, hj7 hj7Var2) {
        int i;
        int i2;
        int i3 = hj7Var.a;
        int i4 = hj7Var.b;
        if (g75Var2.o()) {
            int i5 = hj7Var.a;
            i2 = hj7Var.b;
            i = i5;
        } else {
            i = hj7Var2.a;
            i2 = hj7Var2.b;
        }
        if (g75Var == g75Var2) {
            return g(g75Var, i3, i4, i, i2);
        }
        View view = g75Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(g75Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = g75Var2.a;
        l(g75Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(RecyclerView.A1);
        ArrayList arrayList = this.k;
        ?? obj = new Object();
        obj.a = g75Var;
        obj.b = g75Var2;
        obj.c = i3;
        obj.d = i4;
        obj.e = i;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    @Override // defpackage.m65
    public final void d(g75 g75Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = g75Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((na1) arrayList4.get(size)).a == g75Var) {
                view.setTranslationY(RecyclerView.A1);
                view.setTranslationX(RecyclerView.A1);
                c(g75Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, g75Var);
        if (this.h.remove(g75Var)) {
            view.setAlpha(1.0f);
            c(g75Var);
        }
        if (this.i.remove(g75Var)) {
            view.setAlpha(1.0f);
            c(g75Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, g75Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((na1) arrayList6.get(size4)).a == g75Var) {
                    view.setTranslationY(RecyclerView.A1);
                    view.setTranslationX(RecyclerView.A1);
                    c(g75Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(g75Var)) {
                view.setAlpha(1.0f);
                c(g75Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(g75Var);
        this.o.remove(g75Var);
        this.r.remove(g75Var);
        this.p.remove(g75Var);
        i();
    }

    @Override // defpackage.m65
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            na1 na1Var = (na1) arrayList7.get(size);
            View view = na1Var.a.a;
            view.setTranslationY(RecyclerView.A1);
            view.setTranslationX(RecyclerView.A1);
            c(na1Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((g75) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            g75 g75Var = (g75) arrayList5.get(size3);
            g75Var.a.setAlpha(1.0f);
            c(g75Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            ma1 ma1Var = (ma1) arrayList.get(size4);
            g75 g75Var2 = ma1Var.a;
            if (g75Var2 != null) {
                k(ma1Var, g75Var2);
            }
            g75 g75Var3 = ma1Var.b;
            if (g75Var3 != null) {
                k(ma1Var, g75Var3);
            }
        }
        arrayList.clear();
        if (!f()) {
            return;
        }
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
            for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                na1 na1Var2 = (na1) arrayList8.get(size6);
                View view2 = na1Var2.a.a;
                view2.setTranslationY(RecyclerView.A1);
                view2.setTranslationX(RecyclerView.A1);
                c(na1Var2.a);
                arrayList8.remove(size6);
                if (arrayList8.isEmpty()) {
                    arrayList4.remove(arrayList8);
                }
            }
        }
        for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
            for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                g75 g75Var4 = (g75) arrayList9.get(size8);
                g75Var4.a.setAlpha(1.0f);
                c(g75Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList3.remove(arrayList9);
                }
            }
        }
        for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ma1 ma1Var2 = (ma1) arrayList10.get(size10);
                g75 g75Var5 = ma1Var2.a;
                if (g75Var5 != null) {
                    k(ma1Var2, g75Var5);
                }
                g75 g75Var6 = ma1Var2.b;
                if (g75Var6 != null) {
                    k(ma1Var2, g75Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList2.remove(arrayList10);
                }
            }
        }
        h(this.q);
        h(this.p);
        h(this.o);
        h(this.r);
        ArrayList arrayList11 = this.b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
            return;
        }
        arrayList11.get(0).getClass();
        c44.b();
    }

    @Override // defpackage.m65
    public final boolean f() {
        if (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, na1] */
    public final boolean g(g75 g75Var, int i, int i2, int i3, int i4) {
        View view = g75Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) g75Var.a.getTranslationY());
        l(g75Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(g75Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.a = g75Var;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i3;
        obj.e = i4;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
                return;
            }
            arrayList.get(0).getClass();
            c44.b();
        }
    }

    public final void j(ArrayList arrayList, g75 g75Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ma1 ma1Var = (ma1) arrayList.get(size);
            if (k(ma1Var, g75Var) && ma1Var.a == null && ma1Var.b == null) {
                arrayList.remove(ma1Var);
            }
        }
    }

    public final boolean k(ma1 ma1Var, g75 g75Var) {
        if (ma1Var.b == g75Var) {
            ma1Var.b = null;
        } else if (ma1Var.a == g75Var) {
            ma1Var.a = null;
        } else {
            return false;
        }
        View view = g75Var.a;
        View view2 = g75Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(RecyclerView.A1);
        view2.setTranslationY(RecyclerView.A1);
        c(g75Var);
        return true;
    }

    public final void l(g75 g75Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        g75Var.a.animate().setInterpolator(s);
        d(g75Var);
    }
}
