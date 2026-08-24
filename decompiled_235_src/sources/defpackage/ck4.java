package defpackage;

import java.io.File;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck4  reason: default package */
/* loaded from: classes.dex */
public final class ck4 {
    public final wi a;
    public final hb4 b = new hb4();

    public ck4(wi wiVar) {
        this.a = wiVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(5:(2:3|(10:5|6|7|(1:(1:(8:11|12|13|14|(4:20|21|17|18)|16|17|18)(2:31|32))(1:33))(3:55|(1:57)|40)|34|35|37|38|(6:41|14|(0)|16|17|18)|40))|37|38|(0)|40)|59|6|7|(0)(0)|34|35|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        r9 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [ck4] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13, types: [fb4] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, s41 s41Var) {
        zj4 zj4Var;
        Object obj;
        x61 x61Var;
        int i;
        int i2;
        String str3;
        fb4 fb4Var;
        fb4 fb4Var2;
        byte[] bArr;
        vj4 vj4Var;
        try {
            if (s41Var instanceof zj4) {
                zj4Var = (zj4) s41Var;
                int i3 = zj4Var.f0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    zj4Var.f0 = i3 - Integer.MIN_VALUE;
                    obj = zj4Var.d0;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = zj4Var.f0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                fb4Var2 = zj4Var.Y;
                                try {
                                    oi2.Y(obj);
                                    fb4Var2 = fb4Var2;
                                    bArr = (byte[]) obj;
                                    this = fb4Var2;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Exception unused) {
                                    bArr = null;
                                    this = fb4Var2;
                                    if (bArr != null) {
                                    }
                                    vj4Var = null;
                                    this.h(null);
                                    return vj4Var;
                                }
                                if (bArr != null) {
                                    try {
                                        vj4Var = (vj4) pi4.a.a(vj4.Companion.serializer(), bArr);
                                    } catch (CancellationException e2) {
                                        throw e2;
                                    } catch (Exception unused2) {
                                    }
                                    this.h(null);
                                    return vj4Var;
                                }
                                vj4Var = null;
                                this.h(null);
                                return vj4Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i4 = zj4Var.Z;
                        fb4Var = zj4Var.Y;
                        String str4 = zj4Var.X;
                        String str5 = zj4Var.R;
                        oi2.Y(obj);
                        str3 = str4;
                        i2 = i4;
                        str = str5;
                    } else {
                        oi2.Y(obj);
                        zj4Var.R = str;
                        zj4Var.X = str2;
                        hb4 hb4Var = this.b;
                        zj4Var.Y = hb4Var;
                        i2 = 0;
                        zj4Var.Z = 0;
                        zj4Var.f0 = 1;
                        if (hb4Var.e(zj4Var) != x61Var) {
                            str3 = str2;
                            fb4Var = hb4Var;
                        }
                        return x61Var;
                    }
                    wi wiVar = this.a;
                    zj4Var.R = null;
                    zj4Var.X = null;
                    zj4Var.Y = fb4Var;
                    zj4Var.Z = i2;
                    zj4Var.f0 = 2;
                    kh khVar = wiVar.a;
                    File a = wiVar.a(str, str3);
                    khVar.getClass();
                    xe1 xe1Var = xk1.a;
                    obj = hv.d0(de1.L, new m5(a, khVar, (r41) null, 1), zj4Var);
                    if (obj != x61Var) {
                        fb4Var2 = fb4Var;
                        bArr = (byte[]) obj;
                        this = fb4Var2;
                        if (bArr != null) {
                        }
                        vj4Var = null;
                        this.h(null);
                        return vj4Var;
                    }
                    return x61Var;
                }
            }
            kh khVar2 = wiVar.a;
            File a2 = wiVar.a(str, str3);
            khVar2.getClass();
            xe1 xe1Var2 = xk1.a;
            obj = hv.d0(de1.L, new m5(a2, khVar2, (r41) null, 1), zj4Var);
            if (obj != x61Var) {
            }
            return x61Var;
        } catch (CancellationException e3) {
            e = e3;
            throw e;
        } catch (Throwable th) {
            th = th;
            this = fb4Var;
            this.h(null);
            throw th;
        }
        zj4Var = new zj4(this, s41Var);
        obj = zj4Var.d0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = zj4Var.f0;
        if (i == 0) {
        }
        wi wiVar2 = this.a;
        zj4Var.R = null;
        zj4Var.X = null;
        zj4Var.Y = fb4Var;
        zj4Var.Z = i2;
        zj4Var.f0 = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, s41 s41Var) {
        ak4 ak4Var;
        int i;
        vj4 vj4Var;
        if (s41Var instanceof ak4) {
            ak4Var = (ak4) s41Var;
            int i2 = ak4Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ak4Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = ak4Var.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = ak4Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        str2 = ak4Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ak4Var.R = str2;
                    ak4Var.Z = 1;
                    obj = a(str, str2, ak4Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                vj4Var = (vj4) obj;
                if (vj4Var == null || vj4Var.b == 0 || !nb3.k(vj4Var.a, str2)) {
                    return null;
                }
                return vj4Var;
            }
        }
        ak4Var = new ak4(this, s41Var);
        Object obj3 = ak4Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = ak4Var.Z;
        if (i == 0) {
        }
        vj4Var = (vj4) obj3;
        if (vj4Var == null) {
            return vj4Var;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, vj4 vj4Var, s41 s41Var) {
        bk4 bk4Var;
        Object obj;
        int i;
        int i2;
        String str3;
        vj4 vj4Var2;
        fb4 fb4Var;
        Throwable th;
        fb4 fb4Var2;
        Throwable th2;
        Object d0;
        Object obj2;
        try {
            try {
                try {
                    if (s41Var instanceof bk4) {
                        bk4Var = (bk4) s41Var;
                        int i3 = bk4Var.g0;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            bk4Var.g0 = i3 - Integer.MIN_VALUE;
                            Object obj3 = bk4Var.e0;
                            obj = x61.COROUTINE_SUSPENDED;
                            i = bk4Var.g0;
                            Object obj4 = jg7.a;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        fb4Var2 = bk4Var.Z;
                                        try {
                                            oi2.Y(obj3);
                                            fb4Var2.h(null);
                                            return obj4;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            fb4Var2.h(null);
                                            throw th;
                                        }
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                int i4 = bk4Var.d0;
                                fb4Var = bk4Var.Z;
                                vj4Var2 = bk4Var.Y;
                                String str4 = bk4Var.X;
                                String str5 = bk4Var.R;
                                oi2.Y(obj3);
                                i2 = i4;
                                str = str5;
                                str3 = str4;
                            } else {
                                oi2.Y(obj3);
                                bk4Var.R = str;
                                bk4Var.X = str2;
                                bk4Var.Y = vj4Var;
                                hb4 hb4Var = this.b;
                                bk4Var.Z = hb4Var;
                                i2 = 0;
                                bk4Var.d0 = 0;
                                bk4Var.g0 = 1;
                                if (hb4Var.e(bk4Var) != obj) {
                                    str3 = str2;
                                    vj4Var2 = vj4Var;
                                    fb4Var = hb4Var;
                                }
                                return obj;
                            }
                            wi wiVar = this.a;
                            vj4Var2.getClass();
                            byte[] b = pi4.a.b(vj4.Companion.serializer(), vj4Var2);
                            bk4Var.R = null;
                            bk4Var.X = null;
                            bk4Var.Y = null;
                            bk4Var.Z = fb4Var;
                            bk4Var.d0 = i2;
                            bk4Var.g0 = 2;
                            kh khVar = wiVar.a;
                            File a = wiVar.a(str, str3);
                            khVar.getClass();
                            xe1 xe1Var = xk1.a;
                            d0 = hv.d0(de1.L, new ag(a, khVar, b, null, 2), bk4Var);
                            obj2 = d0;
                            if (d0 != obj) {
                                obj2 = obj4;
                            }
                            if (obj2 != obj) {
                                obj2 = obj4;
                            }
                            if (obj2 != obj) {
                                fb4Var2 = fb4Var;
                                fb4Var2.h(null);
                                return obj4;
                            }
                            return obj;
                        }
                    }
                    kh khVar2 = wiVar.a;
                    File a2 = wiVar.a(str, str3);
                    khVar2.getClass();
                    xe1 xe1Var2 = xk1.a;
                    d0 = hv.d0(de1.L, new ag(a2, khVar2, b, null, 2), bk4Var);
                    obj2 = d0;
                    if (d0 != obj) {
                    }
                    if (obj2 != obj) {
                    }
                    if (obj2 != obj) {
                    }
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    th = th2;
                    fb4Var2 = fb4Var;
                    fb4Var2.h(null);
                    throw th;
                }
                vj4Var2.getClass();
                byte[] b2 = pi4.a.b(vj4.Companion.serializer(), vj4Var2);
                bk4Var.R = null;
                bk4Var.X = null;
                bk4Var.Y = null;
                bk4Var.Z = fb4Var;
                bk4Var.d0 = i2;
                bk4Var.g0 = 2;
            } catch (Throwable th5) {
                th2 = th5;
            }
            wi wiVar2 = this.a;
        } catch (Throwable th6) {
            th = th6;
        }
        bk4Var = new bk4(this, s41Var);
        Object obj32 = bk4Var.e0;
        obj = x61.COROUTINE_SUSPENDED;
        i = bk4Var.g0;
        Object obj42 = jg7.a;
        if (i == 0) {
        }
    }
}
