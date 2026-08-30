package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uz3  reason: default package */
/* loaded from: classes.dex */
public final class uz3 {
    public hz0 a = new hz0();
    public hz0 b = new hz0();
    public uy0 c = null;
    public uy0 d = null;
    public int e;
    public int f;
    public final /* synthetic */ MotionLayout g;

    public uz3(MotionLayout motionLayout) {
        this.g = motionLayout;
    }

    public static void c(hz0 hz0Var, hz0 hz0Var2) {
        gz0 gz0Var;
        ArrayList arrayList = hz0Var.t0;
        HashMap hashMap = new HashMap();
        hashMap.put(hz0Var, hz0Var2);
        hz0Var2.t0.clear();
        hz0Var2.g(hz0Var, hashMap);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            gz0 gz0Var2 = (gz0) obj;
            if (gz0Var2 instanceof j00) {
                gz0Var = new j00();
            } else if (gz0Var2 instanceof yo2) {
                gz0Var = new yo2();
            } else if (gz0Var2 instanceof v92) {
                gz0Var = new v92();
            } else if (gz0Var2 instanceof bo4) {
                gz0Var = new pc7();
            } else if (gz0Var2 instanceof fr2) {
                gz0Var = new fr2();
            } else {
                gz0Var = new gz0();
            }
            hz0Var2.t0.add(gz0Var);
            gz0 gz0Var3 = gz0Var.U;
            if (gz0Var3 != null) {
                ((hz0) gz0Var3).t0.remove(gz0Var);
                gz0Var.D();
            }
            gz0Var.U = hz0Var2;
            hashMap.put(gz0Var2, gz0Var);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            gz0 gz0Var4 = (gz0) obj2;
            ((gz0) hashMap.get(gz0Var4)).g(gz0Var4, hashMap);
        }
    }

    public static gz0 d(hz0 hz0Var, View view) {
        if (hz0Var.g0 == view) {
            return hz0Var;
        }
        ArrayList arrayList = hz0Var.t0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gz0 gz0Var = (gz0) arrayList.get(i);
            if (gz0Var.g0 == view) {
                return gz0Var;
            }
        }
        return null;
    }

    public final void a() {
        int i;
        HashMap hashMap;
        SparseArray sparseArray;
        int[] iArr;
        int i2;
        Rect rect;
        Rect rect2;
        Interpolator loadInterpolator;
        MotionLayout motionLayout = this.g;
        int childCount = motionLayout.getChildCount();
        HashMap hashMap2 = motionLayout.y0;
        hashMap2.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = motionLayout.getChildAt(i3);
            lz3 lz3Var = new lz3(childAt);
            int id = childAt.getId();
            iArr2[i3] = id;
            sparseArray2.put(id, lz3Var);
            hashMap2.put(childAt, lz3Var);
        }
        int i4 = 0;
        while (i4 < childCount) {
            View childAt2 = motionLayout.getChildAt(i4);
            lz3 lz3Var2 = (lz3) hashMap2.get(childAt2);
            if (lz3Var2 == null) {
                i = childCount;
                hashMap = hashMap2;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i2 = i4;
            } else {
                Rect rect3 = lz3Var2.a;
                if (this.c != null) {
                    gz0 d = d(this.a, childAt2);
                    if (d != null) {
                        Rect o = MotionLayout.o(motionLayout, d);
                        uy0 uy0Var = this.c;
                        hashMap = hashMap2;
                        int width = motionLayout.getWidth();
                        iArr = iArr2;
                        int height = motionLayout.getHeight();
                        i2 = i4;
                        wz3 wz3Var = lz3Var2.f;
                        sparseArray = sparseArray2;
                        int i5 = uy0Var.d;
                        if (i5 != 0) {
                            lz3.f(o, rect3, i5, width, height);
                        }
                        wz3Var.L = RecyclerView.A1;
                        wz3Var.R = RecyclerView.A1;
                        lz3Var2.e(wz3Var);
                        i = childCount;
                        rect = rect3;
                        wz3Var.d(o.left, o.top, o.width(), o.height());
                        py0 h = uy0Var.h(lz3Var2.c);
                        wz3Var.a(h);
                        ry0 ry0Var = h.d;
                        lz3Var2.l = ry0Var.g;
                        lz3Var2.h.c(o, uy0Var, i5, lz3Var2.c);
                        lz3Var2.C = h.f.i;
                        lz3Var2.E = ry0Var.j;
                        lz3Var2.F = ry0Var.i;
                        Context context = lz3Var2.b.getContext();
                        int i6 = ry0Var.l;
                        String str = ry0Var.k;
                        int i7 = ry0Var.m;
                        if (i6 != -2) {
                            if (i6 != -1) {
                                if (i6 != 0) {
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            if (i6 != 4) {
                                                if (i6 != 5) {
                                                    loadInterpolator = null;
                                                } else {
                                                    loadInterpolator = new OvershootInterpolator();
                                                }
                                            } else {
                                                loadInterpolator = new BounceInterpolator();
                                            }
                                        } else {
                                            loadInterpolator = new DecelerateInterpolator();
                                        }
                                    } else {
                                        loadInterpolator = new AccelerateInterpolator();
                                    }
                                } else {
                                    loadInterpolator = new AccelerateDecelerateInterpolator();
                                }
                            } else {
                                loadInterpolator = new kz3(an1.e(str), 0);
                            }
                        } else {
                            loadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                        }
                        lz3Var2.G = loadInterpolator;
                    } else {
                        i = childCount;
                        hashMap = hashMap2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        rect = rect3;
                        if (motionLayout.H0 != 0) {
                            Log.e("MotionLayout", b53.L() + "no widget for  " + b53.N(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i = childCount;
                    hashMap = hashMap2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                    rect = rect3;
                }
                if (this.d != null) {
                    gz0 d2 = d(this.b, childAt2);
                    if (d2 != null) {
                        Rect o2 = MotionLayout.o(motionLayout, d2);
                        uy0 uy0Var2 = this.d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        wz3 wz3Var2 = lz3Var2.g;
                        int i8 = uy0Var2.d;
                        if (i8 != 0) {
                            Rect rect4 = rect;
                            lz3.f(o2, rect4, i8, width2, height2);
                            rect2 = rect4;
                        } else {
                            rect2 = o2;
                        }
                        wz3Var2.L = 1.0f;
                        wz3Var2.R = 1.0f;
                        lz3Var2.e(wz3Var2);
                        wz3Var2.d(rect2.left, rect2.top, rect2.width(), rect2.height());
                        wz3Var2.a(uy0Var2.h(lz3Var2.c));
                        lz3Var2.i.c(rect2, uy0Var2, i8, lz3Var2.c);
                    } else if (motionLayout.H0 != 0) {
                        Log.e("MotionLayout", b53.L() + "no widget for  " + b53.N(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i4 = i2 + 1;
            hashMap2 = hashMap;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i9 = childCount;
        int i10 = 0;
        while (i10 < i9) {
            SparseArray sparseArray4 = sparseArray3;
            lz3 lz3Var3 = (lz3) sparseArray4.get(iArr3[i10]);
            int i11 = lz3Var3.f.f0;
            if (i11 != -1) {
                lz3 lz3Var4 = (lz3) sparseArray4.get(i11);
                lz3Var3.f.f(lz3Var4, lz3Var4.f);
                lz3Var3.g.f(lz3Var4, lz3Var4.g);
            }
            i10++;
            sparseArray3 = sparseArray4;
        }
    }

    public final void b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MotionLayout motionLayout = this.g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.t0 == motionLayout.getStartState()) {
            hz0 hz0Var = this.b;
            uy0 uy0Var = this.d;
            if (uy0Var != null && uy0Var.d != 0) {
                i6 = i2;
            } else {
                i6 = i;
            }
            if (uy0Var != null && uy0Var.d != 0) {
                i7 = i;
            } else {
                i7 = i2;
            }
            motionLayout.m(hz0Var, optimizationLevel, i6, i7);
            uy0 uy0Var2 = this.c;
            if (uy0Var2 != null) {
                hz0 hz0Var2 = this.a;
                int i9 = uy0Var2.d;
                if (i9 == 0) {
                    i8 = i;
                } else {
                    i8 = i2;
                }
                if (i9 == 0) {
                    i = i2;
                }
                motionLayout.m(hz0Var2, optimizationLevel, i8, i);
                return;
            }
            return;
        }
        uy0 uy0Var3 = this.c;
        if (uy0Var3 != null) {
            hz0 hz0Var3 = this.a;
            int i10 = uy0Var3.d;
            if (i10 == 0) {
                i4 = i;
            } else {
                i4 = i2;
            }
            if (i10 == 0) {
                i5 = i2;
            } else {
                i5 = i;
            }
            motionLayout.m(hz0Var3, optimizationLevel, i4, i5);
        }
        hz0 hz0Var4 = this.b;
        uy0 uy0Var4 = this.d;
        if (uy0Var4 != null && uy0Var4.d != 0) {
            i3 = i2;
        } else {
            i3 = i;
        }
        if (uy0Var4 == null || uy0Var4.d == 0) {
            i = i2;
        }
        motionLayout.m(hz0Var4, optimizationLevel, i3, i);
    }

    public final void e(uy0 uy0Var, uy0 uy0Var2) {
        this.c = uy0Var;
        this.d = uy0Var2;
        this.a = new hz0();
        hz0 hz0Var = new hz0();
        this.b = hz0Var;
        hz0 hz0Var2 = this.a;
        boolean z = MotionLayout.s1;
        MotionLayout motionLayout = this.g;
        hz0 hz0Var3 = motionLayout.L;
        ky0 ky0Var = hz0Var3.x0;
        hz0Var2.x0 = ky0Var;
        hz0Var2.v0.h = ky0Var;
        ky0 ky0Var2 = hz0Var3.x0;
        hz0Var.x0 = ky0Var2;
        hz0Var.v0.h = ky0Var2;
        hz0Var2.t0.clear();
        this.b.t0.clear();
        c(hz0Var3, this.a);
        c(hz0Var3, this.b);
        if (motionLayout.C0 > 0.5d) {
            if (uy0Var != null) {
                g(this.a, uy0Var);
            }
            g(this.b, uy0Var2);
        } else {
            g(this.b, uy0Var2);
            if (uy0Var != null) {
                g(this.a, uy0Var);
            }
        }
        this.a.y0 = motionLayout.j();
        hz0 hz0Var4 = this.a;
        hz0Var4.u0.S(hz0Var4);
        this.b.y0 = motionLayout.j();
        hz0 hz0Var5 = this.b;
        hz0Var5.u0.S(hz0Var5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                hz0 hz0Var6 = this.a;
                fz0 fz0Var = fz0.WRAP_CONTENT;
                hz0Var6.N(fz0Var);
                this.b.N(fz0Var);
            }
            if (layoutParams.height == -2) {
                hz0 hz0Var7 = this.a;
                fz0 fz0Var2 = fz0.WRAP_CONTENT;
                hz0Var7.O(fz0Var2);
                this.b.O(fz0Var2);
            }
        }
    }

    public final void f() {
        boolean z;
        hz0 hz0Var;
        boolean z2;
        boolean z3;
        int i;
        float f;
        float f2;
        float f3;
        MotionLayout motionLayout = this.g;
        int i2 = motionLayout.v0;
        int i3 = motionLayout.w0;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        motionLayout.d1 = mode;
        motionLayout.e1 = mode2;
        b(i2, i3);
        boolean z4 = true;
        int i4 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i2, i3);
            motionLayout.Z0 = this.a.r();
            motionLayout.a1 = this.a.l();
            motionLayout.b1 = this.b.r();
            int l = this.b.l();
            motionLayout.c1 = l;
            if (motionLayout.Z0 == motionLayout.b1 && motionLayout.a1 == l) {
                z = false;
            } else {
                z = true;
            }
            motionLayout.Y0 = z;
        }
        int i5 = motionLayout.Z0;
        int i6 = motionLayout.a1;
        int i7 = motionLayout.d1;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((motionLayout.f1 * (motionLayout.b1 - i5)) + i5);
        }
        int i8 = motionLayout.e1;
        if (i8 == Integer.MIN_VALUE || i8 == 0) {
            i6 = (int) ((motionLayout.f1 * (motionLayout.c1 - i6)) + i6);
        }
        hz0 hz0Var2 = this.a;
        if (!hz0Var2.H0 && !this.b.H0) {
            hz0Var = hz0Var2;
            z2 = false;
        } else {
            hz0Var = hz0Var2;
            z2 = true;
        }
        if (!hz0Var.I0 && !this.b.I0) {
            z3 = false;
        } else {
            z3 = true;
        }
        motionLayout.l(i2, i3, i5, i6, z2, z3);
        HashMap hashMap = motionLayout.y0;
        int childCount = motionLayout.getChildCount();
        motionLayout.n1.a();
        motionLayout.G0 = true;
        SparseArray sparseArray = new SparseArray();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = motionLayout.getChildAt(i9);
            sparseArray.put(childAt.getId(), (lz3) hashMap.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        zz3 zz3Var = motionLayout.o0.c;
        if (zz3Var != null) {
            i = zz3Var.p;
        } else {
            i = -1;
        }
        if (i != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                lz3 lz3Var = (lz3) hashMap.get(motionLayout.getChildAt(i10));
                if (lz3Var != null) {
                    lz3Var.B = i;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[hashMap.size()];
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            lz3 lz3Var2 = (lz3) hashMap.get(motionLayout.getChildAt(i12));
            int i13 = lz3Var2.f.f0;
            if (i13 != -1) {
                sparseBooleanArray.put(i13, true);
                iArr[i11] = lz3Var2.f.f0;
                i11++;
            }
        }
        for (int i14 = 0; i14 < i11; i14++) {
            lz3 lz3Var3 = (lz3) hashMap.get(motionLayout.findViewById(iArr[i14]));
            if (lz3Var3 != null) {
                motionLayout.o0.e(lz3Var3);
                lz3Var3.g(motionLayout.getNanoTime(), width, height);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = motionLayout.getChildAt(i15);
            lz3 lz3Var4 = (lz3) hashMap.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && lz3Var4 != null) {
                motionLayout.o0.e(lz3Var4);
                lz3Var4.g(motionLayout.getNanoTime(), width, height);
            }
        }
        zz3 zz3Var2 = motionLayout.o0.c;
        if (zz3Var2 != null) {
            f = zz3Var2.i;
        } else {
            f = 0.0f;
        }
        if (f != RecyclerView.A1) {
            if (f >= 0.0d) {
                z4 = false;
            }
            float abs = Math.abs(f);
            float f4 = -3.4028235E38f;
            float f5 = Float.MAX_VALUE;
            float f6 = -3.4028235E38f;
            float f7 = Float.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                lz3 lz3Var5 = (lz3) hashMap.get(motionLayout.getChildAt(i16));
                if (!Float.isNaN(lz3Var5.l)) {
                    for (int i17 = 0; i17 < childCount; i17++) {
                        lz3 lz3Var6 = (lz3) hashMap.get(motionLayout.getChildAt(i17));
                        if (!Float.isNaN(lz3Var6.l)) {
                            f5 = Math.min(f5, lz3Var6.l);
                            f4 = Math.max(f4, lz3Var6.l);
                        }
                    }
                    while (i4 < childCount) {
                        lz3 lz3Var7 = (lz3) hashMap.get(motionLayout.getChildAt(i4));
                        if (!Float.isNaN(lz3Var7.l)) {
                            lz3Var7.n = 1.0f / (1.0f - abs);
                            float f8 = lz3Var7.l;
                            if (z4) {
                                lz3Var7.m = abs - (((f4 - f8) / (f4 - f5)) * abs);
                            } else {
                                lz3Var7.m = abs - (((f8 - f5) * abs) / (f4 - f5));
                            }
                        }
                        i4++;
                    }
                    return;
                }
                wz3 wz3Var = lz3Var5.g;
                float f9 = wz3Var.X;
                float f10 = wz3Var.Y;
                if (z4) {
                    f3 = f10 - f9;
                } else {
                    f3 = f10 + f9;
                }
                f7 = Math.min(f7, f3);
                f6 = Math.max(f6, f3);
            }
            while (i4 < childCount) {
                lz3 lz3Var8 = (lz3) hashMap.get(motionLayout.getChildAt(i4));
                wz3 wz3Var2 = lz3Var8.g;
                float f11 = wz3Var2.X;
                float f12 = wz3Var2.Y;
                if (z4) {
                    f2 = f12 - f11;
                } else {
                    f2 = f12 + f11;
                }
                lz3Var8.n = 1.0f / (1.0f - abs);
                lz3Var8.m = abs - (((f2 - f7) * abs) / (f6 - f7));
                i4++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [jy0, jz0] */
    public final void g(hz0 hz0Var, uy0 uy0Var) {
        py0 py0Var;
        py0 py0Var2;
        SparseArray sparseArray = new SparseArray();
        ?? jy0Var = new jy0();
        sparseArray.clear();
        sparseArray.put(0, hz0Var);
        MotionLayout motionLayout = this.g;
        sparseArray.put(motionLayout.getId(), hz0Var);
        if (uy0Var != null && uy0Var.d != 0) {
            hz0 hz0Var2 = this.b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z = MotionLayout.s1;
            motionLayout.m(hz0Var2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
        }
        ArrayList arrayList = hz0Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gz0 gz0Var = (gz0) obj;
            gz0Var.i0 = true;
            sparseArray.put(gz0Var.g0.getId(), gz0Var);
        }
        ArrayList arrayList2 = hz0Var.t0;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            gz0 gz0Var2 = (gz0) arrayList2.get(i2);
            View view = gz0Var2.g0;
            int id = view.getId();
            HashMap hashMap = uy0Var.g;
            if (hashMap.containsKey(Integer.valueOf(id)) && (py0Var2 = (py0) hashMap.get(Integer.valueOf(id))) != 0) {
                py0Var2.b(jy0Var);
            }
            gz0Var2.P(uy0Var.h(view.getId()).e.c);
            gz0Var2.M(uy0Var.h(view.getId()).e.d);
            if (view instanceof gy0) {
                gy0 gy0Var = (gy0) view;
                int id2 = gy0Var.getId();
                HashMap hashMap2 = uy0Var.g;
                if (hashMap2.containsKey(Integer.valueOf(id2)) && (py0Var = (py0) hashMap2.get(Integer.valueOf(id2))) != null && (gz0Var2 instanceof fr2)) {
                    gy0Var.i(py0Var, (fr2) gz0Var2, jy0Var, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).k();
                }
            }
            jy0Var.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z2 = MotionLayout.s1;
            motionLayout.g(false, view, gz0Var2, jy0Var, sparseArray);
            if (uy0Var.h(view.getId()).c.c == 1) {
                gz0Var2.h0 = view.getVisibility();
            } else {
                gz0Var2.h0 = uy0Var.h(view.getId()).c.b;
            }
            i2 = i3;
        }
        ArrayList arrayList3 = hz0Var.t0;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            gz0 gz0Var3 = (gz0) obj2;
            if (gz0Var3 instanceof pc7) {
                gy0 gy0Var2 = (gy0) gz0Var3.g0;
                fr2 fr2Var = (fr2) gz0Var3;
                gy0Var2.getClass();
                fr2Var.u0 = 0;
                Arrays.fill(fr2Var.t0, (Object) null);
                for (int i5 = 0; i5 < gy0Var2.B; i5++) {
                    fr2Var.S((gz0) sparseArray.get(gy0Var2.A[i5]));
                }
                pc7 pc7Var = (pc7) fr2Var;
                for (int i6 = 0; i6 < pc7Var.u0; i6++) {
                    gz0 gz0Var4 = pc7Var.t0[i6];
                    if (gz0Var4 != null) {
                        gz0Var4.F = true;
                    }
                }
            }
        }
    }
}
