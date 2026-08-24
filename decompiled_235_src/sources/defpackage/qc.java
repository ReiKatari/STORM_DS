package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc  reason: default package */
/* loaded from: classes.dex */
public final class qc extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ float Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc(Object obj, float f, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
        this.Z = f;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((qc) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((qc) q((r41) obj2, Float.valueOf(((Number) obj).floatValue()))).s(jg7Var);
            default:
                return ((qc) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new qc((dd) obj2, this.Z, r41Var, 0);
            case 1:
                qc qcVar = new qc((dx0) obj2, r41Var);
                qcVar.Z = ((Number) obj).floatValue();
                return qcVar;
            default:
                return new qc((n65) obj2, this.Z, r41Var, 2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object r;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.d0;
        eo2 eo2Var = null;
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
                dd ddVar = (dd) obj2;
                float f = this.Z;
                this.Y = 1;
                Object value = ddVar.g.getValue();
                Object c = ddVar.c(ddVar.e(), f, value);
                if (!((Boolean) ddVar.d.g(c)).booleanValue() ? (r = mb3.r(ddVar, value, f, this)) != x61Var : (r = mb3.r(ddVar, c, f, this)) != x61Var) {
                    r = jg7Var;
                }
                if (r == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
                dx0 dx0Var = (dx0) obj2;
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
                    float f2 = this.Z;
                    Object g = dx0Var.a.d.A.g(sa6.e);
                    if (g != null) {
                        eo2Var = g;
                    }
                    eo2 eo2Var2 = eo2Var;
                    if (eo2Var2 != null) {
                        e76 e76Var = (e76) dx0Var.a.d.c(bb6.w);
                        jk4 jk4Var = new jk4((Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                        this.Y = 1;
                        obj = eo2Var2.o(jk4Var, this);
                        if (obj == x61Var2) {
                            return x61Var2;
                        }
                    } else {
                        throw i61.e("Required value was null.");
                    }
                }
                return new Float(Float.intBitsToFloat((int) (((jk4) obj).a & 4294967295L)));
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
                n65 n65Var = (n65) obj2;
                db4 db4Var = n65Var.i;
                m65 m65Var = new m65(n65Var, this.Z, null);
                this.Y = 1;
                if (db4.b(db4Var, m65Var, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(dx0 dx0Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 1;
        this.d0 = dx0Var;
    }
}
