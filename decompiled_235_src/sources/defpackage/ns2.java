package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ns2  reason: default package */
/* loaded from: classes.dex */
public final class ns2 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qn2 B;

    public /* synthetic */ ns2(int i, qn2 qn2Var) {
        this.A = i;
        this.B = qn2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        long j;
        switch (this.A) {
            case 0:
                zl6 zl6Var = (zl6) obj;
                synchronized (bm6.c) {
                    j = bm6.e;
                    bm6.e = 1 + j;
                }
                return new ce5(j, zl6Var, this.B);
            default:
                return this.B.g(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
