package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lz3  reason: default package */
/* loaded from: classes.dex */
public final class lz3 {
    public za3[] A;
    public final View b;
    public final int c;
    public jv3[] j;
    public gt k;
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
    public final wz3 f = new wz3();
    public final wz3 g = new wz3();
    public final jz3 h = new jz3();
    public final jz3 i = new jz3();
    public float l = Float.NaN;
    public float m = RecyclerView.A1;
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

    public lz3(View view) {
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
        float f2 = RecyclerView.A1;
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
        an1 an1Var = this.f.A;
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        float f6 = Float.NaN;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wz3 wz3Var = (wz3) obj;
            an1 an1Var2 = wz3Var.A;
            if (an1Var2 != null) {
                float f7 = wz3Var.L;
                if (f7 < f) {
                    an1Var = an1Var2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = wz3Var.L;
                }
            }
        }
        if (an1Var != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            float b = (((float) an1Var.b(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) an1Var.c(d);
            }
            return b;
        }
        return f;
    }

    public final void b(double d, float[] fArr, float[] fArr2) {
        float f;
        char c;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].D(d, dArr);
        this.j[0].G(d, dArr2);
        float f2 = RecyclerView.A1;
        Arrays.fill(fArr2, (float) RecyclerView.A1);
        int[] iArr = this.o;
        wz3 wz3Var = this.f;
        float f3 = wz3Var.X;
        float f4 = wz3Var.Y;
        float f5 = wz3Var.Z;
        float f6 = wz3Var.c0;
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
        lz3 lz3Var = wz3Var.h0;
        if (lz3Var != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            lz3Var.b(d, fArr3, fArr4);
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
        fArr[0] = (f5 / f) + f3 + RecyclerView.A1;
        fArr[1] = (f6 / f) + f4 + RecyclerView.A1;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public final float c() {
        float f;
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float f2 = RecyclerView.A1;
        for (int i = 0; i < 100; i++) {
            float f3 = i * 0.01010101f;
            double d3 = f3;
            an1 an1Var = this.f.A;
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            float f4 = Float.NaN;
            int i2 = 0;
            float f5 = RecyclerView.A1;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                int i3 = i2 + 1;
                wz3 wz3Var = (wz3) obj;
                an1 an1Var2 = wz3Var.A;
                if (an1Var2 != null) {
                    float f6 = wz3Var.L;
                    if (f6 < f3) {
                        f5 = f6;
                        an1Var = an1Var2;
                    } else if (Float.isNaN(f4)) {
                        f4 = wz3Var.L;
                    }
                }
                i2 = i3;
            }
            if (an1Var != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d3 = (((float) an1Var.b((f3 - f5) / f)) * (f4 - f5)) + f5;
            }
            this.j[0].D(d3, this.p);
            this.f.c(d3, this.o, this.p, fArr, 0);
            if (i > 0) {
                f2 += (float) Math.hypot(d2 - fArr[1], d - fArr[0]);
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return f2;
    }

    public final boolean d(float f, long j, u93 u93Var, View view) {
        boolean z;
        View view2;
        boolean z2;
        float f2;
        tb7 tb7Var;
        float f3;
        boolean z3;
        float f4;
        View view3;
        float f5;
        float f6;
        boolean z4;
        float f7;
        View view4 = view;
        tb7 tb7Var2 = null;
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
                f7 = RecyclerView.A1;
            }
            a = (f7 * f8) + floor;
        }
        HashMap hashMap = this.y;
        if (hashMap != null) {
            for (pb7 pb7Var : hashMap.values()) {
                pb7Var.c(view4, a);
            }
        }
        HashMap hashMap2 = this.x;
        if (hashMap2 != null) {
            tb7 tb7Var3 = null;
            z = false;
            for (vb7 vb7Var : hashMap2.values()) {
                if (vb7Var instanceof tb7) {
                    tb7Var3 = (tb7) vb7Var;
                } else {
                    z |= vb7Var.d(a, j, u93Var, view4);
                    view4 = view;
                }
            }
            tb7Var2 = tb7Var3;
        } else {
            z = false;
        }
        jv3[] jv3VarArr = this.j;
        wz3 wz3Var = this.f;
        if (jv3VarArr != null) {
            double d = a;
            jv3VarArr[0].D(d, this.p);
            this.j[0].G(d, this.q);
            gt gtVar = this.k;
            if (gtVar != null) {
                double[] dArr = this.p;
                f2 = RecyclerView.A1;
                if (dArr.length > 0) {
                    gtVar.D(d, dArr);
                    this.k.G(d, this.q);
                }
            } else {
                f2 = RecyclerView.A1;
            }
            if (!this.H) {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f4 = 2.0f;
                double[] dArr3 = this.q;
                f3 = 1.0f;
                boolean z5 = this.d;
                float f10 = wz3Var.X;
                float f11 = wz3Var.Y;
                float f12 = wz3Var.Z;
                int i2 = 1;
                float f13 = wz3Var.c0;
                tb7Var = tb7Var2;
                if (iArr.length != 0) {
                    f5 = f12;
                    if (wz3Var.k0.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        wz3Var.k0 = new double[i3];
                        wz3Var.l0 = new double[i3];
                    }
                } else {
                    f5 = f12;
                }
                Arrays.fill(wz3Var.k0, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = wz3Var.k0;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    wz3Var.l0[i5] = dArr3[i4];
                }
                float f14 = Float.NaN;
                float f15 = f2;
                float f16 = f15;
                float f17 = f16;
                int i6 = 0;
                float f18 = f5;
                float f19 = f17;
                while (true) {
                    double[] dArr5 = wz3Var.k0;
                    f6 = f13;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        z4 = z;
                    } else {
                        double d2 = 0.0d;
                        if (!Double.isNaN(wz3Var.k0[i6])) {
                            d2 = wz3Var.k0[i6] + 0.0d;
                        }
                        float f20 = (float) d2;
                        z4 = z;
                        float f21 = (float) wz3Var.l0[i6];
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
                lz3 lz3Var = wz3Var.h0;
                if (lz3Var != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    lz3Var.b(d, fArr, fArr2);
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
                tb7Var = tb7Var2;
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
                for (pb7 pb7Var2 : hashMap3.values()) {
                    if (pb7Var2 instanceof nb7) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((nb7) pb7Var2).a(a) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (tb7Var != null) {
                double[] dArr7 = this.q;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                tb7 tb7Var4 = tb7Var;
                view2.setRotation(tb7Var4.b(a, j, u93Var, view2) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z2 = z3 | tb7Var4.h;
            } else {
                z2 = z3;
            }
            int i13 = 1;
            while (true) {
                jv3[] jv3VarArr2 = this.j;
                if (i13 >= jv3VarArr2.length) {
                    break;
                }
                jv3 jv3Var = jv3VarArr2[i13];
                float[] fArr3 = this.t;
                jv3Var.E(d, fArr3);
                l07.r0((ey0) wz3Var.i0.get(this.r[i13 - 1]), view2, fArr3);
                i13++;
            }
            jz3 jz3Var = this.h;
            if (jz3Var.B == 0) {
                if (a <= f2) {
                    view2.setVisibility(jz3Var.L);
                } else {
                    int i14 = (a > f3 ? 1 : (a == f3 ? 0 : -1));
                    jz3 jz3Var2 = this.i;
                    if (i14 >= 0) {
                        view2.setVisibility(jz3Var2.L);
                    } else if (jz3Var2.L != jz3Var.L) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i15 = 0;
                while (true) {
                    za3[] za3VarArr = this.A;
                    if (i15 >= za3VarArr.length) {
                        break;
                    }
                    za3VarArr[i15].g(view2, a);
                    i15++;
                }
            }
        } else {
            view2 = view;
            boolean z6 = z;
            float f28 = wz3Var.X;
            wz3 wz3Var2 = this.g;
            float a2 = b31.a(wz3Var2.X, f28, a, f28);
            float f29 = wz3Var.Y;
            float a3 = b31.a(wz3Var2.Y, f29, a, f29);
            float f30 = wz3Var.Z;
            float f31 = wz3Var2.Z;
            float a4 = b31.a(f31, f30, a, f30);
            float f32 = wz3Var.c0;
            float f33 = wz3Var2.c0;
            float f34 = a2 + 0.5f;
            int i16 = (int) f34;
            float f35 = a3 + 0.5f;
            int i17 = (int) f35;
            int i18 = (int) (f34 + a4);
            int a5 = (int) (f35 + b31.a(f33, f32, a, f32));
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
            for (gb7 gb7Var : hashMap4.values()) {
                if (gb7Var instanceof eb7) {
                    double[] dArr8 = this.q;
                    view2.setRotation(((eb7) gb7Var).a(a) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    gb7Var.d(view2, a);
                }
            }
        }
        return z2;
    }

    public final void e(wz3 wz3Var) {
        wz3Var.d((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0d87  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v38, types: [vb7, ub7] */
    /* JADX WARN: Type inference failed for: r13v43, types: [vb7] */
    /* JADX WARN: Type inference failed for: r15v15, types: [wz3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v105, types: [mb7, pb7] */
    /* JADX WARN: Type inference failed for: r4v66, types: [sb7, vb7] */
    /* JADX WARN: Type inference failed for: r5v106, types: [pb7, ob7] */
    /* JADX WARN: Type inference failed for: r5v114, types: [pb7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r51, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 4660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz3.g(long, int, int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        wz3 wz3Var = this.f;
        sb.append(wz3Var.X);
        sb.append(" y: ");
        sb.append(wz3Var.Y);
        sb.append(" end: x: ");
        wz3 wz3Var2 = this.g;
        sb.append(wz3Var2.X);
        sb.append(" y: ");
        sb.append(wz3Var2.Y);
        return sb.toString();
    }
}
