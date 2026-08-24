package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl3  reason: default package */
/* loaded from: classes.dex */
public final class rl3 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ yl3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl3(yl3 yl3Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = yl3Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((rl3) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((rl3) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((rl3) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((rl3) q(r41Var, w61Var)).s(jg7Var);
            case 4:
                return ((rl3) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((rl3) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        yl3 yl3Var = this.Z;
        switch (i) {
            case 0:
                return new rl3(yl3Var, r41Var, 0);
            case 1:
                return new rl3(yl3Var, r41Var, 1);
            case 2:
                return new rl3(yl3Var, r41Var, 2);
            case 3:
                return new rl3(yl3Var, r41Var, 3);
            case 4:
                return new rl3(yl3Var, r41Var, 4);
            default:
                return new rl3(yl3Var, r41Var, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        yl3 yl3Var = this.Z;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    tp6 tp6Var = yl3Var.i;
                    ql3 ql3Var = new ql3(yl3Var, 0);
                    this.Y = 1;
                    Object b = tp6Var.b(new a7(ql3Var, 16), this);
                    if (b != x61Var) {
                        b = jg7Var;
                    }
                    if (b == x61Var) {
                        return x61Var;
                    }
                }
                return jg7Var;
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
                    ql3 ql3Var2 = new ql3(yl3Var, 1);
                    this.Y = 1;
                    if (((xf2) yl3Var.d.h).b(ql3Var2, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7Var;
            case 2:
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
                    nl1 s = lb4.s(yl3Var.o, new v83(6));
                    ql3 ql3Var3 = new ql3(yl3Var, 2);
                    this.Y = 1;
                    if (s.b(ql3Var3, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                return jg7Var;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    nl1 s2 = lb4.s(yl3Var.o, new v83(7));
                    ql3 ql3Var4 = new ql3(yl3Var, 3);
                    this.Y = 1;
                    if (s2.b(ql3Var4, this) == x61Var4) {
                        return x61Var4;
                    }
                }
                return jg7Var;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    de5 de5Var = yl3Var.p;
                    tp6 tp6Var2 = yl3Var.q;
                    this.Y = 1;
                    Object b2 = de5Var.A.b(new a7(new a7(tp6Var2, 19), 16), this);
                    if (b2 != x61Var5) {
                        b2 = jg7Var;
                    }
                    if (b2 != x61Var5) {
                        b2 = jg7Var;
                    }
                    if (b2 == x61Var5) {
                        return x61Var5;
                    }
                }
                return jg7Var;
            default:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    de5 de5Var2 = yl3Var.p;
                    tp6 tp6Var3 = yl3Var.s;
                    this.Y = 1;
                    Object b3 = de5Var2.A.b(new a7(new a7(tp6Var3, 20), 16), this);
                    if (b3 != x61Var6) {
                        b3 = jg7Var;
                    }
                    if (b3 != x61Var6) {
                        b3 = jg7Var;
                    }
                    if (b3 == x61Var6) {
                        return x61Var6;
                    }
                }
                return jg7Var;
        }
    }
}
