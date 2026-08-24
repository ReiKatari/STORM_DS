package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh2  reason: default package */
/* loaded from: classes.dex */
public final class dh2 extends aj3 implements qn2 {
    public final /* synthetic */ dh5 B;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh2(int i, dh5 dh5Var) {
        super(1);
        this.B = dh5Var;
        this.L = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        Boolean valueOf = Boolean.valueOf(((vh2) obj).Y0(this.L));
        this.B.A = valueOf;
        return valueOf;
    }
}
