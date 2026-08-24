package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gw5  reason: default package */
/* loaded from: classes.dex */
public final class gw5 extends hw6 implements go2 {
    public /* synthetic */ String X;
    public /* synthetic */ String Y;
    public /* synthetic */ boolean Z;

    /* JADX WARN: Type inference failed for: r4v2, types: [gw5, hw6] */
    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ?? hw6Var = new hw6(4, (r41) obj4);
        hw6Var.X = (String) obj;
        hw6Var.Y = (String) obj2;
        hw6Var.Z = booleanValue;
        return hw6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        String str = this.X;
        String str2 = this.Y;
        boolean z = this.Z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        return new oc7(str, str2, Boolean.valueOf(z));
    }
}
