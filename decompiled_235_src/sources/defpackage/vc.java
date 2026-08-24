package defpackage;

import android.content.res.Resources;
import com.stormds.emulator.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc  reason: default package */
/* loaded from: classes.dex */
public final class vc implements ne2 {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;
    public final Object R;

    public vc(ne2 ne2Var, l61 l61Var) {
        this.A = 8;
        this.B = l61Var;
        this.L = k57.b(l61Var);
        this.R = new ve2(ne2Var, null, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
        if (r12.a(r1, r3) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (defpackage.iv7.a(r12, r1, r11, r3) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
        if (((defpackage.ne2) r12).a(r1, r3) == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e1, code lost:
        if (r2 == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0100, code lost:
        if (((defpackage.ne2) r0.L).a(r1, r3) == r7) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        uc ucVar;
        int i;
        boolean z;
        ml1 ml1Var;
        int i2;
        if2 if2Var;
        int i3;
        lf2 lf2Var;
        int i4;
        vc vcVar = this;
        Object obj2 = obj;
        int i5 = vcVar.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = vcVar.R;
        Object obj4 = vcVar.L;
        Object obj5 = vcVar.B;
        switch (i5) {
            case 0:
                dh5 dh5Var = (dh5) obj5;
                if (r41Var instanceof uc) {
                    ucVar = (uc) r41Var;
                    int i6 = ucVar.Z;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ucVar.Z = i6 - Integer.MIN_VALUE;
                        Object obj6 = ucVar.X;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i = ucVar.Z;
                        if (i == 0) {
                            if (i == 1) {
                                obj2 = ucVar.R;
                                oi2.Y(obj6);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj6);
                            rc3 rc3Var = (rc3) dh5Var.A;
                            if (rc3Var != null) {
                                rc3Var.h(new pc());
                                ucVar.R = obj2;
                                ucVar.Z = 1;
                                if (rc3Var.c0(ucVar) == x61Var) {
                                    return x61Var;
                                }
                            }
                        }
                        w61 w61Var = (w61) obj4;
                        dh5Var.A = hv.L(w61Var, null, a71.UNDISPATCHED, new b0((eo2) obj3, obj2, w61Var, (r41) null, 2), 1);
                        return jg7Var;
                    }
                }
                ucVar = new uc(vcVar, r41Var);
                Object obj62 = ucVar.X;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i = ucVar.Z;
                if (i == 0) {
                }
                w61 w61Var2 = (w61) obj4;
                dh5Var.A = hv.L(w61Var2, null, a71.UNDISPATCHED, new b0((eo2) obj3, obj2, w61Var2, (r41) null, 2), 1);
                return jg7Var;
            case 1:
                ga7 ga7Var = (ga7) obj4;
                q35 q35Var = (q35) obj5;
                if (((Boolean) obj2).booleanValue()) {
                    z = ((Boolean) ((eo2) ((qa4) obj3).getValue()).o(ga7Var.a.f(), ga7Var.d.getValue())).booleanValue();
                } else {
                    z = false;
                }
                q35Var.setValue(Boolean.valueOf(z));
                return jg7Var;
            case 2:
                t93 t93Var = (t93) obj2;
                ArrayList arrayList = (ArrayList) obj5;
                if (t93Var instanceof oy2) {
                    arrayList.add(t93Var);
                } else if (t93Var instanceof py2) {
                    arrayList.remove(((py2) t93Var).a);
                } else if (t93Var instanceof sg2) {
                    arrayList.add(t93Var);
                } else if (t93Var instanceof tg2) {
                    arrayList.remove(((tg2) t93Var).a);
                } else if (t93Var instanceof l25) {
                    arrayList.add(t93Var);
                } else if (t93Var instanceof m25) {
                    arrayList.remove(((m25) t93Var).a);
                } else if (t93Var instanceof k25) {
                    arrayList.remove(((k25) t93Var).a);
                }
                hv.L((w61) obj4, null, null, new xd1((ie2) obj3, (t93) gt0.R0(arrayList), null, 1), 3);
                return jg7Var;
            case 3:
                dh5 dh5Var2 = (dh5) obj5;
                nl1 nl1Var = (nl1) obj4;
                if (r41Var instanceof ml1) {
                    ml1Var = (ml1) r41Var;
                    int i7 = ml1Var.Y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ml1Var.Y = i7 - Integer.MIN_VALUE;
                        Object obj7 = ml1Var.R;
                        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                        i2 = ml1Var.Y;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                oi2.Y(obj7);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj7);
                            Object g = nl1Var.B.g(obj2);
                            Object obj8 = dh5Var2.A;
                            if (obj8 == fh4.a || !nb3.k(obj8, g)) {
                                dh5Var2.A = g;
                                ml1Var.Y = 1;
                                if (((ne2) obj3).a(obj2, ml1Var) == x61Var3) {
                                    return x61Var3;
                                }
                            }
                        }
                        return jg7Var;
                    }
                }
                ml1Var = new ml1(vcVar, r41Var);
                Object obj72 = ml1Var.R;
                x61 x61Var32 = x61.COROUTINE_SUSPENDED;
                i2 = ml1Var.Y;
                if (i2 == 0) {
                }
                return jg7Var;
            case 4:
                if (r41Var instanceof if2) {
                    if2Var = (if2) r41Var;
                    int i8 = if2Var.d0;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        if2Var.d0 = i8 - Integer.MIN_VALUE;
                        Object obj9 = if2Var.Y;
                        x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                        i3 = if2Var.d0;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 != 3) {
                                        i.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                } else {
                                    Object obj10 = if2Var.X;
                                    vc vcVar2 = if2Var.R;
                                    oi2.Y(obj9);
                                    obj2 = obj10;
                                    vcVar = vcVar2;
                                    if (!((Boolean) obj9).booleanValue()) {
                                        ((zg5) vcVar.B).A = true;
                                        if2Var.R = null;
                                        if2Var.X = null;
                                        if2Var.d0 = 3;
                                        break;
                                    }
                                    return jg7Var;
                                }
                            }
                            oi2.Y(obj9);
                            return jg7Var;
                        }
                        oi2.Y(obj9);
                        if (((zg5) obj5).A) {
                            if2Var.d0 = 1;
                            break;
                        } else {
                            if2Var.R = vcVar;
                            if2Var.X = obj2;
                            if2Var.d0 = 2;
                            obj9 = ((eo2) obj3).o(obj2, if2Var);
                            break;
                        }
                        return x61Var4;
                    }
                }
                if2Var = new if2(vcVar, r41Var);
                Object obj92 = if2Var.Y;
                x61 x61Var42 = x61.COROUTINE_SUSPENDED;
                i3 = if2Var.d0;
                if (i3 == 0) {
                }
                return x61Var42;
            case 5:
                if (r41Var instanceof lf2) {
                    lf2Var = (lf2) r41Var;
                    int i9 = lf2Var.Y;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        lf2Var.Y = i9 - Integer.MIN_VALUE;
                        Object obj11 = lf2Var.R;
                        x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                        i4 = lf2Var.Y;
                        if (i4 == 0) {
                            if (i4 == 1 || i4 == 2) {
                                oi2.Y(obj11);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj11);
                            bh5 bh5Var = (bh5) obj5;
                            int i10 = bh5Var.A + 1;
                            bh5Var.A = i10;
                            ne2 ne2Var = (ne2) obj4;
                            if (i10 < 1) {
                                lf2Var.Y = 1;
                                break;
                            } else {
                                lf2Var.Y = 2;
                                break;
                            }
                        }
                        return jg7Var;
                    }
                }
                lf2Var = new lf2(vcVar, r41Var);
                Object obj112 = lf2Var.R;
                x61 x61Var52 = x61.COROUTINE_SUSPENDED;
                i4 = lf2Var.Y;
                if (i4 == 0) {
                }
                return jg7Var;
            case 6:
                return vcVar.b((fk3) obj2, r41Var);
            case 7:
                return vcVar.c(((Boolean) obj2).booleanValue(), r41Var);
            default:
                Object P = mb3.P((l61) obj5, obj2, obj4, (ve2) obj3, r41Var);
                if (P == x61.COROUTINE_SUSPENDED) {
                    return P;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(fk3 fk3Var, r41 r41Var) {
        do3 do3Var;
        Object obj;
        int i;
        Resources resources = (Resources) this.L;
        if (r41Var instanceof do3) {
            do3Var = (do3) r41Var;
            int i2 = do3Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                do3Var.Z = i2 - Integer.MIN_VALUE;
                obj = do3Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = do3Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        fk3Var = do3Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    String string = resources.getString(R.string.named_layout_deleted, fk3Var.b);
                    string.getClass();
                    String string2 = resources.getString(R.string.undo);
                    do3Var.R = fk3Var;
                    do3Var.Z = 1;
                    obj = gl6.b((gl6) this.B, string, string2, do3Var, 4);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                if (((ll6) obj) == ll6.ActionPerformed) {
                    ((qn2) this.R).g(fk3Var);
                }
                return jg7.a;
            }
        }
        do3Var = new do3(this, r41Var);
        obj = do3Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = do3Var.Z;
        if (i == 0) {
        }
        if (((ll6) obj) == ll6.ActionPerformed) {
        }
        return jg7.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:14)(2:11|12))(4:15|16|(1:(4:19|(1:21)|23|24)(2:25|26))(1:27)|22)))|30|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r1.d(r6, r8, r7) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(boolean z, r41 r41Var) {
        js5 js5Var;
        int i;
        if (r41Var instanceof js5) {
            js5Var = (js5) r41Var;
            int i2 = js5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                js5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = js5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = js5Var.Y;
                if (i == 0) {
                    if (i == 1 || i == 2) {
                        oi2.Y(obj);
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ss5 ss5Var = (ss5) this.B;
                ip3 ip3Var = (ip3) this.L;
                pr3 pr3Var = (pr3) this.R;
                int i3 = is5.a[ss5Var.f.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        xa4 xa4Var = xa4.PreventUserInput;
                        wg wgVar = new wg(2, null, 7);
                        js5Var.Y = 2;
                        if (pr3Var.d(xa4Var, wgVar, js5Var) == x61Var) {
                        }
                        return jg7.a;
                    }
                    throw new RuntimeException();
                }
                xa4 xa4Var2 = xa4.PreventUserInput;
                wg wgVar2 = new wg(2, null, 6);
                js5Var.Y = 1;
                return x61Var;
            }
        }
        js5Var = new js5(this, r41Var);
        Object obj2 = js5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = js5Var.Y;
        if (i == 0) {
        }
    }

    public vc(nl1 nl1Var, dh5 dh5Var, ne2 ne2Var) {
        this.A = 3;
        this.L = nl1Var;
        this.B = dh5Var;
        this.R = ne2Var;
    }

    public /* synthetic */ vc(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public vc(w61 w61Var, ss5 ss5Var, ip3 ip3Var, pr3 pr3Var) {
        this.A = 7;
        this.B = ss5Var;
        this.L = ip3Var;
        this.R = pr3Var;
    }
}
