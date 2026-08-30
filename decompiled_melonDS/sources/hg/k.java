package hg;

import android.net.Uri;
import cd.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kf.r0;
import mc.p;
import yb.y;
import zc.g0;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ l Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ oe.a f6500b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, oe.a aVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = lVar;
        this.f6500b0 = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((k) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((k) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new k(this.Z, this.f6500b0, cVar, 0);
            default:
                return new k(this.Z, this.f6500b0, cVar, 1);
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        Object value;
        ArrayList q02;
        Object value2;
        ArrayList q03;
        int i2 = this.X;
        Object obj2 = y.f14813a;
        l lVar = this.Z;
        oe.a aVar = this.f6500b0;
        switch (i2) {
            case 0:
                Object obj3 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                        return obj2;
                    }
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p7.j.I(obj);
                r0 r0Var = lVar.f6501b;
                this.Y = 1;
                q1 q1Var = r0Var.f8267e;
                if (aVar.f10905a == null) {
                    UUID randomUUID = UUID.randomUUID();
                    String str = aVar.f10906b;
                    Uri uri = aVar.f10907c;
                    str.getClass();
                    uri.getClass();
                    oe.a aVar2 = new oe.a(randomUUID, str, uri);
                    do {
                        value2 = q1Var.getValue();
                        q03 = zb.l.q0((List) value2);
                        q03.add(new sd.b(false, aVar2));
                    } while (!q1Var.i(value2, q03));
                } else {
                    Iterator it = ((List) q1Var.getValue()).iterator();
                    int i11 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (!nc.k.a(((oe.a) ((sd.b) it.next()).f12866a).f10905a, aVar.f10905a)) {
                                i11++;
                            }
                        } else {
                            i11 = -1;
                        }
                    }
                    do {
                        value = q1Var.getValue();
                        List list = (List) value;
                        if (i11 >= 0) {
                            q02 = zb.l.q0(list);
                            q02.set(i11, new sd.b(false, aVar));
                        } else {
                            q02 = zb.l.q0(list);
                            q02.add(new sd.b(false, aVar));
                        }
                    } while (!q1Var.i(value, q02));
                }
                gd.f fVar = g0.f15015a;
                Object F = x.F(gd.e.L, new a9.k(7, null, r0Var), this);
                Object obj4 = dc.a.COROUTINE_SUSPENDED;
                Object obj5 = F;
                if (F != obj4) {
                    obj5 = obj2;
                }
                if (obj5 != obj4) {
                    obj5 = obj2;
                }
                if (obj5 == obj3) {
                    return obj3;
                }
                return obj2;
            default:
                q1 q1Var2 = lVar.f6505f;
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    r0 r0Var2 = lVar.f6501b;
                    this.Y = 1;
                    if (r0Var2.a(aVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                if (nc.k.a(aVar.f10905a, q1Var2.getValue())) {
                    q1Var2.j(null);
                    return obj2;
                }
                return obj2;
        }
    }
}
