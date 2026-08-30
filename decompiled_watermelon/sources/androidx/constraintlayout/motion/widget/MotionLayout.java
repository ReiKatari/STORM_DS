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
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements f64 {
    public static boolean s1;
    public float A0;
    public float B0;
    public float C0;
    public long D0;
    public float E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public tz3 I0;
    public boolean J0;
    public final jf6 K0;
    public final sz3 L0;
    public ge1 M0;
    public int N0;
    public int O0;
    public boolean P0;
    public float Q0;
    public float R0;
    public long S0;
    public float T0;
    public boolean U0;
    public int V0;
    public long W0;
    public float X0;
    public boolean Y0;
    public int Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public float f1;
    public final u93 g1;
    public boolean h1;
    public androidx.constraintlayout.motion.widget.a i1;
    public xc4 j1;
    public final Rect k1;
    public boolean l1;
    public a m1;
    public final uz3 n1;
    public b o0;
    public boolean o1;
    public rz3 p0;
    public final RectF p1;
    public Interpolator q0;
    public View q1;
    public float r0;
    public Matrix r1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public final HashMap y0;
    public long z0;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public enum a {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, jf6] */
    /* JADX WARN: Type inference failed for: r5v0, types: [if6, java.lang.Object, kf6] */
    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar;
        this.q0 = null;
        this.r0 = RecyclerView.A1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        int i = 0;
        this.v0 = 0;
        this.w0 = 0;
        this.x0 = true;
        this.y0 = new HashMap();
        this.z0 = 0L;
        this.A0 = 1.0f;
        this.B0 = RecyclerView.A1;
        this.C0 = RecyclerView.A1;
        this.E0 = RecyclerView.A1;
        this.G0 = false;
        this.H0 = 0;
        this.J0 = false;
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.k = false;
        obj.a = obj2;
        obj.c = obj2;
        this.K0 = obj;
        this.L0 = new sz3(this);
        this.P0 = false;
        this.U0 = false;
        this.V0 = 0;
        this.W0 = -1L;
        this.X0 = RecyclerView.A1;
        this.Y0 = false;
        this.g1 = new u93(0);
        this.h1 = false;
        this.j1 = null;
        new HashMap();
        this.k1 = new Rect();
        this.l1 = false;
        this.m1 = a.UNDEFINED;
        this.n1 = new uz3(this);
        this.o1 = false;
        this.p1 = new RectF();
        this.q1 = null;
        this.r1 = null;
        new ArrayList();
        s1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tx4.l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.o0 = new b(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.t0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.E0 = obtainStyledAttributes.getFloat(index, RecyclerView.A1);
                    this.G0 = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.H0 == 0) {
                        this.H0 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.H0 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.o0 == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.o0 = null;
            }
        }
        if (this.H0 != 0) {
            b bVar2 = this.o0;
            if (bVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int g = bVar2.g();
                b bVar3 = this.o0;
                uy0 b = bVar3.b(bVar3.g());
                String M = b53.M(getContext(), g);
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder u = b31.u("CHECK: ", M, " ALL VIEWS SHOULD HAVE ID's ");
                        u.append(childAt.getClass().getName());
                        u.append(" does not!");
                        Log.w("MotionLayout", u.toString());
                    }
                    if (b.i(id) == null) {
                        StringBuilder u2 = b31.u("CHECK: ", M, " NO CONSTRAINTS for ");
                        u2.append(b53.N(childAt));
                        Log.w("MotionLayout", u2.toString());
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
                    String M2 = b53.M(getContext(), i6);
                    if (findViewById(iArr[i5]) == null) {
                        wh1.y("CHECK: ", M, " NO View matches id ", M2, "MotionLayout");
                    }
                    if (b.h(i6).e.d == -1) {
                        Log.w("MotionLayout", "CHECK: " + M + "(" + M2 + ") no LAYOUT_HEIGHT");
                    }
                    if (b.h(i6).e.c == -1) {
                        Log.w("MotionLayout", "CHECK: " + M + "(" + M2 + ") no LAYOUT_HEIGHT");
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                ArrayList arrayList = this.o0.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    zz3 zz3Var = (zz3) obj3;
                    if (zz3Var == this.o0.c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (zz3Var.d == zz3Var.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i7 = zz3Var.d;
                    int i8 = zz3Var.c;
                    String M3 = b53.M(getContext(), i7);
                    String M4 = b53.M(getContext(), i8);
                    if (sparseIntArray.get(i7) == i8) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + M3 + "->" + M4);
                    }
                    if (sparseIntArray2.get(i8) == i7) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + M3 + "->" + M4);
                    }
                    sparseIntArray.put(i7, i8);
                    sparseIntArray2.put(i8, i7);
                    if (this.o0.b(i7) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + M3);
                    }
                    if (this.o0.b(i8) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + M3);
                    }
                }
            }
        }
        if (this.t0 == -1 && (bVar = this.o0) != null) {
            this.t0 = bVar.g();
            this.s0 = this.o0.g();
            zz3 zz3Var2 = this.o0.c;
            this.u0 = zz3Var2 != null ? zz3Var2.c : -1;
        }
    }

    public static Rect o(MotionLayout motionLayout, gz0 gz0Var) {
        Rect rect = motionLayout.k1;
        rect.top = gz0Var.t();
        rect.left = gz0Var.s();
        rect.right = gz0Var.r() + rect.left;
        rect.bottom = gz0Var.l() + rect.top;
        return rect;
    }

    public final void A(int i, uy0 uy0Var) {
        b bVar = this.o0;
        if (bVar != null) {
            bVar.g.put(i, uy0Var);
        }
        this.n1.e(this.o0.b(this.s0), this.o0.b(this.u0));
        v();
        if (this.t0 == i) {
            uy0Var.b(this);
        }
    }

    public final void B(int i, View... viewArr) {
        uy0 b;
        b bVar = this.o0;
        if (bVar != null) {
            ka kaVar = bVar.q;
            String str = (String) kaVar.X;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) kaVar.L;
            int size = arrayList2.size();
            xb7 xb7Var = null;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                xb7 xb7Var2 = (xb7) arrayList2.get(i2);
                if (xb7Var2.a == i) {
                    for (View view : viewArr) {
                        if (xb7Var2.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = (MotionLayout) kaVar.B;
                        xb7Var = xb7Var2;
                        int currentState = motionLayout.getCurrentState();
                        if (xb7Var.e != 2) {
                            if (currentState == -1) {
                                Log.w(str, "No support for ViewTransition within transition yet. Currently: ".concat(motionLayout.toString()));
                            } else {
                                b bVar2 = motionLayout.o0;
                                if (bVar2 == null) {
                                    b = null;
                                } else {
                                    b = bVar2.b(currentState);
                                }
                                if (b != null) {
                                    xb7Var.a(kaVar, (MotionLayout) kaVar.B, currentState, b, viewArr2);
                                }
                            }
                        } else {
                            xb7Var.a(kaVar, (MotionLayout) kaVar.B, currentState, null, viewArr2);
                        }
                        arrayList.clear();
                    } else {
                        xb7Var = xb7Var2;
                    }
                }
                i2 = i3;
            }
            if (xb7Var == null) {
                Log.e(str, " Could not find ViewTransition");
                return;
            }
            return;
        }
        Log.e("MotionLayout", " no motionScene");
    }

    @Override // defpackage.e64
    public final void a(View view, View view2, int i, int i2) {
        this.S0 = getNanoTime();
        this.T0 = RecyclerView.A1;
        this.Q0 = RecyclerView.A1;
        this.R0 = RecyclerView.A1;
    }

    @Override // defpackage.e64
    public final void b(View view, int i) {
        c cVar;
        float f;
        int i2;
        b bVar = this.o0;
        if (bVar != null) {
            float f2 = this.T0;
            float f3 = RecyclerView.A1;
            if (f2 != RecyclerView.A1) {
                float f4 = this.Q0 / f2;
                float f5 = this.R0 / f2;
                zz3 zz3Var = bVar.c;
                if (zz3Var != null && (cVar = zz3Var.l) != null) {
                    float[] fArr = cVar.n;
                    cVar.m = false;
                    MotionLayout motionLayout = cVar.r;
                    float progress = motionLayout.getProgress();
                    cVar.r.s(cVar.d, progress, cVar.h, cVar.g, fArr);
                    float f6 = cVar.k;
                    float f7 = fArr[0];
                    float f8 = cVar.l;
                    float f9 = fArr[1];
                    if (f6 != RecyclerView.A1) {
                        f = (f4 * f6) / f7;
                    } else {
                        f = (f5 * f8) / f9;
                    }
                    if (!Float.isNaN(f)) {
                        progress += f / 3.0f;
                    }
                    if (progress != RecyclerView.A1 && progress != 1.0f && (i2 = cVar.c) != 3) {
                        if (progress >= 0.5d) {
                            f3 = 1.0f;
                        }
                        motionLayout.y(f3, f, i2);
                    }
                }
            }
        }
    }

    @Override // defpackage.e64
    public final void c(View view, int i, int i2, int[] iArr, int i3) {
        zz3 zz3Var;
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
        b bVar = this.o0;
        if (bVar != null && (zz3Var = bVar.c) != null && !(z = zz3Var.o)) {
            int i5 = -1;
            if (z || (cVar4 = zz3Var.l) == null || (i4 = cVar4.e) == -1 || view.getId() == i4) {
                zz3 zz3Var2 = bVar.c;
                if (zz3Var2 != null && (cVar3 = zz3Var2.l) != null) {
                    z2 = cVar3.u;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c cVar5 = zz3Var.l;
                    if (cVar5 != null && (cVar5.w & 4) != 0) {
                        i5 = i2;
                    }
                    float f4 = this.B0;
                    if ((f4 == 1.0f || f4 == RecyclerView.A1) && view.canScrollVertically(i5)) {
                        return;
                    }
                }
                c cVar6 = zz3Var.l;
                if (cVar6 != null && (cVar6.w & 1) != 0) {
                    float f5 = i;
                    float f6 = i2;
                    zz3 zz3Var3 = bVar.c;
                    if (zz3Var3 != null && (cVar2 = zz3Var3.l) != null) {
                        float[] fArr = cVar2.n;
                        f = 0.0f;
                        cVar2.r.s(cVar2.d, cVar2.r.getProgress(), cVar2.h, cVar2.g, fArr);
                        float f7 = cVar2.k;
                        if (f7 != RecyclerView.A1) {
                            if (fArr[0] == RecyclerView.A1) {
                                fArr[0] = 1.0E-7f;
                            }
                            f3 = (f5 * f7) / fArr[0];
                        } else {
                            if (fArr[1] == RecyclerView.A1) {
                                fArr[1] = 1.0E-7f;
                            }
                            f3 = (f6 * cVar2.l) / fArr[1];
                        }
                    } else {
                        f = 0.0f;
                        f3 = 0.0f;
                    }
                    float f8 = this.C0;
                    if ((f8 <= f && f3 < f) || (f8 >= 1.0f && f3 > f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new es4(16, (ViewGroup) view));
                        return;
                    }
                } else {
                    f = 0.0f;
                }
                float f9 = this.B0;
                long nanoTime = getNanoTime();
                float f10 = i;
                this.Q0 = f10;
                float f11 = i2;
                this.R0 = f11;
                this.T0 = (float) ((nanoTime - this.S0) * 1.0E-9d);
                this.S0 = nanoTime;
                zz3 zz3Var4 = bVar.c;
                if (zz3Var4 != null && (cVar = zz3Var4.l) != null) {
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
                if (f9 != this.B0) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                r(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.P0 = true;
                }
            }
        }
    }

    @Override // defpackage.f64
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.P0 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.P0 = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        tz3 tz3Var;
        Paint paint;
        Paint paint2;
        int i5;
        pb7 pb7Var;
        pb7 pb7Var2;
        gb7 gb7Var;
        gb7 gb7Var2;
        int i6;
        tz3 tz3Var2;
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
        ka kaVar;
        r(false);
        b bVar = this.o0;
        if (bVar != null && (kaVar = bVar.q) != null) {
            ArrayList arrayList = (ArrayList) kaVar.Z;
            ArrayList arrayList2 = (ArrayList) kaVar.Y;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList2.get(i8);
                    i8++;
                    ((wb7) obj).a();
                }
                ((ArrayList) kaVar.Y).removeAll(arrayList);
                arrayList.clear();
                if (((ArrayList) kaVar.Y).isEmpty()) {
                    kaVar.Y = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.o0 != null) {
            if ((this.H0 & 1) == 1 && !isInEditMode()) {
                this.V0++;
                long nanoTime = getNanoTime();
                long j2 = this.W0;
                if (j2 != -1) {
                    if (nanoTime - j2 > 200000000) {
                        this.X0 = ((int) ((this.V0 / (((float) j) * 1.0E-9f)) * 100.0f)) / 100.0f;
                        this.V0 = 0;
                        this.W0 = nanoTime;
                    }
                } else {
                    this.W0 = nanoTime;
                }
                Paint paint5 = new Paint();
                paint5.setTextSize(42.0f);
                float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
                StringBuilder sb = new StringBuilder();
                sb.append(this.X0);
                sb.append(" fps ");
                int i9 = this.s0;
                String str2 = "UNDEFINED";
                if (i9 == -1) {
                    resourceEntryName = "UNDEFINED";
                } else {
                    resourceEntryName = getContext().getResources().getResourceEntryName(i9);
                }
                StringBuilder r = wh1.r(b31.q(sb, resourceEntryName, " -> "));
                int i10 = this.u0;
                if (i10 == -1) {
                    resourceEntryName2 = "UNDEFINED";
                } else {
                    resourceEntryName2 = getContext().getResources().getResourceEntryName(i10);
                }
                r.append(resourceEntryName2);
                r.append(" (progress: ");
                r.append(progress);
                r.append(" ) state=");
                int i11 = this.t0;
                if (i11 == -1) {
                    str = "undefined";
                } else {
                    if (i11 != -1) {
                        str2 = getContext().getResources().getResourceEntryName(i11);
                    }
                    str = str2;
                }
                r.append(str);
                String sb2 = r.toString();
                paint5.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, getHeight() - 29, paint5);
                paint5.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, getHeight() - 30, paint5);
            }
            if (this.H0 > 1) {
                if (this.I0 == null) {
                    this.I0 = new tz3(this);
                }
                tz3 tz3Var3 = this.I0;
                b bVar2 = this.o0;
                zz3 zz3Var = bVar2.c;
                if (zz3Var != null) {
                    i = zz3Var.h;
                } else {
                    i = bVar2.j;
                }
                int i12 = this.H0;
                Paint paint6 = tz3Var3.g;
                Paint paint7 = tz3Var3.f;
                Paint paint8 = tz3Var3.i;
                int i13 = tz3Var3.m;
                Paint paint9 = tz3Var3.e;
                MotionLayout motionLayout = tz3Var3.n;
                HashMap hashMap = this.y0;
                if (hashMap != null && hashMap.size() != 0) {
                    canvas.save();
                    if (!motionLayout.isInEditMode() && (i12 & 1) == 2) {
                        String str3 = motionLayout.getContext().getResources().getResourceName(motionLayout.u0) + ":" + motionLayout.getProgress();
                        canvas.drawText(str3, 10.0f, motionLayout.getHeight() - 30, tz3Var3.h);
                        canvas.drawText(str3, 11.0f, motionLayout.getHeight() - 29, paint9);
                    }
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        lz3 lz3Var = (lz3) it.next();
                        wz3 wz3Var = lz3Var.f;
                        ArrayList arrayList3 = lz3Var.u;
                        int i14 = wz3Var.B;
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj2 = arrayList3.get(i15);
                            i15++;
                            i14 = Math.max(i14, ((wz3) obj2).B);
                            it = it;
                        }
                        Iterator it2 = it;
                        int max = Math.max(i14, lz3Var.g.B);
                        if (i12 > 0 && max == 0) {
                            max = 1;
                        }
                        if (max == 0) {
                            it = it2;
                        } else {
                            float[] fArr = tz3Var3.c;
                            int[] iArr = tz3Var3.b;
                            if (fArr != null) {
                                double[] H = lz3Var.j[0].H();
                                if (iArr != null) {
                                    int i16 = 0;
                                    int i17 = 0;
                                    for (int size3 = arrayList3.size(); i16 < size3; size3 = size3) {
                                        Object obj3 = arrayList3.get(i16);
                                        i16++;
                                        iArr[i17] = ((wz3) obj3).j0;
                                        i17++;
                                    }
                                }
                                int i18 = 0;
                                int i19 = 0;
                                while (i18 < H.length) {
                                    int i20 = i18;
                                    lz3Var.j[0].D(H[i18], lz3Var.p);
                                    lz3Var.f.c(H[i20], lz3Var.o, lz3Var.p, fArr, i19);
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
                            tz3Var3.k = i4;
                            if (max >= 1) {
                                int i21 = i2 / 16;
                                float[] fArr2 = tz3Var3.a;
                                if (fArr2 == null || fArr2.length != i21 * 2) {
                                    tz3Var3.a = new float[i21 * 2];
                                    tz3Var3.d = new Path();
                                }
                                float f4 = i13;
                                canvas.translate(f4, f4);
                                paint9.setColor(1996488704);
                                paint8.setColor(1996488704);
                                paint7.setColor(1996488704);
                                paint6.setColor(1996488704);
                                float[] fArr3 = tz3Var3.a;
                                float f5 = 1.0f / (i21 - 1);
                                HashMap hashMap2 = lz3Var.y;
                                float f6 = 1.0f;
                                if (hashMap2 == null) {
                                    pb7Var = null;
                                } else {
                                    pb7Var = (pb7) hashMap2.get("translationX");
                                }
                                HashMap hashMap3 = lz3Var.y;
                                if (hashMap3 == null) {
                                    pb7Var2 = null;
                                } else {
                                    pb7Var2 = (pb7) hashMap3.get("translationY");
                                }
                                int i22 = i13;
                                HashMap hashMap4 = lz3Var.z;
                                if (hashMap4 == null) {
                                    gb7Var = null;
                                } else {
                                    gb7Var = (gb7) hashMap4.get("translationX");
                                }
                                HashMap hashMap5 = lz3Var.z;
                                if (hashMap5 == null) {
                                    gb7Var2 = null;
                                } else {
                                    gb7Var2 = (gb7) hashMap5.get("translationY");
                                }
                                int i23 = 0;
                                while (true) {
                                    float f7 = Float.NaN;
                                    float f8 = RecyclerView.A1;
                                    if (i23 >= i21) {
                                        break;
                                    }
                                    int i24 = i21;
                                    float f9 = i23 * f5;
                                    float f10 = lz3Var.n;
                                    if (f10 != f6) {
                                        float f11 = lz3Var.m;
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
                                    an1 an1Var = wz3Var.A;
                                    int size4 = arrayList3.size();
                                    wz3 wz3Var2 = wz3Var;
                                    int i25 = 0;
                                    while (i25 < size4) {
                                        Object obj4 = arrayList3.get(i25);
                                        int i26 = i25 + 1;
                                        wz3 wz3Var3 = (wz3) obj4;
                                        ArrayList arrayList4 = arrayList3;
                                        an1 an1Var2 = wz3Var3.A;
                                        if (an1Var2 != null) {
                                            float f12 = wz3Var3.L;
                                            if (f12 < f) {
                                                f8 = f12;
                                                an1Var = an1Var2;
                                            } else if (Float.isNaN(f7)) {
                                                f7 = wz3Var3.L;
                                            }
                                        }
                                        i25 = i26;
                                        arrayList3 = arrayList4;
                                    }
                                    ArrayList arrayList5 = arrayList3;
                                    if (an1Var != null) {
                                        if (Float.isNaN(f7)) {
                                            f7 = 1.0f;
                                        }
                                        d = (((float) an1Var.b((f - f8) / f2)) * (f7 - f8)) + f8;
                                    } else {
                                        d = d2;
                                    }
                                    lz3Var.j[0].D(d, lz3Var.p);
                                    gt gtVar = lz3Var.k;
                                    if (gtVar != null) {
                                        double[] dArr = lz3Var.p;
                                        paint4 = paint6;
                                        if (dArr.length > 0) {
                                            gtVar.D(d, dArr);
                                        }
                                    } else {
                                        paint4 = paint6;
                                    }
                                    int i27 = i7 * 2;
                                    lz3Var.f.c(d, lz3Var.o, lz3Var.p, fArr3, i27);
                                    if (gb7Var != null) {
                                        fArr3[i27] = gb7Var.a(f) + fArr3[i27];
                                    } else if (pb7Var != null) {
                                        fArr3[i27] = pb7Var.a(f) + fArr3[i27];
                                    }
                                    if (gb7Var2 != null) {
                                        int i28 = i27 + 1;
                                        fArr3[i28] = gb7Var2.a(f) + fArr3[i28];
                                    } else if (pb7Var2 != null) {
                                        int i29 = i27 + 1;
                                        fArr3[i29] = pb7Var2.a(f) + fArr3[i29];
                                    }
                                    i23 = i7 + 1;
                                    i21 = i24;
                                    paint8 = paint3;
                                    wz3Var = wz3Var2;
                                    arrayList3 = arrayList5;
                                    paint6 = paint4;
                                    f6 = 1.0f;
                                }
                                wz3 wz3Var4 = wz3Var;
                                tz3Var3.a(canvas, max, tz3Var3.k, lz3Var);
                                paint9.setColor(-21965);
                                paint7.setColor(-2067046);
                                Paint paint10 = paint8;
                                paint10.setColor(-2067046);
                                paint = paint6;
                                paint.setColor(-13391360);
                                int i30 = i22;
                                float f13 = -i30;
                                canvas.translate(f13, f13);
                                tz3Var3.a(canvas, max, tz3Var3.k, lz3Var);
                                char c = 5;
                                if (max == 5) {
                                    float[] fArr4 = tz3Var3.j;
                                    tz3Var3.d.reset();
                                    int i31 = 0;
                                    while (i31 <= 50) {
                                        char c2 = c;
                                        int i32 = i31;
                                        lz3Var.j[0].D(lz3Var.a(i31 / 50.0f, null), lz3Var.p);
                                        int[] iArr2 = lz3Var.o;
                                        double[] dArr2 = lz3Var.p;
                                        wz3 wz3Var5 = wz3Var4;
                                        float f14 = wz3Var5.X;
                                        float f15 = wz3Var5.Y;
                                        float f16 = wz3Var5.Z;
                                        float f17 = wz3Var5.c0;
                                        float[] fArr5 = fArr4;
                                        lz3 lz3Var2 = lz3Var;
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
                                        if (wz3Var5.h0 != null) {
                                            double d3 = f14;
                                            double d4 = f15;
                                            tz3Var2 = tz3Var3;
                                            f14 = (float) (((Math.sin(d4) * d3) + 0.0d) - (f16 / 2.0f));
                                            f15 = (float) ((0.0d - (Math.cos(d4) * d3)) - (f17 / 2.0f));
                                        } else {
                                            tz3Var2 = tz3Var3;
                                        }
                                        float f19 = f16 + f14;
                                        float f20 = f17 + f15;
                                        Float.isNaN(Float.NaN);
                                        Float.isNaN(Float.NaN);
                                        float f21 = f14 + RecyclerView.A1;
                                        float f22 = f15 + RecyclerView.A1;
                                        float f23 = f19 + RecyclerView.A1;
                                        float f24 = f20 + RecyclerView.A1;
                                        fArr5[0] = f21;
                                        fArr5[1] = f22;
                                        fArr5[2] = f23;
                                        fArr5[3] = f22;
                                        fArr5[4] = f23;
                                        fArr5[c2] = f24;
                                        fArr5[6] = f21;
                                        fArr5[7] = f24;
                                        tz3 tz3Var4 = tz3Var2;
                                        tz3Var4.d.moveTo(f21, f22);
                                        tz3Var4.d.lineTo(fArr5[2], fArr5[3]);
                                        tz3Var4.d.lineTo(fArr5[4], fArr5[c2]);
                                        tz3Var4.d.lineTo(fArr5[6], fArr5[7]);
                                        tz3Var4.d.close();
                                        i31 = i32 + 1;
                                        tz3Var3 = tz3Var4;
                                        wz3Var4 = wz3Var5;
                                        c = c2;
                                        fArr4 = fArr5;
                                        lz3Var = lz3Var2;
                                        i30 = i6;
                                        paint10 = paint12;
                                    }
                                    i5 = i30;
                                    paint2 = paint10;
                                    tz3Var = tz3Var3;
                                    paint9.setColor(1140850688);
                                    canvas.translate(2.0f, 2.0f);
                                    canvas.drawPath(tz3Var.d, paint9);
                                    canvas.translate(-2.0f, -2.0f);
                                    paint9.setColor(-65536);
                                    canvas.drawPath(tz3Var.d, paint9);
                                } else {
                                    i5 = i30;
                                    paint2 = paint10;
                                    tz3Var = tz3Var3;
                                }
                            } else {
                                tz3Var = tz3Var3;
                                paint = paint6;
                                paint2 = paint8;
                                i5 = i13;
                            }
                            tz3Var3 = tz3Var;
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

    @Override // defpackage.e64
    public final boolean f(View view, View view2, int i, int i2) {
        zz3 zz3Var;
        c cVar;
        b bVar = this.o0;
        if (bVar != null && (zz3Var = bVar.c) != null && (cVar = zz3Var.l) != null && (cVar.w & 2) == 0) {
            return true;
        }
        return false;
    }

    public int[] getConstraintSetIds() {
        b bVar = this.o0;
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
        return this.t0;
    }

    public ArrayList<zz3> getDefinedTransitions() {
        b bVar = this.o0;
        if (bVar == null) {
            return null;
        }
        return bVar.d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ge1, java.lang.Object] */
    public ge1 getDesignTool() {
        if (this.M0 == null) {
            this.M0 = new Object();
        }
        return this.M0;
    }

    public int getEndState() {
        return this.u0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.C0;
    }

    public b getScene() {
        return this.o0;
    }

    public int getStartState() {
        return this.s0;
    }

    public float getTargetPosition() {
        return this.E0;
    }

    public Bundle getTransitionState() {
        if (this.i1 == null) {
            this.i1 = new androidx.constraintlayout.motion.widget.a(this);
        }
        androidx.constraintlayout.motion.widget.a aVar = this.i1;
        MotionLayout motionLayout = aVar.e;
        aVar.d = motionLayout.u0;
        aVar.c = motionLayout.s0;
        aVar.b = motionLayout.getVelocity();
        aVar.a = motionLayout.getProgress();
        androidx.constraintlayout.motion.widget.a aVar2 = this.i1;
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
        b bVar = this.o0;
        if (bVar != null) {
            zz3 zz3Var = bVar.c;
            if (zz3Var != null) {
                i = zz3Var.h;
            } else {
                i = bVar.j;
            }
            this.A0 = i / 1000.0f;
        }
        return this.A0 * 1000.0f;
    }

    public float getVelocity() {
        return this.r0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void k(int i) {
        this.i0 = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        zz3 zz3Var;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.o0;
        if (bVar != null && (i = this.t0) != -1) {
            uy0 b = bVar.b(i);
            b bVar2 = this.o0;
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
            this.s0 = this.t0;
        }
        u();
        androidx.constraintlayout.motion.widget.a aVar = this.i1;
        if (aVar != null) {
            if (this.l1) {
                post(new es4(17, this));
                return;
            } else {
                aVar.a();
                return;
            }
        }
        b bVar3 = this.o0;
        if (bVar3 != null && (zz3Var = bVar3.c) != null && zz3Var.n == 4) {
            p(1.0f);
            this.j1 = null;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.h1 = true;
        try {
            if (this.o0 == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.h1 = false;
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.N0 != i5 || this.O0 != i6) {
                v();
                r(true);
            }
            this.N0 = i5;
            this.O0 = i6;
            this.h1 = false;
        } catch (Throwable th) {
            this.h1 = false;
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
        if (this.o0 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z3 = true;
        if (this.v0 == i && this.w0 == i2) {
            z = false;
        } else {
            z = true;
        }
        if (this.o1) {
            this.o1 = false;
            u();
            z = true;
        }
        if (this.f0) {
            z = true;
        }
        this.v0 = i;
        this.w0 = i2;
        int g = this.o0.g();
        zz3 zz3Var = this.o0.c;
        if (zz3Var == null) {
            i3 = -1;
        } else {
            i3 = zz3Var.c;
        }
        uz3 uz3Var = this.n1;
        if ((z || g != uz3Var.e || i3 != uz3Var.f) && this.s0 != -1) {
            super.onMeasure(i, i2);
            uz3Var.e(this.o0.b(g), this.o0.b(i3));
            uz3Var.f();
            uz3Var.e = g;
            uz3Var.f = i3;
            z2 = false;
        } else {
            if (z) {
                super.onMeasure(i, i2);
            }
            z2 = true;
        }
        if (this.Y0 || z2) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            hz0 hz0Var = this.L;
            int r = hz0Var.r() + paddingRight;
            int l = hz0Var.l() + paddingBottom;
            int i6 = this.d1;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                r = (int) ((this.f1 * (this.b1 - i4)) + this.Z0);
                requestLayout();
            }
            int i7 = this.e1;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                l = (int) ((this.f1 * (this.c1 - i5)) + this.a1);
                requestLayout();
            }
            setMeasuredDimension(r, l);
        }
        float signum = Math.signum(this.E0 - this.C0);
        long nanoTime = getNanoTime();
        rz3 rz3Var = this.p0;
        if (!(rz3Var instanceof jf6)) {
            f = ((((float) (nanoTime - this.D0)) * signum) * 1.0E-9f) / this.A0;
        } else {
            f = 0.0f;
        }
        float f2 = this.C0 + f;
        if (this.F0) {
            f2 = this.E0;
        }
        int i8 = (signum > RecyclerView.A1 ? 1 : (signum == RecyclerView.A1 ? 0 : -1));
        if ((i8 > 0 && f2 >= this.E0) || (signum <= RecyclerView.A1 && f2 <= this.E0)) {
            f2 = this.E0;
        } else {
            z3 = false;
        }
        if (rz3Var != null && !z3) {
            if (this.J0) {
                f2 = rz3Var.getInterpolation(((float) (nanoTime - this.z0)) * 1.0E-9f);
            } else {
                f2 = rz3Var.getInterpolation(f2);
            }
        }
        if ((i8 > 0 && f2 >= this.E0) || (signum <= RecyclerView.A1 && f2 <= this.E0)) {
            f2 = this.E0;
        }
        this.f1 = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.q0;
        if (interpolator != null) {
            f2 = interpolator.getInterpolation(f2);
        }
        float f3 = f2;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            lz3 lz3Var = (lz3) this.y0.get(childAt);
            if (lz3Var != null) {
                lz3Var.d(f3, nanoTime2, this.g1, childAt);
            }
        }
        if (this.Y0) {
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
        b bVar = this.o0;
        if (bVar != null) {
            boolean j = j();
            bVar.p = j;
            zz3 zz3Var = bVar.c;
            if (zz3Var != null && (cVar = zz3Var.l) != null) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 2037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(float f) {
        int i;
        b bVar = this.o0;
        if (bVar != null) {
            float f2 = this.C0;
            float f3 = this.B0;
            if (f2 != f3 && this.F0) {
                this.C0 = f3;
            }
            float f4 = this.C0;
            if (f4 == f) {
                return;
            }
            this.J0 = false;
            this.E0 = f;
            zz3 zz3Var = bVar.c;
            if (zz3Var != null) {
                i = zz3Var.h;
            } else {
                i = bVar.j;
            }
            this.A0 = i / 1000.0f;
            setProgress(f);
            this.p0 = null;
            this.q0 = this.o0.d();
            this.F0 = false;
            this.z0 = getNanoTime();
            this.G0 = true;
            this.B0 = f4;
            this.C0 = f4;
            invalidate();
        }
    }

    public final void q(boolean z) {
        float f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            lz3 lz3Var = (lz3) this.y0.get(getChildAt(i));
            if (lz3Var != null && "button".equals(b53.N(lz3Var.b)) && lz3Var.A != null) {
                int i2 = 0;
                while (true) {
                    za3[] za3VarArr = lz3Var.A;
                    if (i2 < za3VarArr.length) {
                        za3 za3Var = za3VarArr[i2];
                        if (z) {
                            f = -100.0f;
                        } else {
                            f = 100.0f;
                        }
                        za3Var.g(lz3Var.b, f);
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
        zz3 zz3Var;
        if (!this.Y0 && this.t0 == -1 && (bVar = this.o0) != null && (zz3Var = bVar.c) != null) {
            int i = zz3Var.q;
            if (i != 0) {
                if (i == 2) {
                    int childCount = getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        ((lz3) this.y0.get(getChildAt(i2))).d = true;
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
        lz3 lz3Var = (lz3) this.y0.get(view);
        if (lz3Var != null) {
            wz3 wz3Var = lz3Var.f;
            float[] fArr2 = lz3Var.v;
            float a2 = lz3Var.a(f, fArr2);
            jv3[] jv3VarArr = lz3Var.j;
            int i2 = 0;
            if (jv3VarArr != null) {
                double d = a2;
                jv3VarArr[0].G(d, lz3Var.q);
                lz3Var.j[0].D(d, lz3Var.p);
                float f4 = fArr2[0];
                while (true) {
                    dArr = lz3Var.q;
                    if (i2 >= dArr.length) {
                        break;
                    }
                    dArr[i2] = dArr[i2] * f4;
                    i2++;
                }
                gt gtVar = lz3Var.k;
                if (gtVar != null) {
                    double[] dArr2 = lz3Var.p;
                    if (dArr2.length > 0) {
                        gtVar.D(d, dArr2);
                        lz3Var.k.G(d, lz3Var.q);
                        int[] iArr = lz3Var.o;
                        double[] dArr3 = lz3Var.q;
                        double[] dArr4 = lz3Var.p;
                        wz3Var.getClass();
                        wz3.e(f2, f3, fArr, iArr, dArr3, dArr4);
                    }
                } else {
                    int[] iArr2 = lz3Var.o;
                    double[] dArr5 = lz3Var.p;
                    wz3Var.getClass();
                    wz3.e(f2, f3, fArr, iArr2, dArr, dArr5);
                }
            } else {
                wz3 wz3Var2 = lz3Var.g;
                float f5 = wz3Var2.X - wz3Var.X;
                float f6 = wz3Var2.Y - wz3Var.Y;
                fArr[0] = (((wz3Var2.Z - wz3Var.Z) + f5) * f2) + ((1.0f - f2) * f5);
                fArr[1] = (((wz3Var2.c0 - wz3Var.c0) + f6) * f3) + ((1.0f - f3) * f6);
            }
            view.getY();
            return;
        }
        if (view == null) {
            resourceName = wh1.g(i, "");
        } else {
            resourceName = view.getContext().getResources().getResourceName(i);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    public void setDebugMode(int i) {
        this.H0 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.l1 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.x0 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.o0 != null) {
            setState(a.MOVING);
            Interpolator d = this.o0.d();
            if (d != null) {
                setProgress(d.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setProgress(float f) {
        int i = (f > RecyclerView.A1 ? 1 : (f == RecyclerView.A1 ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.i1 == null) {
                this.i1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            this.i1.a = f;
            return;
        }
        if (i <= 0) {
            if (this.C0 == 1.0f && this.t0 == this.u0) {
                setState(a.MOVING);
            }
            this.t0 = this.s0;
            if (this.C0 == RecyclerView.A1) {
                setState(a.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.C0 == RecyclerView.A1 && this.t0 == this.s0) {
                setState(a.MOVING);
            }
            this.t0 = this.u0;
            if (this.C0 == 1.0f) {
                setState(a.FINISHED);
            }
        } else {
            this.t0 = -1;
            setState(a.MOVING);
        }
        if (this.o0 == null) {
            return;
        }
        this.F0 = true;
        this.E0 = f;
        this.B0 = f;
        this.D0 = -1L;
        this.z0 = -1L;
        this.p0 = null;
        this.G0 = true;
        invalidate();
    }

    public void setScene(b bVar) {
        c cVar;
        this.o0 = bVar;
        boolean j = j();
        bVar.p = j;
        zz3 zz3Var = bVar.c;
        if (zz3Var != null && (cVar = zz3Var.l) != null) {
            cVar.c(j);
        }
        v();
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.i1 == null) {
                this.i1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            androidx.constraintlayout.motion.widget.a aVar = this.i1;
            aVar.c = i;
            aVar.d = i;
            return;
        }
        this.t0 = i;
    }

    public void setState(a aVar) {
        xc4 xc4Var;
        xc4 xc4Var2;
        a aVar2 = a.FINISHED;
        if (aVar != aVar2 || this.t0 != -1) {
            a aVar3 = this.m1;
            this.m1 = aVar;
            a aVar4 = a.UNDEFINED;
            int ordinal = aVar3.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2 && aVar == aVar2 && (xc4Var2 = this.j1) != null) {
                    xc4Var2.run();
                    this.j1 = null;
                }
            } else if (aVar == aVar2 && (xc4Var = this.j1) != null) {
                xc4Var.run();
                this.j1 = null;
            }
        }
    }

    public void setTransition(int i) {
        zz3 zz3Var;
        float f;
        float f2;
        b bVar = this.o0;
        if (bVar != null) {
            ArrayList arrayList = bVar.d;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    zz3Var = (zz3) obj;
                    if (zz3Var.a == i) {
                        break;
                    }
                } else {
                    zz3Var = null;
                    break;
                }
            }
            this.s0 = zz3Var.d;
            this.u0 = zz3Var.c;
            if (!isAttachedToWindow()) {
                if (this.i1 == null) {
                    this.i1 = new androidx.constraintlayout.motion.widget.a(this);
                }
                androidx.constraintlayout.motion.widget.a aVar = this.i1;
                aVar.c = this.s0;
                aVar.d = this.u0;
                return;
            }
            int i3 = this.t0;
            if (i3 == this.s0) {
                f = 0.0f;
            } else if (i3 == this.u0) {
                f = 1.0f;
            } else {
                f = Float.NaN;
            }
            b bVar2 = this.o0;
            bVar2.c = zz3Var;
            c cVar = zz3Var.l;
            if (cVar != null) {
                cVar.c(bVar2.p);
            }
            this.n1.e(this.o0.b(this.s0), this.o0.b(this.u0));
            v();
            if (this.C0 != f) {
                if (f == RecyclerView.A1) {
                    q(true);
                    this.o0.b(this.s0).b(this);
                } else if (f == 1.0f) {
                    q(false);
                    this.o0.b(this.u0).b(this);
                }
            }
            if (Float.isNaN(f)) {
                f2 = 0.0f;
            } else {
                f2 = f;
            }
            this.C0 = f2;
            if (Float.isNaN(f)) {
                Log.v("MotionLayout", b53.L().concat(" transitionToStart "));
                p(RecyclerView.A1);
                return;
            }
            setProgress(f);
        }
    }

    public void setTransitionDuration(int i) {
        b bVar = this.o0;
        if (bVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        zz3 zz3Var = bVar.c;
        if (zz3Var != null) {
            zz3Var.h = Math.max(i, 8);
        } else {
            bVar.j = i;
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.i1 == null) {
            this.i1 = new androidx.constraintlayout.motion.widget.a(this);
        }
        androidx.constraintlayout.motion.widget.a aVar = this.i1;
        aVar.getClass();
        aVar.a = bundle.getFloat("motion.progress");
        aVar.b = bundle.getFloat("motion.velocity");
        aVar.c = bundle.getInt("motion.StartState");
        aVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.i1.a();
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
            RectF rectF = this.p1;
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
                    if (this.r1 == null) {
                        this.r1 = new Matrix();
                    }
                    matrix.invert(this.r1);
                    obtain.transform(this.r1);
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
        return b53.M(context, this.s0) + "->" + b53.M(context, this.u0) + " (pos:" + this.C0 + " Dpos/Dt:" + this.r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [b64, java.lang.Object] */
    public final void u() {
        zz3 zz3Var;
        c cVar;
        View view;
        b bVar = this.o0;
        if (bVar != null) {
            if (bVar.a(this.t0, this)) {
                requestLayout();
                return;
            }
            int i = this.t0;
            if (i != -1) {
                b bVar2 = this.o0;
                ArrayList arrayList = bVar2.f;
                ArrayList arrayList2 = bVar2.d;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    zz3 zz3Var2 = (zz3) obj;
                    if (zz3Var2.m.size() > 0) {
                        ArrayList arrayList3 = zz3Var2.m;
                        int size2 = arrayList3.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList3.get(i3);
                            i3++;
                            ((yz3) obj2).b(this);
                        }
                    }
                }
                int size3 = arrayList.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    zz3 zz3Var3 = (zz3) obj3;
                    if (zz3Var3.m.size() > 0) {
                        ArrayList arrayList4 = zz3Var3.m;
                        int size4 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size4) {
                            Object obj4 = arrayList4.get(i5);
                            i5++;
                            ((yz3) obj4).b(this);
                        }
                    }
                }
                int size5 = arrayList2.size();
                int i6 = 0;
                while (i6 < size5) {
                    Object obj5 = arrayList2.get(i6);
                    i6++;
                    zz3 zz3Var4 = (zz3) obj5;
                    if (zz3Var4.m.size() > 0) {
                        ArrayList arrayList5 = zz3Var4.m;
                        int size6 = arrayList5.size();
                        int i7 = 0;
                        while (i7 < size6) {
                            Object obj6 = arrayList5.get(i7);
                            i7++;
                            ((yz3) obj6).a(this, i, zz3Var4);
                        }
                    }
                }
                int size7 = arrayList.size();
                int i8 = 0;
                while (i8 < size7) {
                    Object obj7 = arrayList.get(i8);
                    i8++;
                    zz3 zz3Var5 = (zz3) obj7;
                    if (zz3Var5.m.size() > 0) {
                        ArrayList arrayList6 = zz3Var5.m;
                        int size8 = arrayList6.size();
                        int i9 = 0;
                        while (i9 < size8) {
                            Object obj8 = arrayList6.get(i9);
                            i9++;
                            ((yz3) obj8).a(this, i, zz3Var5);
                        }
                    }
                }
            }
            if (this.o0.n() && (zz3Var = this.o0.c) != null && (cVar = zz3Var.l) != null) {
                MotionLayout motionLayout = cVar.r;
                int i10 = cVar.d;
                if (i10 != -1) {
                    view = motionLayout.findViewById(i10);
                    if (view == null) {
                        Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + b53.M(motionLayout.getContext(), cVar.d));
                    }
                } else {
                    view = null;
                }
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    nestedScrollView.setOnTouchListener(new z00(1));
                    nestedScrollView.setOnScrollChangeListener((b64) new Object());
                }
            }
        }
    }

    public final void v() {
        this.n1.f();
        invalidate();
    }

    public final void w(int i) {
        uy0 uy0Var;
        ly0 ly0Var;
        uy0 uy0Var2;
        setState(a.SETUP);
        this.t0 = i;
        this.s0 = -1;
        this.u0 = -1;
        ny0 ny0Var = this.i0;
        if (ny0Var != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) ny0Var.c;
            SparseArray sparseArray = (SparseArray) ny0Var.d;
            int i2 = ny0Var.a;
            int i3 = 0;
            if (i2 == i) {
                if (i == -1) {
                    ly0Var = (ly0) sparseArray.valueAt(0);
                } else {
                    ly0Var = (ly0) sparseArray.get(i2);
                }
                int i4 = ny0Var.b;
                if (i4 == -1 || !((my0) ly0Var.b.get(i4)).a(-1.0f, -1.0f)) {
                    ArrayList arrayList = ly0Var.b;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (((my0) arrayList.get(i3)).a(-1.0f, -1.0f)) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    ArrayList arrayList2 = ly0Var.b;
                    if (ny0Var.b != i3) {
                        if (i3 == -1) {
                            uy0Var2 = null;
                        } else {
                            uy0Var2 = ((my0) arrayList2.get(i3)).f;
                        }
                        if (i3 != -1) {
                            int i5 = ((my0) arrayList2.get(i3)).e;
                        }
                        if (uy0Var2 != null) {
                            ny0Var.b = i3;
                            uy0Var2.b(constraintLayout);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            ny0Var.a = i;
            ly0 ly0Var2 = (ly0) sparseArray.get(i);
            ArrayList arrayList3 = ly0Var2.b;
            while (true) {
                if (i3 < arrayList3.size()) {
                    if (((my0) arrayList3.get(i3)).a(-1.0f, -1.0f)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            ArrayList arrayList4 = ly0Var2.b;
            if (i3 == -1) {
                uy0Var = ly0Var2.d;
            } else {
                uy0Var = ((my0) arrayList4.get(i3)).f;
            }
            if (i3 != -1) {
                int i6 = ((my0) arrayList4.get(i3)).e;
            }
            if (uy0Var == null) {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =-1.0, -1.0");
                return;
            }
            ny0Var.b = i3;
            uy0Var.b(constraintLayout);
            return;
        }
        b bVar = this.o0;
        if (bVar != null) {
            bVar.b(i).b(this);
        }
    }

    public final void x(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.i1 == null) {
                this.i1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            androidx.constraintlayout.motion.widget.a aVar = this.i1;
            aVar.c = i;
            aVar.d = i2;
            return;
        }
        b bVar = this.o0;
        if (bVar != null) {
            this.s0 = i;
            this.u0 = i2;
            bVar.m(i, i2);
            this.n1.e(this.o0.b(i), this.o0.b(i2));
            v();
            this.C0 = RecyclerView.A1;
            p(RecyclerView.A1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r20 != 7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if ((((r19 * r5) - (((r2 * r5) * r5) / 2.0f)) + r1) > 1.0f) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        if ((((((r2 * r5) * r5) / 2.0f) + (r19 * r5)) + r1) < androidx.recyclerview.widget.RecyclerView.A1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r1 = r17.C0;
        r2 = r17.o0.f();
        r9.a = r19;
        r9.b = r1;
        r9.c = r2;
        r17.p0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        r2 = r17.C0;
        r5 = r17.A0;
        r6 = r17.o0.f();
        r1 = r17.o0.c;
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
        r17.K0.b(r2, r3, r19, r5, r6, r7);
        r17.r0 = androidx.recyclerview.widget.RecyclerView.A1;
        r1 = r17.t0;
        r17.E0 = r3;
        r17.t0 = r1;
        r17.p0 = r8;
     */
    /* JADX WARN: Type inference failed for: r10v3, types: [tc6, java.lang.Object] */
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

    public final void z(int i) {
        int i2;
        float f;
        float alpha;
        sb sbVar;
        if (!isAttachedToWindow()) {
            if (this.i1 == null) {
                this.i1 = new androidx.constraintlayout.motion.widget.a(this);
            }
            this.i1.d = i;
            return;
        }
        b bVar = this.o0;
        if (bVar != null && (sbVar = bVar.b) != null) {
            int i3 = this.t0;
            te6 te6Var = (te6) ((SparseArray) sbVar.L).get(i);
            if (te6Var == null) {
                i3 = i;
            } else {
                ArrayList arrayList = te6Var.b;
                int i4 = te6Var.c;
                if (i4 != i3) {
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            if (i3 == ((ue6) obj).e) {
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
        int i6 = this.t0;
        if (i6 == i) {
            return;
        }
        if (this.s0 == i) {
            p(RecyclerView.A1);
        } else if (this.u0 == i) {
            p(1.0f);
        } else {
            this.u0 = i;
            if (i6 != -1) {
                x(i6, i);
                p(1.0f);
                this.C0 = RecyclerView.A1;
                p(1.0f);
                this.j1 = null;
                return;
            }
            this.J0 = false;
            this.E0 = 1.0f;
            this.B0 = RecyclerView.A1;
            this.C0 = RecyclerView.A1;
            this.D0 = getNanoTime();
            this.z0 = getNanoTime();
            this.F0 = false;
            this.p0 = null;
            b bVar2 = this.o0;
            zz3 zz3Var = bVar2.c;
            if (zz3Var != null) {
                i2 = zz3Var.h;
            } else {
                i2 = bVar2.j;
            }
            this.A0 = i2 / 1000.0f;
            this.s0 = -1;
            bVar2.m(-1, this.u0);
            SparseArray sparseArray = new SparseArray();
            int childCount = getChildCount();
            HashMap hashMap = this.y0;
            hashMap.clear();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                hashMap.put(childAt, new lz3(childAt));
                sparseArray.put(childAt.getId(), (lz3) hashMap.get(childAt));
            }
            this.G0 = true;
            uy0 b = this.o0.b(i);
            uz3 uz3Var = this.n1;
            uz3Var.e(null, b);
            v();
            uz3Var.a();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                lz3 lz3Var = (lz3) hashMap.get(childAt2);
                if (lz3Var != null) {
                    wz3 wz3Var = lz3Var.f;
                    wz3Var.L = RecyclerView.A1;
                    wz3Var.R = RecyclerView.A1;
                    wz3Var.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                    jz3 jz3Var = lz3Var.h;
                    jz3Var.getClass();
                    childAt2.getX();
                    childAt2.getY();
                    childAt2.getWidth();
                    childAt2.getHeight();
                    jz3Var.L = childAt2.getVisibility();
                    if (childAt2.getVisibility() != 0) {
                        alpha = 0.0f;
                    } else {
                        alpha = childAt2.getAlpha();
                    }
                    jz3Var.X = alpha;
                    jz3Var.Y = childAt2.getElevation();
                    jz3Var.Z = childAt2.getRotation();
                    jz3Var.c0 = childAt2.getRotationX();
                    jz3Var.A = childAt2.getRotationY();
                    jz3Var.d0 = childAt2.getScaleX();
                    jz3Var.e0 = childAt2.getScaleY();
                    jz3Var.f0 = childAt2.getPivotX();
                    jz3Var.g0 = childAt2.getPivotY();
                    jz3Var.h0 = childAt2.getTranslationX();
                    jz3Var.i0 = childAt2.getTranslationY();
                    jz3Var.j0 = childAt2.getTranslationZ();
                }
            }
            int width = getWidth();
            int height = getHeight();
            for (int i9 = 0; i9 < childCount; i9++) {
                lz3 lz3Var2 = (lz3) hashMap.get(getChildAt(i9));
                if (lz3Var2 != null) {
                    this.o0.e(lz3Var2);
                    lz3Var2.g(getNanoTime(), width, height);
                }
            }
            zz3 zz3Var2 = this.o0.c;
            if (zz3Var2 != null) {
                f = zz3Var2.i;
            } else {
                f = 0.0f;
            }
            if (f != RecyclerView.A1) {
                float f2 = Float.MAX_VALUE;
                float f3 = -3.4028235E38f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    wz3 wz3Var2 = ((lz3) hashMap.get(getChildAt(i10))).g;
                    float f4 = wz3Var2.Y + wz3Var2.X;
                    f2 = Math.min(f2, f4);
                    f3 = Math.max(f3, f4);
                }
                for (int i11 = 0; i11 < childCount; i11++) {
                    lz3 lz3Var3 = (lz3) hashMap.get(getChildAt(i11));
                    wz3 wz3Var3 = lz3Var3.g;
                    float f5 = wz3Var3.X;
                    float f6 = wz3Var3.Y;
                    lz3Var3.n = 1.0f / (1.0f - f);
                    lz3Var3.m = f - ((((f5 + f6) - f2) * f) / (f3 - f2));
                }
            }
            this.B0 = RecyclerView.A1;
            this.C0 = RecyclerView.A1;
            this.G0 = true;
            invalidate();
        }
    }

    public void setOnHide(float f) {
    }

    public void setOnShow(float f) {
    }

    public void setTransitionListener(vz3 vz3Var) {
    }

    public void setTransition(zz3 zz3Var) {
        c cVar;
        b bVar = this.o0;
        bVar.c = zz3Var;
        if (zz3Var != null && (cVar = zz3Var.l) != null) {
            cVar.c(bVar.p);
        }
        setState(a.SETUP);
        int i = this.t0;
        zz3 zz3Var2 = this.o0.c;
        if (i == (zz3Var2 == null ? -1 : zz3Var2.c)) {
            this.C0 = 1.0f;
            this.B0 = 1.0f;
            this.E0 = 1.0f;
        } else {
            this.C0 = RecyclerView.A1;
            this.B0 = RecyclerView.A1;
            this.E0 = RecyclerView.A1;
        }
        this.D0 = (zz3Var.r & 1) != 0 ? -1L : getNanoTime();
        int g = this.o0.g();
        b bVar2 = this.o0;
        zz3 zz3Var3 = bVar2.c;
        int i2 = zz3Var3 != null ? zz3Var3.c : -1;
        if (g == this.s0 && i2 == this.u0) {
            return;
        }
        this.s0 = g;
        this.u0 = i2;
        bVar2.m(g, i2);
        uy0 b = this.o0.b(this.s0);
        uy0 b2 = this.o0.b(this.u0);
        uz3 uz3Var = this.n1;
        uz3Var.e(b, b2);
        int i3 = this.s0;
        int i4 = this.u0;
        uz3Var.e = i3;
        uz3Var.f = i4;
        uz3Var.f();
        v();
    }

    @Override // defpackage.e64
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
