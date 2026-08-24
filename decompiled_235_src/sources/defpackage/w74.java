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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w74  reason: default package */
/* loaded from: classes.dex */
public final class w74 {
    public m21 a = new m21();
    public m21 b = new m21();
    public z11 c = null;
    public z11 d = null;
    public int e;
    public int f;
    public final /* synthetic */ MotionLayout g;

    public w74(MotionLayout motionLayout) {
        this.g = motionLayout;
    }

    public static void c(m21 m21Var, m21 m21Var2) {
        l21 l21Var;
        ArrayList arrayList = m21Var.t0;
        HashMap hashMap = new HashMap();
        hashMap.put(m21Var, m21Var2);
        m21Var2.t0.clear();
        m21Var2.g(m21Var, hashMap);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            l21 l21Var2 = (l21) obj;
            if (l21Var2 instanceof a20) {
                l21Var = new a20();
            } else if (l21Var2 instanceof av2) {
                l21Var = new av2();
            } else if (l21Var2 instanceof me2) {
                l21Var = new me2();
            } else if (l21Var2 instanceof gx4) {
                l21Var = new rq7();
            } else if (l21Var2 instanceof gx2) {
                l21Var = new gx2();
            } else {
                l21Var = new l21();
            }
            m21Var2.t0.add(l21Var);
            l21 l21Var3 = l21Var.U;
            if (l21Var3 != null) {
                ((m21) l21Var3).t0.remove(l21Var);
                l21Var.D();
            }
            l21Var.U = m21Var2;
            hashMap.put(l21Var2, l21Var);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            l21 l21Var4 = (l21) obj2;
            ((l21) hashMap.get(l21Var4)).g(l21Var4, hashMap);
        }
    }

    public static l21 d(m21 m21Var, View view) {
        if (m21Var.g0 == view) {
            return m21Var;
        }
        ArrayList arrayList = m21Var.t0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l21 l21Var = (l21) arrayList.get(i);
            if (l21Var.g0 == view) {
                return l21Var;
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
        HashMap hashMap2 = motionLayout.z0;
        hashMap2.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = motionLayout.getChildAt(i3);
            m74 m74Var = new m74(childAt);
            int id = childAt.getId();
            iArr2[i3] = id;
            sparseArray2.put(id, m74Var);
            hashMap2.put(childAt, m74Var);
        }
        int i4 = 0;
        while (i4 < childCount) {
            View childAt2 = motionLayout.getChildAt(i4);
            m74 m74Var2 = (m74) hashMap2.get(childAt2);
            if (m74Var2 == null) {
                i = childCount;
                hashMap = hashMap2;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i2 = i4;
            } else {
                Rect rect3 = m74Var2.a;
                if (this.c != null) {
                    l21 d = d(this.a, childAt2);
                    if (d != null) {
                        Rect o = MotionLayout.o(motionLayout, d);
                        z11 z11Var = this.c;
                        hashMap = hashMap2;
                        int width = motionLayout.getWidth();
                        iArr = iArr2;
                        int height = motionLayout.getHeight();
                        i2 = i4;
                        y74 y74Var = m74Var2.f;
                        sparseArray = sparseArray2;
                        int i5 = z11Var.d;
                        if (i5 != 0) {
                            m74.f(o, rect3, i5, width, height);
                        }
                        y74Var.L = RecyclerView.B1;
                        y74Var.R = RecyclerView.B1;
                        m74Var2.e(y74Var);
                        i = childCount;
                        rect = rect3;
                        y74Var.d(o.left, o.top, o.width(), o.height());
                        u11 h = z11Var.h(m74Var2.c);
                        y74Var.a(h);
                        w11 w11Var = h.d;
                        m74Var2.l = w11Var.g;
                        m74Var2.h.c(o, z11Var, i5, m74Var2.c);
                        m74Var2.C = h.f.i;
                        m74Var2.E = w11Var.j;
                        m74Var2.F = w11Var.i;
                        Context context = m74Var2.b.getContext();
                        int i6 = w11Var.l;
                        String str = w11Var.k;
                        int i7 = w11Var.m;
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
                                loadInterpolator = new l74(gr1.c(str), 0);
                            }
                        } else {
                            loadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                        }
                        m74Var2.G = loadInterpolator;
                    } else {
                        i = childCount;
                        hashMap = hashMap2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        rect = rect3;
                        if (motionLayout.I0 != 0) {
                            Log.e("MotionLayout", lb4.w() + "no widget for  " + lb4.y(childAt2) + " (" + childAt2.getClass().getName() + ")");
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
                    l21 d2 = d(this.b, childAt2);
                    if (d2 != null) {
                        Rect o2 = MotionLayout.o(motionLayout, d2);
                        z11 z11Var2 = this.d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        y74 y74Var2 = m74Var2.g;
                        int i8 = z11Var2.d;
                        if (i8 != 0) {
                            Rect rect4 = rect;
                            m74.f(o2, rect4, i8, width2, height2);
                            rect2 = rect4;
                        } else {
                            rect2 = o2;
                        }
                        y74Var2.L = 1.0f;
                        y74Var2.R = 1.0f;
                        m74Var2.e(y74Var2);
                        y74Var2.d(rect2.left, rect2.top, rect2.width(), rect2.height());
                        y74Var2.a(z11Var2.h(m74Var2.c));
                        m74Var2.i.c(rect2, z11Var2, i8, m74Var2.c);
                    } else if (motionLayout.I0 != 0) {
                        Log.e("MotionLayout", lb4.w() + "no widget for  " + lb4.y(childAt2) + " (" + childAt2.getClass().getName() + ")");
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
            m74 m74Var3 = (m74) sparseArray4.get(iArr3[i10]);
            int i11 = m74Var3.f.g0;
            if (i11 != -1) {
                m74 m74Var4 = (m74) sparseArray4.get(i11);
                m74Var3.f.f(m74Var4, m74Var4.f);
                m74Var3.g.f(m74Var4, m74Var4.g);
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
        if (motionLayout.u0 == motionLayout.getStartState()) {
            m21 m21Var = this.b;
            z11 z11Var = this.d;
            if (z11Var != null && z11Var.d != 0) {
                i6 = i2;
            } else {
                i6 = i;
            }
            if (z11Var != null && z11Var.d != 0) {
                i7 = i;
            } else {
                i7 = i2;
            }
            motionLayout.m(m21Var, optimizationLevel, i6, i7);
            z11 z11Var2 = this.c;
            if (z11Var2 != null) {
                m21 m21Var2 = this.a;
                int i9 = z11Var2.d;
                if (i9 == 0) {
                    i8 = i;
                } else {
                    i8 = i2;
                }
                if (i9 == 0) {
                    i = i2;
                }
                motionLayout.m(m21Var2, optimizationLevel, i8, i);
                return;
            }
            return;
        }
        z11 z11Var3 = this.c;
        if (z11Var3 != null) {
            m21 m21Var3 = this.a;
            int i10 = z11Var3.d;
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
            motionLayout.m(m21Var3, optimizationLevel, i4, i5);
        }
        m21 m21Var4 = this.b;
        z11 z11Var4 = this.d;
        if (z11Var4 != null && z11Var4.d != 0) {
            i3 = i2;
        } else {
            i3 = i;
        }
        if (z11Var4 == null || z11Var4.d == 0) {
            i = i2;
        }
        motionLayout.m(m21Var4, optimizationLevel, i3, i);
    }

    public final void e(z11 z11Var, z11 z11Var2) {
        this.c = z11Var;
        this.d = z11Var2;
        this.a = new m21();
        m21 m21Var = new m21();
        this.b = m21Var;
        m21 m21Var2 = this.a;
        boolean z = MotionLayout.t1;
        MotionLayout motionLayout = this.g;
        m21 m21Var3 = motionLayout.L;
        p11 p11Var = m21Var3.x0;
        m21Var2.x0 = p11Var;
        m21Var2.v0.h = p11Var;
        p11 p11Var2 = m21Var3.x0;
        m21Var.x0 = p11Var2;
        m21Var.v0.h = p11Var2;
        m21Var2.t0.clear();
        this.b.t0.clear();
        c(m21Var3, this.a);
        c(m21Var3, this.b);
        if (motionLayout.D0 > 0.5d) {
            if (z11Var != null) {
                g(this.a, z11Var);
            }
            g(this.b, z11Var2);
        } else {
            g(this.b, z11Var2);
            if (z11Var != null) {
                g(this.a, z11Var);
            }
        }
        this.a.y0 = motionLayout.j();
        m21 m21Var4 = this.a;
        m21Var4.u0.a0(m21Var4);
        this.b.y0 = motionLayout.j();
        m21 m21Var5 = this.b;
        m21Var5.u0.a0(m21Var5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                m21 m21Var6 = this.a;
                k21 k21Var = k21.WRAP_CONTENT;
                m21Var6.N(k21Var);
                this.b.N(k21Var);
            }
            if (layoutParams.height == -2) {
                m21 m21Var7 = this.a;
                k21 k21Var2 = k21.WRAP_CONTENT;
                m21Var7.O(k21Var2);
                this.b.O(k21Var2);
            }
        }
    }

    public final void f() {
        boolean z;
        m21 m21Var;
        boolean z2;
        boolean z3;
        int i;
        float f;
        float f2;
        float f3;
        MotionLayout motionLayout = this.g;
        int i2 = motionLayout.w0;
        int i3 = motionLayout.x0;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        motionLayout.e1 = mode;
        motionLayout.f1 = mode2;
        b(i2, i3);
        boolean z4 = true;
        int i4 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i2, i3);
            motionLayout.a1 = this.a.r();
            motionLayout.b1 = this.a.l();
            motionLayout.c1 = this.b.r();
            int l = this.b.l();
            motionLayout.d1 = l;
            if (motionLayout.a1 == motionLayout.c1 && motionLayout.b1 == l) {
                z = false;
            } else {
                z = true;
            }
            motionLayout.Z0 = z;
        }
        int i5 = motionLayout.a1;
        int i6 = motionLayout.b1;
        int i7 = motionLayout.e1;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((motionLayout.g1 * (motionLayout.c1 - i5)) + i5);
        }
        int i8 = motionLayout.f1;
        if (i8 == Integer.MIN_VALUE || i8 == 0) {
            i6 = (int) ((motionLayout.g1 * (motionLayout.d1 - i6)) + i6);
        }
        m21 m21Var2 = this.a;
        if (!m21Var2.H0 && !this.b.H0) {
            m21Var = m21Var2;
            z2 = false;
        } else {
            m21Var = m21Var2;
            z2 = true;
        }
        if (!m21Var.I0 && !this.b.I0) {
            z3 = false;
        } else {
            z3 = true;
        }
        motionLayout.l(i2, i3, i5, i6, z2, z3);
        HashMap hashMap = motionLayout.z0;
        int childCount = motionLayout.getChildCount();
        motionLayout.o1.a();
        motionLayout.H0 = true;
        SparseArray sparseArray = new SparseArray();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = motionLayout.getChildAt(i9);
            sparseArray.put(childAt.getId(), (m74) hashMap.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        b84 b84Var = motionLayout.p0.c;
        if (b84Var != null) {
            i = b84Var.p;
        } else {
            i = -1;
        }
        if (i != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                m74 m74Var = (m74) hashMap.get(motionLayout.getChildAt(i10));
                if (m74Var != null) {
                    m74Var.B = i;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[hashMap.size()];
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            m74 m74Var2 = (m74) hashMap.get(motionLayout.getChildAt(i12));
            int i13 = m74Var2.f.g0;
            if (i13 != -1) {
                sparseBooleanArray.put(i13, true);
                iArr[i11] = m74Var2.f.g0;
                i11++;
            }
        }
        for (int i14 = 0; i14 < i11; i14++) {
            m74 m74Var3 = (m74) hashMap.get(motionLayout.findViewById(iArr[i14]));
            if (m74Var3 != null) {
                motionLayout.p0.e(m74Var3);
                m74Var3.g(motionLayout.getNanoTime(), width, height);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = motionLayout.getChildAt(i15);
            m74 m74Var4 = (m74) hashMap.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && m74Var4 != null) {
                motionLayout.p0.e(m74Var4);
                m74Var4.g(motionLayout.getNanoTime(), width, height);
            }
        }
        b84 b84Var2 = motionLayout.p0.c;
        if (b84Var2 != null) {
            f = b84Var2.i;
        } else {
            f = 0.0f;
        }
        if (f != RecyclerView.B1) {
            if (f >= 0.0d) {
                z4 = false;
            }
            float abs = Math.abs(f);
            float f4 = -3.4028235E38f;
            float f5 = Float.MAX_VALUE;
            float f6 = -3.4028235E38f;
            float f7 = Float.MAX_VALUE;
            for (int i16 = 0; i16 < childCount; i16++) {
                m74 m74Var5 = (m74) hashMap.get(motionLayout.getChildAt(i16));
                if (!Float.isNaN(m74Var5.l)) {
                    for (int i17 = 0; i17 < childCount; i17++) {
                        m74 m74Var6 = (m74) hashMap.get(motionLayout.getChildAt(i17));
                        if (!Float.isNaN(m74Var6.l)) {
                            f5 = Math.min(f5, m74Var6.l);
                            f4 = Math.max(f4, m74Var6.l);
                        }
                    }
                    while (i4 < childCount) {
                        m74 m74Var7 = (m74) hashMap.get(motionLayout.getChildAt(i4));
                        if (!Float.isNaN(m74Var7.l)) {
                            m74Var7.n = 1.0f / (1.0f - abs);
                            float f8 = m74Var7.l;
                            if (z4) {
                                m74Var7.m = abs - (((f4 - f8) / (f4 - f5)) * abs);
                            } else {
                                m74Var7.m = abs - (((f8 - f5) * abs) / (f4 - f5));
                            }
                        }
                        i4++;
                    }
                    return;
                }
                y74 y74Var = m74Var5.g;
                float f9 = y74Var.X;
                float f10 = y74Var.Y;
                if (z4) {
                    f3 = f10 - f9;
                } else {
                    f3 = f10 + f9;
                }
                f7 = Math.min(f7, f3);
                f6 = Math.max(f6, f3);
            }
            while (i4 < childCount) {
                m74 m74Var8 = (m74) hashMap.get(motionLayout.getChildAt(i4));
                y74 y74Var2 = m74Var8.g;
                float f11 = y74Var2.X;
                float f12 = y74Var2.Y;
                if (z4) {
                    f2 = f12 - f11;
                } else {
                    f2 = f12 + f11;
                }
                m74Var8.n = 1.0f / (1.0f - abs);
                m74Var8.m = abs - (((f2 - f7) * abs) / (f6 - f7));
                i4++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [o11, o21] */
    public final void g(m21 m21Var, z11 z11Var) {
        u11 u11Var;
        u11 u11Var2;
        SparseArray sparseArray = new SparseArray();
        ?? o11Var = new o11();
        sparseArray.clear();
        sparseArray.put(0, m21Var);
        MotionLayout motionLayout = this.g;
        sparseArray.put(motionLayout.getId(), m21Var);
        if (z11Var != null && z11Var.d != 0) {
            m21 m21Var2 = this.b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z = MotionLayout.t1;
            motionLayout.m(m21Var2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
        }
        ArrayList arrayList = m21Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l21 l21Var = (l21) obj;
            l21Var.i0 = true;
            sparseArray.put(l21Var.g0.getId(), l21Var);
        }
        ArrayList arrayList2 = m21Var.t0;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            l21 l21Var2 = (l21) arrayList2.get(i2);
            View view = l21Var2.g0;
            int id = view.getId();
            HashMap hashMap = z11Var.g;
            if (hashMap.containsKey(Integer.valueOf(id)) && (u11Var2 = (u11) hashMap.get(Integer.valueOf(id))) != 0) {
                u11Var2.b(o11Var);
            }
            l21Var2.P(z11Var.h(view.getId()).e.c);
            l21Var2.M(z11Var.h(view.getId()).e.d);
            if (view instanceof l11) {
                l11 l11Var = (l11) view;
                int id2 = l11Var.getId();
                HashMap hashMap2 = z11Var.g;
                if (hashMap2.containsKey(Integer.valueOf(id2)) && (u11Var = (u11) hashMap2.get(Integer.valueOf(id2))) != null && (l21Var2 instanceof gx2)) {
                    l11Var.i(u11Var, (gx2) l21Var2, o11Var, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).k();
                }
            }
            o11Var.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z2 = MotionLayout.t1;
            motionLayout.g(false, view, l21Var2, o11Var, sparseArray);
            if (z11Var.h(view.getId()).c.c == 1) {
                l21Var2.h0 = view.getVisibility();
            } else {
                l21Var2.h0 = z11Var.h(view.getId()).c.b;
            }
            i2 = i3;
        }
        ArrayList arrayList3 = m21Var.t0;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            l21 l21Var3 = (l21) obj2;
            if (l21Var3 instanceof rq7) {
                l11 l11Var2 = (l11) l21Var3.g0;
                gx2 gx2Var = (gx2) l21Var3;
                l11Var2.getClass();
                gx2Var.u0 = 0;
                Arrays.fill(gx2Var.t0, (Object) null);
                for (int i5 = 0; i5 < l11Var2.B; i5++) {
                    gx2Var.S((l21) sparseArray.get(l11Var2.A[i5]));
                }
                rq7 rq7Var = (rq7) gx2Var;
                for (int i6 = 0; i6 < rq7Var.u0; i6++) {
                    l21 l21Var4 = rq7Var.t0[i6];
                    if (l21Var4 != null) {
                        l21Var4.F = true;
                    }
                }
            }
        }
    }
}
