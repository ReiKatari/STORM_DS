package defpackage;

import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b40  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b40 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ b40(long j, float[] fArr, l75 l75Var, k75 k75Var) {
        this.A = 1;
        this.B = j;
        this.L = fArr;
        this.R = l75Var;
        this.X = k75Var;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [ou, java.lang.Object] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int f;
        long j;
        boolean z;
        boolean z2;
        float a;
        float a2;
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj2 = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                y55 y55Var = (y55) obj4;
                n75 n75Var = (n75) obj3;
                long j2 = this.B;
                b30 b30Var = (b30) obj2;
                xf3 xf3Var = (xf3) obj;
                xf3Var.a();
                float f2 = y55Var.a;
                float f3 = y55Var.b;
                rh0 rh0Var = xf3Var.A;
                ((bq0) rh0Var.B.B).e0(f2, f3);
                try {
                    hk1.a0(xf3Var, (nh) n75Var.A, j2, 0L, RecyclerView.A1, b30Var, 0, 890);
                    return o27Var;
                } finally {
                    ((bq0) rh0Var.B.B).e0(-f2, -f3);
                }
            case 1:
                float[] fArr = (float[]) obj4;
                l75 l75Var = (l75) obj3;
                k75 k75Var = (k75) obj2;
                wi4 wi4Var = (wi4) obj;
                int i2 = wi4Var.b;
                qi qiVar = wi4Var.a;
                int i3 = wi4Var.c;
                long j3 = this.B;
                if (i2 > vr6.f(j3)) {
                    f = wi4Var.b;
                } else {
                    f = vr6.f(j3);
                }
                if (i3 >= vr6.e(j3)) {
                    i3 = vr6.e(j3);
                }
                long g = ve2.g(wi4Var.d(f), wi4Var.d(i3));
                int i4 = l75Var.A;
                jr6 jr6Var = qiVar.d;
                int f4 = vr6.f(g);
                int e = vr6.e(g);
                Layout layout = jr6Var.f;
                int length = layout.getText().length();
                if (f4 < 0) {
                    nz2.a("startOffset must be > 0");
                }
                if (f4 >= length) {
                    nz2.a("startOffset must be less than text length");
                }
                if (e <= f4) {
                    nz2.a("endOffset must be greater than startOffset");
                }
                if (e > length) {
                    nz2.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (e - f4) * 4) {
                    nz2.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(f4);
                int lineForOffset2 = layout.getLineForOffset(e - 1);
                es2 es2Var = new es2(jr6Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int f5 = jr6Var.f(lineForOffset);
                        int max = Math.max(f4, lineStart);
                        int min = Math.min(e, f5);
                        float g2 = jr6Var.g(lineForOffset);
                        float e2 = jr6Var.e(lineForOffset);
                        j = g;
                        int i5 = i4;
                        boolean z3 = false;
                        if (layout.getParagraphDirection(lineForOffset) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (z && !isRtlCharAt) {
                                a = es2Var.a(max, z3, z3, true);
                                z2 = z;
                                a2 = es2Var.a(max + 1, true, true, true);
                            } else {
                                if (z && isRtlCharAt) {
                                    z3 = false;
                                    float a3 = es2Var.a(max, false, false, false);
                                    z2 = z;
                                    a = es2Var.a(max + 1, true, true, false);
                                    a2 = a3;
                                } else {
                                    z2 = z;
                                    z3 = false;
                                    if (!z2 && isRtlCharAt) {
                                        a2 = es2Var.a(max, false, false, true);
                                        a = es2Var.a(max + 1, true, true, true);
                                    } else {
                                        a = es2Var.a(max, false, false, false);
                                        a2 = es2Var.a(max + 1, true, true, false);
                                    }
                                }
                                fArr[i5] = a;
                                fArr[i5 + 1] = g2;
                                fArr[i5 + 2] = a2;
                                fArr[i5 + 3] = e2;
                                i5 += 4;
                                max++;
                                z = z2;
                            }
                            z3 = false;
                            fArr[i5] = a;
                            fArr[i5 + 1] = g2;
                            fArr[i5 + 2] = a2;
                            fArr[i5 + 3] = e2;
                            i5 += 4;
                            max++;
                            z = z2;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            g = j;
                            i4 = i5;
                        }
                    }
                } else {
                    j = g;
                }
                int d = (vr6.d(j) * 4) + l75Var.A;
                for (int i6 = l75Var.A; i6 < d; i6 += 4) {
                    int i7 = i6 + 1;
                    float f6 = fArr[i7];
                    float f7 = k75Var.A;
                    fArr[i7] = f6 + f7;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f7;
                }
                l75Var.A = d;
                k75Var.A = qiVar.b() + k75Var.A;
                return o27Var;
            default:
                ex4 ex4Var = (ex4) obj4;
                ae6 ae6Var = (ae6) obj3;
                long j4 = this.B;
                vi viVar = (vi) obj2;
                hk1 hk1Var = (hk1) obj;
                float a4 = ex4Var.a() / ex4Var.g.h();
                float f8 = RecyclerView.A1;
                float max2 = (Math.max(Math.min(1.0f, a4) - 0.4f, (float) RecyclerView.A1) * 5.0f) / 3.0f;
                float abs = Math.abs(a4) - 1.0f;
                if (abs >= RecyclerView.A1) {
                    f8 = abs;
                }
                if (f8 > 2.0f) {
                    f8 = 2.0f;
                }
                float pow = (((0.4f * max2) - 0.25f) + (f8 - (((float) Math.pow(f8, 2.0d)) / 4.0f))) * 0.5f;
                float f9 = pow * 360.0f;
                float f10 = ((0.8f * max2) + pow) * 360.0f;
                float min2 = Math.min(1.0f, max2);
                ?? obj5 = new Object();
                obj5.a = f10;
                obj5.b = min2;
                float floatValue = ((Number) ae6Var.getValue()).floatValue();
                long f0 = hk1Var.f0();
                os I = hk1Var.I();
                long E = I.E();
                I.s().m();
                try {
                    ((bq0) I.B).c0(pow, f0);
                    float C = hk1Var.C(bx4.b);
                    float f11 = bx4.c;
                    float C2 = (hk1Var.C(f11) / 2.0f) + C;
                    y55 y55Var2 = new y55(Float.intBitsToFloat((int) (mj2.y(hk1Var.d()) >> 32)) - C2, Float.intBitsToFloat((int) (mj2.y(hk1Var.d()) & 4294967295L)) - C2, Float.intBitsToFloat((int) (mj2.y(hk1Var.d()) >> 32)) + C2, Float.intBitsToFloat((int) (mj2.y(hk1Var.d()) & 4294967295L)) + C2);
                    hk1.h0(hk1Var, j4, f9, f10 - f9, y55Var2.d(), y55Var2.c(), floatValue, new hh6(hk1Var.C(f11), RecyclerView.A1, 2, 0, null, 26), 768);
                    bx4.c(hk1Var, viVar, y55Var2, j4, floatValue, obj5);
                    return o27Var;
                } finally {
                    wh1.u(I, E);
                }
        }
    }

    public /* synthetic */ b40(Object obj, Object obj2, long j, Object obj3, int i) {
        this.A = i;
        this.L = obj;
        this.R = obj2;
        this.B = j;
        this.X = obj3;
    }
}
