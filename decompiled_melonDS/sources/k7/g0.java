package k7;

import android.database.SQLException;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ m0 f8015b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(m0 m0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f8015b0 = m0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((g0) t((cc.c) obj2, (m7.k) obj)).v(yb.y.f14813a);
            default:
                return ((g0) t((cc.c) obj2, (c0) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                g0 g0Var = new g0(this.f8015b0, cVar, 0);
                g0Var.Z = obj;
                return g0Var;
            default:
                g0 g0Var2 = new g0(this.f8015b0, cVar, 1);
                g0Var2.Z = obj;
                return g0Var2;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        c0 c0Var;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                        return obj;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                this.Y = 1;
                Object a10 = m0.a(this.f8015b0, (m7.k) this.Z, this);
                if (a10 == aVar) {
                    return aVar;
                }
                return a10;
            default:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                p7.j.I(obj);
                                return (Set) obj;
                            }
                            a0.j.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0Var = (c0) this.Z;
                        p7.j.I(obj);
                    } else {
                        p7.j.I(obj);
                        c0Var = (c0) this.Z;
                        this.Z = c0Var;
                        this.Y = 1;
                        obj = c0Var.c(this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        b0 b0Var = b0.IMMEDIATE;
                        g0 g0Var = new g0(this.f8015b0, null, 0);
                        this.Z = null;
                        this.Y = 2;
                        obj = c0Var.d(b0Var, g0Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return zb.s.A;
        }
    }
}
