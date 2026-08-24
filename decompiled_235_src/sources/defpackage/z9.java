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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z9  reason: default package */
/* loaded from: classes.dex */
public final class z9 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public z9() {
        this.b = new hy2[32];
        this.c = new float[32];
        this.d = new byte[32];
        ka4 ka4Var = c66.a;
        this.e = new ka4();
        this.f = new ka4();
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((wz0) this.d) != null) {
                if (((wz0) this.f) == null) {
                    this.f = new Object();
                }
                wz0 wz0Var = (wz0) this.f;
                wz0Var.c = null;
                wz0Var.b = false;
                wz0Var.d = null;
                wz0Var.a = false;
                WeakHashMap weakHashMap = ao7.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    wz0Var.b = true;
                    wz0Var.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    wz0Var.a = true;
                    wz0Var.d = backgroundTintMode;
                }
                if (wz0Var.b || wz0Var.a) {
                    ir.e(background, wz0Var, view.getDrawableState());
                    return;
                }
            }
            wz0 wz0Var2 = (wz0) this.e;
            if (wz0Var2 != null) {
                ir.e(background, wz0Var2, view.getDrawableState());
                return;
            }
            wz0 wz0Var3 = (wz0) this.d;
            if (wz0Var3 != null) {
                ir.e(background, wz0Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            y9 y9Var = (y9) arrayList.get(i2);
            int i3 = y9Var.a;
            if (i3 == 8) {
                if (g(y9Var.d, i2 + 1) == i) {
                    return true;
                }
            } else {
                if (i3 == 1) {
                    int i4 = y9Var.b;
                    int i5 = y9Var.d + i4;
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
            ((uf5) this.e).a((y9) arrayList.get(i));
        }
        r(arrayList);
        this.a = 0;
    }

    public void d() {
        uf5 uf5Var = (uf5) this.e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y9 y9Var = (y9) arrayList.get(i);
            int i2 = y9Var.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            uf5Var.a(y9Var);
                            uf5Var.f(y9Var.b, y9Var.d);
                        }
                    } else {
                        uf5Var.a(y9Var);
                        uf5Var.d(y9Var.c, y9Var.b, y9Var.d);
                    }
                } else {
                    uf5Var.a(y9Var);
                    int i3 = y9Var.b;
                    int i4 = y9Var.d;
                    RecyclerView recyclerView = uf5Var.A;
                    recyclerView.T(i3, true, i4);
                    recyclerView.g1 = true;
                    recyclerView.d1.c += i4;
                }
            } else {
                uf5Var.a(y9Var);
                uf5Var.e(y9Var.b, y9Var.d);
            }
        }
        r(arrayList);
        this.a = 0;
    }

    public void e(y9 y9Var) {
        int i;
        tz4 tz4Var = (tz4) this.b;
        int i2 = y9Var.a;
        if (i2 != 1 && i2 != 8) {
            int v = v(y9Var.b, i2);
            int i3 = y9Var.b;
            int i4 = y9Var.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    e41.w(y9Var, "op should be remove or update.");
                    return;
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < y9Var.d; i6++) {
                int v2 = v((i * i6) + y9Var.b, y9Var.a);
                int i7 = y9Var.a;
                if (i7 == 2 ? v2 == v : !(i7 != 4 || v2 != v + 1)) {
                    i5++;
                } else {
                    y9 m = m(y9Var.c, i7, v, i5);
                    f(m, i3);
                    m.c = null;
                    tz4Var.c(m);
                    if (y9Var.a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    v = v2;
                }
            }
            Object obj = y9Var.c;
            y9Var.c = null;
            tz4Var.c(y9Var);
            if (i5 > 0) {
                y9 m2 = m(obj, y9Var.a, v, i5);
                f(m2, i3);
                m2.c = null;
                tz4Var.c(m2);
                return;
            }
            return;
        }
        i.h("should not dispatch add or move for pre layout");
    }

    public void f(y9 y9Var, int i) {
        uf5 uf5Var = (uf5) this.e;
        uf5Var.a(y9Var);
        int i2 = y9Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                uf5Var.d(y9Var.c, i, y9Var.d);
                return;
            }
            i.h("only remove and update ops can be dispatched in first pass");
            return;
        }
        int i3 = y9Var.d;
        RecyclerView recyclerView = uf5Var.A;
        recyclerView.T(i, true, i3);
        recyclerView.g1 = true;
        recyclerView.d1.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            y9 y9Var = (y9) arrayList.get(i2);
            int i3 = y9Var.a;
            int i4 = y9Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = y9Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (y9Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = y9Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += y9Var.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        wz0 wz0Var = (wz0) this.e;
        if (wz0Var != null) {
            return (ColorStateList) wz0Var.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        wz0 wz0Var = (wz0) this.e;
        if (wz0Var != null) {
            return (PorterDuff.Mode) wz0Var.d;
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
        int[] iArr = m75.A;
        m44 A = m44.A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) A.L;
        View view2 = (View) this.b;
        ao7.m(view2, view2.getContext(), iArr, attributeSet, (TypedArray) A.L, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                ir irVar = (ir) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (irVar) {
                    f = irVar.a.f(context2, i2);
                }
                if (f != null) {
                    s(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(A.g(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(bp1.c(typedArray.getInt(2, -1), null));
            }
            A.D();
        } catch (Throwable th) {
            A.D();
            throw th;
        }
    }

    public hc4 l(String str) {
        fc4 fc4Var;
        str.getClass();
        ex6 ex6Var = (ex6) this.f;
        if (ex6Var != null && (fc4Var = (fc4) ex6Var.getValue()) != null) {
            int i = ic4.X;
            Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
            parse.getClass();
            Bundle d = fc4Var.d(parse, (LinkedHashMap) this.d);
            if (d != null) {
                return new hc4((ic4) this.b, d, fc4Var.l, fc4Var.b(parse), false);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [y9, java.lang.Object] */
    public y9 m(Object obj, int i, int i2, int i3) {
        y9 y9Var = (y9) ((tz4) this.b).a();
        if (y9Var == null) {
            ?? obj2 = new Object();
            obj2.a = i;
            obj2.b = i2;
            obj2.d = i3;
            obj2.c = obj;
            return obj2;
        }
        y9Var.a = i;
        y9Var.b = i2;
        y9Var.d = i3;
        y9Var.c = obj;
        return y9Var;
    }

    public void n() {
        this.a = -1;
        s(null);
        a();
    }

    public void o(int i) {
        ColorStateList colorStateList;
        this.a = i;
        ir irVar = (ir) this.c;
        if (irVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (irVar) {
                colorStateList = irVar.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(y9 y9Var) {
        uf5 uf5Var = (uf5) this.e;
        ((ArrayList) this.d).add(y9Var);
        int i = y9Var.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        uf5Var.f(y9Var.b, y9Var.d);
                        return;
                    } else {
                        e41.w(y9Var, "Unknown update op type for ");
                        return;
                    }
                }
                uf5Var.d(y9Var.c, y9Var.b, y9Var.d);
                return;
            }
            int i2 = y9Var.b;
            int i3 = y9Var.d;
            RecyclerView recyclerView = uf5Var.A;
            recyclerView.T(i2, false, i3);
            recyclerView.g1 = true;
            return;
        }
        uf5Var.e(y9Var.b, y9Var.d);
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
    */
    public void q() {
        boolean z;
        char c;
        y9 m;
        int i;
        int i2;
        y9 m2;
        boolean z2;
        boolean z3;
        Object obj;
        y9 y9Var;
        int i3;
        tz4 tz4Var = (tz4) this.b;
        uf5 uf5Var = (uf5) this.e;
        s63 s63Var = (s63) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        s63Var.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size >= 0) {
                    if (((y9) arrayList.get(size)).a == 8) {
                        if (z4) {
                            break;
                        }
                    } else {
                        z4 = true;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (size == -1) {
                break;
            }
            int i4 = size + 1;
            z9 z9Var = (z9) s63Var.B;
            tz4 tz4Var2 = (tz4) z9Var.b;
            y9 y9Var2 = (y9) arrayList.get(size);
            y9 y9Var3 = (y9) arrayList.get(i4);
            int i5 = y9Var3.a;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 4) {
                        int i6 = y9Var2.d;
                        int i7 = y9Var3.b;
                        if (i6 < i7) {
                            y9Var3.b = i7 - 1;
                        } else {
                            int i8 = y9Var3.d;
                            if (i6 < i7 + i8) {
                                y9Var3.d = i8 - 1;
                                m = z9Var.m(y9Var3.c, 4, y9Var2.b, 1);
                                i = y9Var2.b;
                                i2 = y9Var3.b;
                                if (i > i2) {
                                    y9Var3.b = i2 + 1;
                                } else {
                                    int i9 = i2 + y9Var3.d;
                                    if (i < i9) {
                                        int i10 = i9 - i;
                                        m2 = z9Var.m(y9Var3.c, 4, i + 1, i10);
                                        y9Var3.d -= i10;
                                        arrayList.set(i4, y9Var2);
                                        if (y9Var3.d > 0) {
                                            arrayList.set(size, y9Var3);
                                        } else {
                                            arrayList.remove(size);
                                            y9Var3.c = null;
                                            tz4Var2.c(y9Var3);
                                        }
                                        if (m != null) {
                                            arrayList.add(size, m);
                                        }
                                        if (m2 != null) {
                                            arrayList.add(size, m2);
                                        }
                                    }
                                }
                                m2 = null;
                                arrayList.set(i4, y9Var2);
                                if (y9Var3.d > 0) {
                                }
                                if (m != null) {
                                }
                                if (m2 != null) {
                                }
                            }
                        }
                        m = null;
                        i = y9Var2.b;
                        i2 = y9Var3.b;
                        if (i > i2) {
                        }
                        m2 = null;
                        arrayList.set(i4, y9Var2);
                        if (y9Var3.d > 0) {
                        }
                        if (m != null) {
                        }
                        if (m2 != null) {
                        }
                    }
                } else {
                    int i11 = y9Var2.b;
                    int i12 = y9Var2.d;
                    int i13 = y9Var3.b;
                    if (i11 < i12) {
                        if (i13 == i11 && y9Var3.d == i12 - i11) {
                            z2 = false;
                            z3 = true;
                        } else {
                            z2 = false;
                            z3 = false;
                        }
                    } else if (i13 == i12 + 1 && y9Var3.d == i11 - i12) {
                        z2 = true;
                        z3 = true;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    if (i12 < i13) {
                        y9Var3.b = i13 - 1;
                    } else {
                        int i14 = y9Var3.d;
                        if (i12 < i13 + i14) {
                            y9Var3.d = i14 - 1;
                            y9Var2.a = 2;
                            y9Var2.d = 1;
                            if (y9Var3.d == 0) {
                                arrayList.remove(i4);
                                y9Var3.c = null;
                                tz4Var2.c(y9Var3);
                            }
                        }
                    }
                    int i15 = y9Var2.b;
                    int i16 = y9Var3.b;
                    if (i15 <= i16) {
                        y9Var3.b = i16 + 1;
                    } else {
                        int i17 = i16 + y9Var3.d;
                        if (i15 < i17) {
                            obj = null;
                            y9 m3 = z9Var.m(null, 2, i15 + 1, i17 - i15);
                            y9Var3.d = y9Var2.b - y9Var3.b;
                            y9Var = m3;
                            if (!z3) {
                                arrayList.set(size, y9Var3);
                                arrayList.remove(i4);
                                y9Var2.c = obj;
                                tz4Var2.c(y9Var2);
                            } else {
                                if (z2) {
                                    if (y9Var != null) {
                                        int i18 = y9Var2.b;
                                        if (i18 > y9Var.b) {
                                            y9Var2.b = i18 - y9Var.d;
                                        }
                                        int i19 = y9Var2.d;
                                        if (i19 > y9Var.b) {
                                            y9Var2.d = i19 - y9Var.d;
                                        }
                                    }
                                    int i20 = y9Var2.b;
                                    if (i20 > y9Var3.b) {
                                        y9Var2.b = i20 - y9Var3.d;
                                    }
                                    int i21 = y9Var2.d;
                                    if (i21 > y9Var3.b) {
                                        y9Var2.d = i21 - y9Var3.d;
                                    }
                                } else {
                                    if (y9Var != null) {
                                        int i22 = y9Var2.b;
                                        if (i22 >= y9Var.b) {
                                            y9Var2.b = i22 - y9Var.d;
                                        }
                                        int i23 = y9Var2.d;
                                        if (i23 >= y9Var.b) {
                                            y9Var2.d = i23 - y9Var.d;
                                        }
                                    }
                                    int i24 = y9Var2.b;
                                    if (i24 >= y9Var3.b) {
                                        y9Var2.b = i24 - y9Var3.d;
                                    }
                                    int i25 = y9Var2.d;
                                    if (i25 >= y9Var3.b) {
                                        y9Var2.d = i25 - y9Var3.d;
                                    }
                                }
                                arrayList.set(size, y9Var3);
                                if (y9Var2.b != y9Var2.d) {
                                    arrayList.set(i4, y9Var2);
                                } else {
                                    arrayList.remove(i4);
                                }
                                if (y9Var != null) {
                                    arrayList.add(size, y9Var);
                                }
                            }
                        }
                    }
                    obj = null;
                    y9Var = null;
                    if (!z3) {
                    }
                }
            } else {
                int i26 = y9Var2.d;
                int i27 = y9Var3.b;
                if (i26 < i27) {
                    i3 = -1;
                } else {
                    i3 = 0;
                }
                int i28 = y9Var2.b;
                if (i28 < i27) {
                    i3++;
                }
                if (i27 <= i28) {
                    y9Var2.b = i28 + y9Var3.d;
                }
                int i29 = y9Var3.b;
                if (i29 <= i26) {
                    y9Var2.d = i26 + y9Var3.d;
                }
                y9Var3.b = i29 + i3;
                arrayList.set(size, y9Var3);
                arrayList.set(i4, y9Var2);
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            y9 y9Var4 = (y9) arrayList.get(i30);
            int i31 = y9Var4.a;
            if (i31 != 1) {
                if (i31 != 2) {
                    if (i31 != 4) {
                        if (i31 == 8) {
                            p(y9Var4);
                        }
                    } else {
                        int i32 = y9Var4.b;
                        int i33 = y9Var4.d + i32;
                        int i34 = i32;
                        int i35 = 0;
                        char c2 = 65535;
                        while (i32 < i33) {
                            if (uf5Var.b(i32) == null && !b(i32)) {
                                if (c2 == 1) {
                                    p(m(y9Var4.c, 4, i34, i35));
                                    i34 = i32;
                                    i35 = 0;
                                }
                                c2 = 0;
                            } else {
                                if (c2 == 0) {
                                    e(m(y9Var4.c, 4, i34, i35));
                                    i34 = i32;
                                    i35 = 0;
                                }
                                c2 = 1;
                            }
                            i35++;
                            i32++;
                        }
                        if (i35 != y9Var4.d) {
                            Object obj2 = y9Var4.c;
                            y9Var4.c = null;
                            tz4Var.c(y9Var4);
                            y9Var4 = m(obj2, 4, i34, i35);
                        }
                        if (c2 == 0) {
                            e(y9Var4);
                        } else {
                            p(y9Var4);
                        }
                    }
                } else {
                    int i36 = y9Var4.b;
                    int i37 = y9Var4.d + i36;
                    int i38 = i36;
                    int i39 = 0;
                    char c3 = 65535;
                    while (i38 < i37) {
                        if (uf5Var.b(i38) == null && !b(i38)) {
                            if (c3 == 1) {
                                p(m(null, 2, i36, i39));
                                z = true;
                            } else {
                                z = false;
                            }
                            c = 0;
                        } else {
                            if (c3 == 0) {
                                e(m(null, 2, i36, i39));
                                z = true;
                            } else {
                                z = false;
                            }
                            c = 1;
                        }
                        if (z) {
                            i38 -= i39;
                            i37 -= i39;
                            i39 = 1;
                        } else {
                            i39++;
                        }
                        i38++;
                        c3 = c;
                    }
                    if (i39 != y9Var4.d) {
                        y9Var4.c = null;
                        tz4Var.c(y9Var4);
                        y9Var4 = m(null, 2, i36, i39);
                    }
                    if (c3 == 0) {
                        e(y9Var4);
                    } else {
                        p(y9Var4);
                    }
                }
            } else {
                p(y9Var4);
            }
        }
        arrayList.clear();
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y9 y9Var = (y9) arrayList.get(i);
            y9Var.c = null;
            ((tz4) this.b).c(y9Var);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((wz0) this.d) == null) {
                this.d = new Object();
            }
            wz0 wz0Var = (wz0) this.d;
            wz0Var.c = colorStateList;
            wz0Var.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((wz0) this.e) == null) {
            this.e = new Object();
        }
        wz0 wz0Var = (wz0) this.e;
        wz0Var.c = colorStateList;
        wz0Var.b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((wz0) this.e) == null) {
            this.e = new Object();
        }
        wz0 wz0Var = (wz0) this.e;
        wz0Var.d = mode;
        wz0Var.a = true;
        a();
    }

    public int v(int i, int i2) {
        int i3;
        int i4;
        tz4 tz4Var = (tz4) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y9 y9Var = (y9) arrayList.get(size);
            int i5 = y9Var.a;
            int i6 = y9Var.b;
            if (i5 == 8) {
                int i7 = y9Var.d;
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
                            y9Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            y9Var.d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            y9Var.b = i6 + 1;
                        } else if (i2 == 2) {
                            y9Var.b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        y9Var.b = i6 + 1;
                        y9Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        y9Var.b = i6 - 1;
                        y9Var.d = i7 - 1;
                    }
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= y9Var.d;
                } else if (i5 == 2) {
                    i += y9Var.d;
                }
            } else if (i2 == 1) {
                y9Var.b = i6 + 1;
            } else if (i2 == 2) {
                y9Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            y9 y9Var2 = (y9) arrayList.get(size2);
            int i8 = y9Var2.a;
            int i9 = y9Var2.d;
            if (i8 == 8) {
                if (i9 == y9Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    y9Var2.c = null;
                    tz4Var.c(y9Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                y9Var2.c = null;
                tz4Var.c(y9Var2);
            }
        }
        return i;
    }

    public z9(View view) {
        this.a = -1;
        this.b = view;
        this.c = ir.a();
    }
}
