package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ie2  reason: default package */
/* loaded from: classes.dex */
public abstract class ie2 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile ec6 b = new ec6(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.f(115, new je2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.f(130, new je2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.f(150, new je2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.f(180, new je2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.f(200, new je2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.e(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        oz2.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static he2 a(float f) {
        float e;
        he2 he2Var;
        float f2;
        float[] fArr = a;
        if (f >= 1.03f) {
            int i = (int) (f * 100.0f);
            he2 he2Var2 = (he2) b.c(i);
            if (he2Var2 != null) {
                return he2Var2;
            }
            ec6 ec6Var = b;
            if (ec6Var.A) {
                jv3.j(ec6Var);
            }
            int l = pu.l(ec6Var.R, i, ec6Var.B);
            if (l >= 0) {
                return (he2) b.h(l);
            }
            int i2 = -(l + 1);
            int i3 = i2 - 1;
            if (i2 >= b.g()) {
                je2 je2Var = new je2(new float[]{1.0f}, new float[]{f});
                b(f, je2Var);
                return je2Var;
            }
            if (i3 < 0) {
                he2Var = new je2(fArr, fArr);
                e = 1.0f;
            } else {
                e = b.e(i3) / 100.0f;
                he2Var = (he2) b.h(i3);
            }
            float e2 = b.e(i2) / 100.0f;
            if (e == e2) {
                f2 = 0.0f;
            } else {
                f2 = (f - e) / (e2 - e);
            }
            float max = (Math.max((float) RecyclerView.A1, Math.min(1.0f, f2)) * 1.0f) + RecyclerView.A1;
            he2 he2Var3 = (he2) b.h(i2);
            float[] fArr2 = new float[9];
            for (int i4 = 0; i4 < 9; i4++) {
                float f3 = fArr[i4];
                float b2 = he2Var.b(f3);
                fArr2[i4] = ((he2Var3.b(f3) - b2) * max) + b2;
            }
            je2 je2Var2 = new je2(fArr, fArr2);
            b(f, je2Var2);
            return je2Var2;
        }
        return null;
    }

    public static void b(float f, je2 je2Var) {
        synchronized (c) {
            ec6 clone = b.clone();
            clone.f((int) (f * 100.0f), je2Var);
            b = clone;
        }
    }
}
