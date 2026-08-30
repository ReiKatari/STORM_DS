package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: im2  reason: default package */
/* loaded from: classes.dex */
public final class im2 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mi2 B;

    public /* synthetic */ im2(int i, mi2 mi2Var) {
        this.A = i;
        this.B = mi2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        long j;
        switch (this.A) {
            case 0:
                ka6 ka6Var = (ka6) obj;
                synchronized (ma6.c) {
                    j = ma6.e;
                    ma6.e = 1 + j;
                }
                return new p45(j, ka6Var, this.B);
            default:
                return this.B.n(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
