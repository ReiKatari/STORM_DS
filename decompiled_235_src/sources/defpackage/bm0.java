package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm0  reason: default package */
/* loaded from: classes.dex */
public final class bm0 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public bm0(dh5 dh5Var, ne2 ne2Var, String[] strArr, int[] iArr) {
        this.A = 3;
        this.B = dh5Var;
        this.X = ne2Var;
        this.L = strArr;
        this.R = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        am0 am0Var;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = this.A;
        Object obj2 = this.X;
        boolean z4 = true;
        Object obj3 = this.L;
        Object obj4 = this.R;
        jg7 jg7Var = jg7.a;
        Object obj5 = this.B;
        switch (i2) {
            case 0:
                if (r41Var instanceof am0) {
                    am0Var = (am0) r41Var;
                    int i3 = am0Var.d0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        am0Var.d0 = i3 - Integer.MIN_VALUE;
                        Object obj6 = am0Var.Y;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i = am0Var.d0;
                        if (i == 0) {
                            if (i == 1) {
                                obj = am0Var.X;
                                this = am0Var.R;
                                oi2.Y(obj6);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj6);
                            rc3 rc3Var = (rc3) ((dh5) obj5).A;
                            if (rc3Var != null) {
                                rc3Var.h(new CancellationException("Child of the scoped flow was cancelled"));
                                am0Var.R = this;
                                am0Var.X = obj;
                                am0Var.d0 = 1;
                                if (rc3Var.c0(am0Var) == x61Var) {
                                    return x61Var;
                                }
                            }
                        }
                        ((dh5) this.B).A = hv.L((w61) this.L, null, a71.UNDISPATCHED, new zl0((cm0) this.R, (ne2) this.X, obj, null), 1);
                        return jg7Var;
                    }
                }
                am0Var = new am0(this, r41Var);
                Object obj62 = am0Var.Y;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i = am0Var.d0;
                if (i == 0) {
                }
                ((dh5) this.B).A = hv.L((w61) this.L, null, a71.UNDISPATCHED, new zl0((cm0) this.R, (ne2) this.X, obj, null), 1);
                return jg7Var;
            case 1:
                p27 p27Var = (p27) obj4;
                jt3 jt3Var = (jt3) obj5;
                if (((Boolean) obj).booleanValue() && jt3Var.b()) {
                    hf.o0((o37) obj3, jt3Var, p27Var.n(), (l33) obj2, p27Var.b);
                } else {
                    hf.N(jt3Var);
                }
                return jg7Var;
            case 2:
                t93 t93Var = (t93) obj;
                bh5 bh5Var = (bh5) obj4;
                bh5 bh5Var2 = (bh5) obj3;
                bh5 bh5Var3 = (bh5) obj5;
                if (t93Var instanceof l25) {
                    bh5Var3.A++;
                } else if (t93Var instanceof m25) {
                    bh5Var3.A--;
                } else if (t93Var instanceof k25) {
                    bh5Var3.A--;
                } else if (t93Var instanceof oy2) {
                    bh5Var2.A++;
                } else if (t93Var instanceof py2) {
                    bh5Var2.A--;
                } else if (t93Var instanceof sg2) {
                    bh5Var.A++;
                } else if (t93Var instanceof tg2) {
                    bh5Var.A--;
                }
                boolean z5 = false;
                if (bh5Var3.A > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (bh5Var2.A > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bh5Var.A > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                od1 od1Var = (od1) obj2;
                if (od1Var.l0 != z) {
                    od1Var.l0 = z;
                    z5 = true;
                }
                if (od1Var.m0 != z2) {
                    od1Var.m0 = z2;
                    z5 = true;
                }
                if (od1Var.n0 != z3) {
                    od1Var.n0 = z3;
                } else {
                    z4 = z5;
                }
                if (z4) {
                    f04.I(od1Var);
                }
                return jg7Var;
            default:
                return b((int[]) obj, r41Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r1.a(r13, r3) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r1.a(r13, r3) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(int[] iArr, r41 r41Var) {
        fc7 fc7Var;
        int i;
        String[] strArr = (String[]) this.L;
        ne2 ne2Var = (ne2) this.X;
        dh5 dh5Var = (dh5) this.B;
        if (r41Var instanceof fc7) {
            fc7Var = (fc7) r41Var;
            int i2 = fc7Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fc7Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = fc7Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = fc7Var.Z;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = fc7Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (dh5Var.A == null) {
                        Set V0 = fv.V0(strArr);
                        fc7Var.R = iArr;
                        fc7Var.Z = 1;
                    } else {
                        int[] iArr2 = (int[]) this.R;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj2 = dh5Var.A;
                            if (obj2 != null) {
                                int i6 = iArr2[i4];
                                if (((int[]) obj2)[i6] != iArr[i6]) {
                                    arrayList.add(str);
                                }
                                i3++;
                                i4 = i5;
                            } else {
                                i.m("Required value was null.");
                                return null;
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Set p1 = gt0.p1(arrayList);
                            fc7Var.R = iArr;
                            fc7Var.Z = 2;
                        }
                    }
                }
                dh5Var.A = iArr;
                return jg7.a;
            }
        }
        fc7Var = new fc7(this, r41Var);
        Object obj3 = fc7Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = fc7Var.Z;
        if (i == 0) {
        }
        dh5Var.A = iArr;
        return jg7.a;
    }

    public /* synthetic */ bm0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }
}
