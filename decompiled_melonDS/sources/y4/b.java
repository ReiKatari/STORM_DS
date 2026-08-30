package y4;

import a1.r;
import a1.x0;
import x4.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f14771a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b  reason: collision with root package name */
    public static volatile x0 f14772b = new x0(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f14773c;

    static {
        Object[] objArr = new Object[0];
        f14773c = objArr;
        synchronized (objArr) {
            f14772b.f((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f14772b.f((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f14772b.f((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f14772b.f((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f14772b.f((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f14772b.e(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f8) {
        float e6;
        a aVar;
        float f10;
        float[] fArr = f14771a;
        if (f8 >= 1.03f) {
            int i2 = (int) (f8 * 100.0f);
            a aVar2 = (a) f14772b.c(i2);
            if (aVar2 != null) {
                return aVar2;
            }
            x0 x0Var = f14772b;
            if (x0Var.A) {
                r.a(x0Var);
            }
            int a10 = b1.a.a(x0Var.R, i2, x0Var.B);
            if (a10 >= 0) {
                return (a) f14772b.h(a10);
            }
            int i10 = -(a10 + 1);
            int i11 = i10 - 1;
            if (i10 >= f14772b.g()) {
                c cVar = new c(new float[]{1.0f}, new float[]{f8});
                b(f8, cVar);
                return cVar;
            }
            if (i11 < 0) {
                aVar = new c(fArr, fArr);
                e6 = 1.0f;
            } else {
                e6 = f14772b.e(i11) / 100.0f;
                aVar = (a) f14772b.h(i11);
            }
            float e10 = f14772b.e(i10) / 100.0f;
            if (e6 == e10) {
                f10 = 0.0f;
            } else {
                f10 = (f8 - e6) / (e10 - e6);
            }
            float max = (Math.max(0.0f, Math.min(1.0f, f10)) * 1.0f) + 0.0f;
            a aVar3 = (a) f14772b.h(i10);
            float[] fArr2 = new float[9];
            for (int i12 = 0; i12 < 9; i12++) {
                float f11 = fArr[i12];
                float b10 = aVar.b(f11);
                fArr2[i12] = ((aVar3.b(f11) - b10) * max) + b10;
            }
            c cVar2 = new c(fArr, fArr2);
            b(f8, cVar2);
            return cVar2;
        }
        return null;
    }

    public static void b(float f8, c cVar) {
        synchronized (f14773c) {
            x0 clone = f14772b.clone();
            clone.f((int) (f8 * 100.0f), cVar);
            f14772b = clone;
        }
    }
}
