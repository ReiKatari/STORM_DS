package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg4  reason: default package */
/* loaded from: classes.dex */
public class jg4 {
    public final ua4 a = new ua4(new zf4[16]);
    public final ca4 b = new ca4(10);

    public boolean a(hz3 hz3Var, jk3 jk3Var, yc1 yc1Var, boolean z) {
        ua4 ua4Var = this.a;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((zf4) objArr[i2]).a(hz3Var, jk3Var, yc1Var, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        return z2;
    }

    public void b(yc1 yc1Var) {
        ua4 ua4Var = this.a;
        int i = ua4Var.L;
        while (true) {
            i--;
            if (-1 < i) {
                if (((zf4) ua4Var.A[i]).d.B == 0) {
                    ua4Var.l(i);
                }
            } else {
                return;
            }
        }
    }
}
