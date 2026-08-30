package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cd4  reason: default package */
/* loaded from: classes.dex */
public final class cd4 extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ed2 L;
    public final /* synthetic */ ed2 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ zm Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd4(ed2 ed2Var, ed2 ed2Var2, Object obj, int i, zm zmVar, int i2) {
        super(1);
        this.B = i2;
        this.L = ed2Var;
        this.R = ed2Var2;
        this.Z = obj;
        this.X = i;
        this.Y = zmVar;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        zm zmVar = this.Y;
        int i2 = this.X;
        Object obj2 = this.Z;
        ed2 ed2Var = this.R;
        ed2 ed2Var2 = this.L;
        switch (i) {
            case 0:
                e20 e20Var = (e20) obj;
                if (ed2Var2 != ((nc2) ((ee) l.Q(ed2Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean F = ep2.F(ed2Var, (ed2) obj2, i2, zmVar);
                Boolean valueOf = Boolean.valueOf(F);
                if (!F && e20Var.a()) {
                    return null;
                }
                return valueOf;
            default:
                e20 e20Var2 = (e20) obj;
                if (ed2Var2 != ((nc2) ((ee) l.Q(ed2Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean Q = mj2.Q(i2, zmVar, ed2Var, (y55) obj2);
                Boolean valueOf2 = Boolean.valueOf(Q);
                if (!Q && e20Var2.a()) {
                    return null;
                }
                return valueOf2;
        }
    }
}
