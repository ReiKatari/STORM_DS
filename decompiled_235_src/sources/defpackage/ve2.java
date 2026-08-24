package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ve2  reason: default package */
/* loaded from: classes.dex */
public final class ve2 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ ne2 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve2(ne2 ne2Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = ne2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((ve2) q((r41) obj2, new gm0(((gm0) obj).a))).s(jg7Var);
            default:
                return ((ve2) q((r41) obj2, obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                ve2 ve2Var = new ve2(this.d0, r41Var, 0);
                ve2Var.Z = obj;
                return ve2Var;
            default:
                ve2 ve2Var2 = new ve2(this.d0, r41Var, 1);
                ve2Var2.Z = obj;
                return ve2Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.X;
        ne2 ne2Var = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        obj3 = this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    obj2 = ((gm0) this.Z).a;
                    if (!(obj2 instanceof fm0)) {
                        this.Z = obj2;
                        this.Y = 1;
                        if (ne2Var.a(obj2, this) == x61Var) {
                            return x61Var;
                        }
                        obj3 = obj2;
                    }
                    if (!(obj2 instanceof em0)) {
                        Throwable th = ((em0) obj2).a;
                        if (th == null) {
                            return Boolean.FALSE;
                        }
                        throw th;
                    }
                    return Boolean.TRUE;
                }
                obj2 = obj3;
                if (!(obj2 instanceof em0)) {
                }
            default:
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
                    Object obj4 = this.Z;
                    this.Y = 1;
                    if (ne2Var.a(obj4, this) == x61Var2) {
                        return x61Var2;
                    }
                }
                return jg7.a;
        }
    }
}
