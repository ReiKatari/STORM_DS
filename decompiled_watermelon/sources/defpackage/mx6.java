package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mx6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mx6 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ kx6 B;

    public /* synthetic */ mx6(kx6 kx6Var, int i) {
        this.A = i;
        this.B = kx6Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        kx6 kx6Var = this.B;
        ch1 ch1Var = (ch1) obj;
        switch (i) {
            case 0:
                return new nx6(kx6Var, 0);
            default:
                return new nx6(kx6Var, 1);
        }
    }
}
