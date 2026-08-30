package d5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final double[] f3827e;

    /* renamed from: f  reason: collision with root package name */
    public final a[] f3828f;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r5 == r3) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, d5.b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, d5.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int[] r33, double[] r34, double[][] r35) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.b.<init>(int[], double[], double[][]):void");
    }

    @Override // ij.a
    public final double Z(double d4) {
        a[] aVarArr = this.f3828f;
        a aVar = aVarArr[0];
        double d10 = aVar.f3812c;
        if (d4 < d10) {
            double d11 = d4 - d10;
            if (aVar.f3826r) {
                return (d11 * aVarArr[0].f3821l) + aVar.c(d10);
            }
            aVar.g(d10);
            return (aVarArr[0].a() * d11) + aVarArr[0].e();
        } else if (d4 > aVarArr[aVarArr.length - 1].f3813d) {
            double d12 = aVarArr[aVarArr.length - 1].f3813d;
            double d13 = d4 - d12;
            int length = aVarArr.length - 1;
            return (d13 * aVarArr[length].f3821l) + aVarArr[length].c(d12);
        } else {
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                a aVar2 = aVarArr[i2];
                if (d4 <= aVar2.f3813d) {
                    if (aVar2.f3826r) {
                        return aVar2.c(d4);
                    }
                    aVar2.g(d4);
                    return aVarArr[i2].e();
                }
            }
            return Double.NaN;
        }
    }

    @Override // ij.a
    public final void a0(double d4, double[] dArr) {
        a[] aVarArr = this.f3828f;
        a aVar = aVarArr[0];
        double d10 = aVar.f3812c;
        if (d4 < d10) {
            double d11 = d4 - d10;
            if (aVar.f3826r) {
                double c4 = aVar.c(d10);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.f3821l * d11) + c4;
                dArr[1] = (d11 * aVarArr[0].m) + aVar2.d(d10);
                return;
            }
            aVar.g(d10);
            dArr[0] = (aVarArr[0].a() * d11) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d11) + aVarArr[0].f();
        } else if (d4 > aVarArr[aVarArr.length - 1].f3813d) {
            double d12 = aVarArr[aVarArr.length - 1].f3813d;
            double d13 = d4 - d12;
            int length = aVarArr.length - 1;
            a aVar3 = aVarArr[length];
            if (aVar3.f3826r) {
                double c10 = aVar3.c(d12);
                a aVar4 = aVarArr[length];
                dArr[0] = (aVar4.f3821l * d13) + c10;
                dArr[1] = (d13 * aVarArr[length].m) + aVar4.d(d12);
                return;
            }
            aVar3.g(d4);
            dArr[0] = (aVarArr[length].a() * d13) + aVarArr[length].e();
            dArr[1] = (aVarArr[length].b() * d13) + aVarArr[length].f();
        } else {
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                a aVar5 = aVarArr[i2];
                if (d4 <= aVar5.f3813d) {
                    if (aVar5.f3826r) {
                        dArr[0] = aVar5.c(d4);
                        dArr[1] = aVarArr[i2].d(d4);
                        return;
                    }
                    aVar5.g(d4);
                    dArr[0] = aVarArr[i2].e();
                    dArr[1] = aVarArr[i2].f();
                    return;
                }
            }
        }
    }

    @Override // ij.a
    public final void b0(double d4, float[] fArr) {
        a[] aVarArr = this.f3828f;
        a aVar = aVarArr[0];
        double d10 = aVar.f3812c;
        if (d4 < d10) {
            double d11 = d4 - d10;
            if (aVar.f3826r) {
                double c4 = aVar.c(d10);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.f3821l * d11) + c4);
                fArr[1] = (float) ((d11 * aVarArr[0].m) + aVar2.d(d10));
                return;
            }
            aVar.g(d10);
            fArr[0] = (float) ((aVarArr[0].a() * d11) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d11) + aVarArr[0].f());
        } else if (d4 > aVarArr[aVarArr.length - 1].f3813d) {
            double d12 = aVarArr[aVarArr.length - 1].f3813d;
            double d13 = d4 - d12;
            int length = aVarArr.length - 1;
            a aVar3 = aVarArr[length];
            if (aVar3.f3826r) {
                double c10 = aVar3.c(d12);
                a aVar4 = aVarArr[length];
                fArr[0] = (float) ((aVar4.f3821l * d13) + c10);
                fArr[1] = (float) ((d13 * aVarArr[length].m) + aVar4.d(d12));
                return;
            }
            aVar3.g(d4);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                a aVar5 = aVarArr[i2];
                if (d4 <= aVar5.f3813d) {
                    if (aVar5.f3826r) {
                        fArr[0] = (float) aVar5.c(d4);
                        fArr[1] = (float) aVarArr[i2].d(d4);
                        return;
                    }
                    aVar5.g(d4);
                    fArr[0] = (float) aVarArr[i2].e();
                    fArr[1] = (float) aVarArr[i2].f();
                    return;
                }
            }
        }
    }

    @Override // ij.a
    public final void e0(double d4, double[] dArr) {
        a[] aVarArr = this.f3828f;
        double d10 = aVarArr[0].f3812c;
        if (d4 < d10) {
            d4 = d10;
        } else if (d4 > aVarArr[aVarArr.length - 1].f3813d) {
            d4 = aVarArr[aVarArr.length - 1].f3813d;
        }
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            a aVar = aVarArr[i2];
            if (d4 <= aVar.f3813d) {
                if (aVar.f3826r) {
                    dArr[0] = aVar.f3821l;
                    dArr[1] = aVar.m;
                    return;
                }
                aVar.g(d4);
                dArr[0] = aVarArr[i2].a();
                dArr[1] = aVarArr[i2].b();
                return;
            }
        }
    }

    @Override // ij.a
    public final double[] h0() {
        return this.f3827e;
    }
}
