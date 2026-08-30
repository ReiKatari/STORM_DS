package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uj7  reason: default package */
/* loaded from: classes.dex */
public abstract class uj7 {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = jk4.B;
        jk4 o = hm1.o("/");
        LinkedHashMap m0 = zt3.m0(new ti4(o, new qj7(o, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (qj7 qj7Var : tq0.g1(arrayList, new so5(12))) {
            if (((qj7) m0.put(qj7Var.a, qj7Var)) == null) {
                while (true) {
                    jk4 jk4Var = qj7Var.a;
                    jk4 b = jk4Var.b();
                    if (b != null) {
                        qj7 qj7Var2 = (qj7) m0.get(b);
                        if (qj7Var2 != null) {
                            qj7Var2.q.add(jk4Var);
                            break;
                        }
                        qj7 qj7Var3 = new qj7(b, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        m0.put(b, qj7Var3);
                        qj7Var3.q.add(jk4Var);
                        qj7Var = qj7Var3;
                    }
                }
            }
        }
        return m0;
    }

    public static final String b(int i) {
        iq2.g(16);
        String num = Integer.toString(i, 16);
        num.getClass();
        return "0x".concat(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.de2 c(android.content.res.XmlResourceParser r26, android.content.res.Resources r27) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj7.c(android.content.res.XmlResourceParser, android.content.res.Resources):de2");
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r1v5, types: [j75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, n75] */
    public static final qj7 d(final s45 s45Var) {
        long j;
        int w = s45Var.w();
        if (w == 33639248) {
            s45Var.skip(4L);
            short B = s45Var.B();
            int i = B & 65535;
            if ((B & 1) == 0) {
                int B2 = s45Var.B() & 65535;
                int B3 = s45Var.B() & 65535;
                int B4 = s45Var.B() & 65535;
                long w2 = s45Var.w() & 4294967295L;
                final ?? obj = new Object();
                obj.A = s45Var.w() & 4294967295L;
                final ?? obj2 = new Object();
                obj2.A = s45Var.w() & 4294967295L;
                int B5 = s45Var.B() & 65535;
                int B6 = s45Var.B() & 65535;
                s45Var.skip(8L);
                final ?? obj3 = new Object();
                obj3.A = s45Var.w() & 4294967295L;
                String C = s45Var.C(s45Var.B() & 65535);
                if (!zg6.r0(C, (char) 0)) {
                    if (obj2.A == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (obj.A == 4294967295L) {
                        j += 8;
                    }
                    if (obj3.A == 4294967295L) {
                        j += 8;
                    }
                    final long j2 = j;
                    final ?? obj4 = new Object();
                    final ?? obj5 = new Object();
                    final ?? obj6 = new Object();
                    final ?? obj7 = new Object();
                    f(s45Var, B5, new aj2() { // from class: tj7
                        @Override // defpackage.aj2
                        public final Object j(Object obj8, Object obj9) {
                            long j3;
                            int intValue = ((Integer) obj8).intValue();
                            long longValue = ((Long) obj9).longValue();
                            s45 s45Var2 = s45Var;
                            if (intValue != 1) {
                                if (intValue == 10) {
                                    if (longValue >= 4) {
                                        s45Var2.skip(4L);
                                        uj7.f(s45Var2, (int) (longValue - 4), new sj7(obj4, s45Var2, obj5, obj6));
                                    } else {
                                        f81.j("bad zip: NTFS extra too short");
                                        return null;
                                    }
                                }
                            } else {
                                j75 j75Var = j75.this;
                                if (!j75Var.A) {
                                    j75Var.A = true;
                                    if (longValue >= j2) {
                                        m75 m75Var = obj2;
                                        long j4 = m75Var.A;
                                        if (j4 == 4294967295L) {
                                            j4 = s45Var2.x();
                                        }
                                        m75Var.A = j4;
                                        m75 m75Var2 = obj;
                                        long j5 = 0;
                                        if (m75Var2.A == 4294967295L) {
                                            j3 = s45Var2.x();
                                        } else {
                                            j3 = 0;
                                        }
                                        m75Var2.A = j3;
                                        m75 m75Var3 = obj3;
                                        if (m75Var3.A == 4294967295L) {
                                            j5 = s45Var2.x();
                                        }
                                        m75Var3.A = j5;
                                    } else {
                                        f81.j("bad zip: zip64 extra too short");
                                        return null;
                                    }
                                } else {
                                    f81.j("bad zip: zip64 extra repeated");
                                    return null;
                                }
                            }
                            return o27.a;
                        }
                    });
                    if (j2 > 0 && !obj7.A) {
                        f81.j("bad zip: zip64 extra required but absent");
                        return null;
                    }
                    String C2 = s45Var.C(B6);
                    String str = jk4.B;
                    return new qj7(hm1.o("/").d(C), gh6.f0(C, "/", false), C2, w2, obj.A, obj2.A, B2, obj3.A, B4, B3, (Long) obj4.A, (Long) obj5.A, (Long) obj6.A, 57344);
                }
                f81.j("bad zip: filename contains 0x00");
                return null;
            }
            f81.j("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        vd6.j("bad zip: expected ", b(33639248), " but was ", b(w));
        return null;
    }

    public static List e(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final void f(s45 s45Var, int i, aj2 aj2Var) {
        f60 f60Var = s45Var.B;
        long j = i;
        while (j != 0) {
            if (j >= 4) {
                int B = s45Var.B() & 65535;
                long B2 = s45Var.B() & 65535;
                long j2 = j - 4;
                if (j2 >= B2) {
                    s45Var.b0(B2);
                    long j3 = f60Var.B;
                    aj2Var.j(Integer.valueOf(B), Long.valueOf(B2));
                    long j4 = (f60Var.B + B2) - j3;
                    int i2 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                    if (i2 >= 0) {
                        if (i2 > 0) {
                            f60Var.skip(j4);
                        }
                        j = j2 - B2;
                    } else {
                        f81.j(wh1.g(B, "unsupported zip: too many bytes processed for "));
                        return;
                    }
                } else {
                    f81.j("bad zip: truncated value in extra field");
                    return;
                }
            } else {
                f81.j("bad zip: truncated header in extra field");
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, n75] */
    public static final qj7 g(s45 s45Var, qj7 qj7Var) {
        int w = s45Var.w();
        if (w == 67324752) {
            s45Var.skip(2L);
            short B = s45Var.B();
            int i = B & 65535;
            if ((B & 1) == 0) {
                s45Var.skip(18L);
                int B2 = s45Var.B() & 65535;
                s45Var.skip(s45Var.B() & 65535);
                if (qj7Var == null) {
                    s45Var.skip(B2);
                    return null;
                }
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                f(s45Var, B2, new sj7(s45Var, (n75) obj, (n75) obj2, (n75) obj3));
                return new qj7(qj7Var.a, qj7Var.b, qj7Var.c, qj7Var.d, qj7Var.e, qj7Var.f, qj7Var.g, qj7Var.h, qj7Var.i, qj7Var.j, qj7Var.k, qj7Var.l, qj7Var.m, (Integer) obj.A, (Integer) obj2.A, (Integer) obj3.A);
            }
            f81.j("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        vd6.j("bad zip: expected ", b(67324752), " but was ", b(w));
        return null;
    }

    public static void h(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }
}
