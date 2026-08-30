package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y46  reason: default package */
/* loaded from: classes.dex */
public final class y46 extends nk6 implements dj2 {
    public /* synthetic */ p46 X;
    public /* synthetic */ String Y;
    public /* synthetic */ Map Z;
    public /* synthetic */ boolean c0;
    public final /* synthetic */ b56 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y46(b56 b56Var, j11 j11Var) {
        super(5, j11Var);
        this.d0 = b56Var;
    }

    @Override // defpackage.dj2
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        y46 y46Var = new y46(this.d0, (j11) obj5);
        y46Var.X = (p46) obj;
        y46Var.Y = (String) obj2;
        y46Var.Z = (Map) obj3;
        y46Var.c0 = booleanValue;
        return y46Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p46 p46Var = this.X;
        String str = this.Y;
        Map map = this.Z;
        boolean z = this.c0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        ue5 ue5Var = b56.l;
        return this.d0.z(p46Var, str, map, z);
    }
}
