package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vk  reason: default package */
/* loaded from: classes.dex */
public final class vk extends k11 {
    public /* synthetic */ Object R;
    public final /* synthetic */ dl X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.X = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object x = this.X.x(null, false, this);
        if (x == p31.COROUTINE_SUSPENDED) {
            return x;
        }
        return new nc5(x);
    }
}
