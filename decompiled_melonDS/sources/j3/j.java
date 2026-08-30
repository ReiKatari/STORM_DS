package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final s f7381a = new s(0.31006f, 0.31616f);

    /* renamed from: b  reason: collision with root package name */
    public static final s f7382b = new s(0.34567f, 0.3585f);

    /* renamed from: c  reason: collision with root package name */
    public static final s f7383c = new s(0.32168f, 0.33767f);

    /* renamed from: d  reason: collision with root package name */
    public static final s f7384d = new s(0.31271f, 0.32902f);

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f7385e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        if (b.a(cVar.f7347b, b.f7341a)) {
            q qVar = (q) cVar;
            s sVar = qVar.f7392d;
            s sVar2 = f7382b;
            if (!d(sVar, sVar2)) {
                return new q(qVar.f7346a, qVar.f7396h, sVar2, g(c(a.f7339b.f7340a, sVar.a(), sVar2.a()), qVar.f7397i), qVar.f7399k, qVar.f7401n, qVar.f7393e, qVar.f7394f, qVar.f7395g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f8 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = (((((f11 * f14) + ((f10 * f13) + (f8 * f12))) - (f12 * f13)) - (f10 * f11)) - (f8 * f14)) * 0.5f;
        if (f15 < 0.0f) {
            return -f15;
        }
        return f15;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] f8 = f(fArr);
        float f10 = fArr4[0];
        float f11 = fArr[0] * f10;
        float f12 = fArr4[1];
        float f13 = fArr[1] * f12;
        float f14 = fArr4[2];
        return g(f8, new float[]{f11, f13, fArr[2] * f14, fArr[3] * f10, fArr[4] * f12, fArr[5] * f14, f10 * fArr[6], f12 * fArr[7], f14 * fArr[8]});
    }

    public static final boolean d(s sVar, s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        if (Math.abs(sVar.f7412a - sVar2.f7412a) < 0.001f && Math.abs(sVar.f7413b - sVar2.f7413b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final g e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new g(cVar, cVar, 1);
        }
        long j2 = cVar.f7347b;
        long j10 = b.f7341a;
        if (b.a(j2, j10) && b.a(cVar2.f7347b, j10)) {
            return new f((q) cVar, (q) cVar2);
        }
        return new g(cVar, cVar2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f8 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f8 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f8) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f8)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f8)) / f21;
        fArr2[8] = ((f8 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f8 = fArr[3];
        float f10 = fArr2[1];
        float f11 = fArr[6];
        float f12 = fArr2[2];
        float f13 = f11 * f12;
        fArr3[0] = f13 + (f8 * f10) + (fArr[0] * fArr2[0]);
        float f14 = fArr[1];
        float f15 = fArr2[0];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = f17 * f12;
        fArr3[1] = f18 + (f10 * f16) + (f14 * f15);
        float f19 = fArr[5];
        float f20 = fArr2[1] * f19;
        float f21 = fArr[8];
        fArr3[2] = (f12 * f21) + f20 + (fArr[2] * f15);
        float f22 = fArr[0];
        float f23 = fArr2[4];
        float f24 = (f8 * f23) + (fArr2[3] * f22);
        float f25 = fArr2[5];
        fArr3[3] = (f11 * f25) + f24;
        float f26 = fArr[1];
        float f27 = fArr2[3];
        float f28 = f16 * f23;
        fArr3[4] = (f17 * f25) + f28 + (f26 * f27);
        float f29 = fArr[2];
        float f30 = f25 * f21;
        fArr3[5] = f30 + (f19 * fArr2[4]) + (f27 * f29);
        float f31 = f22 * fArr2[6];
        float f32 = fArr[3];
        float f33 = fArr2[7];
        float f34 = (f32 * f33) + f31;
        float f35 = fArr2[8];
        fArr3[6] = (f11 * f35) + f34;
        float f36 = fArr2[6];
        float f37 = f17 * f35;
        fArr3[7] = f37 + (fArr[4] * f33) + (f26 * f36);
        float f38 = f21 * f35;
        fArr3[8] = f38 + (fArr[5] * fArr2[7]) + (f29 * f36);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f8 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f8);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f8);
        float f12 = fArr[5] * f10;
        fArr2[2] = (fArr[8] * f11) + f12 + (fArr[2] * f8);
        return fArr2;
    }
}
