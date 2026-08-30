package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rl5  reason: default package */
/* loaded from: classes.dex */
public final class rl5 extends nk6 implements cj2 {
    public /* synthetic */ String X;
    public /* synthetic */ String Y;
    public /* synthetic */ boolean Z;

    /* JADX WARN: Type inference failed for: r4v2, types: [nk6, rl5] */
    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ?? nk6Var = new nk6(4, (j11) obj4);
        nk6Var.X = (String) obj;
        nk6Var.Y = (String) obj2;
        nk6Var.Z = booleanValue;
        return nk6Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        String str = this.X;
        String str2 = this.Y;
        boolean z = this.Z;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        return new ty6(str, str2, Boolean.valueOf(z));
    }
}
