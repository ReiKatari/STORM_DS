package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gg7  reason: default package */
/* loaded from: classes.dex */
public final class gg7 extends hw6 implements go2 {
    public int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;

    /* JADX WARN: Type inference failed for: r4v2, types: [hw6, gg7] */
    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        ne2 ne2Var = (ne2) obj;
        long longValue = ((Number) obj3).longValue();
        ?? hw6Var = new hw6(4, (r41) obj4);
        hw6Var.Y = (Throwable) obj2;
        hw6Var.Z = longValue;
        return hw6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            Throwable th = this.Y;
            long j = this.Z;
            ga0.f().e(hg7.a, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, hg7.b);
            this.X = 1;
            if (q60.t(min, this) == x61Var) {
                return x61Var;
            }
        }
        return Boolean.TRUE;
    }
}
