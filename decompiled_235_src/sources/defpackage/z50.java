package defpackage;

import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z50  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z50 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ z50(long j, float[] fArr, bh5 bh5Var, ah5 ah5Var) {
        this.A = 1;
        this.B = j;
        this.L = fArr;
        this.R = bh5Var;
        this.X = ah5Var;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, gv] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int f;
        long j;
        boolean z;
        boolean z2;
        float a;
        float a2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                of5 of5Var = (of5) obj4;
                dh5 dh5Var = (dh5) obj3;
                long j2 = this.B;
                z40 z40Var = (z40) obj2;
                um3 um3Var = (um3) obj;
                um3Var.b();
                float f2 = of5Var.a;
                float f3 = of5Var.b;
                zj0 zj0Var = um3Var.A;
                ((os0) zj0Var.B.B).g0(f2, f3);
                try {
                    no1.z(um3Var, (zh) dh5Var.A, j2, 0L, RecyclerView.B1, z40Var, 0, 890);
                    return jg7Var;
                } finally {
                    ((os0) zj0Var.B.B).g0(-f2, -f3);
                }
            case 1:
                float[] fArr = (float[]) obj4;
                bh5 bh5Var = (bh5) obj3;
                ah5 ah5Var = (ah5) obj2;
                yr4 yr4Var = (yr4) obj;
                int i2 = yr4Var.b;
                cj cjVar = yr4Var.a;
                int i3 = yr4Var.c;
                long j3 = this.B;
                if (i2 > k47.f(j3)) {
                    f = yr4Var.b;
                } else {
                    f = k47.f(j3);
                }
                if (i3 >= k47.e(j3)) {
                    i3 = k47.e(j3);
                }
                long f4 = jx2.f(yr4Var.d(f), yr4Var.d(i3));
                int i4 = bh5Var.A;
                y37 y37Var = cjVar.d;
                int f5 = k47.f(f4);
                int e = k47.e(f4);
                Layout layout = y37Var.f;
                int length = layout.getText().length();
                if (f5 < 0) {
                    q53.a("startOffset must be > 0");
                }
                if (f5 >= length) {
                    q53.a("startOffset must be less than text length");
                }
                if (e <= f5) {
                    q53.a("endOffset must be greater than startOffset");
                }
                if (e > length) {
                    q53.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (e - f5) * 4) {
                    q53.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(f5);
                int lineForOffset2 = layout.getLineForOffset(e - 1);
                fy2 fy2Var = new fy2(y37Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int f6 = y37Var.f(lineForOffset);
                        int max = Math.max(f5, lineStart);
                        int min = Math.min(e, f6);
                        float g = y37Var.g(lineForOffset);
                        float e2 = y37Var.e(lineForOffset);
                        j = f4;
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
                                a = fy2Var.a(max, z3, z3, true);
                                z2 = z;
                                a2 = fy2Var.a(max + 1, true, true, true);
                            } else {
                                if (z && isRtlCharAt) {
                                    z3 = false;
                                    float a3 = fy2Var.a(max, false, false, false);
                                    z2 = z;
                                    a = fy2Var.a(max + 1, true, true, false);
                                    a2 = a3;
                                } else {
                                    z2 = z;
                                    z3 = false;
                                    if (!z2 && isRtlCharAt) {
                                        a2 = fy2Var.a(max, false, false, true);
                                        a = fy2Var.a(max + 1, true, true, true);
                                    } else {
                                        a = fy2Var.a(max, false, false, false);
                                        a2 = fy2Var.a(max + 1, true, true, false);
                                    }
                                }
                                fArr[i5] = a;
                                fArr[i5 + 1] = g;
                                fArr[i5 + 2] = a2;
                                fArr[i5 + 3] = e2;
                                i5 += 4;
                                max++;
                                z = z2;
                            }
                            z3 = false;
                            fArr[i5] = a;
                            fArr[i5 + 1] = g;
                            fArr[i5 + 2] = a2;
                            fArr[i5 + 3] = e2;
                            i5 += 4;
                            max++;
                            z = z2;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            f4 = j;
                            i4 = i5;
                        }
                    }
                } else {
                    j = f4;
                }
                int d = (k47.d(j) * 4) + bh5Var.A;
                for (int i6 = bh5Var.A; i6 < d; i6 += 4) {
                    int i7 = i6 + 1;
                    float f7 = fArr[i7];
                    float f8 = ah5Var.A;
                    fArr[i7] = f7 + f8;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f8;
                }
                bh5Var.A = d;
                ah5Var.A = cjVar.b() + ah5Var.A;
                return jg7Var;
            default:
                n65 n65Var = (n65) obj4;
                pp6 pp6Var = (pp6) obj3;
                long j4 = this.B;
                hj hjVar = (hj) obj2;
                no1 no1Var = (no1) obj;
                float a4 = n65Var.a() / n65Var.g.h();
                float f9 = RecyclerView.B1;
                float max2 = (Math.max(Math.min(1.0f, a4) - 0.4f, (float) RecyclerView.B1) * 5.0f) / 3.0f;
                float abs = Math.abs(a4) - 1.0f;
                if (abs >= RecyclerView.B1) {
                    f9 = abs;
                }
                if (f9 > 2.0f) {
                    f9 = 2.0f;
                }
                float pow = (((0.4f * max2) - 0.25f) + (f9 - (((float) Math.pow(f9, 2.0d)) / 4.0f))) * 0.5f;
                float f10 = pow * 360.0f;
                float f11 = ((0.8f * max2) + pow) * 360.0f;
                float min2 = Math.min(1.0f, max2);
                ?? obj5 = new Object();
                obj5.a = f11;
                obj5.b = min2;
                float floatValue = ((Number) pp6Var.getValue()).floatValue();
                long t0 = no1Var.t0();
                bt i0 = no1Var.i0();
                long L = i0.L();
                i0.G().h();
                try {
                    ((os0) i0.B).e0(pow, t0);
                    float e0 = no1Var.e0(k65.b);
                    float f12 = k65.c;
                    float e02 = (no1Var.e0(f12) / 2.0f) + e0;
                    of5 of5Var2 = new of5(Float.intBitsToFloat((int) (ii2.v(no1Var.e()) >> 32)) - e02, Float.intBitsToFloat((int) (ii2.v(no1Var.e()) & 4294967295L)) - e02, Float.intBitsToFloat((int) (ii2.v(no1Var.e()) >> 32)) + e02, Float.intBitsToFloat((int) (ii2.v(no1Var.e()) & 4294967295L)) + e02);
                    no1.E(no1Var, j4, f10, f11 - f10, of5Var2.d(), of5Var2.c(), floatValue, new ys6(no1Var.e0(f12), RecyclerView.B1, 2, 0, null, 26), 768);
                    k65.c(no1Var, hjVar, of5Var2, j4, floatValue, obj5);
                    return jg7Var;
                } finally {
                    xg6.v(i0, L);
                }
        }
    }

    public /* synthetic */ z50(Object obj, Object obj2, long j, Object obj3, int i) {
        this.A = i;
        this.L = obj;
        this.R = obj2;
        this.B = j;
        this.X = obj3;
    }
}
