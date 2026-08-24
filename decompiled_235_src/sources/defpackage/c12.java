package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c12  reason: default package */
/* loaded from: classes.dex */
public final class c12 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c12(u63 u63Var, eo2 eo2Var, r41 r41Var) {
        super(3, r41Var);
        this.X = 2;
        this.Z = u63Var;
        this.d0 = eo2Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.d0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj2;
                c12 c12Var = new c12(0, (r41) obj3, (sz1) obj4);
                c12Var.Z = (ne2) obj;
                return c12Var.s(jg7Var);
            case 1:
                Throwable th2 = (Throwable) obj2;
                c12 c12Var2 = new c12(1, (r41) obj3, (sz1) obj4);
                c12Var2.Z = (ne2) obj;
                return c12Var2.s(jg7Var);
            default:
                bd bdVar = (bd) obj;
                s04 s04Var = (s04) obj2;
                return new c12((u63) this.Z, (eo2) obj4, (r41) obj3).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                ne2 ne2Var = (ne2) this.Z;
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
                le2 e = ((sz1) obj2).q.e(fk3.h);
                this.Z = null;
                this.Y = 1;
                if (f04.A(ne2Var, e, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                ne2 ne2Var2 = (ne2) this.Z;
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
                cm0 s = sz1.s((sz1) obj2);
                this.Z = null;
                this.Y = 1;
                if (f04.A(ne2Var2, s, this) == x61Var2) {
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
                eo2 eo2Var = (eo2) obj2;
                this.Y = 1;
                if (eo2Var.o((cd) ((u63) this.Z).B, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c12(int i, r41 r41Var, sz1 sz1Var) {
        super(3, r41Var);
        this.X = i;
        this.d0 = sz1Var;
    }
}
