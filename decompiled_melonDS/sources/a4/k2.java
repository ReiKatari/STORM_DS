package a4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a  reason: collision with root package name */
    public int f248a;

    /* renamed from: b  reason: collision with root package name */
    public Object f249b;

    /* renamed from: c  reason: collision with root package name */
    public Object f250c;

    /* renamed from: d  reason: collision with root package name */
    public Object f251d;

    /* renamed from: e  reason: collision with root package name */
    public Object f252e;

    /* renamed from: f  reason: collision with root package name */
    public Object f253f;

    public k2() {
        this.f249b = new y3.s[32];
        this.f250c = new float[32];
        this.f251d = new byte[32];
        a1.n0 n0Var = a1.v0.f110a;
        this.f252e = new a1.n0();
        this.f253f = new a1.n0();
    }

    public void a() {
        View view = (View) this.f249b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((pi.l) this.f251d) != null) {
                if (((pi.l) this.f253f) == null) {
                    this.f253f = new Object();
                }
                pi.l lVar = (pi.l) this.f253f;
                lVar.f11753c = null;
                lVar.f11752b = false;
                lVar.f11754d = null;
                lVar.f11751a = false;
                WeakHashMap weakHashMap = a6.x0.f533a;
                ColorStateList c4 = a6.p0.c(view);
                if (c4 != null) {
                    lVar.f11752b = true;
                    lVar.f11753c = c4;
                }
                PorterDuff.Mode d4 = a6.p0.d(view);
                if (d4 != null) {
                    lVar.f11751a = true;
                    lVar.f11754d = d4;
                }
                if (lVar.f11752b || lVar.f11751a) {
                    q.r.e(background, lVar, view.getDrawableState());
                    return;
                }
            }
            pi.l lVar2 = (pi.l) this.f252e;
            if (lVar2 != null) {
                q.r.e(background, lVar2, view.getDrawableState());
                return;
            }
            pi.l lVar3 = (pi.l) this.f251d;
            if (lVar3 != null) {
                q.r.e(background, lVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i2) {
        ArrayList arrayList = (ArrayList) this.f251d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j7.a aVar = (j7.a) arrayList.get(i10);
            int i11 = aVar.f7486a;
            if (i11 == 8) {
                if (g(aVar.f7489d, i10 + 1) == i2) {
                    return true;
                }
            } else {
                if (i11 == 1) {
                    int i12 = aVar.f7487b;
                    int i13 = aVar.f7489d + i12;
                    while (i12 < i13) {
                        if (g(i12, i10 + 1) == i2) {
                            return true;
                        }
                        i12++;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f251d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((j7.i0) this.f252e).a((j7.a) arrayList.get(i2));
        }
        r(arrayList);
        this.f248a = 0;
    }

    public void d() {
        j7.i0 i0Var = (j7.i0) this.f252e;
        c();
        ArrayList arrayList = (ArrayList) this.f250c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            j7.a aVar = (j7.a) arrayList.get(i2);
            int i10 = aVar.f7486a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            i0Var.a(aVar);
                            i0Var.e(aVar.f7487b, aVar.f7489d);
                        }
                    } else {
                        i0Var.a(aVar);
                        i0Var.c(aVar.f7487b, aVar.f7489d, aVar.f7488c);
                    }
                } else {
                    i0Var.a(aVar);
                    int i11 = aVar.f7487b;
                    int i12 = aVar.f7489d;
                    RecyclerView recyclerView = i0Var.A;
                    recyclerView.T(i11, true, i12);
                    recyclerView.f1627d1 = true;
                    recyclerView.f1621a1.f7552c += i12;
                }
            } else {
                i0Var.a(aVar);
                i0Var.d(aVar.f7487b, aVar.f7489d);
            }
        }
        r(arrayList);
        this.f248a = 0;
    }

    public void e(j7.a aVar) {
        int i2;
        c5.d dVar = (c5.d) this.f249b;
        int i10 = aVar.f7486a;
        if (i10 != 1 && i10 != 8) {
            int v10 = v(aVar.f7487b, i10);
            int i11 = aVar.f7487b;
            int i12 = aVar.f7486a;
            if (i12 != 2) {
                if (i12 == 4) {
                    i2 = 1;
                } else {
                    fj.j.r(aVar, "op should be remove or update.");
                    return;
                }
            } else {
                i2 = 0;
            }
            int i13 = 1;
            for (int i14 = 1; i14 < aVar.f7489d; i14++) {
                int v11 = v((i2 * i14) + aVar.f7487b, aVar.f7486a);
                int i15 = aVar.f7486a;
                if (i15 == 2 ? v11 == v10 : !(i15 != 4 || v11 != v10 + 1)) {
                    i13++;
                } else {
                    j7.a m = m(aVar.f7488c, i15, v10, i13);
                    f(m, i11);
                    m.f7488c = null;
                    dVar.c(m);
                    if (aVar.f7486a == 4) {
                        i11 += i13;
                    }
                    i13 = 1;
                    v10 = v11;
                }
            }
            Object obj = aVar.f7488c;
            aVar.f7488c = null;
            dVar.c(aVar);
            if (i13 > 0) {
                j7.a m10 = m(obj, aVar.f7486a, v10, i13);
                f(m10, i11);
                m10.f7488c = null;
                dVar.c(m10);
                return;
            }
            return;
        }
        a0.j.h("should not dispatch add or move for pre layout");
    }

    public void f(j7.a aVar, int i2) {
        j7.i0 i0Var = (j7.i0) this.f252e;
        i0Var.a(aVar);
        int i10 = aVar.f7486a;
        if (i10 != 2) {
            if (i10 == 4) {
                i0Var.c(i2, aVar.f7489d, aVar.f7488c);
                return;
            } else {
                a0.j.h("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i11 = aVar.f7489d;
        RecyclerView recyclerView = i0Var.A;
        recyclerView.T(i2, true, i11);
        recyclerView.f1627d1 = true;
        recyclerView.f1621a1.f7552c += i11;
    }

    public int g(int i2, int i10) {
        ArrayList arrayList = (ArrayList) this.f251d;
        int size = arrayList.size();
        while (i10 < size) {
            j7.a aVar = (j7.a) arrayList.get(i10);
            int i11 = aVar.f7486a;
            int i12 = aVar.f7487b;
            if (i11 == 8) {
                if (i12 == i2) {
                    i2 = aVar.f7489d;
                } else {
                    if (i12 < i2) {
                        i2--;
                    }
                    if (aVar.f7489d <= i2) {
                        i2++;
                    }
                }
            } else if (i12 > i2) {
                continue;
            } else if (i11 == 2) {
                int i13 = aVar.f7489d;
                if (i2 < i12 + i13) {
                    return -1;
                }
                i2 -= i13;
            } else if (i11 == 1) {
                i2 += aVar.f7489d;
            }
            i10++;
        }
        return i2;
    }

    public ColorStateList h() {
        pi.l lVar = (pi.l) this.f252e;
        if (lVar != null) {
            return (ColorStateList) lVar.f11753c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        pi.l lVar = (pi.l) this.f252e;
        if (lVar != null) {
            return (PorterDuff.Mode) lVar.f11754d;
        }
        return null;
    }

    public boolean j() {
        if (((ArrayList) this.f250c).size() > 0) {
            return true;
        }
        return false;
    }

    public void k(AttributeSet attributeSet, int i2) {
        ColorStateList f8;
        View view = (View) this.f249b;
        Context context = view.getContext();
        int[] iArr = k.a.A;
        p1.c1 o5 = p1.c1.o(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) o5.B;
        View view2 = (View) this.f249b;
        a6.x0.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) o5.B, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f248a = typedArray.getResourceId(0, -1);
                q.r rVar = (q.r) this.f250c;
                Context context2 = view.getContext();
                int i10 = this.f248a;
                synchronized (rVar) {
                    f8 = rVar.f12003a.f(context2, i10);
                }
                if (f8 != null) {
                    s(f8);
                }
            }
            if (typedArray.hasValue(1)) {
                a6.p0.h(view, o5.e(1));
            }
            if (typedArray.hasValue(2)) {
                a6.p0.i(view, q.l1.c(typedArray.getInt(2, -1), null));
            }
            o5.p();
        } catch (Throwable th2) {
            o5.p();
            throw th2;
        }
    }

    public a7.w l(String str) {
        a7.t tVar;
        str.getClass();
        yb.n nVar = (yb.n) this.f253f;
        if (nVar != null && (tVar = (a7.t) nVar.getValue()) != null) {
            int i2 = a7.x.X;
            Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
            parse.getClass();
            Bundle d4 = tVar.d(parse, (LinkedHashMap) this.f251d);
            if (d4 != null) {
                return new a7.w((a7.x) this.f249b, d4, tVar.f629l, tVar.b(parse), false);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j7.a, java.lang.Object] */
    public j7.a m(Object obj, int i2, int i10, int i11) {
        j7.a aVar = (j7.a) ((c5.d) this.f249b).a();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f7486a = i2;
            obj2.f7487b = i10;
            obj2.f7489d = i11;
            obj2.f7488c = obj;
            return obj2;
        }
        aVar.f7486a = i2;
        aVar.f7487b = i10;
        aVar.f7489d = i11;
        aVar.f7488c = obj;
        return aVar;
    }

    public void n() {
        this.f248a = -1;
        s(null);
        a();
    }

    public void o(int i2) {
        ColorStateList colorStateList;
        this.f248a = i2;
        q.r rVar = (q.r) this.f250c;
        if (rVar != null) {
            Context context = ((View) this.f249b).getContext();
            synchronized (rVar) {
                colorStateList = rVar.f12003a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(j7.a aVar) {
        j7.i0 i0Var = (j7.i0) this.f252e;
        ((ArrayList) this.f251d).add(aVar);
        int i2 = aVar.f7486a;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 == 8) {
                        i0Var.e(aVar.f7487b, aVar.f7489d);
                        return;
                    } else {
                        fj.j.r(aVar, "Unknown update op type for ");
                        return;
                    }
                }
                i0Var.c(aVar.f7487b, aVar.f7489d, aVar.f7488c);
                return;
            }
            int i10 = aVar.f7487b;
            int i11 = aVar.f7489d;
            RecyclerView recyclerView = i0Var.A;
            recyclerView.T(i10, false, i11);
            recyclerView.f1627d1 = true;
            return;
        }
        i0Var.d(aVar.f7487b, aVar.f7489d);
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.k2.q():void");
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            j7.a aVar = (j7.a) arrayList.get(i2);
            aVar.f7488c = null;
            ((c5.d) this.f249b).c(aVar);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((pi.l) this.f251d) == null) {
                this.f251d = new Object();
            }
            pi.l lVar = (pi.l) this.f251d;
            lVar.f11753c = colorStateList;
            lVar.f11752b = true;
        } else {
            this.f251d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((pi.l) this.f252e) == null) {
            this.f252e = new Object();
        }
        pi.l lVar = (pi.l) this.f252e;
        lVar.f11753c = colorStateList;
        lVar.f11752b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((pi.l) this.f252e) == null) {
            this.f252e = new Object();
        }
        pi.l lVar = (pi.l) this.f252e;
        lVar.f11754d = mode;
        lVar.f11751a = true;
        a();
    }

    public int v(int i2, int i10) {
        int i11;
        int i12;
        c5.d dVar = (c5.d) this.f249b;
        ArrayList arrayList = (ArrayList) this.f251d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j7.a aVar = (j7.a) arrayList.get(size);
            int i13 = aVar.f7486a;
            int i14 = aVar.f7487b;
            if (i13 == 8) {
                int i15 = aVar.f7489d;
                if (i14 < i15) {
                    i12 = i15;
                    i11 = i14;
                } else {
                    i11 = i15;
                    i12 = i14;
                }
                if (i2 >= i11 && i2 <= i12) {
                    if (i11 == i14) {
                        if (i10 == 1) {
                            aVar.f7489d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.f7489d = i15 - 1;
                        }
                        i2++;
                    } else {
                        if (i10 == 1) {
                            aVar.f7487b = i14 + 1;
                        } else if (i10 == 2) {
                            aVar.f7487b = i14 - 1;
                        }
                        i2--;
                    }
                } else if (i2 < i14) {
                    if (i10 == 1) {
                        aVar.f7487b = i14 + 1;
                        aVar.f7489d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f7487b = i14 - 1;
                        aVar.f7489d = i15 - 1;
                    }
                }
            } else if (i14 <= i2) {
                if (i13 == 1) {
                    i2 -= aVar.f7489d;
                } else if (i13 == 2) {
                    i2 += aVar.f7489d;
                }
            } else if (i10 == 1) {
                aVar.f7487b = i14 + 1;
            } else if (i10 == 2) {
                aVar.f7487b = i14 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            j7.a aVar2 = (j7.a) arrayList.get(size2);
            int i16 = aVar2.f7486a;
            int i17 = aVar2.f7489d;
            if (i16 == 8) {
                if (i17 == aVar2.f7487b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.f7488c = null;
                    dVar.c(aVar2);
                }
            } else if (i17 <= 0) {
                arrayList.remove(size2);
                aVar2.f7488c = null;
                dVar.c(aVar2);
            }
        }
        return i2;
    }

    public k2(View view) {
        this.f248a = -1;
        this.f249b = view;
        this.f250c = q.r.a();
    }
}
