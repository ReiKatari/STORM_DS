package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh1  reason: default package */
/* loaded from: classes.dex */
public final class dh1 implements lt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dh1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lt0
    public final long a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                eh1 eh1Var = (eh1) obj;
                long a = eh1Var.p0.a();
                if (a == 16) {
                    fq5 fq5Var = (fq5) hf.K(eh1Var, jq5.a);
                    if (fq5Var != null) {
                        long j = fq5Var.a;
                        if (j != 16) {
                            return j;
                        }
                    }
                    long j2 = ((kt0) hf.K(eh1Var, j31.a)).a;
                    boolean k = ((ut0) hf.K(eh1Var, vt0.a)).k();
                    float N = hv.N(j2);
                    if (!k && N < 0.5d) {
                        return kt0.d;
                    }
                    return j2;
                }
                return a;
            default:
                return ((kq5) obj).c;
        }
    }
}
