package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b12  reason: default package */
/* loaded from: classes.dex */
public final class b12 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ ne2 Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ sz1 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b12(int i, r41 r41Var, sz1 sz1Var) {
        super(3, r41Var);
        this.X = i;
        this.e0 = sz1Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        sz1 sz1Var = this.e0;
        ne2 ne2Var = (ne2) obj;
        r41 r41Var = (r41) obj3;
        switch (i) {
            case 0:
                b12 b12Var = new b12(0, r41Var, sz1Var);
                b12Var.Z = ne2Var;
                b12Var.d0 = obj2;
                return b12Var.s(jg7Var);
            case 1:
                b12 b12Var2 = new b12(1, r41Var, sz1Var);
                b12Var2.Z = ne2Var;
                b12Var2.d0 = obj2;
                return b12Var2.s(jg7Var);
            default:
                b12 b12Var3 = new b12(2, r41Var, sz1Var);
                b12Var3.Z = ne2Var;
                b12Var3.d0 = obj2;
                return b12Var3.s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        UUID uuid;
        le2 af2Var;
        jt5 jt5Var;
        dy1 dy1Var;
        jt5 jt5Var2;
        le2 wp0Var;
        pq5 pq5Var;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        sz1 sz1Var = this.e0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var = this.Z;
                af2 af2Var2 = new af2(sz1Var.q.e((UUID) this.d0), new c12(0, (r41) null, sz1Var));
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (f04.A(ne2Var, af2Var2, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var2 = this.Z;
                pq5 pq5Var2 = (pq5) this.d0;
                if (pq5Var2 != null && (jt5Var = pq5Var2.f) != null) {
                    uuid = jt5Var.c;
                } else {
                    uuid = null;
                }
                if (uuid == null) {
                    af2Var = sz1.s(sz1Var);
                } else {
                    af2Var = new af2(sz1Var.q.e(uuid), new c12(1, (r41) null, sz1Var));
                }
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (f04.A(ne2Var2, af2Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var3 = this.Z;
                hy1 hy1Var = (hy1) this.d0;
                if (hy1Var instanceof dy1) {
                    dy1Var = (dy1) hy1Var;
                } else {
                    dy1Var = null;
                }
                if (dy1Var != null && (pq5Var = dy1Var.a) != null) {
                    jt5Var2 = pq5Var.f;
                } else {
                    jt5Var2 = null;
                }
                kd6 kd6Var = sz1Var.c;
                if (jt5Var2 == null) {
                    wp0Var = ((ng6) kd6Var).i;
                } else {
                    ng6 ng6Var = (ng6) kd6Var;
                    ng6Var.getClass();
                    wp0Var = new wp0(5, new le2[]{ng6Var.i, ng6Var.G(), ng6Var.F(), ng6Var.E()}, new jg6(ng6Var, jt5Var2, null));
                }
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (f04.A(ne2Var3, wp0Var, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
        }
    }
}
