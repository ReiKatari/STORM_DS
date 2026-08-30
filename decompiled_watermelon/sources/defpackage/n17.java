package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n17  reason: default package */
/* loaded from: classes.dex */
public final class n17 extends nk6 implements ej2 {
    public /* synthetic */ ip4 X;
    public /* synthetic */ w13 Y;
    public /* synthetic */ if4 Z;
    public /* synthetic */ List c0;
    public /* synthetic */ wd3 d0;

    public n17(j11 j11Var) {
        super(6, j11Var);
    }

    @Override // defpackage.ej2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        n17 n17Var = new n17((j11) obj6);
        n17Var.X = (ip4) obj;
        n17Var.Y = (w13) obj2;
        n17Var.Z = (if4) obj3;
        n17Var.c0 = (List) obj4;
        n17Var.d0 = (wd3) obj5;
        return n17Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        ip4 ip4Var = this.X;
        w13 w13Var = this.Y;
        if4 if4Var = this.Z;
        List list = this.c0;
        wd3 wd3Var = this.d0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        if (ip4Var != null && w13Var != null && if4Var != null && list != null && wd3Var != null) {
            return new o17(ip4Var, w13Var, if4Var, list, wd3Var);
        }
        return null;
    }
}
