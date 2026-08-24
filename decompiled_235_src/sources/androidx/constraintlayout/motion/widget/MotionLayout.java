package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements le4 {
    public static boolean t1;
    public long A0;
    public float B0;
    public float C0;
    public float D0;
    public long E0;
    public float F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public v74 J0;
    public boolean K0;
    public final yq6 L0;
    public final u74 M0;
    public ki1 N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public float R0;
    public float S0;
    public long T0;
    public float U0;
    public boolean V0;
    public int W0;
    public long X0;
    public float Y0;
    public boolean Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public float g1;
    public final ng3 h1;
    public boolean i1;
    public androidx.constraintlayout.motion.widget.a j1;
    public q64 k1;
    public final Rect l1;
    public boolean m1;
    public a n1;
    public final w74 o1;
    public b p0;
    public boolean p1;
    public t74 q0;
    public final RectF q1;
    public Interpolator r0;
    public View r1;
    public float s0;
    public Matrix s1;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public final HashMap z0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, yq6] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, xq6, zq6] */
    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.r0 = null;
        this.s0 = RecyclerView.B1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        int i = 0;
        this.w0 = 0;
        this.x0 = 0;
        this.y0 = true;
        this.z0 = new HashMap();
        this.A0 = 0L;
        this.B0 = 1.0f;
        this.C0 = RecyclerView.B1;
        this.D0 = RecyclerView.B1;
        this.F0 = RecyclerView.B1;
        this.H0 = false;
        this.I0 = 0;
        this.K0 = false;
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.k = false;
        obj.a = obj2;
        obj.c = obj2;
        this.L0 = obj;
        this.M0 = new u74(this);
        this.Q0 = false;
        this.V0 = false;
        this.W0 = 0;
        this.X0 = -1L;
        this.Y0 = RecyclerView.B1;
        this.Z0 = false;
        this.h1 = new ng3(0);
        this.i1 = false;
        this.k1 = null;
        new HashMap();
        this.l1 = new Rect();
        this.m1 = false;
        this.n1 = a.UNDEFINED;
        this.o1 = new w74(this);
        this.p1 = false;
        this.q1 = new RectF();
        this.r1 = null;
        this.s1 = null;
        new ArrayList();
        t1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e75.l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.p0 = new b(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.u0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.F0 = obtainStyledAttributes.getFloat(index, RecyclerView.B1);
                    this.H0 = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.I0 == 0) {
                        this.I0 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.I0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.p0 == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.p0 = null;
            }
        }
        if (this.I0 != 0) {
            b bVar2 = this.p0;
            if (bVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int g = bVar2.g();
                b bVar3 = this.p0;
                z11 b = bVar3.b(bVar3.g());
                String x = lb4.x(getContext(), g);
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder t = i61.t("CHECK: ", x, " ALL VIEWS SHOULD HAVE ID's ");
                        t.append(childAt.getClass().getName());
                        t.append(" does not!");
                        Log.w("MotionLayout", t.toString());
                    }
                    if (b.i(id) == null) {
                        StringBuilder t2 = i61.t("CHECK: ", x, " NO CONSTRAINTS for ");
                        t2.append(lb4.y(childAt));
                        Log.w("MotionLayout", t2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) b.g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = numArr[i4].intValue();
                }
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr[i5];
                    String x2 = lb4.x(getContext(), i6);
                    if (findViewById(iArr[i5]) == null) {
                        lb1.w("CHECK: ", x, " NO View matches id ", x2, "MotionLayout");
                    }
                    if (b.h(i6).e.d == -1) {
                        Log.w("MotionLayout", lb1.n("CHECK: ", x, "(", x2, ") no LAYOUT_HEIGHT"));
                    }
                    if (b.h(i6).e.c == -1) {
                        Log.w("MotionLayout", lb1.n("CHECK: ", x, "(", x2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                ArrayList arrayList = this.p0.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    b84 b84Var = (b84) obj3;
                    if (b84Var == this.p0.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (b84Var.d == b84Var.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i7 = b84Var.d;
                    int i8 = b84Var.c;
                    String x3 = lb4.x(getContext(), i7);
                    String x4 = lb4.x(getContext(), i8);
                    if (sparseIntArray.get(i7) == i8) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + x3 + "->" + x4);
                    }
                    if (sparseIntArray2.get(i8) == i7) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + x3 + "->" + x4);
                    }
                    sparseIntArray.put(i7, i8);
                    sparseIntArray2.put(i8, i7);
                    if (this.p0.b(i7) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + x3);
                    }
                    if (this.p0.b(i8) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + x3);
                    }
                }
            }
        }
        if (this.u0 == -1 && (bVar = this.p0) != null) {
            this.u0 = bVar.g();
            this.t0 = this.p0.g();
            b84 b84Var2 = this.p0.c;
            this.v0 = b84Var2 != null ? b84Var2.c : -1;
        }
    }

    public static Rect o(MotionLayout motionLayout, l21 l21Var) {
        Rect rect = motionLayout.l1;
        rect.top = l21Var.t();
        rect.left = l21Var.s();
        rect.right = l21Var.r() + rect.left;
        rect.bottom = l21Var.l() + rect.top;
        return rect;
    }

    public final void A(int i, z11 z11Var) {
        b bVar = this.p0;
        if (bVar != null) {
            bVar.g.put(i, z11Var);
        }
        this.o1.e(this.p0.b(this.t0), this.p0.b(this.v0));
        v();
        if (this.u0 == i) {
            z11Var.b(this);
        }
    }

    public final void B(int i, View... viewArr) {
        z11 b;
        b bVar = this.p0;
        if (bVar != null) {
            pa paVar = bVar.q;
            String str = (String) paVar.X;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) paVar.L;
            int size = arrayList2.size();
            yp7 yp7Var = null;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                yp7 yp7Var2 = (yp7) arrayList2.get(i2);
                if (yp7Var2.a == i) {
                    for (View view : viewArr) {
                        if (yp7Var2.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = (MotionLayout) paVar.B;
                        yp7Var = yp7Var2;
                        int currentState = motionLayout.getCurrentState();
                        if (yp7Var.e != 2) {
                            if (currentState == -1) {
                                Log.w(str, "No support for ViewTransition within transition yet. Currently: ".concat(motionLayout.toString()));
                            } else {
                                b bVar2 = motionLayout.p0;
                                if (bVar2 == null) {
                                    b = null;
                                } else {
                                    b = bVar2.b(currentState);
                                }
                                if (b != null) {
                                    yp7Var.a(paVar, (MotionLayout) paVar.B, currentState, b, viewArr2);
                                }
                            }
                        } else {
                            yp7Var.a(paVar, (MotionLayout) paVar.B, currentState, null, viewArr2);
                        }
                        arrayList.clear();
                    } else {
                        yp7Var = yp7Var2;
                    }
                }
                i2 = i3;
            }
            if (yp7Var == null) {
                Log.e(str, " Could not find ViewTransition");
                return;
            }
            return;
        }
        Log.e("MotionLayout", " no motionScene");
    }

    @Override // defpackage.le4
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.Q0 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.Q0 = false;
    }

    @Override // defpackage.ke4
    public final boolean c(View view, View view2, int i, int i2) {
        b84 b84Var;
        c cVar;
        b bVar = this.p0;
        if (bVar != null && (b84Var = bVar.c) != null && (cVar = b84Var.l) != null && (cVar.w & 2) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ke4
    public final void d(View view, View view2, int i, int i2) {
        this.T0 = getNanoTime();
        this.U0 = RecyclerView.B1;
        this.R0 = RecyclerView.B1;
        this.S0 = RecyclerView.B1;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        v74 v74Var;
        Paint paint;
        Paint paint2;
        int i5;
        qp7 qp7Var;
        qp7 qp7Var2;
        hp7 hp7Var;
        hp7 hp7Var2;
        int i6;
        v74 v74Var2;
        Paint paint3;
        int i7;
        float f;
        double d;
        Paint paint4;
        float f2;
        float f3;
        String resourceEntryName;
        String resourceEntryName2;
        String str;
        long j;
        pa paVar;
        r(false);
        b bVar = this.p0;
        if (bVar != null && (paVar = bVar.q) != null) {
            ArrayList arrayList = (ArrayList) paVar.Z;
            ArrayList arrayList2 = (ArrayList) paVar.Y;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList2.get(i8);
                    i8++;
                    ((xp7) obj).a();
                }
                ((ArrayList) paVar.Y).removeAll(arrayList);
                arrayList.clear();
                if (((ArrayList) paVar.Y).isEmpty()) {
                    paVar.Y = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.p0 != null) {
            if ((this.I0 & 1) == 1 && !isInEditMode()) {
                this.W0++;
                long nanoTime = getNanoTime();
                long j2 = this.X0;
                if (j2 != -1) {
                    if (nanoTime - j2 > 200000000) {
                        this.Y0 = ((int) ((this.W0 / (((float) j) * 1.0E-9f)) * 100.0f)) / 100.0f;
                        this.W0 = 0;
                        this.X0 = nanoTime;
                    }
                } else {
                    this.X0 = nanoTime;
                }
                Paint paint5 = new Paint();
                paint5.setTextSize(42.0f);
                float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
                StringBuilder sb = new StringBuilder();
                sb.append(this.Y0);
                sb.append(" fps ");
                int i9 = this.t0;
                String str2 = "UNDEFINED";
                if (i9 == -1) {
                    resourceEntryName = "UNDEFINED";
                } else {
                    resourceEntryName = getContext().getResources().getResourceEntryName(i9);
                }
                StringBuilder s = lb1.s(i61.n(sb, resourceEntryName, " -> "));
                int i10 = this.v0;
                if (i10 == -1) {
                    resourceEntryName2 = "UNDEFINED";
                } else {
                    resourceEntryName2 = getContext().getResources().getResourceEntryName(i10);
                }
                s.append(resourceEntryName2);
                s.append(" (progress: ");
                s.append(progress);
                s.append(" ) state=");
                int i11 = this.u0;
                if (i11 == -1) {
                    str = "undefined";
                } else {
                    if (i11 != -1) {
                        str2 = getContext().getResources().getResourceEntryName(i11);
                    }
                    str = str2;
                }
                s.append(str);
                String sb2 = s.toString();
                paint5.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, getHeight() - 29, paint5);
                paint5.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, getHeight() - 30, paint5);
            }
            if (this.I0 > 1) {
                if (this.J0 == null) {
                    this.J0 = new v74(this);
                }
                v74 v74Var3 = this.J0;
                b bVar2 = this.p0;
                b84 b84Var = bVar2.c;
                if (b84Var != null) {
                    i = b84Var.h;
                } else {
                    i = bVar2.j;
                }
                int i12 = this.I0;
                Paint paint6 = v74Var3.g;
                Paint paint7 = v74Var3.f;
                Paint paint8 = v74Var3.i;
                int i13 = v74Var3.m;
                Paint paint9 = v74Var3.e;
                MotionLayout motionLayout = v74Var3.n;
                HashMap hashMap = this.z0;
                if (hashMap != null && hashMap.size() != 0) {
                    canvas.save();
                    if (!motionLayout.isInEditMode() && (i12 & 1) == 2) {
                        String str3 = motionLayout.getContext().getResources().getResourceName(motionLayout.v0) + ":" + motionLayout.getProgress();
                        canvas.drawText(str3, 10.0f, motionLayout.getHeight() - 30, v74Var3.h);
                        canvas.drawText(str3, 11.0f, motionLayout.getHeight() - 29, paint9);
                    }
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        m74 m74Var = (m74) it.next();
                        y74 y74Var = m74Var.f;
                        ArrayList arrayList3 = m74Var.u;
                        int i14 = y74Var.B;
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList3.get(i15);
                            i15++;
                            i14 = Math.max(i14, ((y74) obj2).B);
                            it = it;
                        }
                        Iterator it2 = it;
                        int max = Math.max(i14, m74Var.g.B);
                        if (i12 > 0 && max == 0) {
                            max = 1;
                        }
                        if (max == 0) {
                            it = it2;
                        } else {
                            float[] fArr = v74Var3.c;
                            int[] iArr = v74Var3.b;
                            if (fArr != null) {
                                double[] g0 = m74Var.j[0].g0();
                                if (iArr != null) {
                                    int i16 = 0;
                                    int i17 = 0;
                                    for (int size3 = arrayList3.size(); i16 < size3; size3 = size3) {
                                        Object obj3 = arrayList3.get(i16);
                                        i16++;
                                        iArr[i17] = ((y74) obj3).k0;
                                        i17++;
                                    }
                                }
                                int i18 = 0;
                                int i19 = 0;
                                while (i18 < g0.length) {
                                    int i20 = i18;
                                    m74Var.j[0].a0(g0[i18], m74Var.p);
                                    m74Var.f.c(g0[i20], m74Var.o, m74Var.p, fArr, i19);
                                    i19 += 2;
                                    i18 = i20 + 1;
                                    i = i;
                                    i12 = i12;
                                }
                                i2 = i;
                                i3 = i12;
                                i4 = i19 / 2;
                            } else {
                                i2 = i;
                                i3 = i12;
                                i4 = 0;
                            }
                            v74Var3.k = i4;
                            if (max >= 1) {
                                int i21 = i2 / 16;
                                float[] fArr2 = v74Var3.a;
                                if (fArr2 == null || fArr2.length != i21 * 2) {
                                    v74Var3.a = new float[i21 * 2];
                                    v74Var3.d = new Path();
                                }
                                float f4 = i13;
                                canvas.translate(f4, f4);
                                paint9.setColor(1996488704);
                                paint8.setColor(1996488704);
                                paint7.setColor(1996488704);
                                paint6.setColor(1996488704);
                                float[] fArr3 = v74Var3.a;
                                float f5 = 1.0f / (i21 - 1);
                                HashMap hashMap2 = m74Var.y;
                                float f6 = 1.0f;
                                if (hashMap2 == null) {
                                    qp7Var = null;
                                } else {
                                    qp7Var = (qp7) hashMap2.get("translationX");
                                }
                                HashMap hashMap3 = m74Var.y;
                                if (hashMap3 == null) {
                                    qp7Var2 = null;
                                } else {
                                    qp7Var2 = (qp7) hashMap3.get("translationY");
                                }
                                int i22 = i13;
                                HashMap hashMap4 = m74Var.z;
                                if (hashMap4 == null) {
                                    hp7Var = null;
                                } else {
                                    hp7Var = (hp7) hashMap4.get("translationX");
                                }
                                HashMap hashMap5 = m74Var.z;
                                if (hashMap5 == null) {
                                    hp7Var2 = null;
                                } else {
                                    hp7Var2 = (hp7) hashMap5.get("translationY");
                                }
                                int i23 = 0;
                                while (true) {
                                    float f7 = Float.NaN;
                                    float f8 = RecyclerView.B1;
                                    if (i23 >= i21) {
                                        break;
                                    }
                                    int i24 = i21;
                                    float f9 = i23 * f5;
                                    float f10 = m74Var.n;
                                    if (f10 != f6) {
                                        float f11 = m74Var.m;
                                        if (f9 < f11) {
                                            f3 = f11;
                                            f = 0.0f;
                                        } else {
                                            f3 = f11;
                                            f = f9;
                                        }
                                        paint3 = paint8;
                                        i7 = i23;
                                        if (f > f3 && f < 1.0d) {
                                            f = Math.min((f - f3) * f10, f6);
                                        }
                                    } else {
                                        paint3 = paint8;
                                        i7 = i23;
                                        f = f9;
                                    }
                                    double d2 = f;
                                    gr1 gr1Var = y74Var.A;
                                    int size4 = arrayList3.size();
                                    y74 y74Var2 = y74Var;
                                    int i25 = 0;
                                    while (i25 < size4) {
                                        Object obj4 = arrayList3.get(i25);
                                        int i26 = i25 + 1;
                                        y74 y74Var3 = (y74) obj4;
                                        ArrayList arrayList4 = arrayList3;
                                        gr1 gr1Var2 = y74Var3.A;
                                        if (gr1Var2 != null) {
                                            float f12 = y74Var3.L;
                                            if (f12 < f) {
                                                f8 = f12;
                                                gr1Var = gr1Var2;
                                            } else if (Float.isNaN(f7)) {
                                                f7 = y74Var3.L;
                                            }
                                        }
                                        i25 = i26;
                                        arrayList3 = arrayList4;
                                    }
                                    ArrayList arrayList5 = arrayList3;
                                    if (gr1Var != null) {
                                        if (Float.isNaN(f7)) {
                                            f7 = 1.0f;
                                        }
                                        d = (((float) gr1Var.a((f - f8) / f2)) * (f7 - f8)) + f8;
                                    } else {
                                        d = d2;
                                    }
                                    m74Var.j[0].a0(d, m74Var.p);
                                    wt wtVar = m74Var.k;
                                    if (wtVar != null) {
                                        double[] dArr = m74Var.p;
                                        paint4 = paint6;
                                        if (dArr.length > 0) {
                                            wtVar.a0(d, dArr);
                                        }
                                    } else {
                                        paint4 = paint6;
                                    }
                                    int i27 = i7 * 2;
                                    m74Var.f.c(d, m74Var.o, m74Var.p, fArr3, i27);
                                    if (hp7Var != null) {
                                        fArr3[i27] = hp7Var.a(f) + fArr3[i27];
                                    } else if (qp7Var != null) {
                                        fArr3[i27] = qp7Var.a(f) + fArr3[i27];
                                    }
                                    if (hp7Var2 != null) {
                                        int i28 = i27 + 1;
                                        fArr3[i28] = hp7Var2.a(f) + fArr3[i28];
                                    } else if (qp7Var2 != null) {
                                        int i29 = i27 + 1;
                                        fArr3[i29] = qp7Var2.a(f) + fArr3[i29];
                                    }
                                    i23 = i7 + 1;
                                    i21 = i24;
                                    paint8 = paint3;
                                    y74Var = y74Var2;
                                    arrayList3 = arrayList5;
                                    paint6 = paint4;
                                    f6 = 1.0f;
                                }
                                y74 y74Var4 = y74Var;
                                v74Var3.a(canvas, max, v74Var3.k, m74Var);
                                paint9.setColor(-21965);
                                paint7.setColor(-2067046);
                                Paint paint10 = paint8;
                                paint10.setColor(-2067046);
                                paint = paint6;
                                paint.setColor(-13391360);
                                int i30 = i22;
                                float f13 = -i30;
                                canvas.translate(f13, f13);
                                v74Var3.a(canvas, max, v74Var3.k, m74Var);
                                char c = 5;
                                if (max == 5) {
                                    float[] fArr4 = v74Var3.j;
                                    v74Var3.d.reset();
                                    int i31 = 0;
                                    while (i31 <= 50) {
                                        char c2 = c;
                                        int i32 = i31;
                                        m74Var.j[0].a0(m74Var.a(i31 / 50.0f, null), m74Var.p);
                                        int[] iArr2 = m74Var.o;
                                        double[] dArr2 = m74Var.p;
                                        y74 y74Var5 = y74Var4;
                                        float f14 = y74Var5.X;
                                        float f15 = y74Var5.Y;
                                        float f16 = y74Var5.Z;
                                        float f17 = y74Var5.d0;
                                        float[] fArr5 = fArr4;
                                        m74 m74Var2 = m74Var;
                                        int i33 = 0;
                                        while (true) {
                                            i6 = i30;
                                            if (i33 >= iArr2.length) {
                                                break;
                                            }
                                            Paint paint11 = paint10;
                                            float f18 = (float) dArr2[i33];
                                            int i34 = iArr2[i33];
                                            if (i34 != 1) {
                                                if (i34 != 2) {
                                                    if (i34 != 3) {
                                                        if (i34 == 4) {
                                                            f17 = f18;
                                                        }
                                                    } else {
                                                        f16 = f18;
                                                    }
                                                } else {
                                                    f15 = f18;
                                                }
                                            } else {
                                                f14 = f18;
                                            }
                                            i33++;
                                            i30 = i6;
                                            paint10 = paint11;
                                        }
                                        Paint paint12 = paint10;
                                        if (y74Var5.i0 != null) {
                                            double d3 = f14;
                                            double d4 = f15;
                                            v74Var2 = v74Var3;
                                            f14 = (float) (((Math.sin(d4) * d3) + 0.0d) - (f16 / 2.0f));
                                            f15 = (float) ((0.0d - (Math.cos(d4) * d3)) - (f17 / 2.0f));
                                        } else {
                                            v74Var2 = v74Var3;
                                        }
                                        float f19 = f16 + f14;
                                        float f20 = f17 + f15;
                                        Float.isNaN(Float.NaN);
                                        Float.isNaN(Float.NaN);
                                        float f21 = f14 + RecyclerView.B1;
                                        float f22 = f15 + RecyclerView.B1;
                                        float f23 = f19 + RecyclerView.B1;
                                        float f24 = f20 + RecyclerView.B1;
                                        fArr5[0] = f21;
                                        fArr5[1] = f22;
                                        fArr5[2] = f23;
                                        fArr5[3] = f22;
                                        fArr5[4] = f23;
                                        fArr5[c2] = f24;
                                        fArr5[6] = f21;
                                        fArr5[7] = f24;
                                        v74 v74Var4 = v74Var2;
                                        v74Var4.d.moveTo(f21, f22);
                                        v74Var4.d.lineTo(fArr5[2], fArr5[3]);
                                        v74Var4.d.lineTo(fArr5[4], fArr5[c2]);
                                        v74Var4.d.lineTo(fArr5[6], fArr5[7]);
                                        v74Var4.d.close();
                                        i31 = i32 + 1;
                                        v74Var3 = v74Var4;
                                        y74Var4 = y74Var5;
                                        c = c2;
                                        fArr4 = fArr5;
                                        m74Var = m74Var2;
                                        i30 = i6;
                                        paint10 = paint12;
                                    }
                                    i5 = i30;
                                    paint2 = paint10;
                                    v74Var = v74Var3;
                                    paint9.setColor(1140850688);
                                    canvas.translate(2.0f, 2.0f);
                                    canvas.drawPath(v74Var.d, paint9);
                                    canvas.translate(-2.0f, -2.0f);
                                    paint9.setColor(-65536);
                                    canvas.drawPath(v74Var.d, paint9);
                                } else {
                                    i5 = i30;
                                    paint2 = paint10;
                                    v74Var = v74Var3;
                                }
                            } else {
                                v74Var = v74Var3;
                                paint = paint6;
                                paint2 = paint8;
                                i5 = i13;
                            }
                            v74Var3 = v74Var;
                            paint6 = paint;
                            i = i2;
                            it = it2;
                            i12 = i3;
                            i13 = i5;
                            paint8 = paint2;
                        }
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override // defpackage.ke4
    public final void e(View view, int i) {
        c cVar;
        float f;
        int i2;
        b bVar = this.p0;
        if (bVar != null) {
            float f2 = this.U0;
            float f3 = RecyclerView.B1;
            if (f2 != RecyclerView.B1) {
                float f4 = this.R0 / f2;
                float f5 = this.S0 / f2;
                b84 b84Var = bVar.c;
                if (b84Var != null && (cVar = b84Var.l) != null) {
                    float[] fArr = cVar.n;
                    cVar.m = false;
                    MotionLayout motionLayout = cVar.r;
                    float progress = motionLayout.getProgress();
                    cVar.r.s(cVar.d, progress, cVar.h, cVar.g, fArr);
                    float f6 = cVar.k;
                    float f7 = fArr[0];
                    float f8 = cVar.l;
                    float f9 = fArr[1];
                    if (f6 != RecyclerView.B1) {
                        f = (f4 * f6) / f7;
                    } else {
                        f = (f5 * f8) / f9;
                    }
                    if (!Float.isNaN(f)) {
                        progress += f / 3.0f;
                    }
                    if (progress != RecyclerView.B1 && progress != 1.0f && (i2 = cVar.c) != 3) {
                        if (progress >= 0.5d) {
                            f3 = 1.0f;
                        }
                        motionLayout.y(f3, f, i2);
                    }
                }
            }
        }
    }

    @Override // defpackage.ke4
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        b84 b84Var;
        boolean z;
        boolean z2;
        float f;
        c cVar;
        float f2;
        float f3;
        c cVar2;
        c cVar3;
        c cVar4;
        int i4;
        b bVar = this.p0;
        if (bVar != null && (b84Var = bVar.c) != null && !(z = b84Var.o)) {
            int i5 = -1;
            if (z || (cVar4 = b84Var.l) == null || (i4 = cVar4.e) == -1 || view.getId() == i4) {
                b84 b84Var2 = bVar.c;
                if (b84Var2 != null && (cVar3 = b84Var2.l) != null) {
                    z2 = cVar3.u;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c cVar5 = b84Var.l;
                    if (cVar5 != null && (cVar5.w & 4) != 0) {
                        i5 = i2;
                    }
                    float f4 = this.C0;
                    if ((f4 == 1.0f || f4 == RecyclerView.B1) && view.canScrollVertically(i5)) {
                        return;
                    }
                }
                c cVar6 = b84Var.l;
                if (cVar6 != null && (cVar6.w & 1) != 0) {
                    float f5 = i;
                    float f6 = i2;
                    b84 b84Var3 = bVar.c;
                    if (b84Var3 != null && (cVar2 = b84Var3.l) != null) {
                        float[] fArr = cVar2.n;
                        f = 0.0f;
                        cVar2.r.s(cVar2.d, cVar2.r.getProgress(), cVar2.h, cVar2.g, fArr);
                        float f7 = cVar2.k;
                        if (f7 != RecyclerView.B1) {
                            if (fArr[0] == RecyclerView.B1) {
                                fArr[0] = 1.0E-7f;
                            }
                            f3 = (f5 * f7) / fArr[0];
                        } else {
                            if (fArr[1] == RecyclerView.B1) {
                                fArr[1] = 1.0E-7f;
                            }
                            f3 = (f6 * cVar2.l) / fArr[1];
                        }
                    } else {
                        f = 0.0f;
                        f3 = 0.0f;
                    }
                    float f8 = this.D0;
                    if ((f8 <= f && f3 < f) || (f8 >= 1.0f && f3 > f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new g15((ViewGroup) view, 16));
                        return;
                    }
                } else {
                    f = 0.0f;
                }
                float f9 = this.C0;
                long nanoTime = getNanoTime();
                float f10 = i;
                this.R0 = f10;
                float f11 = i2;
                this.S0 = f11;
                this.U0 = (float) ((nanoTime - this.T0) * 1.0E-9d);
                this.T0 = nanoTime;
                b84 b84Var4 = bVar.c;
                if (b84Var4 != null && (cVar = b84Var4.l) != null) {
                    float[] fArr2 = cVar.n;
                    MotionLayout motionLayout = cVar.r;
                    float progress = motionLayout.getProgress();
                    if (!cVar.m) {
                        cVar.m = true;
                        motionLayout.setProgress(progress);
                    }
                    cVar.r.s(cVar.d, progress, cVar.h, cVar.g, fArr2);
                    if (Math.abs((cVar.l * fArr2[1]) + (cVar.k * fArr2[0])) < 0.01d) {
                        fArr2[0] = 0.01f;
                        fArr2[1] = 0.01f;
                    }
                    float f12 = cVar.k;
                    if (f12 != f) {
                        f2 = (f10 * f12) / fArr2[0];
                    } else {
                        f2 = (f11 * cVar.l) / fArr2[1];
                    }
                    float max = Math.max(Math.min(progress + f2, 1.0f), f);
                    if (max != motionLayout.getProgress()) {
                        motionLayout.setProgress(max);
                    }
                }
                if (f9 != this.C0) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                r(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.Q0 = true;
                }
            }
        }
    }

    public int[] getConstraintSetIds() {
        b bVar = this.p0;
        if (bVar == null) {
            return null;
        }
        SparseArray sparseArray = bVar.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.u0;
    }

    public ArrayList<b84> getDefinedTransitions() {
        b bVar = this.p0;
        if (bVar == null) {
            return null;
        }
        return bVar.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ki1, java.lang.Object] */
    public ki1 getDesignTool() {
        if (this.N0 == null) {
            this.N0 = new Object();
        }
        return this.N0;
    }

    public int getEndState() {
        return this.v0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.D0;
    }

    public b getScene() {
        return this.p0;
    }

    public int getStartState() {
        return this.t0;
    }

    public float getTargetPosition() {
        return this.F0;
    }

    public Bundle getTransitionState() {
        if (this.j1 == null) {
            this.j1 = new androidx.constraintlayout.motion.widget.a(this);
        }
        androidx.constraintlayout.motion.widget.a aVar = this.j1;
        MotionLayout motionLayout = aVar.e;
        aVar.d = motionLayout.v0;
        aVar.c = motionLayout.t0;
        aVar.b = motionLayout.getVelocity();
        aVar.a = motionLayout.getProgress();
        androidx.constraintlayout.motion.widget.a aVar2 = this.j1;
        aVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", aVar2.a);
        bundle.putFloat("motion.velocity", aVar2.b);
        bundle.putInt("motion.StartState", aVar2.c);
        bundle.putInt("motion.EndState", aVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        int i;
        b bVar = this.p0;
        if (bVar != null) {
            b84 b84Var = bVar.c;
            if (b84Var != null) {
                i = b84Var.h;
            } else {
                i = bVar.j;
            }
            this.B0 = i / 1000.0f;
        }
        return this.B0 * 1000.0f;
    }

    public float getVelocity() {
        return this.s0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void k(int i) {
        this.j0 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        b84 b84Var;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.p0;
        if (bVar != null && (i = this.u0) != -1) {
            z11 b = bVar.b(i);
            b bVar2 = this.p0;
            SparseArray sparseArray = bVar2.g;
            loop0: for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int keyAt = sparseArray.keyAt(i2);
                SparseIntArray sparseIntArray = bVar2.i;
                int i3 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i3 > 0) {
                    if (i3 != keyAt) {
                        int i4 = size - 1;
                        if (size >= 0) {
                            i3 = sparseIntArray.get(i3);
                            size = i4;
                        }
                    }
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break loop0;
                }
                bVar2.l(keyAt, this);
            }
            if (b != null) {
                b.b(this);
            }
            this.t0 = this.u0;
        }
        u();
        androidx.constraintlayout.motion.widget.a aVar = this.j1;
        if (aVar != null) {
            if (this.m1) {
                post(new g15(this, 17));
                return;
            } else {
                aVar.a();
                return;
            }
        }
        b bVar3 = this.p0;
        if (bVar3 != null && (b84Var = bVar3.c) != null && b84Var.n == 4) {
            p(1.0f);
            this.k1 = null;
            setState(a.SETUP);
            setState(a.MOVING);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        b84 b84Var;
        c cVar;
        int i;
        View view;
        RectF b;
        z11 b2;
        Iterator it;
        b bVar = this.p0;
        if (bVar == null || !this.y0) {
            return false;
        }
        pa paVar = bVar.q;
        if (paVar != null) {
            ArrayList arrayList = (ArrayList) paVar.L;
            MotionLayout motionLayout = (MotionLayout) paVar.B;
            int currentState = motionLayout.getCurrentState();
            if (currentState != -1) {
                if (((HashSet) paVar.R) == null) {
                    paVar.R = new HashSet();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        yp7 yp7Var = (yp7) obj;
                        int childCount = motionLayout.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = motionLayout.getChildAt(i3);
                            if (yp7Var.c(childAt)) {
                                childAt.getId();
                                ((HashSet) paVar.R).add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) paVar.Y;
                int i4 = 2;
                int i5 = 1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    ArrayList arrayList3 = (ArrayList) paVar.Y;
                    int size2 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayList3.get(i6);
                        i6++;
                        xp7 xp7Var = (xp7) obj2;
                        Rect rect2 = xp7Var.l;
                        if (action != i5) {
                            if (action == i4) {
                                xp7Var.c.b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !xp7Var.h) {
                                    xp7Var.b();
                                }
                            }
                        } else if (!xp7Var.h) {
                            xp7Var.b();
                        }
                        i4 = 2;
                        i5 = 1;
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    b bVar2 = motionLayout.p0;
                    if (bVar2 == null) {
                        b2 = null;
                    } else {
                        b2 = bVar2.b(currentState);
                    }
                    z11 z11Var = b2;
                    int size3 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        yp7 yp7Var2 = (yp7) obj3;
                        int i8 = yp7Var2.b;
                        if (i8 == 1) {
                            if (action == 0) {
                                it = ((HashSet) paVar.R).iterator();
                                while (it.hasNext()) {
                                    View view2 = (View) it.next();
                                    if (yp7Var2.c(view2)) {
                                        view2.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            yp7Var2.a(paVar, (MotionLayout) paVar.B, currentState, z11Var, view2);
                                        }
                                    }
                                }
                            }
                        } else if (i8 == 2) {
                            if (action == 1) {
                                it = ((HashSet) paVar.R).iterator();
                                while (it.hasNext()) {
                                }
                            }
                        } else if (i8 == 3 && action == 0) {
                            it = ((HashSet) paVar.R).iterator();
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                b84Var = this.p0.c;
                if (b84Var == null && !b84Var.o && (cVar = b84Var.l) != null) {
                    if ((motionEvent.getAction() != 0 || (b = cVar.b(this, new RectF())) == null || b.contains(motionEvent.getX(), motionEvent.getY())) && (i = cVar.e) != -1) {
                        View view3 = this.r1;
                        if (view3 == null || view3.getId() != i) {
                            this.r1 = findViewById(i);
                        }
                        if (this.r1 != null) {
                            RectF rectF = this.q1;
                            rectF.set(view.getLeft(), this.r1.getTop(), this.r1.getRight(), this.r1.getBottom());
                            if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && !t(this.r1.getLeft(), this.r1.getTop(), this.r1, motionEvent)) {
                                return onTouchEvent(motionEvent);
                            }
                            return z;
                        }
                        return z;
                    }
                    return z;
                }
                return z;
            }
        }
        z = false;
        b84Var = this.p0.c;
        return b84Var == null ? z : z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.i1 = true;
        try {
            if (this.p0 == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.i1 = false;
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.O0 != i5 || this.P0 != i6) {
                v();
                r(true);
            }
            this.O0 = i5;
            this.P0 = i6;
            this.i1 = false;
        } catch (Throwable th) {
            this.i1 = false;
            throw th;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        float f;
        if (this.p0 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z3 = true;
        if (this.w0 == i && this.x0 == i2) {
            z = false;
        } else {
            z = true;
        }
        if (this.p1) {
            this.p1 = false;
            u();
            z = true;
        }
        if (this.g0) {
            z = true;
        }
        this.w0 = i;
        this.x0 = i2;
        int g = this.p0.g();
        b84 b84Var = this.p0.c;
        if (b84Var == null) {
            i3 = -1;
        } else {
            i3 = b84Var.c;
        }
        w74 w74Var = this.o1;
        if ((z || g != w74Var.e || i3 != w74Var.f) && this.t0 != -1) {
            super.onMeasure(i, i2);
            w74Var.e(this.p0.b(g), this.p0.b(i3));
            w74Var.f();
            w74Var.e = g;
            w74Var.f = i3;
            z2 = false;
        } else {
            if (z) {
                super.onMeasure(i, i2);
            }
            z2 = true;
        }
        if (this.Z0 || z2) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            m21 m21Var = this.L;
            int r = m21Var.r() + paddingRight;
            int l = m21Var.l() + paddingBottom;
            int i6 = this.e1;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                r = (int) ((this.g1 * (this.c1 - i4)) + this.a1);
                requestLayout();
            }
            int i7 = this.f1;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                l = (int) ((this.g1 * (this.d1 - i5)) + this.b1);
                requestLayout();
            }
            setMeasuredDimension(r, l);
        }
        float signum = Math.signum(this.F0 - this.D0);
        long nanoTime = getNanoTime();
        t74 t74Var = this.q0;
        if (!(t74Var instanceof yq6)) {
            f = ((((float) (nanoTime - this.E0)) * signum) * 1.0E-9f) / this.B0;
        } else {
            f = 0.0f;
        }
        float f2 = this.D0 + f;
        if (this.G0) {
            f2 = this.F0;
        }
        int i8 = (signum > RecyclerView.B1 ? 1 : (signum == RecyclerView.B1 ? 0 : -1));
        if ((i8 > 0 && f2 >= this.F0) || (signum <= RecyclerView.B1 && f2 <= this.F0)) {
            f2 = this.F0;
        } else {
            z3 = false;
        }
        if (t74Var != null && !z3) {
            if (this.K0) {
                f2 = t74Var.getInterpolation(((float) (nanoTime - this.A0)) * 1.0E-9f);
            } else {
                f2 = t74Var.getInterpolation(f2);
            }
        }
        if ((i8 > 0 && f2 >= this.F0) || (signum <= RecyclerView.B1 && f2 <= this.F0)) {
            f2 = this.F0;
        }
        this.g1 = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.r0;
        if (interpolator != null) {
            f2 = interpolator.getInterpolation(f2);
        }
        float f3 = f2;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            m74 m74Var = (m74) this.z0.get(childAt);
            if (m74Var != null) {
                m74Var.d(f3, nanoTime2, this.h1, childAt);
            }
        }
        if (this.Z0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        c cVar;
        b bVar = this.p0;
        if (bVar != null) {
            boolean j = j();
            bVar.p = j;
            b84 b84Var = bVar.c;
            if (b84Var != null && (cVar = b84Var.l) != null) {
                cVar.c(j);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07ed A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        os0 os0Var;
        os0 os0Var2;
        c cVar;
        float f;
        float f2;
        char c;
        char c2;
        float f3;
        float f4;
        int i;
        float f5;
        char c3;
        char c4;
        float f6;
        boolean z;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float right;
        float f12;
        int top;
        int bottom;
        float rawY;
        int i2;
        float f13;
        float f14;
        float degrees;
        float f15;
        int i3;
        float f16;
        View findViewById;
        char c5;
        char c6;
        double d;
        int i4;
        float f17;
        boolean z2;
        float f18;
        float f19;
        b84 b84Var;
        MotionEvent motionEvent2;
        b84 b84Var2;
        boolean z3;
        int i5;
        int i6;
        float f20;
        RectF rectF;
        int i7;
        b84 b84Var3;
        float f21;
        float f22;
        float f23;
        b bVar = this.p0;
        if (bVar != null && this.y0 && bVar.n()) {
            b bVar2 = this.p0;
            b84 b84Var4 = bVar2.c;
            if (b84Var4 != null && b84Var4.o) {
                return super.onTouchEvent(motionEvent);
            }
            int currentState = getCurrentState();
            MotionLayout motionLayout = bVar2.a;
            RectF rectF2 = new RectF();
            if (bVar2.o == null) {
                motionLayout.getClass();
                os0 os0Var3 = os0.R;
                os0Var3.B = VelocityTracker.obtain();
                bVar2.o = os0Var3;
            }
            VelocityTracker velocityTracker = (VelocityTracker) bVar2.o.B;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (currentState != -1) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 2 && !bVar2.m) {
                        float rawY2 = motionEvent.getRawY() - bVar2.s;
                        float rawX = motionEvent.getRawX() - bVar2.r;
                        if ((rawX != 0.0d || rawY2 != 0.0d) && (motionEvent2 = bVar2.l) != null) {
                            if (currentState != -1) {
                                zb zbVar = bVar2.b;
                                if (zbVar == null || (i5 = zbVar.C(currentState)) == -1) {
                                    i5 = currentState;
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = bVar2.d;
                                int size = arrayList2.size();
                                int i8 = 0;
                                while (i8 < size) {
                                    Object obj = arrayList2.get(i8);
                                    i8++;
                                    b84 b84Var5 = (b84) obj;
                                    if (b84Var5.d == i5 || b84Var5.c == i5) {
                                        arrayList.add(b84Var5);
                                    }
                                }
                                RectF rectF3 = new RectF();
                                int size2 = arrayList.size();
                                float f24 = RecyclerView.B1;
                                int i9 = 0;
                                b84Var2 = null;
                                while (i9 < size2) {
                                    Object obj2 = arrayList.get(i9);
                                    i9++;
                                    b84 b84Var6 = (b84) obj2;
                                    ArrayList arrayList3 = arrayList;
                                    if (b84Var6.o) {
                                        i6 = size2;
                                        f20 = f24;
                                    } else {
                                        c cVar2 = b84Var6.l;
                                        if (cVar2 != null) {
                                            i6 = size2;
                                            cVar2.c(bVar2.p);
                                            RectF b = b84Var6.l.b(motionLayout, rectF3);
                                            if (b != null) {
                                                f20 = f24;
                                                if (!b.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                                }
                                            } else {
                                                f20 = f24;
                                            }
                                            RectF a2 = b84Var6.l.a(motionLayout, rectF3);
                                            if (a2 == null || a2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                                c cVar3 = b84Var6.l;
                                                float f25 = (cVar3.l * rawY2) + (cVar3.k * rawX);
                                                if (cVar3.j) {
                                                    float x = motionEvent2.getX();
                                                    b84Var6.l.getClass();
                                                    float y = motionEvent2.getY();
                                                    b84Var6.l.getClass();
                                                    rectF = rectF3;
                                                    i7 = i9;
                                                    b84Var3 = b84Var2;
                                                    f25 = ((float) (Math.atan2(rawY2 + f23, rawX + f22) - Math.atan2(x - 0.5f, y - 0.5f))) * 10.0f;
                                                } else {
                                                    rectF = rectF3;
                                                    i7 = i9;
                                                    b84Var3 = b84Var2;
                                                }
                                                if (b84Var6.c == currentState) {
                                                    f21 = -1.0f;
                                                } else {
                                                    f21 = 1.1f;
                                                }
                                                f24 = f25 * f21;
                                                if (f24 > f20) {
                                                    b84Var2 = b84Var6;
                                                    arrayList = arrayList3;
                                                    size2 = i6;
                                                    rectF3 = rectF;
                                                    i9 = i7;
                                                }
                                            }
                                        } else {
                                            rectF = rectF3;
                                            i6 = size2;
                                            f20 = f24;
                                            i7 = i9;
                                            b84Var3 = b84Var2;
                                        }
                                        f24 = f20;
                                        b84Var2 = b84Var3;
                                        arrayList = arrayList3;
                                        size2 = i6;
                                        rectF3 = rectF;
                                        i9 = i7;
                                    }
                                    arrayList = arrayList3;
                                    size2 = i6;
                                    f24 = f20;
                                }
                            } else {
                                b84Var2 = bVar2.c;
                            }
                            if (b84Var2 != null) {
                                setTransition(b84Var2);
                                RectF b2 = bVar2.c.l.b(motionLayout, rectF2);
                                if (b2 != null && !b2.contains(bVar2.l.getX(), bVar2.l.getY())) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                bVar2.n = z3;
                                c cVar4 = bVar2.c.l;
                                float f26 = bVar2.r;
                                float f27 = bVar2.s;
                                cVar4.p = f26;
                                cVar4.q = f27;
                                cVar4.m = false;
                            }
                        }
                    }
                } else {
                    bVar2.r = motionEvent.getRawX();
                    bVar2.s = motionEvent.getRawY();
                    bVar2.l = motionEvent;
                    bVar2.m = false;
                    c cVar5 = bVar2.c.l;
                    if (cVar5 != null) {
                        RectF a3 = cVar5.a(motionLayout, rectF2);
                        if (a3 != null && !a3.contains(bVar2.l.getX(), bVar2.l.getY())) {
                            bVar2.l = null;
                            bVar2.m = true;
                        } else {
                            RectF b3 = bVar2.c.l.b(motionLayout, rectF2);
                            if (b3 != null && !b3.contains(bVar2.l.getX(), bVar2.l.getY())) {
                                bVar2.n = true;
                            } else {
                                bVar2.n = false;
                            }
                            c cVar6 = bVar2.c.l;
                            float f28 = bVar2.r;
                            float f29 = bVar2.s;
                            cVar6.p = f28;
                            cVar6.q = f29;
                        }
                    }
                }
                b84Var = this.p0.c;
                if ((b84Var.r & 4) == 0) {
                    return b84Var.l.m;
                }
                return true;
            }
            if (!bVar2.m) {
                b84 b84Var7 = bVar2.c;
                if (b84Var7 != null && (cVar = b84Var7.l) != null) {
                    float[] fArr = cVar.n;
                    if (!bVar2.n) {
                        os0 os0Var4 = bVar2.o;
                        MotionLayout motionLayout2 = cVar.r;
                        if (cVar.j) {
                            int[] iArr = cVar.o;
                            VelocityTracker velocityTracker2 = (VelocityTracker) os0Var4.B;
                            if (velocityTracker2 != null) {
                                velocityTracker2.addMovement(motionEvent);
                            }
                            int action2 = motionEvent.getAction();
                            if (action2 != 0) {
                                if (action2 != 1) {
                                    if (action2 == 2) {
                                        motionEvent.getRawY();
                                        motionEvent.getRawX();
                                        float width = motionLayout2.getWidth() / 2.0f;
                                        float height = motionLayout2.getHeight() / 2.0f;
                                        int i10 = cVar.i;
                                        if (i10 != -1) {
                                            View findViewById2 = motionLayout2.findViewById(i10);
                                            motionLayout2.getLocationOnScreen(iArr);
                                            float right2 = iArr[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
                                            float bottom2 = iArr[1] + ((findViewById2.getBottom() + findViewById2.getTop()) / 2.0f);
                                            width = right2;
                                            height = bottom2;
                                        } else {
                                            int i11 = cVar.d;
                                            if (i11 != -1) {
                                                if (motionLayout2.findViewById(((m74) motionLayout2.z0.get(motionLayout2.findViewById(i11))).f.g0) == null) {
                                                    Log.e("TouchResponse", "could not find view to animate to");
                                                } else {
                                                    motionLayout2.getLocationOnScreen(iArr);
                                                    width = iArr[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
                                                    height = ((findViewById.getBottom() + findViewById.getTop()) / 2.0f) + iArr[1];
                                                }
                                            }
                                        }
                                        float rawX2 = motionEvent.getRawX() - width;
                                        float rawY3 = motionEvent.getRawY() - height;
                                        double atan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                        float atan22 = (float) (((atan2 - Math.atan2(cVar.q - height, cVar.p - width)) * 180.0d) / 3.141592653589793d);
                                        if (atan22 > 330.0f) {
                                            atan22 -= 360.0f;
                                        } else if (atan22 < -330.0f) {
                                            atan22 += 360.0f;
                                        }
                                        float f30 = atan22;
                                        if (Math.abs(f30) > 0.01d || cVar.m) {
                                            float progress = motionLayout2.getProgress();
                                            if (!cVar.m) {
                                                c5 = 1;
                                                cVar.m = true;
                                                motionLayout2.setProgress(progress);
                                            } else {
                                                c5 = 1;
                                            }
                                            int i12 = cVar.d;
                                            if (i12 != -1) {
                                                c6 = c5;
                                                d = atan2;
                                                i4 = 1000;
                                                f17 = 1.0f;
                                                cVar.r.s(i12, progress, cVar.h, cVar.g, fArr);
                                                fArr[c6] = (float) Math.toDegrees(fArr[c6]);
                                            } else {
                                                c6 = c5;
                                                d = atan2;
                                                i4 = 1000;
                                                f17 = 1.0f;
                                                fArr[c6] = 360.0f;
                                            }
                                            float max = Math.max(Math.min(((f30 * cVar.v) / fArr[c6]) + progress, f17), (float) RecyclerView.B1);
                                            float progress2 = motionLayout2.getProgress();
                                            if (max != progress2) {
                                                int i13 = (progress2 > RecyclerView.B1 ? 1 : (progress2 == RecyclerView.B1 ? 0 : -1));
                                                if (i13 == 0 || progress2 == f17) {
                                                    if (i13 == 0) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout2.q(z2);
                                                }
                                                motionLayout2.setProgress(max);
                                                VelocityTracker velocityTracker3 = (VelocityTracker) os0Var4.B;
                                                if (velocityTracker3 != null) {
                                                    velocityTracker3.computeCurrentVelocity(i4);
                                                }
                                                VelocityTracker velocityTracker4 = (VelocityTracker) os0Var4.B;
                                                if (velocityTracker4 != null) {
                                                    f18 = velocityTracker4.getXVelocity();
                                                } else {
                                                    f18 = RecyclerView.B1;
                                                }
                                                VelocityTracker velocityTracker5 = (VelocityTracker) os0Var4.B;
                                                if (velocityTracker5 != null) {
                                                    f19 = velocityTracker5.getYVelocity();
                                                } else {
                                                    f19 = RecyclerView.B1;
                                                }
                                                double d2 = f19;
                                                double d3 = f18;
                                                motionLayout2.s0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d2, d3) - d) * Math.hypot(d2, d3)) / Math.hypot(rawX2, rawY3)));
                                            } else {
                                                motionLayout2.s0 = RecyclerView.B1;
                                            }
                                            cVar.p = motionEvent.getRawX();
                                            cVar.q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    cVar.m = false;
                                    VelocityTracker velocityTracker6 = (VelocityTracker) os0Var4.B;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(16);
                                    }
                                    VelocityTracker velocityTracker7 = (VelocityTracker) os0Var4.B;
                                    if (velocityTracker7 != null) {
                                        f10 = velocityTracker7.getXVelocity();
                                    } else {
                                        f10 = RecyclerView.B1;
                                    }
                                    VelocityTracker velocityTracker8 = (VelocityTracker) os0Var4.B;
                                    if (velocityTracker8 != null) {
                                        f11 = velocityTracker8.getYVelocity();
                                    } else {
                                        f11 = RecyclerView.B1;
                                    }
                                    float progress3 = motionLayout2.getProgress();
                                    float width2 = motionLayout2.getWidth() / 2.0f;
                                    float height2 = motionLayout2.getHeight() / 2.0f;
                                    int i14 = cVar.i;
                                    if (i14 != -1) {
                                        View findViewById3 = motionLayout2.findViewById(i14);
                                        motionLayout2.getLocationOnScreen(iArr);
                                        right = iArr[0] + ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f);
                                        f12 = iArr[1];
                                        top = findViewById3.getTop();
                                        bottom = findViewById3.getBottom();
                                    } else {
                                        int i15 = cVar.d;
                                        if (i15 != -1) {
                                            View findViewById4 = motionLayout2.findViewById(((m74) motionLayout2.z0.get(motionLayout2.findViewById(i15))).f.g0);
                                            motionLayout2.getLocationOnScreen(iArr);
                                            right = iArr[0] + ((findViewById4.getRight() + findViewById4.getLeft()) / 2.0f);
                                            f12 = iArr[1];
                                            top = findViewById4.getTop();
                                            bottom = findViewById4.getBottom();
                                        }
                                        float rawX3 = motionEvent.getRawX() - width2;
                                        double degrees2 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX3));
                                        i2 = cVar.d;
                                        if (i2 == -1) {
                                            f13 = 1.0f;
                                            f14 = 3.0f;
                                            cVar.r.s(i2, progress3, cVar.h, cVar.g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            f13 = 1.0f;
                                            f14 = 3.0f;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(f11 + rawY, f10 + rawX3)) - degrees2)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f15 = (((degrees * f14) * cVar.v) / fArr[1]) + progress3;
                                        } else {
                                            f15 = progress3;
                                        }
                                        if (f15 == RecyclerView.B1 && f15 != f13 && (i3 = cVar.c) != 3) {
                                            float f31 = (degrees * cVar.v) / fArr[1];
                                            if (f15 < 0.5d) {
                                                f16 = RecyclerView.B1;
                                            } else {
                                                f16 = f13;
                                            }
                                            if (i3 == 6) {
                                                if (progress3 + f31 < RecyclerView.B1) {
                                                    f31 = Math.abs(f31);
                                                }
                                                f16 = f13;
                                            }
                                            if (cVar.c == 7) {
                                                if (progress3 + f31 > f13) {
                                                    f31 = -Math.abs(f31);
                                                }
                                                f16 = RecyclerView.B1;
                                            }
                                            motionLayout2.y(f16, f31 * f14, cVar.c);
                                            if (RecyclerView.B1 >= progress3 || f13 <= progress3) {
                                                motionLayout2.setState(a.FINISHED);
                                            }
                                        } else if (RecyclerView.B1 < f15 || f13 <= f15) {
                                            motionLayout2.setState(a.FINISHED);
                                        }
                                    }
                                    float f32 = f12 + ((bottom + top) / 2.0f);
                                    width2 = right;
                                    height2 = f32;
                                    float rawX32 = motionEvent.getRawX() - width2;
                                    double degrees22 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX32));
                                    i2 = cVar.d;
                                    if (i2 == -1) {
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(f11 + rawY, f10 + rawX32)) - degrees22)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                    }
                                    if (f15 == RecyclerView.B1) {
                                    }
                                    if (RecyclerView.B1 < f15) {
                                    }
                                    motionLayout2.setState(a.FINISHED);
                                }
                            } else {
                                cVar.p = motionEvent.getRawX();
                                cVar.q = motionEvent.getRawY();
                                cVar.m = false;
                            }
                        } else {
                            VelocityTracker velocityTracker9 = (VelocityTracker) os0Var4.B;
                            if (velocityTracker9 != null) {
                                velocityTracker9.addMovement(motionEvent);
                            }
                            int action3 = motionEvent.getAction();
                            if (action3 != 0) {
                                if (action3 != 1) {
                                    if (action3 == 2) {
                                        float rawY4 = motionEvent.getRawY() - cVar.q;
                                        float rawX4 = motionEvent.getRawX() - cVar.p;
                                        if (Math.abs((cVar.l * rawY4) + (cVar.k * rawX4)) > cVar.x || cVar.m) {
                                            float progress4 = motionLayout2.getProgress();
                                            if (!cVar.m) {
                                                cVar.m = true;
                                                motionLayout2.setProgress(progress4);
                                            }
                                            int i16 = cVar.d;
                                            MotionLayout motionLayout3 = cVar.r;
                                            if (i16 != -1) {
                                                motionLayout3.s(i16, progress4, cVar.h, cVar.g, fArr);
                                                c3 = 1;
                                                c4 = 0;
                                            } else {
                                                float min = Math.min(motionLayout3.getWidth(), motionLayout2.getHeight());
                                                c3 = 1;
                                                fArr[1] = cVar.l * min;
                                                c4 = 0;
                                                fArr[0] = min * cVar.k;
                                            }
                                            if (Math.abs(((cVar.l * fArr[c3]) + (cVar.k * fArr[c4])) * cVar.v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c3] = 0.01f;
                                            }
                                            if (cVar.k != RecyclerView.B1) {
                                                f6 = rawX4 / fArr[0];
                                            } else {
                                                f6 = rawY4 / fArr[c3];
                                            }
                                            float max2 = Math.max(Math.min(progress4 + f6, 1.0f), (float) RecyclerView.B1);
                                            if (cVar.c == 6) {
                                                max2 = Math.max(max2, 0.01f);
                                            }
                                            if (cVar.c == 7) {
                                                max2 = Math.min(max2, 0.99f);
                                            }
                                            float progress5 = motionLayout2.getProgress();
                                            if (max2 != progress5) {
                                                int i17 = (progress5 > RecyclerView.B1 ? 1 : (progress5 == RecyclerView.B1 ? 0 : -1));
                                                if (i17 == 0 || progress5 == 1.0f) {
                                                    if (i17 == 0) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    motionLayout2.q(z);
                                                }
                                                motionLayout2.setProgress(max2);
                                                VelocityTracker velocityTracker10 = (VelocityTracker) os0Var4.B;
                                                if (velocityTracker10 != null) {
                                                    velocityTracker10.computeCurrentVelocity(1000);
                                                }
                                                VelocityTracker velocityTracker11 = (VelocityTracker) os0Var4.B;
                                                if (velocityTracker11 != null) {
                                                    f7 = velocityTracker11.getXVelocity();
                                                } else {
                                                    f7 = RecyclerView.B1;
                                                }
                                                VelocityTracker velocityTracker12 = (VelocityTracker) os0Var4.B;
                                                if (velocityTracker12 != null) {
                                                    f8 = velocityTracker12.getYVelocity();
                                                } else {
                                                    f8 = RecyclerView.B1;
                                                }
                                                if (cVar.k != RecyclerView.B1) {
                                                    f9 = f7 / fArr[0];
                                                } else {
                                                    f9 = f8 / fArr[1];
                                                }
                                                motionLayout2.s0 = f9;
                                            } else {
                                                motionLayout2.s0 = RecyclerView.B1;
                                            }
                                            cVar.p = motionEvent.getRawX();
                                            cVar.q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    cVar.m = false;
                                    VelocityTracker velocityTracker13 = (VelocityTracker) os0Var4.B;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(1000);
                                    }
                                    VelocityTracker velocityTracker14 = (VelocityTracker) os0Var4.B;
                                    if (velocityTracker14 != null) {
                                        f = velocityTracker14.getXVelocity();
                                    } else {
                                        f = RecyclerView.B1;
                                    }
                                    VelocityTracker velocityTracker15 = (VelocityTracker) os0Var4.B;
                                    if (velocityTracker15 != null) {
                                        f2 = velocityTracker15.getYVelocity();
                                    } else {
                                        f2 = RecyclerView.B1;
                                    }
                                    float progress6 = motionLayout2.getProgress();
                                    int i18 = cVar.d;
                                    MotionLayout motionLayout4 = cVar.r;
                                    if (i18 != -1) {
                                        motionLayout4.s(i18, progress6, cVar.h, cVar.g, fArr);
                                        c = 1;
                                        c2 = 0;
                                    } else {
                                        float min2 = Math.min(motionLayout4.getWidth(), motionLayout2.getHeight());
                                        c = 1;
                                        fArr[1] = cVar.l * min2;
                                        c2 = 0;
                                        fArr[0] = min2 * cVar.k;
                                    }
                                    float f33 = cVar.k;
                                    float f34 = fArr[c2];
                                    float f35 = fArr[c];
                                    if (f33 != RecyclerView.B1) {
                                        f3 = f / f34;
                                    } else {
                                        f3 = f2 / f35;
                                    }
                                    if (!Float.isNaN(f3)) {
                                        f4 = (f3 / 3.0f) + progress6;
                                    } else {
                                        f4 = progress6;
                                    }
                                    if (f4 != RecyclerView.B1 && f4 != 1.0f && (i = cVar.c) != 3) {
                                        if (f4 < 0.5d) {
                                            f5 = RecyclerView.B1;
                                        } else {
                                            f5 = 1.0f;
                                        }
                                        if (i == 6) {
                                            if (progress6 + f3 < RecyclerView.B1) {
                                                f3 = Math.abs(f3);
                                            }
                                            f5 = 1.0f;
                                        }
                                        if (cVar.c == 7) {
                                            if (progress6 + f3 > 1.0f) {
                                                f3 = -Math.abs(f3);
                                            }
                                            f5 = RecyclerView.B1;
                                        }
                                        motionLayout2.y(f5, f3, cVar.c);
                                        if (RecyclerView.B1 >= progress6 || 1.0f <= progress6) {
                                            motionLayout2.setState(a.FINISHED);
                                        }
                                    } else if (RecyclerView.B1 >= f4 || 1.0f <= f4) {
                                        motionLayout2.setState(a.FINISHED);
                                    }
                                }
                            } else {
                                cVar.p = motionEvent.getRawX();
                                cVar.q = motionEvent.getRawY();
                                cVar.m = false;
                            }
                        }
                    }
                }
                bVar2.r = motionEvent.getRawX();
                bVar2.s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1 && (os0Var = bVar2.o) != null) {
                    VelocityTracker velocityTracker16 = (VelocityTracker) os0Var.B;
                    if (velocityTracker16 != null) {
                        velocityTracker16.recycle();
                        os0Var2 = null;
                        os0Var.B = null;
                    } else {
                        os0Var2 = null;
                    }
                    bVar2.o = os0Var2;
                    int i19 = this.u0;
                    if (i19 != -1) {
                        bVar2.a(i19, this);
                    }
                }
            }
            b84Var = this.p0.c;
            if ((b84Var.r & 4) == 0) {
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    public final void p(float f) {
        int i;
        b bVar = this.p0;
        if (bVar != null) {
            float f2 = this.D0;
            float f3 = this.C0;
            if (f2 != f3 && this.G0) {
                this.D0 = f3;
            }
            float f4 = this.D0;
            if (f4 == f) {
                return;
            }
            this.K0 = false;
            this.F0 = f;
            b84 b84Var = bVar.c;
            if (b84Var != null) {
                i = b84Var.h;
            } else {
                i = bVar.j;
            }
            this.B0 = i / 1000.0f;
            setProgress(f);
            this.q0 = null;
            this.r0 = this.p0.d();
            this.G0 = false;
            this.A0 = getNanoTime();
            this.H0 = true;
            this.C0 = f4;
            this.D0 = f4;
            invalidate();
        }
    }

    public final void q(boolean z) {
        float f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m74 m74Var = (m74) this.z0.get(getChildAt(i));
            if (m74Var != null && "button".equals(lb4.y(m74Var.b)) && m74Var.A != null) {
                int i2 = 0;
                while (true) {
                    rh3[] rh3VarArr = m74Var.A;
                    if (i2 < rh3VarArr.length) {
                        rh3 rh3Var = rh3VarArr[i2];
                        if (z) {
                            f = -100.0f;
                        } else {
                            f = 100.0f;
                        }
                        rh3Var.g(m74Var.b, f);
                        i2++;
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
    */
    public final void r(boolean z) {
        float f;
        boolean z2;
        boolean z3;
        int childCount;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i;
        boolean z4;
        int i2;
        if (this.E0 == -1) {
            this.E0 = getNanoTime();
        }
        float f2 = this.D0;
        if (f2 > RecyclerView.B1 && f2 < 1.0f) {
            this.u0 = -1;
        }
        boolean z5 = true;
        boolean z6 = false;
        if (this.V0 || (this.H0 && (z || this.F0 != f2))) {
            float signum = Math.signum(this.F0 - f2);
            long nanoTime = getNanoTime();
            t74 t74Var = this.q0;
            if (t74Var == null) {
                f = ((((float) (nanoTime - this.E0)) * signum) * 1.0E-9f) / this.B0;
            } else {
                f = 0.0f;
            }
            float f3 = this.D0 + f;
            if (this.G0) {
                f3 = this.F0;
            }
            int i3 = (signum > RecyclerView.B1 ? 1 : (signum == RecyclerView.B1 ? 0 : -1));
            if ((i3 > 0 && f3 >= this.F0) || (signum <= RecyclerView.B1 && f3 <= this.F0)) {
                f3 = this.F0;
                this.H0 = false;
                z2 = true;
            } else {
                z2 = false;
            }
            this.D0 = f3;
            this.C0 = f3;
            this.E0 = nanoTime;
            if (t74Var != null && !z2) {
                if (this.K0) {
                    float interpolation2 = t74Var.getInterpolation(((float) (nanoTime - this.A0)) * 1.0E-9f);
                    t74 t74Var2 = this.q0;
                    yq6 yq6Var = this.L0;
                    if (t74Var2 == yq6Var) {
                        if (yq6Var.c.a()) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    this.D0 = interpolation2;
                    this.E0 = nanoTime;
                    t74 t74Var3 = this.q0;
                    if (t74Var3 != null) {
                        float a2 = t74Var3.a();
                        this.s0 = a2;
                        if (Math.abs(a2) * this.B0 <= 1.0E-5f && z3) {
                            this.H0 = false;
                        }
                        if (a2 > RecyclerView.B1 && interpolation2 >= 1.0f) {
                            this.D0 = 1.0f;
                            this.H0 = false;
                            interpolation2 = 1.0f;
                        }
                        if (a2 < RecyclerView.B1 && interpolation2 <= RecyclerView.B1) {
                            this.D0 = RecyclerView.B1;
                            this.H0 = false;
                            f3 = 0.0f;
                            if (Math.abs(this.s0) > 1.0E-5f) {
                                setState(a.MOVING);
                            }
                            if (!z3) {
                                if ((i3 > 0 && f3 >= this.F0) || (signum <= RecyclerView.B1 && f3 <= this.F0)) {
                                    f3 = this.F0;
                                    this.H0 = false;
                                }
                                if (f3 >= 1.0f || f3 <= RecyclerView.B1) {
                                    this.H0 = false;
                                    setState(a.FINISHED);
                                }
                            }
                            childCount = getChildCount();
                            this.V0 = false;
                            long nanoTime2 = getNanoTime();
                            this.g1 = f3;
                            interpolator = this.r0;
                            if (interpolator == null) {
                                interpolation = f3;
                            } else {
                                interpolation = interpolator.getInterpolation(f3);
                            }
                            interpolator2 = this.r0;
                            if (interpolator2 != null) {
                                float interpolation3 = interpolator2.getInterpolation((signum / this.B0) + f3);
                                this.s0 = interpolation3;
                                this.s0 = interpolation3 - this.r0.getInterpolation(f3);
                            }
                            for (i = 0; i < childCount; i++) {
                                View childAt = getChildAt(i);
                                m74 m74Var = (m74) this.z0.get(childAt);
                                if (m74Var != null) {
                                    this.V0 = m74Var.d(interpolation, nanoTime2, this.h1, childAt) | this.V0;
                                }
                            }
                            if ((i3 <= 0 && f3 >= this.F0) || (signum <= RecyclerView.B1 && f3 <= this.F0)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!this.V0 && !this.H0 && z4) {
                                setState(a.FINISHED);
                            }
                            if (this.Z0) {
                                requestLayout();
                            }
                            this.V0 = (!z4) | this.V0;
                            if (f3 <= RecyclerView.B1 && (i2 = this.t0) != -1 && this.u0 != i2) {
                                this.u0 = i2;
                                this.p0.b(i2).a(this);
                                setState(a.FINISHED);
                                z6 = true;
                            }
                            if (f3 >= 1.0d) {
                                int i4 = this.u0;
                                int i5 = this.v0;
                                if (i4 != i5) {
                                    this.u0 = i5;
                                    this.p0.b(i5).a(this);
                                    setState(a.FINISHED);
                                    z6 = true;
                                }
                            }
                            if (this.V0 && !this.H0) {
                                if ((i3 > 0 && f3 == 1.0f) || (signum < RecyclerView.B1 && f3 == RecyclerView.B1)) {
                                    setState(a.FINISHED);
                                }
                            } else {
                                invalidate();
                            }
                            if (!this.V0 && !this.H0 && ((i3 > 0 && f3 == 1.0f) || (signum < RecyclerView.B1 && f3 == RecyclerView.B1))) {
                                u();
                            }
                        }
                    }
                    f3 = interpolation2;
                    if (Math.abs(this.s0) > 1.0E-5f) {
                    }
                    if (!z3) {
                    }
                    childCount = getChildCount();
                    this.V0 = false;
                    long nanoTime22 = getNanoTime();
                    this.g1 = f3;
                    interpolator = this.r0;
                    if (interpolator == null) {
                    }
                    interpolator2 = this.r0;
                    if (interpolator2 != null) {
                    }
                    while (i < childCount) {
                    }
                    if (i3 <= 0) {
                    }
                    z4 = false;
                    if (!this.V0) {
                        setState(a.FINISHED);
                    }
                    if (this.Z0) {
                    }
                    this.V0 = (!z4) | this.V0;
                    if (f3 <= RecyclerView.B1) {
                        this.u0 = i2;
                        this.p0.b(i2).a(this);
                        setState(a.FINISHED);
                        z6 = true;
                    }
                    if (f3 >= 1.0d) {
                    }
                    if (this.V0) {
                    }
                    invalidate();
                    if (!this.V0) {
                        u();
                    }
                } else {
                    float interpolation4 = t74Var.getInterpolation(f3);
                    t74 t74Var4 = this.q0;
                    if (t74Var4 != null) {
                        this.s0 = t74Var4.a();
                    } else {
                        this.s0 = ((t74Var4.getInterpolation(f3 + f) - interpolation4) * signum) / f;
                    }
                    f3 = interpolation4;
                }
            } else {
                this.s0 = f;
            }
            z3 = false;
            if (Math.abs(this.s0) > 1.0E-5f) {
            }
            if (!z3) {
            }
            childCount = getChildCount();
            this.V0 = false;
            long nanoTime222 = getNanoTime();
            this.g1 = f3;
            interpolator = this.r0;
            if (interpolator == null) {
            }
            interpolator2 = this.r0;
            if (interpolator2 != null) {
            }
            while (i < childCount) {
            }
            if (i3 <= 0) {
            }
            z4 = false;
            if (!this.V0) {
            }
            if (this.Z0) {
            }
            this.V0 = (!z4) | this.V0;
            if (f3 <= RecyclerView.B1) {
            }
            if (f3 >= 1.0d) {
            }
            if (this.V0) {
            }
            invalidate();
            if (!this.V0) {
            }
        }
        float f4 = this.D0;
        if (f4 >= 1.0f) {
            int i6 = this.u0;
            int i7 = this.v0;
            if (i6 == i7) {
                z5 = z6;
            }
            this.u0 = i7;
        } else {
            if (f4 <= RecyclerView.B1) {
                int i8 = this.u0;
                int i9 = this.t0;
                if (i8 == i9) {
                    z5 = z6;
                }
                this.u0 = i9;
            }
            this.p1 |= z6;
            if (z6 && !this.i1) {
                requestLayout();
            }
            this.C0 = this.D0;
        }
        z6 = z5;
        this.p1 |= z6;
        if (z6) {
            requestLayout();
        }
        this.C0 = this.D0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        b bVar;
        b84 b84Var;
        if (!this.Z0 && this.u0 == -1 && (bVar = this.p0) != null && (b84Var = bVar.c) != null) {
            int i = b84Var.q;
            if (i != 0) {
                if (i == 2) {
                    int childCount = getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        ((m74) this.z0.get(getChildAt(i2))).d = true;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(int i, float f, float f2, float f3, float[] fArr) {
        String resourceName;
        double[] dArr;
        View view = (View) this.A.get(i);
        m74 m74Var = (m74) this.z0.get(view);
        if (m74Var != null) {
            y74 y74Var = m74Var.f;
            float[] fArr2 = m74Var.v;
            float a2 = m74Var.a(f, fArr2);
            ak7[] ak7VarArr = m74Var.j;
            int i2 = 0;
            if (ak7VarArr != null) {
                double d = a2;
                ak7VarArr[0].d0(d, m74Var.q);
                m74Var.j[0].a0(d, m74Var.p);
                float f4 = fArr2[0];
                while (true) {
                    dArr = m74Var.q;
                    if (i2 >= dArr.length) {
                        break;
                    }
                    dArr[i2] = dArr[i2] * f4;
                    i2++;
                }
                wt wtVar = m74Var.k;
                if (wtVar != null) {
                    double[] dArr2 = m74Var.p;
                    if (dArr2.length > 0) {
                        wtVar.a0(d, dArr2);
                        m74Var.k.d0(d, m74Var.q);
                        int[] iArr = m74Var.o;
                        double[] dArr3 = m74Var.q;
                        double[] dArr4 = m74Var.p;
                        y74Var.getClass();
                        y74.e(f2, f3, fArr, iArr, dArr3, dArr4);
                    }
                } else {
                    int[] iArr2 = m74Var.o;
                    double[] dArr5 = m74Var.p;
                    y74Var.getClass();
                    y74.e(f2, f3, fArr, iArr2, dArr, dArr5);
                }
            } else {
                y74 y74Var2 = m74Var.g;
                float f5 = y74Var2.X - y74Var.X;
                float f6 = y74Var2.Y - y74Var.Y;
                fArr[0] = (((y74Var2.Z - y74Var.Z) + f5) * f2) + ((1.0f - f2) * f5);
                fArr[1] = (((y74Var2.d0 - y74Var.d0) + f6) * f3) + ((1.0f - f3) * f6);
            }
            view.getY();
            return;
        }
        if (view == null) {
            resourceName = lb1.g(i, "");
        } else {
            resourceName = view.getContext().getResources().getResourceName(i);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    public void setDebugMode(int i) {
        this.I0 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.m1 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.y0 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.p0 != null) {
            setState(a.MOVING);
            Interpolator d = this.p0.d();
            if (d != null) {
                setProgress(d.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setProgress(float f) {
        int i = (f > RecyclerView.B1 ? 1 : (f == RecyclerView.B1 ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.j1 == null) {
                this.j1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            this.j1.a = f;
            return;
        }
        if (i <= 0) {
            if (this.D0 == 1.0f && this.u0 == this.v0) {
                setState(a.MOVING);
            }
            this.u0 = this.t0;
            if (this.D0 == RecyclerView.B1) {
                setState(a.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.D0 == RecyclerView.B1 && this.u0 == this.t0) {
                setState(a.MOVING);
            }
            this.u0 = this.v0;
            if (this.D0 == 1.0f) {
                setState(a.FINISHED);
            }
        } else {
            this.u0 = -1;
            setState(a.MOVING);
        }
        if (this.p0 == null) {
            return;
        }
        this.G0 = true;
        this.F0 = f;
        this.C0 = f;
        this.E0 = -1L;
        this.A0 = -1L;
        this.q0 = null;
        this.H0 = true;
        invalidate();
    }

    public void setScene(b bVar) {
        c cVar;
        this.p0 = bVar;
        boolean j = j();
        bVar.p = j;
        b84 b84Var = bVar.c;
        if (b84Var != null && (cVar = b84Var.l) != null) {
            cVar.c(j);
        }
        v();
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.j1 == null) {
                this.j1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            androidx.constraintlayout.motion.widget.a aVar = this.j1;
            aVar.c = i;
            aVar.d = i;
            return;
        }
        this.u0 = i;
    }

    public void setState(a aVar) {
        q64 q64Var;
        q64 q64Var2;
        a aVar2 = a.FINISHED;
        if (aVar != aVar2 || this.u0 != -1) {
            a aVar3 = this.n1;
            this.n1 = aVar;
            a aVar4 = a.UNDEFINED;
            int ordinal = aVar3.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2 && aVar == aVar2 && (q64Var2 = this.k1) != null) {
                    q64Var2.run();
                    this.k1 = null;
                }
            } else if (aVar == aVar2 && (q64Var = this.k1) != null) {
                q64Var.run();
                this.k1 = null;
            }
        }
    }

    public void setTransition(int i) {
        b84 b84Var;
        float f;
        float f2;
        b bVar = this.p0;
        if (bVar != null) {
            ArrayList arrayList = bVar.d;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    b84Var = (b84) obj;
                    if (b84Var.a == i) {
                        break;
                    }
                } else {
                    b84Var = null;
                    break;
                }
            }
            this.t0 = b84Var.d;
            this.v0 = b84Var.c;
            if (!isAttachedToWindow()) {
                if (this.j1 == null) {
                    this.j1 = new androidx.constraintlayout.motion.widget.a(this);
                }
                androidx.constraintlayout.motion.widget.a aVar = this.j1;
                aVar.c = this.t0;
                aVar.d = this.v0;
                return;
            }
            int i3 = this.u0;
            if (i3 == this.t0) {
                f = 0.0f;
            } else if (i3 == this.v0) {
                f = 1.0f;
            } else {
                f = Float.NaN;
            }
            b bVar2 = this.p0;
            bVar2.c = b84Var;
            c cVar = b84Var.l;
            if (cVar != null) {
                cVar.c(bVar2.p);
            }
            this.o1.e(this.p0.b(this.t0), this.p0.b(this.v0));
            v();
            if (this.D0 != f) {
                if (f == RecyclerView.B1) {
                    q(true);
                    this.p0.b(this.t0).b(this);
                } else if (f == 1.0f) {
                    q(false);
                    this.p0.b(this.v0).b(this);
                }
            }
            if (Float.isNaN(f)) {
                f2 = 0.0f;
            } else {
                f2 = f;
            }
            this.D0 = f2;
            if (Float.isNaN(f)) {
                Log.v("MotionLayout", lb4.w().concat(" transitionToStart "));
                p(RecyclerView.B1);
                return;
            }
            setProgress(f);
        }
    }

    public void setTransitionDuration(int i) {
        b bVar = this.p0;
        if (bVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        b84 b84Var = bVar.c;
        if (b84Var != null) {
            b84Var.h = Math.max(i, 8);
        } else {
            bVar.j = i;
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.j1 == null) {
            this.j1 = new androidx.constraintlayout.motion.widget.a(this);
        }
        androidx.constraintlayout.motion.widget.a aVar = this.j1;
        aVar.getClass();
        aVar.a = bundle.getFloat("motion.progress");
        aVar.b = bundle.getFloat("motion.velocity");
        aVar.c = bundle.getInt("motion.StartState");
        aVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.j1.a();
        }
    }

    public final boolean t(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean onTouchEvent;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (t((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            RectF rectF = this.q1;
            rectF.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f3, f4);
                    if (this.s1 == null) {
                        this.s1 = new Matrix();
                    }
                    matrix.invert(this.s1);
                    obtain.transform(this.s1);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return lb4.x(context, this.t0) + "->" + lb4.x(context, this.v0) + " (pos:" + this.D0 + " Dpos/Dt:" + this.s0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [he4, java.lang.Object] */
    public final void u() {
        b84 b84Var;
        c cVar;
        View view;
        b bVar = this.p0;
        if (bVar != null) {
            if (bVar.a(this.u0, this)) {
                requestLayout();
                return;
            }
            int i = this.u0;
            if (i != -1) {
                b bVar2 = this.p0;
                ArrayList arrayList = bVar2.f;
                ArrayList arrayList2 = bVar2.d;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    b84 b84Var2 = (b84) obj;
                    if (b84Var2.m.size() > 0) {
                        ArrayList arrayList3 = b84Var2.m;
                        int size2 = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList3.get(i3);
                            i3++;
                            ((a84) obj2).b(this);
                        }
                    }
                }
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    b84 b84Var3 = (b84) obj3;
                    if (b84Var3.m.size() > 0) {
                        ArrayList arrayList4 = b84Var3.m;
                        int size4 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size4) {
                            Object obj4 = arrayList4.get(i5);
                            i5++;
                            ((a84) obj4).b(this);
                        }
                    }
                }
                int size5 = arrayList2.size();
                int i6 = 0;
                while (i6 < size5) {
                    Object obj5 = arrayList2.get(i6);
                    i6++;
                    b84 b84Var4 = (b84) obj5;
                    if (b84Var4.m.size() > 0) {
                        ArrayList arrayList5 = b84Var4.m;
                        int size6 = arrayList5.size();
                        int i7 = 0;
                        while (i7 < size6) {
                            Object obj6 = arrayList5.get(i7);
                            i7++;
                            ((a84) obj6).a(this, i, b84Var4);
                        }
                    }
                }
                int size7 = arrayList.size();
                int i8 = 0;
                while (i8 < size7) {
                    Object obj7 = arrayList.get(i8);
                    i8++;
                    b84 b84Var5 = (b84) obj7;
                    if (b84Var5.m.size() > 0) {
                        ArrayList arrayList6 = b84Var5.m;
                        int size8 = arrayList6.size();
                        int i9 = 0;
                        while (i9 < size8) {
                            Object obj8 = arrayList6.get(i9);
                            i9++;
                            ((a84) obj8).a(this, i, b84Var5);
                        }
                    }
                }
            }
            if (this.p0.n() && (b84Var = this.p0.c) != null && (cVar = b84Var.l) != null) {
                MotionLayout motionLayout = cVar.r;
                int i10 = cVar.d;
                if (i10 != -1) {
                    view = motionLayout.findViewById(i10);
                    if (view == null) {
                        Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + lb4.x(motionLayout.getContext(), cVar.d));
                    }
                } else {
                    view = null;
                }
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    nestedScrollView.setOnTouchListener(new t20(2));
                    nestedScrollView.setOnScrollChangeListener((he4) new Object());
                }
            }
        }
    }

    public final void v() {
        this.o1.f();
        invalidate();
    }

    public final void w(int i) {
        z11 z11Var;
        q11 q11Var;
        z11 z11Var2;
        setState(a.SETUP);
        this.u0 = i;
        this.t0 = -1;
        this.v0 = -1;
        s11 s11Var = this.j0;
        if (s11Var != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) s11Var.c;
            SparseArray sparseArray = (SparseArray) s11Var.d;
            int i2 = s11Var.a;
            int i3 = 0;
            if (i2 == i) {
                if (i == -1) {
                    q11Var = (q11) sparseArray.valueAt(0);
                } else {
                    q11Var = (q11) sparseArray.get(i2);
                }
                int i4 = s11Var.b;
                if (i4 == -1 || !((r11) q11Var.b.get(i4)).a(-1.0f, -1.0f)) {
                    ArrayList arrayList = q11Var.b;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (((r11) arrayList.get(i3)).a(-1.0f, -1.0f)) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    ArrayList arrayList2 = q11Var.b;
                    if (s11Var.b != i3) {
                        if (i3 == -1) {
                            z11Var2 = null;
                        } else {
                            z11Var2 = ((r11) arrayList2.get(i3)).f;
                        }
                        if (i3 != -1) {
                            int i5 = ((r11) arrayList2.get(i3)).e;
                        }
                        if (z11Var2 != null) {
                            s11Var.b = i3;
                            z11Var2.b(constraintLayout);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            s11Var.a = i;
            q11 q11Var2 = (q11) sparseArray.get(i);
            ArrayList arrayList3 = q11Var2.b;
            while (true) {
                if (i3 < arrayList3.size()) {
                    if (((r11) arrayList3.get(i3)).a(-1.0f, -1.0f)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            ArrayList arrayList4 = q11Var2.b;
            if (i3 == -1) {
                z11Var = q11Var2.d;
            } else {
                z11Var = ((r11) arrayList4.get(i3)).f;
            }
            if (i3 != -1) {
                int i6 = ((r11) arrayList4.get(i3)).e;
            }
            if (z11Var == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =-1.0, -1.0");
                return;
            }
            s11Var.b = i3;
            z11Var.b(constraintLayout);
            return;
        }
        b bVar = this.p0;
        if (bVar != null) {
            bVar.b(i).b(this);
        }
    }

    public final void x(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.j1 == null) {
                this.j1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            androidx.constraintlayout.motion.widget.a aVar = this.j1;
            aVar.c = i;
            aVar.d = i2;
            return;
        }
        b bVar = this.p0;
        if (bVar != null) {
            this.t0 = i;
            this.v0 = i2;
            bVar.m(i, i2);
            this.o1.e(this.p0.b(i), this.p0.b(i2));
            v();
            this.D0 = RecyclerView.B1;
            p(RecyclerView.B1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r20 != 7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if ((((r19 * r5) - (((r2 * r5) * r5) / 2.0f)) + r1) > 1.0f) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        if ((((((r2 * r5) * r5) / 2.0f) + (r19 * r5)) + r1) < androidx.recyclerview.widget.RecyclerView.B1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r1 = r17.D0;
        r2 = r17.p0.f();
        r9.a = r19;
        r9.b = r1;
        r9.c = r2;
        r17.q0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        r2 = r17.D0;
        r5 = r17.B0;
        r6 = r17.p0.f();
        r1 = r17.p0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        r1 = r1.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
        r7 = r1.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
        r17.L0.b(r2, r3, r19, r5, r6, r7);
        r17.s0 = androidx.recyclerview.widget.RecyclerView.B1;
        r1 = r17.u0;
        r17.F0 = r3;
        r17.u0 = r1;
        r17.q0 = r8;
     */
    /* JADX WARN: Type inference failed for: r10v3, types: [jo6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(float f, float f2, int i) {
        int i2;
        float f3;
        int i3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i4;
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        c cVar6;
        c cVar7;
        float f8 = f;
        if (this.p0 == null || this.D0 == f8) {
            return;
        }
        this.K0 = true;
        this.A0 = getNanoTime();
        b bVar = this.p0;
        b84 b84Var = bVar.c;
        if (b84Var != null) {
            i2 = b84Var.h;
        } else {
            i2 = bVar.j;
        }
        float f9 = i2 / 1000.0f;
        this.B0 = f9;
        this.F0 = f8;
        this.H0 = true;
        yq6 yq6Var = this.L0;
        float f10 = RecyclerView.B1;
        if (i != 0 && i != 1 && i != 2) {
            f3 = 1.0f;
            u74 u74Var = this.M0;
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                    }
                } else {
                    float f11 = this.D0;
                    float f12 = bVar.f();
                    if (f2 > RecyclerView.B1) {
                        float f13 = f2 / f12;
                    } else {
                        float f14 = (-f2) / f12;
                    }
                }
            } else {
                float f15 = this.D0;
                float f16 = bVar.f();
                u74Var.a = f2;
                u74Var.b = f15;
                u74Var.c = f16;
                this.q0 = u74Var;
            }
            this.G0 = false;
            this.A0 = getNanoTime();
            invalidate();
        }
        f3 = 1.0f;
        if (i != 1 && i != 7) {
            if (i == 2 || i == 6) {
                f8 = f3;
            }
        } else {
            f8 = 0.0f;
        }
        if (b84Var != null && (cVar7 = b84Var.l) != null) {
            i3 = cVar7.D;
        } else {
            i3 = 0;
        }
        float f17 = this.D0;
        int i5 = i3;
        yq6 yq6Var2 = this.L0;
        if (i5 == 0) {
            float f18 = bVar.f();
            b84 b84Var2 = this.p0.c;
            if (b84Var2 != null && (cVar6 = b84Var2.l) != null) {
                f10 = cVar6.s;
            }
            yq6Var2.b(f17, f8, f2, f9, f18, f10);
        } else {
            if (b84Var != null && (cVar5 = b84Var.l) != null) {
                f4 = cVar5.z;
            } else {
                f4 = 0.0f;
            }
            if (b84Var != null && (cVar4 = b84Var.l) != null) {
                f5 = cVar4.A;
            } else {
                f5 = 0.0f;
            }
            if (b84Var != null && (cVar3 = b84Var.l) != null) {
                f6 = cVar3.y;
            } else {
                f6 = 0.0f;
            }
            if (b84Var != null && (cVar2 = b84Var.l) != null) {
                f7 = cVar2.B;
            } else {
                f7 = 0.0f;
            }
            if (b84Var != null && (cVar = b84Var.l) != null) {
                i4 = cVar.C;
            } else {
                i4 = 0;
            }
            if (yq6Var2.b == null) {
                ?? obj = new Object();
                obj.a = 0.5d;
                obj.i = 0;
                yq6Var2.b = obj;
            }
            jo6 jo6Var = yq6Var2.b;
            yq6Var2.c = jo6Var;
            jo6Var.c = f8;
            jo6Var.a = f6;
            jo6Var.e = f17;
            jo6Var.b = f5;
            jo6Var.g = f4;
            jo6Var.h = f7;
            jo6Var.i = i4;
            jo6Var.d = RecyclerView.B1;
        }
        int i6 = this.u0;
        this.F0 = f8;
        this.u0 = i6;
        this.q0 = yq6Var;
        this.G0 = false;
        this.A0 = getNanoTime();
        invalidate();
    }

    public final void z(int i) {
        int i2;
        float f;
        float alpha;
        zb zbVar;
        if (!isAttachedToWindow()) {
            if (this.j1 == null) {
                this.j1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            this.j1.d = i;
            return;
        }
        b bVar = this.p0;
        if (bVar != null && (zbVar = bVar.b) != null) {
            int i3 = this.u0;
            iq6 iq6Var = (iq6) ((SparseArray) zbVar.L).get(i);
            if (iq6Var == null) {
                i3 = i;
            } else {
                ArrayList arrayList = iq6Var.b;
                int i4 = iq6Var.c;
                if (i4 != i3) {
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            if (i3 == ((jq6) obj).e) {
                                break;
                            }
                        } else {
                            i3 = i4;
                            break;
                        }
                    }
                }
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i6 = this.u0;
        if (i6 == i) {
            return;
        }
        if (this.t0 == i) {
            p(RecyclerView.B1);
        } else if (this.v0 == i) {
            p(1.0f);
        } else {
            this.v0 = i;
            if (i6 != -1) {
                x(i6, i);
                p(1.0f);
                this.D0 = RecyclerView.B1;
                p(1.0f);
                this.k1 = null;
                return;
            }
            this.K0 = false;
            this.F0 = 1.0f;
            this.C0 = RecyclerView.B1;
            this.D0 = RecyclerView.B1;
            this.E0 = getNanoTime();
            this.A0 = getNanoTime();
            this.G0 = false;
            this.q0 = null;
            b bVar2 = this.p0;
            b84 b84Var = bVar2.c;
            if (b84Var != null) {
                i2 = b84Var.h;
            } else {
                i2 = bVar2.j;
            }
            this.B0 = i2 / 1000.0f;
            this.t0 = -1;
            bVar2.m(-1, this.v0);
            SparseArray sparseArray = new SparseArray();
            int childCount = getChildCount();
            HashMap hashMap = this.z0;
            hashMap.clear();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                hashMap.put(childAt, new m74(childAt));
                sparseArray.put(childAt.getId(), (m74) hashMap.get(childAt));
            }
            this.H0 = true;
            z11 b = this.p0.b(i);
            w74 w74Var = this.o1;
            w74Var.e(null, b);
            v();
            w74Var.a();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                m74 m74Var = (m74) hashMap.get(childAt2);
                if (m74Var != null) {
                    y74 y74Var = m74Var.f;
                    y74Var.L = RecyclerView.B1;
                    y74Var.R = RecyclerView.B1;
                    y74Var.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                    k74 k74Var = m74Var.h;
                    k74Var.getClass();
                    childAt2.getX();
                    childAt2.getY();
                    childAt2.getWidth();
                    childAt2.getHeight();
                    k74Var.L = childAt2.getVisibility();
                    if (childAt2.getVisibility() != 0) {
                        alpha = 0.0f;
                    } else {
                        alpha = childAt2.getAlpha();
                    }
                    k74Var.X = alpha;
                    k74Var.Y = childAt2.getElevation();
                    k74Var.Z = childAt2.getRotation();
                    k74Var.d0 = childAt2.getRotationX();
                    k74Var.A = childAt2.getRotationY();
                    k74Var.e0 = childAt2.getScaleX();
                    k74Var.f0 = childAt2.getScaleY();
                    k74Var.g0 = childAt2.getPivotX();
                    k74Var.h0 = childAt2.getPivotY();
                    k74Var.i0 = childAt2.getTranslationX();
                    k74Var.j0 = childAt2.getTranslationY();
                    k74Var.k0 = childAt2.getTranslationZ();
                }
            }
            int width = getWidth();
            int height = getHeight();
            for (int i9 = 0; i9 < childCount; i9++) {
                m74 m74Var2 = (m74) hashMap.get(getChildAt(i9));
                if (m74Var2 != null) {
                    this.p0.e(m74Var2);
                    m74Var2.g(getNanoTime(), width, height);
                }
            }
            b84 b84Var2 = this.p0.c;
            if (b84Var2 != null) {
                f = b84Var2.i;
            } else {
                f = 0.0f;
            }
            if (f != RecyclerView.B1) {
                float f2 = Float.MAX_VALUE;
                float f3 = -3.4028235E38f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    y74 y74Var2 = ((m74) hashMap.get(getChildAt(i10))).g;
                    float f4 = y74Var2.Y + y74Var2.X;
                    f2 = Math.min(f2, f4);
                    f3 = Math.max(f3, f4);
                }
                for (int i11 = 0; i11 < childCount; i11++) {
                    m74 m74Var3 = (m74) hashMap.get(getChildAt(i11));
                    y74 y74Var3 = m74Var3.g;
                    float f5 = y74Var3.X;
                    float f6 = y74Var3.Y;
                    m74Var3.n = 1.0f / (1.0f - f);
                    m74Var3.m = f - ((((f5 + f6) - f2) * f) / (f3 - f2));
                }
            }
            this.C0 = RecyclerView.B1;
            this.D0 = RecyclerView.B1;
            this.H0 = true;
            invalidate();
        }
    }

    public void setOnHide(float f) {
    }

    public void setOnShow(float f) {
    }

    public void setTransitionListener(x74 x74Var) {
    }

    public void setTransition(b84 b84Var) {
        c cVar;
        b bVar = this.p0;
        bVar.c = b84Var;
        if (b84Var != null && (cVar = b84Var.l) != null) {
            cVar.c(bVar.p);
        }
        setState(a.SETUP);
        int i = this.u0;
        b84 b84Var2 = this.p0.c;
        if (i == (b84Var2 == null ? -1 : b84Var2.c)) {
            this.D0 = 1.0f;
            this.C0 = 1.0f;
            this.F0 = 1.0f;
        } else {
            this.D0 = RecyclerView.B1;
            this.C0 = RecyclerView.B1;
            this.F0 = RecyclerView.B1;
        }
        this.E0 = (b84Var.r & 1) != 0 ? -1L : getNanoTime();
        int g = this.p0.g();
        b bVar2 = this.p0;
        b84 b84Var3 = bVar2.c;
        int i2 = b84Var3 != null ? b84Var3.c : -1;
        if (g == this.t0 && i2 == this.v0) {
            return;
        }
        this.t0 = g;
        this.v0 = i2;
        bVar2.m(g, i2);
        z11 b = this.p0.b(this.t0);
        z11 b2 = this.p0.b(this.v0);
        w74 w74Var = this.o1;
        w74Var.e(b, b2);
        int i3 = this.t0;
        int i4 = this.v0;
        w74Var.e = i3;
        w74Var.f = i4;
        w74Var.f();
        v();
    }

    @Override // defpackage.ke4
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
