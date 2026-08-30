package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sk  reason: default package */
/* loaded from: classes.dex */
public final class sk extends k11 {
    public nc5 R;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dl Z;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.Z = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.Y = obj;
        this.c0 |= Integer.MIN_VALUE;
        Object v = this.Z.v(null, null, this);
        if (v == p31.COROUTINE_SUSPENDED) {
            return v;
        }
        return new nc5(v);
    }
}
