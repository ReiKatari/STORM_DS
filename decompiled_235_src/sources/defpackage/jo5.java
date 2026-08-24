package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jo5  reason: default package */
/* loaded from: classes.dex */
public final class jo5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ no5 d0;
    public final /* synthetic */ pq5 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo5(no5 no5Var, pq5 pq5Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = no5Var;
        this.e0 = pq5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((jo5) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((jo5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((jo5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        pq5 pq5Var = this.e0;
        no5 no5Var = this.d0;
        switch (i) {
            case 0:
                jo5 jo5Var = new jo5(no5Var, pq5Var, r41Var, 0);
                jo5Var.Z = obj;
                return jo5Var;
            case 1:
                jo5 jo5Var2 = new jo5(no5Var, pq5Var, r41Var, 1);
                jo5Var2.Z = obj;
                return jo5Var2;
            default:
                jo5 jo5Var3 = new jo5(no5Var, pq5Var, r41Var, 2);
                jo5Var3.Z = obj;
                return jo5Var3;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object em5Var;
        Object em5Var2;
        Object em5Var3;
        int i = this.X;
        Object obj2 = zt1.A;
        no5 no5Var = this.d0;
        switch (i) {
            case 0:
                w61 w61Var = (w61) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        pq5 pq5Var = this.e0;
                        this.Z = null;
                        this.Y = 1;
                        obj = no5Var.g(pq5Var, this);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    }
                    em5Var = (Set) obj;
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (hm5.a(em5Var) == null) {
                    return em5Var;
                }
                return du1.A;
            case 1:
                w61 w61Var2 = (w61) this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        this.Z = null;
                        this.Y = 1;
                        obj = no5Var.i(this);
                        if (obj == x61Var2) {
                            return x61Var2;
                        }
                    }
                    em5Var2 = (Map) obj;
                } catch (Throwable th2) {
                    em5Var2 = new em5(th2);
                }
                if (hm5.a(em5Var2) == null) {
                    obj2 = em5Var2;
                }
                return obj2;
            default:
                w61 w61Var3 = (w61) this.Z;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        this.Z = null;
                        this.Y = 1;
                        obj = no5Var.j(this);
                        if (obj == x61Var3) {
                            return x61Var3;
                        }
                    }
                    em5Var3 = (Map) obj;
                } catch (Throwable th3) {
                    em5Var3 = new em5(th3);
                }
                if (hm5.a(em5Var3) == null) {
                    obj2 = em5Var3;
                }
                return obj2;
        }
    }
}
