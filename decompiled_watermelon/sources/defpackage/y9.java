package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y9  reason: default package */
/* loaded from: classes.dex */
public final class y9 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public y9() {
        this.b = new gs2[32];
        this.c = new float[32];
        this.d = new byte[32];
        e24 e24Var = xu5.a;
        this.e = new e24();
        this.f = new e24();
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((zw0) this.d) != null) {
                if (((zw0) this.f) == null) {
                    this.f = new Object();
                }
                zw0 zw0Var = (zw0) this.f;
                zw0Var.c = null;
                zw0Var.b = false;
                zw0Var.d = null;
                zw0Var.a = false;
                WeakHashMap weakHashMap = aa7.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    zw0Var.b = true;
                    zw0Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    zw0Var.a = true;
                    zw0Var.d = backgroundTintMode;
                }
                if (zw0Var.b || zw0Var.a) {
                    vq.e(background, zw0Var, view.getDrawableState());
                    return;
                }
            }
            zw0 zw0Var2 = (zw0) this.e;
            if (zw0Var2 != null) {
                vq.e(background, zw0Var2, view.getDrawableState());
                return;
            }
            zw0 zw0Var3 = (zw0) this.d;
            if (zw0Var3 != null) {
                vq.e(background, zw0Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            x9 x9Var = (x9) arrayList.get(i2);
            int i3 = x9Var.a;
            if (i3 == 8) {
                if (g(x9Var.d, i2 + 1) == i) {
                    return true;
                }
            } else {
                if (i3 == 1) {
                    int i4 = x9Var.b;
                    int i5 = x9Var.d + i4;
                    while (i4 < i5) {
                        if (g(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
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
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e65) this.e).a((x9) arrayList.get(i));
        }
        r(arrayList);
        this.a = 0;
    }

    public void d() {
        e65 e65Var = (e65) this.e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x9 x9Var = (x9) arrayList.get(i);
            int i2 = x9Var.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            e65Var.a(x9Var);
                            e65Var.f(x9Var.b, x9Var.d);
                        }
                    } else {
                        e65Var.a(x9Var);
                        e65Var.c(x9Var.b, x9Var.d, x9Var.c);
                    }
                } else {
                    e65Var.a(x9Var);
                    int i3 = x9Var.b;
                    int i4 = x9Var.d;
                    RecyclerView recyclerView = e65Var.A;
                    recyclerView.T(i3, true, i4);
                    recyclerView.f1 = true;
                    recyclerView.c1.c += i4;
                }
            } else {
                e65Var.a(x9Var);
                e65Var.d(x9Var.b, x9Var.d);
            }
        }
        r(arrayList);
        this.a = 0;
    }

    public void e(x9 x9Var) {
        int i;
        pq4 pq4Var = (pq4) this.b;
        int i2 = x9Var.a;
        if (i2 != 1 && i2 != 8) {
            int v = v(x9Var.b, i2);
            int i3 = x9Var.b;
            int i4 = x9Var.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    f81.x(x9Var, "op should be remove or update.");
                    return;
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < x9Var.d; i6++) {
                int v2 = v((i * i6) + x9Var.b, x9Var.a);
                int i7 = x9Var.a;
                if (i7 == 2 ? v2 == v : !(i7 != 4 || v2 != v + 1)) {
                    i5++;
                } else {
                    x9 m = m(x9Var.c, i7, v, i5);
                    f(m, i3);
                    m.c = null;
                    pq4Var.c(m);
                    if (x9Var.a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    v = v2;
                }
            }
            Object obj = x9Var.c;
            x9Var.c = null;
            pq4Var.c(x9Var);
            if (i5 > 0) {
                x9 m2 = m(obj, x9Var.a, v, i5);
                f(m2, i3);
                m2.c = null;
                pq4Var.c(m2);
                return;
            }
            return;
        }
        i.i("should not dispatch add or move for pre layout");
    }

    public void f(x9 x9Var, int i) {
        e65 e65Var = (e65) this.e;
        e65Var.a(x9Var);
        int i2 = x9Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                e65Var.c(i, x9Var.d, x9Var.c);
                return;
            } else {
                i.i("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = x9Var.d;
        RecyclerView recyclerView = e65Var.A;
        recyclerView.T(i, true, i3);
        recyclerView.f1 = true;
        recyclerView.c1.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            x9 x9Var = (x9) arrayList.get(i2);
            int i3 = x9Var.a;
            int i4 = x9Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = x9Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (x9Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = x9Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += x9Var.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        zw0 zw0Var = (zw0) this.e;
        if (zw0Var != null) {
            return (ColorStateList) zw0Var.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        zw0 zw0Var = (zw0) this.e;
        if (zw0Var != null) {
            return (PorterDuff.Mode) zw0Var.d;
        }
        return null;
    }

    public boolean j() {
        if (((ArrayList) this.c).size() > 0) {
            return true;
        }
        return false;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = by4.A;
        n85 q = n85.q(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) q.L;
        View view2 = (View) this.b;
        aa7.m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) q.L, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                vq vqVar = (vq) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (vqVar) {
                    f = vqVar.a.f(context2, i2);
                }
                if (f != null) {
                    s(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(q.e(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(vk1.c(typedArray.getInt(2, -1), null));
            }
            q.t();
        } catch (Throwable th) {
            q.t();
            throw th;
        }
    }

    public a44 l(String str) {
        y34 y34Var;
        str.getClass();
        il6 il6Var = (il6) this.f;
        if (il6Var != null && (y34Var = (y34) il6Var.getValue()) != null) {
            int i = b44.X;
            Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
            parse.getClass();
            Bundle d = y34Var.d(parse, (LinkedHashMap) this.d);
            if (d != null) {
                return new a44((b44) this.b, d, y34Var.l, y34Var.b(parse), false);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [x9, java.lang.Object] */
    public x9 m(Object obj, int i, int i2, int i3) {
        x9 x9Var = (x9) ((pq4) this.b).a();
        if (x9Var == null) {
            ?? obj2 = new Object();
            obj2.a = i;
            obj2.b = i2;
            obj2.d = i3;
            obj2.c = obj;
            return obj2;
        }
        x9Var.a = i;
        x9Var.b = i2;
        x9Var.d = i3;
        x9Var.c = obj;
        return x9Var;
    }

    public void n() {
        this.a = -1;
        s(null);
        a();
    }

    public void o(int i) {
        ColorStateList colorStateList;
        this.a = i;
        vq vqVar = (vq) this.c;
        if (vqVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (vqVar) {
                colorStateList = vqVar.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(x9 x9Var) {
        e65 e65Var = (e65) this.e;
        ((ArrayList) this.d).add(x9Var);
        int i = x9Var.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        e65Var.f(x9Var.b, x9Var.d);
                        return;
                    } else {
                        f81.x(x9Var, "Unknown update op type for ");
                        return;
                    }
                }
                e65Var.c(x9Var.b, x9Var.d, x9Var.c);
                return;
            }
            int i2 = x9Var.b;
            int i3 = x9Var.d;
            RecyclerView recyclerView = e65Var.A;
            recyclerView.T(i2, false, i3);
            recyclerView.f1 = true;
            return;
        }
        e65Var.d(x9Var.b, x9Var.d);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9.q():void");
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x9 x9Var = (x9) arrayList.get(i);
            x9Var.c = null;
            ((pq4) this.b).c(x9Var);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((zw0) this.d) == null) {
                this.d = new Object();
            }
            zw0 zw0Var = (zw0) this.d;
            zw0Var.c = colorStateList;
            zw0Var.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((zw0) this.e) == null) {
            this.e = new Object();
        }
        zw0 zw0Var = (zw0) this.e;
        zw0Var.c = colorStateList;
        zw0Var.b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((zw0) this.e) == null) {
            this.e = new Object();
        }
        zw0 zw0Var = (zw0) this.e;
        zw0Var.d = mode;
        zw0Var.a = true;
        a();
    }

    public int v(int i, int i2) {
        int i3;
        int i4;
        pq4 pq4Var = (pq4) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            x9 x9Var = (x9) arrayList.get(size);
            int i5 = x9Var.a;
            int i6 = x9Var.b;
            if (i5 == 8) {
                int i7 = x9Var.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == i6) {
                        if (i2 == 1) {
                            x9Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            x9Var.d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            x9Var.b = i6 + 1;
                        } else if (i2 == 2) {
                            x9Var.b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        x9Var.b = i6 + 1;
                        x9Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        x9Var.b = i6 - 1;
                        x9Var.d = i7 - 1;
                    }
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= x9Var.d;
                } else if (i5 == 2) {
                    i += x9Var.d;
                }
            } else if (i2 == 1) {
                x9Var.b = i6 + 1;
            } else if (i2 == 2) {
                x9Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            x9 x9Var2 = (x9) arrayList.get(size2);
            int i8 = x9Var2.a;
            int i9 = x9Var2.d;
            if (i8 == 8) {
                if (i9 == x9Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    x9Var2.c = null;
                    pq4Var.c(x9Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                x9Var2.c = null;
                pq4Var.c(x9Var2);
            }
        }
        return i;
    }

    public y9(View view) {
        this.a = -1;
        this.b = view;
        this.c = vq.a();
    }
}
