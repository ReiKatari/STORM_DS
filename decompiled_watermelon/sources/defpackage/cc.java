package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cc  reason: default package */
/* loaded from: classes.dex */
public final class cc extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ float Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc(Object obj, float f, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = obj;
        this.Z = f;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((cc) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((cc) t((j11) obj2, Float.valueOf(((Number) obj).floatValue()))).v(o27Var);
            default:
                return ((cc) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.c0;
        switch (i) {
            case 0:
                return new cc((pc) obj2, this.Z, j11Var, 0);
            case 1:
                cc ccVar = new cc((hu0) obj2, j11Var);
                ccVar.Z = ((Number) obj).floatValue();
                return ccVar;
            default:
                return new cc((ex4) obj2, this.Z, j11Var, 2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object h;
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.c0;
        aj2 aj2Var = null;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                pc pcVar = (pc) obj2;
                float f = this.Z;
                this.Y = 1;
                Object value = pcVar.g.getValue();
                Object c = pcVar.c(pcVar.e(), f, value);
                if (!((Boolean) pcVar.d.n(c)).booleanValue() ? (h = se.h(pcVar, value, f, this)) != p31Var : (h = se.h(pcVar, c, f, this)) != p31Var) {
                    h = o27Var;
                }
                if (h == p31Var) {
                    return p31Var;
                }
                return o27Var;
            case 1:
                hu0 hu0Var = (hu0) obj2;
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
                    float f2 = this.Z;
                    Object g = hu0Var.a.d.A.g(dz5.e);
                    if (g != null) {
                        aj2Var = g;
                    }
                    aj2 aj2Var2 = aj2Var;
                    if (aj2Var2 != null) {
                        rv5 rv5Var = (rv5) hu0Var.a.d.d(mz5.w);
                        mb4 mb4Var = new mb4((Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                        this.Y = 1;
                        obj = aj2Var2.j(mb4Var, this);
                        if (obj == p31Var2) {
                            return p31Var2;
                        }
                    } else {
                        throw b31.e("Required value was null.");
                    }
                }
                return new Float(Float.intBitsToFloat((int) (((mb4) obj).a & 4294967295L)));
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                ex4 ex4Var = (ex4) obj2;
                x24 x24Var = ex4Var.i;
                dx4 dx4Var = new dx4(ex4Var, this.Z, null);
                this.Y = 1;
                if (x24.b(x24Var, dx4Var, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(hu0 hu0Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 1;
        this.c0 = hu0Var;
    }
}
