package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g03  reason: default package */
/* loaded from: classes.dex */
public final class g03 implements la2 {
    public static final ma0 f = new ma0(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final ma0 g = new ma0(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    public final String a;
    public final fo4 b;
    public final ex6 c;
    public final ex6 d;
    public final boolean e;

    public g03(String str, fo4 fo4Var, ex6 ex6Var, ex6 ex6Var2, boolean z) {
        this.a = str;
        this.b = fo4Var;
        this.c = ex6Var;
        this.d = ex6Var2;
        this.e = z;
    }

    public static String d(String str, n34 n34Var) {
        String str2;
        String b;
        if (n34Var != null) {
            str2 = n34Var.a;
        } else {
            str2 = null;
        }
        if ((str2 == null || xs6.g0(str2, "text/plain", false)) && (b = k.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b;
        }
        if (str2 == null) {
            return null;
        }
        return qs6.P0(str2, ';');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0207 A[Catch: Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, blocks: (B:90:0x01d3, B:92:0x01d9, B:94:0x01f9, B:96:0x01fe, B:95:0x01fc, B:100:0x0207, B:101:0x020c), top: B:121:0x01d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0218 A[Catch: Exception -> 0x0052, TRY_ENTER, TryCatch #4 {Exception -> 0x0052, blocks: (B:20:0x0049, B:63:0x014c, B:108:0x0218, B:109:0x021d, B:36:0x0094, B:38:0x009e, B:45:0x00ce, B:47:0x00d2, B:50:0x00eb, B:60:0x0137, B:52:0x0103, B:54:0x010f, B:55:0x0118, B:41:0x00b4, B:43:0x00be, B:57:0x0122, B:58:0x0129, B:59:0x012a), top: B:120:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: Exception -> 0x0052, TRY_ENTER, TryCatch #4 {Exception -> 0x0052, blocks: (B:20:0x0049, B:63:0x014c, B:108:0x0218, B:109:0x021d, B:36:0x0094, B:38:0x009e, B:45:0x00ce, B:47:0x00d2, B:50:0x00eb, B:60:0x0137, B:52:0x0103, B:54:0x010f, B:55:0x0118, B:41:0x00b4, B:43:0x00be, B:57:0x0122, B:58:0x0129, B:59:0x012a), top: B:120:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[Catch: Exception -> 0x0052, TryCatch #4 {Exception -> 0x0052, blocks: (B:20:0x0049, B:63:0x014c, B:108:0x0218, B:109:0x021d, B:36:0x0094, B:38:0x009e, B:45:0x00ce, B:47:0x00d2, B:50:0x00eb, B:60:0x0137, B:52:0x0103, B:54:0x010f, B:55:0x0118, B:41:0x00b4, B:43:0x00be, B:57:0x0122, B:58:0x0129, B:59:0x012a), top: B:120:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d9 A[Catch: Exception -> 0x0202, TryCatch #5 {Exception -> 0x0202, blocks: (B:90:0x01d3, B:92:0x01d9, B:94:0x01f9, B:96:0x01fe, B:95:0x01fc, B:100:0x0207, B:101:0x020c), top: B:121:0x01d3 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    @Override // defpackage.la2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r41 r41Var) {
        f03 f03Var;
        ?? r2;
        le5 le5Var;
        va0 a;
        Object b;
        me5 me5Var;
        yl5 yl5Var;
        le5 le5Var2;
        wl5 wl5Var;
        le5 h;
        String str;
        g03 g03Var;
        zb1 zb1Var;
        wl5 wl5Var2;
        yl5 yl5Var2;
        zb1 zb1Var2;
        try {
            if (r41Var instanceof f03) {
                f03Var = (f03) r41Var;
                int i = f03Var.e0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    f03Var.e0 = i - Integer.MIN_VALUE;
                    Object obj = f03Var.Z;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    r2 = f03Var.e0;
                    n34 n34Var = null;
                    if (r2 == 0) {
                        if (r2 != 1) {
                            if (r2 == 2) {
                                wl5Var = (wl5) f03Var.Y;
                                le5Var2 = f03Var.X;
                                g03Var = f03Var.R;
                                try {
                                    oi2.Y(obj);
                                    wl5Var2 = (wl5) obj;
                                } catch (Exception e) {
                                    e = e;
                                    try {
                                        k.a(wl5Var);
                                        throw e;
                                    } catch (Exception e2) {
                                        e = e2;
                                        r2 = le5Var2;
                                        if (r2 != 0) {
                                            k.a(r2);
                                        }
                                        throw e;
                                    }
                                }
                                try {
                                    Bitmap.Config[] configArr = k.a;
                                    yl5Var2 = wl5Var2.Z;
                                    if (yl5Var2 == null) {
                                        g03Var.getClass();
                                        z80 n = yl5Var2.n();
                                        Context context = g03Var.b.a;
                                        jn6 jn6Var = new jn6(n, null);
                                        String d = d(g03Var.a, yl5Var2.k());
                                        if (wl5Var2.e0 != null) {
                                            zb1Var2 = zb1.NETWORK;
                                        } else {
                                            zb1Var2 = zb1.DISK;
                                        }
                                        return new mn6(jn6Var, d, zb1Var2);
                                    }
                                    throw new IllegalStateException("response body == null");
                                } catch (Exception e3) {
                                    e = e3;
                                    wl5Var = wl5Var2;
                                    k.a(wl5Var);
                                    throw e;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        va0 va0Var = (va0) f03Var.Y;
                        le5Var = f03Var.X;
                        g03 g03Var2 = f03Var.R;
                        oi2.Y(obj);
                        a = va0Var;
                        this = g03Var2;
                        b = obj;
                    } else {
                        oi2.Y(obj);
                        fo4 fo4Var = this.b;
                        boolean readEnabled = fo4Var.n.getReadEnabled();
                        String str2 = this.a;
                        if (readEnabled && (me5Var = (me5) this.d.getValue()) != null) {
                            String str3 = fo4Var.i;
                            if (str3 == null) {
                                str3 = str2;
                            }
                            lk1 lk1Var = me5Var.b;
                            da0 da0Var = da0.R;
                            gk1 k = lk1Var.k(xd5.o(str3).c("SHA-256").e());
                            if (k != null) {
                                le5Var = new le5(k);
                                if (le5Var == null) {
                                    db2 c = c();
                                    gk1 gk1Var = le5Var.A;
                                    if (!gk1Var.B) {
                                        Long l = (Long) c.A((lt4) gk1Var.A.c.get(0)).e;
                                        if (l != null && l.longValue() == 0) {
                                            return new mn6(g(le5Var), d(str2, null), zb1.DISK);
                                        }
                                        if (this.e) {
                                            a = new ua0(e(), f(le5Var)).a();
                                            ta0 ta0Var = a.b;
                                            if (a.a == null && ta0Var != null) {
                                                return new mn6(g(le5Var), d(str2, (n34) ta0Var.b.getValue()), zb1.DISK);
                                            }
                                        } else {
                                            xa2 g2 = g(le5Var);
                                            ta0 f2 = f(le5Var);
                                            if (f2 != null) {
                                                n34Var = (n34) f2.b.getValue();
                                            }
                                            return new mn6(g2, d(str2, n34Var), zb1.DISK);
                                        }
                                    } else {
                                        throw new IllegalStateException("snapshot is closed");
                                    }
                                } else {
                                    a = new ua0(e(), null).a();
                                }
                                pa paVar = a.a;
                                paVar.getClass();
                                f03Var.R = this;
                                f03Var.X = le5Var;
                                f03Var.Y = a;
                                f03Var.e0 = 1;
                                b = b(paVar, f03Var);
                                if (b == x61Var) {
                                    return x61Var;
                                }
                            }
                        }
                        le5Var = null;
                        if (le5Var == null) {
                        }
                        pa paVar2 = a.a;
                        paVar2.getClass();
                        f03Var.R = this;
                        f03Var.X = le5Var;
                        f03Var.Y = a;
                        f03Var.e0 = 1;
                        b = b(paVar2, f03Var);
                        if (b == x61Var) {
                        }
                    }
                    wl5 wl5Var3 = (wl5) b;
                    Bitmap.Config[] configArr2 = k.a;
                    yl5Var = wl5Var3.Z;
                    if (yl5Var == null) {
                        try {
                            h = this.h(le5Var, a.a, wl5Var3, a.b);
                            str = this.a;
                        } catch (Exception e4) {
                            e = e4;
                            le5Var2 = le5Var;
                        }
                        try {
                            if (h != null) {
                                xa2 g3 = this.g(h);
                                ta0 f3 = this.f(h);
                                if (f3 != null) {
                                    n34Var = (n34) f3.b.getValue();
                                }
                                return new mn6(g3, d(str, n34Var), zb1.NETWORK);
                            } else if (yl5Var.n().T(1L)) {
                                z80 n2 = yl5Var.n();
                                Context context2 = this.b.a;
                                jn6 jn6Var2 = new jn6(n2, null);
                                String d2 = d(str, yl5Var.k());
                                if (wl5Var3.e0 != null) {
                                    zb1Var = zb1.NETWORK;
                                } else {
                                    zb1Var = zb1.DISK;
                                }
                                return new mn6(jn6Var2, d2, zb1Var);
                            } else {
                                k.a(wl5Var3);
                                pa e5 = this.e();
                                f03Var.R = this;
                                f03Var.X = h;
                                f03Var.Y = wl5Var3;
                                f03Var.e0 = 2;
                                Object b2 = this.b(e5, f03Var);
                                if (b2 != x61Var) {
                                    le5Var2 = h;
                                    obj = b2;
                                    g03Var = this;
                                    wl5Var = wl5Var3;
                                    wl5Var2 = (wl5) obj;
                                    Bitmap.Config[] configArr3 = k.a;
                                    yl5Var2 = wl5Var2.Z;
                                    if (yl5Var2 == null) {
                                    }
                                }
                                return x61Var;
                            }
                        } catch (Exception e6) {
                            le5Var2 = h;
                            e = e6;
                            wl5Var = wl5Var3;
                            k.a(wl5Var);
                            throw e;
                        }
                    }
                    throw new IllegalStateException("response body == null");
                }
            }
            if (r2 == 0) {
            }
            wl5 wl5Var32 = (wl5) b;
            Bitmap.Config[] configArr22 = k.a;
            yl5Var = wl5Var32.Z;
            if (yl5Var == null) {
            }
        } catch (Exception e7) {
            e = e7;
        }
        f03Var = new f03(this, (s41) r41Var);
        Object obj2 = f03Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        r2 = f03Var.e0;
        n34 n34Var2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pa paVar, s41 s41Var) {
        e03 e03Var;
        int i;
        wl5 e;
        boolean z;
        if (s41Var instanceof e03) {
            e03Var = (e03) s41Var;
            int i2 = e03Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e03Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = e03Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = e03Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Bitmap.Config[] configArr = k.a;
                    boolean k = nb3.k(Looper.myLooper(), Looper.getMainLooper());
                    ex6 ex6Var = this.c;
                    if (k) {
                        if (!this.b.o.getReadEnabled()) {
                            xk4 xk4Var = (xk4) ex6Var.getValue();
                            xk4Var.getClass();
                            paVar.getClass();
                            e = new je5(xk4Var, paVar, false).e();
                            z = e.m0;
                            int i3 = e.R;
                            if (z && i3 != 304) {
                                yl5 yl5Var = e.Z;
                                if (yl5Var != null) {
                                    k.a(yl5Var);
                                }
                                StringBuilder t = xg6.t("HTTP ", i3, ": ");
                                t.append(e.L);
                                throw new RuntimeException(t.toString());
                            }
                            return e;
                        }
                        throw new NetworkOnMainThreadException();
                    }
                    xk4 xk4Var2 = (xk4) ex6Var.getValue();
                    xk4Var2.getClass();
                    paVar.getClass();
                    je5 je5Var = new je5(xk4Var2, paVar, false);
                    e03Var.Y = 1;
                    rj0 rj0Var = new rj0(1, np2.V(e03Var));
                    rj0Var.v();
                    r5 r5Var = new r5(7, je5Var, rj0Var);
                    je5Var.d(r5Var);
                    rj0Var.z(r5Var);
                    obj = rj0Var.s();
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                e = (wl5) obj;
                z = e.m0;
                int i32 = e.R;
                if (z) {
                }
                return e;
            }
        }
        e03Var = new e03(this, s41Var);
        Object obj2 = e03Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = e03Var.Y;
        if (i == 0) {
        }
        e = (wl5) obj2;
        z = e.m0;
        int i322 = e.R;
        if (z) {
        }
        return e;
    }

    public final db2 c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((me5) value).a;
    }

    public final pa e() {
        s9 s9Var = new s9(13);
        s9Var.I(this.a);
        fo4 fo4Var = this.b;
        yw2 yw2Var = fo4Var.j;
        ra0 ra0Var = fo4Var.n;
        yw2Var.getClass();
        s9Var.c = yw2Var.c();
        for (Map.Entry entry : fo4Var.k.a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            s9Var.e = ((qo2) s9Var.e).F(gh5.a((Class) key), value);
        }
        boolean readEnabled = ra0Var.getReadEnabled();
        boolean readEnabled2 = fo4Var.o.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            s9Var.l(ma0.o);
        } else if (readEnabled2 && !readEnabled) {
            if (ra0Var.getWriteEnabled()) {
                s9Var.l(ma0.n);
            } else {
                s9Var.l(f);
            }
        } else if (!readEnabled2 && !readEnabled) {
            s9Var.l(g);
        }
        return new pa(s9Var);
    }

    public final ta0 f(le5 le5Var) {
        try {
            db2 c = c();
            gk1 gk1Var = le5Var.A;
            if (!gk1Var.B) {
                fe5 u = hi2.u(c.N((lt4) gk1Var.A.c.get(0)));
                ta0 ta0Var = new ta0(u);
                try {
                    u.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                if (th == null) {
                    return ta0Var;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed");
        } catch (IOException unused) {
            return null;
        }
    }

    public final xa2 g(le5 le5Var) {
        gk1 gk1Var = le5Var.A;
        if (!gk1Var.B) {
            lt4 lt4Var = (lt4) gk1Var.A.c.get(1);
            db2 c = c();
            String str = this.b.i;
            if (str == null) {
                str = this.a;
            }
            return new xa2(lt4Var, c, str, le5Var);
        }
        i.m("snapshot is closed");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final le5 h(le5 le5Var, pa paVar, wl5 wl5Var, ta0 ta0Var) {
        s35 s35Var;
        Throwable th;
        bk1 h;
        Throwable th2 = null;
        if (this.b.n.getWriteEnabled() && (!this.e || (!paVar.h().b && !wl5Var.e().b && !nb3.k(wl5Var.Y.a("Vary"), "*")))) {
            if (le5Var != null) {
                gk1 gk1Var = le5Var.A;
                lk1 lk1Var = gk1Var.L;
                synchronized (lk1Var) {
                    gk1Var.close();
                    h = lk1Var.h(gk1Var.A.a);
                }
                if (h != null) {
                    s35Var = new s35(h);
                    if (s35Var != null) {
                        try {
                            try {
                                if (wl5Var.R == 304 && ta0Var != null) {
                                    ul5 h2 = wl5Var.h();
                                    h2.f = ge7.u(ta0Var.f, wl5Var.Y).c();
                                    wl5 a = h2.a();
                                    ee5 t = hi2.t(c().J(((bk1) s35Var.A).i(0)));
                                    try {
                                        new ta0(a).a(t);
                                        try {
                                            t.close();
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        try {
                                            t.close();
                                        } catch (Throwable th5) {
                                            mb3.q(th2, th5);
                                        }
                                    }
                                    if (th2 != null) {
                                        throw th2;
                                    }
                                } else {
                                    ee5 t2 = hi2.t(c().J(((bk1) s35Var.A).i(0)));
                                    try {
                                        new ta0(wl5Var).a(t2);
                                        try {
                                            t2.close();
                                            th = null;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        try {
                                            t2.close();
                                        } catch (Throwable th8) {
                                            mb3.q(th7, th8);
                                        }
                                        th = th7;
                                    }
                                    if (th == null) {
                                        ee5 t3 = hi2.t(c().J(((bk1) s35Var.A).i(1)));
                                        try {
                                            yl5 yl5Var = wl5Var.Z;
                                            yl5Var.getClass();
                                            yl5Var.n().C(t3);
                                            try {
                                                t3.close();
                                            } catch (Throwable th9) {
                                                th2 = th9;
                                            }
                                        } catch (Throwable th10) {
                                            th2 = th10;
                                            try {
                                                t3.close();
                                            } catch (Throwable th11) {
                                                mb3.q(th2, th11);
                                            }
                                        }
                                        if (th2 != null) {
                                            throw th2;
                                        }
                                    } else {
                                        throw th;
                                    }
                                }
                                le5 q = s35Var.q();
                                k.a(wl5Var);
                                return q;
                            } catch (Exception e) {
                                Bitmap.Config[] configArr = k.a;
                                try {
                                    ((bk1) s35Var.A).e(false);
                                } catch (Exception unused) {
                                }
                                throw e;
                            }
                        } catch (Throwable th12) {
                            k.a(wl5Var);
                            throw th12;
                        }
                    }
                }
                s35Var = null;
                if (s35Var != null) {
                }
            } else {
                me5 me5Var = (me5) this.d.getValue();
                if (me5Var != null) {
                    String str = this.b.i;
                    if (str == null) {
                        str = this.a;
                    }
                    lk1 lk1Var2 = me5Var.b;
                    da0 da0Var = da0.R;
                    bk1 h3 = lk1Var2.h(xd5.o(str).c("SHA-256").e());
                    if (h3 != null) {
                        s35Var = new s35(h3);
                        if (s35Var != null) {
                        }
                    }
                }
                s35Var = null;
                if (s35Var != null) {
                }
            }
        } else if (le5Var != null) {
            k.a(le5Var);
        }
        return null;
    }
}
