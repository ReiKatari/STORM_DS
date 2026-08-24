package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ue2  reason: default package */
/* loaded from: classes.dex */
public final class ue2 extends hw6 implements fo2 {
    public dh5 X;
    public ch5 Y;
    public int Z;
    public /* synthetic */ Object d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ t4 f0;
    public final /* synthetic */ le2 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue2(t4 t4Var, le2 le2Var, r41 r41Var) {
        super(3, r41Var);
        this.f0 = t4Var;
        this.g0 = le2Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        ue2 ue2Var = new ue2(this.f0, this.g0, (r41) obj3);
        ue2Var.d0 = (w61) obj;
        ue2Var.e0 = (ne2) obj2;
        return ue2Var.s(jg7.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
        if (r7.a(r13, r12) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
        if (r7.e(r12) != r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Type inference failed for: r1v7, types: [ch5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e4 -> B:7:0x001a). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        dh5 obj2;
        ne2 ne2Var;
        ul0 ul0Var;
        ul0 ul0Var2;
        dh5 dh5Var;
        ch5 ch5Var;
        dh5 dh5Var2;
        ul0 ul0Var3;
        ne2 ne2Var2;
        ul0 ul0Var4;
        dh5 dh5Var3;
        ch5 ch5Var2;
        Object obj3;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Z;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    dh5Var2 = this.X;
                    ul0Var3 = (ul0) this.e0;
                    ne2Var2 = (ne2) this.d0;
                    oi2.Y(obj);
                    ne2Var = ne2Var2;
                    ul0Var = ul0Var3;
                    obj2 = dh5Var2;
                    obj3 = obj2.A;
                    if (obj3 == fh4.c) {
                        ?? obj4 = new Object();
                        ch5Var = obj4;
                        dh5Var = obj2;
                        ul0Var2 = ul0Var;
                        if (obj3 != null) {
                            long longValue = Long.valueOf(this.f0.B).longValue();
                            obj4.A = longValue;
                            int i2 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                            ch5Var = obj4;
                            dh5Var = obj2;
                            ul0Var2 = ul0Var;
                            if (i2 >= 0) {
                                if (i2 == 0) {
                                    Object obj5 = obj2.A;
                                    if (obj5 == fh4.a) {
                                        obj5 = null;
                                    }
                                    this.d0 = ne2Var;
                                    this.e0 = ul0Var;
                                    this.X = obj2;
                                    this.Y = obj4;
                                    this.Z = 1;
                                    ch5Var2 = obj4;
                                    dh5Var3 = obj2;
                                    ul0Var4 = ul0Var;
                                }
                            } else {
                                i.h("Debounce timeout should not be negative");
                                return null;
                            }
                        }
                        ch5 ch5Var3 = ch5Var;
                        dh5Var2 = dh5Var;
                        ul0Var3 = ul0Var2;
                        ne2Var2 = ne2Var;
                        l61 l61Var = this.B;
                        l61Var.getClass();
                        v96 v96Var = new v96(l61Var);
                        if (dh5Var2.A != null) {
                            ii2.I(v96Var, ch5Var3.A, new yc(ne2Var2, dh5Var2, null, 6));
                        }
                        v96Var.h(ul0Var3.l(), new l5(dh5Var2, ne2Var2, (r41) null));
                        this.d0 = ne2Var2;
                        this.e0 = ul0Var3;
                        this.X = dh5Var2;
                        this.Y = null;
                        this.Z = 2;
                    } else {
                        return jg7.a;
                    }
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                ch5 ch5Var4 = this.Y;
                dh5 dh5Var4 = this.X;
                ne2Var = (ne2) this.d0;
                oi2.Y(obj);
                ch5Var2 = ch5Var4;
                dh5Var3 = dh5Var4;
                ul0Var4 = (ul0) this.e0;
                dh5Var3.A = null;
                ch5Var = ch5Var2;
                dh5Var = dh5Var3;
                ul0Var2 = ul0Var4;
                ch5 ch5Var32 = ch5Var;
                dh5Var2 = dh5Var;
                ul0Var3 = ul0Var2;
                ne2Var2 = ne2Var;
                l61 l61Var2 = this.B;
                l61Var2.getClass();
                v96 v96Var2 = new v96(l61Var2);
                if (dh5Var2.A != null) {
                }
                v96Var2.h(ul0Var3.l(), new l5(dh5Var2, ne2Var2, (r41) null));
                this.d0 = ne2Var2;
                this.e0 = ul0Var3;
                this.X = dh5Var2;
                this.Y = null;
                this.Z = 2;
            }
        } else {
            oi2.Y(obj);
            xd1 xd1Var = new xd1(this.g0, null, 17);
            m80 m80Var = m80.SUSPEND;
            a71 a71Var = a71.DEFAULT;
            r35 r35Var = new r35(mb3.M((w61) this.d0, vt1.A), nb3.c(0, m80Var, null, 4));
            a71Var.invoke(xd1Var, r35Var, r35Var);
            obj2 = new Object();
            ne2Var = (ne2) this.e0;
            ul0Var = r35Var;
            obj3 = obj2.A;
            if (obj3 == fh4.c) {
            }
        }
    }
}
