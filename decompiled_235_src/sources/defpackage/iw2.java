package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw2  reason: default package */
/* loaded from: classes.dex */
public final class iw2 {
    public final o12 a;
    public final eo2 b;
    public final eo2 c;
    public final hb4 d;
    public final hb4 e;
    public final LinkedHashMap f;
    public String g;
    public hb5 h;
    public boolean i;

    public iw2(o12 o12Var, p12 p12Var) {
        zv2 zv2Var = zv2.d0;
        this.a = o12Var;
        this.b = p12Var;
        this.c = zv2Var;
        this.d = new hb4();
        this.e = new hb4();
        this.f = new LinkedHashMap();
        this.i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, o75 o75Var, hb5 hb5Var, s41 s41Var) {
        cw2 cw2Var;
        x61 x61Var;
        int i;
        hb5 hb5Var2;
        fb4 fb4Var;
        String str2;
        o75 o75Var2;
        int i2;
        boolean z;
        hb4 hb4Var;
        fb4 fb4Var2;
        String str3;
        vr4[] vr4VarArr;
        Object c;
        String str4;
        vr4[] vr4VarArr2;
        String str5;
        iw2 iw2Var = this;
        try {
            if (s41Var instanceof cw2) {
                cw2Var = (cw2) s41Var;
                int i3 = cw2Var.l0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    cw2Var.l0 = i3 - Integer.MIN_VALUE;
                    Object obj = cw2Var.j0;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = cw2Var.l0;
                    int i4 = 1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    i4 = cw2Var.h0;
                                    boolean z2 = cw2Var.i0;
                                    str5 = cw2Var.g0;
                                    vr4VarArr2 = cw2Var.f0;
                                    str4 = cw2Var.e0;
                                    oi2.Y(obj);
                                    z = z2;
                                    iw2Var = (iw2) cw2Var.d0;
                                    vr4VarArr = (vr4[]) cw2Var.Z;
                                    c = obj;
                                    vr4VarArr2[i4] = new vr4(str5, c);
                                    iw2Var.c.o(str4, fv.T0(vr4VarArr));
                                    return Boolean.valueOf(z);
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cw2 cw2Var2 = (cw2) cw2Var.e0;
                            fb4Var2 = (fb4) cw2Var.d0;
                            fb4Var = (fb4) cw2Var.Z;
                            hb5Var2 = cw2Var.Y;
                            o75Var2 = cw2Var.X;
                            oi2.Y(obj);
                            iw2Var.f.put(new Long(o75Var2.a), new bw2(o75Var2, hb5Var2));
                            fb4Var2.h(null);
                            z = true;
                            if (!z) {
                                str3 = "hardcore_queue_add";
                            } else {
                                str3 = "hardcore_queue_add_rejected";
                            }
                            vr4VarArr = new vr4[2];
                            vr4VarArr[0] = new vr4("achievement_id", new Long(o75Var2.a));
                            cw2Var.R = null;
                            cw2Var.X = null;
                            cw2Var.Y = null;
                            cw2Var.Z = vr4VarArr;
                            cw2Var.d0 = iw2Var;
                            cw2Var.e0 = str3;
                            cw2Var.f0 = vr4VarArr;
                            cw2Var.g0 = "size";
                            cw2Var.i0 = z;
                            cw2Var.h0 = 1;
                            cw2Var.l0 = 3;
                            c = iw2Var.c(cw2Var);
                            if (c != x61Var) {
                                str4 = str3;
                                vr4VarArr2 = vr4VarArr;
                                str5 = "size";
                                vr4VarArr2[i4] = new vr4(str5, c);
                                iw2Var.c.o(str4, fv.T0(vr4VarArr));
                                return Boolean.valueOf(z);
                            }
                            return x61Var;
                        }
                        i2 = cw2Var.h0;
                        fb4Var = (fb4) cw2Var.Z;
                        hb5Var2 = cw2Var.Y;
                        o75Var2 = cw2Var.X;
                        str2 = cw2Var.R;
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        cw2Var.R = str;
                        cw2Var.X = o75Var;
                        cw2Var.Y = hb5Var;
                        hb4 hb4Var2 = iw2Var.d;
                        cw2Var.Z = hb4Var2;
                        cw2Var.h0 = 0;
                        cw2Var.l0 = 1;
                        if (hb4Var2.e(cw2Var) != x61Var) {
                            hb5Var2 = hb5Var;
                            fb4Var = hb4Var2;
                            str2 = str;
                            o75Var2 = o75Var;
                            i2 = 0;
                        }
                        return x61Var;
                    }
                    if (!iw2Var.i && nb3.k(iw2Var.g, str2) && nb3.k(iw2Var.h, hb5Var2)) {
                        hb4Var = iw2Var.e;
                        cw2Var.R = null;
                        cw2Var.X = o75Var2;
                        cw2Var.Y = hb5Var2;
                        cw2Var.Z = fb4Var;
                        cw2Var.d0 = hb4Var;
                        cw2Var.e0 = null;
                        cw2Var.h0 = i2;
                        cw2Var.l0 = 2;
                        if (hb4Var.e(cw2Var) != x61Var) {
                            fb4Var2 = hb4Var;
                            iw2Var.f.put(new Long(o75Var2.a), new bw2(o75Var2, hb5Var2));
                            fb4Var2.h(null);
                            z = true;
                            if (!z) {
                            }
                            vr4VarArr = new vr4[2];
                            vr4VarArr[0] = new vr4("achievement_id", new Long(o75Var2.a));
                            cw2Var.R = null;
                            cw2Var.X = null;
                            cw2Var.Y = null;
                            cw2Var.Z = vr4VarArr;
                            cw2Var.d0 = iw2Var;
                            cw2Var.e0 = str3;
                            cw2Var.f0 = vr4VarArr;
                            cw2Var.g0 = "size";
                            cw2Var.i0 = z;
                            cw2Var.h0 = 1;
                            cw2Var.l0 = 3;
                            c = iw2Var.c(cw2Var);
                            if (c != x61Var) {
                            }
                        }
                        return x61Var;
                    }
                    z = false;
                    if (!z) {
                    }
                    vr4VarArr = new vr4[2];
                    vr4VarArr[0] = new vr4("achievement_id", new Long(o75Var2.a));
                    cw2Var.R = null;
                    cw2Var.X = null;
                    cw2Var.Y = null;
                    cw2Var.Z = vr4VarArr;
                    cw2Var.d0 = iw2Var;
                    cw2Var.e0 = str3;
                    cw2Var.f0 = vr4VarArr;
                    cw2Var.g0 = "size";
                    cw2Var.i0 = z;
                    cw2Var.h0 = 1;
                    cw2Var.l0 = 3;
                    c = iw2Var.c(cw2Var);
                    if (c != x61Var) {
                    }
                    return x61Var;
                }
            }
            if (i == 0) {
            }
            if (!iw2Var.i) {
                hb4Var = iw2Var.e;
                cw2Var.R = null;
                cw2Var.X = o75Var2;
                cw2Var.Y = hb5Var2;
                cw2Var.Z = fb4Var;
                cw2Var.d0 = hb4Var;
                cw2Var.e0 = null;
                cw2Var.h0 = i2;
                cw2Var.l0 = 2;
                if (hb4Var.e(cw2Var) != x61Var) {
                }
                return x61Var;
            }
            z = false;
            if (!z) {
            }
            vr4VarArr = new vr4[2];
            vr4VarArr[0] = new vr4("achievement_id", new Long(o75Var2.a));
            cw2Var.R = null;
            cw2Var.X = null;
            cw2Var.Y = null;
            cw2Var.Z = vr4VarArr;
            cw2Var.d0 = iw2Var;
            cw2Var.e0 = str3;
            cw2Var.f0 = vr4VarArr;
            cw2Var.g0 = "size";
            cw2Var.i0 = z;
            cw2Var.h0 = 1;
            cw2Var.l0 = 3;
            c = iw2Var.c(cw2Var);
            if (c != x61Var) {
            }
            return x61Var;
        } finally {
            fb4Var.h(null);
        }
        cw2Var = new cw2(iw2Var, s41Var);
        Object obj2 = cw2Var.j0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = cw2Var.l0;
        int i42 = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:45:0x00b0, B:46:0x00b3, B:41:0x00a0, B:44:0x00aa), top: B:54:0x0030 }] */
    /* JADX WARN: Type inference failed for: r10v11, types: [fb4] */
    /* JADX WARN: Type inference failed for: r10v13, types: [fb4] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v7, types: [fb4] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, hb5 hb5Var, s41 s41Var) {
        dw2 dw2Var;
        x61 x61Var;
        int i;
        hb4 hb4Var;
        hb5 hb5Var2;
        int i2;
        hb4 hb4Var2;
        hb4 hb4Var3;
        String str2;
        hb4 hb4Var4;
        hb5 hb5Var3;
        hb4 hb4Var5;
        try {
            if (s41Var instanceof dw2) {
                dw2Var = (dw2) s41Var;
                int i3 = dw2Var.g0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dw2Var.g0 = i3 - Integer.MIN_VALUE;
                    Object obj = dw2Var.e0;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = dw2Var.g0;
                    boolean z = true;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                hb4Var5 = dw2Var.Z;
                                hb4Var2 = dw2Var.Y;
                                hb5Var3 = dw2Var.X;
                                str2 = dw2Var.R;
                                try {
                                    oi2.Y(obj);
                                    hb4Var4 = hb4Var2;
                                    if (this.f.isEmpty()) {
                                        z = false;
                                    } else {
                                        this.g = str2;
                                        this.h = hb5Var3;
                                        this.i = false;
                                    }
                                    hb4Var5.h(null);
                                    hb4Var2 = hb4Var4;
                                    Boolean valueOf = Boolean.valueOf(z);
                                    hb4Var2.h(null);
                                    return valueOf;
                                } catch (Throwable th) {
                                    th = th;
                                    hb4Var2.h(null);
                                    throw th;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i4 = dw2Var.d0;
                        ?? r10 = dw2Var.Y;
                        hb5Var2 = dw2Var.X;
                        String str3 = dw2Var.R;
                        oi2.Y(obj);
                        hb4Var = r10;
                        i2 = i4;
                        str = str3;
                    } else {
                        oi2.Y(obj);
                        if (qs6.v0(str)) {
                            return Boolean.FALSE;
                        }
                        dw2Var.R = str;
                        dw2Var.X = hb5Var;
                        hb4Var = this.d;
                        dw2Var.Y = hb4Var;
                        dw2Var.d0 = 0;
                        dw2Var.g0 = 1;
                        if (hb4Var.e(dw2Var) != x61Var) {
                            hb5Var2 = hb5Var;
                            i2 = 0;
                        }
                        return x61Var;
                    }
                    if (this.i && nb3.k(this.g, str) && nb3.k(this.h, hb5Var2)) {
                        hb4Var2 = hb4Var;
                        Boolean valueOf2 = Boolean.valueOf(z);
                        hb4Var2.h(null);
                        return valueOf2;
                    }
                    hb4Var3 = this.e;
                    dw2Var.R = str;
                    dw2Var.X = hb5Var2;
                    dw2Var.Y = hb4Var;
                    dw2Var.Z = hb4Var3;
                    dw2Var.d0 = i2;
                    dw2Var.g0 = 2;
                    if (hb4Var3.e(dw2Var) != x61Var) {
                        str2 = str;
                        hb4Var4 = hb4Var;
                        hb5Var3 = hb5Var2;
                        hb4Var5 = hb4Var3;
                        if (this.f.isEmpty()) {
                        }
                        hb4Var5.h(null);
                        hb4Var2 = hb4Var4;
                        Boolean valueOf22 = Boolean.valueOf(z);
                        hb4Var2.h(null);
                        return valueOf22;
                    }
                    return x61Var;
                }
            }
            if (this.i) {
            }
            hb4Var3 = this.e;
            dw2Var.R = str;
            dw2Var.X = hb5Var2;
            dw2Var.Y = hb4Var;
            dw2Var.Z = hb4Var3;
            dw2Var.d0 = i2;
            dw2Var.g0 = 2;
            if (hb4Var3.e(dw2Var) != x61Var) {
            }
            return x61Var;
        } catch (Throwable th2) {
            th = th2;
            hb4Var2 = hb4Var;
            hb4Var2.h(null);
            throw th;
        }
        dw2Var = new dw2(this, s41Var);
        Object obj2 = dw2Var.e0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = dw2Var.g0;
        boolean z2 = true;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s41 s41Var) {
        ew2 ew2Var;
        int i;
        hb4 hb4Var;
        try {
            if (s41Var instanceof ew2) {
                ew2Var = (ew2) s41Var;
                int i2 = ew2Var.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ew2Var.Z = i2 - Integer.MIN_VALUE;
                    Object obj = ew2Var.X;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = ew2Var.Z;
                    if (i == 0) {
                        if (i == 1) {
                            hb4Var = ew2Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var2 = this.e;
                        ew2Var.R = hb4Var2;
                        ew2Var.Z = 1;
                        if (hb4Var2.e(ew2Var) == x61Var) {
                            return x61Var;
                        }
                        hb4Var = hb4Var2;
                    }
                    return new Integer(this.f.size());
                }
            }
            return new Integer(this.f.size());
        } finally {
            hb4Var.h(null);
        }
        ew2Var = new ew2(this, s41Var);
        Object obj2 = ew2Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ew2Var.Z;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #2 {all -> 0x00b8, blocks: (B:24:0x005d, B:27:0x0067), top: B:43:0x005d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, s41 s41Var) {
        fw2 fw2Var;
        int i;
        fb4 fb4Var;
        int i2;
        fb4 fb4Var2;
        hb4 hb4Var;
        LinkedHashMap linkedHashMap = this.f;
        try {
            if (s41Var instanceof fw2) {
                fw2Var = (fw2) s41Var;
                int i3 = fw2Var.f0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fw2Var.f0 = i3 - Integer.MIN_VALUE;
                    Object obj = fw2Var.d0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = fw2Var.f0;
                    int i4 = 0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                hb4Var = fw2Var.Y;
                                fb4Var2 = fw2Var.X;
                                try {
                                    oi2.Y(obj);
                                    i4 = linkedHashMap.size();
                                    linkedHashMap.clear();
                                    hb4Var.h(null);
                                    Integer num = new Integer(i4);
                                    fb4Var2.h(null);
                                    this.c.o("hardcore_queue_discarded", fv.T0(new vr4[]{new vr4("count", new Integer(num.intValue()))}));
                                    return num;
                                } catch (Throwable th) {
                                    th = th;
                                    fb4Var2.h(null);
                                    throw th;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i5 = fw2Var.Z;
                        fb4Var = fw2Var.X;
                        String str2 = fw2Var.R;
                        oi2.Y(obj);
                        i2 = i5;
                        str = str2;
                    } else {
                        oi2.Y(obj);
                        fw2Var.R = str;
                        hb4 hb4Var2 = this.d;
                        fw2Var.X = hb4Var2;
                        fw2Var.Z = 0;
                        fw2Var.f0 = 1;
                        if (hb4Var2.e(fw2Var) != x61Var) {
                            fb4Var = hb4Var2;
                            i2 = 0;
                        }
                        return x61Var;
                    }
                    if (nb3.k(this.g, str)) {
                        fb4Var2 = fb4Var;
                        Integer num2 = new Integer(i4);
                        fb4Var2.h(null);
                        this.c.o("hardcore_queue_discarded", fv.T0(new vr4[]{new vr4("count", new Integer(num2.intValue()))}));
                        return num2;
                    }
                    this.i = true;
                    this.g = null;
                    this.h = null;
                    hb4Var = this.e;
                    fw2Var.R = null;
                    fw2Var.X = fb4Var;
                    fw2Var.Y = hb4Var;
                    fw2Var.Z = i2;
                    fw2Var.f0 = 2;
                    if (hb4Var.e(fw2Var) != x61Var) {
                        fb4Var2 = fb4Var;
                        i4 = linkedHashMap.size();
                        linkedHashMap.clear();
                        hb4Var.h(null);
                        Integer num22 = new Integer(i4);
                        fb4Var2.h(null);
                        this.c.o("hardcore_queue_discarded", fv.T0(new vr4[]{new vr4("count", new Integer(num22.intValue()))}));
                        return num22;
                    }
                    return x61Var;
                }
            }
            if (nb3.k(this.g, str)) {
            }
        } catch (Throwable th2) {
            th = th2;
            fb4Var2 = fb4Var;
            fb4Var2.h(null);
            throw th;
        }
        fw2Var = new fw2(this, s41Var);
        Object obj2 = fw2Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = fw2Var.f0;
        int i42 = 0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x006a: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:21:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166 A[Catch: all -> 0x016f, TryCatch #10 {all -> 0x016f, blocks: (B:62:0x015d, B:64:0x0166, B:68:0x0173, B:51:0x0123, B:53:0x0127, B:56:0x0132, B:132:0x038c, B:60:0x014f), top: B:156:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #10 {all -> 0x016f, blocks: (B:62:0x015d, B:64:0x0166, B:68:0x0173, B:51:0x0123, B:53:0x0127, B:56:0x0132, B:132:0x038c, B:60:0x014f), top: B:156:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0 A[Catch: all -> 0x00f8, TryCatch #3 {all -> 0x00f8, blocks: (B:126:0x0354, B:70:0x019a, B:72:0x01a0, B:74:0x01b3, B:122:0x0332, B:42:0x00f3, B:136:0x03a4), top: B:146:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6 A[Catch: all -> 0x008d, TryCatch #7 {all -> 0x008d, blocks: (B:78:0x01da, B:111:0x02ce, B:81:0x01e6, B:84:0x020a, B:86:0x0212, B:105:0x0289, B:107:0x02a4, B:109:0x02af, B:24:0x0082, B:36:0x00d4), top: B:146:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #7 {all -> 0x008d, blocks: (B:78:0x01da, B:111:0x02ce, B:81:0x01e6, B:84:0x020a, B:86:0x0212, B:105:0x0289, B:107:0x02a4, B:109:0x02af, B:24:0x0082, B:36:0x00d4), top: B:146:0x002d }] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x02af -> B:70:0x019a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0235 -> B:142:0x023a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, s41 s41Var) {
        fb4 gw2Var;
        int i;
        Object obj;
        String str2;
        fb4 fb4Var;
        int i2;
        Object c;
        int i3;
        fb4 fb4Var2;
        fb4 fb4Var3;
        int i4;
        aw2 aw2Var;
        List k1;
        Iterator it;
        int i5;
        int i6;
        gw2 gw2Var2;
        int i7;
        bw2 bw2Var;
        fb4 fb4Var4;
        String str3;
        int i8;
        iw2 iw2Var;
        fb4 fb4Var5;
        vr4[] vr4VarArr;
        String str4;
        eo2 eo2Var;
        int i9;
        vr4[] vr4VarArr2;
        String str5;
        eo2 eo2Var2;
        bw2 bw2Var2;
        Object obj2;
        String str6;
        gw2 gw2Var3;
        int i10;
        fb4 fb4Var6;
        int i11;
        hb4 hb4Var;
        int i12;
        Object c2;
        fb4 fb4Var7;
        try {
            try {
                try {
                    if (s41Var instanceof gw2) {
                        gw2Var = (gw2) s41Var;
                        int i13 = gw2Var.n0;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            gw2Var.n0 = i13 - Integer.MIN_VALUE;
                            Object obj3 = gw2Var.l0;
                            x61 x61Var = x61.COROUTINE_SUSPENDED;
                            i = gw2Var.n0;
                            String str7 = "remaining";
                            LinkedHashMap linkedHashMap = this.f;
                            hb4 hb4Var2 = this.e;
                            eo2 eo2Var3 = this.c;
                            Object obj4 = null;
                            switch (i) {
                                case 0:
                                    oi2.Y(obj3);
                                    str2 = str;
                                    gw2Var.R = str2;
                                    fb4Var = this.d;
                                    gw2Var.X = fb4Var;
                                    gw2Var.h0 = 0;
                                    gw2Var.n0 = 1;
                                    if (fb4Var.e(gw2Var) != x61Var) {
                                        i2 = 0;
                                        try {
                                            if (this.i && nb3.k(this.g, str2)) {
                                                gw2Var.R = null;
                                                gw2Var.X = fb4Var;
                                                gw2Var.Y = hb4Var2;
                                                gw2Var.Z = null;
                                                gw2Var.h0 = i2;
                                                gw2Var.i0 = 0;
                                                gw2Var.j0 = 0;
                                                gw2Var.n0 = 3;
                                                if (hb4Var2.e(gw2Var) != x61Var) {
                                                    fb4Var3 = hb4Var2;
                                                    i4 = 0;
                                                    Collection values = linkedHashMap.values();
                                                    values.getClass();
                                                    k1 = gt0.k1(values);
                                                    fb4Var3.h(null);
                                                    if (!k1.isEmpty()) {
                                                        aw2Var = new aw2(0, 0);
                                                        fb4Var.h(null);
                                                        return aw2Var;
                                                    }
                                                    eo2Var3.o("hardcore_queue_drain_start", fv.T0(new vr4[]{new vr4("size", new Integer(k1.size()))}));
                                                    it = k1.iterator();
                                                    i5 = i2;
                                                    i6 = i4;
                                                    gw2Var2 = gw2Var;
                                                    gw2Var = fb4Var;
                                                    i7 = 0;
                                                    if (!it.hasNext()) {
                                                        Object next = it.next();
                                                        next.getClass();
                                                        bw2Var = (bw2) next;
                                                        hb5 hb5Var = bw2Var.b;
                                                        if (nb3.k(hb5Var, this.h)) {
                                                            eo2 eo2Var4 = this.b;
                                                            str3 = str7;
                                                            gw2Var2.R = null;
                                                            gw2Var2.X = gw2Var;
                                                            gw2Var2.Y = bw2Var;
                                                            gw2Var2.Z = it;
                                                            gw2Var2.d0 = null;
                                                            gw2Var2.e0 = null;
                                                            gw2Var2.f0 = null;
                                                            gw2Var2.h0 = i5;
                                                            gw2Var2.i0 = i6;
                                                            gw2Var2.j0 = i7;
                                                            gw2Var2.n0 = 4;
                                                            Object o = eo2Var4.o(hb5Var, gw2Var2);
                                                            if (o != x61Var) {
                                                                fb4Var4 = gw2Var;
                                                                gw2Var = gw2Var2;
                                                                obj3 = o;
                                                                if (((Boolean) obj3).booleanValue()) {
                                                                    i8 = i5;
                                                                    eo2Var = eo2Var3;
                                                                    vr4[] vr4VarArr3 = new vr4[2];
                                                                    vr4VarArr3[0] = new vr4("reason", "identity_mismatch");
                                                                    gw2Var.R = null;
                                                                    gw2Var.X = fb4Var4;
                                                                    gw2Var.Y = vr4VarArr3;
                                                                    gw2Var.Z = "hardcore_queue_drain_blocked";
                                                                    gw2Var.d0 = this;
                                                                    gw2Var.e0 = null;
                                                                    gw2Var.f0 = vr4VarArr3;
                                                                    str7 = str3;
                                                                    gw2Var.g0 = str7;
                                                                    gw2Var.h0 = i8;
                                                                    gw2Var.i0 = i6;
                                                                    gw2Var.j0 = 1;
                                                                    gw2Var.k0 = i7;
                                                                    gw2Var.n0 = 5;
                                                                    c2 = c(gw2Var);
                                                                    if (c2 != x61Var) {
                                                                        iw2Var = this;
                                                                        i9 = 1;
                                                                        vr4VarArr = vr4VarArr3;
                                                                        fb4Var5 = fb4Var4;
                                                                        str4 = "hardcore_queue_drain_blocked";
                                                                        str5 = str7;
                                                                        obj3 = c2;
                                                                        vr4VarArr2 = vr4VarArr;
                                                                        int i14 = i8;
                                                                        int i15 = i6;
                                                                        int i16 = i7;
                                                                        gw2 gw2Var4 = gw2Var;
                                                                        try {
                                                                            vr4VarArr[i9] = new vr4(str5, obj3);
                                                                            iw2Var.c.o(str4, fv.T0(vr4VarArr2));
                                                                            gw2Var = fb4Var5;
                                                                            gw2Var2 = gw2Var4;
                                                                            i7 = i16;
                                                                            i6 = i15;
                                                                            i5 = i14;
                                                                            gw2Var2.R = null;
                                                                            gw2Var2.X = gw2Var;
                                                                            gw2Var2.Y = null;
                                                                            gw2Var2.Z = null;
                                                                            gw2Var2.d0 = null;
                                                                            gw2Var2.e0 = null;
                                                                            gw2Var2.f0 = null;
                                                                            gw2Var2.g0 = null;
                                                                            gw2Var2.h0 = i5;
                                                                            gw2Var2.i0 = i6;
                                                                            gw2Var2.j0 = i7;
                                                                            gw2Var2.n0 = 8;
                                                                            obj3 = c(gw2Var2);
                                                                            if (obj3 != x61Var) {
                                                                                i12 = i7;
                                                                                int intValue = ((Number) obj3).intValue();
                                                                                eo2Var.o("hardcore_queue_drain_complete", fv.T0(new vr4[]{new vr4("submitted", new Integer(i12)), new vr4(str7, new Integer(intValue))}));
                                                                                fb4Var = gw2Var;
                                                                                aw2Var = new aw2(i12, intValue);
                                                                                fb4Var.h(null);
                                                                                return aw2Var;
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            gw2Var = fb4Var5;
                                                                            obj4 = null;
                                                                            gw2Var.h(obj4);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    o12 o12Var = this.a;
                                                                    o75 o75Var = bw2Var.a;
                                                                    hb5 hb5Var2 = bw2Var.b;
                                                                    eo2Var2 = eo2Var3;
                                                                    gw2Var.R = null;
                                                                    gw2Var.X = fb4Var4;
                                                                    gw2Var.Y = bw2Var;
                                                                    gw2Var.Z = it;
                                                                    gw2Var.d0 = null;
                                                                    gw2Var.h0 = i5;
                                                                    gw2Var.i0 = i6;
                                                                    gw2Var.j0 = i7;
                                                                    gw2Var.n0 = 6;
                                                                    obj3 = o12Var.e(o75Var, hb5Var2, gw2Var);
                                                                    if (obj3 == x61Var) {
                                                                    }
                                                                    int i17 = i5;
                                                                    bw2Var2 = bw2Var;
                                                                    obj2 = ((hm5) obj3).A;
                                                                    if (obj2 instanceof em5) {
                                                                        gw2Var.R = null;
                                                                        gw2Var.X = fb4Var4;
                                                                        gw2Var.Y = bw2Var2;
                                                                        gw2Var.Z = it;
                                                                        gw2Var.d0 = null;
                                                                        gw2Var.e0 = hb4Var2;
                                                                        gw2Var.f0 = null;
                                                                        gw2Var.h0 = i17;
                                                                        gw2Var.i0 = i6;
                                                                        gw2Var.j0 = i7;
                                                                        gw2Var.k0 = 0;
                                                                        gw2Var.n0 = 7;
                                                                        if (hb4Var2.e(gw2Var) != x61Var) {
                                                                            try {
                                                                                try {
                                                                                    gw2Var3 = gw2Var;
                                                                                    i10 = i17;
                                                                                    fb4Var6 = fb4Var4;
                                                                                    i11 = i6;
                                                                                    hb4Var = hb4Var2;
                                                                                    try {
                                                                                        linkedHashMap.remove(new Long(bw2Var2.a.a), bw2Var2);
                                                                                        hb4Var.h(null);
                                                                                        i7++;
                                                                                        eo2 eo2Var5 = eo2Var2;
                                                                                        eo2Var5.o("hardcore_queue_drain_submitted", fv.T0(new vr4[]{new vr4("achievement_id", new Long(bw2Var2.a.a))}));
                                                                                        gw2Var2 = r21;
                                                                                        gw2Var = fb4Var7;
                                                                                        eo2Var3 = eo2Var5;
                                                                                        i6 = i11;
                                                                                        i5 = i10;
                                                                                        str7 = str3;
                                                                                        if (!it.hasNext()) {
                                                                                            eo2Var = eo2Var3;
                                                                                            gw2Var2.R = null;
                                                                                            gw2Var2.X = gw2Var;
                                                                                            gw2Var2.Y = null;
                                                                                            gw2Var2.Z = null;
                                                                                            gw2Var2.d0 = null;
                                                                                            gw2Var2.e0 = null;
                                                                                            gw2Var2.f0 = null;
                                                                                            gw2Var2.g0 = null;
                                                                                            gw2Var2.h0 = i5;
                                                                                            gw2Var2.i0 = i6;
                                                                                            gw2Var2.j0 = i7;
                                                                                            gw2Var2.n0 = 8;
                                                                                            obj3 = c(gw2Var2);
                                                                                            if (obj3 != x61Var) {
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        fb4Var7 = fb4Var6;
                                                                                    }
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    gw2Var = fb4Var7;
                                                                                    obj4 = null;
                                                                                    gw2Var.h(obj4);
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                hb4Var.h(null);
                                                                                throw th;
                                                                            }
                                                                            gw2 gw2Var5 = gw2Var3;
                                                                            fb4Var7 = fb4Var6;
                                                                        }
                                                                    } else {
                                                                        eo2 eo2Var6 = eo2Var2;
                                                                        gw2 gw2Var6 = gw2Var;
                                                                        vr4 vr4Var = new vr4("achievement_id", new Long(bw2Var2.a.a));
                                                                        Throwable a = hm5.a(obj2);
                                                                        if (a != null) {
                                                                            str6 = a.getClass().getSimpleName();
                                                                        } else {
                                                                            str6 = "unknown";
                                                                        }
                                                                        eo2Var6.o("hardcore_queue_drain_failed", fv.T0(new vr4[]{vr4Var, new vr4("error", str6)}));
                                                                        i5 = i17;
                                                                        eo2Var3 = eo2Var6;
                                                                        gw2Var = fb4Var4;
                                                                        str7 = str3;
                                                                        gw2Var2 = gw2Var6;
                                                                        if (!it.hasNext()) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            str3 = str7;
                                                            fb4Var4 = gw2Var;
                                                            gw2Var = gw2Var2;
                                                            eo2Var = eo2Var3;
                                                            i8 = i5;
                                                            vr4[] vr4VarArr32 = new vr4[2];
                                                            vr4VarArr32[0] = new vr4("reason", "identity_mismatch");
                                                            gw2Var.R = null;
                                                            gw2Var.X = fb4Var4;
                                                            gw2Var.Y = vr4VarArr32;
                                                            gw2Var.Z = "hardcore_queue_drain_blocked";
                                                            gw2Var.d0 = this;
                                                            gw2Var.e0 = null;
                                                            gw2Var.f0 = vr4VarArr32;
                                                            str7 = str3;
                                                            gw2Var.g0 = str7;
                                                            gw2Var.h0 = i8;
                                                            gw2Var.i0 = i6;
                                                            gw2Var.j0 = 1;
                                                            gw2Var.k0 = i7;
                                                            gw2Var.n0 = 5;
                                                            c2 = c(gw2Var);
                                                            if (c2 != x61Var) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                gw2Var.R = null;
                                                gw2Var.X = fb4Var;
                                                gw2Var.h0 = i2;
                                                gw2Var.i0 = 0;
                                                gw2Var.j0 = 0;
                                                gw2Var.n0 = 2;
                                                c = c(gw2Var);
                                                if (c != x61Var) {
                                                    i3 = 0;
                                                    fb4Var2 = fb4Var;
                                                    obj3 = c;
                                                    aw2Var = new aw2(i3, ((Number) obj3).intValue());
                                                    fb4Var = fb4Var2;
                                                    fb4Var.h(null);
                                                    return aw2Var;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            gw2Var = fb4Var;
                                            obj4 = null;
                                            gw2Var.h(obj4);
                                            throw th;
                                        }
                                    }
                                    return x61Var;
                                case 1:
                                    int i18 = gw2Var.h0;
                                    fb4 fb4Var8 = gw2Var.X;
                                    String str8 = gw2Var.R;
                                    oi2.Y(obj3);
                                    i2 = i18;
                                    fb4Var = fb4Var8;
                                    str2 = str8;
                                    if (this.i) {
                                        break;
                                    }
                                    gw2Var.R = null;
                                    gw2Var.X = fb4Var;
                                    gw2Var.h0 = i2;
                                    gw2Var.i0 = 0;
                                    gw2Var.j0 = 0;
                                    gw2Var.n0 = 2;
                                    c = c(gw2Var);
                                    if (c != x61Var) {
                                    }
                                    return x61Var;
                                case 2:
                                    i3 = gw2Var.j0;
                                    fb4Var2 = gw2Var.X;
                                    oi2.Y(obj3);
                                    aw2Var = new aw2(i3, ((Number) obj3).intValue());
                                    fb4Var = fb4Var2;
                                    fb4Var.h(null);
                                    return aw2Var;
                                case 3:
                                    int i19 = gw2Var.i0;
                                    i2 = gw2Var.h0;
                                    gw2 gw2Var7 = (gw2) gw2Var.Z;
                                    fb4Var3 = (fb4) gw2Var.Y;
                                    fb4 fb4Var9 = gw2Var.X;
                                    oi2.Y(obj3);
                                    i4 = i19;
                                    fb4Var = fb4Var9;
                                    Collection values2 = linkedHashMap.values();
                                    values2.getClass();
                                    k1 = gt0.k1(values2);
                                    fb4Var3.h(null);
                                    if (!k1.isEmpty()) {
                                    }
                                    break;
                                case 4:
                                    i7 = gw2Var.j0;
                                    i6 = gw2Var.i0;
                                    i5 = gw2Var.h0;
                                    List list = (List) gw2Var.d0;
                                    it = (Iterator) gw2Var.Z;
                                    bw2Var = (bw2) gw2Var.Y;
                                    fb4Var4 = gw2Var.X;
                                    oi2.Y(obj3);
                                    str3 = "remaining";
                                    if (((Boolean) obj3).booleanValue()) {
                                    }
                                    break;
                                case 5:
                                    i7 = gw2Var.k0;
                                    int i20 = gw2Var.j0;
                                    i6 = gw2Var.i0;
                                    i8 = gw2Var.h0;
                                    String str9 = gw2Var.g0;
                                    vr4[] vr4VarArr4 = gw2Var.f0;
                                    bw2 bw2Var3 = (bw2) gw2Var.e0;
                                    iw2Var = gw2Var.d0;
                                    String str10 = (String) gw2Var.Z;
                                    vr4[] vr4VarArr5 = (vr4[]) gw2Var.Y;
                                    fb4 fb4Var10 = gw2Var.X;
                                    try {
                                        oi2.Y(obj3);
                                        fb4Var5 = fb4Var10;
                                        vr4VarArr = vr4VarArr5;
                                        str4 = str10;
                                        eo2Var = eo2Var3;
                                        i9 = i20;
                                        vr4VarArr2 = vr4VarArr4;
                                        str5 = str9;
                                        int i142 = i8;
                                        int i152 = i6;
                                        int i162 = i7;
                                        gw2 gw2Var42 = gw2Var;
                                        vr4VarArr[i9] = new vr4(str5, obj3);
                                        iw2Var.c.o(str4, fv.T0(vr4VarArr2));
                                        gw2Var = fb4Var5;
                                        gw2Var2 = gw2Var42;
                                        i7 = i162;
                                        i6 = i152;
                                        i5 = i142;
                                        gw2Var2.R = null;
                                        gw2Var2.X = gw2Var;
                                        gw2Var2.Y = null;
                                        gw2Var2.Z = null;
                                        gw2Var2.d0 = null;
                                        gw2Var2.e0 = null;
                                        gw2Var2.f0 = null;
                                        gw2Var2.g0 = null;
                                        gw2Var2.h0 = i5;
                                        gw2Var2.i0 = i6;
                                        gw2Var2.j0 = i7;
                                        gw2Var2.n0 = 8;
                                        obj3 = c(gw2Var2);
                                        if (obj3 != x61Var) {
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        gw2Var = fb4Var10;
                                        obj4 = null;
                                        gw2Var.h(obj4);
                                        throw th;
                                    }
                                    break;
                                case 6:
                                    i7 = gw2Var.j0;
                                    i6 = gw2Var.i0;
                                    i5 = gw2Var.h0;
                                    List list2 = (List) gw2Var.d0;
                                    it = (Iterator) gw2Var.Z;
                                    bw2Var = (bw2) gw2Var.Y;
                                    fb4Var4 = gw2Var.X;
                                    oi2.Y(obj3);
                                    str3 = "remaining";
                                    eo2Var2 = eo2Var3;
                                    int i172 = i5;
                                    bw2Var2 = bw2Var;
                                    obj2 = ((hm5) obj3).A;
                                    if (obj2 instanceof em5) {
                                    }
                                    break;
                                case 7:
                                    i7 = gw2Var.j0;
                                    i11 = gw2Var.i0;
                                    i10 = gw2Var.h0;
                                    List list3 = (List) gw2Var.f0;
                                    hb4Var = gw2Var.e0;
                                    Iterator it2 = (Iterator) gw2Var.Z;
                                    bw2Var2 = (bw2) gw2Var.Y;
                                    fb4 fb4Var11 = gw2Var.X;
                                    oi2.Y(obj3);
                                    gw2Var3 = gw2Var;
                                    str3 = "remaining";
                                    eo2Var2 = eo2Var3;
                                    fb4Var6 = fb4Var11;
                                    it = it2;
                                    gw2 gw2Var52 = gw2Var3;
                                    fb4Var7 = fb4Var6;
                                    linkedHashMap.remove(new Long(bw2Var2.a.a), bw2Var2);
                                    hb4Var.h(null);
                                    i7++;
                                    eo2 eo2Var52 = eo2Var2;
                                    eo2Var52.o("hardcore_queue_drain_submitted", fv.T0(new vr4[]{new vr4("achievement_id", new Long(bw2Var2.a.a))}));
                                    gw2Var2 = gw2Var52;
                                    gw2Var = fb4Var7;
                                    eo2Var3 = eo2Var52;
                                    i6 = i11;
                                    i5 = i10;
                                    str7 = str3;
                                    if (!it.hasNext()) {
                                    }
                                    break;
                                case 8:
                                    i12 = gw2Var.j0;
                                    List list4 = (List) gw2Var.Y;
                                    gw2Var = gw2Var.X;
                                    try {
                                        oi2.Y(obj3);
                                        eo2Var = eo2Var3;
                                        int intValue2 = ((Number) obj3).intValue();
                                        eo2Var.o("hardcore_queue_drain_complete", fv.T0(new vr4[]{new vr4("submitted", new Integer(i12)), new vr4(str7, new Integer(intValue2))}));
                                        fb4Var = gw2Var;
                                        aw2Var = new aw2(i12, intValue2);
                                        fb4Var.h(null);
                                        return aw2Var;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        gw2Var.h(obj4);
                                        throw th;
                                    }
                                default:
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                            }
                        }
                    }
                    switch (i) {
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                th = th9;
                gw2Var = obj;
            }
        } catch (Throwable th10) {
            th = th10;
            gw2Var = fb4Var4;
        }
        gw2Var = new gw2(this, s41Var);
        Object obj32 = gw2Var.l0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = gw2Var.n0;
        String str72 = "remaining";
        LinkedHashMap linkedHashMap2 = this.f;
        hb4 hb4Var22 = this.e;
        eo2 eo2Var32 = this.c;
        Object obj42 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(s41 s41Var) {
        hw2 hw2Var;
        int i;
        hb4 hb4Var;
        try {
            if (s41Var instanceof hw2) {
                hw2Var = (hw2) s41Var;
                int i2 = hw2Var.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hw2Var.Z = i2 - Integer.MIN_VALUE;
                    Object obj = hw2Var.X;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = hw2Var.Z;
                    if (i == 0) {
                        if (i == 1) {
                            hb4Var = hw2Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var2 = this.e;
                        hw2Var.R = hb4Var2;
                        hw2Var.Z = 1;
                        if (hb4Var2.e(hw2Var) == x61Var) {
                            return x61Var;
                        }
                        hb4Var = hb4Var2;
                    }
                    return new Integer(this.f.size());
                }
            }
            return new Integer(this.f.size());
        } finally {
            hb4Var.h(null);
        }
        hw2Var = new hw2(this, s41Var);
        Object obj2 = hw2Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = hw2Var.Z;
        if (i == 0) {
        }
    }
}
