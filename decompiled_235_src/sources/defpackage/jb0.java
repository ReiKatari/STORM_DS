package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb0  reason: default package */
/* loaded from: classes.dex */
public final class jb0 implements v93 {
    public static final jb0 b = new jb0(0);
    public static final jb0 c = new jb0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ jb0(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x029b, code lost:
        if ("close".equalsIgnoreCase(r4) != false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb A[Catch: IOException -> 0x01a6, TryCatch #4 {IOException -> 0x01a6, blocks: (B:98:0x019c, B:102:0x01a9, B:116:0x01fb, B:122:0x0209, B:123:0x0210, B:125:0x0213, B:128:0x021a, B:133:0x0225, B:140:0x0279, B:142:0x028c, B:146:0x0297, B:153:0x02ac, B:156:0x02b9, B:157:0x02dd, B:148:0x029d, B:139:0x0266, B:159:0x02df, B:160:0x02e2, B:110:0x01d2, B:135:0x0244, B:138:0x024d), top: B:172:0x019c, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213 A[Catch: IOException -> 0x01a6, TryCatch #4 {IOException -> 0x01a6, blocks: (B:98:0x019c, B:102:0x01a9, B:116:0x01fb, B:122:0x0209, B:123:0x0210, B:125:0x0213, B:128:0x021a, B:133:0x0225, B:140:0x0279, B:142:0x028c, B:146:0x0297, B:153:0x02ac, B:156:0x02b9, B:157:0x02dd, B:148:0x029d, B:139:0x0266, B:159:0x02df, B:160:0x02e2, B:110:0x01d2, B:135:0x0244, B:138:0x024d), top: B:172:0x019c, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028c A[Catch: IOException -> 0x01a6, TryCatch #4 {IOException -> 0x01a6, blocks: (B:98:0x019c, B:102:0x01a9, B:116:0x01fb, B:122:0x0209, B:123:0x0210, B:125:0x0213, B:128:0x021a, B:133:0x0225, B:140:0x0279, B:142:0x028c, B:146:0x0297, B:153:0x02ac, B:156:0x02b9, B:157:0x02dd, B:148:0x029d, B:139:0x0266, B:159:0x02df, B:160:0x02e2, B:110:0x01d2, B:135:0x0244, B:138:0x024d), top: B:172:0x019c, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v2, types: [bk1, java.lang.Object] */
    @Override // defpackage.v93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wl5 a(dp3 dp3Var) {
        boolean z;
        ul5 ul5Var;
        long j;
        IOException iOException;
        long j2;
        wl5 a;
        int i;
        yw2 yw2Var;
        yl5 yl5Var;
        boolean z2;
        String a2;
        int i2;
        wl5 a3;
        pa paVar;
        String str;
        boolean z3;
        boolean z4;
        Object hz2Var;
        boolean z5 = false;
        ?? r3 = 1;
        long j3 = 1;
        switch (this.a) {
            case 0:
                bk1 bk1Var = (bk1) dp3Var.h;
                bk1Var.getClass();
                je5 je5Var = (je5) bk1Var.L;
                v62 v62Var = (v62) bk1Var.R;
                pa paVar2 = (pa) dp3Var.i;
                mk5 mk5Var = (mk5) paVar2.X;
                yw2 yw2Var2 = (yw2) paVar2.R;
                long currentTimeMillis = System.currentTimeMillis();
                if (ii2.J((String) paVar2.L) && mk5Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(yw2Var2.a("Connection"));
                try {
                    try {
                        v62Var.j(paVar2);
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        if (z) {
                            try {
                                try {
                                    if ("100-continue".equalsIgnoreCase(yw2Var2.a("Expect"))) {
                                        try {
                                            v62Var.g();
                                            ul5Var = bk1Var.m(true);
                                        } catch (IOException e2) {
                                            bk1Var.o(e2);
                                            throw e2;
                                        }
                                    } else {
                                        ul5Var = null;
                                    }
                                    if (ul5Var == null) {
                                        try {
                                            mk5Var.getClass();
                                            mk5 mk5Var2 = (mk5) paVar2.X;
                                            mk5Var2.getClass();
                                            long a4 = mk5Var2.a();
                                            j3 = currentTimeMillis;
                                            ee5 ee5Var = new ee5(new s62(bk1Var, v62Var.e(paVar2, a4), a4, false));
                                            mk5Var.d(ee5Var);
                                            ee5Var.close();
                                        } catch (IOException e3) {
                                            e = e3;
                                            j = currentTimeMillis;
                                            if (!(e instanceof vz0)) {
                                                if (bk1Var.A) {
                                                    iOException = e;
                                                    j2 = j;
                                                    if (ul5Var == null) {
                                                    }
                                                    ul5 ul5Var2 = ul5Var;
                                                    ul5Var2.a = paVar2;
                                                    ul5Var2.e = bk1Var.j().f;
                                                    ul5Var2.l = j2;
                                                    ul5Var2.m = System.currentTimeMillis();
                                                    a = ul5Var2.a();
                                                    i = a.R;
                                                    while (true) {
                                                        yw2Var = a.Y;
                                                        yl5Var = a.Z;
                                                        if (i != 100) {
                                                        }
                                                        ul5 m = bk1Var.m(false);
                                                        m.getClass();
                                                        m.a = paVar2;
                                                        m.e = bk1Var.j().f;
                                                        m.l = j2;
                                                        m.m = System.currentTimeMillis();
                                                        a = m.a();
                                                        i = a.R;
                                                    }
                                                    if (i != 101) {
                                                    }
                                                    if (z2) {
                                                    }
                                                    if (z2) {
                                                    }
                                                    if (!equalsIgnoreCase) {
                                                    }
                                                    try {
                                                        a2 = yw2Var.a("Content-Type");
                                                        if (a2 == null) {
                                                        }
                                                        long d = v62Var.d(a);
                                                        i2 = i;
                                                        te5 te5Var = new te5(a2, d, new fe5(new t62(bk1Var, v62Var.a(a), d, false)));
                                                        ul5 h = a.h();
                                                        h.g = te5Var;
                                                        h.o = new xd5(26);
                                                        a3 = h.a();
                                                        paVar = a3.A;
                                                        paVar.getClass();
                                                        if (!"close".equalsIgnoreCase(((yw2) paVar.R).a("Connection"))) {
                                                        }
                                                        v62Var.i().e();
                                                        if (i2 == 204) {
                                                        }
                                                        throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a3.Z.h());
                                                    } catch (IOException e4) {
                                                        bk1Var.o(e4);
                                                        throw e4;
                                                    }
                                                }
                                                throw e;
                                            }
                                            throw e;
                                        }
                                    } else {
                                        j3 = currentTimeMillis;
                                        je5Var.i(bk1Var, true, false, false, false, null);
                                        if (bk1Var.j().i != null) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (!z4) {
                                            v62Var.i().e();
                                        }
                                    }
                                } catch (IOException e5) {
                                    e = e5;
                                    ul5Var = null;
                                }
                            } catch (IOException e6) {
                                e = e6;
                                r3 = currentTimeMillis;
                                ul5Var = null;
                                j = r3;
                                if (!(e instanceof vz0)) {
                                }
                            }
                        } else {
                            j3 = currentTimeMillis;
                            je5Var.i(bk1Var, true, false, false, false, null);
                            ul5Var = null;
                        }
                        try {
                            v62Var.b();
                            iOException = null;
                            j2 = j3;
                        } catch (IOException e7) {
                            bk1Var.o(e7);
                            throw e7;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        j = j3;
                        if (!(e instanceof vz0)) {
                        }
                    }
                    if (ul5Var == null) {
                        try {
                            ul5Var = bk1Var.m(false);
                            ul5Var.getClass();
                        } catch (IOException e9) {
                            if (iOException != null) {
                                mb3.q(iOException, e9);
                                throw iOException;
                            }
                            throw e9;
                        }
                    }
                    ul5 ul5Var22 = ul5Var;
                    ul5Var22.a = paVar2;
                    ul5Var22.e = bk1Var.j().f;
                    ul5Var22.l = j2;
                    ul5Var22.m = System.currentTimeMillis();
                    a = ul5Var22.a();
                    i = a.R;
                    while (true) {
                        yw2Var = a.Y;
                        yl5Var = a.Z;
                        if (i != 100 || (102 <= i && i < 200)) {
                            ul5 m2 = bk1Var.m(false);
                            m2.getClass();
                            m2.a = paVar2;
                            m2.e = bk1Var.j().f;
                            m2.l = j2;
                            m2.m = System.currentTimeMillis();
                            a = m2.a();
                            i = a.R;
                        }
                    }
                    if (i != 101) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (bk1Var.j().i != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                    }
                    if (z2) {
                        String a5 = yw2Var.a("Connection");
                        if (a5 == null) {
                            a5 = null;
                        }
                        if ("upgrade".equalsIgnoreCase(a5)) {
                            z5 = true;
                        }
                    }
                    if (!equalsIgnoreCase && z5) {
                        ul5 h2 = a.h();
                        h2.g = new vg7(yl5Var.k(), yl5Var.h());
                        h2.h = bk1Var.q();
                        a3 = h2.a();
                        i2 = i;
                    } else {
                        a2 = yw2Var.a("Content-Type");
                        if (a2 == null) {
                            a2 = null;
                        }
                        long d2 = v62Var.d(a);
                        i2 = i;
                        te5 te5Var2 = new te5(a2, d2, new fe5(new t62(bk1Var, v62Var.a(a), d2, false)));
                        ul5 h3 = a.h();
                        h3.g = te5Var2;
                        h3.o = new xd5(26);
                        a3 = h3.a();
                    }
                    paVar = a3.A;
                    paVar.getClass();
                    if (!"close".equalsIgnoreCase(((yw2) paVar.R).a("Connection"))) {
                        String a6 = a3.Y.a("Connection");
                        if (a6 == null) {
                            str = null;
                        } else {
                            str = a6;
                        }
                        break;
                    }
                    v62Var.i().e();
                    if ((i2 == 204 && i2 != 205) || a3.Z.h() <= 0) {
                        return a3;
                    }
                    throw new ProtocolException("HTTP " + i2 + " had non-zero Content-Length: " + a3.Z.h());
                } catch (IOException e10) {
                    bk1Var.o(e10);
                    throw e10;
                }
            default:
                je5 je5Var2 = (je5) dp3Var.g;
                synchronized (je5Var2) {
                    if (je5Var2.l0) {
                        if (je5Var2.i0 || je5Var2.h0 || je5Var2.k0 || je5Var2.j0) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("released");
                    }
                }
                w62 w62Var = je5Var2.d0;
                w62Var.getClass();
                ke5 a7 = w62Var.a();
                xk4 xk4Var = je5Var2.A;
                a7.getClass();
                xk4Var.getClass();
                int i3 = dp3Var.d;
                bt btVar = a7.h;
                qz2 qz2Var = a7.i;
                if (qz2Var != null) {
                    hz2Var = new rz2(xk4Var, a7, dp3Var, qz2Var);
                } else {
                    a7.e.setSoTimeout(i3);
                    b67 b2 = ((fe5) btVar.L).A.b();
                    long j4 = i3;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    b2.g(j4, timeUnit);
                    ((ee5) btVar.R).A.b().g(dp3Var.e, timeUnit);
                    hz2Var = new hz2(xk4Var, a7, btVar);
                }
                w62Var.getClass();
                ?? obj = new Object();
                obj.L = je5Var2;
                obj.B = w62Var;
                obj.R = hz2Var;
                je5Var2.g0 = obj;
                je5Var2.n0 = obj;
                synchronized (je5Var2) {
                    je5Var2.h0 = true;
                    je5Var2.i0 = true;
                }
                if (!je5Var2.m0) {
                    return dp3.a(dp3Var, 0, obj, null, 61).f((pa) dp3Var.i);
                }
                e41.i("Canceled");
                return null;
        }
    }
}
