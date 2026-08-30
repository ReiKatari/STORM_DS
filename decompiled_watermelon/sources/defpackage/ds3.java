package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ds3  reason: default package */
/* loaded from: classes.dex */
public final class ds3 implements od1 {
    public boolean A;
    public long B = 9223372034707292159L;
    public long L = 0;
    public final /* synthetic */ fs3 R;

    public ds3(fs3 fs3Var) {
        this.R = fs3Var;
    }

    public final void a(gs2 gs2Var, float f) {
        fs3 fs3Var = this.R;
        y9 y9Var = fs3Var.h0;
        if (y9Var == null) {
            y9Var = new y9();
            fs3Var.h0 = y9Var;
        }
        int w0 = nu.w0((gs2[]) y9Var.b, gs2Var);
        if (w0 < 0) {
            int i = y9Var.a;
            gs2[] gs2VarArr = (gs2[]) y9Var.b;
            if (i == gs2VarArr.length) {
                int i2 = i * 2;
                y9Var.b = (gs2[]) Arrays.copyOf(gs2VarArr, i2);
                y9Var.c = Arrays.copyOf((float[]) y9Var.c, i2);
                y9Var.d = Arrays.copyOf((byte[]) y9Var.d, i2);
            }
            ((gs2[]) y9Var.b)[i] = gs2Var;
            ((byte[]) y9Var.d)[i] = 3;
            ((float[]) y9Var.c)[i] = f;
            y9Var.a++;
            return;
        }
        float[] fArr = (float[]) y9Var.c;
        if (fArr[w0] == f) {
            byte[] bArr = (byte[]) y9Var.d;
            if (bArr[w0] == 2) {
                bArr[w0] = 0;
                return;
            }
            return;
        }
        fArr[w0] = f;
        ((byte[]) y9Var.d)[w0] = 1;
    }

    @Override // defpackage.od1
    public final float b() {
        return this.R.b();
    }

    @Override // defpackage.od1
    public final float o() {
        return this.R.o();
    }
}
