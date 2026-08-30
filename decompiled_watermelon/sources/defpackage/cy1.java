package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cy1  reason: default package */
/* loaded from: classes.dex */
public final class cy1 extends nk6 implements mi2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy1(Object obj, Object obj2, Object obj3, Object obj4, j11 j11Var, int i) {
        super(1, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
        this.d0 = obj3;
        this.e0 = obj4;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.c0;
        Object obj5 = this.Z;
        switch (i) {
            case 0:
                return new cy1((hv1) obj5, (String) obj4, (String) obj3, (String) obj2, (j11) obj, 0).v(o27Var);
            default:
                return new cy1((t47) obj5, (m47) obj4, (Map) obj3, (bw0) obj2, (j11) obj, 1).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        Object obj4 = this.c0;
        Object obj5 = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ud5 ud5Var = ((hv1) obj5).g;
                this.Y = 1;
                Object e = ((dl) ud5Var).e((String) obj4, (String) obj3, (String) obj2, this);
                if (e == p31Var) {
                    return p31Var;
                }
                return e;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                this.Y = 1;
                Object k = t47.k((t47) obj5, (m47) obj4, (Map) obj3, (bw0) obj2, this);
                if (k == p31Var2) {
                    return p31Var2;
                }
                return k;
        }
    }
}
