package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c53  reason: default package */
/* loaded from: classes.dex */
public final class c53 extends ic5 {
    public int B;
    public final /* synthetic */ aj2 L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c53(aj2 aj2Var, Object obj, j11 j11Var) {
        super(j11Var);
        this.L = aj2Var;
        this.R = obj;
        j11Var.getClass();
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.B;
        if (i != 0) {
            if (i == 1) {
                this.B = 2;
                me2.a0(obj);
                return obj;
            }
            i.n("This coroutine had already completed");
            return null;
        }
        this.B = 1;
        me2.a0(obj);
        aj2 aj2Var = this.L;
        aj2Var.getClass();
        l07.q(2, aj2Var);
        return aj2Var.j(this.R, this);
    }
}
