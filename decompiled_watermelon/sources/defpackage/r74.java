package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r74  reason: default package */
/* loaded from: classes.dex */
public class r74 {
    public final o24 a = new o24(new h74[16]);
    public final w14 b = new w14(10);

    public boolean a(cs3 cs3Var, rd3 rd3Var, k91 k91Var, boolean z) {
        o24 o24Var = this.a;
        Object[] objArr = o24Var.A;
        int i = o24Var.L;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((h74) objArr[i2]).a(cs3Var, rd3Var, k91Var, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        return z2;
    }

    public void b(k91 k91Var) {
        o24 o24Var = this.a;
        int i = o24Var.L;
        while (true) {
            i--;
            if (-1 < i) {
                if (((h74) o24Var.A[i]).d.B == 0) {
                    o24Var.l(i);
                }
            } else {
                return;
            }
        }
    }
}
