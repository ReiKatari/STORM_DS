package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yj3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yj3 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ak3 B;

    public /* synthetic */ yj3(ak3 ak3Var, int i) {
        this.A = i;
        this.B = ak3Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        ak3 ak3Var = this.B;
        switch (i) {
            case 0:
                ej3 ej3Var = (ej3) ak3Var.j0.c();
                int a = ej3Var.a();
                int i2 = 0;
                while (true) {
                    if (i2 < a) {
                        if (!ej3Var.c(i2).equals(obj)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                ej3 ej3Var2 = (ej3) ak3Var.j0.c();
                if (intValue < 0 || intValue >= ej3Var2.a()) {
                    StringBuilder s = wh1.s("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    s.append(ej3Var2.a());
                    s.append(')');
                    pz2.a(s.toString());
                }
                tq5.w(ak3Var.F0(), null, null, new k7(ak3Var, intValue, null, 2), 3);
                return Boolean.TRUE;
        }
    }
}
