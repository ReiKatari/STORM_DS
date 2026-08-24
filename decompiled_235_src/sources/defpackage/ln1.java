package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln1  reason: default package */
/* loaded from: classes.dex */
public final class ln1 extends dm5 implements eo2 {
    public oy4 L;
    public int R;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zg5 Z;
    public final /* synthetic */ dh5 d0;
    public final /* synthetic */ dh5 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln1(zg5 zg5Var, dh5 dh5Var, dh5 dh5Var2, r41 r41Var) {
        super(2, r41Var);
        this.Z = zg5Var;
        this.d0 = dh5Var;
        this.e0 = dh5Var2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((ln1) q((r41) obj2, (mw6) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        ln1 ln1Var = new ln1(this.Z, this.d0, this.e0, r41Var);
        ln1Var.Y = obj;
        return ln1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r8 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce A[EDGE_INSN: B:70:0x00ce->B:45:0x00ce ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        mw6 mw6Var;
        int i;
        Object obj2;
        int i2;
        Object c;
        mw6 mw6Var2;
        oy4 oy4Var;
        int size;
        int i3;
        boolean f;
        Object obj3;
        Object obj4;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i4 = this.X;
        oy4 oy4Var2 = null;
        int i5 = 2;
        int i6 = 1;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    i = this.R;
                    oy4Var = this.L;
                    mw6Var2 = (mw6) this.Y;
                    oi2.Y(obj);
                    i2 = 1;
                    c = obj;
                    List list = ((oy4) c).a;
                    size = list.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (((vy4) list.get(i3)).c()) {
                            i = i2;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    dh5 dh5Var = this.d0;
                    f = sn1.f(oy4Var, ((vy4) dh5Var.A).a);
                    List list2 = oy4Var.a;
                    dh5 dh5Var2 = this.e0;
                    if (!f) {
                        int size2 = list2.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                obj4 = list2.get(i7);
                                if (((vy4) obj4).d) {
                                    break;
                                }
                                i7++;
                            } else {
                                obj4 = oy4Var2;
                                break;
                            }
                        }
                        vy4 vy4Var = (vy4) obj4;
                        if (vy4Var != null) {
                            dh5Var.A = vy4Var;
                            dh5Var2.A = vy4Var;
                        } else {
                            i = i2;
                            i6 = i;
                            mw6Var = mw6Var2;
                            if (i != 0) {
                                py4 py4Var = py4.Main;
                                this.Y = mw6Var;
                                this.L = oy4Var2;
                                this.R = i;
                                this.X = i6;
                                obj2 = mw6Var.c(py4Var, this);
                            } else {
                                return jg7.a;
                            }
                        }
                    } else {
                        int size3 = list2.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 < size3) {
                                obj3 = list2.get(i8);
                                if (nj2.o(((vy4) obj3).a, ((vy4) dh5Var.A).a)) {
                                    break;
                                }
                                i8++;
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        dh5Var2.A = obj3;
                    }
                    mw6Var = mw6Var2;
                    oy4Var2 = null;
                    i5 = 2;
                    i6 = 1;
                    if (i != 0) {
                    }
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                i = this.R;
                mw6Var = (mw6) this.Y;
                oi2.Y(obj);
                obj2 = obj;
                oy4 oy4Var3 = (oy4) obj2;
                List list3 = oy4Var3.a;
                int size4 = list3.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size4) {
                        if (!ej2.p((vy4) list3.get(i9))) {
                            break;
                        }
                        i9++;
                    } else {
                        i = i6;
                        break;
                    }
                }
                List list4 = oy4Var3.a;
                int size5 = list4.size();
                for (int i10 = 0; i10 < size5; i10++) {
                    vy4 vy4Var2 = (vy4) list4.get(i10);
                    if (vy4Var2.c() || ej2.K(vy4Var2, mw6Var.Y.u0, mw6Var.d())) {
                        break;
                    }
                }
                if (oy4Var3.c == i5) {
                    i2 = 1;
                    this.Z.A = true;
                    i = 1;
                } else {
                    i2 = 1;
                }
                py4 py4Var2 = py4.Final;
                this.Y = mw6Var;
                this.L = oy4Var3;
                this.R = i;
                this.X = i5;
                c = mw6Var.c(py4Var2, this);
                if (c != x61Var) {
                    mw6Var2 = mw6Var;
                    oy4Var = oy4Var3;
                    List list5 = ((oy4) c).a;
                    size = list5.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                        }
                        i3++;
                    }
                    dh5 dh5Var3 = this.d0;
                    f = sn1.f(oy4Var, ((vy4) dh5Var3.A).a);
                    List list22 = oy4Var.a;
                    dh5 dh5Var22 = this.e0;
                    if (!f) {
                    }
                    mw6Var = mw6Var2;
                    oy4Var2 = null;
                    i5 = 2;
                    i6 = 1;
                    if (i != 0) {
                    }
                }
                return x61Var;
            }
        } else {
            oi2.Y(obj);
            mw6Var = (mw6) this.Y;
            i = 0;
            if (i != 0) {
            }
        }
    }
}
