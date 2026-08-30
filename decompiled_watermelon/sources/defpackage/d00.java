package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d00  reason: default package */
/* loaded from: classes.dex */
public final class d00 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ e00 Z;
    public final /* synthetic */ vy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d00(e00 e00Var, vy vyVar, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = e00Var;
        this.c0 = vyVar;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((d00) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((d00) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        vy vyVar = this.c0;
        e00 e00Var = this.Z;
        switch (i) {
            case 0:
                return new d00(e00Var, vyVar, j11Var, 0);
            default:
                return new d00(e00Var, vyVar, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object value;
        ArrayList p1;
        Object value2;
        ArrayList p12;
        int i = this.X;
        Object obj2 = o27.a;
        e00 e00Var = this.Z;
        vy vyVar = this.c0;
        switch (i) {
            case 0:
                Object obj3 = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return obj2;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                z33 z33Var = e00Var.b;
                this.Y = 1;
                ee6 ee6Var = z33Var.f;
                if (vyVar.a == null) {
                    UUID randomUUID = UUID.randomUUID();
                    String str = vyVar.b;
                    Uri uri = vyVar.c;
                    str.getClass();
                    uri.getClass();
                    vy vyVar2 = new vy(randomUUID, str, uri);
                    do {
                        value2 = ee6Var.getValue();
                        p12 = tq0.p1((List) value2);
                        p12.add(new dd1(false, vyVar2));
                    } while (!ee6Var.j(value2, p12));
                } else {
                    Iterator it = ((List) ee6Var.getValue()).iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (!b53.x(((vy) ((dd1) it.next()).a).a, vyVar.a)) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    do {
                        value = ee6Var.getValue();
                        List list = (List) value;
                        if (i3 >= 0) {
                            p1 = tq0.p1(list);
                            p1.set(i3, new dd1(false, vyVar));
                        } else {
                            p1 = tq0.p1(list);
                            p1.add(new dd1(false, vyVar));
                        }
                    } while (!ee6Var.j(value, p1));
                }
                bb1 bb1Var = tg1.a;
                Object G = tq5.G(ha1.L, new x3(z33Var, (j11) null, 10), this);
                Object obj4 = p31.COROUTINE_SUSPENDED;
                Object obj5 = G;
                if (G != obj4) {
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
                ee6 ee6Var2 = e00Var.f;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    z33 z33Var2 = e00Var.b;
                    this.Y = 1;
                    if (z33Var2.a(vyVar, this) == p31Var) {
                        return p31Var;
                    }
                }
                if (b53.x(vyVar.a, ee6Var2.getValue())) {
                    ee6Var2.k(null);
                    return obj2;
                }
                return obj2;
        }
    }
}
