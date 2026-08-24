package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pg1  reason: default package */
/* loaded from: classes.dex */
public final class pg1 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 2;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg1(qg1 qg1Var, r41 r41Var, boolean z, LinkedHashSet linkedHashSet) {
        super(2, r41Var);
        this.d0 = qg1Var;
        this.Z = z;
        this.e0 = linkedHashSet;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((pg1) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((pg1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((pg1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        boolean z = this.Z;
        Object obj3 = this.d0;
        switch (i) {
            case 0:
                return new pg1((qg1) obj3, r41Var, z, (LinkedHashSet) obj2);
            case 1:
                return new pg1((sz1) obj3, (vj4) obj2, z, r41Var);
            default:
                return new pg1((gn) obj3, z, (sc7) obj2, r41Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        float f;
        int i = this.X;
        Object obj2 = this.e0;
        boolean z = this.Z;
        Object obj3 = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                jg1 g = qg1.k((qg1) obj3).g((LinkedHashSet) obj2, z);
                this.Y = 1;
                Object q = ((tu0) g).q(this);
                if (q == x61Var) {
                    return x61Var;
                }
                return q;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qf4 qf4Var = ((sz1) obj3).h;
                    long j = ((vj4) obj2).b;
                    this.Y = 1;
                    obj = qf4Var.a.r(j, z, this);
                    if (obj == x61Var2) {
                        return x61Var2;
                    }
                }
                Iterable<fb5> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(ht0.v0(iterable, 10));
                for (fb5 fb5Var : iterable) {
                    arrayList.add(new Long(fb5Var.b));
                }
                return gt0.p1(arrayList);
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    gn gnVar = (gn) obj3;
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.8f;
                    }
                    this.Y = 1;
                    if (gn.c(gnVar, new Float(f), (sc7) obj2, null, this, 12) == x61Var3) {
                        return x61Var3;
                    }
                }
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg1(gn gnVar, boolean z, sc7 sc7Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = gnVar;
        this.Z = z;
        this.e0 = sc7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg1(sz1 sz1Var, vj4 vj4Var, boolean z, r41 r41Var) {
        super(2, r41Var);
        this.d0 = sz1Var;
        this.e0 = vj4Var;
        this.Z = z;
    }
}
