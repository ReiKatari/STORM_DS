package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d53  reason: default package */
/* loaded from: classes.dex */
public final class d53 extends k11 {
    public int R;
    public final /* synthetic */ aj2 X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d53(j11 j11Var, e31 e31Var, aj2 aj2Var, Object obj) {
        super(j11Var, e31Var);
        this.X = aj2Var;
        this.Y = obj;
        j11Var.getClass();
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.R;
        if (i != 0) {
            if (i == 1) {
                this.R = 2;
                me2.a0(obj);
                return obj;
            }
            i.n("This coroutine had already completed");
            return null;
        }
        this.R = 1;
        me2.a0(obj);
        aj2 aj2Var = this.X;
        aj2Var.getClass();
        l07.q(2, aj2Var);
        return aj2Var.j(this.Y, this);
    }
}
