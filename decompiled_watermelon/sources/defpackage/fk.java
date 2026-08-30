package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fk  reason: default package */
/* loaded from: classes.dex */
public final class fk extends k11 {
    public /* synthetic */ Object R;
    public final /* synthetic */ dl X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.X = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object h = this.X.h(0L, this);
        if (h == p31.COROUTINE_SUSPENDED) {
            return h;
        }
        return new nc5(h);
    }
}
