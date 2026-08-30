package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ei5  reason: default package */
/* loaded from: classes.dex */
public final class ei5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ mi2 Y;
    public final /* synthetic */ kh5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei5(mi2 mi2Var, kh5 kh5Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = mi2Var;
        this.Z = kh5Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                ((ei5) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            default:
                ((ei5) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        kh5 kh5Var = this.Z;
        mi2 mi2Var = this.Y;
        switch (i) {
            case 0:
                return new ei5(mi2Var, kh5Var, j11Var, 0);
            default:
                return new ei5(mi2Var, kh5Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        kh5 kh5Var = this.Z;
        mi2 mi2Var = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                mi2Var.n(kh5Var.a);
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                mi2Var.n(kh5Var.a);
                return o27Var;
        }
    }
}
