package a4;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 implements x4.c {
    public boolean A;
    public long B = 9223372034707292159L;
    public long L = 0;
    public final /* synthetic */ x0 R;

    public u0(x0 x0Var) {
        this.R = x0Var;
    }

    public final void a(y3.s sVar, float f8) {
        x0 x0Var = this.R;
        k2 k2Var = x0Var.f364g0;
        if (k2Var == null) {
            k2Var = new k2();
            x0Var.f364g0 = k2Var;
        }
        int A = zb.k.A((y3.s[]) k2Var.f249b, sVar);
        if (A < 0) {
            int i2 = k2Var.f248a;
            y3.s[] sVarArr = (y3.s[]) k2Var.f249b;
            if (i2 == sVarArr.length) {
                int i10 = i2 * 2;
                k2Var.f249b = (y3.s[]) Arrays.copyOf(sVarArr, i10);
                k2Var.f250c = Arrays.copyOf((float[]) k2Var.f250c, i10);
                k2Var.f251d = Arrays.copyOf((byte[]) k2Var.f251d, i10);
            }
            ((y3.s[]) k2Var.f249b)[i2] = sVar;
            ((byte[]) k2Var.f251d)[i2] = 3;
            ((float[]) k2Var.f250c)[i2] = f8;
            k2Var.f248a++;
            return;
        }
        float[] fArr = (float[]) k2Var.f250c;
        if (fArr[A] == f8) {
            byte[] bArr = (byte[]) k2Var.f251d;
            if (bArr[A] == 2) {
                bArr[A] = 0;
                return;
            }
            return;
        }
        fArr[A] = f8;
        ((byte[]) k2Var.f251d)[A] = 1;
    }

    @Override // x4.c
    public final float b() {
        return this.R.b();
    }

    @Override // x4.c
    public final float j() {
        return this.R.j();
    }
}
