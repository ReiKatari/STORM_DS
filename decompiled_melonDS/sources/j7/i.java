package j7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends q0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f7578s;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7579g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f7580h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f7581i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f7582j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f7583k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f7584l;
    public ArrayList m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f7585n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f7586o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f7587p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f7588q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f7589r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((j1) arrayList.get(size)).f7594a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [j7.g, java.lang.Object] */
    @Override // j7.q0
    public final boolean a(j1 j1Var, j1 j1Var2, a6.u uVar, a6.u uVar2) {
        int i2;
        int i10;
        int i11 = uVar.f515a;
        int i12 = uVar.f516b;
        if (j1Var2.o()) {
            int i13 = uVar.f515a;
            i10 = uVar.f516b;
            i2 = i13;
        } else {
            i2 = uVar2.f515a;
            i10 = uVar2.f516b;
        }
        if (j1Var == j1Var2) {
            return g(j1Var, i11, i12, i2, i10);
        }
        View view = j1Var.f7594a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(j1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = j1Var2.f7594a;
        l(j1Var2);
        view2.setTranslationX(-((int) ((i2 - i11) - translationX)));
        view2.setTranslationY(-((int) ((i10 - i12) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f7583k;
        ?? obj = new Object();
        obj.f7563a = j1Var;
        obj.f7564b = j1Var2;
        obj.f7565c = i11;
        obj.f7566d = i12;
        obj.f7567e = i2;
        obj.f7568f = i10;
        arrayList.add(obj);
        return true;
    }

    @Override // j7.q0
    public final void d(j1 j1Var) {
        ArrayList arrayList = this.f7584l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.f7585n;
        View view = j1Var.f7594a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f7582j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((h) arrayList4.get(size)).f7573a == j1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(j1Var);
                arrayList4.remove(size);
            }
        }
        j(this.f7583k, j1Var);
        if (this.f7580h.remove(j1Var)) {
            view.setAlpha(1.0f);
            c(j1Var);
        }
        if (this.f7581i.remove(j1Var)) {
            view.setAlpha(1.0f);
            c(j1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, j1Var);
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
                } else if (((h) arrayList6.get(size4)).f7573a == j1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(j1Var);
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
            if (arrayList7.remove(j1Var)) {
                view.setAlpha(1.0f);
                c(j1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f7588q.remove(j1Var);
        this.f7586o.remove(j1Var);
        this.f7589r.remove(j1Var);
        this.f7587p.remove(j1Var);
        i();
    }

    @Override // j7.q0
    public final void e() {
        ArrayList arrayList = this.f7583k;
        ArrayList arrayList2 = this.f7585n;
        ArrayList arrayList3 = this.f7584l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.f7581i;
        ArrayList arrayList6 = this.f7580h;
        ArrayList arrayList7 = this.f7582j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            h hVar = (h) arrayList7.get(size);
            View view = hVar.f7573a.f7594a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(hVar.f7573a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((j1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            j1 j1Var = (j1) arrayList5.get(size3);
            j1Var.f7594a.setAlpha(1.0f);
            c(j1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            g gVar = (g) arrayList.get(size4);
            j1 j1Var2 = gVar.f7563a;
            if (j1Var2 != null) {
                k(gVar, j1Var2);
            }
            j1 j1Var3 = gVar.f7564b;
            if (j1Var3 != null) {
                k(gVar, j1Var3);
            }
        }
        arrayList.clear();
        if (!f()) {
            return;
        }
        for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
            for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                h hVar2 = (h) arrayList8.get(size6);
                View view2 = hVar2.f7573a.f7594a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(hVar2.f7573a);
                arrayList8.remove(size6);
                if (arrayList8.isEmpty()) {
                    arrayList4.remove(arrayList8);
                }
            }
        }
        for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
            for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                j1 j1Var4 = (j1) arrayList9.get(size8);
                j1Var4.f7594a.setAlpha(1.0f);
                c(j1Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList3.remove(arrayList9);
                }
            }
        }
        for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                g gVar2 = (g) arrayList10.get(size10);
                j1 j1Var5 = gVar2.f7563a;
                if (j1Var5 != null) {
                    k(gVar2, j1Var5);
                }
                j1 j1Var6 = gVar2.f7564b;
                if (j1Var6 != null) {
                    k(gVar2, j1Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList2.remove(arrayList10);
                }
            }
        }
        h(this.f7588q);
        h(this.f7587p);
        h(this.f7586o);
        h(this.f7589r);
        ArrayList arrayList11 = this.f7651b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
            return;
        }
        arrayList11.get(0).getClass();
        m9.o.b();
    }

    @Override // j7.q0
    public final boolean f() {
        if (this.f7581i.isEmpty() && this.f7583k.isEmpty() && this.f7582j.isEmpty() && this.f7580h.isEmpty() && this.f7587p.isEmpty() && this.f7588q.isEmpty() && this.f7586o.isEmpty() && this.f7589r.isEmpty() && this.m.isEmpty() && this.f7584l.isEmpty() && this.f7585n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [j7.h, java.lang.Object] */
    public final boolean g(j1 j1Var, int i2, int i10, int i11, int i12) {
        View view = j1Var.f7594a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) j1Var.f7594a.getTranslationY());
        l(j1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(j1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.f7582j;
        ?? obj = new Object();
        obj.f7573a = j1Var;
        obj.f7574b = translationX;
        obj.f7575c = translationY;
        obj.f7576d = i11;
        obj.f7577e = i12;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f7651b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
                return;
            }
            arrayList.get(0).getClass();
            m9.o.b();
        }
    }

    public final void j(ArrayList arrayList, j1 j1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar = (g) arrayList.get(size);
            if (k(gVar, j1Var) && gVar.f7563a == null && gVar.f7564b == null) {
                arrayList.remove(gVar);
            }
        }
    }

    public final boolean k(g gVar, j1 j1Var) {
        if (gVar.f7564b == j1Var) {
            gVar.f7564b = null;
        } else if (gVar.f7563a == j1Var) {
            gVar.f7563a = null;
        } else {
            return false;
        }
        View view = j1Var.f7594a;
        View view2 = j1Var.f7594a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(j1Var);
        return true;
    }

    public final void l(j1 j1Var) {
        if (f7578s == null) {
            f7578s = new ValueAnimator().getInterpolator();
        }
        j1Var.f7594a.animate().setInterpolator(f7578s);
        d(j1Var);
    }
}
