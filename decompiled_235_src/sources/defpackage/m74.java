package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m74  reason: default package */
/* loaded from: classes.dex */
public final class m74 {
    public rh3[] A;
    public final View b;
    public final int c;
    public ak7[] j;
    public wt k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap x;
    public HashMap y;
    public HashMap z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final y74 f = new y74();
    public final y74 g = new y74();
    public final k74 h = new k74();
    public final k74 i = new k74();
    public float l = Float.NaN;
    public float m = RecyclerView.B1;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList u = new ArrayList();
    public final float[] v = new float[1];
    public final ArrayList w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public m74(View view) {
        this.b = view;
        this.c = view.getId();
        view.getLayoutParams();
    }

    public static void f(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    int i4 = rect.left + rect.right;
                    rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
                    rect2.top = (i4 - rect.height()) / 2;
                    rect2.right = rect.width() + rect2.left;
                    rect2.bottom = rect.height() + rect2.top;
                    return;
                }
                int i5 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i5 / 2);
                rect2.top = i3 - ((rect.height() + i5) / 2);
                rect2.right = rect.width() + rect2.left;
                rect2.bottom = rect.height() + rect2.top;
                return;
            }
            int i6 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i6 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i3 - ((rect.height() + i7) / 2);
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f, float[] fArr) {
        float f2 = RecyclerView.B1;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.n;
            if (f4 != 1.0d) {
                float f5 = this.m;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = Math.min((f - f5) * f4, 1.0f);
                }
            }
        }
        gr1 gr1Var = this.f.A;
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        float f6 = Float.NaN;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y74 y74Var = (y74) obj;
            gr1 gr1Var2 = y74Var.A;
            if (gr1Var2 != null) {
                float f7 = y74Var.L;
                if (f7 < f) {
                    gr1Var = gr1Var2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = y74Var.L;
                }
            }
        }
        if (gr1Var != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            float a = (((float) gr1Var.a(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) gr1Var.b(d);
            }
            return a;
        }
        return f;
    }

    public final void b(double d, float[] fArr, float[] fArr2) {
        float f;
        char c;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].a0(d, dArr);
        this.j[0].d0(d, dArr2);
        float f2 = RecyclerView.B1;
        Arrays.fill(fArr2, (float) RecyclerView.B1);
        int[] iArr = this.o;
        y74 y74Var = this.f;
        float f3 = y74Var.X;
        float f4 = y74Var.Y;
        float f5 = y74Var.Z;
        float f6 = y74Var.d0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int i = 0;
        while (i < iArr.length) {
            double[] dArr3 = dArr;
            float f10 = (float) dArr3[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        c = 4;
                        if (i2 == 4) {
                            f6 = f10;
                            f9 = f11;
                        }
                    } else {
                        c = 4;
                        f5 = f10;
                        f8 = f11;
                    }
                } else {
                    c = 4;
                    f4 = f10;
                    f2 = f11;
                }
            } else {
                c = 4;
                f3 = f10;
                f7 = f11;
            }
            i++;
            dArr = dArr3;
        }
        float f12 = (f8 / 2.0f) + f7;
        float f13 = (f9 / 2.0f) + f2;
        m74 m74Var = y74Var.i0;
        if (m74Var != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            m74Var.b(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float cos = (float) ((f15 - (Math.cos(d3) * d2)) - (f6 / 2.0f));
            double d4 = f7;
            f = 2.0f;
            double d5 = f2;
            float cos2 = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + f16);
            double sin = Math.sin(d3) * d5;
            f3 = (float) (((Math.sin(d3) * d2) + f14) - (f5 / 2.0f));
            f4 = cos;
            f12 = cos2;
            f13 = (float) (sin + (f17 - (Math.cos(d3) * d4)));
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + RecyclerView.B1;
        fArr[1] = (f6 / f) + f4 + RecyclerView.B1;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public final float c() {
        float f;
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float f2 = RecyclerView.B1;
        for (int i = 0; i < 100; i++) {
            float f3 = i * 0.01010101f;
            double d3 = f3;
            gr1 gr1Var = this.f.A;
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            float f4 = Float.NaN;
            int i2 = 0;
            float f5 = RecyclerView.B1;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                int i3 = i2 + 1;
                y74 y74Var = (y74) obj;
                gr1 gr1Var2 = y74Var.A;
                if (gr1Var2 != null) {
                    float f6 = y74Var.L;
                    if (f6 < f3) {
                        f5 = f6;
                        gr1Var = gr1Var2;
                    } else if (Float.isNaN(f4)) {
                        f4 = y74Var.L;
                    }
                }
                i2 = i3;
            }
            if (gr1Var != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d3 = (((float) gr1Var.a((f3 - f5) / f)) * (f4 - f5)) + f5;
            }
            this.j[0].a0(d3, this.p);
            this.f.c(d3, this.o, this.p, fArr, 0);
            if (i > 0) {
                f2 += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return f2;
    }

    public final boolean d(float f, long j, ng3 ng3Var, View view) {
        boolean z;
        View view2;
        boolean z2;
        float f2;
        up7 up7Var;
        float f3;
        boolean z3;
        float f4;
        View view3;
        float f5;
        float f6;
        boolean z4;
        float f7;
        View view4 = view;
        up7 up7Var2 = null;
        float a = a(f, null);
        int i = this.E;
        if (i != -1) {
            float f8 = 1.0f / i;
            float floor = ((float) Math.floor(a / f8)) * f8;
            float f9 = (a % f8) / f8;
            if (!Float.isNaN(this.F)) {
                f9 = (f9 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            if (interpolator != null) {
                f7 = interpolator.getInterpolation(f9);
            } else if (f9 > 0.5d) {
                f7 = 1.0f;
            } else {
                f7 = RecyclerView.B1;
            }
            a = (f7 * f8) + floor;
        }
        HashMap hashMap = this.y;
        if (hashMap != null) {
            for (qp7 qp7Var : hashMap.values()) {
                qp7Var.c(view4, a);
            }
        }
        HashMap hashMap2 = this.x;
        if (hashMap2 != null) {
            up7 up7Var3 = null;
            z = false;
            for (wp7 wp7Var : hashMap2.values()) {
                if (wp7Var instanceof up7) {
                    up7Var3 = (up7) wp7Var;
                } else {
                    z |= wp7Var.d(a, j, ng3Var, view4);
                    view4 = view;
                }
            }
            up7Var2 = up7Var3;
        } else {
            z = false;
        }
        ak7[] ak7VarArr = this.j;
        y74 y74Var = this.f;
        if (ak7VarArr != null) {
            double d = a;
            ak7VarArr[0].a0(d, this.p);
            this.j[0].d0(d, this.q);
            wt wtVar = this.k;
            if (wtVar != null) {
                double[] dArr = this.p;
                f2 = RecyclerView.B1;
                if (dArr.length > 0) {
                    wtVar.a0(d, dArr);
                    this.k.d0(d, this.q);
                }
            } else {
                f2 = RecyclerView.B1;
            }
            if (!this.H) {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f4 = 2.0f;
                double[] dArr3 = this.q;
                f3 = 1.0f;
                boolean z5 = this.d;
                float f10 = y74Var.X;
                float f11 = y74Var.Y;
                float f12 = y74Var.Z;
                int i2 = 1;
                float f13 = y74Var.d0;
                up7Var = up7Var2;
                if (iArr.length != 0) {
                    f5 = f12;
                    if (y74Var.l0.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        y74Var.l0 = new double[i3];
                        y74Var.m0 = new double[i3];
                    }
                } else {
                    f5 = f12;
                }
                Arrays.fill(y74Var.l0, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = y74Var.l0;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    y74Var.m0[i5] = dArr3[i4];
                }
                float f14 = Float.NaN;
                float f15 = f2;
                float f16 = f15;
                float f17 = f16;
                int i6 = 0;
                float f18 = f5;
                float f19 = f17;
                while (true) {
                    double[] dArr5 = y74Var.l0;
                    f6 = f13;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        z4 = z;
                    } else {
                        double d2 = 0.0d;
                        if (!Double.isNaN(y74Var.l0[i6])) {
                            d2 = y74Var.l0[i6] + 0.0d;
                        }
                        float f20 = (float) d2;
                        z4 = z;
                        float f21 = (float) y74Var.m0[i6];
                        if (i6 != i2) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    if (i6 != 4) {
                                        if (i6 == 5) {
                                            f14 = f20;
                                        }
                                    } else {
                                        f13 = f20;
                                        f17 = f21;
                                        i6++;
                                        z = z4;
                                        i2 = 1;
                                    }
                                } else {
                                    f18 = f20;
                                    f19 = f21;
                                }
                            } else {
                                f11 = f20;
                                f16 = f21;
                            }
                        } else {
                            f10 = f20;
                            f15 = f21;
                        }
                    }
                    f13 = f6;
                    i6++;
                    z = z4;
                    i2 = 1;
                }
                z3 = z;
                m74 m74Var = y74Var.i0;
                if (m74Var != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    m74Var.b(d, fArr, fArr2);
                    float f22 = fArr[0];
                    float f23 = fArr[1];
                    float f24 = fArr2[0];
                    float f25 = fArr2[1];
                    double d3 = f10;
                    double d4 = f11;
                    float sin = (float) (((Math.sin(d4) * d3) + f22) - (f18 / 2.0f));
                    float cos = (float) ((f23 - (Math.cos(d4) * d3)) - (f6 / 2.0f));
                    double d5 = f15;
                    double d6 = f16;
                    float cos2 = (float) ((Math.cos(d4) * d3 * d6) + (Math.sin(d4) * d5) + f24);
                    float sin2 = (float) ((Math.sin(d4) * d3 * d6) + (f25 - (Math.cos(d4) * d5)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos2;
                        dArr3[1] = sin2;
                    }
                    if (!Float.isNaN(f14)) {
                        double degrees = Math.toDegrees(Math.atan2(sin2, cos2));
                        view2 = view;
                        view2.setRotation((float) (degrees + f14));
                    } else {
                        view2 = view;
                    }
                    f10 = sin;
                    f11 = cos;
                } else {
                    view2 = view;
                    if (!Float.isNaN(f14)) {
                        view2.setRotation(f14 + ((float) Math.toDegrees(Math.atan2((f17 / 2.0f) + f16, (f19 / 2.0f) + f15))) + f2);
                    }
                }
                float f26 = f10 + 0.5f;
                int i7 = (int) f26;
                float f27 = f11 + 0.5f;
                int i8 = (int) f27;
                int i9 = (int) (f26 + f18);
                int i10 = (int) (f27 + f6);
                int i11 = i9 - i7;
                int i12 = i10 - i8;
                if (i11 != view2.getMeasuredWidth() || i12 != view2.getMeasuredHeight() || z5) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                }
                view2.layout(i7, i8, i9, i10);
                this.d = false;
            } else {
                view2 = view;
                up7Var = up7Var2;
                f3 = 1.0f;
                z3 = z;
                f4 = 2.0f;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view2.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + view3.getTop()) / f4;
                    float right = (this.D.getRight() + this.D.getLeft()) / f4;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(right - view2.getLeft());
                        view2.setPivotY(bottom - view2.getTop());
                    }
                }
            }
            HashMap hashMap3 = this.y;
            if (hashMap3 != null) {
                for (qp7 qp7Var2 : hashMap3.values()) {
                    if (qp7Var2 instanceof op7) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((op7) qp7Var2).a(a) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (up7Var != null) {
                double[] dArr7 = this.q;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                up7 up7Var4 = up7Var;
                view2.setRotation(up7Var4.b(a, j, ng3Var, view2) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z2 = z3 | up7Var4.h;
            } else {
                z2 = z3;
            }
            int i13 = 1;
            while (true) {
                ak7[] ak7VarArr2 = this.j;
                if (i13 >= ak7VarArr2.length) {
                    break;
                }
                ak7 ak7Var = ak7VarArr2[i13];
                float[] fArr3 = this.t;
                ak7Var.b0(d, fArr3);
                l.M((j11) y74Var.j0.get(this.r[i13 - 1]), view2, fArr3);
                i13++;
            }
            k74 k74Var = this.h;
            if (k74Var.B == 0) {
                if (a <= f2) {
                    view2.setVisibility(k74Var.L);
                } else {
                    int i14 = (a > f3 ? 1 : (a == f3 ? 0 : -1));
                    k74 k74Var2 = this.i;
                    if (i14 >= 0) {
                        view2.setVisibility(k74Var2.L);
                    } else if (k74Var2.L != k74Var.L) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i15 = 0;
                while (true) {
                    rh3[] rh3VarArr = this.A;
                    if (i15 >= rh3VarArr.length) {
                        break;
                    }
                    rh3VarArr[i15].g(view2, a);
                    i15++;
                }
            }
        } else {
            view2 = view;
            boolean z6 = z;
            float f28 = y74Var.X;
            y74 y74Var2 = this.g;
            float a2 = i61.a(y74Var2.X, f28, a, f28);
            float f29 = y74Var.Y;
            float a3 = i61.a(y74Var2.Y, f29, a, f29);
            float f30 = y74Var.Z;
            float f31 = y74Var2.Z;
            float a4 = i61.a(f31, f30, a, f30);
            float f32 = y74Var.d0;
            float f33 = y74Var2.d0;
            float f34 = a2 + 0.5f;
            int i16 = (int) f34;
            float f35 = a3 + 0.5f;
            int i17 = (int) f35;
            int i18 = (int) (f34 + a4);
            int a5 = (int) (f35 + i61.a(f33, f32, a, f32));
            int i19 = i18 - i16;
            int i20 = a5 - i17;
            if (f31 != f30 || f33 != f32 || this.d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                this.d = false;
            }
            view2.layout(i16, i17, i18, a5);
            z2 = z6;
        }
        HashMap hashMap4 = this.z;
        if (hashMap4 != null) {
            for (hp7 hp7Var : hashMap4.values()) {
                if (hp7Var instanceof fp7) {
                    double[] dArr8 = this.q;
                    view2.setRotation(((fp7) hp7Var).a(a) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    hp7Var.d(view2, a);
                }
            }
        }
        return z2;
    }

    public final void e(y74 y74Var) {
        y74Var.d((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0d87  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v38, types: [vp7, wp7] */
    /* JADX WARN: Type inference failed for: r13v43, types: [wp7] */
    /* JADX WARN: Type inference failed for: r15v15, types: [y74, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v105, types: [np7, qp7] */
    /* JADX WARN: Type inference failed for: r4v66, types: [tp7, wp7] */
    /* JADX WARN: Type inference failed for: r5v106, types: [pp7, qp7] */
    /* JADX WARN: Type inference failed for: r5v114, types: [qp7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j, int i, int i2) {
        String str;
        Object obj;
        ArrayList arrayList;
        HashSet hashSet;
        HashSet hashSet2;
        Object obj2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        HashSet hashSet3;
        Object obj3;
        Object obj4;
        ArrayList arrayList2;
        y74 y74Var;
        Object obj5;
        y74 y74Var2;
        String str7;
        boolean z;
        y74 y74Var3;
        int i3;
        String str8;
        int i4;
        float[] fArr;
        int c;
        int i5;
        j11 j11Var;
        String str9;
        HashSet hashSet4;
        int i6;
        HashMap hashMap;
        Iterator it;
        String str10;
        Object obj6;
        Object obj7;
        Object obj8;
        char c2;
        char c3;
        String str11;
        sp7 sp7Var;
        Object obj9;
        sp7 sp7Var2;
        sp7 sp7Var3;
        j11 j11Var2;
        int i7;
        Integer num;
        HashSet hashSet5;
        HashSet hashSet6;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Iterator it2;
        Object obj10;
        HashSet hashSet7;
        Object obj11;
        y74 y74Var4;
        Object obj12;
        y74 y74Var5;
        Object obj13;
        ArrayList arrayList3;
        Object obj14;
        char c4;
        char c5;
        Object obj15;
        mp7 mp7Var;
        j11 j11Var3;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        ArrayList arrayList4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        int binarySearch;
        int i8;
        float f32;
        float f33;
        float f34;
        float min;
        float f35;
        float f36;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap hashMap2 = new HashMap();
        int i9 = this.B;
        y74 y74Var6 = this.f;
        if (i9 != -1) {
            y74Var6.f0 = i9;
        }
        k74 k74Var = this.h;
        float f37 = k74Var.X;
        k74 k74Var2 = this.i;
        String str22 = "alpha";
        if (k74.b(f37, k74Var2.X)) {
            hashSet9.add("alpha");
        }
        String str23 = "elevation";
        if (k74.b(k74Var.Y, k74Var2.Y)) {
            hashSet9.add("elevation");
        }
        int i10 = k74Var.L;
        int i11 = k74Var2.L;
        if (i10 != i11 && k74Var.B == 0 && (i10 == 0 || i11 == 0)) {
            hashSet9.add("alpha");
        }
        String str24 = "rotation";
        if (k74.b(k74Var.Z, k74Var2.Z)) {
            hashSet9.add("rotation");
        }
        String str25 = "transitionPathRotate";
        if (!Float.isNaN(k74Var.l0) || !Float.isNaN(k74Var2.l0)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(k74Var.m0) || !Float.isNaN(k74Var2.m0)) {
            hashSet9.add("progress");
        }
        if (k74.b(k74Var.d0, k74Var2.d0)) {
            hashSet9.add("rotationX");
        }
        if (k74.b(k74Var.A, k74Var2.A)) {
            hashSet9.add("rotationY");
        }
        Object obj16 = "rotationX";
        if (k74.b(k74Var.g0, k74Var2.g0)) {
            hashSet9.add("transformPivotX");
        }
        if (k74.b(k74Var.h0, k74Var2.h0)) {
            hashSet9.add("transformPivotY");
        }
        if (k74.b(k74Var.e0, k74Var2.e0)) {
            hashSet9.add("scaleX");
        }
        Object obj17 = "rotationY";
        String str26 = "scaleY";
        if (k74.b(k74Var.f0, k74Var2.f0)) {
            hashSet9.add("scaleY");
        }
        Object obj18 = "progress";
        if (k74.b(k74Var.i0, k74Var2.i0)) {
            hashSet9.add("translationX");
        }
        Object obj19 = "translationX";
        if (k74.b(k74Var.j0, k74Var2.j0)) {
            hashSet9.add("translationY");
        }
        if (k74.b(k74Var.k0, k74Var2.k0)) {
            hashSet9.add("translationZ");
        }
        y74 y74Var7 = this.g;
        ArrayList arrayList5 = this.u;
        ArrayList arrayList6 = this.w;
        Object obj20 = "translationY";
        if (arrayList6 == null) {
            str = "scaleY";
            obj = "scaleX";
            arrayList = null;
        } else {
            int size = arrayList6.size();
            obj = "scaleX";
            int i12 = 0;
            ArrayList arrayList7 = null;
            while (i12 < size) {
                Object obj21 = arrayList6.get(i12);
                int i13 = i12 + 1;
                int i14 = size;
                jg3 jg3Var = (jg3) obj21;
                if (jg3Var instanceof gh3) {
                    gh3 gh3Var = (gh3) jg3Var;
                    ?? obj22 = new Object();
                    str17 = str26;
                    obj22.B = 0;
                    obj22.e0 = Float.NaN;
                    obj22.f0 = -1;
                    obj22.g0 = -1;
                    obj22.h0 = Float.NaN;
                    obj22.i0 = null;
                    obj22.j0 = new LinkedHashMap();
                    obj22.k0 = 0;
                    str20 = str24;
                    obj22.l0 = new double[18];
                    obj22.m0 = new double[18];
                    if (y74Var6.g0 != -1) {
                        float f38 = gh3Var.a / 100.0f;
                        obj22.L = f38;
                        obj22.B = gh3Var.h;
                        obj22.k0 = gh3Var.m;
                        if (Float.isNaN(gh3Var.i)) {
                            f32 = f38;
                        } else {
                            f32 = gh3Var.i;
                        }
                        str19 = str23;
                        if (Float.isNaN(gh3Var.j)) {
                            f33 = f38;
                        } else {
                            f33 = gh3Var.j;
                        }
                        str21 = str25;
                        float f39 = y74Var7.Z - y74Var6.Z;
                        float f40 = y74Var7.d0;
                        float f41 = y74Var6.d0;
                        obj22.R = obj22.L;
                        obj22.Z = (int) ((f39 * f32) + f34);
                        obj22.d0 = (int) (((f40 - f41) * f33) + f41);
                        int i15 = gh3Var.m;
                        str18 = str22;
                        float f42 = gh3Var.k;
                        if (i15 != 2) {
                            if (Float.isNaN(f42)) {
                                f36 = f38;
                            } else {
                                f36 = gh3Var.k;
                            }
                            float f43 = y74Var7.X;
                            float f44 = y74Var6.X;
                            obj22.X = i61.a(f43, f44, f36, f44);
                            if (!Float.isNaN(gh3Var.l)) {
                                f38 = gh3Var.l;
                            }
                            float f45 = y74Var7.Y;
                            float f46 = y74Var6.Y;
                            obj22.Y = i61.a(f45, f46, f38, f46);
                        } else {
                            if (Float.isNaN(f42)) {
                                float f47 = y74Var7.X;
                                float f48 = y74Var6.X;
                                min = i61.a(f47, f48, f38, f48);
                            } else {
                                min = gh3Var.k * Math.min(f33, f32);
                            }
                            obj22.X = min;
                            if (Float.isNaN(gh3Var.l)) {
                                float f49 = y74Var7.Y;
                                float f50 = y74Var6.Y;
                                f35 = i61.a(f49, f50, f38, f50);
                            } else {
                                f35 = gh3Var.l;
                            }
                            obj22.Y = f35;
                        }
                        obj22.g0 = y74Var6.g0;
                        obj22.A = gr1.c(gh3Var.f);
                        obj22.f0 = gh3Var.g;
                    } else {
                        str18 = str22;
                        str19 = str23;
                        str21 = str25;
                        int i16 = gh3Var.m;
                        int i17 = gh3Var.a;
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    float f51 = i17 / 100.0f;
                                    obj22.L = f51;
                                    obj22.B = gh3Var.h;
                                    if (Float.isNaN(gh3Var.i)) {
                                        f23 = f51;
                                    } else {
                                        f23 = gh3Var.i;
                                    }
                                    if (Float.isNaN(gh3Var.j)) {
                                        f24 = f51;
                                    } else {
                                        f24 = gh3Var.j;
                                    }
                                    float f52 = y74Var7.Z;
                                    float f53 = y74Var6.Z;
                                    float f54 = f52 - f53;
                                    float f55 = y74Var7.d0;
                                    float f56 = y74Var6.d0;
                                    float f57 = f55 - f56;
                                    obj22.R = obj22.L;
                                    float f58 = (f53 / 2.0f) + y74Var6.X;
                                    float f59 = y74Var6.Y;
                                    float f60 = ((f52 / 2.0f) + y74Var7.X) - f58;
                                    float f61 = ((f55 / 2.0f) + y74Var7.Y) - ((f56 / 2.0f) + f59);
                                    float f62 = (f54 * f23) / 2.0f;
                                    obj22.X = (int) (((f60 * f51) + f25) - f62);
                                    float f63 = (f57 * f24) / 2.0f;
                                    obj22.Y = (int) (((f61 * f51) + f59) - f63);
                                    obj22.Z = (int) (f53 + f26);
                                    obj22.d0 = (int) (f56 + f27);
                                    if (Float.isNaN(gh3Var.k)) {
                                        f28 = f51;
                                    } else {
                                        f28 = gh3Var.k;
                                    }
                                    if (Float.isNaN(Float.NaN)) {
                                        f29 = RecyclerView.B1;
                                    } else {
                                        f29 = Float.NaN;
                                    }
                                    float f64 = f28;
                                    if (Float.isNaN(gh3Var.l)) {
                                        f30 = f51;
                                    } else {
                                        f30 = gh3Var.l;
                                    }
                                    if (Float.isNaN(Float.NaN)) {
                                        f31 = RecyclerView.B1;
                                    } else {
                                        f31 = Float.NaN;
                                    }
                                    float f65 = f30;
                                    obj22.k0 = 0;
                                    obj22.X = (int) (((f31 * f61) + ((f64 * f60) + y74Var6.X)) - f62);
                                    obj22.Y = (int) (((f61 * f65) + ((f60 * f29) + y74Var6.Y)) - f63);
                                    obj22.A = gr1.c(gh3Var.f);
                                    obj22.f0 = gh3Var.g;
                                } else {
                                    float f66 = i17 / 100.0f;
                                    obj22.L = f66;
                                    obj22.B = gh3Var.h;
                                    if (Float.isNaN(gh3Var.i)) {
                                        f13 = f66;
                                    } else {
                                        f13 = gh3Var.i;
                                    }
                                    if (Float.isNaN(gh3Var.j)) {
                                        f14 = f66;
                                    } else {
                                        f14 = gh3Var.j;
                                    }
                                    float f67 = y74Var7.Z;
                                    float f68 = y74Var6.Z;
                                    float f69 = f67 - f68;
                                    float f70 = y74Var7.d0;
                                    float f71 = y74Var6.d0;
                                    float f72 = f70 - f71;
                                    obj22.R = obj22.L;
                                    float f73 = (f68 / 2.0f) + y74Var6.X;
                                    float f74 = (f71 / 2.0f) + y74Var6.Y;
                                    float f75 = (f67 / 2.0f) + y74Var7.X;
                                    float f76 = (f70 / 2.0f) + y74Var7.Y;
                                    if (f73 > f75) {
                                        f73 = f75;
                                        f75 = f73;
                                    }
                                    if (f74 <= f76) {
                                        f74 = f76;
                                        f76 = f74;
                                    }
                                    float f77 = f75 - f73;
                                    float f78 = f74 - f76;
                                    float f79 = (f69 * f13) / 2.0f;
                                    obj22.X = (int) (((f77 * f66) + f15) - f79);
                                    float f80 = (f72 * f14) / 2.0f;
                                    obj22.Y = (int) (((f78 * f66) + f16) - f80);
                                    obj22.Z = (int) (f68 + f17);
                                    obj22.d0 = (int) (f71 + f18);
                                    if (Float.isNaN(gh3Var.k)) {
                                        f19 = f66;
                                    } else {
                                        f19 = gh3Var.k;
                                    }
                                    if (Float.isNaN(Float.NaN)) {
                                        f20 = RecyclerView.B1;
                                    } else {
                                        f20 = Float.NaN;
                                    }
                                    float f81 = f19;
                                    if (Float.isNaN(gh3Var.l)) {
                                        f21 = f66;
                                    } else {
                                        f21 = gh3Var.l;
                                    }
                                    if (Float.isNaN(Float.NaN)) {
                                        f22 = RecyclerView.B1;
                                    } else {
                                        f22 = Float.NaN;
                                    }
                                    float f82 = f21;
                                    obj22.k0 = 0;
                                    obj22.X = (int) (((f22 * f78) + ((f81 * f77) + y74Var6.X)) - f79);
                                    obj22.Y = (int) (((f78 * f82) + ((f77 * f20) + y74Var6.Y)) - f80);
                                    obj22.A = gr1.c(gh3Var.f);
                                    obj22.f0 = gh3Var.g;
                                }
                            } else {
                                float f83 = i17 / 100.0f;
                                obj22.L = f83;
                                obj22.B = gh3Var.h;
                                if (Float.isNaN(gh3Var.i)) {
                                    f8 = f83;
                                } else {
                                    f8 = gh3Var.i;
                                }
                                if (Float.isNaN(gh3Var.j)) {
                                    f9 = f83;
                                } else {
                                    f9 = gh3Var.j;
                                }
                                float f84 = y74Var7.Z;
                                float f85 = y74Var6.Z;
                                float f86 = y74Var7.d0 - y74Var6.d0;
                                obj22.R = obj22.L;
                                float f87 = (f85 / 2.0f) + y74Var6.X;
                                float f88 = y74Var6.Y;
                                float f89 = (f84 - f85) * f8;
                                obj22.X = (int) ((((((f84 / 2.0f) + y74Var7.X) - f87) * f83) + f12) - (f89 / 2.0f));
                                float f90 = f86 * f9;
                                obj22.Y = (int) ((((((f10 / 2.0f) + y74Var7.Y) - ((f11 / 2.0f) + f88)) * f83) + f88) - (f90 / 2.0f));
                                obj22.Z = (int) (f85 + f89);
                                obj22.d0 = (int) (f11 + f90);
                                obj22.k0 = 2;
                                if (!Float.isNaN(gh3Var.k)) {
                                    obj22.X = (int) (gh3Var.k * (i - ((int) obj22.Z)));
                                }
                                if (!Float.isNaN(gh3Var.l)) {
                                    obj22.Y = (int) (gh3Var.l * (i2 - ((int) obj22.d0)));
                                }
                                obj22.g0 = obj22.g0;
                                obj22.A = gr1.c(gh3Var.f);
                                obj22.f0 = gh3Var.g;
                            }
                        } else {
                            float f91 = i17 / 100.0f;
                            obj22.L = f91;
                            obj22.B = gh3Var.h;
                            if (Float.isNaN(gh3Var.i)) {
                                f = f91;
                            } else {
                                f = gh3Var.i;
                            }
                            if (Float.isNaN(gh3Var.j)) {
                                f2 = f91;
                            } else {
                                f2 = gh3Var.j;
                            }
                            float f92 = y74Var7.Z - y74Var6.Z;
                            float f93 = f91;
                            float f94 = y74Var7.d0 - y74Var6.d0;
                            obj22.R = obj22.L;
                            if (!Float.isNaN(gh3Var.k)) {
                                f93 = gh3Var.k;
                            }
                            float f95 = (y74Var6.Z / 2.0f) + y74Var6.X;
                            float f96 = y74Var6.Y;
                            float f97 = y74Var6.d0;
                            float f98 = ((y74Var7.Z / 2.0f) + y74Var7.X) - f95;
                            float f99 = ((y74Var7.d0 / 2.0f) + y74Var7.Y) - ((f97 / 2.0f) + f96);
                            float f100 = f98 * f93;
                            float f101 = (f92 * f) / 2.0f;
                            obj22.X = (int) ((f3 + f100) - f101);
                            float f102 = f93 * f99;
                            float f103 = (f94 * f2) / 2.0f;
                            obj22.Y = (int) ((f96 + f102) - f103);
                            obj22.Z = (int) (f4 + f5);
                            obj22.d0 = (int) (f97 + f6);
                            if (Float.isNaN(gh3Var.l)) {
                                f7 = RecyclerView.B1;
                            } else {
                                f7 = gh3Var.l;
                            }
                            obj22.k0 = 1;
                            float f104 = (int) ((y74Var6.X + f100) - f101);
                            float f105 = (int) ((y74Var6.Y + f102) - f103);
                            obj22.X = f104 + ((-f99) * f7);
                            obj22.Y = f105 + (f98 * f7);
                            obj22.g0 = obj22.g0;
                            obj22.A = gr1.c(gh3Var.f);
                            obj22.f0 = gh3Var.g;
                        }
                        if (Collections.binarySearch(arrayList5, obj22) == 0) {
                            Log.e("MotionController", " KeyPath position \"" + obj22.R + "\" outside of range");
                        }
                        arrayList5.add((-binarySearch) - 1, obj22);
                        i8 = gh3Var.e;
                        if (i8 == -1) {
                            this.e = i8;
                        }
                    }
                    if (Collections.binarySearch(arrayList5, obj22) == 0) {
                    }
                    arrayList5.add((-binarySearch) - 1, obj22);
                    i8 = gh3Var.e;
                    if (i8 == -1) {
                    }
                } else {
                    str17 = str26;
                    str18 = str22;
                    str19 = str23;
                    str20 = str24;
                    str21 = str25;
                    if (jg3Var instanceof qg3) {
                        jg3Var.d(hashSet10);
                    } else if (jg3Var instanceof ph3) {
                        jg3Var.d(hashSet8);
                    } else if (jg3Var instanceof rh3) {
                        if (arrayList7 == null) {
                            arrayList4 = new ArrayList();
                        } else {
                            arrayList4 = arrayList7;
                        }
                        arrayList4.add((rh3) jg3Var);
                        arrayList7 = arrayList4;
                    } else {
                        jg3Var.f(hashMap2);
                        jg3Var.d(hashSet9);
                    }
                }
                i12 = i13;
                size = i14;
                str26 = str17;
                str24 = str20;
                str23 = str19;
                str25 = str21;
                str22 = str18;
            }
            str = str26;
            arrayList = arrayList7;
        }
        String str27 = str22;
        String str28 = str23;
        String str29 = str24;
        String str30 = str25;
        if (arrayList != null) {
            this.A = (rh3[]) arrayList.toArray(new rh3[0]);
        }
        String str31 = "CUSTOM,";
        if (!hashSet9.isEmpty()) {
            this.y = new HashMap();
            Iterator it3 = hashSet9.iterator();
            while (it3.hasNext()) {
                String str32 = (String) it3.next();
                if (str32.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str33 = str32.split(",")[1];
                    int size2 = arrayList6.size();
                    hashSet5 = hashSet8;
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj23 = arrayList6.get(i18);
                        int i19 = i18 + 1;
                        jg3 jg3Var2 = (jg3) obj23;
                        HashSet hashSet11 = hashSet10;
                        HashMap hashMap3 = jg3Var2.d;
                        if (hashMap3 != null && (j11Var3 = (j11) hashMap3.get(str33)) != null) {
                            sparseArray.append(jg3Var2.a, j11Var3);
                        }
                        hashSet10 = hashSet11;
                        i18 = i19;
                    }
                    hashSet6 = hashSet10;
                    ?? qp7Var = new qp7();
                    String str34 = str32.split(",")[1];
                    qp7Var.f = sparseArray;
                    str12 = str;
                    str13 = str29;
                    str14 = str28;
                    str15 = str30;
                    it2 = it3;
                    obj15 = obj19;
                    obj10 = obj;
                    hashSet7 = hashSet9;
                    arrayList3 = arrayList5;
                    obj11 = obj18;
                    mp7Var = qp7Var;
                    y74Var4 = y74Var6;
                    obj12 = obj20;
                    str16 = str27;
                    y74Var5 = y74Var7;
                } else {
                    hashSet5 = hashSet8;
                    hashSet6 = hashSet10;
                    switch (str32.hashCode()) {
                        case -1249320806:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            if (str32.equals(obj14)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1249320805:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            Object obj24 = obj17;
                            if (!str32.equals(obj24)) {
                                obj17 = obj24;
                                obj14 = obj16;
                                c4 = 65535;
                                break;
                            } else {
                                obj17 = obj24;
                                obj14 = obj16;
                                c4 = 1;
                                break;
                            }
                        case -1225497657:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            if (str32.equals(obj13)) {
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 2;
                                break;
                            }
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -1225497656:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            if (str32.equals(obj12)) {
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 3;
                                break;
                            }
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -1225497655:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            if (str32.equals("translationZ")) {
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 4;
                                break;
                            }
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -1001078227:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            if (str32.equals(obj11)) {
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 5;
                                break;
                            }
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -908189618:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            it2 = it3;
                            obj10 = obj;
                            if (str32.equals(obj10)) {
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 6;
                                break;
                            }
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -908189617:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            if (str32.equals(str12)) {
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 7;
                                break;
                            }
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -797520672:
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            if (str32.equals("waveVariesBy")) {
                                str12 = str;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = '\b';
                                break;
                            }
                            str12 = str;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -760884510:
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            if (str32.equals("transformPivotX")) {
                                str12 = str;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = '\t';
                                break;
                            }
                            str12 = str;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -760884509:
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            if (str32.equals("transformPivotY")) {
                                c5 = '\n';
                                Object obj25 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = c5;
                                str12 = str;
                                it2 = it3;
                                obj10 = obj25;
                                break;
                            }
                            str12 = str;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -40300674:
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            if (str32.equals(str13)) {
                                c5 = 11;
                                Object obj252 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = c5;
                                str12 = str;
                                it2 = it3;
                                obj10 = obj252;
                                break;
                            }
                            str12 = str;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                        case -4379043:
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            if (!str32.equals(str14)) {
                                str12 = str;
                                str13 = str29;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 65535;
                                break;
                            } else {
                                str12 = str;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = '\f';
                                str13 = str29;
                                break;
                            }
                        case 37232917:
                            str15 = str30;
                            str16 = str27;
                            if (!str32.equals(str15)) {
                                str12 = str;
                                str13 = str29;
                                str14 = str28;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 65535;
                                break;
                            } else {
                                str12 = str;
                                str13 = str29;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = '\r';
                                str14 = str28;
                                break;
                            }
                        case 92909918:
                            str16 = str27;
                            if (!str32.equals(str16)) {
                                str12 = str;
                                str13 = str29;
                                str14 = str28;
                                str15 = str30;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 65535;
                                break;
                            } else {
                                str12 = str;
                                str13 = str29;
                                str14 = str28;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 14;
                                str15 = str30;
                                break;
                            }
                        case 156108012:
                            if (str32.equals("waveOffset")) {
                                str12 = str;
                                str13 = str29;
                                str14 = str28;
                                str15 = str30;
                                it2 = it3;
                                obj10 = obj;
                                hashSet7 = hashSet9;
                                obj11 = obj18;
                                y74Var4 = y74Var6;
                                obj12 = obj20;
                                y74Var5 = y74Var7;
                                obj13 = obj19;
                                arrayList3 = arrayList5;
                                obj14 = obj16;
                                c4 = 15;
                                str16 = str27;
                                break;
                            }
                        default:
                            str12 = str;
                            str13 = str29;
                            str14 = str28;
                            str15 = str30;
                            str16 = str27;
                            it2 = it3;
                            obj10 = obj;
                            hashSet7 = hashSet9;
                            obj11 = obj18;
                            y74Var4 = y74Var6;
                            obj12 = obj20;
                            y74Var5 = y74Var7;
                            obj13 = obj19;
                            arrayList3 = arrayList5;
                            obj14 = obj16;
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(5);
                            break;
                        case 1:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(6);
                            break;
                        case 2:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(9);
                            break;
                        case 3:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(10);
                            break;
                        case 4:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(11);
                            break;
                        case 5:
                            obj16 = obj14;
                            obj15 = obj13;
                            ?? qp7Var2 = new qp7();
                            qp7Var2.f = false;
                            mp7Var = qp7Var2;
                            break;
                        case 6:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(7);
                            break;
                        case 7:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(8);
                            break;
                        case '\b':
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(0);
                            break;
                        case '\t':
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(2);
                            break;
                        case '\n':
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(3);
                            break;
                        case 11:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(4);
                            break;
                        case '\f':
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(1);
                            break;
                        case '\r':
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new qp7();
                            break;
                        case 14:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(0);
                            break;
                        case 15:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = new mp7(0);
                            break;
                        default:
                            obj16 = obj14;
                            obj15 = obj13;
                            mp7Var = null;
                            break;
                    }
                }
                if (mp7Var != null) {
                    mp7Var.e = str32;
                    this.y.put(str32, mp7Var);
                }
                str27 = str16;
                str30 = str15;
                str28 = str14;
                arrayList5 = arrayList3;
                y74Var7 = y74Var5;
                obj19 = obj15;
                hashSet8 = hashSet5;
                hashSet10 = hashSet6;
                obj20 = obj12;
                str29 = str13;
                y74Var6 = y74Var4;
                obj18 = obj11;
                hashSet9 = hashSet7;
                obj = obj10;
                it3 = it2;
                str = str12;
            }
            hashSet = hashSet8;
            hashSet2 = hashSet10;
            obj2 = obj;
            str2 = str;
            str3 = str29;
            str4 = str28;
            str5 = str30;
            str6 = str27;
            hashSet3 = hashSet9;
            obj3 = obj18;
            obj4 = obj19;
            arrayList2 = arrayList5;
            y74Var = y74Var6;
            obj5 = obj20;
            y74Var2 = y74Var7;
            if (arrayList6 != null) {
                int size3 = arrayList6.size();
                int i20 = 0;
                while (i20 < size3) {
                    Object obj26 = arrayList6.get(i20);
                    i20++;
                    jg3 jg3Var3 = (jg3) obj26;
                    int i21 = size3;
                    if (jg3Var3 instanceof mg3) {
                        jg3Var3.a(this.y);
                    }
                    size3 = i21;
                }
            }
            k74Var.a(this.y, 0);
            k74Var2.a(this.y, 100);
            Iterator it4 = this.y.keySet().iterator();
            while (it4.hasNext()) {
                String str35 = (String) it4.next();
                if (hashMap2.containsKey(str35) && (num = (Integer) hashMap2.get(str35)) != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                Iterator it5 = it4;
                qp7 qp7Var3 = (qp7) this.y.get(str35);
                if (qp7Var3 != null) {
                    qp7Var3.d(i7);
                }
                it4 = it5;
            }
        } else {
            hashSet = hashSet8;
            hashSet2 = hashSet10;
            obj2 = obj;
            str2 = str;
            str3 = str29;
            str4 = str28;
            str5 = str30;
            str6 = str27;
            hashSet3 = hashSet9;
            obj3 = obj18;
            obj4 = obj19;
            arrayList2 = arrayList5;
            y74Var = y74Var6;
            obj5 = obj20;
            y74Var2 = y74Var7;
        }
        if (hashSet.isEmpty()) {
            str7 = "CUSTOM,";
        } else {
            if (this.x == null) {
                this.x = new HashMap();
            }
            Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                String str36 = (String) it6.next();
                if (!this.x.containsKey(str36)) {
                    if (str36.startsWith(str31)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it6;
                        String str37 = str36.split(",")[1];
                        str10 = str31;
                        int size4 = arrayList6.size();
                        hashMap = hashMap2;
                        int i22 = 0;
                        while (i22 < size4) {
                            Object obj27 = arrayList6.get(i22);
                            int i23 = i22 + 1;
                            jg3 jg3Var4 = (jg3) obj27;
                            int i24 = size4;
                            HashMap hashMap4 = jg3Var4.d;
                            if (hashMap4 != null && (j11Var2 = (j11) hashMap4.get(str37)) != null) {
                                sparseArray2.append(jg3Var4.a, j11Var2);
                            }
                            size4 = i24;
                            i22 = i23;
                        }
                        ?? wp7Var = new wp7();
                        wp7Var.m = new SparseArray();
                        wp7Var.k = str36.split(",")[1];
                        wp7Var.l = sparseArray2;
                        str11 = str6;
                        sp7Var2 = wp7Var;
                        obj6 = obj16;
                        obj7 = obj17;
                        obj8 = obj4;
                        obj9 = obj3;
                    } else {
                        hashMap = hashMap2;
                        it = it6;
                        str10 = str31;
                        switch (str36.hashCode()) {
                            case -1249320806:
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                if (str36.equals(obj6)) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1249320805:
                                obj7 = obj17;
                                obj8 = obj4;
                                if (!str36.equals(obj7)) {
                                    obj6 = obj16;
                                    c2 = 65535;
                                    break;
                                } else {
                                    obj6 = obj16;
                                    c2 = 1;
                                    break;
                                }
                            case -1225497657:
                                obj8 = obj4;
                                obj6 = obj16;
                                if (!str36.equals(obj8)) {
                                    obj7 = obj17;
                                    c2 = 65535;
                                    break;
                                } else {
                                    obj7 = obj17;
                                    c2 = 2;
                                    break;
                                }
                            case -1225497656:
                                if (str36.equals(obj5)) {
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    c2 = 3;
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            case -1225497655:
                                if (str36.equals("translationZ")) {
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    c2 = 4;
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            case -1001078227:
                                if (str36.equals(obj3)) {
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    c2 = 5;
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            case -908189618:
                                if (str36.equals(obj2)) {
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    c2 = 6;
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            case -908189617:
                                if (str36.equals(str2)) {
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    c2 = 7;
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            case -40300674:
                                if (str36.equals(str3)) {
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    c2 = '\b';
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            case -4379043:
                                if (str36.equals(str4)) {
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    c2 = '\t';
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            case 37232917:
                                if (str36.equals(str5)) {
                                    c3 = '\n';
                                    c2 = c3;
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            case 92909918:
                                if (str36.equals(str6)) {
                                    c3 = 11;
                                    c2 = c3;
                                    obj6 = obj16;
                                    obj7 = obj17;
                                    obj8 = obj4;
                                    break;
                                }
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                            default:
                                obj6 = obj16;
                                obj7 = obj17;
                                obj8 = obj4;
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                str11 = str6;
                                sp7Var = new sp7(3);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case 1:
                                str11 = str6;
                                sp7Var = new sp7(4);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case 2:
                                str11 = str6;
                                sp7Var = new sp7(7);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case 3:
                                str11 = str6;
                                sp7Var = new sp7(8);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case 4:
                                str11 = str6;
                                sp7Var = new sp7(9);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case 5:
                                str11 = str6;
                                ?? wp7Var2 = new wp7();
                                wp7Var2.k = false;
                                sp7Var = wp7Var2;
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case 6:
                                str11 = str6;
                                sp7Var = new sp7(5);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case 7:
                                str11 = str6;
                                sp7Var = new sp7(6);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case '\b':
                                str11 = str6;
                                sp7Var = new sp7(2);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case '\t':
                                str11 = str6;
                                sp7Var = new sp7(1);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case '\n':
                                str11 = str6;
                                sp7Var = new wp7();
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            case 11:
                                str11 = str6;
                                sp7Var = new sp7(0);
                                obj9 = obj3;
                                sp7Var.i = j;
                                sp7Var3 = sp7Var;
                                break;
                            default:
                                str11 = str6;
                                obj9 = obj3;
                                sp7Var2 = null;
                                break;
                        }
                        if (sp7Var3 != null) {
                            sp7Var3.f = str36;
                            this.x.put(str36, sp7Var3);
                        }
                        obj4 = obj8;
                        obj17 = obj7;
                        obj3 = obj9;
                        str31 = str10;
                        it6 = it;
                        hashMap2 = hashMap;
                        str6 = str11;
                        obj16 = obj6;
                    }
                    sp7Var3 = sp7Var2;
                    if (sp7Var3 != null) {
                    }
                    obj4 = obj8;
                    obj17 = obj7;
                    obj3 = obj9;
                    str31 = str10;
                    it6 = it;
                    hashMap2 = hashMap;
                    str6 = str11;
                    obj16 = obj6;
                }
            }
            HashMap hashMap5 = hashMap2;
            str7 = str31;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i25 = 0;
                while (i25 < size5) {
                    Object obj28 = arrayList6.get(i25);
                    i25++;
                    jg3 jg3Var5 = (jg3) obj28;
                    if (jg3Var5 instanceof ph3) {
                        ((ph3) jg3Var5).g(this.x);
                    }
                }
            }
            for (String str38 : this.x.keySet()) {
                HashMap hashMap6 = hashMap5;
                if (hashMap6.containsKey(str38)) {
                    i6 = ((Integer) hashMap6.get(str38)).intValue();
                } else {
                    i6 = 0;
                }
                ((wp7) this.x.get(str38)).e(i6);
                hashMap5 = hashMap6;
            }
        }
        int size6 = arrayList2.size();
        int i26 = size6 + 2;
        y74[] y74VarArr = new y74[i26];
        y74VarArr[0] = y74Var;
        y74VarArr[size6 + 1] = y74Var2;
        if (arrayList2.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        int size7 = arrayList2.size();
        int i27 = 0;
        int i28 = 1;
        while (i27 < size7) {
            Object obj29 = arrayList2.get(i27);
            i27++;
            y74VarArr[i28] = (y74) obj29;
            i28++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str39 : y74Var2.j0.keySet()) {
            y74 y74Var8 = y74Var;
            if (y74Var8.j0.containsKey(str39)) {
                str9 = str7;
                hashSet4 = hashSet3;
                if (!hashSet4.contains(str9 + str39)) {
                    hashSet12.add(str39);
                }
            } else {
                str9 = str7;
                hashSet4 = hashSet3;
            }
            y74Var = y74Var8;
            str7 = str9;
            hashSet3 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.r = strArr;
        this.s = new int[strArr.length];
        int i29 = 0;
        while (true) {
            String[] strArr2 = this.r;
            if (i29 < strArr2.length) {
                String str40 = strArr2[i29];
                this.s[i29] = 0;
                int i30 = 0;
                while (true) {
                    if (i30 >= i26) {
                        break;
                    } else if (y74VarArr[i30].j0.containsKey(str40) && (j11Var = (j11) y74VarArr[i30].j0.get(str40)) != null) {
                        int[] iArr = this.s;
                        iArr[i29] = j11Var.c() + iArr[i29];
                    } else {
                        i30++;
                    }
                }
                i29++;
            } else {
                if (y74VarArr[0].f0 != -1) {
                    z = true;
                } else {
                    z = false;
                }
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i31 = 1; i31 < i26; i31++) {
                    y74 y74Var9 = y74VarArr[i31];
                    y74 y74Var10 = y74VarArr[i31 - 1];
                    boolean b = y74.b(y74Var9.X, y74Var10.X);
                    boolean b2 = y74.b(y74Var9.Y, y74Var10.Y);
                    zArr[0] = zArr[0] | y74.b(y74Var9.R, y74Var10.R);
                    boolean z2 = b | b2 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | y74.b(y74Var9.Z, y74Var10.Z);
                    zArr[4] = y74.b(y74Var9.d0, y74Var10.d0) | zArr[4];
                }
                int i32 = 0;
                for (int i33 = 1; i33 < length; i33++) {
                    if (zArr[i33]) {
                        i32++;
                    }
                }
                this.o = new int[i32];
                int max = Math.max(2, i32);
                this.p = new double[max];
                this.q = new double[max];
                int i34 = 0;
                for (int i35 = 1; i35 < length; i35++) {
                    if (zArr[i35]) {
                        this.o[i34] = i35;
                        i34++;
                    }
                }
                int[] iArr2 = {i26, this.o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance(cls, iArr2);
                double[] dArr2 = new double[i26];
                int i36 = 0;
                while (i36 < i26) {
                    y74 y74Var11 = y74VarArr[i36];
                    double[] dArr3 = dArr[i36];
                    int[] iArr3 = this.o;
                    y74[] y74VarArr2 = y74VarArr;
                    int i37 = i36;
                    int i38 = 6;
                    float[] fArr2 = {y74Var11.R, y74Var11.X, y74Var11.Y, y74Var11.Z, y74Var11.d0, y74Var11.e0};
                    int i39 = 0;
                    int i40 = 0;
                    while (i39 < iArr3.length) {
                        if (iArr3[i39] < i38) {
                            dArr3[i40] = fArr2[i5];
                            i40++;
                        }
                        i39++;
                        i38 = 6;
                    }
                    dArr2[i37] = y74VarArr2[i37].L;
                    i36 = i37 + 1;
                    y74VarArr = y74VarArr2;
                }
                y74[] y74VarArr3 = y74VarArr;
                int i41 = 0;
                while (true) {
                    int[] iArr4 = this.o;
                    if (i41 < iArr4.length) {
                        if (iArr4[i41] < 6) {
                            String n = i61.n(new StringBuilder(), y74.n0[this.o[i41]], " [");
                            for (int i42 = 0; i42 < i26; i42++) {
                                StringBuilder s = lb1.s(n);
                                s.append(dArr[i42][i41]);
                                n = s.toString();
                            }
                        }
                        i41++;
                    } else {
                        this.j = new ak7[this.r.length + 1];
                        int i43 = 0;
                        while (true) {
                            String[] strArr3 = this.r;
                            if (i43 < strArr3.length) {
                                String str41 = strArr3[i43];
                                int i44 = 0;
                                int i45 = 0;
                                double[] dArr4 = null;
                                double[][] dArr5 = null;
                                while (i44 < i26) {
                                    if (y74VarArr3[i44].j0.containsKey(str41)) {
                                        if (dArr5 == null) {
                                            dArr4 = new double[i26];
                                            j11 j11Var4 = (j11) y74VarArr3[i44].j0.get(str41);
                                            if (j11Var4 == null) {
                                                c = 0;
                                            } else {
                                                c = j11Var4.c();
                                            }
                                            dArr5 = (double[][]) Array.newInstance(cls, i26, c);
                                        }
                                        y74 y74Var12 = y74VarArr3[i44];
                                        dArr4[i45] = y74Var12.L;
                                        double[] dArr6 = dArr5[i45];
                                        j11 j11Var5 = (j11) y74Var12.j0.get(str41);
                                        if (j11Var5 != null) {
                                            if (j11Var5.c() == 1) {
                                                dArr6[0] = j11Var5.a();
                                            } else {
                                                int c6 = j11Var5.c();
                                                j11Var5.b(new float[c6]);
                                                int i46 = 0;
                                                int i47 = 0;
                                                while (i46 < c6) {
                                                    dArr6[i47] = fArr[i46];
                                                    i46++;
                                                    str41 = str41;
                                                    i47++;
                                                    i43 = i43;
                                                    i44 = i44;
                                                }
                                            }
                                        }
                                        i3 = i43;
                                        str8 = str41;
                                        i4 = i44;
                                        i45++;
                                    } else {
                                        i3 = i43;
                                        str8 = str41;
                                        i4 = i44;
                                    }
                                    i44 = i4 + 1;
                                    str41 = str8;
                                    i43 = i3;
                                }
                                int i48 = i43 + 1;
                                this.j[i48] = ak7.U(this.e, Arrays.copyOf(dArr4, i45), (double[][]) Arrays.copyOf(dArr5, i45));
                                i43 = i48;
                            } else {
                                int i49 = 0;
                                this.j[0] = ak7.U(this.e, dArr2, dArr);
                                if (y74VarArr3[0].f0 != -1) {
                                    int[] iArr5 = new int[i26];
                                    double[] dArr7 = new double[i26];
                                    double[][] dArr8 = (double[][]) Array.newInstance(cls, i26, 2);
                                    for (int i50 = 0; i50 < i26; i50++) {
                                        iArr5[i50] = y74VarArr3[i50].f0;
                                        dArr7[i50] = y74Var3.L;
                                        double[] dArr9 = dArr8[i50];
                                        dArr9[0] = y74Var3.X;
                                        dArr9[1] = y74Var3.Y;
                                    }
                                    i49 = 0;
                                    this.k = new wt(iArr5, dArr7, dArr8);
                                }
                                this.z = new HashMap();
                                if (arrayList6 != null) {
                                    Iterator it7 = hashSet2.iterator();
                                    float f106 = Float.NaN;
                                    while (it7.hasNext()) {
                                        String str42 = (String) it7.next();
                                        hp7 b3 = hp7.b(str42);
                                        if (b3 != null) {
                                            if (b3.e == 1 && Float.isNaN(f106)) {
                                                f106 = c();
                                            }
                                            b3.b = str42;
                                            this.z.put(str42, b3);
                                        }
                                    }
                                    int size8 = arrayList6.size();
                                    int i51 = i49;
                                    while (i51 < size8) {
                                        Object obj30 = arrayList6.get(i51);
                                        i51++;
                                        jg3 jg3Var6 = (jg3) obj30;
                                        if (jg3Var6 instanceof qg3) {
                                            ((qg3) jg3Var6).g(this.z);
                                        }
                                    }
                                    for (hp7 hp7Var : this.z.values()) {
                                        hp7Var.e();
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        y74 y74Var = this.f;
        sb.append(y74Var.X);
        sb.append(" y: ");
        sb.append(y74Var.Y);
        sb.append(" end: x: ");
        y74 y74Var2 = this.g;
        sb.append(y74Var2.X);
        sb.append(" y: ");
        sb.append(y74Var2.Y);
        return sb.toString();
    }
}
