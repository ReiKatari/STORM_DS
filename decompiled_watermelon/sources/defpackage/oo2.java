package defpackage;

import android.text.Spanned;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oo2  reason: default package */
/* loaded from: classes.dex */
public abstract class oo2 {
    public static ax2 a;
    public static ax2 b;
    public static Field c;
    public static boolean d;
    public static Class e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static Field i;
    public static boolean j;
    public static final /* synthetic */ int k = 0;
    public static ax2 l;

    public static final long A(ki4 ki4Var) {
        return jv3.Y(ki4Var.l() * ki4Var.p()) + (ki4Var.k() * ki4Var.p());
    }

    public static String B(x70 x70Var) {
        StringBuilder sb = new StringBuilder(x70Var.size());
        for (int i2 = 0; i2 < x70Var.size(); i2++) {
            byte b2 = x70Var.b(i2);
            if (b2 != 34) {
                if (b2 != 39) {
                    if (b2 != 92) {
                        switch (b2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case mj2.L /* 12 */:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (b2 >= 32 && b2 <= 126) {
                                    sb.append((char) b2);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b2 >>> 6) & 3) + 48));
                                    sb.append((char) (((b2 >>> 3) & 7) + 48));
                                    sb.append((char) ((b2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final Object C(fq4 fq4Var, String str, k11 k11Var) {
        Object b2 = fq4Var.b(str, new d96(24), k11Var);
        if (b2 == p31.COROUTINE_SUSPENDED) {
            return b2;
        }
        return o27.a;
    }

    public static final fq3 D(Executor executor, String str, ki2 ki2Var) {
        executor.getClass();
        return ct3.k0(new eh2(executor, str, ki2Var, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, yd7] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static yd7 E(gz0 gz0Var, int i2, ArrayList arrayList, yd7 yd7Var) {
        int i3;
        int i4;
        if (i2 == 0) {
            i3 = gz0Var.r0;
        } else {
            i3 = gz0Var.s0;
        }
        int i5 = 0;
        if (i3 != -1 && (yd7Var == 0 || i3 != yd7Var.b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                yd7 yd7Var2 = (yd7) arrayList.get(i6);
                if (yd7Var2.b == i3) {
                    if (yd7Var != 0) {
                        yd7Var.c(i2, yd7Var2);
                        arrayList.remove(yd7Var);
                    }
                    yd7Var = yd7Var2;
                } else {
                    i6++;
                }
            }
        } else if (i3 != -1) {
            return yd7Var;
        }
        yd7 yd7Var3 = yd7Var;
        if (yd7Var == null) {
            if (gz0Var instanceof fr2) {
                fr2 fr2Var = (fr2) gz0Var;
                int i7 = 0;
                while (true) {
                    if (i7 < fr2Var.u0) {
                        gz0 gz0Var2 = fr2Var.t0[i7];
                        if ((i2 == 0 && (i4 = gz0Var2.r0) != -1) || (i2 == 1 && (i4 = gz0Var2.s0) != -1)) {
                            break;
                        }
                        i7++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        yd7 yd7Var4 = (yd7) arrayList.get(i8);
                        if (yd7Var4.b == i4) {
                            yd7Var = yd7Var4;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (yd7Var == 0) {
                yd7Var = new Object();
                yd7Var.a = new ArrayList();
                yd7Var.d = null;
                yd7Var.e = -1;
                int i9 = yd7.f;
                yd7.f = i9 + 1;
                yd7Var.b = i9;
                yd7Var.c = i2;
            }
            arrayList.add(yd7Var);
            yd7Var3 = yd7Var;
        }
        ArrayList arrayList2 = yd7Var3.a;
        if (arrayList2.contains(gz0Var)) {
            return yd7Var3;
        }
        arrayList2.add(gz0Var);
        if (gz0Var instanceof yo2) {
            yo2 yo2Var = (yo2) gz0Var;
            cy0 cy0Var = yo2Var.w0;
            if (yo2Var.x0 == 0) {
                i5 = 1;
            }
            cy0Var.c(i5, yd7Var3, arrayList);
        }
        int i10 = yd7Var3.b;
        if (i2 == 0) {
            gz0Var.r0 = i10;
            gz0Var.I.c(i2, yd7Var3, arrayList);
            gz0Var.K.c(i2, yd7Var3, arrayList);
        } else {
            gz0Var.s0 = i10;
            gz0Var.J.c(i2, yd7Var3, arrayList);
            gz0Var.M.c(i2, yd7Var3, arrayList);
            gz0Var.L.c(i2, yd7Var3, arrayList);
        }
        gz0Var.P.c(i2, yd7Var3, arrayList);
        return yd7Var3;
    }

    public static final int F(int i2, String str) {
        String str2;
        int i3;
        mo1 H = H();
        Integer num = null;
        if (H != null) {
            boolean z = true;
            if (H.c() != 1) {
                z = false;
            }
            nl2.D("Not initialized yet", z);
            nl2.C(str, "charSequence cannot be null");
            os osVar = H.e.b;
            osVar.getClass();
            if (i2 < 0 || i2 >= str.length()) {
                str2 = str;
                i3 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    x07[] x07VarArr = (x07[]) spanned.getSpans(i2, i2 + 1, x07.class);
                    if (x07VarArr.length > 0) {
                        i3 = spanned.getSpanEnd(x07VarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i3 = ((yo1) osVar.K(str2, Math.max(0, i2 - 16), Math.min(str.length(), i2 + 16), Preference.DEFAULT_ORDER, true, new yo1(i2))).L;
            }
            Integer valueOf = Integer.valueOf(i3);
            if (i3 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i2);
    }

    public static final int G(int i2, String str) {
        mo1 H = H();
        Integer num = null;
        if (H != null) {
            Integer valueOf = Integer.valueOf(H.b(Math.max(0, i2 - 1), str));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i2);
    }

    public static final mo1 H() {
        if (mo1.d()) {
            mo1 a2 = mo1.a();
            if (a2.c() == 1) {
                return a2;
            }
            return null;
        }
        return null;
    }

    public static String I(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((i2 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i2 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    public static final ax2 J() {
        ax2 ax2Var = a;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(12.0f, 8.0f);
        vq2Var.i(1.1f, RecyclerView.A1, 2.0f, -0.9f, 2.0f, -2.0f);
        vq2Var.q(-0.9f, -2.0f, -2.0f, -2.0f);
        vq2Var.q(-2.0f, 0.9f, -2.0f, 2.0f);
        vq2Var.q(0.9f, 2.0f, 2.0f, 2.0f);
        vq2Var.g();
        vq2Var.o(12.0f, 10.0f);
        vq2Var.i(-1.1f, RecyclerView.A1, -2.0f, 0.9f, -2.0f, 2.0f);
        vq2Var.q(0.9f, 2.0f, 2.0f, 2.0f);
        vq2Var.q(2.0f, -0.9f, 2.0f, -2.0f);
        vq2Var.q(-0.9f, -2.0f, -2.0f, -2.0f);
        vq2Var.g();
        vq2Var.o(12.0f, 16.0f);
        vq2Var.i(-1.1f, RecyclerView.A1, -2.0f, 0.9f, -2.0f, 2.0f);
        vq2Var.q(0.9f, 2.0f, 2.0f, 2.0f);
        vq2Var.q(2.0f, -0.9f, 2.0f, -2.0f);
        vq2Var.q(-0.9f, -2.0f, -2.0f, -2.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        a = b2;
        return b2;
    }

    public static final qr5 K(mv3 mv3Var) {
        Object l2 = mv3Var.l();
        if (l2 instanceof qr5) {
            return (qr5) l2;
        }
        return null;
    }

    public static final ax2 L() {
        ax2 ax2Var = l;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.VideogameAsset", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(21.0f, 6.0f);
        vq2Var.m(3.0f, 6.0f);
        vq2Var.i(-1.1f, RecyclerView.A1, -2.0f, 0.9f, -2.0f, 2.0f);
        vq2Var.u(8.0f);
        vq2Var.i(RecyclerView.A1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        vq2Var.l(18.0f);
        vq2Var.i(1.1f, RecyclerView.A1, 2.0f, -0.9f, 2.0f, -2.0f);
        vq2Var.m(23.0f, 8.0f);
        vq2Var.i(RecyclerView.A1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        vq2Var.g();
        vq2Var.o(11.0f, 13.0f);
        vq2Var.m(8.0f, 13.0f);
        vq2Var.u(3.0f);
        vq2Var.m(6.0f, 16.0f);
        vq2Var.u(-3.0f);
        vq2Var.m(3.0f, 13.0f);
        vq2Var.u(-2.0f);
        vq2Var.l(3.0f);
        vq2Var.m(6.0f, 8.0f);
        vq2Var.l(2.0f);
        vq2Var.u(3.0f);
        vq2Var.l(3.0f);
        vq2Var.u(2.0f);
        vq2Var.g();
        vq2Var.o(15.5f, 15.0f);
        vq2Var.i(-0.83f, RecyclerView.A1, -1.5f, -0.67f, -1.5f, -1.5f);
        vq2Var.q(0.67f, -1.5f, 1.5f, -1.5f);
        vq2Var.q(1.5f, 0.67f, 1.5f, 1.5f);
        vq2Var.q(-0.67f, 1.5f, -1.5f, 1.5f);
        vq2Var.g();
        vq2Var.o(19.5f, 12.0f);
        vq2Var.i(-0.83f, RecyclerView.A1, -1.5f, -0.67f, -1.5f, -1.5f);
        vq2Var.p(18.67f, 9.0f, 19.5f, 9.0f);
        vq2Var.q(1.5f, 0.67f, 1.5f, 1.5f);
        vq2Var.q(-0.67f, 1.5f, -1.5f, 1.5f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        l = b2;
        return b2;
    }

    public static final float M(qr5 qr5Var) {
        if (qr5Var != null) {
            return qr5Var.a;
        }
        return RecyclerView.A1;
    }

    public static final void N(tu0 tu0Var, Integer num, aj2 aj2Var) {
        if (((sk2) tu0Var).S) {
            ((sk2) tu0Var).b(aj2Var, num);
        }
    }

    public static l90 O(e31 e31Var, aj2 aj2Var) {
        s31 s31Var = s31.DEFAULT;
        e31Var.getClass();
        s31Var.getClass();
        return ct3.k0(new eh2(e31Var, s31Var, aj2Var, 1));
    }

    public static final void P(tu0 tu0Var, mi2 mi2Var) {
        ((sk2) tu0Var).b(new nh3(2, mi2Var), o27.a);
    }

    public static final boolean Q(d24 d24Var, Object obj, Object obj2) {
        Object g2 = d24Var.g(obj);
        if (g2 == null) {
            return false;
        }
        if (g2 instanceof e24) {
            e24 e24Var = (e24) g2;
            boolean l2 = e24Var.l(obj2);
            if (l2 && e24Var.g()) {
                d24Var.k(obj);
            }
            return l2;
        } else if (!g2.equals(obj2)) {
            return false;
        } else {
            d24Var.k(obj);
            return true;
        }
    }

    public static final void R(d24 d24Var, Object obj) {
        boolean z;
        long[] jArr = d24Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = d24Var.b[i5];
                            Object obj3 = d24Var.c[i5];
                            if (obj3 instanceof e24) {
                                e24 e24Var = (e24) obj3;
                                e24Var.l(obj);
                                z = e24Var.g();
                            } else if (obj3 == obj) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                d24Var.l(i5);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void S(tu0 tu0Var, aj2 aj2Var, Object obj) {
        if (!((sk2) tu0Var).S && b53.x(((sk2) tu0Var).L(), obj)) {
            return;
        }
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.h0(obj);
        sk2Var.b(aj2Var, obj);
    }

    public static final o43 T(h06 h06Var) {
        String l0 = gh6.l0(h06Var.b(), "?", "");
        if (b53.x(h06Var.c(), m06.h)) {
            if (h06Var.h()) {
                return o43.ENUM_NULLABLE;
            }
            return o43.ENUM;
        } else if (l0.equals("kotlin.Int")) {
            if (h06Var.h()) {
                return o43.INT_NULLABLE;
            }
            return o43.INT;
        } else if (l0.equals("kotlin.Boolean")) {
            if (h06Var.h()) {
                return o43.BOOL_NULLABLE;
            }
            return o43.BOOL;
        } else if (l0.equals("kotlin.Double")) {
            if (h06Var.h()) {
                return o43.DOUBLE_NULLABLE;
            }
            return o43.DOUBLE;
        } else if (l0.equals("kotlin.Float")) {
            if (h06Var.h()) {
                return o43.FLOAT_NULLABLE;
            }
            return o43.FLOAT;
        } else if (l0.equals("kotlin.Long")) {
            if (h06Var.h()) {
                return o43.LONG_NULLABLE;
            }
            return o43.LONG;
        } else if (l0.equals("kotlin.String")) {
            if (h06Var.h()) {
                return o43.STRING_NULLABLE;
            }
            return o43.STRING;
        } else if (l0.equals("kotlin.IntArray")) {
            return o43.INT_ARRAY;
        } else {
            if (l0.equals("kotlin.DoubleArray")) {
                return o43.DOUBLE_ARRAY;
            }
            if (l0.equals("kotlin.BooleanArray")) {
                return o43.BOOL_ARRAY;
            }
            if (l0.equals("kotlin.FloatArray")) {
                return o43.FLOAT_ARRAY;
            }
            if (l0.equals("kotlin.LongArray")) {
                return o43.LONG_ARRAY;
            }
            if (l0.equals("kotlin.Array")) {
                return o43.ARRAY;
            }
            if (gh6.n0(l0, "kotlin.collections.ArrayList", false)) {
                return o43.LIST;
            }
            return o43.UNKNOWN;
        }
    }

    public static boolean U(fz0 fz0Var, fz0 fz0Var2, fz0 fz0Var3, fz0 fz0Var4) {
        boolean z;
        boolean z2;
        fz0 fz0Var5;
        fz0 fz0Var6;
        fz0 fz0Var7 = fz0.FIXED;
        if (fz0Var3 != fz0Var7 && fz0Var3 != (fz0Var6 = fz0.WRAP_CONTENT) && (fz0Var3 != fz0.MATCH_PARENT || fz0Var == fz0Var6)) {
            z = false;
        } else {
            z = true;
        }
        if (fz0Var4 != fz0Var7 && fz0Var4 != (fz0Var5 = fz0.WRAP_CONTENT) && (fz0Var4 != fz0.MATCH_PARENT || fz0Var2 == fz0Var5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public static final void a(final String str, final String str2, final d33 d33Var, final boolean z, final int i2, final mi2 mi2Var, ki2 ki2Var, tu0 tu0Var, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ki2 ki2Var2;
        int i10;
        int i11;
        boolean z2;
        sk2 sk2Var;
        final ki2 ki2Var3;
        ki2 ki2Var4;
        boolean z3;
        long f2;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-2098701988);
        if (sk2Var2.f(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i3 | i5;
        if (sk2Var2.f(str2)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i13 = i12 | i6;
        if (sk2Var2.h(d33Var)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i14 = i13 | i7;
        if (sk2Var2.g(z)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i15 = i14 | i8;
        if (sk2Var2.h(mi2Var)) {
            i9 = 131072;
        } else {
            i9 = 65536;
        }
        int i16 = i15 | i9;
        int i17 = i4 & 64;
        if (i17 != 0) {
            i11 = i16 | 1572864;
            ki2Var2 = ki2Var;
        } else {
            ki2Var2 = ki2Var;
            if (sk2Var2.h(ki2Var2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i11 = i16 | i10;
        }
        if ((599187 & i11) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var2.O(i11 & 1, z2)) {
            if (i17 != 0) {
                ki2Var4 = null;
            } else {
                ki2Var4 = ki2Var2;
            }
            lr0 a2 = jr0.a(new ot(4.0f, true, new i(1)), y60.j0, sk2Var2, 6);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l2 = sk2Var2.l();
            wy3 wy3Var = wy3.a;
            zy3 e0 = l07.e0(sk2Var2, wy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            S(sk2Var2, mu0.f, a2);
            S(sk2Var2, mu0.e, l2);
            S(sk2Var2, mu0.g, Integer.valueOf(hashCode));
            P(sk2Var2, mu0.h);
            S(sk2Var2, mu0.d, e0);
            zy3 c2 = o76.c(wy3Var, 1.0f);
            yb1 w = pu.w(sk2Var2);
            fb3 fb3Var = new fb3(0, 3, i2, 115);
            if ((3670016 & i11) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L = sk2Var2.L();
            if (z3 || L == su0.a) {
                L = new el0(4, ki2Var4);
                sk2Var2.h0(L);
            }
            ki2 ki2Var5 = ki2Var4;
            vf4.b(str2, mi2Var, c2, false, null, ct3.H0(-1084697396, new h5(str), sk2Var2), z, null, fb3Var, new db3(62, (mi2) L), true, 0, 0, null, w, sk2Var2, ((i11 >> 3) & 14) | 1573248 | ((i11 >> 12) & 112), ((i11 >> 9) & 14) | 24576, 494520);
            String W = me2.W(R.string.layout_position_allowed_range, new Object[]{Integer.valueOf(d33Var.A), Integer.valueOf(d33Var.B)}, sk2Var2);
            ds6 ds6Var = ((c17) sk2Var2.j(d17.b)).l;
            if (z) {
                sk2Var2.X(-1347124725);
                f2 = ((hr0) sk2Var2.j(ir0.a)).b();
            } else {
                sk2Var2.X(-1347123697);
                f2 = ((hr0) sk2Var2.j(ir0.a)).f();
            }
            sk2Var2.p(false);
            ir6.b(W, null, f2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ds6Var, sk2Var2, 0, 0, 65530);
            sk2Var = sk2Var2;
            sk2Var.p(true);
            ki2Var3 = ki2Var5;
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
            ki2Var3 = ki2Var2;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(str, str2, d33Var, z, i2, mi2Var, ki2Var3, i3, i4) { // from class: yc3
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ d33 L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ int X;
                public final /* synthetic */ mi2 Y;
                public final /* synthetic */ ki2 Z;
                public final /* synthetic */ int c0;

                {
                    this.c0 = i4;
                }

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(24577);
                    oo2.a(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I, this.c0);
                    return o27.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.util.List r33, defpackage.zy3 r34, boolean r35, defpackage.tu0 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo2.b(java.util.List, zy3, boolean, tu0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.ki2 r15, defpackage.zy3 r16, boolean r17, final defpackage.et0 r18, defpackage.tu0 r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo2.c(ki2, zy3, boolean, et0, tu0, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [t63, w73] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, c73] */
    public static w73 d(mi2 mi2Var) {
        s63 s63Var = t63.d;
        s63Var.getClass();
        ?? obj = new Object();
        e73 e73Var = s63Var.a;
        obj.a = e73Var.b;
        obj.b = e73Var.a;
        String str = e73Var.c;
        String str2 = e73Var.d;
        po0 po0Var = e73Var.f;
        boolean z = e73Var.e;
        vn1 vn1Var = s63Var.b;
        boolean z2 = e73Var.g;
        mi2Var.n(obj);
        if (b53.x(str, "    ")) {
            e73 e73Var2 = new e73(obj.b, obj.a, str, str2, z, po0Var, z2);
            vn1Var.getClass();
            ?? t63Var = new t63(e73Var2, vn1Var);
            if (vn1Var != u06.a) {
                po0 po0Var2 = po0.NONE;
            }
            return t63Var;
        }
        i.i("Indent should not be specified when default printing mode is used");
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [b33, d33] */
    /* JADX WARN: Type inference failed for: r2v5, types: [b33, d33] */
    public static final void e(final cd3 cd3Var, final ki2 ki2Var, final aj2 aj2Var, tu0 tu0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        m55 r;
        aj2 aj2Var2;
        boolean z2;
        boolean z3;
        final Integer num;
        final Integer num2;
        boolean z4;
        int intValue;
        int intValue2;
        ki2Var.getClass();
        aj2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-2077848882);
        if (sk2Var.f(cd3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (sk2Var.h(ki2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (sk2Var.h(aj2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        final boolean z5 = true;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            if (cd3Var == null) {
                r = sk2Var.r();
                if (r != null) {
                    aj2Var2 = new aj2(cd3Var, ki2Var, aj2Var, i2, 0) { // from class: xc3
                        public final /* synthetic */ int A;
                        public final /* synthetic */ cd3 B;
                        public final /* synthetic */ ki2 L;
                        public final /* synthetic */ aj2 R;

                        {
                            this.A = r5;
                        }

                        @Override // defpackage.aj2
                        public final Object j(Object obj, Object obj2) {
                            int i9 = this.A;
                            o27 o27Var = o27.a;
                            aj2 aj2Var3 = this.R;
                            ki2 ki2Var2 = this.L;
                            cd3 cd3Var2 = this.B;
                            tu0 tu0Var2 = (tu0) obj;
                            ((Integer) obj2).getClass();
                            switch (i9) {
                                case 0:
                                    oo2.e(cd3Var2, ki2Var2, aj2Var3, tu0Var2, ep2.I(1));
                                    return o27Var;
                                default:
                                    oo2.e(cd3Var2, ki2Var2, aj2Var3, tu0Var2, ep2.I(1));
                                    return o27Var;
                            }
                        }
                    };
                    r.d = aj2Var2;
                }
                return;
            }
            int i9 = cd3Var.c;
            int i10 = cd3Var.b;
            int i11 = cd3Var.e;
            int i12 = cd3Var.d;
            vc3 vc3Var = cd3Var.a;
            Object[] objArr = {vc3Var, Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i12), Integer.valueOf(i11)};
            int i13 = i8 & 14;
            if (i13 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z2 || L == sn1Var) {
                L = new ki2() { // from class: zc3
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i14 = r2;
                        cd3 cd3Var2 = cd3Var;
                        switch (i14) {
                            case 0:
                                return me2.G(String.valueOf(cd3Var2.b));
                            default:
                                return me2.G(String.valueOf(cd3Var2.c));
                        }
                    }
                };
                sk2Var.h0(L);
            }
            final k24 k24Var = (k24) jk2.M(objArr, (ki2) L, sk2Var, 0);
            Object[] objArr2 = {vc3Var, Integer.valueOf(i10), Integer.valueOf(i9), Integer.valueOf(i12), Integer.valueOf(i11)};
            if (i13 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L2 = sk2Var.L();
            if (z3 || L2 == sn1Var) {
                L2 = new ki2() { // from class: zc3
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i14 = r2;
                        cd3 cd3Var2 = cd3Var;
                        switch (i14) {
                            case 0:
                                return me2.G(String.valueOf(cd3Var2.b));
                            default:
                                return me2.G(String.valueOf(cd3Var2.c));
                        }
                    }
                };
                sk2Var.h0(L2);
            }
            final k24 k24Var2 = (k24) jk2.M(objArr2, (ki2) L2, sk2Var, 0);
            final ?? b33Var = new b33(0, i12, 1);
            final ?? b33Var2 = new b33(0, i11, 1);
            Integer o0 = gh6.o0((String) k24Var.getValue());
            if (o0 != null && (intValue2 = o0.intValue()) >= 0 && intValue2 <= b33Var.B) {
                num = o0;
            } else {
                num = null;
            }
            Integer o02 = gh6.o0((String) k24Var2.getValue());
            if (o02 != null && (intValue = o02.intValue()) >= 0 && intValue <= b33Var2.B) {
                num2 = o02;
            } else {
                num2 = null;
            }
            if (((String) k24Var.getValue()).length() > 0 && num == null) {
                z4 = true;
            } else {
                z4 = true;
                z5 = false;
            }
            if (((String) k24Var2.getValue()).length() <= 0 || num2 != null) {
                z4 = false;
            }
            final boolean z6 = z4;
            mh7.a(me2.W(R.string.layout_component_position_title, new Object[]{me2.X(sk2Var, cg2.C(vc3Var))}, sk2Var), ki2Var, ct3.H0(667490787, new bj2() { // from class: ad3
                @Override // defpackage.bj2
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z7;
                    int i14;
                    ih4 ih4Var = (ih4) obj;
                    tu0 tu0Var2 = (tu0) obj2;
                    int intValue3 = ((Integer) obj3).intValue();
                    ih4Var.getClass();
                    if ((intValue3 & 6) == 0) {
                        if (((sk2) tu0Var2).f(ih4Var)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        intValue3 |= i14;
                    }
                    if ((intValue3 & 19) != 18) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    sk2 sk2Var2 = (sk2) tu0Var2;
                    if (sk2Var2.O(intValue3 & 1, z7)) {
                        zy3 W = b53.W(o76.c(wy3.a, 1.0f), ih4Var);
                        lr0 a2 = jr0.a(new ot(16.0f, true, new i(1)), y60.j0, sk2Var2, 6);
                        int hashCode = Long.hashCode(sk2Var2.T);
                        sm4 l2 = sk2Var2.l();
                        zy3 e0 = l07.e0(sk2Var2, W);
                        nu0.i.getClass();
                        ki2 ki2Var2 = mu0.b;
                        sk2Var2.b0();
                        if (sk2Var2.S) {
                            sk2Var2.k(ki2Var2);
                        } else {
                            sk2Var2.k0();
                        }
                        oo2.S(sk2Var2, mu0.f, a2);
                        oo2.S(sk2Var2, mu0.e, l2);
                        oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode));
                        oo2.P(sk2Var2, mu0.h);
                        oo2.S(sk2Var2, mu0.d, e0);
                        String X = me2.X(sk2Var2, R.string.input_x);
                        k24 k24Var3 = k24Var;
                        String str = (String) k24Var3.getValue();
                        boolean f2 = sk2Var2.f(k24Var3);
                        Object L3 = sk2Var2.L();
                        Object obj4 = su0.a;
                        if (f2 || L3 == obj4) {
                            L3 = new j4(k24Var3, 9);
                            sk2Var2.h0(L3);
                        }
                        oo2.a(X, str, d33.this, z5, 6, (mi2) L3, null, sk2Var2, 24576, 64);
                        String X2 = me2.X(sk2Var2, R.string.input_y);
                        k24 k24Var4 = k24Var2;
                        String str2 = (String) k24Var4.getValue();
                        boolean f3 = sk2Var2.f(k24Var4);
                        Object L4 = sk2Var2.L();
                        if (f3 || L4 == obj4) {
                            L4 = new j4(k24Var4, 10);
                            sk2Var2.h0(L4);
                        }
                        mi2 mi2Var = (mi2) L4;
                        Integer num3 = num;
                        boolean f4 = sk2Var2.f(num3);
                        Integer num4 = num2;
                        boolean f5 = f4 | sk2Var2.f(num4);
                        aj2 aj2Var3 = aj2Var;
                        boolean f6 = f5 | sk2Var2.f(aj2Var3);
                        Object L5 = sk2Var2.L();
                        if (f6 || L5 == obj4) {
                            L5 = new bd3(num3, num4, aj2Var3, 1);
                            sk2Var2.h0(L5);
                        }
                        oo2.a(X2, str2, b33Var2, z6, 7, mi2Var, (ki2) L5, sk2Var2, 24576, 0);
                        sk2Var2.p(true);
                    } else {
                        sk2Var2.R();
                    }
                    return o27.a;
                }
            }, sk2Var), ct3.H0(377972581, new p4(ki2Var, num, num2, aj2Var, 5), sk2Var), false, sk2Var, (i8 & 112) | 3456, 16);
        } else {
            sk2Var.R();
        }
        r = sk2Var.r();
        if (r != null) {
            aj2Var2 = new aj2(cd3Var, ki2Var, aj2Var, i2, 1) { // from class: xc3
                public final /* synthetic */ int A;
                public final /* synthetic */ cd3 B;
                public final /* synthetic */ ki2 L;
                public final /* synthetic */ aj2 R;

                {
                    this.A = r5;
                }

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    int i92 = this.A;
                    o27 o27Var = o27.a;
                    aj2 aj2Var3 = this.R;
                    ki2 ki2Var2 = this.L;
                    cd3 cd3Var2 = this.B;
                    tu0 tu0Var2 = (tu0) obj;
                    ((Integer) obj2).getClass();
                    switch (i92) {
                        case 0:
                            oo2.e(cd3Var2, ki2Var2, aj2Var3, tu0Var2, ep2.I(1));
                            return o27Var;
                        default:
                            oo2.e(cd3Var2, ki2Var2, aj2Var3, tu0Var2, ep2.I(1));
                            return o27Var;
                    }
                }
            };
            r.d = aj2Var2;
        }
    }

    public static final void f(et0 et0Var, tu0 tu0Var, int i2) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-709502251);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            ye6 ye6Var = nt5.a;
            lt5 lt5Var = (lt5) sk2Var.j(ye6Var);
            kt5 c0 = gk2.c0(sk2Var);
            Object[] objArr = {lt5Var};
            ci3 ci3Var = new ci3(22, new qt0(17), new gi2(13, lt5Var, c0));
            boolean h2 = sk2Var.h(lt5Var) | sk2Var.h(c0);
            Object L = sk2Var.L();
            if (h2 || L == su0.a) {
                L = new jd2(10, lt5Var, c0);
                sk2Var.h0(L);
            }
            rk3 rk3Var = (rk3) jk2.N(objArr, ci3Var, (ki2) L, sk2Var, 0);
            dk7.a(ye6Var.a(rk3Var), ct3.H0(-412824043, new s4(23, et0Var, rk3Var), sk2Var), sk2Var, 56);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new sp(et0Var, i2, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.eo2 r25, defpackage.zy3 r26, defpackage.ki3 r27, defpackage.ih4 r28, defpackage.qt r29, defpackage.nt r30, defpackage.a92 r31, boolean r32, defpackage.eg r33, defpackage.mi2 r34, defpackage.tu0 r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo2.g(eo2, zy3, ki3, ih4, qt, nt, a92, boolean, eg, mi2, tu0, int, int):void");
    }

    public static final void h(et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1677843913);
        if (sk2Var.h(et0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            et0Var.j(sk2Var, Integer.valueOf(i4 & 14));
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new sp(et0Var, i2, 6);
        }
    }

    public static final void i(i3 i3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(829713300);
        if (sk2Var.h(i3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = a53.c(1.0f);
                sk2Var.h0(L);
            }
            um umVar = (um) L;
            zy3 X = b53.X(wy3.a, 8.0f);
            boolean h2 = sk2Var.h(umVar);
            Object L2 = sk2Var.L();
            if (h2 || L2 == sn1Var) {
                L2 = new ll3(umVar, 1);
                sk2Var.h0(L2);
            }
            pu.a(tq5.q(X, (mi2) L2), i3Var.a.j, i3Var.b, null, ct3.H0(504110394, new l4(9, umVar, i3Var), sk2Var), sk2Var, 24576, 8);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i2, 20, i3Var);
        }
    }

    public static final vt4 j(String str, tt4 tt4Var) {
        if (!zg6.B0(str)) {
            Iterator it = ((ot3) yt4.a.values()).iterator();
            while (((lt3) it).hasNext()) {
                m93 m93Var = (m93) ((jt3) it).next();
                if (str.equals(m93Var.e().b())) {
                    StringBuilder u = b31.u("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                    u.append(q75.a(m93Var.getClass()).c());
                    u.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                    i.i(ah6.Y(u.toString()));
                    return null;
                }
            }
            return new vt4(str, tt4Var);
        }
        i.i("Blank serial names are prohibited");
        return null;
    }

    public static final void k(wc2 wc2Var, tu0 tu0Var, int i2) {
        boolean z;
        wc2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(842525353);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = new md7(wc2Var, null);
                sk2Var.h0(L);
            }
            l.g(sk2Var, (aj2) L, wc2Var);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new bt5(i2, 12, wc2Var);
        }
    }

    public static final void l(zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i2) {
        boolean z;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-2059218889);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            if (sk2Var.h(et0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i4 |= i3;
        }
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            wy3 wy3Var = wy3.a;
            zy3 z2 = b53.z(1.0f, C.f, dk7.i(a53.t(o76.c(wy3Var, 1.0f), gr5.b(15.0f)), C.c, iq2.g), gr5.b(15.0f));
            int i5 = (i4 << 6) & 7168;
            lr0 a2 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, z2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            S(sk2Var, mu0.f, a2);
            S(sk2Var, mu0.e, l2);
            S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            P(sk2Var, mu0.h);
            S(sk2Var, mu0.d, e0);
            et0Var.i(mr0.a, sk2Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            sk2Var.p(true);
            zy3Var = wy3Var;
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new wl(zy3Var, et0Var, i2, 5);
        }
    }

    public static final void m(tu0 tu0Var, int i2) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-522994299);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            d50.a(dk7.i(o76.d(o76.c(wy3.a, 1.0f), 1.0f), mj2.C(sk2Var).f, iq2.g), sk2Var, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new gu5(i2, 23);
        }
    }

    public static final void n(String str, zy3 zy3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var;
        wy3 wy3Var;
        int i4;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(1760152437);
        if ((i2 & 6) == 0) {
            if (sk2Var2.f(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i5 & 1, z)) {
            jd7 C = mj2.C(sk2Var2);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long j2 = C.i;
            ml2 ml2Var = td7.c;
            long B = hi2.B(10);
            sk2Var = sk2Var2;
            pe2 pe2Var = pe2.c0;
            long A = hi2.A(0.8d);
            wy3 wy3Var2 = wy3.a;
            ir6.b(upperCase, b53.b0(wy3Var2, 2.0f, 20.0f, RecyclerView.A1, 9.0f, 4), j2, B, pe2Var, ml2Var, A, null, 0L, 0, false, 0, 0, null, null, sk2Var, 14355456, 0, 130832);
            wy3Var = wy3Var2;
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
            wy3Var = zy3Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(i2, 14, str, wy3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(boolean r19, defpackage.mi2 r20, defpackage.zy3 r21, boolean r22, defpackage.tu0 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo2.o(boolean, mi2, zy3, boolean, tu0, int, int):void");
    }

    public static final ArrayList p(int i2, int i3, int i4) {
        int i5;
        int i6 = i2 - ((i3 - 1) * i4);
        int i7 = i6 / i3;
        int i8 = i6 % i3;
        ArrayList arrayList = new ArrayList(i3);
        for (int i9 = 0; i9 < i3; i9++) {
            if (i9 < i8) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            arrayList.add(Integer.valueOf(i5 + i7));
        }
        return arrayList;
    }

    public static final void q(d24 d24Var, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f2 = d24Var.f(obj);
        if (f2 < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = d24Var.c[f2];
        }
        if (obj3 != null) {
            if (obj3 instanceof e24) {
                ((e24) obj3).a(obj2);
            } else if (obj3 != obj2) {
                e24 e24Var = new e24();
                e24Var.a(obj3);
                e24Var.a(obj2);
                obj2 = e24Var;
            }
            obj2 = obj3;
        }
        if (z) {
            int i2 = ~f2;
            d24Var.b[i2] = obj;
            d24Var.c[i2] = obj2;
            return;
        }
        d24Var.c[f2] = obj2;
    }

    public static void r(z86 z86Var, List list, iv0 iv0Var) {
        Object obj;
        m55 m55Var;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int c2 = z86Var.c((mk2) list.get(i2));
                int N = z86Var.N(z86Var.b, z86Var.r(c2));
                if (N < z86Var.g(z86Var.b, z86Var.r(c2 + 1))) {
                    obj = z86Var.c[z86Var.h(N)];
                } else {
                    obj = su0.a;
                }
                if (obj instanceof m55) {
                    m55Var = (m55) obj;
                } else {
                    m55Var = null;
                }
                if (m55Var != null) {
                    m55Var.a = iv0Var;
                }
            }
        }
    }

    public static void s(ro roVar, String str) {
        if ("�".length() <= 0) {
            pz2.a("alternateText can't be an empty string.");
        }
        qo qoVar = new qo(new vg6(str), roVar.A.length(), 0, 4);
        ArrayList arrayList = roVar.B;
        arrayList.add(qoVar);
        roVar.L.add(qoVar);
        arrayList.size();
        roVar.b("�");
        roVar.c();
    }

    public static final j06 t(String str, ep2 ep2Var, h06[] h06VarArr, mi2 mi2Var) {
        if (!zg6.B0(str)) {
            if (!ep2Var.equals(kh6.h)) {
                ro0 ro0Var = new ro0(str);
                mi2Var.n(ro0Var);
                return new j06(str, ep2Var, ro0Var.c.size(), nu.F0(h06VarArr), ro0Var);
            }
            i.i("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        i.i("Blank serial names are prohibited");
        return null;
    }

    public static j06 u(String str, ep2 ep2Var, h06[] h06VarArr) {
        if (!zg6.B0(str)) {
            if (!ep2Var.equals(kh6.h)) {
                ro0 ro0Var = new ro0(str);
                return new j06(str, ep2Var, ro0Var.c.size(), nu.F0(h06VarArr), ro0Var);
            }
            i.i("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        i.i("Blank serial names are prohibited");
        return null;
    }

    public static final void v(mi2 mi2Var, Object obj, e31 e31Var) {
        hg w = w(mi2Var, obj, null);
        if (w != null) {
            w81.t(e31Var, w);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.RuntimeException, hg] */
    public static final hg w(mi2 mi2Var, Object obj, hg hgVar) {
        try {
            mi2Var.n(obj);
            return hgVar;
        } catch (Throwable th) {
            if (hgVar != null && hgVar.getCause() != th) {
                pu.k(hgVar, th);
                return hgVar;
            }
            return new RuntimeException("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static d24 y() {
        long[] jArr = wu5.a;
        return new d24();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent z(android.content.Context r14, defpackage.ka r15) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo2.z(android.content.Context, ka):android.content.Intent");
    }

    public abstract void x();
}
