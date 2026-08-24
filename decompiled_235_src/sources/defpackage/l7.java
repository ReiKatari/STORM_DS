package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l7  reason: default package */
/* loaded from: classes.dex */
public final class l7 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(qg1 qg1Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = 1;
        this.d0 = qg1Var;
        this.Z = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((l7) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((l7) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((l7) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((l7) q((r41) obj2, (p76) obj)).s(jg7Var);
            default:
                return ((l7) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        int i2 = this.Z;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new l7((pr3) obj2, i2, r41Var, 0);
            case 1:
                return new l7((qg1) obj2, r41Var, i2);
            case 2:
                return new l7((zq3) obj2, i2, r41Var, 2);
            case 3:
                return new l7((ue1) obj2, i2, r41Var, 3);
            default:
                return new l7((nw4) obj2, i2, r41Var, 4);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        int i2 = this.Z;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
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
                this.Y = 1;
                ap3 ap3Var = pr3.y;
                if (((pr3) obj2).f(i2, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                jg1 e = qg1.k((qg1) obj2).e(i2);
                this.Y = 1;
                Object q = ((tu0) e).q(this);
                if (q == x61Var2) {
                    return x61Var2;
                }
                return q;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tq3 tq3Var = ((zq3) obj2).l0;
                this.Y = 1;
                if (tq3Var.f(i2, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
            case 3:
                ue1 ue1Var = (ue1) obj2;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
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
                    this.Y = 1;
                    if (ue1Var.i(this) == x61Var4) {
                        return x61Var4;
                    }
                }
                ue1Var.t(RecyclerView.B1, ue1Var.j(i2), true);
                return jg7Var;
            default:
                nw4 nw4Var = (nw4) obj2;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
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
                    uv4 uv4Var = nw4Var.c;
                    this.Y = 1;
                    if (uv4Var.a("android.permission.CAMERA", this) == x61Var5) {
                        return x61Var5;
                    }
                }
                nw4Var.a(i2);
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7(Object obj, int i, r41 r41Var, int i2) {
        super(2, r41Var);
        this.X = i2;
        this.d0 = obj;
        this.Z = i;
    }
}
