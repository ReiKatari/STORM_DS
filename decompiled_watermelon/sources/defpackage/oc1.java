package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oc1  reason: default package */
/* loaded from: classes.dex */
public final class oc1 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc1(pc1 pc1Var, j11 j11Var, boolean z, LinkedHashSet linkedHashSet) {
        super(2, j11Var);
        this.c0 = pc1Var;
        this.Z = z;
        this.d0 = linkedHashSet;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((oc1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((oc1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((oc1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        boolean z = this.Z;
        Object obj3 = this.c0;
        switch (i) {
            case 0:
                return new oc1((pc1) obj3, j11Var, z, (LinkedHashSet) obj2);
            case 1:
                return new oc1((hv1) obj3, (ya4) obj2, z, j11Var);
            default:
                return new oc1((um) obj3, z, (xy6) obj2, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        float f;
        int i = this.X;
        Object obj2 = this.d0;
        boolean z = this.Z;
        Object obj3 = this.c0;
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
                ic1 a = pc1.k((pc1) obj3).a((LinkedHashSet) obj2, z);
                this.Y = 1;
                Object h = ((gs0) a).h(this);
                if (h == p31Var) {
                    return p31Var;
                }
                return h;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    b74 b74Var = ((hv1) obj3).h;
                    long j = ((ya4) obj2).b;
                    this.Y = 1;
                    obj = b74Var.a.r(j, z, this);
                    if (obj == p31Var2) {
                        return p31Var2;
                    }
                }
                Iterable<v15> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(uq0.y0(iterable, 10));
                for (v15 v15Var : iterable) {
                    arrayList.add(new Long(v15Var.b));
                }
                return tq0.s1(arrayList);
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
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
                    um umVar = (um) obj3;
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.8f;
                    }
                    this.Y = 1;
                    if (um.c(umVar, new Float(f), (xy6) obj2, null, this, 12) == p31Var3) {
                        return p31Var3;
                    }
                }
                return o27.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc1(um umVar, boolean z, xy6 xy6Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = umVar;
        this.Z = z;
        this.d0 = xy6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc1(hv1 hv1Var, ya4 ya4Var, boolean z, j11 j11Var) {
        super(2, j11Var);
        this.c0 = hv1Var;
        this.d0 = ya4Var;
        this.Z = z;
    }
}
