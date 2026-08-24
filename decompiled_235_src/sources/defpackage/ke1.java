package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke1  reason: default package */
/* loaded from: classes.dex */
public final class ke1 extends cg5 {
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
            ((wg5) arrayList.get(size)).a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [ie1, java.lang.Object] */
    @Override // defpackage.cg5
    public final boolean a(wg5 wg5Var, wg5 wg5Var2, dy7 dy7Var, dy7 dy7Var2) {
        int i;
        int i2;
        int i3 = dy7Var.a;
        int i4 = dy7Var.b;
        if (wg5Var2.o()) {
            int i5 = dy7Var.a;
            i2 = dy7Var.b;
            i = i5;
        } else {
            i = dy7Var2.a;
            i2 = dy7Var2.b;
        }
        if (wg5Var == wg5Var2) {
            return g(wg5Var, i3, i4, i, i2);
        }
        View view = wg5Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(wg5Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = wg5Var2.a;
        l(wg5Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(RecyclerView.B1);
        ArrayList arrayList = this.k;
        ?? obj = new Object();
        obj.a = wg5Var;
        obj.b = wg5Var2;
        obj.c = i3;
        obj.d = i4;
        obj.e = i;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    @Override // defpackage.cg5
    public final void d(wg5 wg5Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = wg5Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((je1) arrayList4.get(size)).a == wg5Var) {
                view.setTranslationY(RecyclerView.B1);
                view.setTranslationX(RecyclerView.B1);
                c(wg5Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, wg5Var);
        if (this.h.remove(wg5Var)) {
            view.setAlpha(1.0f);
            c(wg5Var);
        }
        if (this.i.remove(wg5Var)) {
            view.setAlpha(1.0f);
            c(wg5Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, wg5Var);
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
                } else if (((je1) arrayList6.get(size4)).a == wg5Var) {
                    view.setTranslationY(RecyclerView.B1);
                    view.setTranslationX(RecyclerView.B1);
                    c(wg5Var);
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
            if (arrayList7.remove(wg5Var)) {
                view.setAlpha(1.0f);
                c(wg5Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(wg5Var);
        this.o.remove(wg5Var);
        this.r.remove(wg5Var);
        this.p.remove(wg5Var);
        i();
    }

    @Override // defpackage.cg5
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
            je1 je1Var = (je1) arrayList7.get(size);
            View view = je1Var.a.a;
            view.setTranslationY(RecyclerView.B1);
            view.setTranslationX(RecyclerView.B1);
            c(je1Var.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((wg5) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            wg5 wg5Var = (wg5) arrayList5.get(size3);
            wg5Var.a.setAlpha(1.0f);
            c(wg5Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            ie1 ie1Var = (ie1) arrayList.get(size4);
            wg5 wg5Var2 = ie1Var.a;
            if (wg5Var2 != null) {
                k(ie1Var, wg5Var2);
            }
            wg5 wg5Var3 = ie1Var.b;
            if (wg5Var3 != null) {
                k(ie1Var, wg5Var3);
            }
        }
        arrayList.clear();
        if (!f()) {
            return;
        }
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
            for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                je1 je1Var2 = (je1) arrayList8.get(size6);
                View view2 = je1Var2.a.a;
                view2.setTranslationY(RecyclerView.B1);
                view2.setTranslationX(RecyclerView.B1);
                c(je1Var2.a);
                arrayList8.remove(size6);
                if (arrayList8.isEmpty()) {
                    arrayList4.remove(arrayList8);
                }
            }
        }
        for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
            for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                wg5 wg5Var4 = (wg5) arrayList9.get(size8);
                wg5Var4.a.setAlpha(1.0f);
                c(wg5Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList3.remove(arrayList9);
                }
            }
        }
        for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ie1 ie1Var2 = (ie1) arrayList10.get(size10);
                wg5 wg5Var5 = ie1Var2.a;
                if (wg5Var5 != null) {
                    k(ie1Var2, wg5Var5);
                }
                wg5 wg5Var6 = ie1Var2.b;
                if (wg5Var6 != null) {
                    k(ie1Var2, wg5Var6);
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
        u34.a();
    }

    @Override // defpackage.cg5
    public final boolean f() {
        if (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [je1, java.lang.Object] */
    public final boolean g(wg5 wg5Var, int i, int i2, int i3, int i4) {
        View view = wg5Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) wg5Var.a.getTranslationY());
        l(wg5Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(wg5Var);
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
        obj.a = wg5Var;
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
            u34.a();
        }
    }

    public final void j(ArrayList arrayList, wg5 wg5Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ie1 ie1Var = (ie1) arrayList.get(size);
            if (k(ie1Var, wg5Var) && ie1Var.a == null && ie1Var.b == null) {
                arrayList.remove(ie1Var);
            }
        }
    }

    public final boolean k(ie1 ie1Var, wg5 wg5Var) {
        if (ie1Var.b == wg5Var) {
            ie1Var.b = null;
        } else if (ie1Var.a == wg5Var) {
            ie1Var.a = null;
        } else {
            return false;
        }
        View view = wg5Var.a;
        View view2 = wg5Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(RecyclerView.B1);
        view2.setTranslationY(RecyclerView.B1);
        c(wg5Var);
        return true;
    }

    public final void l(wg5 wg5Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        wg5Var.a.animate().setInterpolator(s);
        d(wg5Var);
    }
}
