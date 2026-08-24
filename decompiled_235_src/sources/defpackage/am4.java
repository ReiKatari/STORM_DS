package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: am4  reason: default package */
/* loaded from: classes.dex */
public final class am4 extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ vh2 L;
    public final /* synthetic */ vh2 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ ln Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am4(vh2 vh2Var, vh2 vh2Var2, Object obj, int i, ln lnVar, int i2) {
        super(1);
        this.B = i2;
        this.L = vh2Var;
        this.R = vh2Var2;
        this.Z = obj;
        this.X = i;
        this.Y = lnVar;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        ln lnVar = this.Y;
        int i2 = this.X;
        Object obj2 = this.Z;
        vh2 vh2Var = this.R;
        vh2 vh2Var2 = this.L;
        switch (i) {
            case 0:
                z30 z30Var = (z30) obj;
                if (vh2Var2 != ((eh2) ((te) nc1.g0(vh2Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean T = ej2.T(vh2Var, (vh2) obj2, i2, lnVar);
                Boolean valueOf = Boolean.valueOf(T);
                if (!T && z30Var.a()) {
                    return null;
                }
                return valueOf;
            default:
                z30 z30Var2 = (z30) obj;
                if (vh2Var2 != ((eh2) ((te) nc1.g0(vh2Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean b0 = uj2.b0(i2, lnVar, vh2Var, (of5) obj2);
                Boolean valueOf2 = Boolean.valueOf(b0);
                if (!b0 && z30Var2.a()) {
                    return null;
                }
                return valueOf2;
        }
    }
}
