package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj2  reason: default package */
/* loaded from: classes.dex */
public abstract class gj2 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile un6 b = new un6(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e(115, new hj2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e(130, new hj2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e(150, new hj2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e(180, new hj2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e(MlKitException.CODE_SCANNER_UNAVAILABLE, new hj2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        r53.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static fj2 a(float f) {
        float d;
        fj2 fj2Var;
        float f2;
        float[] fArr = a;
        if (f >= 1.03f) {
            int i = (int) (f * 100.0f);
            fj2 fj2Var2 = (fj2) b.c(i);
            if (fj2Var2 != null) {
                return fj2Var2;
            }
            un6 un6Var = b;
            if (un6Var.A) {
                vy7.I(un6Var);
            }
            int v = g04.v(un6Var.R, i, un6Var.B);
            if (v >= 0) {
                return (fj2) b.g(v);
            }
            int i2 = -(v + 1);
            int i3 = i2 - 1;
            if (i2 >= b.f()) {
                hj2 hj2Var = new hj2(new float[]{1.0f}, new float[]{f});
                b(f, hj2Var);
                return hj2Var;
            }
            if (i3 < 0) {
                fj2Var = new hj2(fArr, fArr);
                d = 1.0f;
            } else {
                d = b.d(i3) / 100.0f;
                fj2Var = (fj2) b.g(i3);
            }
            float d2 = b.d(i2) / 100.0f;
            if (d == d2) {
                f2 = 0.0f;
            } else {
                f2 = (f - d) / (d2 - d);
            }
            float max = (Math.max((float) RecyclerView.B1, Math.min(1.0f, f2)) * 1.0f) + RecyclerView.B1;
            fj2 fj2Var3 = (fj2) b.g(i2);
            float[] fArr2 = new float[9];
            for (int i4 = 0; i4 < 9; i4++) {
                float f3 = fArr[i4];
                float b2 = fj2Var.b(f3);
                fArr2[i4] = ((fj2Var3.b(f3) - b2) * max) + b2;
            }
            hj2 hj2Var2 = new hj2(fArr, fArr2);
            b(f, hj2Var2);
            return hj2Var2;
        }
        return null;
    }

    public static void b(float f, hj2 hj2Var) {
        synchronized (c) {
            un6 clone = b.clone();
            clone.e((int) (f * 100.0f), hj2Var);
            b = clone;
        }
    }
}
