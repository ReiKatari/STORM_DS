package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mc2  reason: default package */
/* loaded from: classes.dex */
public final class mc2 extends ic3 implements mi2 {
    public final /* synthetic */ n75 B;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc2(int i, n75 n75Var) {
        super(1);
        this.B = n75Var;
        this.L = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        Boolean valueOf = Boolean.valueOf(((ed2) obj).Y0(this.L));
        this.B.A = valueOf;
        return valueOf;
    }
}
