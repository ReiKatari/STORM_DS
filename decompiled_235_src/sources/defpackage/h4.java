package defpackage;

import java.util.List;
import java.util.Map;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h4 extends po2 implements eo2 {
    public final /* synthetic */ int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.d0 = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, t93, sg2] */
    /* JADX WARN: Type inference failed for: r2v11, types: [dh5, java.lang.Object] */
    @Override // defpackage.eo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj, Object obj2) {
        String str;
        boolean isFocused;
        int size;
        Object u;
        int i = this.d0;
        boolean z = true;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.B;
        switch (i) {
            case 0:
                Object f = ((nx1) obj3).f((ta5) obj, (r41) obj2);
                if (f != x61.COROUTINE_SUSPENDED) {
                    return new hm5(f);
                }
                return f;
            case 1:
                Cheat cheat = (Cheat) obj;
                jo0 jo0Var = (jo0) obj2;
                cheat.getClass();
                jo0Var.getClass();
                String str2 = jo0Var.c;
                aq0 aq0Var = (aq0) obj3;
                aq0Var.getClass();
                String str3 = jo0Var.b;
                String str4 = jo0Var.a;
                if (!qs6.v0(str4) && !qs6.v0(str2) && (!nb3.k(cheat.getName(), str4) || !nb3.k(cheat.getDescription(), str3) || !nb3.k(cheat.getCode(), str2))) {
                    String str5 = jo0Var.a;
                    if (!qs6.v0(str3)) {
                        str = str3;
                    } else {
                        str = null;
                    }
                    hv.L(to7.a(aq0Var), null, null, new z(aq0Var, Cheat.copy$default(cheat, null, 0L, str5, str, str2, false, 35, null), null, 21), 3);
                }
                return jg7Var;
            case 2:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                bb1 bb1Var = (bb1) obj2;
                dSiWareTitle.getClass();
                bb1Var.getClass();
                za1 za1Var = (za1) obj3;
                za1Var.getClass();
                ab1 ab1Var = za1Var.a;
                ab1Var.a = dSiWareTitle;
                ab1Var.b = bb1Var;
                za1Var.b.a(new vr4(null, null));
                return jg7Var;
            case 3:
                DSiWareTitle dSiWareTitle2 = (DSiWareTitle) obj;
                bb1 bb1Var2 = (bb1) obj2;
                dSiWareTitle2.getClass();
                bb1Var2.getClass();
                cb1 cb1Var = (cb1) obj3;
                cb1Var.getClass();
                ab1 ab1Var2 = cb1Var.a;
                ab1Var2.a = dSiWareTitle2;
                ab1Var2.b = bb1Var2;
                cb1Var.b.a(bb1Var2.getFileName());
                return jg7Var;
            case 4:
                sh2 sh2Var = (sh2) obj;
                sh2 sh2Var2 = (sh2) obj2;
                di2 di2Var = (di2) obj3;
                if (di2Var.j0 && (isFocused = sh2Var2.isFocused()) != sh2Var.isFocused()) {
                    qn2 qn2Var = di2Var.n0;
                    if (qn2Var != null) {
                        qn2Var.g(Boolean.valueOf(isFocused));
                    }
                    jd1 jd1Var = ei2.k0;
                    if (isFocused) {
                        hv.L(di2Var.F0(), null, null, new a6(di2Var, null, 21), 3);
                        ?? obj4 = new Object();
                        jx2.B(di2Var, new ci2(0, (Object) obj4, di2Var));
                        lq3 lq3Var = (lq3) obj4.A;
                        if (lq3Var != null) {
                            lq3Var.a();
                        } else {
                            lq3Var = null;
                        }
                        di2Var.p0 = lq3Var;
                        eg4 eg4Var = di2Var.q0;
                        if (eg4Var != null && eg4Var.Y0().j0 && di2Var.j0) {
                            ii2.t(di2Var, jd1Var);
                        }
                    } else {
                        lq3 lq3Var2 = di2Var.p0;
                        if (lq3Var2 != null) {
                            lq3Var2.b();
                        }
                        di2Var.p0 = null;
                        if (di2Var.j0) {
                            ii2.t(di2Var, jd1Var);
                        }
                    }
                    bl2.G(di2Var);
                    r94 r94Var = di2Var.m0;
                    if (r94Var != null) {
                        sg2 sg2Var = di2Var.o0;
                        if (isFocused) {
                            if (sg2Var != null) {
                                di2Var.U0(r94Var, new tg2(sg2Var));
                                di2Var.o0 = null;
                            }
                            ?? obj5 = new Object();
                            di2Var.U0(r94Var, obj5);
                            di2Var.o0 = obj5;
                        } else if (sg2Var != null) {
                            di2Var.U0(r94Var, new tg2(sg2Var));
                            di2Var.o0 = null;
                        }
                    }
                }
                return jg7Var;
            case 5:
                List list = (List) obj;
                r41 r41Var = (r41) obj2;
                ft2 ft2Var = (ft2) obj3;
                ft2Var.getClass();
                ts2 ts2Var = ts2.c;
                ts2 ts2Var2 = ts2.b;
                ts2 ts2Var3 = ts2.a;
                ts2 ts2Var4 = ts2.d;
                if (list.size() == 1) {
                    size = 0;
                } else {
                    size = list.size() - 1;
                    if (size >= 0) {
                        int i2 = -1;
                        while (true) {
                            int i3 = size - 1;
                            at2 at2Var = (at2) list.get(size);
                            if (!nb3.k(at2Var, ts2Var3) && !nb3.k(at2Var, ts2Var2) && !nb3.k(at2Var, ts2Var4) && !nb3.k(at2Var, ts2Var)) {
                                if ((at2Var instanceof ys2) && i2 < 0) {
                                    i2 = size;
                                }
                                if (i3 < 0) {
                                    size = i2;
                                } else {
                                    size = i3;
                                }
                            }
                        }
                    } else {
                        size = -1;
                    }
                    if (size < 0) {
                        int size2 = list.size();
                        int i4 = -1;
                        int i5 = -1;
                        for (int i6 = 0; i6 < size2; i6++) {
                            at2 at2Var2 = (at2) list.get(i6);
                            if (at2Var2 instanceof ws2) {
                                i4 = i6;
                            } else if (at2Var2 instanceof vs2) {
                                i5 = i6;
                            } else if (!(at2Var2 instanceof xs2)) {
                                if (i4 < 0) {
                                    size = i4;
                                } else if (i5 >= 0) {
                                    size = i5;
                                } else {
                                    if (ft2Var.j0 != null && ft2Var.i0.b()) {
                                        int size3 = list.size();
                                        size = 0;
                                        while (size < size3) {
                                            at2 at2Var3 = (at2) list.get(size);
                                            if (!(at2Var3 instanceof us2) && !(at2Var3 instanceof zs2)) {
                                                size++;
                                            }
                                        }
                                    }
                                    int size4 = list.size();
                                    size = -1;
                                    int i7 = 0;
                                    while (i7 < size4 && (((at2) list.get(i7)) instanceof xs2)) {
                                        int i8 = i7;
                                        i7++;
                                        size = i8;
                                    }
                                    if (size < 0) {
                                        size = 0;
                                    }
                                }
                            }
                        }
                        if (i4 < 0) {
                        }
                    }
                }
                at2 at2Var4 = (at2) list.get(size);
                if (nb3.k(at2Var4, ts2Var2)) {
                    list.remove(size);
                    return jg7Var;
                }
                if (nb3.k(at2Var4, ts2Var)) {
                    u = ft2Var.v(list, r41Var);
                    if (u != x61.COROUTINE_SUSPENDED) {
                        return jg7Var;
                    }
                } else if (nb3.k(at2Var4, ts2Var3)) {
                    dk0 dk0Var = ft2Var.o0;
                    if (dk0Var != null) {
                        dk0Var.a();
                    }
                    ft2Var.j0 = null;
                    list.remove(size);
                    int i9 = 0;
                    while (i9 < size) {
                        at2 at2Var5 = (at2) list.get(i9);
                        if (!nb3.k(at2Var5, ts2Var4) && !nb3.k(at2Var5, ts2Var3) && !(at2Var5 instanceof xs2) && !(at2Var5 instanceof zs2)) {
                            if (at2Var5 instanceof us2) {
                                ft2Var.e(null);
                            } else {
                                i9++;
                            }
                        }
                        list.remove(i9);
                        size--;
                    }
                    return jg7Var;
                } else if (nb3.k(at2Var4, ts2Var4)) {
                    dk0 dk0Var2 = ft2Var.o0;
                    if (dk0Var2 != null) {
                        dk0Var2.x();
                    }
                    ft2Var.j0 = null;
                    list.remove(size);
                    int i10 = 0;
                    while (i10 < size) {
                        at2 at2Var6 = (at2) list.get(i10);
                        if (!nb3.k(at2Var6, ts2Var4) && !(at2Var6 instanceof xs2)) {
                            i10++;
                        } else {
                            list.remove(i10);
                            size--;
                        }
                    }
                    return jg7Var;
                } else if (at2Var4 instanceof ys2) {
                    u = ft2Var.u(list, size, (ys2) at2Var4, r41Var);
                    if (u != x61.COROUTINE_SUSPENDED) {
                        return jg7Var;
                    }
                } else if (at2Var4 instanceof us2) {
                    ft2Var.n(list, size, (us2) at2Var4, true);
                    return jg7Var;
                } else if (at2Var4 instanceof zs2) {
                    ft2Var.x(list, size, (zs2) at2Var4);
                    return jg7Var;
                } else if (at2Var4 instanceof ws2) {
                    ws2 ws2Var = (ws2) at2Var4;
                    Map map = ft2Var.L;
                    ft2Var.k0 = ws2Var.a;
                    Map map2 = ws2Var.b;
                    ft2Var.l0 = map2;
                    if (!map2.isEmpty()) {
                        p04 p04Var = new p04();
                        p04Var.putAll(map2);
                        map.getClass();
                        p04Var.putAll(map);
                        map = p04Var.b();
                    }
                    ft2Var.m0 = map;
                    list.remove(size);
                    int i11 = 0;
                    while (i11 < size) {
                        if (((at2) list.get(i11)) instanceof ws2) {
                            list.remove(i11);
                            size--;
                        } else {
                            i11++;
                        }
                    }
                    ft2Var.A();
                    return jg7Var;
                } else if (!(at2Var4 instanceof vs2)) {
                    if (at2Var4 instanceof xs2) {
                        ft2Var.r(size, list, true);
                        return jg7Var;
                    }
                    i.d();
                    return null;
                } else {
                    throw null;
                }
                return u;
            case 6:
                wb6 wb6Var = (wb6) obj;
                int intValue = ((Number) obj2).intValue();
                wb6Var.getClass();
                ge3 ge3Var = (ge3) obj3;
                ge3Var.getClass();
                z = (wb6Var.k(intValue) || !wb6Var.j(intValue).c()) ? false : false;
                ge3Var.b = z;
                return Boolean.valueOf(z);
            case 7:
                wb6 wb6Var2 = (wb6) obj;
                int intValue2 = ((Number) obj2).intValue();
                wb6Var2.getClass();
                a55 a55Var = (a55) obj3;
                a55Var.getClass();
                if (!wb6Var2.k(intValue2)) {
                    wb6 j = wb6Var2.j(intValue2);
                    np2 e = j.e();
                    if (!nb3.k(e, bt6.g) && !nb3.k(e, bt6.f)) {
                        if (j.c()) {
                            a55Var.e0 = true;
                        }
                    } else {
                        a55Var.e0 = false;
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 8:
                return qo2.p((r41) obj2, (qn2) obj, (m16) obj3);
            default:
                return qo2.p((r41) obj2, (qn2) obj, (m16) obj3);
        }
    }
}
