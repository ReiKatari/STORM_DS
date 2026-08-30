package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sf  reason: default package */
/* loaded from: classes.dex */
public final class sf extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ if1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf(if1 if1Var, int i) {
        super(1);
        this.B = i;
        this.L = if1Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        if1 if1Var = this.L;
        switch (i) {
            case 0:
                ch1 ch1Var = (ch1) obj;
                if1Var.show();
                return new y3(2, if1Var);
            default:
                fc4 fc4Var = (fc4) obj;
                if (if1Var.Y.a) {
                    if1Var.X.c();
                }
                return o27.a;
        }
    }
}
