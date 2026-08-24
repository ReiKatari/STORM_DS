package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g22  reason: default package */
/* loaded from: classes.dex */
public final class g22 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public Object Y;
    public int Z;
    public final /* synthetic */ sz1 d0;
    public final /* synthetic */ long e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g22(sz1 sz1Var, long j, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = sz1Var;
        this.e0 = j;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((g22) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((g22) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new g22(this.d0, this.e0, r41Var, 0);
            default:
                return new g22(this.d0, this.e0, r41Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r11 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r11 == r0) goto L41;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object h;
        o75 o75Var;
        Object h2;
        o75 o75Var2;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        long j = this.e0;
        sz1 sz1Var = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Z;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    h = ((hm5) obj).A;
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = sz1Var.g;
                    this.Z = 1;
                    h = ((pl) pn5Var).h(j, this);
                    break;
                }
                if (!(h instanceof em5) && (o75Var = (o75) h) != null) {
                    of6 of6Var = sz1Var.F0;
                    m95 m95Var = new m95(o75Var);
                    this.Y = h;
                    this.Z = 2;
                    if (of6Var.a(m95Var, this) != x61Var) {
                        return jg7Var;
                    }
                    return x61Var;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Z;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    h2 = ((hm5) obj).A;
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var2 = sz1Var.g;
                    this.Z = 1;
                    h2 = ((pl) pn5Var2).h(j, this);
                    break;
                }
                if (!(h2 instanceof em5) && (o75Var2 = (o75) h2) != null) {
                    of6 of6Var2 = sz1Var.F0;
                    r95 r95Var = new r95(o75Var2);
                    this.Y = h2;
                    this.Z = 2;
                    if (of6Var2.a(r95Var, this) != x61Var2) {
                        return jg7Var;
                    }
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
