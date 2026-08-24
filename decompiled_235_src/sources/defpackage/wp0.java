package defpackage;

import java.util.ArrayList;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp0  reason: default package */
/* loaded from: classes.dex */
public final class wp0 implements le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ wp0(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c8, code lost:
        if (r2 == r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01dd, code lost:
        if (((defpackage.fo2) r0.L).e(r1, r2, r3) == r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0168, code lost:
        if (r2 == r4) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a2  */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0168 -> B:78:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x017e -> B:81:0x0178). Please submit an issue!!! */
    @Override // defpackage.le2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ne2 ne2Var, r41 r41Var) {
        df2 df2Var;
        int i;
        Throwable th;
        gf2 gf2Var;
        int i2;
        long j;
        wp0 wp0Var;
        ne2 ne2Var2;
        long j2;
        Throwable th2;
        mf2 mf2Var;
        int i3;
        zb0 zb0Var;
        wp0 wp0Var2 = this;
        ne2 ne2Var3 = ne2Var;
        int i4 = wp0Var2.A;
        Object obj = wp0Var2.L;
        Object obj2 = wp0Var2.B;
        jg7 jg7Var = jg7.a;
        switch (i4) {
            case 0:
                Object b = ((b7) obj2).b(new zb0(3, ne2Var3, (ArrayList) obj), r41Var);
                if (b == x61.COROUTINE_SUSPENDED) {
                    return b;
                }
                return jg7Var;
            case 1:
                if (r41Var instanceof df2) {
                    df2Var = (df2) r41Var;
                    int i5 = df2Var.X;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        df2Var.X = i5 - Integer.MIN_VALUE;
                        Object obj3 = df2Var.R;
                        Object obj4 = x61.COROUTINE_SUSPENDED;
                        i = df2Var.X;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    oi2.Y(obj3);
                                    return jg7Var;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ne2 ne2Var4 = df2Var.d0;
                            wp0 wp0Var3 = df2Var.Z;
                            oi2.Y(obj3);
                            ne2Var3 = ne2Var4;
                            wp0Var2 = wp0Var3;
                        } else {
                            oi2.Y(obj3);
                            df2Var.Z = wp0Var2;
                            df2Var.d0 = ne2Var3;
                            df2Var.X = 1;
                            obj3 = f04.q((le2) obj2, ne2Var3, df2Var);
                            break;
                        }
                        th = (Throwable) obj3;
                        if (th != null) {
                            df2Var.Z = null;
                            df2Var.d0 = null;
                            df2Var.X = 2;
                            break;
                        }
                        return jg7Var;
                    }
                }
                df2Var = new df2(wp0Var2, r41Var);
                Object obj32 = df2Var.R;
                Object obj42 = x61.COROUTINE_SUSPENDED;
                i = df2Var.X;
                if (i == 0) {
                }
                th = (Throwable) obj32;
                if (th != null) {
                }
                return jg7Var;
            case 2:
                if (r41Var instanceof gf2) {
                    gf2Var = (gf2) r41Var;
                    int i6 = gf2Var.X;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        gf2Var.X = i6 - Integer.MIN_VALUE;
                        Object obj5 = gf2Var.R;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i2 = gf2Var.X;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    j2 = gf2Var.f0;
                                    th2 = gf2Var.e0;
                                    ne2Var2 = gf2Var.d0;
                                    wp0Var = gf2Var.Z;
                                    oi2.Y(obj5);
                                    if (((Boolean) obj5).booleanValue()) {
                                        j2++;
                                        boolean z = true;
                                        ne2Var3 = ne2Var2;
                                        j = j2;
                                        wp0Var2 = wp0Var;
                                        if (!z) {
                                            return jg7Var;
                                        }
                                        gf2Var.Z = wp0Var2;
                                        gf2Var.d0 = ne2Var3;
                                        gf2Var.e0 = null;
                                        gf2Var.f0 = j;
                                        gf2Var.X = 1;
                                        obj5 = f04.q((ng2) wp0Var2.B, ne2Var3, gf2Var);
                                        if (obj5 != x61Var) {
                                            wp0Var = wp0Var2;
                                            ne2Var2 = ne2Var3;
                                            j2 = j;
                                            th2 = obj5;
                                            if (th2 == null) {
                                                Long l = new Long(j2);
                                                gf2Var.Z = wp0Var;
                                                gf2Var.d0 = ne2Var2;
                                                gf2Var.e0 = th2;
                                                gf2Var.f0 = j2;
                                                gf2Var.X = 2;
                                                obj5 = ((gg7) wp0Var.L).l(ne2Var2, th2, l, gf2Var);
                                                break;
                                            } else {
                                                z = false;
                                                ne2Var3 = ne2Var2;
                                                j = j2;
                                                wp0Var2 = wp0Var;
                                                if (!z) {
                                                }
                                                gf2Var.Z = wp0Var2;
                                                gf2Var.d0 = ne2Var3;
                                                gf2Var.e0 = null;
                                                gf2Var.f0 = j;
                                                gf2Var.X = 1;
                                                obj5 = f04.q((ng2) wp0Var2.B, ne2Var3, gf2Var);
                                                if (obj5 != x61Var) {
                                                }
                                            }
                                        }
                                        return x61Var;
                                    }
                                    throw th2;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j2 = gf2Var.f0;
                            ne2 ne2Var5 = gf2Var.d0;
                            wp0 wp0Var4 = gf2Var.Z;
                            oi2.Y(obj5);
                            wp0Var = wp0Var4;
                            ne2Var2 = ne2Var5;
                            th2 = obj5;
                            if (th2 == null) {
                            }
                        } else {
                            oi2.Y(obj5);
                            j = 0;
                            gf2Var.Z = wp0Var2;
                            gf2Var.d0 = ne2Var3;
                            gf2Var.e0 = null;
                            gf2Var.f0 = j;
                            gf2Var.X = 1;
                            obj5 = f04.q((ng2) wp0Var2.B, ne2Var3, gf2Var);
                            if (obj5 != x61Var) {
                            }
                            return x61Var;
                        }
                    }
                }
                gf2Var = new gf2(wp0Var2, r41Var);
                Object obj52 = gf2Var.R;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i2 = gf2Var.X;
                if (i2 == 0) {
                }
            case 3:
                if (r41Var instanceof mf2) {
                    mf2Var = (mf2) r41Var;
                    int i7 = mf2Var.X;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        mf2Var.X = i7 - Integer.MIN_VALUE;
                        Object obj6 = mf2Var.R;
                        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                        i3 = mf2Var.X;
                        if (i3 == 0) {
                            if (i3 == 1) {
                                zb0Var = mf2Var.Z;
                                try {
                                    oi2.Y(obj6);
                                } catch (o e) {
                                    e = e;
                                    if (e.A != zb0Var) {
                                    }
                                }
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj6);
                            wp0 wp0Var5 = (wp0) obj2;
                            zb0 zb0Var2 = new zb0(8, (m8) obj, ne2Var3);
                            try {
                                mf2Var.Z = zb0Var2;
                                mf2Var.X = 1;
                                if (wp0Var5.b(zb0Var2, mf2Var) == x61Var3) {
                                    return x61Var3;
                                }
                            } catch (o e2) {
                                e = e2;
                                zb0Var = zb0Var2;
                                if (e.A != zb0Var) {
                                    l61 l61Var = mf2Var.B;
                                    l61Var.getClass();
                                    yh2.o(l61Var);
                                    return jg7Var;
                                }
                                throw e;
                            }
                        }
                        return jg7Var;
                    }
                }
                mf2Var = new mf2(wp0Var2, r41Var);
                Object obj62 = mf2Var.R;
                x61 x61Var32 = x61.COROUTINE_SUSPENDED;
                i3 = mf2Var.X;
                if (i3 == 0) {
                }
                return jg7Var;
            case 4:
                Object o = nb3.o(r41Var, ne2Var3, jz.R, new o12((r41) null, (go2) obj, 2), (le2[]) obj2);
                if (o == x61.COROUTINE_SUSPENDED) {
                    return o;
                }
                return jg7Var;
            case 5:
                Object o2 = nb3.o(r41Var, ne2Var3, jz.R, new o12((r41) null, (ho2) obj, 3), (le2[]) obj2);
                if (o2 == x61.COROUTINE_SUSPENDED) {
                    return o2;
                }
                return jg7Var;
            case 6:
                Object o3 = nb3.o(r41Var, ne2Var3, jz.R, new o12((r41) null, (io2) obj, 4), (le2[]) obj2);
                if (o3 == x61.COROUTINE_SUSPENDED) {
                    return o3;
                }
                return jg7Var;
            case 7:
                Object b2 = ((pa3) obj2).b(new zb0(11, ne2Var3, (UUID) obj), r41Var);
                if (b2 == x61.COROUTINE_SUSPENDED) {
                    return b2;
                }
                return jg7Var;
            case 8:
                Object b3 = ((na4) obj2).b(new zb0(17, ne2Var3, (on2) obj), r41Var);
                if (b3 == x61.COROUTINE_SUSPENDED) {
                    return b3;
                }
                return jg7Var;
            default:
                Object b4 = ((wp0) obj2).b(new zb0(18, ne2Var3, (ng6) obj), r41Var);
                if (b4 == x61.COROUTINE_SUSPENDED) {
                    return b4;
                }
                return jg7Var;
        }
    }
}
