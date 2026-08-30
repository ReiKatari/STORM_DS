package defpackage;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hi2  reason: default package */
/* loaded from: classes.dex */
public abstract class hi2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static ax2 c;

    public static final long A(double d) {
        return L((float) d, 4294967296L);
    }

    public static final long B(int i) {
        return L(i, 4294967296L);
    }

    public static final int C(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static final void D(mf3 mf3Var) {
        l.P(mf3Var).E();
    }

    public static final boolean E(Object obj) {
        if (obj == yv0.a) {
            return true;
        }
        return false;
    }

    public static LinkedHashSet H(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(zt3.j0(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && b53.x(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set I(Set set, Iterable iterable) {
        Collection<?> n1;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            n1 = (Collection) iterable;
        } else {
            n1 = tq0.n1(iterable);
        }
        if (n1.isEmpty()) {
            return tq0.s1(set);
        }
        if (n1 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!((Set) n1).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(n1);
        return linkedHashSet2;
    }

    public static Set J(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(zt3.j0(objArr.length));
        nu.B0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static xq2 K(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 == 0) {
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            int length = strArr3.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (strArr3[i2] != null) {
                    strArr3[i2] = zg6.Z0(strArr2[i2]).toString();
                } else {
                    i.i("Headers cannot be null");
                    return null;
                }
            }
            int E = cg2.E(0, strArr3.length - 1, 2);
            if (E >= 0) {
                while (true) {
                    String str = strArr3[i];
                    String str2 = strArr3[i + 1];
                    ie7.b(str);
                    ie7.c(str2, str);
                    if (i == E) {
                        break;
                    }
                    i += 2;
                }
            }
            return new xq2(strArr3);
        }
        i.i("Expected alternating header names and values");
        return null;
    }

    public static final long L(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        js6[] js6VarArr = is6.b;
        return floatToRawIntBits;
    }

    /* JADX WARN: Type inference failed for: r1v41, types: [o23, java.lang.Object] */
    public static l23 M(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        long j;
        char charAt;
        k91 k91Var;
        char charAt2;
        str.getClass();
        if (str.length() == 0) {
            k91Var = new k91((CharSequence) str, "An empty string is not a valid Instant");
        } else {
            char charAt3 = str.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i = 0;
                charAt3 = ' ';
            } else {
                i = 1;
            }
            int i9 = 0;
            int i10 = i;
            while (i10 < str.length() && '0' <= (charAt2 = str.charAt(i10)) && charAt2 < ':') {
                i9 = (i9 * 10) + (str.charAt(i10) - '0');
                i10++;
            }
            int i11 = i10 - i;
            if (i11 > 10) {
                k91Var = se.M(str, "Expected at most 10 digits for the year number, got " + i11 + " digits");
            } else if (i11 == 10 && b53.E(str.charAt(i), 50) >= 0) {
                k91Var = se.M(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i11 + " digits");
            } else if (i11 < 4) {
                k91Var = se.M(str, "The year number must be padded to 4 digits, got " + i11 + " digits");
            } else if (charAt3 == '+' && i11 == 4) {
                k91Var = se.M(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i11 != 4) {
                k91Var = se.M(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i9 = -i9;
                }
                int i12 = i10 + 16;
                if (str.length() < i12) {
                    k91Var = se.M(str, "The input string is too short");
                } else {
                    k91 L = se.L(str, "'-'", i10, new qu1(16));
                    if (L != null) {
                        k91Var = L;
                    } else {
                        k91 L2 = se.L(str, "'-'", i10 + 3, new qu1(17));
                        k91Var = L2;
                        if (L2 == null) {
                            k91 L3 = se.L(str, "'T' or 't'", i10 + 6, new qu1(18));
                            k91Var = L3;
                            if (L3 == null) {
                                k91 L4 = se.L(str, "':'", i10 + 9, new qu1(19));
                                k91Var = L4;
                                if (L4 == null) {
                                    k91 L5 = se.L(str, "':'", i10 + 12, new qu1(20));
                                    k91Var = L5;
                                    if (L5 == null) {
                                        int[] iArr = se.h;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < 10) {
                                                k91 L6 = se.L(str, "an ASCII digit", iArr[i13] + i10, new qu1(21));
                                                if (L6 != null) {
                                                    k91Var = L6;
                                                    break;
                                                }
                                                i13++;
                                            } else {
                                                int N = se.N(i10 + 1, str);
                                                int N2 = se.N(i10 + 4, str);
                                                int N3 = se.N(i10 + 7, str);
                                                int N4 = se.N(i10 + 10, str);
                                                int N5 = se.N(i10 + 13, str);
                                                int i14 = i10 + 15;
                                                if (str.charAt(i14) == '.') {
                                                    i14 = i12;
                                                    int i15 = 0;
                                                    while (i14 < str.length() && '0' <= (charAt = str.charAt(i14)) && charAt < ':') {
                                                        i15 = (i15 * 10) + (str.charAt(i14) - '0');
                                                        i14++;
                                                    }
                                                    int i16 = i14 - i12;
                                                    if (1 <= i16 && i16 < 10) {
                                                        i2 = i15 * se.g[9 - i16];
                                                    } else {
                                                        k91Var = se.M(str, "1..9 digits are supported for the fraction of the second, got " + i16 + " digits");
                                                    }
                                                } else {
                                                    i2 = 0;
                                                }
                                                if (i14 >= str.length()) {
                                                    k91Var = se.M(str, "The UTC offset at the end of the string is missing");
                                                } else {
                                                    char charAt4 = str.charAt(i14);
                                                    if (charAt4 != '+' && charAt4 != '-') {
                                                        if (charAt4 != 'Z' && charAt4 != 'z') {
                                                            k91Var = se.M(str, "Expected the UTC offset at position " + i14 + ", got '" + charAt4 + '\'');
                                                        } else {
                                                            int i17 = i14 + 1;
                                                            if (str.length() == i17) {
                                                                i6 = 0;
                                                                if (1 > N) {
                                                                }
                                                                k91Var = se.M(str, "Expected a month number in 1..12, got " + N);
                                                            } else {
                                                                k91Var = se.M(str, "Extra text after the instant at position " + i17);
                                                            }
                                                        }
                                                    } else {
                                                        int length = str.length() - i14;
                                                        if (length > 9) {
                                                            k91Var = se.M(str, "The UTC offset string \"" + se.Y(16, str.subSequence(i14, str.length()).toString()) + "\" is too long");
                                                        } else if (length % 3 != 0) {
                                                            k91Var = se.M(str, "Invalid UTC offset string \"" + str.subSequence(i14, str.length()).toString() + '\"');
                                                        } else {
                                                            int[] iArr2 = se.i;
                                                            int i18 = 0;
                                                            for (int i19 = 2; i18 < i19; i19 = 2) {
                                                                int i20 = i14 + iArr2[i18];
                                                                if (i20 >= str.length()) {
                                                                    break;
                                                                } else if (str.charAt(i20) != ':') {
                                                                    StringBuilder s = wh1.s("Expected ':' at index ", i20, ", got '");
                                                                    s.append(str.charAt(i20));
                                                                    s.append('\'');
                                                                    k91Var = se.M(str, s.toString());
                                                                    break;
                                                                } else {
                                                                    i18++;
                                                                }
                                                            }
                                                            int[] iArr3 = se.j;
                                                            int i21 = 0;
                                                            while (i21 < 6 && (i7 = iArr3[i21] + i14) < str.length()) {
                                                                char charAt5 = str.charAt(i7);
                                                                int[] iArr4 = iArr3;
                                                                if ('0' <= charAt5 && charAt5 < ':') {
                                                                    i21++;
                                                                    iArr3 = iArr4;
                                                                } else {
                                                                    StringBuilder s2 = wh1.s("Expected an ASCII digit at index ", i7, ", got '");
                                                                    s2.append(str.charAt(i7));
                                                                    s2.append('\'');
                                                                    k91Var = se.M(str, s2.toString());
                                                                    break;
                                                                }
                                                            }
                                                            int N6 = se.N(i14 + 1, str);
                                                            if (length > 3) {
                                                                i3 = se.N(i14 + 4, str);
                                                            } else {
                                                                i3 = 0;
                                                            }
                                                            if (length > 6) {
                                                                i4 = se.N(i14 + 7, str);
                                                            } else {
                                                                i4 = 0;
                                                            }
                                                            if (i3 > 59) {
                                                                k91Var = se.M(str, "Expected offset-minute-of-hour in 0..59, got " + i3);
                                                            } else if (i4 > 59) {
                                                                k91Var = se.M(str, "Expected offset-second-of-minute in 0..59, got " + i4);
                                                            } else if (N6 > 17 && (N6 != 18 || i3 != 0 || i4 != 0)) {
                                                                k91Var = se.M(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i14, str.length()).toString());
                                                            } else {
                                                                int i22 = (i3 * 60) + (N6 * 3600) + i4;
                                                                if (charAt4 == '-') {
                                                                    i5 = -1;
                                                                } else {
                                                                    i5 = 1;
                                                                }
                                                                i6 = i22 * i5;
                                                                if (1 > N && N < 13) {
                                                                    if (1 <= N2) {
                                                                        int i23 = i9 & 3;
                                                                        if (i23 == 0 && (i9 % 100 != 0 || i9 % 400 == 0)) {
                                                                            z = true;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        if (N != 2) {
                                                                            if (N != 4 && N != 6 && N != 9 && N != 11) {
                                                                                i8 = 31;
                                                                            } else {
                                                                                i8 = 30;
                                                                            }
                                                                        } else if (z) {
                                                                            i8 = 29;
                                                                        } else {
                                                                            i8 = 28;
                                                                        }
                                                                        if (N2 <= i8) {
                                                                            if (N3 > 23) {
                                                                                k91Var = se.M(str, "Expected hour in 0..23, got " + N3);
                                                                            } else if (N4 > 59) {
                                                                                k91Var = se.M(str, "Expected minute-of-hour in 0..59, got " + N4);
                                                                            } else if (N5 > 59) {
                                                                                k91Var = se.M(str, "Expected second-of-minute in 0..59, got " + N5);
                                                                            } else {
                                                                                long j2 = i9;
                                                                                long j3 = 365 * j2;
                                                                                if (j2 >= 0) {
                                                                                    j = ((j2 + 399) / 400) + (((j2 + 3) / 4) - ((j2 + 99) / 100)) + j3;
                                                                                } else {
                                                                                    j = j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
                                                                                }
                                                                                long j4 = j + (((N * 367) - 362) / 12) + (N2 - 1);
                                                                                if (N > 2) {
                                                                                    j4 = (i23 == 0 && (i9 % 100 != 0 || i9 % 400 == 0)) ? (-1) + j4 : j4 - 2;
                                                                                }
                                                                                ?? obj = new Object();
                                                                                obj.A = (((j4 - 719528) * 86400) + (((N4 * 60) + (N3 * 3600)) + N5)) - i6;
                                                                                obj.B = i2;
                                                                                k91Var = obj;
                                                                            }
                                                                        }
                                                                    }
                                                                    StringBuilder s3 = b31.s(N, i9, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                                    s3.append(N2);
                                                                    k91Var = se.M(str, s3.toString());
                                                                } else {
                                                                    k91Var = se.M(str, "Expected a month number in 1..12, got " + N);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return k91Var.toInstant();
    }

    public static LinkedHashSet O(Set set, Iterable iterable) {
        Integer num;
        int size;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(zt3.j0(size));
        linkedHashSet.addAll(set);
        tq0.D0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet P(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(zt3.j0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Parcelable Q(Parcel parcel, ClassLoader classLoader, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return p2.k(parcel, classLoader, cls);
        }
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable != null && !cls.isInstance(readParcelable)) {
            StringBuilder sb = new StringBuilder("Parcelable ");
            sb.append(readParcelable.getClass());
            String name = cls.getName();
            sb.append(" is not a subclass of required class ");
            sb.append(name);
            sb.append(" provided in the parameter");
            throw new BadParcelableException(sb.toString());
        }
        return readParcelable;
    }

    public static final float R(long j, float f, od1 od1Var) {
        float c2;
        long b2 = is6.b(j);
        if (js6.a(b2, 4294967296L)) {
            if (od1Var.o() > 1.05d) {
                c2 = is6.c(j) / is6.c(od1Var.v0(f));
            } else {
                return od1Var.n0(j);
            }
        } else if (js6.a(b2, 8589934592L)) {
            c2 = is6.c(j);
        } else {
            return Float.NaN;
        }
        return c2 * f;
    }

    public static final void S(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(mh7.h0(j)), i, i2, 33);
        }
    }

    public static final void T(Spannable spannable, long j, od1 od1Var, int i, int i2) {
        long b2 = is6.b(j);
        if (js6.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(jv3.X(od1Var.n0(j)), false), i, i2, 33);
        } else if (js6.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(is6.c(j)), i, i2, 33);
        }
    }

    public static final void U(Spannable spannable, fr3 fr3Var, int i, int i2) {
        if (fr3Var != null) {
            ArrayList arrayList = new ArrayList(uq0.y0(fr3Var, 10));
            for (er3 er3Var : fr3Var.A) {
                arrayList.add(er3Var.a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void V(bf4 bf4Var, int i, Object obj) {
        bf4Var.g0[(bf4Var.h0 - bf4Var.c0[bf4Var.d0 - 1].c) + i] = obj;
    }

    public static final void W(bf4 bf4Var, int i, Object obj, int i2, Object obj2) {
        int i3 = bf4Var.h0 - bf4Var.c0[bf4Var.d0 - 1].c;
        Object[] objArr = bf4Var.g0;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static Set X(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static final ti4 Y(Object obj, Object obj2) {
        return new ti4(obj, obj2);
    }

    public static final Object Z(l34 l34Var, qo0 qo0Var) {
        l34Var.getClass();
        Bundle c2 = l34Var.c0.c();
        if (c2 == null) {
            c2 = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
        }
        Map d = l34Var.B.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zt3.j0(d.size()));
        for (Map.Entry entry : d.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((k34) entry.getValue()).a);
        }
        return me2.O(qo0Var).b(new lr5(c2, linkedHashMap));
    }

    public static final void a(ki2 ki2Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1642214335);
        if ((i & 6) == 0) {
            if (sk2Var.h(ki2Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(et0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            View view = (View) sk2Var.j(ue.f);
            qk2 k0 = dt3.k0(sk2Var);
            k24 L = me2.L(et0Var, sk2Var);
            k24 L2 = me2.L(ki2Var, sk2Var);
            Object[] objArr = new Object[0];
            Object L3 = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L3 == sn1Var) {
                L3 = new do1(3);
                sk2Var.h0(L3);
            }
            UUID uuid = (UUID) jk2.M(objArr, (ki2) L3, sk2Var, 48);
            Object[] objArr2 = new Object[0];
            Object L4 = sk2Var.L();
            if (L4 == sn1Var) {
                L4 = new do1(4);
                sk2Var.h0(L4);
            }
            k24 k24Var = (k24) jk2.M(objArr2, (ki2) L4, sk2Var, 48);
            Object L5 = sk2Var.L();
            ii2 ii2Var = L5;
            if (L5 == sn1Var) {
                boolean booleanValue = ((Boolean) k24Var.getValue()).booleanValue();
                uuid.getClass();
                ii2 ii2Var2 = new ii2(view, booleanValue, uuid);
                et0 et0Var2 = new et0(-1221710001, true, new e4(L, 3));
                ii2Var2.setParentCompositionContext(k0);
                ii2Var2.l0.setValue(et0Var2);
                ii2Var2.k0 = true;
                ii2Var2.j0 = (ki2) L2.getValue();
                sk2Var.h0(ii2Var2);
                ii2Var = ii2Var2;
            }
            ii2 ii2Var3 = (ii2) ii2Var;
            boolean h = sk2Var.h(ii2Var3) | sk2Var.f(k24Var);
            Object L6 = sk2Var.L();
            if (h || L6 == sn1Var) {
                L6 = new gi2(0, ii2Var3, k24Var);
                sk2Var.h0(L6);
            }
            l.d(ii2Var3, (mi2) L6, sk2Var);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(i, 5, ki2Var, et0Var);
        }
    }

    public static final void b(et0 et0Var, tu0 tu0Var, int i) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(441837433);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i & 1, z)) {
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (L == obj) {
                L = new Object();
                sk2Var.h0(L);
            }
            Object obj2 = (os3) L;
            Object L2 = sk2Var.L();
            if (L2 == obj) {
                L2 = mv0.i0;
                sk2Var.h0(L2);
            }
            ki2 ki2Var = (ki2) L2;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(ki2Var);
            } else {
                sk2Var.k0();
            }
            if (sk2Var.S) {
                sk2Var.b(new gu5(21), o27.a);
            }
            oo2.S(sk2Var, dn.i0, obj2);
            et0Var.i(obj2, sk2Var, 48);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ps3(et0Var, i, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e63, mi6] */
    public static mi6 c() {
        return new e63(null);
    }

    public static final xv4 d(xv4 xv4Var, long j) {
        k70 d;
        if (j == 19500) {
            d = xv4Var.e();
        } else {
            d = xv4Var.d();
        }
        return new xv4(d);
    }

    public static m16 e(m16 m16Var) {
        mt3 mt3Var = m16Var.A;
        mt3Var.b();
        if (mt3Var.d0 > 0) {
            return m16Var;
        }
        return m16.B;
    }

    public static final int f(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final String g(t63 t63Var, h06 h06Var) {
        h06Var.getClass();
        t63Var.getClass();
        for (Annotation annotation : h06Var.getAnnotations()) {
            if (annotation instanceof d73) {
                return ((d73) annotation).discriminator();
            }
        }
        return t63Var.a.d;
    }

    public static final int h(ns5 ns5Var, String str) {
        ns5Var.getClass();
        int columnCount = ns5Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i < columnCount) {
                if (str.equals(ns5Var.getColumnName(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            return i;
        }
        String n = b31.n('`', "`", str);
        int columnCount2 = ns5Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 < columnCount2) {
                if (n.equals(ns5Var.getColumnName(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = ns5Var.getColumnCount();
            String concat = ".".concat(str);
            String n2 = b31.n('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = ns5Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (gh6.f0(columnName, concat, false) || (columnName.charAt(0) == '`' && gh6.f0(columnName, n2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final boolean i(y55 y55Var, float f, float f2) {
        float f3 = y55Var.a;
        if (f <= y55Var.c && f3 <= f) {
            float f4 = y55Var.b;
            if (f2 <= y55Var.d && f4 <= f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static l23 l(long j) {
        long j2 = j / 1000;
        if ((j ^ 1000) < 0 && j2 * 1000 != j) {
            j2--;
        }
        long j3 = j % 1000;
        int i = (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000);
        if (j2 < -31557014167219200L) {
            return l23.L;
        }
        if (j2 > 31556889864403199L) {
            return l23.R;
        }
        return m(i, j2);
    }

    public static l23 m(int i, long j) {
        long j2 = i;
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            if (j > 0) {
                return l23.R;
            }
            return l23.L;
        } else if (j4 < -31557014167219200L) {
            return l23.L;
        } else {
            if (j4 > 31556889864403199L) {
                return l23.R;
            }
            long j5 = j2 % 1000000000;
            return new l23((int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)), j4);
        }
    }

    public static cw3 n(String str) {
        String str2;
        String str3;
        str.getClass();
        ku3 b2 = cw3.d.b(0, str);
        if (b2 != null) {
            Locale locale = Locale.ROOT;
            String lowerCase = ((String) ((iu3) b2.a()).get(1)).toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = ((String) ((iu3) b2.a()).get(2)).toLowerCase(locale);
            lowerCase2.getClass();
            ArrayList arrayList = new ArrayList();
            int i = b2.b().B;
            while (true) {
                int i2 = i + 1;
                if (i2 < str.length()) {
                    ku3 b3 = cw3.e.b(i2, str);
                    if (b3 != null) {
                        ju3 ju3Var = b3.c;
                        hu3 c2 = ju3Var.c(1);
                        if (c2 != null) {
                            str2 = c2.a;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            i = b3.b().B;
                        } else {
                            hu3 c3 = ju3Var.c(2);
                            if (c3 != null) {
                                str3 = c3.a;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                hu3 c4 = ju3Var.c(3);
                                c4.getClass();
                                str3 = c4.a;
                            } else if (zg6.R0(str3, '\'') && zg6.t0(str3, '\'') && str3.length() > 2) {
                                str3 = str3.substring(1, str3.length() - 1);
                            }
                            arrayList.add(str2);
                            arrayList.add(str3);
                            i = b3.b().B;
                        }
                    } else {
                        f81.s("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                        return null;
                    }
                } else {
                    return new cw3(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
            }
        } else {
            i.i(b31.n('\"', "No subtype found for: \"", str));
            return null;
        }
    }

    public static final int q(ns5 ns5Var, String str) {
        ns5Var.getClass();
        return h(ns5Var, str);
    }

    public static final int r(ns5 ns5Var, String str) {
        ns5Var.getClass();
        int h = h(ns5Var, str);
        if (h >= 0) {
            return h;
        }
        int columnCount = ns5Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(ns5Var.getColumnName(i));
        }
        f81.l("Column '", str, "' does not exist. Available columns: [", tq0.S0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final c55 t(ew4 ew4Var, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        c55 c55Var = (c55) sk2Var.j(ew4Var);
        if (c55Var == null) {
            return iq0.s((Context) sk2Var.j(ue.b));
        }
        return c55Var;
    }

    public static final long w(KeyEvent keyEvent) {
        return jk2.f(keyEvent.getKeyCode());
    }

    public static String x(Class cls) {
        LinkedHashMap linkedHashMap = l54.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            j54 j54Var = (j54) cls.getAnnotation(j54.class);
            if (j54Var != null) {
                str = j54Var.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                i.g("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
        }
        str.getClass();
        return str;
    }

    public static final dy5 z(Object obj) {
        if (obj != yv0.a) {
            return (dy5) obj;
        }
        i.n("Does not contain segment");
        return null;
    }

    public abstract boolean F(Class cls);

    public boolean G(byte[] bArr, int i, int i2) {
        if (N(bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }

    public abstract int N(byte[] bArr, int i, int i2);

    public abstract String j(byte[] bArr, int i, int i2);

    public abstract int k(int i, int i2, String str, byte[] bArr);

    public abstract Method o(Class cls, Field field);

    public abstract Constructor p(Class cls);

    public Object s(int i) {
        p43 d = u().d(i);
        return d.c.b().n(Integer.valueOf(i - d.a));
    }

    public abstract sh u();

    public Object v(int i) {
        Object n;
        p43 d = u().d(i);
        int i2 = i - d.a;
        mi2 key = d.c.getKey();
        if (key != null && (n = key.n(Integer.valueOf(i2))) != null) {
            return n;
        }
        return new ta1(i);
    }

    public abstract String[] y(Class cls);
}
