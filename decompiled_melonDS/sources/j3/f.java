package j3;

import i3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e  reason: collision with root package name */
    public final q f7373e;

    /* renamed from: f  reason: collision with root package name */
    public final q f7374f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f7375g;

    public f(q qVar, q qVar2) {
        super(qVar2, qVar, qVar2, null);
        float[] g10;
        this.f7373e = qVar;
        this.f7374f = qVar2;
        float[] fArr = a.f7339b.f7340a;
        s sVar = qVar.f7392d;
        float[] fArr2 = qVar.f7397i;
        s sVar2 = qVar2.f7392d;
        float[] fArr3 = qVar2.f7398j;
        if (j.d(sVar, sVar2)) {
            g10 = j.g(fArr3, fArr2);
        } else {
            float[] a10 = sVar.a();
            float[] a11 = sVar2.a();
            s sVar3 = j.f7382b;
            g10 = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, a11, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f7397i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, a10, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f7375g = g10;
    }

    @Override // j3.g
    public final long a(long j2) {
        float h2 = i3.s.h(j2);
        float g10 = i3.s.g(j2);
        float e6 = i3.s.e(j2);
        float d4 = i3.s.d(j2);
        m mVar = this.f7373e.f7403p;
        float a10 = (float) mVar.a(h2);
        float a11 = (float) mVar.a(g10);
        float a12 = (float) mVar.a(e6);
        float[] fArr = this.f7375g;
        float f8 = (fArr[6] * a12) + (fArr[3] * a11) + (fArr[0] * a10);
        float f10 = (fArr[7] * a12) + (fArr[4] * a11) + (fArr[1] * a10);
        float f11 = fArr[2] * a10;
        float f12 = (fArr[8] * a12) + (fArr[5] * a11) + f11;
        q qVar = this.f7374f;
        float a13 = (float) qVar.m.a(f8);
        m mVar2 = qVar.m;
        return z.b(a13, (float) mVar2.a(f10), (float) mVar2.a(f12), d4, qVar);
    }
}
