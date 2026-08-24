package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz3  reason: default package */
/* loaded from: classes.dex */
public final class iz3 implements qh1 {
    public boolean A;
    public long B = 9223372034707292159L;
    public long L = 0;
    public final /* synthetic */ kz3 R;

    public iz3(kz3 kz3Var) {
        this.R = kz3Var;
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.R.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.R.a();
    }

    public final void b(hy2 hy2Var, float f) {
        kz3 kz3Var = this.R;
        z9 z9Var = kz3Var.i0;
        if (z9Var == null) {
            z9Var = new z9();
            kz3Var.i0 = z9Var;
        }
        int K0 = fv.K0((hy2[]) z9Var.b, hy2Var);
        if (K0 < 0) {
            int i = z9Var.a;
            hy2[] hy2VarArr = (hy2[]) z9Var.b;
            if (i == hy2VarArr.length) {
                int i2 = i * 2;
                z9Var.b = (hy2[]) Arrays.copyOf(hy2VarArr, i2);
                z9Var.c = Arrays.copyOf((float[]) z9Var.c, i2);
                z9Var.d = Arrays.copyOf((byte[]) z9Var.d, i2);
            }
            ((hy2[]) z9Var.b)[i] = hy2Var;
            ((byte[]) z9Var.d)[i] = 3;
            ((float[]) z9Var.c)[i] = f;
            z9Var.a++;
            return;
        }
        float[] fArr = (float[]) z9Var.c;
        if (fArr[K0] == f) {
            byte[] bArr = (byte[]) z9Var.d;
            if (bArr[K0] == 2) {
                bArr[K0] = 0;
                return;
            }
            return;
        }
        fArr[K0] = f;
        ((byte[]) z9Var.d)[K0] = 1;
    }
}
