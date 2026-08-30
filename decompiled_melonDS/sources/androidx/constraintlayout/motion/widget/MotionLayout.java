package androidx.constraintlayout.motion.widget;

import a6.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import d0.d;
import d5.e;
import e5.g;
import e5.h;
import f6.f;
import h5.a0;
import h5.c0;
import h5.m;
import h5.n;
import h5.p;
import h5.q;
import h5.r;
import h5.s;
import h5.u;
import h5.w;
import h5.x;
import h5.y;
import h5.z;
import i5.i;
import i5.j;
import i5.v;
import java.util.ArrayList;
import java.util.HashMap;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements t {

    /* renamed from: r1  reason: collision with root package name */
    public static boolean f1074r1;
    public float A0;
    public float B0;
    public long C0;
    public float D0;
    public boolean E0;
    public boolean F0;
    public int G0;
    public h5.t H0;
    public boolean I0;
    public final g5.b J0;
    public final s K0;
    public h5.a L0;
    public int M0;
    public int N0;
    public boolean O0;
    public float P0;
    public float Q0;
    public long R0;
    public float S0;
    public boolean T0;
    public int U0;
    public long V0;
    public float W0;
    public boolean X0;
    public int Y0;
    public int Z0;

    /* renamed from: a1  reason: collision with root package name */
    public int f1075a1;

    /* renamed from: b1  reason: collision with root package name */
    public int f1076b1;

    /* renamed from: c1  reason: collision with root package name */
    public int f1077c1;

    /* renamed from: d1  reason: collision with root package name */
    public int f1078d1;

    /* renamed from: e1  reason: collision with root package name */
    public float f1079e1;

    /* renamed from: f1  reason: collision with root package name */
    public final e f1080f1;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f1081g1;

    /* renamed from: h1  reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.a f1082h1;

    /* renamed from: i1  reason: collision with root package name */
    public ad.c f1083i1;

    /* renamed from: j1  reason: collision with root package name */
    public final Rect f1084j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f1085k1;

    /* renamed from: l1  reason: collision with root package name */
    public a f1086l1;

    /* renamed from: m1  reason: collision with root package name */
    public final u f1087m1;

    /* renamed from: n0  reason: collision with root package name */
    public b f1088n0;

    /* renamed from: n1  reason: collision with root package name */
    public boolean f1089n1;

    /* renamed from: o0  reason: collision with root package name */
    public q f1090o0;

    /* renamed from: o1  reason: collision with root package name */
    public final RectF f1091o1;
    public Interpolator p0;

    /* renamed from: p1  reason: collision with root package name */
    public View f1092p1;

    /* renamed from: q0  reason: collision with root package name */
    public float f1093q0;

    /* renamed from: q1  reason: collision with root package name */
    public Matrix f1094q1;

    /* renamed from: r0  reason: collision with root package name */
    public int f1095r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f1096s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f1097t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1098u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f1099v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f1100w0;

    /* renamed from: x0  reason: collision with root package name */
    public final HashMap f1101x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f1102y0;

    /* renamed from: z0  reason: collision with root package name */
    public float f1103z0;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public enum a {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, g5.b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, d5.o, d5.n] */
    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.p0 = null;
        this.f1093q0 = 0.0f;
        this.f1095r0 = -1;
        this.f1096s0 = -1;
        this.f1097t0 = -1;
        int i2 = 0;
        this.f1098u0 = 0;
        this.f1099v0 = 0;
        this.f1100w0 = true;
        this.f1101x0 = new HashMap();
        this.f1102y0 = 0L;
        this.f1103z0 = 1.0f;
        this.A0 = 0.0f;
        this.B0 = 0.0f;
        this.D0 = 0.0f;
        this.F0 = false;
        this.G0 = 0;
        this.I0 = false;
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.f3887k = false;
        obj.f5562a = obj2;
        obj.f5564c = obj2;
        this.J0 = obj;
        this.K0 = new s(this);
        this.O0 = false;
        this.T0 = false;
        this.U0 = 0;
        this.V0 = -1L;
        this.W0 = 0.0f;
        this.X0 = false;
        this.f1080f1 = new e(1);
        this.f1081g1 = false;
        this.f1083i1 = null;
        new HashMap();
        this.f1084j1 = new Rect();
        this.f1085k1 = false;
        this.f1086l1 = a.UNDEFINED;
        this.f1087m1 = new u(this);
        this.f1089n1 = false;
        this.f1091o1 = new RectF();
        this.f1092p1 = null;
        this.f1094q1 = null;
        new ArrayList();
        f1074r1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f7004l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 2) {
                    this.f1088n0 = new b(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f1096s0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.D0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.F0 = true;
                } else if (index == 0) {
                    z10 = obtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.G0 == 0) {
                        this.G0 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.G0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f1088n0 == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f1088n0 = null;
            }
        }
        if (this.G0 != 0) {
            b bVar2 = this.f1088n0;
            if (bVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int g10 = bVar2.g();
                b bVar3 = this.f1088n0;
                i5.q b10 = bVar3.b(bVar3.g());
                String V = d.V(getContext(), g10);
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    int id2 = childAt.getId();
                    if (id2 == -1) {
                        StringBuilder u4 = w.d.u("CHECK: ", V, " ALL VIEWS SHOULD HAVE ID's ");
                        u4.append(childAt.getClass().getName());
                        u4.append(" does not!");
                        Log.w("MotionLayout", u4.toString());
                    }
                    if (b10.i(id2) == null) {
                        StringBuilder u10 = w.d.u("CHECK: ", V, " NO CONSTRAINTS for ");
                        u10.append(d.W(childAt));
                        Log.w("MotionLayout", u10.toString());
                    }
                }
                Integer[] numArr = (Integer[]) b10.f6992g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i12 = 0; i12 < length; i12++) {
                    iArr[i12] = numArr[i12].intValue();
                }
                for (int i13 = 0; i13 < length; i13++) {
                    int i14 = iArr[i13];
                    String V2 = d.V(getContext(), i14);
                    if (findViewById(iArr[i13]) == null) {
                        Log.w("MotionLayout", "CHECK: " + V + " NO View matches id " + V2);
                    }
                    if (b10.h(i14).f6906e.f6917d == -1) {
                        Log.w("MotionLayout", "CHECK: " + V + "(" + V2 + ") no LAYOUT_HEIGHT");
                    }
                    if (b10.h(i14).f6906e.f6915c == -1) {
                        Log.w("MotionLayout", "CHECK: " + V + "(" + V2 + ") no LAYOUT_HEIGHT");
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                ArrayList arrayList = this.f1088n0.f1112d;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    z zVar = (z) obj3;
                    if (zVar == this.f1088n0.f1111c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (zVar.f6275d == zVar.f6274c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i15 = zVar.f6275d;
                    int i16 = zVar.f6274c;
                    String V3 = d.V(getContext(), i15);
                    String V4 = d.V(getContext(), i16);
                    if (sparseIntArray.get(i15) == i16) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + V3 + "->" + V4);
                    }
                    if (sparseIntArray2.get(i16) == i15) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + V3 + "->" + V4);
                    }
                    sparseIntArray.put(i15, i16);
                    sparseIntArray2.put(i16, i15);
                    if (this.f1088n0.b(i15) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + V3);
                    }
                    if (this.f1088n0.b(i16) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + V3);
                    }
                }
            }
        }
        if (this.f1096s0 == -1 && (bVar = this.f1088n0) != null) {
            this.f1096s0 = bVar.g();
            this.f1095r0 = this.f1088n0.g();
            z zVar2 = this.f1088n0.f1111c;
            this.f1097t0 = zVar2 != null ? zVar2.f6274c : -1;
        }
    }

    public static Rect o(MotionLayout motionLayout, g gVar) {
        Rect rect = motionLayout.f1084j1;
        rect.top = gVar.t();
        rect.left = gVar.s();
        rect.right = gVar.r() + rect.left;
        rect.bottom = gVar.l() + rect.top;
        return rect;
    }

    public final void A(int i2, i5.q qVar) {
        b bVar = this.f1088n0;
        if (bVar != null) {
            bVar.f1115g.put(i2, qVar);
        }
        this.f1087m1.e(this.f1088n0.b(this.f1095r0), this.f1088n0.b(this.f1097t0));
        v();
        if (this.f1096s0 == i2) {
            qVar.b(this);
        }
    }

    public final void B(int i2, View... viewArr) {
        i5.q b10;
        b bVar = this.f1088n0;
        if (bVar != null) {
            x0 x0Var = bVar.f1124q;
            String str = (String) x0Var.f14092e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) x0Var.f14090c;
            int size = arrayList2.size();
            int i10 = 0;
            c0 c0Var = null;
            while (i10 < size) {
                int i11 = i10 + 1;
                c0 c0Var2 = (c0) arrayList2.get(i10);
                if (c0Var2.f6098a == i2) {
                    for (View view : viewArr) {
                        if (c0Var2.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = (MotionLayout) x0Var.f14089b;
                        int currentState = motionLayout.getCurrentState();
                        if (c0Var2.f6102e != 2) {
                            if (currentState == -1) {
                                Log.w(str, "No support for ViewTransition within transition yet. Currently: ".concat(motionLayout.toString()));
                            } else {
                                b bVar2 = motionLayout.f1088n0;
                                if (bVar2 == null) {
                                    b10 = null;
                                } else {
                                    b10 = bVar2.b(currentState);
                                }
                                if (b10 != null) {
                                    c0Var = c0Var2;
                                    c0Var.a(x0Var, (MotionLayout) x0Var.f14089b, currentState, b10, viewArr2);
                                }
                            }
                            c0Var = c0Var2;
                        } else {
                            c0Var = c0Var2;
                            c0Var.a(x0Var, (MotionLayout) x0Var.f14089b, currentState, null, viewArr2);
                        }
                        arrayList.clear();
                    } else {
                        c0Var = c0Var2;
                    }
                }
                i10 = i11;
            }
            if (c0Var == null) {
                Log.e(str, " Could not find ViewTransition");
                return;
            }
            return;
        }
        Log.e("MotionLayout", " no motionScene");
    }

    @Override // a6.s
    public final void a(View view, View view2, int i2, int i10) {
        this.R0 = getNanoTime();
        this.S0 = 0.0f;
        this.P0 = 0.0f;
        this.Q0 = 0.0f;
    }

    @Override // a6.s
    public final void b(View view, int i2) {
        c cVar;
        float f8;
        int i10;
        b bVar = this.f1088n0;
        if (bVar != null) {
            float f10 = this.S0;
            float f11 = 0.0f;
            if (f10 != 0.0f) {
                float f12 = this.P0 / f10;
                float f13 = this.Q0 / f10;
                z zVar = bVar.f1111c;
                if (zVar != null && (cVar = zVar.f6283l) != null) {
                    float[] fArr = cVar.f1139n;
                    cVar.m = false;
                    MotionLayout motionLayout = cVar.f1143r;
                    float progress = motionLayout.getProgress();
                    cVar.f1143r.s(cVar.f1130d, progress, cVar.f1134h, cVar.f1133g, fArr);
                    float f14 = cVar.f1137k;
                    float f15 = fArr[0];
                    float f16 = cVar.f1138l;
                    float f17 = fArr[1];
                    if (f14 != 0.0f) {
                        f8 = (f12 * f14) / f15;
                    } else {
                        f8 = (f13 * f16) / f17;
                    }
                    if (!Float.isNaN(f8)) {
                        progress += f8 / 3.0f;
                    }
                    if (progress != 0.0f && progress != 1.0f && (i10 = cVar.f1129c) != 3) {
                        if (progress >= 0.5d) {
                            f11 = 1.0f;
                        }
                        motionLayout.y(f11, f8, i10);
                    }
                }
            }
        }
    }

    @Override // a6.s
    public final void c(View view, int i2, int i10, int[] iArr, int i11) {
        z zVar;
        boolean z10;
        boolean z11;
        float f8;
        c cVar;
        float f10;
        float f11;
        c cVar2;
        c cVar3;
        c cVar4;
        int i12;
        b bVar = this.f1088n0;
        if (bVar != null && (zVar = bVar.f1111c) != null && !(z10 = zVar.f6285o)) {
            int i13 = -1;
            if (z10 || (cVar4 = zVar.f6283l) == null || (i12 = cVar4.f1131e) == -1 || view.getId() == i12) {
                z zVar2 = bVar.f1111c;
                if (zVar2 != null && (cVar3 = zVar2.f6283l) != null) {
                    z11 = cVar3.f1146u;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c cVar5 = zVar.f6283l;
                    if (cVar5 != null && (cVar5.f1148w & 4) != 0) {
                        i13 = i10;
                    }
                    float f12 = this.A0;
                    if ((f12 == 1.0f || f12 == 0.0f) && view.canScrollVertically(i13)) {
                        return;
                    }
                }
                c cVar6 = zVar.f6283l;
                if (cVar6 != null && (cVar6.f1148w & 1) != 0) {
                    float f13 = i2;
                    float f14 = i10;
                    z zVar3 = bVar.f1111c;
                    if (zVar3 != null && (cVar2 = zVar3.f6283l) != null) {
                        float[] fArr = cVar2.f1139n;
                        f8 = 0.0f;
                        cVar2.f1143r.s(cVar2.f1130d, cVar2.f1143r.getProgress(), cVar2.f1134h, cVar2.f1133g, fArr);
                        float f15 = cVar2.f1137k;
                        if (f15 != 0.0f) {
                            if (fArr[0] == 0.0f) {
                                fArr[0] = 1.0E-7f;
                            }
                            f11 = (f13 * f15) / fArr[0];
                        } else {
                            if (fArr[1] == 0.0f) {
                                fArr[1] = 1.0E-7f;
                            }
                            f11 = (f14 * cVar2.f1138l) / fArr[1];
                        }
                    } else {
                        f8 = 0.0f;
                        f11 = 0.0f;
                    }
                    float f16 = this.B0;
                    if ((f16 <= f8 && f11 < f8) || (f16 >= 1.0f && f11 > f8)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new r((ViewGroup) view, 0));
                        return;
                    }
                } else {
                    f8 = 0.0f;
                }
                float f17 = this.A0;
                long nanoTime = getNanoTime();
                float f18 = i2;
                this.P0 = f18;
                float f19 = i10;
                this.Q0 = f19;
                this.S0 = (float) ((nanoTime - this.R0) * 1.0E-9d);
                this.R0 = nanoTime;
                z zVar4 = bVar.f1111c;
                if (zVar4 != null && (cVar = zVar4.f6283l) != null) {
                    float[] fArr2 = cVar.f1139n;
                    MotionLayout motionLayout = cVar.f1143r;
                    float progress = motionLayout.getProgress();
                    if (!cVar.m) {
                        cVar.m = true;
                        motionLayout.setProgress(progress);
                    }
                    cVar.f1143r.s(cVar.f1130d, progress, cVar.f1134h, cVar.f1133g, fArr2);
                    if (Math.abs((cVar.f1138l * fArr2[1]) + (cVar.f1137k * fArr2[0])) < 0.01d) {
                        fArr2[0] = 0.01f;
                        fArr2[1] = 0.01f;
                    }
                    float f20 = cVar.f1137k;
                    if (f20 != f8) {
                        f10 = (f18 * f20) / fArr2[0];
                    } else {
                        f10 = (f19 * cVar.f1138l) / fArr2[1];
                    }
                    float max = Math.max(Math.min(progress + f10, 1.0f), f8);
                    if (max != motionLayout.getProgress()) {
                        motionLayout.setProgress(max);
                    }
                }
                if (f17 != this.A0) {
                    iArr[0] = i2;
                    iArr[1] = i10;
                }
                r(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.O0 = true;
                }
            }
        }
    }

    @Override // a6.t
    public final void d(View view, int i2, int i10, int i11, int i12, int i13, int[] iArr) {
        if (this.O0 || i2 != 0 || i10 != 0) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }
        this.O0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e4  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r41) {
        /*
            Method dump skipped, instructions count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // a6.s
    public final boolean f(View view, View view2, int i2, int i10) {
        z zVar;
        c cVar;
        b bVar = this.f1088n0;
        if (bVar != null && (zVar = bVar.f1111c) != null && (cVar = zVar.f6283l) != null && (cVar.f1148w & 2) == 0) {
            return true;
        }
        return false;
    }

    public int[] getConstraintSetIds() {
        b bVar = this.f1088n0;
        if (bVar == null) {
            return null;
        }
        SparseArray sparseArray = bVar.f1115g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f1096s0;
    }

    public ArrayList<z> getDefinedTransitions() {
        b bVar = this.f1088n0;
        if (bVar == null) {
            return null;
        }
        return bVar.f1112d;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [h5.a, java.lang.Object] */
    public h5.a getDesignTool() {
        if (this.L0 == null) {
            this.L0 = new Object();
        }
        return this.L0;
    }

    public int getEndState() {
        return this.f1097t0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.B0;
    }

    public b getScene() {
        return this.f1088n0;
    }

    public int getStartState() {
        return this.f1095r0;
    }

    public float getTargetPosition() {
        return this.D0;
    }

    public Bundle getTransitionState() {
        if (this.f1082h1 == null) {
            this.f1082h1 = new androidx.constraintlayout.motion.widget.a(this);
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f1082h1;
        MotionLayout motionLayout = aVar.f1108e;
        aVar.f1107d = motionLayout.f1097t0;
        aVar.f1106c = motionLayout.f1095r0;
        aVar.f1105b = motionLayout.getVelocity();
        aVar.f1104a = motionLayout.getProgress();
        androidx.constraintlayout.motion.widget.a aVar2 = this.f1082h1;
        aVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", aVar2.f1104a);
        bundle.putFloat("motion.velocity", aVar2.f1105b);
        bundle.putInt("motion.StartState", aVar2.f1106c);
        bundle.putInt("motion.EndState", aVar2.f1107d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        int i2;
        b bVar = this.f1088n0;
        if (bVar != null) {
            z zVar = bVar.f1111c;
            if (zVar != null) {
                i2 = zVar.f6279h;
            } else {
                i2 = bVar.f1118j;
            }
            this.f1103z0 = i2 / 1000.0f;
        }
        return this.f1103z0 * 1000.0f;
    }

    public float getVelocity() {
        return this.f1093q0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void k(int i2) {
        this.f1162h0 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        z zVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.f1088n0;
        if (bVar != null && (i2 = this.f1096s0) != -1) {
            i5.q b10 = bVar.b(i2);
            b bVar2 = this.f1088n0;
            SparseArray sparseArray = bVar2.f1115g;
            loop0: for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int keyAt = sparseArray.keyAt(i10);
                SparseIntArray sparseIntArray = bVar2.f1117i;
                int i11 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i11 > 0) {
                    if (i11 != keyAt) {
                        int i12 = size - 1;
                        if (size >= 0) {
                            i11 = sparseIntArray.get(i11);
                            size = i12;
                        }
                    }
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break loop0;
                }
                bVar2.l(keyAt, this);
            }
            if (b10 != null) {
                b10.b(this);
            }
            this.f1095r0 = this.f1096s0;
        }
        u();
        androidx.constraintlayout.motion.widget.a aVar = this.f1082h1;
        if (aVar != null) {
            if (this.f1085k1) {
                post(new r(this, 1));
                return;
            } else {
                aVar.a();
                return;
            }
        }
        b bVar3 = this.f1088n0;
        if (bVar3 != null && (zVar = bVar3.f1111c) != null && zVar.f6284n == 4) {
            p(1.0f);
            this.f1083i1 = null;
            setState(a.SETUP);
            setState(a.MOVING);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        MotionLayout motionLayout;
        this.f1081g1 = true;
        try {
            if (this.f1088n0 == null) {
                super.onLayout(z10, i2, i10, i11, i12);
                this.f1081g1 = false;
                return;
            }
            motionLayout = this;
            int i13 = i11 - i2;
            int i14 = i12 - i10;
            try {
                if (motionLayout.M0 == i13) {
                    if (motionLayout.N0 != i14) {
                    }
                    motionLayout.M0 = i13;
                    motionLayout.N0 = i14;
                    motionLayout.f1081g1 = false;
                }
                v();
                r(true);
                motionLayout.M0 = i13;
                motionLayout.N0 = i14;
                motionLayout.f1081g1 = false;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                motionLayout.f1081g1 = false;
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            motionLayout = this;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        float f8;
        if (this.f1088n0 == null) {
            super.onMeasure(i2, i10);
            return;
        }
        boolean z12 = true;
        if (this.f1098u0 == i2 && this.f1099v0 == i10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f1089n1) {
            this.f1089n1 = false;
            u();
            z10 = true;
        }
        if (this.f1159e0) {
            z10 = true;
        }
        this.f1098u0 = i2;
        this.f1099v0 = i10;
        int g10 = this.f1088n0.g();
        z zVar = this.f1088n0.f1111c;
        if (zVar == null) {
            i11 = -1;
        } else {
            i11 = zVar.f6274c;
        }
        u uVar = this.f1087m1;
        if ((z10 || g10 != uVar.f6256e || i11 != uVar.f6257f) && this.f1095r0 != -1) {
            super.onMeasure(i2, i10);
            uVar.e(this.f1088n0.b(g10), this.f1088n0.b(i11));
            uVar.f();
            uVar.f6256e = g10;
            uVar.f6257f = i11;
            z11 = false;
        } else {
            if (z10) {
                super.onMeasure(i2, i10);
            }
            z11 = true;
        }
        if (this.X0 || z11) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            h hVar = this.L;
            int r5 = hVar.r() + paddingRight;
            int l10 = hVar.l() + paddingBottom;
            int i14 = this.f1077c1;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                r5 = (int) ((this.f1079e1 * (this.f1075a1 - i12)) + this.Y0);
                requestLayout();
            }
            int i15 = this.f1078d1;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                l10 = (int) ((this.f1079e1 * (this.f1076b1 - i13)) + this.Z0);
                requestLayout();
            }
            setMeasuredDimension(r5, l10);
        }
        float signum = Math.signum(this.D0 - this.B0);
        long nanoTime = getNanoTime();
        q qVar = this.f1090o0;
        if (!(qVar instanceof g5.b)) {
            f8 = ((((float) (nanoTime - this.C0)) * signum) * 1.0E-9f) / this.f1103z0;
        } else {
            f8 = 0.0f;
        }
        float f10 = this.B0 + f8;
        if (this.E0) {
            f10 = this.D0;
        }
        int i16 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i16 > 0 && f10 >= this.D0) || (signum <= 0.0f && f10 <= this.D0)) {
            f10 = this.D0;
        } else {
            z12 = false;
        }
        if (qVar != null && !z12) {
            if (this.I0) {
                f10 = qVar.getInterpolation(((float) (nanoTime - this.f1102y0)) * 1.0E-9f);
            } else {
                f10 = qVar.getInterpolation(f10);
            }
        }
        if ((i16 > 0 && f10 >= this.D0) || (signum <= 0.0f && f10 <= this.D0)) {
            f10 = this.D0;
        }
        this.f1079e1 = f10;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.p0;
        if (interpolator != null) {
            f10 = interpolator.getInterpolation(f10);
        }
        float f11 = f10;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            p pVar = (p) this.f1101x0.get(childAt);
            if (pVar != null) {
                pVar.d(f11, nanoTime2, childAt, this.f1080f1);
            }
        }
        if (this.X0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f10) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        c cVar;
        b bVar = this.f1088n0;
        if (bVar != null) {
            boolean j2 = j();
            bVar.f1123p = j2;
            z zVar = bVar.f1111c;
            if (zVar != null && (cVar = zVar.f6283l) != null) {
                cVar.c(j2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07cd A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f8) {
        int i2;
        b bVar = this.f1088n0;
        if (bVar != null) {
            float f10 = this.B0;
            float f11 = this.A0;
            if (f10 != f11 && this.E0) {
                this.B0 = f11;
            }
            float f12 = this.B0;
            if (f12 == f8) {
                return;
            }
            this.I0 = false;
            this.D0 = f8;
            z zVar = bVar.f1111c;
            if (zVar != null) {
                i2 = zVar.f6279h;
            } else {
                i2 = bVar.f1118j;
            }
            this.f1103z0 = i2 / 1000.0f;
            setProgress(f8);
            this.f1090o0 = null;
            this.p0 = this.f1088n0.d();
            this.E0 = false;
            this.f1102y0 = getNanoTime();
            this.F0 = true;
            this.A0 = f12;
            this.B0 = f12;
            invalidate();
        }
    }

    public final void q(boolean z10) {
        float f8;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            p pVar = (p) this.f1101x0.get(getChildAt(i2));
            if (pVar != null && "button".equals(d.W(pVar.f6211b)) && pVar.A != null) {
                int i10 = 0;
                while (true) {
                    m[] mVarArr = pVar.A;
                    if (i10 < mVarArr.length) {
                        m mVar = mVarArr[i10];
                        if (z10) {
                            f8 = -100.0f;
                        } else {
                            f8 = 100.0f;
                        }
                        mVar.g(pVar.f6211b, f8);
                        i10++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r21) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.r(boolean):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        b bVar;
        z zVar;
        if (!this.X0 && this.f1096s0 == -1 && (bVar = this.f1088n0) != null && (zVar = bVar.f1111c) != null) {
            int i2 = zVar.f6287q;
            if (i2 != 0) {
                if (i2 == 2) {
                    int childCount = getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        ((p) this.f1101x0.get(getChildAt(i10))).f6213d = true;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(int i2, float f8, float f10, float f11, float[] fArr) {
        String resourceName;
        double[] dArr;
        View view = (View) this.A.get(i2);
        p pVar = (p) this.f1101x0.get(view);
        if (pVar != null) {
            x xVar = pVar.f6215f;
            float[] fArr2 = pVar.f6230v;
            float a10 = pVar.a(f8, fArr2);
            ij.a[] aVarArr = pVar.f6219j;
            int i10 = 0;
            if (aVarArr != null) {
                double d4 = a10;
                aVarArr[0].e0(d4, pVar.f6225q);
                pVar.f6219j[0].a0(d4, pVar.f6224p);
                float f12 = fArr2[0];
                while (true) {
                    dArr = pVar.f6225q;
                    if (i10 >= dArr.length) {
                        break;
                    }
                    dArr[i10] = dArr[i10] * f12;
                    i10++;
                }
                d5.b bVar = pVar.f6220k;
                if (bVar != null) {
                    double[] dArr2 = pVar.f6224p;
                    if (dArr2.length > 0) {
                        bVar.a0(d4, dArr2);
                        pVar.f6220k.e0(d4, pVar.f6225q);
                        int[] iArr = pVar.f6223o;
                        double[] dArr3 = pVar.f6225q;
                        double[] dArr4 = pVar.f6224p;
                        xVar.getClass();
                        x.e(f10, f11, fArr, iArr, dArr3, dArr4);
                    }
                } else {
                    int[] iArr2 = pVar.f6223o;
                    double[] dArr5 = pVar.f6224p;
                    xVar.getClass();
                    x.e(f10, f11, fArr, iArr2, dArr, dArr5);
                }
            } else {
                x xVar2 = pVar.f6216g;
                float f13 = xVar2.X - xVar.X;
                float f14 = xVar2.Y - xVar.Y;
                fArr[0] = (((xVar2.Z - xVar.Z) + f13) * f10) + ((1.0f - f10) * f13);
                fArr[1] = (((xVar2.f6262b0 - xVar.f6262b0) + f14) * f11) + ((1.0f - f11) * f14);
            }
            view.getY();
            return;
        }
        if (view == null) {
            resourceName = w.d.l(i2, "");
        } else {
            resourceName = view.getContext().getResources().getResourceName(i2);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    public void setDebugMode(int i2) {
        this.G0 = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f1085k1 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f1100w0 = z10;
    }

    public void setInterpolatedProgress(float f8) {
        if (this.f1088n0 != null) {
            setState(a.MOVING);
            Interpolator d4 = this.f1088n0.d();
            if (d4 != null) {
                setProgress(d4.getInterpolation(f8));
                return;
            }
        }
        setProgress(f8);
    }

    public void setProgress(float f8) {
        int i2 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
        if (i2 < 0 || f8 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f1082h1 == null) {
                this.f1082h1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            this.f1082h1.f1104a = f8;
            return;
        }
        if (i2 <= 0) {
            if (this.B0 == 1.0f && this.f1096s0 == this.f1097t0) {
                setState(a.MOVING);
            }
            this.f1096s0 = this.f1095r0;
            if (this.B0 == 0.0f) {
                setState(a.FINISHED);
            }
        } else if (f8 >= 1.0f) {
            if (this.B0 == 0.0f && this.f1096s0 == this.f1095r0) {
                setState(a.MOVING);
            }
            this.f1096s0 = this.f1097t0;
            if (this.B0 == 1.0f) {
                setState(a.FINISHED);
            }
        } else {
            this.f1096s0 = -1;
            setState(a.MOVING);
        }
        if (this.f1088n0 == null) {
            return;
        }
        this.E0 = true;
        this.D0 = f8;
        this.A0 = f8;
        this.C0 = -1L;
        this.f1102y0 = -1L;
        this.f1090o0 = null;
        this.F0 = true;
        invalidate();
    }

    public void setScene(b bVar) {
        c cVar;
        this.f1088n0 = bVar;
        boolean j2 = j();
        bVar.f1123p = j2;
        z zVar = bVar.f1111c;
        if (zVar != null && (cVar = zVar.f6283l) != null) {
            cVar.c(j2);
        }
        v();
    }

    public void setStartState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.f1082h1 == null) {
                this.f1082h1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            androidx.constraintlayout.motion.widget.a aVar = this.f1082h1;
            aVar.f1106c = i2;
            aVar.f1107d = i2;
            return;
        }
        this.f1096s0 = i2;
    }

    public void setState(a aVar) {
        ad.c cVar;
        ad.c cVar2;
        a aVar2 = a.FINISHED;
        if (aVar != aVar2 || this.f1096s0 != -1) {
            a aVar3 = this.f1086l1;
            this.f1086l1 = aVar;
            a aVar4 = a.UNDEFINED;
            int ordinal = aVar3.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2 && aVar == aVar2 && (cVar2 = this.f1083i1) != null) {
                    cVar2.run();
                    this.f1083i1 = null;
                }
            } else if (aVar == aVar2 && (cVar = this.f1083i1) != null) {
                cVar.run();
                this.f1083i1 = null;
            }
        }
    }

    public void setTransition(int i2) {
        z zVar;
        float f8;
        float f10;
        b bVar = this.f1088n0;
        if (bVar != null) {
            ArrayList arrayList = bVar.f1112d;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    zVar = (z) obj;
                    if (zVar.f6272a == i2) {
                        break;
                    }
                } else {
                    zVar = null;
                    break;
                }
            }
            this.f1095r0 = zVar.f6275d;
            this.f1097t0 = zVar.f6274c;
            if (!isAttachedToWindow()) {
                if (this.f1082h1 == null) {
                    this.f1082h1 = new androidx.constraintlayout.motion.widget.a(this);
                }
                androidx.constraintlayout.motion.widget.a aVar = this.f1082h1;
                aVar.f1106c = this.f1095r0;
                aVar.f1107d = this.f1097t0;
                return;
            }
            int i11 = this.f1096s0;
            if (i11 == this.f1095r0) {
                f8 = 0.0f;
            } else if (i11 == this.f1097t0) {
                f8 = 1.0f;
            } else {
                f8 = Float.NaN;
            }
            b bVar2 = this.f1088n0;
            bVar2.f1111c = zVar;
            c cVar = zVar.f6283l;
            if (cVar != null) {
                cVar.c(bVar2.f1123p);
            }
            this.f1087m1.e(this.f1088n0.b(this.f1095r0), this.f1088n0.b(this.f1097t0));
            v();
            if (this.B0 != f8) {
                if (f8 == 0.0f) {
                    q(true);
                    this.f1088n0.b(this.f1095r0).b(this);
                } else if (f8 == 1.0f) {
                    q(false);
                    this.f1088n0.b(this.f1097t0).b(this);
                }
            }
            if (Float.isNaN(f8)) {
                f10 = 0.0f;
            } else {
                f10 = f8;
            }
            this.B0 = f10;
            if (Float.isNaN(f8)) {
                Log.v("MotionLayout", d.U().concat(" transitionToStart "));
                p(0.0f);
                return;
            }
            setProgress(f8);
        }
    }

    public void setTransitionDuration(int i2) {
        b bVar = this.f1088n0;
        if (bVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        z zVar = bVar.f1111c;
        if (zVar != null) {
            zVar.f6279h = Math.max(i2, 8);
        } else {
            bVar.f1118j = i2;
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1082h1 == null) {
            this.f1082h1 = new androidx.constraintlayout.motion.widget.a(this);
        }
        androidx.constraintlayout.motion.widget.a aVar = this.f1082h1;
        aVar.getClass();
        aVar.f1104a = bundle.getFloat("motion.progress");
        aVar.f1105b = bundle.getFloat("motion.velocity");
        aVar.f1106c = bundle.getInt("motion.StartState");
        aVar.f1107d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f1082h1.a();
        }
    }

    public final boolean t(float f8, float f10, View view, MotionEvent motionEvent) {
        boolean z10;
        boolean onTouchEvent;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (t((childAt.getLeft() + f8) - view.getScrollX(), (childAt.getTop() + f10) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (!z10) {
            RectF rectF = this.f1091o1;
            rectF.set(f8, f10, (view.getRight() + f8) - view.getLeft(), (view.getBottom() + f10) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f11 = -f8;
                float f12 = -f10;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f11, f12);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f11, -f12);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f11, f12);
                    if (this.f1094q1 == null) {
                        this.f1094q1 = new Matrix();
                    }
                    matrix.invert(this.f1094q1);
                    obtain.transform(this.f1094q1);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return d.V(context, this.f1095r0) + "->" + d.V(context, this.f1097t0) + " (pos:" + this.B0 + " Dpos/Dt:" + this.f1093q0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [f6.f, java.lang.Object] */
    public final void u() {
        z zVar;
        c cVar;
        View view;
        b bVar = this.f1088n0;
        if (bVar != null) {
            if (bVar.a(this.f1096s0, this)) {
                requestLayout();
                return;
            }
            int i2 = this.f1096s0;
            if (i2 != -1) {
                b bVar2 = this.f1088n0;
                ArrayList arrayList = bVar2.f1114f;
                ArrayList arrayList2 = bVar2.f1112d;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    z zVar2 = (z) obj;
                    if (zVar2.m.size() > 0) {
                        ArrayList arrayList3 = zVar2.m;
                        int size2 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList3.get(i11);
                            i11++;
                            ((y) obj2).b(this);
                        }
                    }
                }
                int size3 = arrayList.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    z zVar3 = (z) obj3;
                    if (zVar3.m.size() > 0) {
                        ArrayList arrayList4 = zVar3.m;
                        int size4 = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj4 = arrayList4.get(i13);
                            i13++;
                            ((y) obj4).b(this);
                        }
                    }
                }
                int size5 = arrayList2.size();
                int i14 = 0;
                while (i14 < size5) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    z zVar4 = (z) obj5;
                    if (zVar4.m.size() > 0) {
                        ArrayList arrayList5 = zVar4.m;
                        int size6 = arrayList5.size();
                        int i15 = 0;
                        while (i15 < size6) {
                            Object obj6 = arrayList5.get(i15);
                            i15++;
                            ((y) obj6).a(this, i2, zVar4);
                        }
                    }
                }
                int size7 = arrayList.size();
                int i16 = 0;
                while (i16 < size7) {
                    Object obj7 = arrayList.get(i16);
                    i16++;
                    z zVar5 = (z) obj7;
                    if (zVar5.m.size() > 0) {
                        ArrayList arrayList6 = zVar5.m;
                        int size8 = arrayList6.size();
                        int i17 = 0;
                        while (i17 < size8) {
                            Object obj8 = arrayList6.get(i17);
                            i17++;
                            ((y) obj8).a(this, i2, zVar5);
                        }
                    }
                }
            }
            if (this.f1088n0.n() && (zVar = this.f1088n0.f1111c) != null && (cVar = zVar.f6283l) != null) {
                MotionLayout motionLayout = cVar.f1143r;
                int i18 = cVar.f1130d;
                if (i18 != -1) {
                    view = motionLayout.findViewById(i18);
                    if (view == null) {
                        Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + d.V(motionLayout.getContext(), cVar.f1130d));
                    }
                } else {
                    view = null;
                }
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    nestedScrollView.setOnTouchListener(new a0(0));
                    nestedScrollView.setOnScrollChangeListener((f) new Object());
                }
            }
        }
    }

    public final void v() {
        this.f1087m1.f();
        invalidate();
    }

    public final void w(int i2) {
        i5.q qVar;
        i5.h hVar;
        i5.q qVar2;
        setState(a.SETUP);
        this.f1096s0 = i2;
        this.f1095r0 = -1;
        this.f1097t0 = -1;
        j jVar = this.f1162h0;
        if (jVar != null) {
            float f8 = -1;
            ConstraintLayout constraintLayout = (ConstraintLayout) jVar.f6887c;
            SparseArray sparseArray = (SparseArray) jVar.f6888d;
            int i10 = jVar.f6885a;
            int i11 = 0;
            if (i10 == i2) {
                if (i2 == -1) {
                    hVar = (i5.h) sparseArray.valueAt(0);
                } else {
                    hVar = (i5.h) sparseArray.get(i10);
                }
                int i12 = jVar.f6886b;
                if (i12 == -1 || !((i) hVar.f6876b.get(i12)).a(f8, f8)) {
                    ArrayList arrayList = hVar.f6876b;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if (((i) arrayList.get(i11)).a(f8, f8)) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    ArrayList arrayList2 = hVar.f6876b;
                    if (jVar.f6886b != i11) {
                        if (i11 == -1) {
                            qVar2 = null;
                        } else {
                            qVar2 = ((i) arrayList2.get(i11)).f6884f;
                        }
                        if (i11 != -1) {
                            int i13 = ((i) arrayList2.get(i11)).f6883e;
                        }
                        if (qVar2 != null) {
                            jVar.f6886b = i11;
                            qVar2.b(constraintLayout);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            jVar.f6885a = i2;
            i5.h hVar2 = (i5.h) sparseArray.get(i2);
            ArrayList arrayList3 = hVar2.f6876b;
            while (true) {
                if (i11 < arrayList3.size()) {
                    if (((i) arrayList3.get(i11)).a(f8, f8)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            ArrayList arrayList4 = hVar2.f6876b;
            if (i11 == -1) {
                qVar = hVar2.f6878d;
            } else {
                qVar = ((i) arrayList4.get(i11)).f6884f;
            }
            if (i11 != -1) {
                int i14 = ((i) arrayList4.get(i11)).f6883e;
            }
            if (qVar == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =-1.0, -1.0");
                return;
            }
            jVar.f6886b = i11;
            qVar.b(constraintLayout);
            return;
        }
        b bVar = this.f1088n0;
        if (bVar != null) {
            bVar.b(i2).b(this);
        }
    }

    public final void x(int i2, int i10) {
        if (!isAttachedToWindow()) {
            if (this.f1082h1 == null) {
                this.f1082h1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            androidx.constraintlayout.motion.widget.a aVar = this.f1082h1;
            aVar.f1106c = i2;
            aVar.f1107d = i10;
            return;
        }
        b bVar = this.f1088n0;
        if (bVar != null) {
            this.f1095r0 = i2;
            this.f1097t0 = i10;
            bVar.m(i2, i10);
            this.f1087m1.e(this.f1088n0.b(i2), this.f1088n0.b(i10));
            v();
            this.B0 = 0.0f;
            p(0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r20 != 7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if ((((r19 * r5) - (((r2 * r5) * r5) / 2.0f)) + r1) > 1.0f) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        if ((((((r2 * r5) * r5) / 2.0f) + (r19 * r5)) + r1) < 0.0f) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r1 = r17.B0;
        r2 = r17.f1088n0.f();
        r9.f6235a = r19;
        r9.f6236b = r1;
        r9.f6237c = r2;
        r17.f1090o0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        r2 = r17.B0;
        r5 = r17.f1103z0;
        r6 = r17.f1088n0.f();
        r1 = r17.f1088n0.f1111c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        r1 = r1.f6283l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
        r7 = r1.f1144s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
        r17.J0.b(r2, r3, r19, r5, r6, r7);
        r17.f1093q0 = 0.0f;
        r1 = r17.f1096s0;
        r17.D0 = r3;
        r17.f1096s0 = r1;
        r17.f1090o0 = r8;
     */
    /* JADX WARN: Type inference failed for: r10v3, types: [d5.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(float r18, float r19, int r20) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.y(float, float, int):void");
    }

    public final void z(int i2) {
        int i10;
        float f8;
        float alpha;
        bk.a aVar;
        if (!isAttachedToWindow()) {
            if (this.f1082h1 == null) {
                this.f1082h1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            this.f1082h1.f1107d = i2;
            return;
        }
        b bVar = this.f1088n0;
        if (bVar != null && (aVar = bVar.f1110b) != null) {
            int i11 = this.f1096s0;
            float f10 = -1;
            i5.x xVar = (i5.x) ((SparseArray) aVar.L).get(i2);
            if (xVar == null) {
                i11 = i2;
            } else {
                ArrayList arrayList = xVar.f7017b;
                int i12 = xVar.f7018c;
                int i13 = (f10 > (-1.0f) ? 1 : (f10 == (-1.0f) ? 0 : -1));
                if (i13 != 0 && i13 != 0) {
                    int size = arrayList.size();
                    i5.y yVar = null;
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            Object obj = arrayList.get(i14);
                            i14++;
                            i5.y yVar2 = (i5.y) obj;
                            if (yVar2.a(f10, f10)) {
                                if (i11 == yVar2.f7023e) {
                                    break;
                                }
                                yVar = yVar2;
                            }
                        } else if (yVar != null) {
                            i11 = yVar.f7023e;
                        }
                    }
                } else if (i12 != i11) {
                    int size2 = arrayList.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        Object obj2 = arrayList.get(i15);
                        i15++;
                        if (i11 == ((i5.y) obj2).f7023e) {
                            break;
                        }
                    }
                    i11 = i12;
                }
            }
            if (i11 != -1) {
                i2 = i11;
            }
        }
        int i16 = this.f1096s0;
        if (i16 == i2) {
            return;
        }
        if (this.f1095r0 == i2) {
            p(0.0f);
        } else if (this.f1097t0 == i2) {
            p(1.0f);
        } else {
            this.f1097t0 = i2;
            if (i16 != -1) {
                x(i16, i2);
                p(1.0f);
                this.B0 = 0.0f;
                p(1.0f);
                this.f1083i1 = null;
                return;
            }
            this.I0 = false;
            this.D0 = 1.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = getNanoTime();
            this.f1102y0 = getNanoTime();
            this.E0 = false;
            this.f1090o0 = null;
            b bVar2 = this.f1088n0;
            z zVar = bVar2.f1111c;
            if (zVar != null) {
                i10 = zVar.f6279h;
            } else {
                i10 = bVar2.f1118j;
            }
            this.f1103z0 = i10 / 1000.0f;
            this.f1095r0 = -1;
            bVar2.m(-1, this.f1097t0);
            SparseArray sparseArray = new SparseArray();
            int childCount = getChildCount();
            HashMap hashMap = this.f1101x0;
            hashMap.clear();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                hashMap.put(childAt, new p(childAt));
                sparseArray.put(childAt.getId(), (p) hashMap.get(childAt));
            }
            this.F0 = true;
            i5.q b10 = this.f1088n0.b(i2);
            u uVar = this.f1087m1;
            uVar.e(null, b10);
            v();
            uVar.a();
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                p pVar = (p) hashMap.get(childAt2);
                if (pVar != null) {
                    x xVar2 = pVar.f6215f;
                    xVar2.L = 0.0f;
                    xVar2.R = 0.0f;
                    xVar2.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                    n nVar = pVar.f6217h;
                    nVar.getClass();
                    childAt2.getX();
                    childAt2.getY();
                    childAt2.getWidth();
                    childAt2.getHeight();
                    nVar.L = childAt2.getVisibility();
                    if (childAt2.getVisibility() != 0) {
                        alpha = 0.0f;
                    } else {
                        alpha = childAt2.getAlpha();
                    }
                    nVar.X = alpha;
                    nVar.Y = childAt2.getElevation();
                    nVar.Z = childAt2.getRotation();
                    nVar.f6198b0 = childAt2.getRotationX();
                    nVar.A = childAt2.getRotationY();
                    nVar.f6199c0 = childAt2.getScaleX();
                    nVar.f6200d0 = childAt2.getScaleY();
                    nVar.f6201e0 = childAt2.getPivotX();
                    nVar.f6202f0 = childAt2.getPivotY();
                    nVar.f6203g0 = childAt2.getTranslationX();
                    nVar.f6204h0 = childAt2.getTranslationY();
                    nVar.f6205i0 = childAt2.getTranslationZ();
                }
            }
            int width = getWidth();
            int height = getHeight();
            for (int i19 = 0; i19 < childCount; i19++) {
                p pVar2 = (p) hashMap.get(getChildAt(i19));
                if (pVar2 != null) {
                    this.f1088n0.e(pVar2);
                    pVar2.g(getNanoTime(), width, height);
                }
            }
            z zVar2 = this.f1088n0.f1111c;
            if (zVar2 != null) {
                f8 = zVar2.f6280i;
            } else {
                f8 = 0.0f;
            }
            if (f8 != 0.0f) {
                float f11 = Float.MAX_VALUE;
                float f12 = -3.4028235E38f;
                for (int i20 = 0; i20 < childCount; i20++) {
                    x xVar3 = ((p) hashMap.get(getChildAt(i20))).f6216g;
                    float f13 = xVar3.Y + xVar3.X;
                    f11 = Math.min(f11, f13);
                    f12 = Math.max(f12, f13);
                }
                for (int i21 = 0; i21 < childCount; i21++) {
                    p pVar3 = (p) hashMap.get(getChildAt(i21));
                    x xVar4 = pVar3.f6216g;
                    float f14 = xVar4.X;
                    float f15 = xVar4.Y;
                    pVar3.f6222n = 1.0f / (1.0f - f8);
                    pVar3.m = f8 - ((((f14 + f15) - f11) * f8) / (f12 - f11));
                }
            }
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.F0 = true;
            invalidate();
        }
    }

    public void setOnHide(float f8) {
    }

    public void setOnShow(float f8) {
    }

    public void setTransitionListener(w wVar) {
    }

    public void setTransition(z zVar) {
        c cVar;
        b bVar = this.f1088n0;
        bVar.f1111c = zVar;
        if (zVar != null && (cVar = zVar.f6283l) != null) {
            cVar.c(bVar.f1123p);
        }
        setState(a.SETUP);
        int i2 = this.f1096s0;
        z zVar2 = this.f1088n0.f1111c;
        if (i2 == (zVar2 == null ? -1 : zVar2.f6274c)) {
            this.B0 = 1.0f;
            this.A0 = 1.0f;
            this.D0 = 1.0f;
        } else {
            this.B0 = 0.0f;
            this.A0 = 0.0f;
            this.D0 = 0.0f;
        }
        this.C0 = (zVar.f6288r & 1) != 0 ? -1L : getNanoTime();
        int g10 = this.f1088n0.g();
        b bVar2 = this.f1088n0;
        z zVar3 = bVar2.f1111c;
        int i10 = zVar3 != null ? zVar3.f6274c : -1;
        if (g10 == this.f1095r0 && i10 == this.f1097t0) {
            return;
        }
        this.f1095r0 = g10;
        this.f1097t0 = i10;
        bVar2.m(g10, i10);
        i5.q b10 = this.f1088n0.b(this.f1095r0);
        i5.q b11 = this.f1088n0.b(this.f1097t0);
        u uVar = this.f1087m1;
        uVar.e(b10, b11);
        int i11 = this.f1095r0;
        int i12 = this.f1097t0;
        uVar.f6256e = i11;
        uVar.f6257f = i12;
        uVar.f();
        v();
    }

    @Override // a6.s
    public final void e(View view, int i2, int i10, int i11, int i12, int i13) {
    }
}
