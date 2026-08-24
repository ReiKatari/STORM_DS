package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hn  reason: default package */
/* loaded from: classes.dex */
public final class hn extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object d0;
    public Object e0;
    public Object f0;
    public Object g0;
    public final /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(dh5 dh5Var, String str, String str2, String str3, String str4, String str5, r41 r41Var) {
        super(2, r41Var);
        this.X = 4;
        this.d0 = dh5Var;
        this.Z = str;
        this.e0 = str2;
        this.f0 = str3;
        this.g0 = str4;
        this.h0 = str5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: all -> 0x0039, LOOP:0: B:30:0x0083->B:32:0x008b, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:9:0x0026, B:30:0x0083, B:32:0x008b), top: B:39:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object A(Object obj) {
        li7 li7Var;
        fb4 fb4Var;
        wq6 wq6Var;
        wq6 wq6Var2 = (wq6) this.h0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        jg7 jg7Var = jg7.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        wq6 wq6Var3 = (wq6) this.g0;
                        li7 li7Var2 = (li7) this.f0;
                        wq6Var = (wq6) this.e0;
                        fb4Var = (fb4) this.Z;
                        try {
                            oi2.Y(obj);
                            jg1 jg1Var = (jg1) obj;
                            wq6Var3.getClass();
                            ((ed3) jg1Var).a0(new t00(wq6Var3, jg1Var, (uq6) null, li7Var2));
                            while (!wq6Var.e.isEmpty()) {
                                uq6 uq6Var = (uq6) wq6Var.e.poll();
                            }
                            return jg7Var;
                        } finally {
                            fb4Var.h(null);
                        }
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wq6Var2 = (wq6) this.e0;
                fb4Var = (fb4) this.Z;
                oi2.Y(obj);
                wq6Var = wq6Var2;
                while (!wq6Var.e.isEmpty()) {
                }
                return jg7Var;
            }
            li7Var = (li7) this.d0;
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            li7Var = wq6Var2.d;
            if (li7Var != null) {
                this.d0 = li7Var;
                this.Y = 1;
                obj = li7Var.c(this);
            }
            return jg7Var;
        }
        if (((Boolean) obj).booleanValue()) {
            hb4 hb4Var = wq6Var2.c;
            this.d0 = li7Var;
            this.Z = hb4Var;
            this.e0 = wq6Var2;
            this.Y = 2;
            if (hb4Var.e(this) != x61Var) {
                fb4Var = hb4Var;
                wq6Var = wq6Var2;
                while (!wq6Var.e.isEmpty()) {
                }
                return jg7Var;
            }
            return x61Var;
        }
        return jg7Var;
    }

    private final Object B(Object obj) {
        zy4 zy4Var = (zy4) this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            cz6 cz6Var = new cz6((w61) this.Z, new j25(zy4Var), (qn2) this.e0, (qn2) this.f0, (fo2) this.g0, (qn2) this.h0, null);
            this.Y = 1;
            if (uj2.o(zy4Var, cz6Var, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0205, code lost:
        if (r2 == r10) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025e, code lost:
        if (defpackage.sz1.I(r4, r1, r16) != r10) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0271, code lost:
        if (r4.l0(r16) == r10) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
        if (r12 == r10) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
        if (r14 == r10) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
        if (r14 == r10) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
        if (r5 != r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0184, code lost:
        if (defpackage.sz1.I(r4, r1, r16) == r10) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0192, code lost:
        if (r4.l0(r16) == r10) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e9, code lost:
        if (r13 == r10) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0289 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object v(Object obj) {
        dy1 dy1Var;
        Object P0;
        int i;
        Object C;
        de5 de5Var;
        bv4 bv4Var;
        Object b;
        Object obj2;
        Object d0;
        String str;
        String str2;
        dy1 dy1Var2;
        pj4 pj4Var;
        Object f;
        Object A;
        mc5 mc5Var = (mc5) this.h0;
        sz1 sz1Var = (sz1) this.g0;
        of6 of6Var = sz1Var.J0;
        of6 of6Var2 = sz1Var.T0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.Y;
        jy1 jy1Var = jy1.a;
        jg7 jg7Var = jg7.a;
        switch (i2) {
            case 0:
                oi2.Y(obj);
                Object value = sz1Var.p0.getValue();
                if (value instanceof dy1) {
                    dy1Var = (dy1) value;
                } else {
                    dy1Var = null;
                }
                if (dy1Var == null) {
                    sz1Var.a1();
                    this.d0 = null;
                    this.Y = 1;
                    if (of6Var2.a(jy1Var, this) != x61Var) {
                        return jg7Var;
                    }
                } else {
                    jh jhVar = sz1Var.v;
                    this.d0 = dy1Var;
                    this.Y = 2;
                    jhVar.getClass();
                    jh.i();
                    break;
                }
                return x61Var;
            case 1:
                oi2.Y(obj);
                return jg7Var;
            case 2:
                dy1Var = (dy1) this.d0;
                oi2.Y(obj);
                this.d0 = dy1Var;
                this.Y = 3;
                P0 = sz1Var.P0(this);
                break;
            case 3:
                dy1Var = (dy1) this.d0;
                oi2.Y(obj);
                P0 = obj;
                if (!((Boolean) P0).booleanValue()) {
                    of6Var.k(g77.a);
                    if (mc5Var == mc5.RESUMABLE_SESSION) {
                        this.d0 = null;
                        this.Y = 4;
                        sz1Var.U0();
                        if (jg7Var == x61Var) {
                        }
                    }
                    return jg7Var;
                }
                nv4 nv4Var = sz1Var.b0;
                if (nv4Var != null && (de5Var = nv4Var.i) != null && (bv4Var = (bv4) de5Var.A.getValue()) != null) {
                    i = bv4Var.c.a;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    this.d0 = dy1Var;
                    this.Y = 5;
                    C = sz1.C(sz1Var, mc5Var, this);
                    break;
                }
                pn5 pn5Var = sz1Var.g;
                this.d0 = dy1Var;
                this.Y = 7;
                b = ((pl) pn5Var).c.b(this);
                break;
                return x61Var;
            case 4:
                oi2.Y(obj);
                return jg7Var;
            case 5:
                dy1Var = (dy1) this.d0;
                oi2.Y(obj);
                C = obj;
                int i3 = x22.a[((nc5) C).ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            i.d();
                            return null;
                        }
                    } else if (mc5Var == mc5.RESUMABLE_SESSION) {
                        this.d0 = null;
                        this.Y = 6;
                        sz1Var.U0();
                        if (jg7Var == x61Var) {
                            return x61Var;
                        }
                    }
                    return jg7Var;
                }
                pn5 pn5Var2 = sz1Var.g;
                this.d0 = dy1Var;
                this.Y = 7;
                b = ((pl) pn5Var2).c.b(this);
                break;
            case 6:
                oi2.Y(obj);
                return jg7Var;
            case 7:
                dy1Var = (dy1) this.d0;
                oi2.Y(obj);
                b = obj;
                dy1 dy1Var3 = dy1Var;
                jb5 jb5Var = (jb5) b;
                if (jb5Var == null) {
                    pq5 pq5Var = dy1Var3.a;
                    this.d0 = null;
                    this.Y = 8;
                    break;
                } else {
                    String a = jb5Var.a();
                    String str3 = dy1Var3.a.i;
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    obj2 = null;
                    i02 i02Var = new i02(sz1Var, a, str3, null, 5);
                    this.d0 = dy1Var3;
                    this.Z = a;
                    this.e0 = str3;
                    this.Y = 11;
                    d0 = hv.d0(de1Var, i02Var, this);
                    if (d0 != x61Var) {
                        str = a;
                        str2 = str3;
                        dy1Var2 = dy1Var3;
                        pj4Var = (pj4) d0;
                        if (pj4Var.a == ui4.OK) {
                            iw2 iw2Var = sz1Var.o0;
                            this.d0 = dy1Var2;
                            this.Z = str;
                            this.e0 = str2;
                            this.f0 = pj4Var;
                            this.Y = 12;
                            f = iw2Var.f(this);
                            break;
                        }
                        pq5 pq5Var2 = dy1Var2.a;
                        this.d0 = obj2;
                        this.Z = obj2;
                        this.e0 = obj2;
                        this.f0 = obj2;
                        this.Y = 15;
                        break;
                    }
                }
                return x61Var;
            case 8:
                oi2.Y(obj);
                this.d0 = null;
                this.Y = 9;
                break;
            case 9:
                oi2.Y(obj);
                sz1Var.a1();
                this.d0 = null;
                this.Y = 10;
                if (of6Var2.a(jy1Var, this) == x61Var) {
                }
                break;
            case 10:
                oi2.Y(obj);
                return jg7Var;
            case 11:
                dy1Var2 = (dy1) this.d0;
                oi2.Y(obj);
                str = (String) this.Z;
                obj2 = null;
                str2 = (String) this.e0;
                d0 = obj;
                pj4Var = (pj4) d0;
                if (pj4Var.a == ui4.OK) {
                }
                pq5 pq5Var22 = dy1Var2.a;
                this.d0 = obj2;
                this.Z = obj2;
                this.e0 = obj2;
                this.f0 = obj2;
                this.Y = 15;
                break;
            case 12:
                pj4Var = (pj4) this.f0;
                str2 = (String) this.e0;
                oi2.Y(obj);
                str = (String) this.Z;
                dy1Var2 = (dy1) this.d0;
                obj2 = null;
                f = obj;
                if (((Number) f).intValue() > 0) {
                    this.d0 = dy1Var2;
                    this.Z = obj2;
                    this.e0 = obj2;
                    this.f0 = obj2;
                    this.Y = 13;
                    A = sz1.A(sz1Var, str, str2, mc5Var, this);
                    break;
                } else {
                    if (pj4Var.a == ui4.OK) {
                        sz1Var.m.b(str, str2);
                        if (pj4Var.b() > 0) {
                            of6Var.k(new f77(pj4Var.b(), pj4Var.e));
                        }
                    }
                    pq5 pq5Var222 = dy1Var2.a;
                    this.d0 = obj2;
                    this.Z = obj2;
                    this.e0 = obj2;
                    this.f0 = obj2;
                    this.Y = 15;
                    break;
                }
            case 13:
                oi2.Y(obj);
                dy1Var2 = (dy1) this.d0;
                obj2 = null;
                A = obj;
                if (!((Boolean) A).booleanValue()) {
                    if (mc5Var == mc5.RESUMABLE_SESSION) {
                        this.d0 = obj2;
                        this.Z = obj2;
                        this.e0 = obj2;
                        this.f0 = obj2;
                        this.Y = 14;
                        sz1Var.U0();
                        if (jg7Var == x61Var) {
                        }
                    } else {
                        sz1Var.Q0(mc5.TERMINAL_STOP);
                        return jg7Var;
                    }
                }
                pq5 pq5Var2222 = dy1Var2.a;
                this.d0 = obj2;
                this.Z = obj2;
                this.e0 = obj2;
                this.f0 = obj2;
                this.Y = 15;
                break;
            case 14:
                oi2.Y(obj);
                return jg7Var;
            case 15:
                oi2.Y(obj);
                obj2 = null;
                this.d0 = obj2;
                this.Z = obj2;
                this.e0 = obj2;
                this.f0 = obj2;
                this.Y = 16;
                break;
            case 16:
                oi2.Y(obj);
                obj2 = null;
                sz1Var.a1();
                this.d0 = obj2;
                this.Z = obj2;
                this.e0 = obj2;
                this.f0 = obj2;
                this.Y = 17;
                if (of6Var2.a(jy1Var, this) == x61Var) {
                }
                break;
            case 17:
                oi2.Y(obj);
                return jg7Var;
            default:
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object x(Object obj) {
        String str;
        String str2;
        Object N;
        String str3;
        hq2 hq2Var = (hq2) this.g0;
        ta7 ta7Var = (ta7) this.Z;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                str2 = (String) this.d0;
                try {
                    oi2.Y(obj);
                    N = obj;
                } catch (Exception e) {
                    e = e;
                    Log.w("GameTranslatorManager", "Translation error for block '" + ta7Var.a + "': " + e.getMessage(), e);
                    str3 = ta7Var.a;
                    hq2Var.u.put(str2, str3);
                    ta7Var.getClass();
                    str3.getClass();
                    ta7Var.b = str3;
                    return jg7.a;
                }
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            List list = qp2.a;
            String str4 = ta7Var.a;
            str4.getClass();
            List z0 = qs6.z0(str4);
            int i2 = 10;
            ArrayList arrayList = new ArrayList(ht0.v0(z0, 10));
            Iterator it = z0.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                String obj2 = qs6.T0((String) it.next()).toString();
                Pattern compile = Pattern.compile("(?i)^\\[?TR\\]?[:\\s]+\\s*");
                compile.getClass();
                obj2.getClass();
                String replaceAll = compile.matcher(obj2).replaceAll("");
                replaceAll.getClass();
                String z = lb1.z("\\s*[|•>~_—\\-]+$", lb1.z("^[|•>~_—\\-]+\\s*", lb1.z("(?i)^([lI1|!:'\"\\.\\,\\-\\_]+\\s+)+", lb1.z("^[lI1|!:'\"\\s\\.\\,\\-\\_~>•\\[\\]]+(?=[A-ZА-Яa-zа-я])", replaceAll, ""), ""), ""), "");
                Pattern compile2 = Pattern.compile("\\s+");
                compile2.getClass();
                String replaceAll2 = compile2.matcher(z).replaceAll(" ");
                replaceAll2.getClass();
                arrayList.add(qs6.T0(replaceAll2).toString());
            }
            ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                String str5 = (String) obj3;
                str5.getClass();
                String e2 = new xh5("([a-zA-Z])0([a-zA-Z])").e(new xh5("(?i)\\b([a-z]+)1\\b").e(new xh5("(?i)\\b1([a-z]{2,})\\b").e(new xh5("(?i)\\b([a-z])[1|!]([a-z]+)\\b").e(new xh5("([a-zA-Z])[1|!]([a-zA-Z])").e(str5, new bz1(i2)), new bz1(11)), new bz1(12)), new bz1(13)), new bz1(14));
                Pattern compile3 = Pattern.compile("(?i)\\by0u\\b");
                compile3.getClass();
                e2.getClass();
                String replaceAll3 = compile3.matcher(e2).replaceAll("you");
                replaceAll3.getClass();
                arrayList2.add(new xh5("(?i)\\b8([a-z]{2,})\\b").e(new xh5("(?i)\\b5([a-z]{2,})\\b").e(lb1.z("(?i)\\bfr0m\\b", lb1.z("(?i)\\bf0r\\b", lb1.z("(?i)\\bn0\\b", lb1.z("(?i)\\bt0\\b", lb1.z("(?i)\\bg0\\b", lb1.z("(?i)\\bc0me\\b", replaceAll3, "come"), "go"), "to"), "no"), "for"), "from"), new bz1(15)), new bz1(16)));
                i2 = 10;
            }
            ArrayList arrayList3 = new ArrayList();
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj4 = arrayList2.get(i4);
                i4++;
                if (!qs6.v0((String) obj4)) {
                    arrayList3.add(obj4);
                }
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() == 1) {
                    str = (String) gt0.H0(arrayList3);
                } else {
                    if (!arrayList3.isEmpty()) {
                        int size3 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj5 = arrayList3.get(i5);
                            i5++;
                            String str6 = (String) obj5;
                            if (str6.length() >= 25 || qs6.m0(str6, '.') || qs6.m0(str6, '!') || qs6.m0(str6, '?')) {
                                StringBuilder sb = new StringBuilder();
                                int size4 = arrayList3.size();
                                for (int i6 = 0; i6 < size4; i6++) {
                                    String str7 = (String) arrayList3.get(i6);
                                    if (sb.length() == 0) {
                                        sb.append(str7);
                                    } else {
                                        String sb2 = sb.toString();
                                        if (qs6.m0(sb2, '-')) {
                                            sb.setLength(sb.length() - 1);
                                            sb.append(str7);
                                        } else if (!qs6.m0(sb2, '.') && !qs6.m0(sb2, '!') && !qs6.m0(sb2, '?') && !qs6.m0(sb2, ':')) {
                                            sb.append(" ");
                                            sb.append(str7);
                                        } else {
                                            sb.append(" ");
                                            sb.append(str7);
                                        }
                                    }
                                }
                                str = qs6.T0(sb.toString()).toString();
                            }
                            while (i5 < size3) {
                            }
                        }
                    }
                    str = gt0.P0(arrayList3, "\n", null, null, null, 62);
                }
            }
            String str8 = str;
            String str9 = str8 + "|" + ((String) this.e0) + "|" + ((String) this.f0);
            String str10 = (String) hq2Var.u.get(str9);
            if (str10 != null) {
                ta7Var.b = str10;
                return jg7.a;
            }
            try {
                l5 l5Var = new l5((f13) this.h0, str8, (String) this.e0, (String) this.f0, null, 15);
                this.d0 = str9;
                this.Y = 1;
                N = xk2.N(5000L, l5Var, this);
                if (N == x61Var) {
                    return x61Var;
                }
                str2 = str9;
            } catch (Exception e3) {
                e = e3;
                str2 = str9;
                Log.w("GameTranslatorManager", "Translation error for block '" + ta7Var.a + "': " + e.getMessage(), e);
                str3 = ta7Var.a;
                hq2Var.u.put(str2, str3);
                ta7Var.getClass();
                str3.getClass();
                ta7Var.b = str3;
                return jg7.a;
            }
        }
        str3 = (String) N;
        if (str3 == null) {
            str3 = ta7Var.a;
        }
        hq2Var.u.put(str2, str3);
        ta7Var.getClass();
        str3.getClass();
        ta7Var.b = str3;
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Type inference failed for: r7v0, types: [zg5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object z(Object obj) {
        li7 li7Var;
        uq6 uq6Var;
        wq6 wq6Var;
        zg5 zg5Var;
        fb4 fb4Var;
        uq6 uq6Var2;
        zg5 zg5Var2;
        wq6 wq6Var2 = (wq6) this.g0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    fb4Var = (fb4) this.Z;
                    oi2.Y(obj);
                    uq6Var2 = (uq6) this.e0;
                    wq6Var2 = (wq6) this.d0;
                    try {
                        wq6Var2.e.add(uq6Var2);
                        fb4Var.h(null);
                        if (kj2.F("CXCP")) {
                            Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + ((Object) null) + ", will be retried with a future UseCaseCamera");
                        }
                        return jg7.a;
                    } catch (Throwable th) {
                        fb4Var.h(null);
                        throw th;
                    }
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wq6Var = (wq6) this.f0;
            li7Var = (li7) this.e0;
            uq6Var = (uq6) this.d0;
            oi2.Y(obj);
            zg5Var2 = (zg5) this.Z;
        } else {
            oi2.Y(obj);
            ?? obj2 = new Object();
            obj2.A = true;
            li7 li7Var2 = wq6Var2.d;
            zg5Var = obj2;
            if (li7Var2 != null) {
                zg5Var = obj2;
                if (!nb3.k((li7) this.h0, li7Var2)) {
                    this.Z = obj2;
                    this.d0 = null;
                    this.e0 = li7Var2;
                    this.f0 = wq6Var2;
                    this.Y = 1;
                    Object a = wq6.a(wq6Var2, null, li7Var2, this);
                    if (a != x61Var) {
                        li7Var = li7Var2;
                        obj = a;
                        uq6Var = null;
                        wq6Var = wq6Var2;
                        zg5Var2 = obj2;
                    }
                    return x61Var;
                }
            }
            if (zg5Var.A) {
                hb4 hb4Var = wq6Var2.c;
                this.Z = hb4Var;
                this.d0 = wq6Var2;
                this.e0 = null;
                this.f0 = null;
                this.Y = 2;
                if (hb4Var.e(this) != x61Var) {
                    fb4Var = hb4Var;
                    uq6Var2 = null;
                    wq6Var2.e.add(uq6Var2);
                    fb4Var.h(null);
                    if (kj2.F("CXCP")) {
                    }
                }
                return x61Var;
            }
            return jg7.a;
        }
        jg1 jg1Var = (jg1) obj;
        wq6Var.getClass();
        ((ed3) jg1Var).a0(new t00(wq6Var, jg1Var, uq6Var, li7Var));
        zg5Var2.A = false;
        zg5Var = zg5Var2;
        if (zg5Var.A) {
        }
        return jg7.a;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 4:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 5:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 6:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 7:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 8:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 9:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 10:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            case 11:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((hn) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.h0;
        switch (i) {
            case 0:
                hn hnVar = new hn((ul0) this.e0, (gn) this.f0, (qa4) this.g0, (qa4) obj2, r41Var, 0);
                hnVar.Z = obj;
                return hnVar;
            case 1:
                hn hnVar2 = new hn((Context) this.e0, (Uri) this.f0, (m20) this.g0, (zn3) obj2, r41Var, 1);
                hnVar2.Z = obj;
                return hnVar2;
            case 2:
                return new hn((pq5) this.g0, (e70) obj2, r41Var, 2);
            case 3:
                hn hnVar3 = new hn((nx3) this.f0, (ww2) this.g0, (yw7) obj2, r41Var);
                hnVar3.Z = obj;
                return hnVar3;
            case 4:
                return new hn((dh5) this.d0, (String) this.Z, (String) this.e0, (String) this.f0, (String) this.g0, (String) obj2, r41Var);
            case 5:
                return new hn((sz1) this.g0, (mc5) obj2, r41Var, 5);
            case 6:
                return new hn((ta7) this.Z, (String) this.e0, (String) this.f0, (hq2) this.g0, (f13) obj2, r41Var);
            case 7:
                hn hnVar4 = new hn((dh5) this.d0, (String) this.e0, (String) this.f0, (hq2) this.g0, (f13) obj2, r41Var, 7);
                hnVar4.Z = obj;
                return hnVar4;
            case 8:
                return new hn((ut3) this.e0, (tt3) this.f0, (w61) this.g0, (eo2) obj2, r41Var, 8);
            case 9:
                return new hn((wq6) this.g0, (li7) obj2, (uq6) null, r41Var);
            case 10:
                return new hn((wq6) obj2, r41Var);
            case 11:
                hn hnVar5 = new hn((zy4) this.d0, (qn2) this.e0, (qn2) this.f0, (fo2) this.g0, (qn2) obj2, r41Var, 11);
                hnVar5.Z = obj;
                return hnVar5;
            default:
                hn hnVar6 = new hn((tc6) this.d0, (jj7) this.e0, (List) this.f0, (Map) this.g0, (sf0) obj2, r41Var, 12);
                hnVar6.Z = obj;
                return hnVar6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x06db, code lost:
        if (r10.equals("-") != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x088b, code lost:
        if (defpackage.hv.d0(r0, r2, r31) == r14) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x08a4, code lost:
        if (r0 != r14) goto L331;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0656 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x091d  */
    /* JADX WARN: Type inference failed for: r10v35, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [dh5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:341:0x08e7 -> B:343:0x08eb). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        w61 w61Var;
        n80 it;
        Object b;
        Object obj2;
        Object d0;
        fk3 a;
        Object d02;
        String str;
        String str2;
        hb4 hb4Var;
        String str3;
        AtomicInteger atomicInteger;
        ap6 L;
        AtomicInteger atomicInteger2;
        gx3 gx3Var;
        Object m;
        String A;
        dh5 dh5Var;
        dh5 dh5Var2;
        rc3 rc3Var;
        fu3 fu3Var;
        Object a2;
        w61 w61Var2;
        int i = 0;
        switch (this.X) {
            case 0:
                ul0 ul0Var = (ul0) this.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        it = (n80) this.d0;
                        w61Var = (w61) this.Z;
                        oi2.Y(obj);
                        b = obj;
                        if (((Boolean) b).booleanValue()) {
                            Object c = it.c();
                            Object a3 = gm0.a(ul0Var.m());
                            if (a3 == null) {
                                obj2 = c;
                            } else {
                                obj2 = a3;
                            }
                            hv.L(w61Var, null, null, new l5(obj2, (gn) this.f0, (qa4) this.g0, (qa4) this.h0, (r41) null), 3);
                            this.Z = w61Var;
                            this.d0 = it;
                            this.Y = 1;
                            b = it.b(this);
                            if (b == x61Var) {
                                return x61Var;
                            }
                            if (((Boolean) b).booleanValue()) {
                                return jg7.a;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w61Var = (w61) this.Z;
                    it = ul0Var.iterator();
                    this.Z = w61Var;
                    this.d0 = it;
                    this.Y = 1;
                    b = it.b(this);
                    if (b == x61Var) {
                    }
                    if (((Boolean) b).booleanValue()) {
                    }
                }
            case 1:
                jg7 jg7Var = jg7.a;
                m20 m20Var = (m20) this.g0;
                zn3 zn3Var = (zn3) this.h0;
                w61 w61Var3 = (w61) this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                    xe1 xe1Var = xk1.a;
                    jv2 jv2Var = e04.a;
                    l20 l20Var = new l20(zn3Var, null, 0);
                    this.Z = null;
                    this.d0 = null;
                    this.Y = 4;
                    d0 = hv.d0(jv2Var, l20Var, this);
                    break;
                }
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    oi2.Y(obj);
                                    d0 = obj;
                                    jg7 jg7Var2 = (jg7) d0;
                                    return jg7Var;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oi2.Y(obj);
                            d02 = obj;
                        } else {
                            a = (fk3) this.d0;
                            oi2.Y(obj);
                            fk3 fk3Var = a;
                            xe1 xe1Var2 = xk1.a;
                            jv2 jv2Var2 = e04.a;
                            ag agVar = new ag(m20Var, fk3Var, zn3Var, null, 3);
                            this.Z = null;
                            this.d0 = null;
                            this.Y = 3;
                            d02 = hv.d0(jv2Var2, agVar, this);
                            if (d02 == x61Var2) {
                                return x61Var2;
                            }
                        }
                    } else {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                } else {
                    oi2.Y(obj);
                    InputStream openInputStream = ((Context) this.e0).getContentResolver().openInputStream((Uri) this.f0);
                    if (openInputStream != null) {
                        String E = yh2.E(new BufferedReader(new InputStreamReader(openInputStream, qm0.a), 8192));
                        openInputStream.close();
                        fk3 a4 = ((gk3) new su2().c(new StringReader(E), new ie7(gk3.class))).a();
                        UUID randomUUID = UUID.randomUUID();
                        String str4 = a4.b;
                        if (str4 != null) {
                            if (!xs6.Y(str4, ")", false)) {
                                str4 = str4.concat(" (Imported)");
                            }
                        } else {
                            str4 = "Imported Layout";
                        }
                        a = fk3.a(a4, randomUUID, str4, dk3.CUSTOM, null, false, 0, null, 120);
                        wa3 wa3Var = m20Var.b;
                        this.Z = null;
                        this.d0 = a;
                        this.Y = 2;
                        if (wa3Var.f(a, this) == x61Var2) {
                        }
                        fk3 fk3Var2 = a;
                        xe1 xe1Var22 = xk1.a;
                        jv2 jv2Var22 = e04.a;
                        ag agVar2 = new ag(m20Var, fk3Var2, zn3Var, null, 3);
                        this.Z = null;
                        this.d0 = null;
                        this.Y = 3;
                        d02 = hv.d0(jv2Var22, agVar2, this);
                        if (d02 == x61Var2) {
                        }
                    } else {
                        xe1 xe1Var3 = xk1.a;
                        jv2 jv2Var3 = e04.a;
                        l20 l20Var2 = new l20(zn3Var, null, 1);
                        this.Z = null;
                        this.Y = 1;
                        break;
                    }
                    return x61Var2;
                }
                jg7 jg7Var3 = (jg7) d02;
                return jg7Var;
            case 2:
                e70 e70Var = (e70) this.h0;
                pq5 pq5Var = (pq5) this.g0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            pq5Var = (pq5) this.f0;
                            e70Var = (e70) this.e0;
                            hb4Var = (hb4) this.Z;
                            str2 = (String) this.d0;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        String uri = pq5Var.d.toString();
                        uri.getClass();
                        str = (String) e70Var.e.get(uri);
                        if (str != null) {
                            if (str.equals("-")) {
                                return null;
                            }
                            return str;
                        }
                        hb4 hb4Var2 = e70Var.d;
                        this.d0 = uri;
                        this.Z = hb4Var2;
                        this.e0 = e70Var;
                        this.f0 = pq5Var;
                        this.Y = 1;
                        if (hb4Var2.e(this) == x61Var3) {
                            return x61Var3;
                        }
                        str2 = uri;
                        hb4Var = hb4Var2;
                    }
                    ConcurrentHashMap concurrentHashMap = e70Var.e;
                    str = (String) concurrentHashMap.get(str2);
                    if (str != null) {
                        break;
                    } else {
                        if (!e70Var.g) {
                            e70.c(e70Var);
                        }
                        str = (String) concurrentHashMap.get(str2);
                        if (str != null) {
                            if (str.equals("-")) {
                                str = null;
                            }
                        } else {
                            List b2 = e70.b(e70Var);
                            if (b2 == null) {
                                return null;
                            }
                            kw3 I = hf.I();
                            String str5 = pq5Var.a;
                            if (!qs6.v0(str5)) {
                                I.add(str5);
                            }
                            String str6 = pq5Var.c;
                            String R0 = qs6.R0('.', str6, str6);
                            if (!qs6.v0(R0) && !R0.equals(str5)) {
                                I.add(R0);
                            }
                            String str7 = pq5Var.f.e;
                            if (str7 != null && !qs6.v0(str7)) {
                                I.add(str7);
                            }
                            kw3 A2 = hf.A(I);
                            ArrayList arrayList = new ArrayList();
                            ListIterator listIterator = A2.listIterator(0);
                            while (true) {
                                xx2 xx2Var = (xx2) listIterator;
                                if (xx2Var.hasNext()) {
                                    Object next = xx2Var.next();
                                    if (!qs6.v0((String) next)) {
                                        arrayList.add(next);
                                    }
                                } else {
                                    d70 a5 = e70.a(e70Var, arrayList, b2);
                                    if (a5 == null) {
                                        str3 = "-";
                                    } else {
                                        str3 = a5.a;
                                    }
                                    concurrentHashMap.put(str2, str3);
                                    e70Var.h = true;
                                    hv.L(e70Var.a, null, null, new m5(e70Var, null, 5), 3);
                                    if (str3.equals("-")) {
                                        str3 = null;
                                    }
                                    hb4Var.h(null);
                                    return str3;
                                }
                            }
                        }
                    }
                    return str;
                } finally {
                    hb4Var.h(null);
                }
            case 3:
                nx3 nx3Var = (nx3) this.f0;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                try {
                    if (i5 != 0) {
                        if (i5 == 1) {
                            L = (ap6) this.e0;
                            gx3Var = (gx3) this.d0;
                            atomicInteger2 = (AtomicInteger) this.Z;
                            try {
                                oi2.Y(obj);
                                atomicInteger = atomicInteger2;
                                m = obj;
                            } catch (CancellationException e2) {
                                e = e2;
                                String str8 = i21.a;
                                ga0.f().c(str8, "Delegated worker " + nx3Var.getClass() + " was cancelled", e);
                                if (atomicInteger2.get() != -256) {
                                    i = 1;
                                }
                                if (!gx3Var.isCancelled() && i != 0) {
                                    throw new c21(atomicInteger2.get());
                                }
                                throw e;
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        atomicInteger = new AtomicInteger(-256);
                        tb0 d = nx3Var.d();
                        L = hv.L((w61) this.Z, null, null, new l5((ww2) this.g0, (yw7) this.h0, atomicInteger, d, null, 6), 3);
                        try {
                            this.Z = atomicInteger;
                            this.d0 = d;
                            this.e0 = L;
                            this.Y = 1;
                            m = gi2.m(d, this);
                            if (m == x61Var4) {
                                return x61Var4;
                            }
                            gx3Var = d;
                        } catch (CancellationException e3) {
                            e = e3;
                            atomicInteger2 = atomicInteger;
                            gx3Var = d;
                            String str82 = i21.a;
                            ga0.f().c(str82, "Delegated worker " + nx3Var.getClass() + " was cancelled", e);
                            if (atomicInteger2.get() != -256) {
                            }
                            if (!gx3Var.isCancelled()) {
                            }
                            throw e;
                        }
                    }
                    try {
                        mx3 mx3Var = (mx3) m;
                        L.h(null);
                        return mx3Var;
                    } catch (CancellationException e4) {
                        e = e4;
                        atomicInteger2 = atomicInteger;
                        String str822 = i21.a;
                        ga0.f().c(str822, "Delegated worker " + nx3Var.getClass() + " was cancelled", e);
                        if (atomicInteger2.get() != -256) {
                        }
                        if (!gx3Var.isCancelled()) {
                        }
                        throw e;
                    }
                }
            case 4:
                String str9 = "";
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                tu0 tu0Var = new tu0();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                String e0 = xs6.e0(uuid, "-", "");
                String uuid2 = UUID.randomUUID().toString();
                uuid2.getClass();
                String e02 = xs6.e0(uuid2, "-", "");
                qr1 qr1Var = qr1.a;
                try {
                    long currentTimeMillis = (System.currentTimeMillis() / 1000) + 11644473600L;
                    String str10 = ((currentTimeMillis - (currentTimeMillis % 300)) * 10000000) + "6A5AA1D4EAFF4E9FB37E23D68491D6F4";
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] bytes = str10.getBytes(qm0.d);
                    bytes.getClass();
                    byte[] digest = messageDigest.digest(bytes);
                    digest.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "");
                    int length = digest.length;
                    int i7 = 0;
                    while (i < length) {
                        byte b3 = digest[i];
                        i7++;
                        if (i7 > 1) {
                            sb.append((CharSequence) "");
                        }
                        sb.append((CharSequence) String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b3)}, 1)));
                        i++;
                    }
                    sb.append((CharSequence) "");
                    str9 = sb.toString();
                } catch (Throwable unused) {
                }
                if (str9.length() > 0) {
                    A = lb1.n("wss://speech.platform.bing.com/consumer/speech/synthesize/readaloud/edge/v1?TrustedClientToken=6A5AA1D4EAFF4E9FB37E23D68491D6F4&ConnectionId=", e0, "&Sec-MS-GEC=", str9, "&Sec-MS-GEC-Version=1-130.0.2849.68");
                } else {
                    A = lb1.A("wss://speech.platform.bing.com/consumer/speech/synthesize/readaloud/edge/v1?TrustedClientToken=6A5AA1D4EAFF4E9FB37E23D68491D6F4&ConnectionId=", e0, "&Sec-MS-GEC-Version=1-130.0.2849.68");
                }
                s9 s9Var = new s9(13);
                s9Var.I(A);
                s9Var.B("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36 Edg/130.0.0.0");
                s9Var.B("Origin", "chrome-extension://jdiccldimpdaibmpdkjnbmckianbfold");
                s9Var.B("Accept-Encoding", "gzip, deflate, br");
                s9Var.B("Accept-Language", "en-US,en;q=0.9,ru;q=0.8");
                pa paVar = new pa(s9Var);
                zp3 zp3Var = new zp3((dh5) this.d0, (String) this.Z, (String) this.e0, e02, (String) this.f0, (String) this.g0, (String) this.h0, byteArrayOutputStream, tu0Var);
                xk4 xk4Var = qr1.c;
                xk4Var.getClass();
                qz6 qz6Var = xk4Var.C;
                Random random = new Random();
                long j = xk4Var.A;
                int i8 = xk4Var.z;
                af5 af5Var = new af5(qz6Var, paVar, zp3Var, random, 0L, j, i8);
                if (((yw2) paVar.R).a("Sec-WebSocket-Extensions") != null) {
                    af5.c(af5Var, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), 6);
                } else {
                    wk4 wk4Var = new wk4();
                    wk4Var.a = xk4Var.a;
                    wk4Var.b = xk4Var.D;
                    gt0.A0(wk4Var.c, xk4Var.b);
                    gt0.A0(wk4Var.d, xk4Var.c);
                    wk4Var.e = xk4Var.d;
                    wk4Var.f = xk4Var.e;
                    wk4Var.g = xk4Var.f;
                    wk4Var.h = xk4Var.g;
                    wk4Var.i = xk4Var.h;
                    wk4Var.j = xk4Var.i;
                    wk4Var.k = xk4Var.j;
                    wk4Var.l = xk4Var.k;
                    wk4Var.m = xk4Var.l;
                    wk4Var.n = xk4Var.m;
                    wk4Var.o = xk4Var.n;
                    wk4Var.p = xk4Var.o;
                    wk4Var.q = xk4Var.p;
                    wk4Var.r = xk4Var.q;
                    wk4Var.s = xk4Var.r;
                    wk4Var.t = xk4Var.s;
                    wk4Var.u = xk4Var.t;
                    wk4Var.v = xk4Var.u;
                    wk4Var.w = xk4Var.v;
                    wk4Var.x = xk4Var.w;
                    wk4Var.y = xk4Var.x;
                    wk4Var.z = xk4Var.y;
                    wk4Var.A = i8;
                    wk4Var.B = xk4Var.A;
                    wk4Var.C = xk4Var.B;
                    wk4Var.D = xk4Var.C;
                    TimeZone timeZone = az7.a;
                    wk4Var.e = new fa6(23);
                    List list = af5.x;
                    list.getClass();
                    ArrayList arrayList2 = new ArrayList(list);
                    k55 k55Var = k55.H2_PRIOR_KNOWLEDGE;
                    if (!arrayList2.contains(k55Var) && !arrayList2.contains(k55.HTTP_1_1)) {
                        u34.w(arrayList2, "protocols must contain h2_prior_knowledge or http/1.1: ");
                        return null;
                    } else if (arrayList2.contains(k55Var) && arrayList2.size() > 1) {
                        u34.w(arrayList2, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                        return null;
                    } else if (!arrayList2.contains(k55.HTTP_1_0)) {
                        if (!arrayList2.contains(null)) {
                            arrayList2.remove(k55.SPDY_3);
                            if (!arrayList2.equals(wk4Var.t)) {
                                wk4Var.C = null;
                            }
                            List unmodifiableList = Collections.unmodifiableList(arrayList2);
                            unmodifiableList.getClass();
                            wk4Var.t = unmodifiableList;
                            xk4 xk4Var2 = new xk4(wk4Var);
                            s9 o = paVar.o();
                            o.B("Upgrade", "websocket");
                            o.B("Connection", "Upgrade");
                            o.B("Sec-WebSocket-Key", af5Var.g);
                            o.B("Sec-WebSocket-Version", "13");
                            o.B("Sec-WebSocket-Extensions", "permessage-deflate");
                            pa paVar2 = new pa(o);
                            je5 je5Var = new je5(xk4Var2, paVar2, true);
                            af5Var.h = je5Var;
                            je5Var.d(new ap3(21, af5Var, paVar2));
                        } else {
                            i.h("protocols must not contain null");
                            return null;
                        }
                    } else {
                        u34.w(arrayList2, "protocols must not contain http/1.0: ");
                        return null;
                    }
                }
                this.Y = 1;
                Object q = tu0Var.q(this);
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                if (q == x61Var5) {
                    return x61Var5;
                }
                return q;
            case 5:
                return v(obj);
            case 6:
                return x(obj);
            case 7:
                w61 w61Var4 = (w61) this.Z;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                Iterable<ta7> iterable = (Iterable) ((dh5) this.d0).A;
                String str11 = (String) this.e0;
                String str12 = (String) this.f0;
                hq2 hq2Var = (hq2) this.g0;
                f13 f13Var = (f13) this.h0;
                ArrayList arrayList3 = new ArrayList(ht0.v0(iterable, 10));
                for (ta7 ta7Var : iterable) {
                    xe1 xe1Var4 = xk1.a;
                    arrayList3.add(hv.i(w61Var4, de1.L, null, new hn(ta7Var, str11, str12, hq2Var, f13Var, (r41) null), 2));
                }
                this.Z = null;
                this.Y = 1;
                Object m2 = n16.m(arrayList3, this);
                if (m2 == x61Var7) {
                    return x61Var7;
                }
                return m2;
            case 8:
                jg7 jg7Var4 = jg7.a;
                ut3 ut3Var = (ut3) this.e0;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dh5Var = (dh5) this.Z;
                        dh5Var2 = (dh5) this.d0;
                        try {
                            oi2.Y(obj);
                        } catch (Throwable th) {
                            th = th;
                            rc3Var = (rc3) dh5Var2.A;
                            if (rc3Var != null) {
                            }
                            fu3Var = (fu3) dh5Var.A;
                            if (fu3Var != null) {
                            }
                            throw th;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (ut3Var.b() != tt3.DESTROYED) {
                        ?? obj3 = new Object();
                        ?? obj4 = new Object();
                        try {
                            tt3 tt3Var = (tt3) this.f0;
                            this.d0 = obj3;
                            this.Z = obj4;
                            this.Y = 1;
                            rj0 rj0Var = new rj0(1, np2.V(this));
                            rj0Var.v();
                            st3.Companion.getClass();
                            dk5 dk5Var = new dk5(qt3.c(tt3Var), obj3, (w61) this.g0, qt3.a(tt3Var), rj0Var, new hb4(), (eo2) this.h0);
                            obj4.A = dk5Var;
                            ut3Var.a(dk5Var);
                            if (rj0Var.s() == x61Var8) {
                                return x61Var8;
                            }
                            dh5Var = obj4;
                            dh5Var2 = obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            dh5Var = obj4;
                            dh5Var2 = obj3;
                            rc3Var = (rc3) dh5Var2.A;
                            if (rc3Var != null) {
                                rc3Var.h(null);
                            }
                            fu3Var = (fu3) dh5Var.A;
                            if (fu3Var != null) {
                                ut3Var.c(fu3Var);
                            }
                            throw th;
                        }
                    }
                    return jg7Var4;
                }
                rc3 rc3Var2 = (rc3) dh5Var2.A;
                if (rc3Var2 != null) {
                    rc3Var2.h(null);
                }
                fu3 fu3Var2 = (fu3) dh5Var.A;
                if (fu3Var2 != null) {
                    ut3Var.c(fu3Var2);
                }
                return jg7Var4;
            case 9:
                return z(obj);
            case 10:
                return A(obj);
            case 11:
                return B(obj);
            default:
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            w61Var2 = (w61) this.Z;
                            oi2.Y(obj);
                            a2 = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        w61 w61Var5 = (w61) this.Z;
                        if (((pc6) ((tc6) this.d0).e.getValue()).c()) {
                            this.Z = w61Var5;
                            this.Y = 1;
                            a2 = jj7.a((jj7) this.e0, (List) this.f0, 5000L, this);
                            if (a2 == x61Var9) {
                                return x61Var9;
                            }
                            w61Var2 = w61Var5;
                        } else {
                            i.m("Check failed.");
                            return null;
                        }
                    }
                    List list2 = (List) a2;
                    if (g04.H(w61Var2) && !list2.isEmpty()) {
                        if (!list2.isEmpty() && !list2.contains(null)) {
                            jj7 jj7Var = (jj7) this.e0;
                            Object obj5 = jj7Var.e;
                            List list3 = (List) this.f0;
                            synchronized (obj5) {
                                try {
                                    int k0 = c14.k0(ht0.v0(list3, 10));
                                    if (k0 < 16) {
                                        k0 = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                                    for (Object obj6 : list3) {
                                        Object obj7 = list2.get(list3.indexOf((ig1) obj6));
                                        if (obj7 != null) {
                                            linkedHashMap.put((Surface) obj7, obj6);
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                    jj7Var.h = linkedHashMap;
                                    jj7.b(jj7Var);
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            List list4 = (List) this.f0;
                            sf0 sf0Var = (sf0) this.h0;
                            jj7 jj7Var2 = (jj7) this.e0;
                            for (Map.Entry entry : ((Map) this.g0).entrySet()) {
                                int i12 = ((kr6) entry.getValue()).a;
                                Surface surface = (Surface) list2.get(list4.indexOf(entry.getKey()));
                                if (kj2.F("CXCP")) {
                                    Log.d("CXCP", "Configured " + surface + " for " + ((Object) kr6.a(i12)));
                                }
                                sf0Var.k(i12, surface);
                                jj7Var2.c.g(i12, (ig1) entry.getKey(), sf0Var);
                            }
                            if (kj2.H()) {
                                Log.i("CXCP", "Surface setup complete");
                            }
                            return Boolean.TRUE;
                        }
                        if (kj2.L()) {
                            Log.w("CXCP", "Surface setup failed: Some Surfaces are invalid");
                        }
                        ((tc6) this.d0).a((ig1) ((List) this.f0).get(list2.indexOf(null)));
                        return Boolean.FALSE;
                    }
                    if (kj2.H()) {
                        Log.i("CXCP", "Failed to get Surfaces: isActive=" + g04.H(w61Var2) + ", surfaces=" + list2);
                    }
                    return Boolean.FALSE;
                } catch (c67 unused2) {
                    if (kj2.L()) {
                        Log.w("CXCP", "Failed to get Surfaces within 5000 ms");
                    }
                    return Boolean.FALSE;
                } catch (hg1 e5) {
                    if (kj2.L()) {
                        Log.w("CXCP", "Failed to get Surfaces: Surfaces closed", e5);
                    }
                    ig1 ig1Var = e5.A;
                    ig1Var.getClass();
                    ((tc6) this.d0).a(ig1Var);
                    return Boolean.FALSE;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(nx3 nx3Var, ww2 ww2Var, yw7 yw7Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 3;
        this.f0 = nx3Var;
        this.g0 = ww2Var;
        this.h0 = yw7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(wq6 wq6Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 10;
        this.h0 = wq6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(wq6 wq6Var, li7 li7Var, uq6 uq6Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 9;
        this.g0 = wq6Var;
        this.h0 = li7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(ta7 ta7Var, String str, String str2, hq2 hq2Var, f13 f13Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 6;
        this.Z = ta7Var;
        this.e0 = str;
        this.f0 = str2;
        this.g0 = hq2Var;
        this.h0 = f13Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.g0 = obj;
        this.h0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn(Object obj, Object obj2, Object obj3, Object obj4, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = obj;
        this.f0 = obj2;
        this.g0 = obj3;
        this.h0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
        this.h0 = obj5;
    }
}
