package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kl0  reason: default package */
/* loaded from: classes.dex */
public final class kl0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ wc2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl0(wc2 wc2Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = wc2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                ((kl0) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 1:
                ((kl0) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 2:
                ((kl0) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            default:
                ((kl0) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new kl0(this.Y, j11Var, 0);
            case 1:
                return new kl0(this.Y, j11Var, 1);
            case 2:
                return new kl0(this.Y, j11Var, 2);
            default:
                return new kl0(this.Y, j11Var, 3);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        wc2 wc2Var = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                wc2.a(wc2Var);
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                wc2.a(wc2Var);
                return o27Var;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                wc2.a(wc2Var);
                return o27Var;
            default:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                wc2.a(wc2Var);
                return o27Var;
        }
    }
}
