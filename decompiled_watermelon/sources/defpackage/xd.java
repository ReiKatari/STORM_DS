package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xd  reason: default package */
/* loaded from: classes.dex */
public final class xd extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ n75 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd(int i, n75 n75Var) {
        super(1);
        this.B = i;
        this.L = n75Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        int i = this.B;
        n75 n75Var = this.L;
        switch (i) {
            case 0:
                n75Var.A = (ed2) obj;
                return Boolean.TRUE;
            case 1:
                ms2 ms2Var = (ms2) obj;
                Object obj2 = n75Var.A;
                if (obj2 == null && ms2Var.l0) {
                    n75Var.A = ms2Var;
                } else if (obj2 != null) {
                    ms2Var.getClass();
                }
                return Boolean.TRUE;
            default:
                zx6 zx6Var = (zx6) obj;
                if (((yy3) zx6Var).A.i0) {
                    n75Var.A = zx6Var;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
