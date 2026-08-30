package p7;

import ah.b0;
import android.content.Context;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import androidx.work.WorkerParameters;
import i3.z;
import j0.a2;
import j0.b2;
import j0.d2;
import j0.f2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import p8.g0;
import p8.u;
import p8.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11423a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11424b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f11425c = 0;

    public static final yb.t A(String str) {
        int i2;
        long j2;
        int i10;
        str.getClass();
        int i11 = 10;
        k.f(10);
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            int i12 = 1;
            if (nc.k.b(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i2 = 1;
                } else {
                    return null;
                }
            } else {
                i2 = 0;
            }
            long j10 = 10;
            long j11 = 0;
            long j12 = 512409557603043100L;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i11);
                if (digit >= 0) {
                    int i13 = length;
                    long j13 = j11 ^ Long.MIN_VALUE;
                    int i14 = i2;
                    if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                        if (j12 == 512409557603043100L) {
                            if (j10 < 0) {
                                if (Long.MAX_VALUE < (j10 ^ Long.MIN_VALUE)) {
                                    j2 = j10;
                                    j12 = 0;
                                } else {
                                    j12 = 1;
                                    j2 = j10;
                                }
                            } else {
                                long j14 = (Long.MAX_VALUE / j10) << i12;
                                if ((((-1) - (j14 * j10)) ^ Long.MIN_VALUE) >= (j10 ^ Long.MIN_VALUE)) {
                                    i10 = i12;
                                } else {
                                    i10 = 0;
                                }
                                j2 = j10;
                                j12 = j14 + i10;
                            }
                            if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    } else {
                        j2 = j10;
                    }
                    long j15 = j11 * j2;
                    long j16 = (digit & 4294967295L) + j15;
                    if (Long.compare(j16 ^ Long.MIN_VALUE, j15 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i2 = i14 + 1;
                    j11 = j16;
                    length = i13;
                    j10 = j2;
                    i11 = 10;
                    i12 = 1;
                } else {
                    return null;
                }
            }
            return new yb.t(j11);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qc.e] */
    public static final qc.e a(long j2) {
        int i2 = (int) j2;
        int i10 = (int) (j2 >> 32);
        int i11 = ~i2;
        ?? obj = new Object();
        obj.B = i2;
        obj.L = i10;
        obj.R = 0;
        obj.X = 0;
        obj.Y = i11;
        obj.Z = (i2 << 10) ^ (i10 >>> 4);
        if ((i10 | i2 | i11) != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                obj.d();
            }
            return obj;
        }
        a0.j.h("Initial state must have at least one non-zero element.");
        return null;
    }

    public static final void b(Logger logger, si.a aVar, si.b bVar, String str) {
        logger.fine(bVar.f12930b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f12925a);
    }

    public static int c(int i2, int i10) {
        return (i2 & 16777215) | (i10 << 24);
    }

    public static final boolean d(h3.c cVar, float f8, float f10) {
        float f11 = cVar.f6052a;
        if (f8 <= cVar.f6054c && f11 <= f8) {
            float f12 = cVar.f6053b;
            if (f10 <= cVar.f6055d && f12 <= f10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList e(b2 b2Var, b2 b2Var2) {
        ArrayList arrayList = new ArrayList();
        d2 d2Var = d2.PRIV;
        arrayList.add(new a2(f2.a(d2Var, b2Var), f2.a(d2.JPEG, b2Var2)));
        arrayList.add(new a2(f2.a(d2Var, b2Var), f2.a(d2.JPEG_R, b2Var2)));
        return arrayList;
    }

    public static final String h(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static pi.t i(String str) {
        String str2;
        str.getClass();
        b9.e a10 = pi.t.f11790d.a(0, str);
        if (a10 != null) {
            if (((vc.e) a10.X) == null) {
                a10.X = new vc.e(a10);
            }
            vc.e eVar = (vc.e) a10.X;
            eVar.getClass();
            Locale locale = Locale.ROOT;
            String lowerCase = ((String) eVar.get(1)).toLowerCase(locale);
            lowerCase.getClass();
            if (((vc.e) a10.X) == null) {
                a10.X = new vc.e(a10);
            }
            vc.e eVar2 = (vc.e) a10.X;
            eVar2.getClass();
            String lowerCase2 = ((String) eVar2.get(2)).toLowerCase(locale);
            lowerCase2.getClass();
            ArrayList arrayList = new ArrayList();
            int i2 = a10.x().B;
            while (true) {
                int i10 = i2 + 1;
                if (i10 < str.length()) {
                    b9.e a11 = pi.t.f11791e.a(i10, str);
                    if (a11 != null) {
                        s2.j jVar = (s2.j) a11.R;
                        vc.d b10 = jVar.b(1);
                        String str3 = null;
                        if (b10 != null) {
                            str2 = b10.f13788a;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            i2 = a11.x().B;
                        } else {
                            vc.d b11 = jVar.b(2);
                            if (b11 != null) {
                                str3 = b11.f13788a;
                            }
                            if (str3 == null) {
                                vc.d b12 = jVar.b(3);
                                b12.getClass();
                                str3 = b12.f13788a;
                            } else if (str3.length() > 0 && k.j(str3.charAt(0), '\'', false) && vc.h.b0(str3, '\'') && str3.length() > 2) {
                                str3 = str3.substring(1, str3.length() - 1);
                            }
                            arrayList.add(str2);
                            arrayList.add(str3);
                            i2 = a11.x().B;
                        }
                    } else {
                        m9.o.k("Parameter is not formatted correctly: \"", str.substring(i10), "\" for: \"", str, 34);
                        return null;
                    }
                } else {
                    return new pi.t(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
            }
        } else {
            a0.j.h(kc.a.c('\"', "No subtype found for: \"", str));
            return null;
        }
    }

    public static final je.a n(oi.b bVar) {
        int i2;
        int i10;
        boolean z10;
        int i11;
        bVar.getClass();
        long j2 = bVar.f11012a;
        long j10 = bVar.f11013b;
        long j11 = bVar.f11014c;
        Integer num = bVar.f11015d;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        Integer num2 = bVar.f11016e;
        if (num2 != null) {
            i10 = num2.intValue();
            z10 = false;
        } else {
            i10 = 0;
            z10 = false;
        }
        String str = bVar.f11017f;
        int i12 = i2;
        int i13 = i10;
        String str2 = bVar.f11018g;
        int i14 = bVar.f11019h;
        int i15 = bVar.f11020i;
        String url = bVar.f11021j.toString();
        url.getClass();
        String url2 = bVar.f11022k.toString();
        url2.getClass();
        String str3 = bVar.f11023l;
        int i16 = uf.a.f13549a[bVar.m.ordinal()];
        if (i16 != 1) {
            if (i16 == 2) {
                i11 = 1;
            } else {
                m9.o.o();
                return null;
            }
        } else {
            i11 = 0;
        }
        return new je.a(j2, j10, j11, i12, i13, str, str2, i14, i15, url, url2, str3, i11);
    }

    public static final oi.b o(je.a aVar) {
        oi.a aVar2;
        aVar.getClass();
        long j2 = aVar.f7818a;
        long j10 = aVar.f7819b;
        long j11 = aVar.f7820c;
        Integer valueOf = Integer.valueOf(aVar.f7821d);
        Integer valueOf2 = Integer.valueOf(aVar.f7822e);
        String str = aVar.f7823f;
        String str2 = aVar.f7824g;
        int i2 = aVar.f7825h;
        int i10 = aVar.f7826i;
        URL url = new URL(aVar.f7827j);
        URL url2 = new URL(aVar.f7828k);
        String str3 = aVar.f7829l;
        int i11 = aVar.m;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar2 = oi.a.UNOFFICIAL;
            } else {
                m9.o.v(w.d.l(i11, "Unknown achievement type: "));
                return null;
            }
        } else {
            aVar2 = oi.a.CORE;
        }
        return new oi.b(j2, j10, j11, valueOf, valueOf2, str, str2, i2, i10, url, url2, str3, aVar2);
    }

    public static final long p(long j2, long j10) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j10 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j10 & 4294967295L))) & 4294967295L);
    }

    public static final void q(Bundle bundle, String str, List list) {
        ArrayList<String> arrayList;
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = new ArrayList<>(list);
        }
        bundle.putStringArrayList(str, arrayList);
    }

    public static final List r(t7.c cVar) {
        int p10 = m.p(cVar, "id");
        int p11 = m.p(cVar, "seq");
        int p12 = m.p(cVar, "from");
        int p13 = m.p(cVar, "to");
        ac.b g10 = t.g();
        while (cVar.N()) {
            g10.add(new i((int) cVar.getLong(p10), (int) cVar.getLong(p11), cVar.n(p12), cVar.n(p13)));
        }
        return zb.l.k0(t.d(g10));
    }

    public static final r s(t7.a aVar, String str, boolean z10) {
        String str2;
        t7.c T = aVar.T("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int p10 = m.p(T, "seqno");
            int p11 = m.p(T, "cid");
            int p12 = m.p(T, "name");
            int p13 = m.p(T, "desc");
            if (p10 != -1 && p11 != -1 && p12 != -1 && p13 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (T.N()) {
                    if (((int) T.getLong(p11)) >= 0) {
                        int i2 = (int) T.getLong(p10);
                        String n10 = T.n(p12);
                        if (T.getLong(p13) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(i2), n10);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List<Map.Entry> l02 = zb.l.l0(linkedHashMap.entrySet(), new b0(11));
                ArrayList arrayList = new ArrayList(zb.m.G(l02, 10));
                for (Map.Entry entry : l02) {
                    arrayList.add((String) entry.getValue());
                }
                List p0 = zb.l.p0(arrayList);
                List<Map.Entry> l03 = zb.l.l0(linkedHashMap2.entrySet(), new b0(12));
                ArrayList arrayList2 = new ArrayList(zb.m.G(l03, 10));
                for (Map.Entry entry2 : l03) {
                    arrayList2.add((String) entry2.getValue());
                }
                r rVar = new r(str, z10, p0, zb.l.p0(arrayList2));
                q8.r.q(T, null);
                return rVar;
            }
            q8.r.q(T, null);
            return null;
        } finally {
        }
    }

    public static final float t(long j2, float f8, x4.c cVar) {
        float c4;
        long b10 = x4.o.b(j2);
        if (x4.p.a(b10, 4294967296L)) {
            if (cVar.j() > 1.05d) {
                c4 = x4.o.c(j2) / x4.o.c(cVar.m0(f8));
            } else {
                return cVar.c0(j2);
            }
        } else if (x4.p.a(b10, 8589934592L)) {
            c4 = x4.o.c(j2);
        } else {
            return Float.NaN;
        }
        return c4 * f8;
    }

    public static final long u(long j2) {
        int round = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (round << 32);
    }

    public static final void v(Spannable spannable, long j2, int i2, int i10) {
        if (j2 != 16) {
            spannable.setSpan(new ForegroundColorSpan(z.y(j2)), i2, i10, 33);
        }
    }

    public static final void w(Spannable spannable, long j2, x4.c cVar, int i2, int i10) {
        long b10 = x4.o.b(j2);
        if (x4.p.a(b10, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(pc.a.M(cVar.c0(j2)), false), i2, i10, 33);
        } else if (x4.p.a(b10, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(x4.o.c(j2)), i2, i10, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    public static final void x(Spannable spannable, s4.b bVar, int i2, int i10) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(zb.m.G(bVar, 10));
            for (s4.a aVar : bVar.A) {
                arrayList.add(aVar.f12832a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i2, i10, 33);
        }
    }

    public static final yb.p y(int i2, String str) {
        yb.r z10 = z(i2, str);
        if (z10 != null) {
            int i10 = z10.A;
            if (Integer.compare(Integer.MIN_VALUE ^ i10, -2147483393) <= 0) {
                return new yb.p((byte) i10);
            }
            return null;
        }
        return null;
    }

    public static final yb.r z(int i2, String str) {
        int i10;
        k.f(i2);
        int length = str.length();
        if (length != 0) {
            int i11 = 0;
            char charAt = str.charAt(0);
            if (nc.k.b(charAt, 48) < 0) {
                i10 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i10 = 0;
            }
            int i12 = 119304647;
            while (i10 < length) {
                int digit = Character.digit((int) str.charAt(i10), i2);
                if (digit >= 0) {
                    int i13 = i11 ^ Integer.MIN_VALUE;
                    if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                        if (i12 == 119304647) {
                            i12 = (int) (((-1) & 4294967295L) / (4294967295L & i2));
                            if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i14 = i11 * i2;
                    int i15 = digit + i14;
                    if (Integer.compare(i15 ^ Integer.MIN_VALUE, i14 ^ Integer.MIN_VALUE) < 0) {
                        return null;
                    }
                    i10++;
                    i11 = i15;
                } else {
                    return null;
                }
            }
            return new yb.r(i11);
        }
        return null;
    }

    public abstract u f(Context context, String str, WorkerParameters workerParameters);

    public u g(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        u f8 = f(context, str, workerParameters);
        if (f8 == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(u.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    f8 = (u) newInstance;
                } catch (Throwable th2) {
                    v.e().d(g0.f11492a, "Could not instantiate ".concat(str), th2);
                    throw th2;
                }
            } catch (Throwable th3) {
                v.e().d(g0.f11492a, "Invalid class: ".concat(str), th3);
                throw th3;
            }
        }
        if (!f8.f11506d) {
            return f8;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }

    public abstract Method j(Class cls, Field field);

    public abstract Constructor k(Class cls);

    public abstract String[] l(Class cls);

    public abstract boolean m(Class cls);
}
