package h5;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public e5.h f6252a = new e5.h();

    /* renamed from: b  reason: collision with root package name */
    public e5.h f6253b = new e5.h();

    /* renamed from: c  reason: collision with root package name */
    public i5.q f6254c = null;

    /* renamed from: d  reason: collision with root package name */
    public i5.q f6255d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f6256e;

    /* renamed from: f  reason: collision with root package name */
    public int f6257f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ MotionLayout f6258g;

    public u(MotionLayout motionLayout) {
        this.f6258g = motionLayout;
    }

    public static void c(e5.h hVar, e5.h hVar2) {
        e5.g gVar;
        ArrayList arrayList = hVar.f4331t0;
        HashMap hashMap = new HashMap();
        hashMap.put(hVar, hVar2);
        hVar2.f4331t0.clear();
        hVar2.g(hVar, hashMap);
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e5.g gVar2 = (e5.g) obj;
            if (gVar2 instanceof e5.a) {
                gVar = new e5.a();
            } else if (gVar2 instanceof e5.l) {
                gVar = new e5.l();
            } else if (gVar2 instanceof e5.j) {
                gVar = new e5.j();
            } else if (gVar2 instanceof e5.o) {
                gVar = new e5.p();
            } else if (gVar2 instanceof e5.m) {
                gVar = new e5.m();
            } else {
                gVar = new e5.g();
            }
            hVar2.f4331t0.add(gVar);
            e5.g gVar3 = gVar.U;
            if (gVar3 != null) {
                ((e5.h) gVar3).f4331t0.remove(gVar);
                gVar.D();
            }
            gVar.U = hVar2;
            hashMap.put(gVar2, gVar);
        }
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            e5.g gVar4 = (e5.g) obj2;
            ((e5.g) hashMap.get(gVar4)).g(gVar4, hashMap);
        }
    }

    public static e5.g d(e5.h hVar, View view) {
        if (hVar.f4301g0 == view) {
            return hVar;
        }
        ArrayList arrayList = hVar.f4331t0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            e5.g gVar = (e5.g) arrayList.get(i2);
            if (gVar.f4301g0 == view) {
                return gVar;
            }
        }
        return null;
    }

    public final void a() {
        int i2;
        HashMap hashMap;
        SparseArray sparseArray;
        int[] iArr;
        int i10;
        Rect rect;
        Rect rect2;
        Interpolator loadInterpolator;
        MotionLayout motionLayout = this.f6258g;
        int childCount = motionLayout.getChildCount();
        HashMap hashMap2 = motionLayout.f1101x0;
        hashMap2.clear();
        SparseArray sparseArray2 = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = motionLayout.getChildAt(i11);
            p pVar = new p(childAt);
            int id2 = childAt.getId();
            iArr2[i11] = id2;
            sparseArray2.put(id2, pVar);
            hashMap2.put(childAt, pVar);
        }
        int i12 = 0;
        while (i12 < childCount) {
            View childAt2 = motionLayout.getChildAt(i12);
            p pVar2 = (p) hashMap2.get(childAt2);
            if (pVar2 == null) {
                i2 = childCount;
                hashMap = hashMap2;
                sparseArray = sparseArray2;
                iArr = iArr2;
                i10 = i12;
            } else {
                Rect rect3 = pVar2.f6210a;
                if (this.f6254c != null) {
                    e5.g d4 = d(this.f6252a, childAt2);
                    if (d4 != null) {
                        Rect o5 = MotionLayout.o(motionLayout, d4);
                        i5.q qVar = this.f6254c;
                        hashMap = hashMap2;
                        int width = motionLayout.getWidth();
                        iArr = iArr2;
                        int height = motionLayout.getHeight();
                        i10 = i12;
                        x xVar = pVar2.f6215f;
                        sparseArray = sparseArray2;
                        int i13 = qVar.f6989d;
                        if (i13 != 0) {
                            p.f(o5, rect3, i13, width, height);
                        }
                        xVar.L = 0.0f;
                        xVar.R = 0.0f;
                        pVar2.e(xVar);
                        i2 = childCount;
                        rect = rect3;
                        xVar.d(o5.left, o5.top, o5.width(), o5.height());
                        i5.l h2 = qVar.h(pVar2.f6212c);
                        xVar.a(h2);
                        i5.n nVar = h2.f6905d;
                        pVar2.f6221l = nVar.f6958g;
                        pVar2.f6217h.c(o5, qVar, i13, pVar2.f6212c);
                        pVar2.C = h2.f6907f.f6978i;
                        pVar2.E = nVar.f6961j;
                        pVar2.F = nVar.f6960i;
                        Context context = pVar2.f6211b.getContext();
                        int i14 = nVar.f6963l;
                        String str = nVar.f6962k;
                        int i15 = nVar.m;
                        if (i14 != -2) {
                            if (i14 != -1) {
                                if (i14 != 0) {
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            if (i14 != 4) {
                                                if (i14 != 5) {
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
                                loadInterpolator = new o(d5.e.d(str), 0);
                            }
                        } else {
                            loadInterpolator = AnimationUtils.loadInterpolator(context, i15);
                        }
                        pVar2.G = loadInterpolator;
                    } else {
                        i2 = childCount;
                        hashMap = hashMap2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i10 = i12;
                        rect = rect3;
                        if (motionLayout.G0 != 0) {
                            Log.e("MotionLayout", d0.d.U() + "no widget for  " + d0.d.W(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i2 = childCount;
                    hashMap = hashMap2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i10 = i12;
                    rect = rect3;
                }
                if (this.f6255d != null) {
                    e5.g d10 = d(this.f6253b, childAt2);
                    if (d10 != null) {
                        Rect o8 = MotionLayout.o(motionLayout, d10);
                        i5.q qVar2 = this.f6255d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        x xVar2 = pVar2.f6216g;
                        int i16 = qVar2.f6989d;
                        if (i16 != 0) {
                            Rect rect4 = rect;
                            p.f(o8, rect4, i16, width2, height2);
                            rect2 = rect4;
                        } else {
                            rect2 = o8;
                        }
                        xVar2.L = 1.0f;
                        xVar2.R = 1.0f;
                        pVar2.e(xVar2);
                        xVar2.d(rect2.left, rect2.top, rect2.width(), rect2.height());
                        xVar2.a(qVar2.h(pVar2.f6212c));
                        pVar2.f6218i.c(rect2, qVar2, i16, pVar2.f6212c);
                    } else if (motionLayout.G0 != 0) {
                        Log.e("MotionLayout", d0.d.U() + "no widget for  " + d0.d.W(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i12 = i10 + 1;
            hashMap2 = hashMap;
            iArr2 = iArr;
            sparseArray2 = sparseArray;
            childCount = i2;
        }
        SparseArray sparseArray3 = sparseArray2;
        int[] iArr3 = iArr2;
        int i17 = childCount;
        int i18 = 0;
        while (i18 < i17) {
            SparseArray sparseArray4 = sparseArray3;
            p pVar3 = (p) sparseArray4.get(iArr3[i18]);
            int i19 = pVar3.f6215f.f6265e0;
            if (i19 != -1) {
                p pVar4 = (p) sparseArray4.get(i19);
                pVar3.f6215f.f(pVar4, pVar4.f6215f);
                pVar3.f6216g.f(pVar4, pVar4.f6216g);
            }
            i18++;
            sparseArray3 = sparseArray4;
        }
    }

    public final void b(int i2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        MotionLayout motionLayout = this.f6258g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f1096s0 == motionLayout.getStartState()) {
            e5.h hVar = this.f6253b;
            i5.q qVar = this.f6255d;
            if (qVar != null && qVar.f6989d != 0) {
                i14 = i10;
            } else {
                i14 = i2;
            }
            if (qVar != null && qVar.f6989d != 0) {
                i15 = i2;
            } else {
                i15 = i10;
            }
            motionLayout.m(hVar, optimizationLevel, i14, i15);
            i5.q qVar2 = this.f6254c;
            if (qVar2 != null) {
                e5.h hVar2 = this.f6252a;
                int i17 = qVar2.f6989d;
                if (i17 == 0) {
                    i16 = i2;
                } else {
                    i16 = i10;
                }
                if (i17 == 0) {
                    i2 = i10;
                }
                motionLayout.m(hVar2, optimizationLevel, i16, i2);
                return;
            }
            return;
        }
        i5.q qVar3 = this.f6254c;
        if (qVar3 != null) {
            e5.h hVar3 = this.f6252a;
            int i18 = qVar3.f6989d;
            if (i18 == 0) {
                i12 = i2;
            } else {
                i12 = i10;
            }
            if (i18 == 0) {
                i13 = i10;
            } else {
                i13 = i2;
            }
            motionLayout.m(hVar3, optimizationLevel, i12, i13);
        }
        e5.h hVar4 = this.f6253b;
        i5.q qVar4 = this.f6255d;
        if (qVar4 != null && qVar4.f6989d != 0) {
            i11 = i10;
        } else {
            i11 = i2;
        }
        if (qVar4 == null || qVar4.f6989d == 0) {
            i2 = i10;
        }
        motionLayout.m(hVar4, optimizationLevel, i11, i2);
    }

    public final void e(i5.q qVar, i5.q qVar2) {
        this.f6254c = qVar;
        this.f6255d = qVar2;
        this.f6252a = new e5.h();
        e5.h hVar = new e5.h();
        this.f6253b = hVar;
        e5.h hVar2 = this.f6252a;
        boolean z10 = MotionLayout.f1074r1;
        MotionLayout motionLayout = this.f6258g;
        e5.h hVar3 = motionLayout.L;
        i5.g gVar = hVar3.f4335x0;
        hVar2.f4335x0 = gVar;
        hVar2.f4333v0.f4861h = gVar;
        i5.g gVar2 = hVar3.f4335x0;
        hVar.f4335x0 = gVar2;
        hVar.f4333v0.f4861h = gVar2;
        hVar2.f4331t0.clear();
        this.f6253b.f4331t0.clear();
        c(hVar3, this.f6252a);
        c(hVar3, this.f6253b);
        if (motionLayout.B0 > 0.5d) {
            if (qVar != null) {
                g(this.f6252a, qVar);
            }
            g(this.f6253b, qVar2);
        } else {
            g(this.f6253b, qVar2);
            if (qVar != null) {
                g(this.f6252a, qVar);
            }
        }
        this.f6252a.f4336y0 = motionLayout.j();
        e5.h hVar4 = this.f6252a;
        hVar4.f4332u0.N(hVar4);
        this.f6253b.f4336y0 = motionLayout.j();
        e5.h hVar5 = this.f6253b;
        hVar5.f4332u0.N(hVar5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                e5.h hVar6 = this.f6252a;
                e5.f fVar = e5.f.WRAP_CONTENT;
                hVar6.N(fVar);
                this.f6253b.N(fVar);
            }
            if (layoutParams.height == -2) {
                e5.h hVar7 = this.f6252a;
                e5.f fVar2 = e5.f.WRAP_CONTENT;
                hVar7.O(fVar2);
                this.f6253b.O(fVar2);
            }
        }
    }

    public final void f() {
        boolean z10;
        e5.h hVar;
        boolean z11;
        boolean z12;
        int i2;
        float f8;
        float f10;
        float f11;
        MotionLayout motionLayout = this.f6258g;
        int i10 = motionLayout.f1098u0;
        int i11 = motionLayout.f1099v0;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        motionLayout.f1077c1 = mode;
        motionLayout.f1078d1 = mode2;
        b(i10, i11);
        boolean z13 = true;
        int i12 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i10, i11);
            motionLayout.Y0 = this.f6252a.r();
            motionLayout.Z0 = this.f6252a.l();
            motionLayout.f1075a1 = this.f6253b.r();
            int l10 = this.f6253b.l();
            motionLayout.f1076b1 = l10;
            if (motionLayout.Y0 == motionLayout.f1075a1 && motionLayout.Z0 == l10) {
                z10 = false;
            } else {
                z10 = true;
            }
            motionLayout.X0 = z10;
        }
        int i13 = motionLayout.Y0;
        int i14 = motionLayout.Z0;
        int i15 = motionLayout.f1077c1;
        if (i15 == Integer.MIN_VALUE || i15 == 0) {
            i13 = (int) ((motionLayout.f1079e1 * (motionLayout.f1075a1 - i13)) + i13);
        }
        int i16 = motionLayout.f1078d1;
        if (i16 == Integer.MIN_VALUE || i16 == 0) {
            i14 = (int) ((motionLayout.f1079e1 * (motionLayout.f1076b1 - i14)) + i14);
        }
        e5.h hVar2 = this.f6252a;
        if (!hVar2.H0 && !this.f6253b.H0) {
            hVar = hVar2;
            z11 = false;
        } else {
            hVar = hVar2;
            z11 = true;
        }
        if (!hVar.I0 && !this.f6253b.I0) {
            z12 = false;
        } else {
            z12 = true;
        }
        motionLayout.l(i10, i11, i13, i14, z11, z12);
        HashMap hashMap = motionLayout.f1101x0;
        int childCount = motionLayout.getChildCount();
        motionLayout.f1087m1.a();
        motionLayout.F0 = true;
        SparseArray sparseArray = new SparseArray();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = motionLayout.getChildAt(i17);
            sparseArray.put(childAt.getId(), (p) hashMap.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        z zVar = motionLayout.f1088n0.f1111c;
        if (zVar != null) {
            i2 = zVar.f6286p;
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            for (int i18 = 0; i18 < childCount; i18++) {
                p pVar = (p) hashMap.get(motionLayout.getChildAt(i18));
                if (pVar != null) {
                    pVar.B = i2;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[hashMap.size()];
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            p pVar2 = (p) hashMap.get(motionLayout.getChildAt(i20));
            int i21 = pVar2.f6215f.f6265e0;
            if (i21 != -1) {
                sparseBooleanArray.put(i21, true);
                iArr[i19] = pVar2.f6215f.f6265e0;
                i19++;
            }
        }
        for (int i22 = 0; i22 < i19; i22++) {
            p pVar3 = (p) hashMap.get(motionLayout.findViewById(iArr[i22]));
            if (pVar3 != null) {
                motionLayout.f1088n0.e(pVar3);
                pVar3.g(motionLayout.getNanoTime(), width, height);
            }
        }
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt2 = motionLayout.getChildAt(i23);
            p pVar4 = (p) hashMap.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && pVar4 != null) {
                motionLayout.f1088n0.e(pVar4);
                pVar4.g(motionLayout.getNanoTime(), width, height);
            }
        }
        z zVar2 = motionLayout.f1088n0.f1111c;
        if (zVar2 != null) {
            f8 = zVar2.f6280i;
        } else {
            f8 = 0.0f;
        }
        if (f8 != 0.0f) {
            if (f8 >= 0.0d) {
                z13 = false;
            }
            float abs = Math.abs(f8);
            float f12 = -3.4028235E38f;
            float f13 = Float.MAX_VALUE;
            float f14 = -3.4028235E38f;
            float f15 = Float.MAX_VALUE;
            for (int i24 = 0; i24 < childCount; i24++) {
                p pVar5 = (p) hashMap.get(motionLayout.getChildAt(i24));
                if (!Float.isNaN(pVar5.f6221l)) {
                    for (int i25 = 0; i25 < childCount; i25++) {
                        p pVar6 = (p) hashMap.get(motionLayout.getChildAt(i25));
                        if (!Float.isNaN(pVar6.f6221l)) {
                            f13 = Math.min(f13, pVar6.f6221l);
                            f12 = Math.max(f12, pVar6.f6221l);
                        }
                    }
                    while (i12 < childCount) {
                        p pVar7 = (p) hashMap.get(motionLayout.getChildAt(i12));
                        if (!Float.isNaN(pVar7.f6221l)) {
                            pVar7.f6222n = 1.0f / (1.0f - abs);
                            float f16 = pVar7.f6221l;
                            if (z13) {
                                pVar7.m = abs - (((f12 - f16) / (f12 - f13)) * abs);
                            } else {
                                pVar7.m = abs - (((f16 - f13) * abs) / (f12 - f13));
                            }
                        }
                        i12++;
                    }
                    return;
                }
                x xVar = pVar5.f6216g;
                float f17 = xVar.X;
                float f18 = xVar.Y;
                if (z13) {
                    f11 = f18 - f17;
                } else {
                    f11 = f18 + f17;
                }
                f15 = Math.min(f15, f11);
                f14 = Math.max(f14, f11);
            }
            while (i12 < childCount) {
                p pVar8 = (p) hashMap.get(motionLayout.getChildAt(i12));
                x xVar2 = pVar8.f6216g;
                float f19 = xVar2.X;
                float f20 = xVar2.Y;
                if (z13) {
                    f10 = f20 - f19;
                } else {
                    f10 = f20 + f19;
                }
                pVar8.f6222n = 1.0f / (1.0f - abs);
                pVar8.m = abs - (((f10 - f15) * abs) / (f14 - f15));
                i12++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [i5.r, i5.f] */
    public final void g(e5.h hVar, i5.q qVar) {
        i5.l lVar;
        i5.l lVar2;
        SparseArray sparseArray = new SparseArray();
        ?? fVar = new i5.f();
        sparseArray.clear();
        sparseArray.put(0, hVar);
        MotionLayout motionLayout = this.f6258g;
        sparseArray.put(motionLayout.getId(), hVar);
        if (qVar != null && qVar.f6989d != 0) {
            e5.h hVar2 = this.f6253b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z10 = MotionLayout.f1074r1;
            motionLayout.m(hVar2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
        }
        ArrayList arrayList = hVar.f4331t0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            e5.g gVar = (e5.g) obj;
            gVar.f4305i0 = true;
            sparseArray.put(gVar.f4301g0.getId(), gVar);
        }
        ArrayList arrayList2 = hVar.f4331t0;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            int i11 = i10 + 1;
            e5.g gVar2 = (e5.g) arrayList2.get(i10);
            View view = gVar2.f4301g0;
            int id2 = view.getId();
            HashMap hashMap = qVar.f6992g;
            if (hashMap.containsKey(Integer.valueOf(id2)) && (lVar2 = (i5.l) hashMap.get(Integer.valueOf(id2))) != 0) {
                lVar2.b(fVar);
            }
            gVar2.P(qVar.h(view.getId()).f6906e.f6915c);
            gVar2.M(qVar.h(view.getId()).f6906e.f6917d);
            if (view instanceof i5.c) {
                i5.c cVar = (i5.c) view;
                int id3 = cVar.getId();
                HashMap hashMap2 = qVar.f6992g;
                if (hashMap2.containsKey(Integer.valueOf(id3)) && (lVar = (i5.l) hashMap2.get(Integer.valueOf(id3))) != null && (gVar2 instanceof e5.m)) {
                    cVar.i(lVar, (e5.m) gVar2, fVar, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).k();
                }
            }
            fVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z11 = MotionLayout.f1074r1;
            motionLayout.g(false, view, gVar2, fVar, sparseArray);
            if (qVar.h(view.getId()).f6904c.f6966c == 1) {
                gVar2.f4303h0 = view.getVisibility();
            } else {
                gVar2.f4303h0 = qVar.h(view.getId()).f6904c.f6965b;
            }
            i10 = i11;
        }
        ArrayList arrayList3 = hVar.f4331t0;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            e5.g gVar3 = (e5.g) obj2;
            if (gVar3 instanceof e5.p) {
                i5.c cVar2 = (i5.c) gVar3.f4301g0;
                e5.m mVar = (e5.m) gVar3;
                cVar2.getClass();
                mVar.f4368u0 = 0;
                Arrays.fill(mVar.f4367t0, (Object) null);
                for (int i13 = 0; i13 < cVar2.B; i13++) {
                    mVar.S((e5.g) sparseArray.get(cVar2.A[i13]));
                }
                e5.p pVar = (e5.p) mVar;
                for (int i14 = 0; i14 < pVar.f4368u0; i14++) {
                    e5.g gVar4 = pVar.f4367t0[i14];
                    if (gVar4 != null) {
                        gVar4.F = true;
                    }
                }
            }
        }
    }
}
