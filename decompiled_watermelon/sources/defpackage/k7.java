package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k7  reason: default package */
/* loaded from: classes.dex */
public final class k7 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(pc1 pc1Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = 1;
        this.c0 = pc1Var;
        this.Z = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((k7) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((k7) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((k7) t((j11) obj2, (o31) obj)).v(o27Var);
            case 3:
                return ((k7) t((j11) obj2, (dw5) obj)).v(o27Var);
            default:
                return ((k7) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        int i2 = this.Z;
        Object obj2 = this.c0;
        switch (i) {
            case 0:
                return new k7((pk3) obj2, i2, j11Var, 0);
            case 1:
                return new k7((pc1) obj2, j11Var, i2);
            case 2:
                return new k7((ak3) obj2, i2, j11Var, 2);
            case 3:
                return new k7((ya1) obj2, i2, j11Var, 3);
            default:
                return new k7((in4) obj2, i2, j11Var, 4);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        int i2 = this.Z;
        Object obj2 = this.c0;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                this.Y = 1;
                ci3 ci3Var = pk3.y;
                if (((pk3) obj2).f(i2, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ic1 i5 = pc1.k((pc1) obj2).i(i2);
                this.Y = 1;
                Object h = ((gs0) i5).h(this);
                if (h == p31Var2) {
                    return p31Var2;
                }
                return h;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                uj3 uj3Var = ((ak3) obj2).k0;
                this.Y = 1;
                if (uj3Var.f(i2, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
            case 3:
                ya1 ya1Var = (ya1) obj2;
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    this.Y = 1;
                    if (ya1Var.i(this) == p31Var4) {
                        return p31Var4;
                    }
                }
                ya1Var.t(ya1Var.j(i2), RecyclerView.A1, true);
                return o27Var;
            default:
                in4 in4Var = (in4) obj2;
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    pm4 pm4Var = in4Var.c;
                    this.Y = 1;
                    if (pm4Var.a("android.permission.CAMERA", this) == p31Var5) {
                        return p31Var5;
                    }
                }
                in4Var.a(i2);
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7(Object obj, int i, j11 j11Var, int i2) {
        super(2, j11Var);
        this.X = i2;
        this.c0 = obj;
        this.Z = i;
    }
}
