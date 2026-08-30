package h5;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {
    public m[] A;

    /* renamed from: b  reason: collision with root package name */
    public final View f6211b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6212c;

    /* renamed from: j  reason: collision with root package name */
    public ij.a[] f6219j;

    /* renamed from: k  reason: collision with root package name */
    public d5.b f6220k;

    /* renamed from: o  reason: collision with root package name */
    public int[] f6223o;

    /* renamed from: p  reason: collision with root package name */
    public double[] f6224p;

    /* renamed from: q  reason: collision with root package name */
    public double[] f6225q;

    /* renamed from: r  reason: collision with root package name */
    public String[] f6226r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f6227s;

    /* renamed from: x  reason: collision with root package name */
    public HashMap f6232x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap f6233y;

    /* renamed from: z  reason: collision with root package name */
    public HashMap f6234z;

    /* renamed from: a  reason: collision with root package name */
    public final Rect f6210a = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public boolean f6213d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f6214e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final x f6215f = new x();

    /* renamed from: g  reason: collision with root package name */
    public final x f6216g = new x();

    /* renamed from: h  reason: collision with root package name */
    public final n f6217h = new n();

    /* renamed from: i  reason: collision with root package name */
    public final n f6218i = new n();

    /* renamed from: l  reason: collision with root package name */
    public float f6221l = Float.NaN;
    public float m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f6222n = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f6228t = new float[4];

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f6229u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public final float[] f6230v = new float[1];

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f6231w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public p(View view) {
        this.f6211b = view;
        this.f6212c = view.getId();
        view.getLayoutParams();
    }

    public static void f(Rect rect, Rect rect2, int i2, int i10, int i11) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    int i12 = rect.left + rect.right;
                    rect2.left = i10 - ((rect.width() + (rect.bottom + rect.top)) / 2);
                    rect2.top = (i12 - rect.height()) / 2;
                    rect2.right = rect.width() + rect2.left;
                    rect2.bottom = rect.height() + rect2.top;
                    return;
                }
                int i13 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i13 / 2);
                rect2.top = i11 - ((rect.height() + i13) / 2);
                rect2.right = rect.width() + rect2.left;
                rect2.bottom = rect.height() + rect2.top;
                return;
            }
            int i14 = rect.left + rect.right;
            rect2.left = i10 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        int i15 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i11 - ((rect.height() + i15) / 2);
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f8, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f6222n;
            if (f12 != 1.0d) {
                float f13 = this.m;
                if (f8 < f13) {
                    f8 = 0.0f;
                }
                if (f8 > f13 && f8 < 1.0d) {
                    f8 = Math.min((f8 - f13) * f12, 1.0f);
                }
            }
        }
        d5.e eVar = this.f6215f.A;
        ArrayList arrayList = this.f6229u;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            x xVar = (x) obj;
            d5.e eVar2 = xVar.A;
            if (eVar2 != null) {
                float f15 = xVar.L;
                if (f15 < f8) {
                    eVar = eVar2;
                    f10 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = xVar.L;
                }
            }
        }
        if (eVar != null) {
            if (!Float.isNaN(f14)) {
                f11 = f14;
            }
            float f16 = f11 - f10;
            double d4 = (f8 - f10) / f16;
            f8 = (((float) eVar.a(d4)) * f16) + f10;
            if (fArr != null) {
                fArr[0] = (float) eVar.b(d4);
            }
        }
        return f8;
    }

    public final void b(double d4, float[] fArr, float[] fArr2) {
        float f8;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f6219j[0].a0(d4, dArr);
        this.f6219j[0].e0(d4, dArr2);
        float f10 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f6223o;
        x xVar = this.f6215f;
        float f11 = xVar.X;
        float f12 = xVar.Y;
        float f13 = xVar.Z;
        float f14 = xVar.f6262b0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f18 = (float) dArr[i2];
            float f19 = (float) dArr2[i2];
            int i10 = iArr[i2];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            f14 = f18;
                            f16 = f19;
                        }
                    } else {
                        f13 = f18;
                        f15 = f19;
                    }
                } else {
                    f12 = f18;
                    f17 = f19;
                }
            } else {
                f11 = f18;
                f10 = f19;
            }
        }
        float f20 = (f15 / 2.0f) + f10;
        float f21 = (f16 / 2.0f) + f17;
        p pVar = xVar.f6267g0;
        if (pVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            pVar.b(d4, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            double d10 = f11;
            double d11 = f12;
            double sin = Math.sin(d11) * d10;
            float cos = (float) ((f23 - (Math.cos(d11) * d10)) - (f14 / 2.0f));
            double d12 = f10;
            double d13 = f17;
            f8 = 2.0f;
            double sin2 = Math.sin(d11) * d13;
            f12 = cos;
            f20 = (float) ((Math.cos(d11) * d13) + (Math.sin(d11) * d12) + f24);
            f21 = (float) (sin2 + (f25 - (Math.cos(d11) * d12)));
            f11 = (float) ((sin + f22) - (f13 / 2.0f));
        } else {
            f8 = 2.0f;
        }
        fArr[0] = (f13 / f8) + f11 + 0.0f;
        fArr[1] = (f14 / f8) + f12 + 0.0f;
        fArr2[0] = f20;
        fArr2[1] = f21;
    }

    public final float c() {
        float f8;
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d4 = 0.0d;
        double d10 = 0.0d;
        int i2 = 0;
        float f11 = 0.0f;
        while (i2 < 100) {
            float f12 = i2 * f10;
            double d11 = f12;
            d5.e eVar = this.f6215f.A;
            ArrayList arrayList = this.f6229u;
            int size = arrayList.size();
            float f13 = Float.NaN;
            int i10 = 0;
            float f14 = 0.0f;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x xVar = (x) obj;
                float f15 = f10;
                d5.e eVar2 = xVar.A;
                if (eVar2 != null) {
                    float f16 = xVar.L;
                    if (f16 < f12) {
                        f14 = f16;
                        eVar = eVar2;
                    } else if (Float.isNaN(f13)) {
                        f13 = xVar.L;
                    }
                }
                f10 = f15;
            }
            float f17 = f10;
            if (eVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                d11 = (((float) eVar.a((f12 - f14) / f8)) * (f13 - f14)) + f14;
            }
            double d12 = d11;
            this.f6219j[0].a0(d12, this.f6224p);
            int i11 = i2;
            this.f6215f.c(d12, this.f6223o, this.f6224p, fArr, 0);
            if (i11 > 0) {
                f11 += (float) Math.hypot(d10 - fArr[1], d4 - fArr[0]);
            }
            d4 = fArr[0];
            d10 = fArr[1];
            i2 = i11 + 1;
            f10 = f17;
        }
        return f11;
    }

    public final boolean d(float f8, long j2, View view, d5.e eVar) {
        boolean z10;
        boolean z11;
        float f10;
        g5.o oVar;
        float f11;
        boolean z12;
        double d4;
        float f12;
        View view2;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        g5.o oVar2 = null;
        float a10 = a(f8, null);
        int i2 = this.E;
        if (i2 != -1) {
            float f18 = 1.0f / i2;
            float floor = ((float) Math.floor(a10 / f18)) * f18;
            float f19 = (a10 % f18) / f18;
            if (!Float.isNaN(this.F)) {
                f19 = (f19 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            if (interpolator != null) {
                f17 = interpolator.getInterpolation(f19);
            } else if (f19 > 0.5d) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            a10 = (f17 * f18) + floor;
        }
        HashMap hashMap = this.f6233y;
        if (hashMap != null) {
            for (g5.l lVar : hashMap.values()) {
                lVar.c(view, a10);
            }
        }
        HashMap hashMap2 = this.f6232x;
        if (hashMap2 != null) {
            g5.o oVar3 = null;
            z10 = false;
            for (g5.q qVar : hashMap2.values()) {
                if (qVar instanceof g5.o) {
                    oVar3 = (g5.o) qVar;
                } else {
                    z10 |= qVar.d(a10, j2, view, eVar);
                }
            }
            oVar2 = oVar3;
        } else {
            z10 = false;
        }
        ij.a[] aVarArr = this.f6219j;
        x xVar = this.f6215f;
        if (aVarArr != null) {
            double d10 = a10;
            aVarArr[0].a0(d10, this.f6224p);
            this.f6219j[0].e0(d10, this.f6225q);
            d5.b bVar = this.f6220k;
            if (bVar != null) {
                double[] dArr = this.f6224p;
                f10 = 0.0f;
                if (dArr.length > 0) {
                    bVar.a0(d10, dArr);
                    this.f6220k.e0(d10, this.f6225q);
                }
            } else {
                f10 = 0.0f;
            }
            if (!this.H) {
                int[] iArr = this.f6223o;
                double[] dArr2 = this.f6224p;
                f12 = 2.0f;
                double[] dArr3 = this.f6225q;
                f11 = 1.0f;
                boolean z13 = this.f6213d;
                float f20 = xVar.X;
                float f21 = xVar.Y;
                float f22 = xVar.Z;
                int i10 = 1;
                float f23 = xVar.f6262b0;
                oVar = oVar2;
                if (iArr.length != 0) {
                    f13 = f22;
                    if (xVar.f6270j0.length <= iArr[iArr.length - 1]) {
                        int i11 = iArr[iArr.length - 1] + 1;
                        xVar.f6270j0 = new double[i11];
                        xVar.f6271k0 = new double[i11];
                    }
                } else {
                    f13 = f22;
                }
                Arrays.fill(xVar.f6270j0, Double.NaN);
                for (int i12 = 0; i12 < iArr.length; i12++) {
                    double[] dArr4 = xVar.f6270j0;
                    int i13 = iArr[i12];
                    dArr4[i13] = dArr2[i12];
                    xVar.f6271k0[i13] = dArr3[i12];
                }
                float f24 = Float.NaN;
                float f25 = f10;
                float f26 = f25;
                float f27 = f26;
                float f28 = f27;
                int i14 = 0;
                while (true) {
                    double[] dArr5 = xVar.f6270j0;
                    f14 = f23;
                    if (i14 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i14])) {
                        f16 = f20;
                    } else {
                        double d11 = 0.0d;
                        if (!Double.isNaN(xVar.f6270j0[i14])) {
                            d11 = xVar.f6270j0[i14] + 0.0d;
                        }
                        f16 = f20;
                        float f29 = (float) d11;
                        float f30 = (float) xVar.f6271k0[i14];
                        if (i14 != i10) {
                            if (i14 != 2) {
                                if (i14 != 3) {
                                    if (i14 != 4) {
                                        if (i14 == 5) {
                                            f20 = f16;
                                            f23 = f14;
                                            f24 = f29;
                                        }
                                    } else {
                                        f28 = f30;
                                        f20 = f16;
                                        f23 = f29;
                                    }
                                } else {
                                    f27 = f30;
                                    f20 = f16;
                                    f23 = f14;
                                    f13 = f29;
                                }
                            } else {
                                f25 = f30;
                                f20 = f16;
                                f23 = f14;
                                f21 = f29;
                            }
                        } else {
                            f26 = f30;
                            f23 = f14;
                            f20 = f29;
                        }
                        i14++;
                        i10 = 1;
                    }
                    f20 = f16;
                    f23 = f14;
                    i14++;
                    i10 = 1;
                }
                float f31 = f20;
                p pVar = xVar.f6267g0;
                if (pVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    pVar.b(d10, fArr, fArr2);
                    float f32 = fArr[0];
                    float f33 = fArr[1];
                    float f34 = fArr2[0];
                    float f35 = fArr2[1];
                    z12 = z10;
                    d4 = d10;
                    double d12 = f31;
                    double d13 = f21;
                    f15 = (float) (((Math.sin(d13) * d12) + f32) - (f13 / 2.0f));
                    f21 = (float) ((f33 - (Math.cos(d13) * d12)) - (f14 / 2.0f));
                    double d14 = f26;
                    double d15 = f25;
                    float cos = (float) ((Math.cos(d13) * d12 * d15) + (Math.sin(d13) * d14) + f34);
                    float sin = (float) ((Math.sin(d13) * d12 * d15) + (f35 - (Math.cos(d13) * d14)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = cos;
                        dArr3[1] = sin;
                    }
                    if (!Float.isNaN(f24)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(sin, cos)) + f24));
                    }
                } else {
                    f15 = f31;
                    z12 = z10;
                    d4 = d10;
                    if (!Float.isNaN(f24)) {
                        view.setRotation(f24 + ((float) Math.toDegrees(Math.atan2((f28 / 2.0f) + f25, (f27 / 2.0f) + f26))) + f10);
                    }
                }
                float f36 = f15 + 0.5f;
                int i15 = (int) f36;
                float f37 = f21 + 0.5f;
                int i16 = (int) f37;
                int i17 = (int) (f36 + f13);
                int i18 = (int) (f37 + f14);
                int i19 = i17 - i15;
                int i20 = i18 - i16;
                if (i19 != view.getMeasuredWidth() || i20 != view.getMeasuredHeight() || z13) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                }
                view.layout(i15, i16, i17, i18);
                this.f6213d = false;
            } else {
                oVar = oVar2;
                f11 = 1.0f;
                z12 = z10;
                d4 = d10;
                f12 = 2.0f;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + view2.getTop()) / f12;
                    float right = (this.D.getRight() + this.D.getLeft()) / f12;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap hashMap3 = this.f6233y;
            if (hashMap3 != null) {
                for (g5.l lVar2 : hashMap3.values()) {
                    if (lVar2 instanceof g5.j) {
                        double[] dArr6 = this.f6225q;
                        if (dArr6.length > 1) {
                            view.setRotation(((g5.j) lVar2).a(a10) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (oVar != null) {
                double[] dArr7 = this.f6225q;
                double d16 = dArr7[0];
                double d17 = dArr7[1];
                g5.o oVar4 = oVar;
                view.setRotation(oVar4.b(a10, j2, view, eVar) + ((float) Math.toDegrees(Math.atan2(d17, d16))));
                z11 = z12 | oVar4.f5596h;
            } else {
                z11 = z12;
            }
            int i21 = 1;
            while (true) {
                ij.a[] aVarArr2 = this.f6219j;
                if (i21 >= aVarArr2.length) {
                    break;
                }
                ij.a aVar = aVarArr2[i21];
                float[] fArr3 = this.f6228t;
                aVar.b0(d4, fArr3);
                q8.r.T((i5.b) xVar.f6268h0.get(this.f6226r[i21 - 1]), view, fArr3);
                i21++;
            }
            n nVar = this.f6217h;
            if (nVar.B == 0) {
                if (a10 <= f10) {
                    view.setVisibility(nVar.L);
                } else {
                    int i22 = (a10 > f11 ? 1 : (a10 == f11 ? 0 : -1));
                    n nVar2 = this.f6218i;
                    if (i22 >= 0) {
                        view.setVisibility(nVar2.L);
                    } else if (nVar2.L != nVar.L) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i23 = 0;
                while (true) {
                    m[] mVarArr = this.A;
                    if (i23 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i23].g(view, a10);
                    i23++;
                }
            }
        } else {
            boolean z14 = z10;
            float f38 = xVar.X;
            x xVar2 = this.f6216g;
            float a11 = w.d.a(xVar2.X, f38, a10, f38);
            float f39 = xVar.Y;
            float a12 = w.d.a(xVar2.Y, f39, a10, f39);
            float f40 = xVar.Z;
            float f41 = xVar2.Z;
            float a13 = w.d.a(f41, f40, a10, f40);
            float f42 = xVar.f6262b0;
            float f43 = xVar2.f6262b0;
            float f44 = a11 + 0.5f;
            int i24 = (int) f44;
            float f45 = a12 + 0.5f;
            int i25 = (int) f45;
            int i26 = (int) (f44 + a13);
            int a14 = (int) (f45 + w.d.a(f43, f42, a10, f42));
            int i27 = i26 - i24;
            int i28 = a14 - i25;
            if (f41 != f40 || f43 != f42 || this.f6213d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
                this.f6213d = false;
            }
            view.layout(i24, i25, i26, a14);
            z11 = z14;
        }
        HashMap hashMap4 = this.f6234z;
        if (hashMap4 != null) {
            for (g5.g gVar : hashMap4.values()) {
                if (gVar instanceof g5.e) {
                    double[] dArr8 = this.f6225q;
                    view.setRotation(((g5.e) gVar).a(a10) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    gVar.d(view, a10);
                }
            }
        }
        return z11;
    }

    public final void e(x xVar) {
        xVar.d((int) this.f6211b.getX(), (int) this.f6211b.getY(), this.f6211b.getWidth(), this.f6211b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d86  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x063f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v38, types: [g5.q, g5.p] */
    /* JADX WARN: Type inference failed for: r13v43, types: [g5.q] */
    /* JADX WARN: Type inference failed for: r15v15, types: [h5.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v105, types: [g5.l, g5.i] */
    /* JADX WARN: Type inference failed for: r4v66, types: [g5.n, g5.q] */
    /* JADX WARN: Type inference failed for: r5v106, types: [g5.l, g5.k] */
    /* JADX WARN: Type inference failed for: r5v114, types: [g5.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r51, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 4658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.p.g(long, int, int):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        x xVar = this.f6215f;
        sb2.append(xVar.X);
        sb2.append(" y: ");
        sb2.append(xVar.Y);
        sb2.append(" end: x: ");
        x xVar2 = this.f6216g;
        sb2.append(xVar2.X);
        sb2.append(" y: ");
        sb2.append(xVar2.Y);
        return sb2.toString();
    }
}
