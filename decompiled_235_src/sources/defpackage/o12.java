package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o12  reason: default package */
/* loaded from: classes.dex */
public final class o12 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o12(r41 r41Var, ao2 ao2Var, int i) {
        super(3, r41Var);
        this.X = i;
        this.e0 = ao2Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.e0;
        switch (i) {
            case 0:
                o12 o12Var = new o12((sz1) obj4, (r41) obj3, 0);
                o12Var.Z = (o75) obj;
                o12Var.d0 = (hb5) obj2;
                return o12Var.s(jg7Var);
            case 1:
                o12 o12Var2 = new o12((eo2) obj4, (r41) obj3, 1);
                o12Var2.Z = (ne2) obj;
                o12Var2.d0 = obj2;
                return o12Var2.s(jg7Var);
            case 2:
                o12 o12Var3 = new o12((r41) obj3, (go2) obj4, 2);
                o12Var3.Z = (ne2) obj;
                o12Var3.d0 = (Object[]) obj2;
                return o12Var3.s(jg7Var);
            case 3:
                o12 o12Var4 = new o12((r41) obj3, (ho2) obj4, 3);
                o12Var4.Z = (ne2) obj;
                o12Var4.d0 = (Object[]) obj2;
                return o12Var4.s(jg7Var);
            case 4:
                o12 o12Var5 = new o12((r41) obj3, (io2) obj4, 4);
                o12Var5.Z = (ne2) obj;
                o12Var5.d0 = (Object[]) obj2;
                return o12Var5.s(jg7Var);
            default:
                o12 o12Var6 = new o12((fo2) obj4, (r41) obj3, 5);
                o12Var6.Z = (ne2) obj;
                o12Var6.d0 = (Object[]) obj2;
                return o12Var6.s(jg7Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r2 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
        if (r0 == r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (r0 == r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012c, code lost:
        if (r2 == r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
        if (r2 == r0) goto L79;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object c;
        ne2 ne2Var;
        Object o;
        ne2 ne2Var2;
        Object l;
        ne2 ne2Var3;
        Object p;
        ne2 ne2Var4;
        Object n;
        ne2 ne2Var5;
        Object e;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                o75 o75Var = (o75) this.Z;
                hb5 hb5Var = (hb5) this.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        c = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = ((sz1) obj2).g;
                    this.Z = null;
                    this.d0 = null;
                    this.Y = 1;
                    c = ((pl) pn5Var).c(o75Var, true, hb5Var, this);
                    if (c == x61Var) {
                        return x61Var;
                    }
                }
                return new hm5(c);
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ne2Var = (ne2) this.Z;
                    oi2.Y(obj);
                    o = obj;
                } else {
                    oi2.Y(obj);
                    ne2Var = (ne2) this.Z;
                    Object obj3 = this.d0;
                    this.Z = ne2Var;
                    this.Y = 1;
                    o = ((eo2) obj2).o(obj3, this);
                    break;
                }
                this.Z = null;
                this.Y = 2;
                if (ne2Var.a(o, this) != x61Var2) {
                    return jg7Var;
                }
                return x61Var2;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ne2Var2 = (ne2) this.Z;
                    oi2.Y(obj);
                    l = obj;
                } else {
                    oi2.Y(obj);
                    ne2Var2 = (ne2) this.Z;
                    Object[] objArr = (Object[]) this.d0;
                    Object obj4 = objArr[0];
                    Object obj5 = objArr[1];
                    Object obj6 = objArr[2];
                    this.Z = ne2Var2;
                    this.Y = 1;
                    l = ((go2) obj2).l(obj4, obj5, obj6, this);
                    break;
                }
                this.Z = null;
                this.Y = 2;
                if (ne2Var2.a(l, this) != x61Var3) {
                    return jg7Var;
                }
                return x61Var3;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    ne2Var3 = (ne2) this.Z;
                    p = obj;
                } else {
                    oi2.Y(obj);
                    ne2Var3 = (ne2) this.Z;
                    Object[] objArr2 = (Object[]) this.d0;
                    ho2 ho2Var = (ho2) obj2;
                    Object obj7 = objArr2[0];
                    Object obj8 = objArr2[1];
                    Object obj9 = objArr2[2];
                    Object obj10 = objArr2[3];
                    this.Z = ne2Var3;
                    this.Y = 1;
                    p = ho2Var.p(obj7, obj8, obj9, obj10, this);
                    break;
                }
                this.Z = null;
                this.Y = 2;
                if (ne2Var3.a(p, this) != x61Var4) {
                    return jg7Var;
                }
                return x61Var4;
            case 4:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    ne2Var4 = (ne2) this.Z;
                    n = obj;
                } else {
                    oi2.Y(obj);
                    ne2Var4 = (ne2) this.Z;
                    Object[] objArr3 = (Object[]) this.d0;
                    io2 io2Var = (io2) obj2;
                    Object obj11 = objArr3[0];
                    Object obj12 = objArr3[1];
                    Object obj13 = objArr3[2];
                    Object obj14 = objArr3[3];
                    Object obj15 = objArr3[4];
                    this.Z = ne2Var4;
                    this.Y = 1;
                    n = io2Var.n(obj11, obj12, obj13, obj14, obj15, this);
                    break;
                }
                this.Z = null;
                this.Y = 2;
                if (ne2Var4.a(n, this) != x61Var5) {
                    return jg7Var;
                }
                return x61Var5;
            default:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ne2Var5 = (ne2) this.Z;
                    oi2.Y(obj);
                    e = obj;
                } else {
                    oi2.Y(obj);
                    ne2Var5 = (ne2) this.Z;
                    Object[] objArr4 = (Object[]) this.d0;
                    Object obj16 = objArr4[0];
                    Object obj17 = objArr4[1];
                    this.Z = ne2Var5;
                    this.Y = 1;
                    e = ((fo2) obj2).e(obj16, obj17, this);
                    break;
                }
                this.Z = null;
                this.Y = 2;
                if (ne2Var5.a(e, this) != x61Var6) {
                    return jg7Var;
                }
                return x61Var6;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o12(Object obj, r41 r41Var, int i) {
        super(3, r41Var);
        this.X = i;
        this.e0 = obj;
    }
}
