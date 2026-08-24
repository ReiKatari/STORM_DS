package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hi2  reason: default package */
/* loaded from: classes.dex */
public abstract class hi2 {
    public static e33 a;
    public static e33 b;
    public static e33 c;
    public static e33 d;
    public static Field e;
    public static boolean f;
    public static Class g;
    public static boolean h;
    public static Field i;
    public static boolean j;
    public static Field k;
    public static boolean l;
    public static e33 m;
    public static final /* synthetic */ int n = 0;

    public static final e33 A() {
        e33 e33Var = a;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Folder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(10.0f, 4.0f);
        ww2Var.k(4.0f);
        ww2Var.i(-1.1f, RecyclerView.B1, -1.99f, 0.9f, -1.99f, 2.0f);
        ww2Var.m(2.0f, 18.0f);
        ww2Var.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.l(16.0f);
        ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.t(8.0f);
        ww2Var.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ww2Var.l(-8.0f);
        ww2Var.n(-2.0f, -2.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        a = b2;
        return b2;
    }

    public static final e33 B() {
        e33 e33Var = b;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.GetApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(19.0f, 9.0f);
        ww2Var.l(-4.0f);
        ww2Var.t(3.0f);
        ww2Var.k(9.0f);
        ww2Var.u(6.0f);
        ww2Var.k(5.0f);
        ww2Var.n(7.0f, 7.0f);
        ww2Var.n(7.0f, -7.0f);
        ww2Var.g();
        ww2Var.o(5.0f, 18.0f);
        ww2Var.u(2.0f);
        ww2Var.l(14.0f);
        ww2Var.u(-2.0f);
        ww2Var.k(5.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        b = b2;
        return b2;
    }

    public static final int C(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final long D(double d2) {
        return J((float) d2, 4294967296L);
    }

    public static final long E(int i2) {
        return J(i2, 4294967296L);
    }

    public static final void F(u0 u0Var, String str) {
        u0Var.p("Trailing comma before the end of JSON ".concat(str), u0Var.B - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static int G(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        e41.i(lb1.j("PROTOCOL_ERROR padding ", i4, i2, " > remaining length "));
        return 0;
    }

    public static final CharSequence H(int i2, CharSequence charSequence) {
        String str;
        int length;
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i2 == -1) {
                if (charSequence.length() - 60 > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                if (i3 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i4 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder s = lb1.s(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length2 = charSequence.length();
                if (i4 > length2) {
                    i4 = length2;
                }
                s.append(charSequence.subSequence(i3, i4).toString());
                s.append(str2);
                return s.toString();
            }
        }
        return charSequence;
    }

    public static final String I(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        String str2 = ". ";
        if (str != null) {
            str2 = lb1.A(" with key ", str, ". ");
        }
        return i61.n(sb, str2, "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final long J(float f2, long j2) {
        long floatToRawIntBits = j2 | (Float.floatToRawIntBits(f2) & 4294967295L);
        y47[] y47VarArr = x47.b;
        return floatToRawIntBits;
    }

    public static final float K(long j2, float f2, qh1 qh1Var) {
        float c2;
        long b2 = x47.b(j2);
        if (y47.a(b2, 4294967296L)) {
            if (qh1Var.Y() > 1.05d) {
                c2 = x47.c(j2) / x47.c(qh1Var.M(f2));
            } else {
                return qh1Var.y0(j2);
            }
        } else if (y47.a(b2, 8589934592L)) {
            c2 = x47.c(j2);
        } else {
            return Float.NaN;
        }
        return c2 * f2;
    }

    public static final Object L(eo2 eo2Var) {
        Thread.interrupted();
        return hv.V(vt1.A, new xy5(eo2Var, null));
    }

    public static final void M(Spannable spannable, long j2, int i2, int i3) {
        if (j2 != 16) {
            spannable.setSpan(new ForegroundColorSpan(hv.b0(j2)), i2, i3, 33);
        }
    }

    public static final void N(Spannable spannable, long j2, qh1 qh1Var, int i2, int i3) {
        long b2 = x47.b(j2);
        if (y47.a(b2, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(u24.E(qh1Var.y0(j2)), false), i2, i3, 33);
        } else if (y47.a(b2, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(x47.c(j2)), i2, i3, 33);
        }
    }

    public static final void O(Spannable spannable, gy3 gy3Var, int i2, int i3) {
        if (gy3Var != null) {
            ArrayList arrayList = new ArrayList(ht0.v0(gy3Var, 10));
            for (fy3 fy3Var : gy3Var.A) {
                arrayList.add(fy3Var.a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i2, i3, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b67, java.lang.Object] */
    public static final a83 P(InputStream inputStream) {
        inputStream.getClass();
        return new a83(inputStream, new Object());
    }

    public static final l53 a(gg3 gg3Var, String str) {
        return new l53(str, new m53(gg3Var));
    }

    public static final le3 b(wb6 wb6Var) {
        String str = "Value of type '" + wb6Var.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + wb6Var.e() + '\'';
        wb6Var.a();
        return new le3(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
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
    */
    public static final void c(iu2 iu2Var, a74 a74Var, ip3 ip3Var, lq4 lq4Var, iu iuVar, fu fuVar, sd2 sd2Var, boolean z, sg sgVar, qn2 qn2Var, px0 px0Var, int i2, int i3) {
        int i4;
        ip3 ip3Var2;
        int i5;
        int i6;
        lq4 lq4Var2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        xq2 xq2Var;
        boolean z3;
        sg sgVar2;
        ip3 ip3Var3;
        lq4 lq4Var3;
        sd2 sd2Var2;
        cf5 t;
        ip3 ip3Var4;
        lq4 lq4Var4;
        int i10;
        ip3 ip3Var5;
        wd1 wd1Var;
        sg a2;
        boolean z4;
        boolean z5;
        lq4 lq4Var5;
        fu fuVar2;
        int i11;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-2072102870);
        if (xq2Var2.f(iu2Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i12 = i4 | i2;
        if ((i2 & 48) == 0) {
            if (xq2Var2.f(a74Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i12 |= i11;
        }
        if ((i3 & 4) == 0) {
            ip3Var2 = ip3Var;
            if (xq2Var2.f(ip3Var2)) {
                i5 = 256;
                int i13 = i12 | i5;
                i6 = i3 & 8;
                if (i6 == 0) {
                    i13 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    lq4Var2 = lq4Var;
                    if (xq2Var2.f(lq4Var2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i13 |= i7;
                    i8 = i13 | 373317632;
                    if (xq2Var2.h(qn2Var)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    boolean z6 = true;
                    if ((306783379 & i8) != 306783378 && (i9 & 3) == 2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (xq2Var2.S(i8 & 1, z2)) {
                        xq2Var2.X();
                        int i14 = i2 & 1;
                        Object obj = ox0.a;
                        if (i14 != 0 && !xq2Var2.B()) {
                            xq2Var2.V();
                            if ((i3 & 4) != 0) {
                                i8 &= -897;
                            }
                            i10 = i8 & (-1908408321);
                            wd1Var = sd2Var;
                            z4 = z;
                            a2 = sgVar;
                            ip3Var5 = ip3Var2;
                            z5 = false;
                            lq4Var5 = lq4Var2;
                        } else {
                            if ((i3 & 4) != 0) {
                                ip3Var4 = kp3.a(xq2Var2);
                                i8 &= -897;
                            } else {
                                ip3Var4 = ip3Var2;
                            }
                            if (i6 != 0) {
                                lq4Var4 = new pq4(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
                            } else {
                                lq4Var4 = lq4Var2;
                            }
                            oc1 a3 = eo6.a(xq2Var2);
                            boolean f2 = xq2Var2.f(a3);
                            Object P = xq2Var2.P();
                            if (f2 || P == obj) {
                                P = new wd1(a3);
                                xq2Var2.l0(P);
                            }
                            i10 = i8 & (-1908408321);
                            ip3Var5 = ip3Var4;
                            wd1Var = (wd1) P;
                            a2 = xp4.a(xq2Var2);
                            z4 = true;
                            z5 = false;
                            lq4Var5 = lq4Var4;
                        }
                        xq2Var2.q();
                        int i15 = (i10 & 14) | 48;
                        if ((((i15 & 14) ^ 6) <= 4 || !xq2Var2.f(iu2Var)) && (i15 & 6) != 4) {
                            z6 = z5;
                        }
                        Object P2 = xq2Var2.P();
                        if (!z6 && P2 != obj) {
                            fuVar2 = fuVar;
                        } else {
                            fuVar2 = fuVar;
                            P2 = new lu2(new ql1(19, iu2Var, fuVar2));
                            xq2Var2.l0(P2);
                        }
                        int i16 = i10 >> 3;
                        xq2Var = xq2Var2;
                        fu fuVar3 = fuVar2;
                        ii2.i(a74Var, ip3Var5, (lu2) P2, lq4Var5, wd1Var, z4, a2, iuVar, fuVar3, qn2Var, xq2Var, (i10 & 7168) | (i16 & 112) | (i16 & 14) | 196608 | 817913856, 6 | ((i9 << 3) & 112));
                        ip3Var3 = ip3Var5;
                        lq4Var3 = lq4Var5;
                        sd2Var2 = wd1Var;
                        z3 = z4;
                        sgVar2 = a2;
                    } else {
                        xq2Var = xq2Var2;
                        xq2Var.V();
                        z3 = z;
                        sgVar2 = sgVar;
                        ip3Var3 = ip3Var2;
                        lq4Var3 = lq4Var2;
                        sd2Var2 = sd2Var;
                    }
                    t = xq2Var.t();
                    if (t != null) {
                        t.d = new lo3(iu2Var, a74Var, ip3Var3, lq4Var3, iuVar, fuVar, sd2Var2, z3, sgVar2, qn2Var, i2, i3);
                        return;
                    }
                    return;
                }
                lq4Var2 = lq4Var;
                i8 = i13 | 373317632;
                if (xq2Var2.h(qn2Var)) {
                }
                boolean z62 = true;
                if ((306783379 & i8) != 306783378) {
                }
                z2 = true;
                if (xq2Var2.S(i8 & 1, z2)) {
                }
                t = xq2Var.t();
                if (t != null) {
                }
            }
        } else {
            ip3Var2 = ip3Var;
        }
        i5 = 128;
        int i132 = i12 | i5;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        lq4Var2 = lq4Var;
        i8 = i132 | 373317632;
        if (xq2Var2.h(qn2Var)) {
        }
        boolean z622 = true;
        if ((306783379 & i8) != 306783378) {
        }
        z2 = true;
        if (xq2Var2.S(i8 & 1, z2)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    public static final void d(p3 p3Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        long j2;
        n3 n3Var = p3Var.e;
        ta5 ta5Var = p3Var.b;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1577380411);
        if (xq2Var.h(p3Var)) {
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
        if (xq2Var.S(i4 & 1, z)) {
            String O = yh2.O(xq2Var, ii2.D(ta5Var.e));
            String str = p3Var.d;
            if (qs6.v0(str)) {
                str = "--";
            }
            String N = yh2.N(R.string.leaderboard_attempt_value, new Object[]{O, str}, xq2Var);
            Long valueOf = Long.valueOf(ta5Var.a);
            boolean h2 = xq2Var.h(p3Var);
            Object P = xq2Var.P();
            if (h2 || P == ox0.a) {
                P = new a6(p3Var, null, 29);
                xq2Var.l0(P);
            }
            mb3.j(valueOf, n3Var, (eo2) P, xq2Var);
            a74 O2 = ge7.O(x64.a, 8.0f);
            URL url = p3Var.c;
            bt btVar = p3Var.f;
            if (n3Var == n3.SUCCESS) {
                j2 = cc5.a;
            } else {
                j2 = cc5.b;
            }
            f04.a(O2, url, btVar, new kt0(j2), n16.I(-92076065, new l4(5, p3Var, N), xq2Var), xq2Var, 24582, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(p3Var, i2, 14);
        }
    }

    public static final void e(a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        a74Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-2353038);
        if (xq2Var.f(a74Var)) {
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
        if (xq2Var.S(i4 & 1, z)) {
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            e45.a(vs0.Y.n(x64.a, d90.Z), 0L, RecyclerView.B1, 0L, 0, xq2Var, 0, 30);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new v00(a74Var, i2, 2);
        }
    }

    public static final void f(ut0 ut0Var, xe7 xe7Var, ye6 ye6Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var;
        ye6 ye6Var2;
        ye6 ye6Var3;
        vs4 vs4Var;
        float f2;
        float f3;
        xq2 xq2Var2;
        vs4 vs4Var2 = ut0Var.l;
        vs4 vs4Var3 = ut0Var.d;
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(53836214);
        if (xq2Var3.f(ut0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (xq2Var3.f(xe7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 128;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var3.S(i6 & 1, z)) {
            xq2Var3.X();
            if ((i2 & 1) != 0 && !xq2Var3.B()) {
                xq2Var3.V();
                ye6Var3 = ye6Var;
            } else {
                ye6Var3 = (ye6) xq2Var3.j(ze6.a);
            }
            xq2Var3.q();
            Object P = xq2Var3.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                vs4Var = vs4Var2;
                ut0 ut0Var2 = new ut0(ut0Var.g(), ut0Var.h(), ut0Var.i(), ((kt0) vs4Var3.getValue()).a, ut0Var.a(), ut0Var.j(), ut0Var.b(), ut0Var.d(), ut0Var.e(), ut0Var.c(), ut0Var.f(), ((kt0) vs4Var2.getValue()).a, ut0Var.k());
                xq2Var3.l0(ut0Var2);
                P = ut0Var2;
            } else {
                vs4Var = vs4Var2;
            }
            ut0 ut0Var3 = (ut0) P;
            nq6 nq6Var = vt0.a;
            ut0Var3.a.setValue(new kt0(ut0Var.g()));
            ut0Var3.b.setValue(new kt0(ut0Var.h()));
            ut0Var3.c.setValue(new kt0(ut0Var.i()));
            ut0Var3.d.setValue(new kt0(((kt0) vs4Var3.getValue()).a));
            ut0Var3.e.setValue(new kt0(ut0Var.a()));
            ut0Var3.f.setValue(new kt0(ut0Var.j()));
            ut0Var3.g.setValue(new kt0(ut0Var.b()));
            ut0Var3.h.setValue(new kt0(ut0Var.d()));
            ut0Var3.i.setValue(new kt0(ut0Var.e()));
            ut0Var3.j.setValue(new kt0(ut0Var.c()));
            ut0Var3.k.setValue(new kt0(ut0Var.f()));
            ut0Var3.l.setValue(new kt0(((kt0) vs4Var.getValue()).a));
            ut0Var3.m.setValue(Boolean.valueOf(ut0Var.k()));
            kq5 a2 = jq5.a(7, 0L, false);
            long g2 = ut0Var3.g();
            long a3 = ut0Var3.a();
            xq2Var3.b0(-2060762245);
            long a4 = vt0.a(ut0Var3, a3);
            if (a4 == 16) {
                a4 = ((kt0) xq2Var3.j(j31.a)).a;
            }
            xq2Var3.p(false);
            long j2 = ((kt0) xq2Var3.j(j31.a)).a;
            if (!((ut0) xq2Var3.j(vt0.a)).k() ? hv.N(j2) < 0.5d : hv.N(j2) > 0.5d) {
                f2 = 0.74f;
            } else {
                f2 = 0.6f;
            }
            long c2 = kt0.c(f2, a4);
            boolean e2 = xq2Var3.e(g2) | xq2Var3.e(a3) | xq2Var3.e(c2);
            Object P2 = xq2Var3.P();
            float f4 = 1.0f;
            if (!e2 && P2 != vs0Var) {
                xq2Var = xq2Var3;
            } else {
                long g3 = ut0Var3.g();
                float l2 = yh2.l(g2, 0.4f, c2, a3);
                float l3 = yh2.l(g2, 0.2f, c2, a3);
                if (l2 >= 4.5f) {
                    xq2Var2 = xq2Var3;
                    f3 = 0.4f;
                } else {
                    int i7 = (l3 > 4.5f ? 1 : (l3 == 4.5f ? 0 : -1));
                    f3 = 0.2f;
                    if (i7 < 0) {
                        xq2Var2 = xq2Var3;
                    } else {
                        xq2Var2 = xq2Var3;
                        float f5 = 0.4f;
                        float f6 = 0.2f;
                        f3 = 0.4f;
                        for (int i8 = 0; i8 < 7; i8++) {
                            float l4 = (yh2.l(g2, f3, c2, a3) / 4.5f) - 1.0f;
                            if (RecyclerView.B1 <= l4 && l4 <= 0.01f) {
                                break;
                            }
                            if (l4 < RecyclerView.B1) {
                                f5 = f3;
                            } else {
                                f6 = f3;
                            }
                            f3 = (f5 + f6) / 2.0f;
                        }
                    }
                }
                P2 = new m47(g3, kt0.c(f3, g2));
                xq2Var = xq2Var2;
                xq2Var.l0(P2);
            }
            m47 m47Var = (m47) P2;
            nq6 nq6Var2 = vt0.a;
            pq a5 = nq6Var2.a(ut0Var3);
            py0 py0Var = g31.a;
            long j3 = ((kt0) xq2Var.j(j31.a)).a;
            if (!((ut0) xq2Var.j(nq6Var2)).k() ? hv.N(j3) >= 0.5d : hv.N(j3) <= 0.5d) {
                f4 = 0.87f;
            }
            hv.e(new pq[]{a5, py0Var.a(Float.valueOf(f4)), k43.a.a(a2), ze6.a.a(ye6Var3), n47.a.a(m47Var), ye7.b.a(xe7Var)}, n16.I(496803446, new ql1(23, xe7Var, zv0Var), xq2Var), xq2Var, 56);
            ye6Var2 = ye6Var3;
        } else {
            xq2Var = xq2Var3;
            xq2Var.V();
            ye6Var2 = ye6Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new p4(ut0Var, xe7Var, ye6Var2, zv0Var, i2, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x047e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final rc4 rc4Var, final mc4 mc4Var, final a74 a74Var, final ic icVar, final qn2 qn2Var, final qn2 qn2Var2, final qn2 qn2Var3, final qn2 qn2Var4, px0 px0Var, final int i2) {
        rd4 rd4Var;
        xq2 xq2Var;
        int i3;
        hu3 hu3Var;
        uw0 uw0Var;
        qa4 qa4Var;
        boolean z;
        uw0 uw0Var2;
        xq2 xq2Var2;
        rd4 rd4Var2;
        rd4 rd4Var3;
        final uw0 uw0Var3;
        x94 x94Var;
        sb4 sb4Var;
        boolean z2;
        qn2 qn2Var5;
        ga7 ga7Var;
        n96 n96Var;
        pp6 pp6Var;
        x94 x94Var2;
        uw0 uw0Var4;
        Object obj;
        n96 n96Var2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        ArrayList arrayList;
        int length;
        int i4;
        String str;
        ic4 l2;
        mc4 mc4Var2;
        int i5;
        Bundle bundle;
        int i6;
        ic4 l3;
        mc4 mc4Var3;
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(-1964664536);
        int i7 = (i2 & 6) == 0 ? (xq2Var3.h(rc4Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i7 |= xq2Var3.h(mc4Var) ? 32 : 16;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i7 |= xq2Var3.f(a74Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i7 |= xq2Var3.f(icVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= xq2Var3.h(qn2Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i7 |= xq2Var3.h(qn2Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i7 |= xq2Var3.h(qn2Var3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i7 |= xq2Var3.h(qn2Var4) ? 8388608 : Compress.MAXWINSIZE;
        }
        if ((i2 & 100663296) == 0) {
            i7 |= xq2Var3.h(null) ? 67108864 : 33554432;
        }
        int i8 = i7;
        if ((38347923 & i8) == 38347922 && xq2Var3.E()) {
            xq2Var3.V();
            xq2Var2 = xq2Var3;
        } else {
            xq2Var3.X();
            if ((i2 & 1) != 0 && !xq2Var3.B()) {
                xq2Var3.V();
            }
            xq2Var3.q();
            hu3 hu3Var2 = (hu3) xq2Var3.j(zx3.a);
            bp7 a2 = ey3.a(xq2Var3);
            if (a2 != null) {
                ap7 viewModelStore = a2.getViewModelStore();
                rc4Var.getClass();
                zb4 zb4Var = rc4Var.b;
                viewModelStore.getClass();
                zb4Var.getClass();
                rd4 rd4Var4 = zb4Var.s;
                if (!nb3.k(zb4Var.o, qo2.B(viewModelStore))) {
                    if (zb4Var.f.isEmpty()) {
                        zb4Var.o = qo2.B(viewModelStore);
                    } else {
                        i.m("ViewModelStore should be set before setGraph call");
                        return;
                    }
                }
                mc4Var.getClass();
                LinkedHashMap linkedHashMap = zb4Var.t;
                dk0 dk0Var = mc4Var.Y;
                pu puVar = zb4Var.f;
                if (!puVar.isEmpty() && zb4Var.h() == tt3.DESTROYED) {
                    i.m("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                    return;
                }
                boolean z3 = false;
                if (!nb3.k(zb4Var.c, mc4Var)) {
                    mc4 mc4Var4 = zb4Var.c;
                    if (mc4Var4 != null) {
                        ArrayList arrayList2 = new ArrayList(zb4Var.l.keySet());
                        int size = arrayList2.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj2 = arrayList2.get(i9);
                            int i10 = i9 + 1;
                            Integer num = (Integer) obj2;
                            num.getClass();
                            ArrayList arrayList3 = arrayList2;
                            int intValue = num.intValue();
                            for (vb4 vb4Var : linkedHashMap.values()) {
                                vb4Var.d = true;
                                i10 = i10;
                            }
                            int i11 = i10;
                            boolean p = zb4Var.p(intValue, null, new ad4(z3, true, -1, z3, z3, -1, -1));
                            for (Iterator it = linkedHashMap.values().iterator(); it.hasNext(); it = it) {
                                ((vb4) it.next()).d = false;
                                p = p;
                            }
                            if (p) {
                                zb4Var.l(intValue, true, false);
                            }
                            arrayList2 = arrayList3;
                            i9 = i11;
                            z3 = false;
                        }
                        zb4Var.l(mc4Var4.B.a, true, false);
                    }
                    zb4Var.c = mc4Var;
                    rd4 rd4Var5 = zb4Var.s;
                    rc4 rc4Var2 = zb4Var.a;
                    rh rhVar = rc4Var2.c;
                    Bundle bundle2 = zb4Var.d;
                    if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                        if (stringArrayList != null) {
                            int size2 = stringArrayList.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                String str2 = stringArrayList.get(i12);
                                i12++;
                                ArrayList<String> arrayList4 = stringArrayList;
                                String str3 = str2;
                                rd4Var5.b(str3);
                                if (bundle2.containsKey(str3)) {
                                    uj2.N(bundle2, str3);
                                }
                                stringArrayList = arrayList4;
                            }
                        } else {
                            xk2.B("android-support-nav:controller:navigatorState:names");
                            throw null;
                        }
                    }
                    Bundle[] bundleArr = zb4Var.e;
                    if (bundleArr != null) {
                        int length2 = bundleArr.length;
                        int i13 = 0;
                        while (i13 < length2) {
                            Bundle[] bundleArr2 = bundleArr;
                            Bundle bundle3 = bundleArr2[i13];
                            bundle3.getClass();
                            int i14 = length2;
                            bundle3.setClassLoader(ub4.class.getClassLoader());
                            String P = uj2.P(bundle3, "nav-entry-state:id");
                            int I = uj2.I(bundle3, "nav-entry-state:destination-id");
                            int i15 = i13;
                            Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                            if (bundle4 != null) {
                                Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                                if (bundle5 != null) {
                                    ic4 c2 = zb4Var.c(I, null);
                                    if (c2 != null) {
                                        tt3 h2 = zb4Var.h();
                                        ac4 ac4Var = zb4Var.o;
                                        rhVar.getClass();
                                        h2.getClass();
                                        Context context = rhVar.a;
                                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                                        sb4 sb4Var2 = new sb4(rhVar, c2, bundle4, h2, ac4Var, P, bundle5);
                                        qd4 b2 = rd4Var5.b(c2.A);
                                        Object obj3 = linkedHashMap.get(b2);
                                        if (obj3 == null) {
                                            obj3 = new vb4(rc4Var2, b2);
                                            linkedHashMap.put(b2, obj3);
                                        }
                                        puVar.addLast(sb4Var2);
                                        ((vb4) obj3).a(sb4Var2);
                                        mc4 mc4Var5 = sb4Var2.B.L;
                                        if (mc4Var5 != null) {
                                            zb4Var.j(sb4Var2, zb4Var.e(mc4Var5.B.a));
                                        }
                                        i13 = i15 + 1;
                                        bundleArr = bundleArr2;
                                        length2 = i14;
                                    } else {
                                        int i16 = ic4.X;
                                        u34.r(i61.t("Restoring the Navigation back stack failed: destination ", mp2.C(rhVar, I), " cannot be found from the current destination "), zb4Var.f());
                                        return;
                                    }
                                } else {
                                    xk2.B("nav-entry-state:saved-state");
                                    throw null;
                                }
                            } else {
                                xk2.B("nav-entry-state:args");
                                throw null;
                            }
                        }
                        zb4Var.b.c();
                        zb4Var.e = null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : c14.s0(rd4Var5.a).values()) {
                        if (!((qd4) obj4).b) {
                            arrayList5.add(obj4);
                        }
                    }
                    int size3 = arrayList5.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj5 = arrayList5.get(i17);
                        i17++;
                        qd4 qd4Var = (qd4) obj5;
                        Object obj6 = linkedHashMap.get(qd4Var);
                        if (obj6 == null) {
                            qd4Var.getClass();
                            obj6 = new vb4(rc4Var2, qd4Var);
                            linkedHashMap.put(qd4Var, obj6);
                        }
                        qd4Var.getClass();
                        qd4Var.a = (vb4) obj6;
                        qd4Var.b = true;
                    }
                    if (zb4Var.c != null && puVar.isEmpty()) {
                        Activity activity = rc4Var2.d;
                        if (!rc4Var2.e && activity != null) {
                            Intent intent = activity.getIntent();
                            zb4 zb4Var2 = rc4Var2.b;
                            if (intent != null) {
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    try {
                                        iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                    } catch (Exception e2) {
                                        i3 = i8;
                                        Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                                        iArr = null;
                                    }
                                } else {
                                    iArr = null;
                                }
                                i3 = i8;
                                ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                                Bundle l4 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                                Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                                if (bundle6 != null) {
                                    l4.putAll(bundle6);
                                }
                                if (iArr == null || iArr.length == 0) {
                                    mc4 i18 = zb4Var2.i();
                                    iArr2 = iArr;
                                    hu3Var = hu3Var2;
                                    xq2Var = xq2Var3;
                                    rd4Var = rd4Var4;
                                    hc4 f2 = i18.f(new m44(intent.getData(), intent.getAction(), intent.getType(), 3), i18);
                                    if (f2 != null) {
                                        ic4 ic4Var = f2.A;
                                        int[] b3 = ic4Var.b(null);
                                        Bundle a3 = ic4Var.a(f2.B);
                                        if (a3 != null) {
                                            l4.putAll(a3);
                                        }
                                        iArr3 = b3;
                                        arrayList = null;
                                        if (iArr3 != null && iArr3.length != 0) {
                                            zb4Var2.getClass();
                                            mc4 mc4Var6 = zb4Var2.c;
                                            length = iArr3.length;
                                            i4 = 0;
                                            while (true) {
                                                if (i4 < length) {
                                                    str = null;
                                                    break;
                                                }
                                                int i19 = iArr3[i4];
                                                if (i4 == 0) {
                                                    i6 = length;
                                                    mc4 mc4Var7 = zb4Var2.c;
                                                    mc4Var7.getClass();
                                                    l3 = mc4Var7.B.a == i19 ? zb4Var2.c : null;
                                                } else {
                                                    i6 = length;
                                                    mc4Var6.getClass();
                                                    l3 = mc4Var6.Y.l(i19);
                                                }
                                                if (l3 == null) {
                                                    int i20 = ic4.X;
                                                    str = mp2.C(zb4Var2.a.c, i19);
                                                    break;
                                                }
                                                if (i4 != iArr3.length - 1 && (l3 instanceof mc4)) {
                                                    while (true) {
                                                        mc4Var3 = (mc4) l3;
                                                        mc4Var3.getClass();
                                                        dk0 dk0Var2 = mc4Var3.Y;
                                                        if (!(dk0Var2.l(dk0Var2.L) instanceof mc4)) {
                                                            break;
                                                        }
                                                        l3 = dk0Var2.l(dk0Var2.L);
                                                    }
                                                    mc4Var6 = mc4Var3;
                                                }
                                                i4++;
                                                length = i6;
                                            }
                                            if (str == null) {
                                                Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                            } else {
                                                l4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                                int length3 = iArr3.length;
                                                Bundle[] bundleArr3 = new Bundle[length3];
                                                for (int i21 = 0; i21 < length3; i21++) {
                                                    Bundle l5 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                                                    l5.putAll(l4);
                                                    if (arrayList != null && (bundle = (Bundle) arrayList.get(i21)) != null) {
                                                        l5.putAll(bundle);
                                                    }
                                                    bundleArr3[i21] = l5;
                                                }
                                                int flags = intent.getFlags();
                                                int i22 = 268435456 & flags;
                                                if (i22 != 0 && (flags & 32768) == 0) {
                                                    intent.addFlags(32768);
                                                    rz6 rz6Var = new rz6(rc4Var2.a);
                                                    ComponentName component = intent.getComponent();
                                                    if (component == null) {
                                                        component = intent.resolveActivity(rz6Var.B.getPackageManager());
                                                    }
                                                    if (component != null) {
                                                        rz6Var.a(component);
                                                    }
                                                    rz6Var.A.add(intent);
                                                    rz6Var.b();
                                                    activity.finish();
                                                    activity.overridePendingTransition(0, 0);
                                                } else if (i22 != 0) {
                                                    if (zb4Var2.f.isEmpty()) {
                                                        i5 = 0;
                                                    } else {
                                                        mc4 mc4Var8 = zb4Var2.c;
                                                        mc4Var8.getClass();
                                                        i5 = 0;
                                                        zb4Var2.l(mc4Var8.B.a, true, false);
                                                    }
                                                    while (i5 < iArr3.length) {
                                                        int i23 = iArr3[i5];
                                                        int i24 = i5 + 1;
                                                        Bundle bundle7 = bundleArr3[i5];
                                                        ic4 c3 = zb4Var2.c(i23, null);
                                                        if (c3 != null) {
                                                            bi2 bi2Var = new bi2(25, c3, rc4Var2);
                                                            bd4 bd4Var = new bd4();
                                                            bi2Var.g(bd4Var);
                                                            int i25 = bd4Var.b;
                                                            boolean z4 = bd4Var.c;
                                                            dy7 dy7Var = bd4Var.a;
                                                            zb4Var2.k(c3, bundle7, new ad4(false, false, i25, false, z4, dy7Var.a, dy7Var.b));
                                                            i5 = i24;
                                                        } else {
                                                            int i26 = ic4.X;
                                                            u34.r(i61.t("Deep Linking failed: destination ", mp2.C(rhVar, i23), " cannot be found from the current destination "), zb4Var2.f());
                                                            return;
                                                        }
                                                    }
                                                    rc4Var2.e = true;
                                                } else {
                                                    mc4 mc4Var9 = zb4Var2.c;
                                                    int length4 = iArr3.length;
                                                    for (int i27 = 0; i27 < length4; i27++) {
                                                        int i28 = iArr3[i27];
                                                        Bundle bundle8 = bundleArr3[i27];
                                                        if (i27 == 0) {
                                                            l2 = zb4Var2.c;
                                                        } else {
                                                            mc4Var9.getClass();
                                                            l2 = mc4Var9.Y.l(i28);
                                                        }
                                                        if (l2 != null) {
                                                            if (i27 != iArr3.length - 1) {
                                                                if (l2 instanceof mc4) {
                                                                    while (true) {
                                                                        mc4Var2 = (mc4) l2;
                                                                        mc4Var2.getClass();
                                                                        dk0 dk0Var3 = mc4Var2.Y;
                                                                        if (!(dk0Var3.l(dk0Var3.L) instanceof mc4)) {
                                                                            break;
                                                                        }
                                                                        l2 = dk0Var3.l(dk0Var3.L);
                                                                    }
                                                                    mc4Var9 = mc4Var2;
                                                                }
                                                            } else {
                                                                mc4 mc4Var10 = zb4Var2.c;
                                                                mc4Var10.getClass();
                                                                zb4Var2.k(l2, bundle8, new ad4(false, false, mc4Var10.B.a, true, false, 0, 0));
                                                            }
                                                        } else {
                                                            int i29 = ic4.X;
                                                            throw new IllegalStateException("Deep Linking failed: destination " + mp2.C(rhVar, i28) + " cannot be found in graph " + mc4Var9);
                                                        }
                                                    }
                                                    rc4Var2.e = true;
                                                }
                                                uw0Var = null;
                                            }
                                        }
                                        mc4 mc4Var11 = zb4Var.c;
                                        mc4Var11.getClass();
                                        uw0Var = null;
                                        zb4Var.k(mc4Var11, null, null);
                                    }
                                } else {
                                    iArr2 = iArr;
                                    rd4Var = rd4Var4;
                                    xq2Var = xq2Var3;
                                    hu3Var = hu3Var2;
                                }
                                arrayList = parcelableArrayList;
                                iArr3 = iArr2;
                                if (iArr3 != null) {
                                    zb4Var2.getClass();
                                    mc4 mc4Var62 = zb4Var2.c;
                                    length = iArr3.length;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < length) {
                                        }
                                        i4++;
                                        length = i6;
                                    }
                                    if (str == null) {
                                    }
                                }
                                mc4 mc4Var112 = zb4Var.c;
                                mc4Var112.getClass();
                                uw0Var = null;
                                zb4Var.k(mc4Var112, null, null);
                            }
                        }
                        rd4Var = rd4Var4;
                        xq2Var = xq2Var3;
                        i3 = i8;
                        hu3Var = hu3Var2;
                        mc4 mc4Var1122 = zb4Var.c;
                        mc4Var1122.getClass();
                        uw0Var = null;
                        zb4Var.k(mc4Var1122, null, null);
                    } else {
                        rd4Var = rd4Var4;
                        xq2Var = xq2Var3;
                        i3 = i8;
                        hu3Var = hu3Var2;
                        uw0Var = null;
                        zb4Var.b();
                    }
                } else {
                    rd4Var = rd4Var4;
                    xq2Var = xq2Var3;
                    i3 = i8;
                    hu3Var = hu3Var2;
                    uw0Var = null;
                    int f3 = ((un6) dk0Var.X).f();
                    for (int i30 = 0; i30 < f3; i30++) {
                        ic4 ic4Var2 = (ic4) ((un6) dk0Var.X).g(i30);
                        mc4 mc4Var12 = zb4Var.c;
                        mc4Var12.getClass();
                        int d2 = ((un6) mc4Var12.Y.X).d(i30);
                        mc4 mc4Var13 = zb4Var.c;
                        mc4Var13.getClass();
                        un6 un6Var = (un6) mc4Var13.Y.X;
                        if (un6Var.A) {
                            vy7.I(un6Var);
                        }
                        int v = g04.v(un6Var.R, d2, un6Var.B);
                        if (v >= 0) {
                            Object[] objArr = un6Var.L;
                            Object obj7 = objArr[v];
                            objArr[v] = ic4Var2;
                        }
                    }
                    Iterator it2 = puVar.iterator();
                    while (it2.hasNext()) {
                        sb4 sb4Var3 = (sb4) it2.next();
                        int i31 = ic4.X;
                        l14 l14Var = new l14(sb6.c0(mp2.G(sb4Var3.B)));
                        ic4 ic4Var3 = zb4Var.c;
                        ic4Var3.getClass();
                        Iterator it3 = l14Var.iterator();
                        while (true) {
                            ListIterator listIterator = (ListIterator) ((qp5) it3).B;
                            if (listIterator.hasPrevious()) {
                                ic4 ic4Var4 = (ic4) listIterator.previous();
                                if (!nb3.k(ic4Var4, zb4Var.c) || !ic4Var3.equals(mc4Var)) {
                                    if (ic4Var3 instanceof mc4) {
                                        ic4Var3 = ((mc4) ic4Var3).Y.l(ic4Var4.B.a);
                                        ic4Var3.getClass();
                                    }
                                }
                            }
                        }
                        sb4Var3.B = ic4Var3;
                    }
                }
                rd4 rd4Var6 = rd4Var;
                qd4 b4 = rd4Var6.b("composable");
                uw0 uw0Var5 = b4 instanceof uw0 ? (uw0) b4 : uw0Var;
                if (uw0Var5 == null) {
                    cf5 t = xq2Var.t();
                    if (t != null) {
                        t.d = new eo2() { // from class: uc4
                            @Override // defpackage.eo2
                            public final Object o(Object obj8, Object obj9) {
                                int i32 = r10;
                                jg7 jg7Var = jg7.a;
                                int i33 = i2;
                                switch (i32) {
                                    case 0:
                                        ((Integer) obj9).getClass();
                                        int a0 = ii2.a0(i33 | 1);
                                        hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a0);
                                        return jg7Var;
                                    case 1:
                                        ((Integer) obj9).getClass();
                                        int a02 = ii2.a0(i33 | 1);
                                        hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a02);
                                        return jg7Var;
                                    default:
                                        ((Integer) obj9).getClass();
                                        int a03 = ii2.a0(i33 | 1);
                                        hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a03);
                                        return jg7Var;
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                xq2 xq2Var4 = xq2Var;
                qa4 C = np2.C(uw0Var5.b().e, xq2Var4);
                Object P2 = xq2Var4.P();
                vs0 vs0Var = ox0.a;
                if (P2 == vs0Var) {
                    P2 = new rs4(RecyclerView.B1);
                    xq2Var4.l0(P2);
                }
                rs4 rs4Var = (rs4) P2;
                Object P3 = xq2Var4.P();
                if (P3 == vs0Var) {
                    P3 = np2.Y(Boolean.FALSE);
                    xq2Var4.l0(P3);
                }
                final qa4 qa4Var2 = (qa4) P3;
                boolean z5 = ((List) C.getValue()).size() > 1;
                boolean f4 = xq2Var4.f(C) | xq2Var4.h(uw0Var5);
                Object P4 = xq2Var4.P();
                if (f4 || P4 == vs0Var) {
                    P4 = new ji(uw0Var5, C, rs4Var, qa4Var2, null, 9);
                    qa4Var = C;
                    xq2Var4.l0(P4);
                } else {
                    qa4Var = C;
                }
                ln2.e(z5, (eo2) P4, xq2Var4, 0);
                hu3 hu3Var3 = hu3Var;
                boolean h3 = xq2Var4.h(rc4Var) | xq2Var4.h(hu3Var3);
                Object P5 = xq2Var4.P();
                if (h3 || P5 == vs0Var) {
                    P5 = new bi2(27, rc4Var, hu3Var3);
                    xq2Var4.l0(P5);
                }
                mb3.d(hu3Var3, (qn2) P5, xq2Var4);
                p46 C2 = nj2.C(xq2Var4);
                qa4 C3 = np2.C(zb4Var.i, xq2Var4);
                Object P6 = xq2Var4.P();
                if (P6 == vs0Var) {
                    z = false;
                    P6 = np2.I(new vc4(C3, 0));
                    xq2Var4.l0(P6);
                } else {
                    z = false;
                }
                pp6 pp6Var2 = (pp6) P6;
                sb4 sb4Var4 = (sb4) gt0.R0((List) pp6Var2.getValue());
                Object P7 = xq2Var4.P();
                if (P7 == vs0Var) {
                    int i32 = sh4.a;
                    P7 = new x94(6);
                    xq2Var4.l0(P7);
                }
                x94 x94Var3 = (x94) P7;
                if (sb4Var4 != null) {
                    xq2Var4.b0(-1797563167);
                    boolean h4 = xq2Var4.h(uw0Var5) | (((((i3 & 3670016) ^ 1572864) <= 1048576 || !xq2Var4.f(qn2Var3)) && (i3 & 1572864) != 1048576) ? z : true) | ((i3 & 57344) == 16384 ? true : z);
                    Object P8 = xq2Var4.P();
                    if (h4 || P8 == vs0Var) {
                        rd4Var3 = rd4Var6;
                        uw0Var3 = uw0Var5;
                        x94Var = x94Var3;
                        sb4Var = sb4Var4;
                        z2 = true;
                        qn2 qn2Var6 = new qn2() { // from class: sc4
                            @Override // defpackage.qn2
                            public final Object g(Object obj8) {
                                int i33 = r5;
                                qa4 qa4Var3 = qa4Var2;
                                qn2 qn2Var7 = qn2Var;
                                qn2 qn2Var8 = qn2Var3;
                                uw0 uw0Var6 = uw0Var3;
                                yn ynVar = (yn) obj8;
                                switch (i33) {
                                    case 0:
                                        ic4 ic4Var5 = ((sb4) ynVar.a()).B;
                                        ic4Var5.getClass();
                                        tw0 tw0Var = (tw0) ic4Var5;
                                        if (!((Boolean) uw0Var6.c.getValue()).booleanValue() && !((Boolean) qa4Var3.getValue()).booleanValue()) {
                                            int i34 = ic4.X;
                                            for (ic4 ic4Var6 : mp2.G(tw0Var)) {
                                            }
                                            return (z72) qn2Var7.g(ynVar);
                                        }
                                        int i35 = ic4.X;
                                        for (ic4 ic4Var7 : mp2.G(tw0Var)) {
                                        }
                                        return (z72) qn2Var8.g(ynVar);
                                    default:
                                        ic4 ic4Var8 = ((sb4) ynVar.c()).B;
                                        ic4Var8.getClass();
                                        tw0 tw0Var2 = (tw0) ic4Var8;
                                        if (!((Boolean) uw0Var6.c.getValue()).booleanValue() && !((Boolean) qa4Var3.getValue()).booleanValue()) {
                                            int i36 = ic4.X;
                                            for (ic4 ic4Var9 : mp2.G(tw0Var2)) {
                                            }
                                            return (o52) qn2Var7.g(ynVar);
                                        }
                                        int i37 = ic4.X;
                                        for (ic4 ic4Var10 : mp2.G(tw0Var2)) {
                                        }
                                        return (o52) qn2Var8.g(ynVar);
                                }
                            }
                        };
                        xq2Var4.l0(qn2Var6);
                        P8 = qn2Var6;
                    } else {
                        rd4Var3 = rd4Var6;
                        uw0Var3 = uw0Var5;
                        x94Var = x94Var3;
                        sb4Var = sb4Var4;
                        z2 = true;
                    }
                    qn2 qn2Var7 = (qn2) P8;
                    boolean h5 = xq2Var4.h(uw0Var3) | (((((i3 & 29360128) ^ 12582912) <= 8388608 || !xq2Var4.f(qn2Var4)) && (i3 & 12582912) != 8388608) ? z : z2) | ((i3 & 458752) == 131072 ? z2 : z);
                    Object P9 = xq2Var4.P();
                    if (h5 || P9 == vs0Var) {
                        qn2Var5 = qn2Var7;
                        qn2 qn2Var8 = new qn2() { // from class: sc4
                            @Override // defpackage.qn2
                            public final Object g(Object obj8) {
                                int i33 = r5;
                                qa4 qa4Var3 = qa4Var2;
                                qn2 qn2Var72 = qn2Var2;
                                qn2 qn2Var82 = qn2Var4;
                                uw0 uw0Var6 = uw0Var3;
                                yn ynVar = (yn) obj8;
                                switch (i33) {
                                    case 0:
                                        ic4 ic4Var5 = ((sb4) ynVar.a()).B;
                                        ic4Var5.getClass();
                                        tw0 tw0Var = (tw0) ic4Var5;
                                        if (!((Boolean) uw0Var6.c.getValue()).booleanValue() && !((Boolean) qa4Var3.getValue()).booleanValue()) {
                                            int i34 = ic4.X;
                                            for (ic4 ic4Var6 : mp2.G(tw0Var)) {
                                            }
                                            return (z72) qn2Var72.g(ynVar);
                                        }
                                        int i35 = ic4.X;
                                        for (ic4 ic4Var7 : mp2.G(tw0Var)) {
                                        }
                                        return (z72) qn2Var82.g(ynVar);
                                    default:
                                        ic4 ic4Var8 = ((sb4) ynVar.c()).B;
                                        ic4Var8.getClass();
                                        tw0 tw0Var2 = (tw0) ic4Var8;
                                        if (!((Boolean) uw0Var6.c.getValue()).booleanValue() && !((Boolean) qa4Var3.getValue()).booleanValue()) {
                                            int i36 = ic4.X;
                                            for (ic4 ic4Var9 : mp2.G(tw0Var2)) {
                                            }
                                            return (o52) qn2Var72.g(ynVar);
                                        }
                                        int i37 = ic4.X;
                                        for (ic4 ic4Var10 : mp2.G(tw0Var2)) {
                                        }
                                        return (o52) qn2Var82.g(ynVar);
                                }
                            }
                        };
                        xq2Var4.l0(qn2Var8);
                        P9 = qn2Var8;
                    } else {
                        qn2Var5 = qn2Var7;
                    }
                    qn2 qn2Var9 = (qn2) P9;
                    boolean z6 = (i3 & 234881024) == 67108864 ? z2 : z;
                    Object P10 = xq2Var4.P();
                    if (z6 || P10 == vs0Var) {
                        P10 = new x84(12);
                        xq2Var4.l0(P10);
                    }
                    qn2 qn2Var10 = (qn2) P10;
                    Boolean bool = Boolean.TRUE;
                    boolean h6 = xq2Var4.h(uw0Var3);
                    Object P11 = xq2Var4.P();
                    if (h6 || P11 == vs0Var) {
                        P11 = new bi2(26, pp6Var2, uw0Var3);
                        xq2Var4.l0(P11);
                    }
                    mb3.d(bool, (qn2) P11, xq2Var4);
                    Object P12 = xq2Var4.P();
                    if (P12 == vs0Var) {
                        P12 = new n96(sb4Var);
                        xq2Var4.l0(P12);
                    }
                    n96 n96Var3 = (n96) P12;
                    qa4 qa4Var3 = qa4Var2;
                    ga7 J = n16.J(n96Var3, "entry", xq2Var4, 56, 0);
                    if (((Boolean) qa4Var3.getValue()).booleanValue()) {
                        xq2Var4.b0(-1795329152);
                        Float valueOf = Float.valueOf(rs4Var.h());
                        boolean f5 = xq2Var4.f(qa4Var) | xq2Var4.h(n96Var3);
                        Object P13 = xq2Var4.P();
                        if (f5 || P13 == vs0Var) {
                            uw0Var2 = null;
                            P13 = new u12(n96Var3, qa4Var, rs4Var, (r41) null, 16);
                            n96Var2 = n96Var3;
                            xq2Var4.l0(P13);
                        } else {
                            n96Var2 = n96Var3;
                            uw0Var2 = null;
                        }
                        mb3.i(xq2Var4, (eo2) P13, valueOf);
                        xq2Var4.p(false);
                        ga7Var = J;
                        n96Var = n96Var2;
                    } else {
                        uw0Var2 = null;
                        xq2Var4.b0(-1794910745);
                        boolean h7 = xq2Var4.h(n96Var3) | xq2Var4.h(sb4Var) | xq2Var4.f(J);
                        Object P14 = xq2Var4.P();
                        if (h7 || P14 == vs0Var) {
                            ga7Var = J;
                            n96Var = n96Var3;
                            P14 = new l5(n96Var, sb4Var, ga7Var, (r41) null, 22);
                            xq2Var4.l0(P14);
                        } else {
                            ga7Var = J;
                            n96Var = n96Var3;
                        }
                        mb3.i(xq2Var4, (eo2) P14, sb4Var);
                        xq2Var4.p(false);
                    }
                    boolean h8 = xq2Var4.h(x94Var) | xq2Var4.h(uw0Var3) | xq2Var4.f(qn2Var5) | xq2Var4.f(qn2Var9) | xq2Var4.f(qn2Var10);
                    Object P15 = xq2Var4.P();
                    if (h8 || P15 == vs0Var) {
                        uw0 uw0Var6 = uw0Var3;
                        x94 x94Var4 = x94Var;
                        pp6Var = pp6Var2;
                        P15 = new z00(x94Var4, uw0Var6, qn2Var5, qn2Var9, qn2Var10, pp6Var, qa4Var3, 2);
                        x94Var2 = x94Var4;
                        uw0Var4 = uw0Var6;
                        qa4Var3 = qa4Var3;
                        xq2Var4.l0(P15);
                    } else {
                        uw0Var4 = uw0Var3;
                        pp6Var = pp6Var2;
                        x94Var2 = x94Var;
                    }
                    qn2 qn2Var11 = (qn2) P15;
                    Object P16 = xq2Var4.P();
                    if (P16 == vs0Var) {
                        P16 = new x84(14);
                        xq2Var4.l0(P16);
                    }
                    pp6 pp6Var3 = pp6Var;
                    sb4 sb4Var5 = sb4Var;
                    ga7 ga7Var2 = ga7Var;
                    rd4Var2 = rd4Var3;
                    f04.b(ga7Var2, a74Var, qn2Var11, icVar, (qn2) P16, n16.I(820763100, new xc4(n96Var, sb4Var5, C2, qa4Var3, pp6Var3, 0), xq2Var4), xq2Var4, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                    xq2Var2 = xq2Var4;
                    Object f6 = ga7Var2.a.f();
                    Object value = ga7Var2.d.getValue();
                    boolean f7 = xq2Var2.f(ga7Var2) | xq2Var2.h(rc4Var) | xq2Var2.h(sb4Var5) | xq2Var2.h(uw0Var4) | xq2Var2.h(x94Var2);
                    Object P17 = xq2Var2.P();
                    if (f7 || P17 == vs0Var) {
                        obj = value;
                        yc4 yc4Var = new yc4(ga7Var2, rc4Var, sb4Var5, x94Var2, pp6Var3, uw0Var4, null);
                        xq2Var2.l0(yc4Var);
                        P17 = yc4Var;
                    } else {
                        obj = value;
                    }
                    mb3.j(f6, obj, (eo2) P17, xq2Var2);
                    xq2Var2.p(false);
                } else {
                    uw0Var2 = uw0Var;
                    xq2Var2 = xq2Var4;
                    rd4Var2 = rd4Var6;
                    xq2Var2.b0(-1789758886);
                    xq2Var2.p(z);
                }
                qd4 b5 = rd4Var2.b("dialog");
                ij1 ij1Var = b5 instanceof ij1 ? (ij1) b5 : uw0Var2;
                if (ij1Var == null) {
                    cf5 t2 = xq2Var2.t();
                    if (t2 != null) {
                        t2.d = new eo2() { // from class: uc4
                            @Override // defpackage.eo2
                            public final Object o(Object obj8, Object obj9) {
                                int i322 = r10;
                                jg7 jg7Var = jg7.a;
                                int i33 = i2;
                                switch (i322) {
                                    case 0:
                                        ((Integer) obj9).getClass();
                                        int a0 = ii2.a0(i33 | 1);
                                        hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a0);
                                        return jg7Var;
                                    case 1:
                                        ((Integer) obj9).getClass();
                                        int a02 = ii2.a0(i33 | 1);
                                        hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a02);
                                        return jg7Var;
                                    default:
                                        ((Integer) obj9).getClass();
                                        int a03 = ii2.a0(i33 | 1);
                                        hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a03);
                                        return jg7Var;
                                }
                            }
                        };
                        return;
                    }
                    return;
                }
                n16.e(ij1Var, xq2Var2, 0);
            } else {
                i.m("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
        }
        cf5 t3 = xq2Var2.t();
        if (t3 != null) {
            t3.d = new eo2() { // from class: uc4
                @Override // defpackage.eo2
                public final Object o(Object obj8, Object obj9) {
                    int i322 = r10;
                    jg7 jg7Var = jg7.a;
                    int i33 = i2;
                    switch (i322) {
                        case 0:
                            ((Integer) obj9).getClass();
                            int a0 = ii2.a0(i33 | 1);
                            hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a0);
                            return jg7Var;
                        case 1:
                            ((Integer) obj9).getClass();
                            int a02 = ii2.a0(i33 | 1);
                            hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a02);
                            return jg7Var;
                        default:
                            ((Integer) obj9).getClass();
                            int a03 = ii2.a0(i33 | 1);
                            hi2.g(rc4Var, mc4Var, a74Var, icVar, qn2Var, qn2Var2, qn2Var3, qn2Var4, (px0) obj8, a03);
                            return jg7Var;
                    }
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final rc4 rc4Var, final Object obj, a74 a74Var, ic icVar, Map map, final qn2 qn2Var, qn2 qn2Var2, final qn2 qn2Var3, final qn2 qn2Var4, final qn2 qn2Var5, px0 px0Var, final int i2, final int i3) {
        int i4;
        qn2 qn2Var6;
        int i5;
        int i6;
        int i7;
        a74 a74Var2;
        Map map2;
        int i8;
        e40 e40Var;
        boolean z;
        boolean z2;
        Object P;
        final ic icVar2;
        final qn2 qn2Var7;
        final Map map3;
        final a74 a74Var3;
        cf5 t;
        int i9;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1476019057);
        if (xq2Var.h(rc4Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i10 = i2 | i4;
        char c2 = 16;
        if ((i2 & 48) == 0) {
            if (xq2Var.h(obj)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i10 |= i9;
        }
        int i11 = 224640 | i10;
        int i12 = i3 & 128;
        if (i12 != 0) {
            i11 = 12807552 | i10;
        } else if ((i2 & 12582912) == 0) {
            qn2Var6 = qn2Var2;
            if (xq2Var.h(qn2Var6)) {
                i5 = 8388608;
            } else {
                i5 = Compress.MAXWINSIZE;
            }
            i11 |= i5;
            if (xq2Var.h(qn2Var5)) {
                c2 = ' ';
            }
            i6 = c2 | 6;
            if ((306783379 & i11) != 306783378 && (i6 & 19) == 18 && xq2Var.E()) {
                xq2Var.V();
                a74Var3 = a74Var;
                icVar2 = icVar;
                map3 = map;
                qn2Var7 = qn2Var6;
            } else {
                xq2Var.X();
                i7 = i2 & 1;
                vs0 vs0Var = ox0.a;
                if (i7 == 0 && !xq2Var.B()) {
                    xq2Var.V();
                    a74Var2 = a74Var;
                    map2 = map;
                    i8 = i6;
                    e40Var = icVar;
                } else {
                    e40 e40Var2 = d90.L;
                    if (i12 != 0) {
                        Object P2 = xq2Var.P();
                        if (P2 == vs0Var) {
                            P2 = new x84(13);
                            xq2Var.l0(P2);
                        }
                        qn2Var6 = (qn2) P2;
                    }
                    a74Var2 = x64.a;
                    map2 = zt1.A;
                    i8 = i6;
                    e40Var = e40Var2;
                }
                xq2Var.q();
                boolean f2 = xq2Var.f(null) | xq2Var.f(obj);
                if ((i8 & 112) != 32) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | f2;
                P = xq2Var.P();
                if (!z2 || P == vs0Var) {
                    nc4 nc4Var = new nc4(rc4Var.b.s, obj, map2);
                    qn2Var5.g(nc4Var);
                    P = nc4Var.c();
                    xq2Var.l0(P);
                }
                int i13 = ((i11 >> 6) & 458752) | (i11 & 8078) | 24576 | 114819072;
                a74 a74Var4 = a74Var2;
                qn2 qn2Var8 = qn2Var6;
                g(rc4Var, (mc4) P, a74Var4, e40Var, qn2Var, qn2Var8, qn2Var3, qn2Var4, xq2Var, i13);
                icVar2 = e40Var;
                qn2Var7 = qn2Var8;
                map3 = map2;
                a74Var3 = a74Var4;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: tc4
                    @Override // defpackage.eo2
                    public final Object o(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        hi2.h(rc4.this, obj, a74Var3, icVar2, map3, qn2Var, qn2Var7, qn2Var3, qn2Var4, qn2Var5, (px0) obj2, ii2.a0(i2 | 1), i3);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        qn2Var6 = qn2Var2;
        if (xq2Var.h(qn2Var5)) {
        }
        i6 = c2 | 6;
        if ((306783379 & i11) != 306783378) {
        }
        xq2Var.X();
        i7 = i2 & 1;
        vs0 vs0Var2 = ox0.a;
        if (i7 == 0) {
        }
        e40 e40Var22 = d90.L;
        if (i12 != 0) {
        }
        a74Var2 = x64.a;
        map2 = zt1.A;
        i8 = i6;
        e40Var = e40Var22;
        xq2Var.q();
        boolean f22 = xq2Var.f(null) | xq2Var.f(obj);
        if ((i8 & 112) != 32) {
        }
        z2 = z | f22;
        P = xq2Var.P();
        if (!z2) {
        }
        nc4 nc4Var2 = new nc4(rc4Var.b.s, obj, map2);
        qn2Var5.g(nc4Var2);
        P = nc4Var2.c();
        xq2Var.l0(P);
        int i132 = ((i11 >> 6) & 458752) | (i11 & 8078) | 24576 | 114819072;
        a74 a74Var42 = a74Var2;
        qn2 qn2Var82 = qn2Var6;
        g(rc4Var, (mc4) P, a74Var42, e40Var, qn2Var, qn2Var82, qn2Var3, qn2Var4, xq2Var, i132);
        icVar2 = e40Var;
        qn2Var7 = qn2Var82;
        map3 = map2;
        a74Var3 = a74Var42;
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void i(k3 k3Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(829713300);
        if (xq2Var.h(k3Var)) {
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
        if (xq2Var.S(i4 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = nb3.b(1.0f);
                xq2Var.l0(P);
            }
            gn gnVar = (gn) P;
            a74 O = ge7.O(x64.a, 8.0f);
            boolean h2 = xq2Var.h(gnVar);
            Object P2 = xq2Var.P();
            if (h2 || P2 == vs0Var) {
                P2 = new ms3(gnVar, 1);
                xq2Var.l0(P2);
            }
            f04.a(hv.G(O, (qn2) P2), k3Var.a.j, k3Var.b, null, n16.I(504110394, new l4(10, gnVar, k3Var), xq2Var), xq2Var, 24576, 8);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(k3Var, i2, 20);
        }
    }

    public static final void j(u3 u3Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        boolean z2 = u3Var.b;
        nb3 nb3Var = u3Var.a;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(849132524);
        if (xq2Var.f(u3Var)) {
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
        if (xq2Var.S(i4 & 1, z)) {
            boolean f2 = xq2Var.f(nb3Var) | xq2Var.g(z2);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (f2 || P == vs0Var) {
                P = nb3.b(1.0f);
                xq2Var.l0(P);
            }
            gn gnVar = (gn) P;
            boolean f3 = xq2Var.f(nb3Var) | xq2Var.g(z2);
            Object P2 = xq2Var.P();
            if (f3 || P2 == vs0Var) {
                P2 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P2);
            }
            qa4 qa4Var = (qa4) P2;
            a74 O = ge7.O(x64.a, 8.0f);
            boolean h2 = xq2Var.h(gnVar);
            Object P3 = xq2Var.P();
            if (h2 || P3 == vs0Var) {
                P3 = new ms3(gnVar, 2);
                xq2Var.l0(P3);
            }
            a74 G = hv.G(O, (qn2) P3);
            ThreadLocal threadLocal = sl5.a;
            Drawable drawable = ((Resources) xq2Var.j(kf.c)).getDrawable(R.drawable.ic_ra_error, null);
            drawable.getClass();
            f04.a(G, drawable, u3Var.c, new kt0(cc5.b), n16.I(-1497146478, new m4(u3Var, qa4Var, gnVar, 10), xq2Var), xq2Var, 27648, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new y36(u3Var, i2, 3);
        }
    }

    public static final void k(zv0 zv0Var, px0 px0Var, int i2) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(202411441);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            ej2.c(dj6.c(x64.a, 1.0f), z16.b(12.0f), bl2.F(xq2Var).d, 0L, RecyclerView.B1, n16.I(-1510159635, new eq(zv0Var, 11), xq2Var), xq2Var, 1572870, 56);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eq(zv0Var, i2, 12);
        }
    }

    public static final void l(String str, String str2, on2 on2Var, px0 px0Var, int i2) {
        String str3;
        int i3;
        boolean z;
        int i4;
        int i5;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1361351936);
        if ((i2 & 48) == 0) {
            str3 = str2;
            if (xq2Var.f(str3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 = i5 | i2;
        } else {
            str3 = str2;
            i3 = i2;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74 O = ge7.O(mb3.u(dj6.c(x64.a, 1.0f), false, null, on2Var, 15), 16.0f);
            l26 a2 = k26.a(ju.e, d90.i0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(str, null, bl2.F(xq2Var).g, E(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 3078, 0, 131058);
            x37.b(str3, null, bl2.F(xq2Var).l, E(16), oj2.Z, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, ((i3 >> 3) & 14) | 199680, 0, 131026);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(str, str2, on2Var, i2, 28);
        }
    }

    public static final void m(String str, px0 px0Var, int i2) {
        boolean z;
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1807546303);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i2 & 1, z)) {
            long E = E(14);
            oj2 oj2Var = oj2.d0;
            xq2Var = xq2Var2;
            x37.b(str, ge7.S(x64.a, 8.0f, RecyclerView.B1, RecyclerView.B1, 8.0f, 6), bl2.F(xq2Var2).h, E, oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 199734, 0, 131024);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new g5(str, i2, 4);
        }
    }

    public static final void n(final String str, final float f2, final bs0 bs0Var, final int i2, final String str2, final qn2 qn2Var, px0 px0Var, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(828315043);
        if (xq2Var.c(f2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i3 | i4;
        if (xq2Var.f(bs0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (xq2Var.f(str2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i10 = i9 | i6;
        if (xq2Var.h(qn2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i11 = i10 | i7;
        if ((i11 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i11 & 1, z)) {
            x64 x64Var = x64.a;
            a74 P = ge7.P(dj6.c(x64Var, 1.0f), 16.0f, 12.0f);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 c2 = dj6.c(x64Var, 1.0f);
            l26 a3 = k26.a(ju.e, d90.h0, xq2Var, 6);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, c2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(str, null, bl2.F(xq2Var).g, E(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 3078, 0, 131058);
            int i12 = i11 >> 12;
            x37.b(str2, null, bl2.F(xq2Var).l, E(16), oj2.Z, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, (i12 & 14) | 199680, 0, 131026);
            xq2Var.p(true);
            xq2Var = xq2Var;
            jk6.b(f2, qn2Var, null, false, bs0Var, i2, null, ej2.r(bl2.F(xq2Var).l, bl2.F(xq2Var).l, xq2Var, 1018), xq2Var, ((i11 >> 3) & 14) | (i12 & 112) | (57344 & (i11 << 6)) | 196608, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, f2, bs0Var, i2, str2, qn2Var, i3) { // from class: ib7
                public final /* synthetic */ String A;
                public final /* synthetic */ float B;
                public final /* synthetic */ bs0 L;
                public final /* synthetic */ int R;
                public final /* synthetic */ String X;
                public final /* synthetic */ qn2 Y;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(3079);
                    hi2.n(this.A, this.B, this.L, this.R, this.X, this.Y, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void o(String str, boolean z, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-913230599);
        if (xq2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i2 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i6 & 1, z2)) {
            a74 c2 = dj6.c(x64.a, 1.0f);
            if ((i6 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i6 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object P = xq2Var.P();
            if (z5 || P == ox0.a) {
                P = new q01(qn2Var, z, 4);
                xq2Var.l0(P);
            }
            a74 P2 = ge7.P(mb3.u(c2, false, null, (on2) P, 15), 16.0f, 12.0f);
            l26 a2 = k26.a(ju.e, d90.i0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(str, null, bl2.F(xq2Var).g, E(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 3078, 0, 131058);
            xq2Var = xq2Var;
            bx6.a(z, qn2Var, null, false, nj2.i(bl2.F(xq2Var).l, kt0.c(0.5f, bl2.F(xq2Var).l), 0L, 0L, xq2Var, 1020), xq2Var, (i6 >> 3) & 126, 28);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new k91(str, z, qn2Var, i2, 1);
        }
    }

    public static final void p(SharedPreferences sharedPreferences, on2 on2Var, final on2 on2Var2, final on2 on2Var3, on2 on2Var4, on2 on2Var5, px0 px0Var, int i2) {
        iy0 iy0Var;
        float f2;
        x64 x64Var;
        qa4 qa4Var;
        Context context;
        qa4 qa4Var2;
        boolean z;
        iy0 iy0Var2;
        pn pnVar;
        pn pnVar2;
        pn pnVar3;
        pn pnVar4;
        ne neVar;
        Object obj;
        Context context2;
        qa4 qa4Var3;
        sharedPreferences.getClass();
        on2Var.getClass();
        on2Var2.getClass();
        on2Var3.getClass();
        on2Var4.getClass();
        on2Var5.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-416819519);
        int i3 = i2 | (xq2Var.h(sharedPreferences) ? 4 : 2) | (xq2Var.h(on2Var2) ? 256 : 128) | (xq2Var.h(on2Var3) ? 2048 : 1024) | (xq2Var.h(on2Var4) ? 16384 : 8192) | (xq2Var.h(on2Var5) ? 131072 : 65536);
        if (xq2Var.S(i3 & 1, (74883 & i3) != 74882)) {
            Context context3 = (Context) xq2Var.j(kf.b);
            Object P = xq2Var.P();
            Object obj2 = ox0.a;
            if (P == obj2) {
                String string = sharedPreferences.getString("translator_engine", "google");
                P = np2.Y(string != null ? string : "google");
                xq2Var.l0(P);
            }
            final qa4 qa4Var4 = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == obj2) {
                String string2 = sharedPreferences.getString("translator_trigger_mode", "on_demand");
                P2 = np2.Y(string2 != null ? string2 : "on_demand");
                xq2Var.l0(P2);
            }
            final qa4 qa4Var5 = (qa4) P2;
            Object P3 = xq2Var.P();
            if (P3 == obj2) {
                String string3 = sharedPreferences.getString("translator_overlay_style", "smart_background_match");
                P3 = np2.Y(string3 != null ? string3 : "smart_background_match");
                xq2Var.l0(P3);
            }
            final qa4 qa4Var6 = (qa4) P3;
            Object P4 = xq2Var.P();
            if (P4 == obj2) {
                P4 = np2.Y(Boolean.valueOf(sharedPreferences.getBoolean("translator_tts_enabled", false)));
                xq2Var.l0(P4);
            }
            qa4 qa4Var7 = (qa4) P4;
            Object P5 = xq2Var.P();
            if (P5 == obj2) {
                String string4 = sharedPreferences.getString("translator_tts_voice_engine", "neural_edge");
                if (string4 == null) {
                    string4 = "neural_edge";
                }
                P5 = np2.Y(string4);
                xq2Var.l0(P5);
            }
            qa4 qa4Var8 = (qa4) P5;
            Object P6 = xq2Var.P();
            if (P6 == obj2) {
                String string5 = sharedPreferences.getString("translator_tts_lang", "auto");
                if (string5 == null) {
                    string5 = "auto";
                }
                P6 = np2.Y(string5);
                xq2Var.l0(P6);
            }
            final qa4 qa4Var9 = (qa4) P6;
            Object P7 = xq2Var.P();
            if (P7 == obj2) {
                P7 = np2.Y(Boolean.valueOf(sharedPreferences.getBoolean("translator_local_voice_actor_studio", false)));
                xq2Var.l0(P7);
            }
            qa4 qa4Var10 = (qa4) P7;
            Object P8 = xq2Var.P();
            if (P8 == obj2) {
                String string6 = sharedPreferences.getString("translator_local_voice_model", "auto_multi");
                P8 = np2.Y(string6 != null ? string6 : "auto_multi");
                xq2Var.l0(P8);
            }
            final qa4 qa4Var11 = (qa4) P8;
            Object P9 = xq2Var.P();
            if (P9 == obj2) {
                P9 = np2.Y(Float.valueOf(sharedPreferences.getInt("translator_local_voice_pitch_variance", 65)));
                xq2Var.l0(P9);
            }
            qa4 qa4Var12 = (qa4) P9;
            Object P10 = xq2Var.P();
            if (P10 == obj2) {
                P10 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P10);
            }
            qa4 qa4Var13 = (qa4) P10;
            Object P11 = xq2Var.P();
            if (P11 == obj2) {
                P11 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P11);
            }
            qa4 qa4Var14 = (qa4) P11;
            Object P12 = xq2Var.P();
            if (P12 == obj2) {
                P12 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P12);
            }
            qa4 qa4Var15 = (qa4) P12;
            Object P13 = xq2Var.P();
            if (P13 == obj2) {
                P13 = np2.Y(Float.valueOf(sharedPreferences.getInt("translator_font_size_scale", 100)));
                xq2Var.l0(P13);
            }
            final qa4 qa4Var16 = (qa4) P13;
            Object P14 = xq2Var.P();
            if (P14 == obj2) {
                P14 = np2.Y(Float.valueOf(sharedPreferences.getInt("translator_bubble_opacity", 90)));
                xq2Var.l0(P14);
            }
            final qa4 qa4Var17 = (qa4) P14;
            Object P15 = xq2Var.P();
            if (P15 == obj2) {
                P15 = np2.Y(Boolean.valueOf(sharedPreferences.getBoolean("translator_pause_on_translate", true)));
                xq2Var.l0(P15);
            }
            final qa4 qa4Var18 = (qa4) P15;
            boolean h2 = xq2Var.h(sharedPreferences);
            Object P16 = xq2Var.P();
            if (h2 || P16 == obj2) {
                P16 = new y36(sharedPreferences, 12);
                xq2Var.l0(P16);
            }
            final eo2 eo2Var = (eo2) P16;
            x64 x64Var2 = x64.a;
            a74 c2 = dj6.c(x64Var2, 1.0f);
            long j2 = bl2.F(xq2Var).c;
            jy2 jy2Var = u24.m;
            a74 S = ge7.S(vy7.L(c2, j2, jy2Var), RecyclerView.B1, 16.0f, RecyclerView.B1, RecyclerView.B1, 13);
            c40 c40Var = d90.k0;
            eu euVar = ju.c;
            yt0 a2 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, S);
            jx0.i.getClass();
            iy0 iy0Var3 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            pn pnVar5 = ix0.f;
            yh2.K(xq2Var, pnVar5, a2);
            pn pnVar6 = ix0.e;
            yh2.K(xq2Var, pnVar6, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar7 = ix0.g;
            yh2.K(xq2Var, pnVar7, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var, neVar2);
            pn pnVar8 = ix0.d;
            yh2.K(xq2Var, pnVar8, E);
            h70.a(vy7.L(u24.g(dj6.e(dj6.l(x64Var2, 40.0f), 4.0f), z16.b(2.0f)), bl2.F(xq2Var).e, jy2Var).d(new cy2(d90.l0)), xq2Var, 0);
            gi2.h(xq2Var, dj6.e(x64Var2, 16.0f));
            x37.b("Настройки перевода", ge7.Q(x64Var2, 24.0f, RecyclerView.B1, 2), bl2.F(xq2Var).g, E(20), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 199734, 0, 131024);
            a74 O = ge7.O(nb3.W(dj6.c(x64Var2, 1.0f), nb3.U(xq2Var), true), 24.0f);
            yt0 a3 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, O);
            xq2Var.f0();
            if (xq2Var.S) {
                iy0Var = iy0Var3;
                xq2Var.k(iy0Var);
            } else {
                iy0Var = iy0Var3;
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar5, a3);
            yh2.K(xq2Var, pnVar6, l3);
            i61.w(hashCode2, xq2Var, pnVar7, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar8, E2);
            m("Основные", xq2Var, 6);
            k(n16.I(544279653, new fo2() { // from class: ab7
                @Override // defpackage.fo2
                public final Object e(Object obj3, Object obj4, Object obj5) {
                    boolean z2;
                    String str;
                    boolean z3;
                    String str2;
                    int i4 = r6;
                    jg7 jg7Var = jg7.a;
                    vs0 vs0Var = ox0.a;
                    final qa4 qa4Var19 = qa4Var5;
                    final qa4 qa4Var20 = qa4Var4;
                    final qa4 qa4Var21 = qa4Var18;
                    final on2 on2Var6 = on2Var3;
                    final eo2 eo2Var2 = eo2Var;
                    switch (i4) {
                        case 0:
                            px0 px0Var2 = (px0) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            ((zt0) obj3).getClass();
                            if ((intValue & 17) != 16) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            xq2 xq2Var2 = (xq2) px0Var2;
                            if (xq2Var2.S(intValue & 1, z2)) {
                                ya7.Companion.getClass();
                                int i5 = kb7.b[xa7.a((String) qa4Var21.getValue()).ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 == 4) {
                                                str = "Только контур";
                                            } else {
                                                i.d();
                                                return null;
                                            }
                                        } else {
                                            str = "Бабл";
                                        }
                                    } else {
                                        str = "Полупрозрачный";
                                    }
                                } else {
                                    str = "С фоном";
                                }
                                boolean f3 = xq2Var2.f(eo2Var2) | xq2Var2.f(on2Var6);
                                Object P17 = xq2Var2.P();
                                if (f3 || P17 == vs0Var) {
                                    P17 = new on2() { // from class: db7
                                        @Override // defpackage.on2
                                        public final Object c() {
                                            int i6 = r4;
                                            jg7 jg7Var2 = jg7.a;
                                            qa4 qa4Var22 = qa4Var21;
                                            on2 on2Var7 = on2Var6;
                                            eo2 eo2Var3 = eo2Var2;
                                            switch (i6) {
                                                case 0:
                                                    String str3 = "on_demand";
                                                    if (nb3.k((String) qa4Var22.getValue(), "on_demand")) {
                                                        str3 = "auto_screen_change";
                                                    }
                                                    qa4Var22.setValue(str3);
                                                    eo2Var3.o("translator_trigger_mode", (String) qa4Var22.getValue());
                                                    on2Var7.c();
                                                    return jg7Var2;
                                                default:
                                                    t52<ya7> entries = ya7.getEntries();
                                                    ArrayList arrayList = new ArrayList(ht0.v0(entries, 10));
                                                    for (ya7 ya7Var : entries) {
                                                        arrayList.add(ya7Var.getPreferenceValue());
                                                    }
                                                    qa4Var22.setValue((String) arrayList.get((arrayList.indexOf((String) qa4Var22.getValue()) + 1) % arrayList.size()));
                                                    eo2Var3.o("translator_overlay_style", (String) qa4Var22.getValue());
                                                    on2Var7.c();
                                                    return jg7Var2;
                                            }
                                        }
                                    };
                                    xq2Var2.l0(P17);
                                }
                                hi2.l("Стиль наложения", str, (on2) P17, xq2Var2, 6);
                                l.c(null, bl2.F(xq2Var2).f, RecyclerView.B1, xq2Var2, 0, 13);
                                float floatValue = ((Number) qa4Var20.getValue()).floatValue();
                                bs0 bs0Var = new bs0(50.0f, 200.0f);
                                String str3 = ((int) ((Number) qa4Var20.getValue()).floatValue()) + "%";
                                boolean f4 = xq2Var2.f(eo2Var2) | xq2Var2.f(on2Var6);
                                Object P18 = xq2Var2.P();
                                if (f4 || P18 == vs0Var) {
                                    P18 = new qn2() { // from class: gb7
                                        @Override // defpackage.qn2
                                        public final Object g(Object obj6) {
                                            int i6 = r4;
                                            jg7 jg7Var2 = jg7.a;
                                            qa4 qa4Var22 = qa4Var20;
                                            on2 on2Var7 = on2Var6;
                                            eo2 eo2Var3 = eo2Var2;
                                            Float f5 = (Float) obj6;
                                            switch (i6) {
                                                case 0:
                                                    float floatValue2 = f5.floatValue();
                                                    qa4Var22.setValue(f5);
                                                    eo2Var3.o("translator_font_size_scale", Integer.valueOf((int) floatValue2));
                                                    on2Var7.c();
                                                    return jg7Var2;
                                                default:
                                                    float floatValue3 = f5.floatValue();
                                                    qa4Var22.setValue(f5);
                                                    eo2Var3.o("translator_bubble_opacity", Integer.valueOf((int) floatValue3));
                                                    on2Var7.c();
                                                    return jg7Var2;
                                            }
                                        }
                                    };
                                    xq2Var2.l0(P18);
                                }
                                hi2.n("Размер шрифта", floatValue, bs0Var, 14, str3, (qn2) P18, xq2Var2, 3078);
                                l.c(null, bl2.F(xq2Var2).f, RecyclerView.B1, xq2Var2, 0, 13);
                                float floatValue2 = ((Number) qa4Var19.getValue()).floatValue();
                                bs0 bs0Var2 = new bs0(RecyclerView.B1, 100.0f);
                                String str4 = ((int) ((Number) qa4Var19.getValue()).floatValue()) + "%";
                                boolean f5 = xq2Var2.f(eo2Var2) | xq2Var2.f(on2Var6);
                                Object P19 = xq2Var2.P();
                                if (f5 || P19 == vs0Var) {
                                    P19 = new qn2() { // from class: gb7
                                        @Override // defpackage.qn2
                                        public final Object g(Object obj6) {
                                            int i6 = r4;
                                            jg7 jg7Var2 = jg7.a;
                                            qa4 qa4Var22 = qa4Var19;
                                            on2 on2Var7 = on2Var6;
                                            eo2 eo2Var3 = eo2Var2;
                                            Float f52 = (Float) obj6;
                                            switch (i6) {
                                                case 0:
                                                    float floatValue22 = f52.floatValue();
                                                    qa4Var22.setValue(f52);
                                                    eo2Var3.o("translator_font_size_scale", Integer.valueOf((int) floatValue22));
                                                    on2Var7.c();
                                                    return jg7Var2;
                                                default:
                                                    float floatValue3 = f52.floatValue();
                                                    qa4Var22.setValue(f52);
                                                    eo2Var3.o("translator_bubble_opacity", Integer.valueOf((int) floatValue3));
                                                    on2Var7.c();
                                                    return jg7Var2;
                                            }
                                        }
                                    };
                                    xq2Var2.l0(P19);
                                }
                                hi2.n("Непрозрачность фона", floatValue2, bs0Var2, 19, str4, (qn2) P19, xq2Var2, 3078);
                                return jg7Var;
                            }
                            xq2Var2.V();
                            return jg7Var;
                        default:
                            px0 px0Var3 = (px0) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            ((zt0) obj3).getClass();
                            if ((intValue2 & 17) != 16) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            xq2 xq2Var3 = (xq2) px0Var3;
                            if (xq2Var3.S(intValue2 & 1, z3)) {
                                boolean booleanValue = ((Boolean) qa4Var21.getValue()).booleanValue();
                                boolean f6 = xq2Var3.f(eo2Var2);
                                Object P20 = xq2Var3.P();
                                if (f6 || P20 == vs0Var) {
                                    P20 = new cb7(eo2Var2, qa4Var21, 0);
                                    xq2Var3.l0(P20);
                                }
                                hi2.o("Пауза при переводе", booleanValue, (qn2) P20, xq2Var3, 6);
                                l.c(null, bl2.F(xq2Var3).f, RecyclerView.B1, xq2Var3, 0, 13);
                                wa7.Companion.getClass();
                                String Q0 = qs6.Q0(va7.a((String) qa4Var20.getValue()).getDisplayName(), " (");
                                boolean f7 = xq2Var3.f(eo2Var2);
                                Object P21 = xq2Var3.P();
                                if (f7 || P21 == vs0Var) {
                                    P21 = new yu6(6, eo2Var2, qa4Var20);
                                    xq2Var3.l0(P21);
                                }
                                hi2.l("Движок перевода", Q0, (on2) P21, xq2Var3, 6);
                                l.c(null, bl2.F(xq2Var3).f, RecyclerView.B1, xq2Var3, 0, 13);
                                mb7.Companion.getClass();
                                int i6 = kb7.a[lb7.a((String) qa4Var19.getValue()).ordinal()];
                                if (i6 != 1) {
                                    if (i6 == 2) {
                                        str2 = "Автоматически";
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    str2 = "По кнопке";
                                }
                                boolean f8 = xq2Var3.f(eo2Var2) | xq2Var3.f(on2Var6);
                                Object P22 = xq2Var3.P();
                                if (f8 || P22 == vs0Var) {
                                    P22 = new on2() { // from class: db7
                                        @Override // defpackage.on2
                                        public final Object c() {
                                            int i62 = r4;
                                            jg7 jg7Var2 = jg7.a;
                                            qa4 qa4Var22 = qa4Var19;
                                            on2 on2Var7 = on2Var6;
                                            eo2 eo2Var3 = eo2Var2;
                                            switch (i62) {
                                                case 0:
                                                    String str32 = "on_demand";
                                                    if (nb3.k((String) qa4Var22.getValue(), "on_demand")) {
                                                        str32 = "auto_screen_change";
                                                    }
                                                    qa4Var22.setValue(str32);
                                                    eo2Var3.o("translator_trigger_mode", (String) qa4Var22.getValue());
                                                    on2Var7.c();
                                                    return jg7Var2;
                                                default:
                                                    t52<ya7> entries = ya7.getEntries();
                                                    ArrayList arrayList = new ArrayList(ht0.v0(entries, 10));
                                                    for (ya7 ya7Var : entries) {
                                                        arrayList.add(ya7Var.getPreferenceValue());
                                                    }
                                                    qa4Var22.setValue((String) arrayList.get((arrayList.indexOf((String) qa4Var22.getValue()) + 1) % arrayList.size()));
                                                    eo2Var3.o("translator_overlay_style", (String) qa4Var22.getValue());
                                                    on2Var7.c();
                                                    return jg7Var2;
                                            }
                                        }
                                    };
                                    xq2Var3.l0(P22);
                                }
                                hi2.l("Режим активации", str2, (on2) P22, xq2Var3, 6);
                                return jg7Var;
                            }
                            xq2Var3.V();
                            return jg7Var;
                    }
                }
            }, xq2Var), xq2Var, 6);
            gi2.h(xq2Var, dj6.e(x64Var2, 16.0f));
            m("Внешний вид", xq2Var, 6);
            k(n16.I(-1046991666, new fo2() { // from class: ab7
                @Override // defpackage.fo2
                public final Object e(Object obj3, Object obj4, Object obj5) {
                    boolean z2;
                    String str;
                    boolean z3;
                    String str2;
                    int i4 = r6;
                    jg7 jg7Var = jg7.a;
                    vs0 vs0Var = ox0.a;
                    final qa4 qa4Var19 = qa4Var17;
                    final qa4 qa4Var20 = qa4Var16;
                    final qa4 qa4Var21 = qa4Var6;
                    final on2 on2Var6 = on2Var2;
                    final eo2 eo2Var2 = eo2Var;
                    switch (i4) {
                        case 0:
                            px0 px0Var2 = (px0) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            ((zt0) obj3).getClass();
                            if ((intValue & 17) != 16) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            xq2 xq2Var2 = (xq2) px0Var2;
                            if (xq2Var2.S(intValue & 1, z2)) {
                                ya7.Companion.getClass();
                                int i5 = kb7.b[xa7.a((String) qa4Var21.getValue()).ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 == 4) {
                                                str = "Только контур";
                                            } else {
                                                i.d();
                                                return null;
                                            }
                                        } else {
                                            str = "Бабл";
                                        }
                                    } else {
                                        str = "Полупрозрачный";
                                    }
                                } else {
                                    str = "С фоном";
                                }
                                boolean f3 = xq2Var2.f(eo2Var2) | xq2Var2.f(on2Var6);
                                Object P17 = xq2Var2.P();
                                if (f3 || P17 == vs0Var) {
                                    P17 = new on2() { // from class: db7
                                        @Override // defpackage.on2
                                        public final Object c() {
                                            int i62 = r4;
                                            jg7 jg7Var2 = jg7.a;
                                            qa4 qa4Var22 = qa4Var21;
                                            on2 on2Var7 = on2Var6;
                                            eo2 eo2Var3 = eo2Var2;
                                            switch (i62) {
                                                case 0:
                                                    String str32 = "on_demand";
                                                    if (nb3.k((String) qa4Var22.getValue(), "on_demand")) {
                                                        str32 = "auto_screen_change";
                                                    }
                                                    qa4Var22.setValue(str32);
                                                    eo2Var3.o("translator_trigger_mode", (String) qa4Var22.getValue());
                                                    on2Var7.c();
                                                    return jg7Var2;
                                                default:
                                                    t52<ya7> entries = ya7.getEntries();
                                                    ArrayList arrayList = new ArrayList(ht0.v0(entries, 10));
                                                    for (ya7 ya7Var : entries) {
                                                        arrayList.add(ya7Var.getPreferenceValue());
                                                    }
                                                    qa4Var22.setValue((String) arrayList.get((arrayList.indexOf((String) qa4Var22.getValue()) + 1) % arrayList.size()));
                                                    eo2Var3.o("translator_overlay_style", (String) qa4Var22.getValue());
                                                    on2Var7.c();
                                                    return jg7Var2;
                                            }
                                        }
                                    };
                                    xq2Var2.l0(P17);
                                }
                                hi2.l("Стиль наложения", str, (on2) P17, xq2Var2, 6);
                                l.c(null, bl2.F(xq2Var2).f, RecyclerView.B1, xq2Var2, 0, 13);
                                float floatValue = ((Number) qa4Var20.getValue()).floatValue();
                                bs0 bs0Var = new bs0(50.0f, 200.0f);
                                String str3 = ((int) ((Number) qa4Var20.getValue()).floatValue()) + "%";
                                boolean f4 = xq2Var2.f(eo2Var2) | xq2Var2.f(on2Var6);
                                Object P18 = xq2Var2.P();
                                if (f4 || P18 == vs0Var) {
                                    P18 = new qn2() { // from class: gb7
                                        @Override // defpackage.qn2
                                        public final Object g(Object obj6) {
                                            int i6 = r4;
                                            jg7 jg7Var2 = jg7.a;
                                            qa4 qa4Var22 = qa4Var20;
                                            on2 on2Var7 = on2Var6;
                                            eo2 eo2Var3 = eo2Var2;
                                            Float f52 = (Float) obj6;
                                            switch (i6) {
                                                case 0:
                                                    float floatValue22 = f52.floatValue();
                                                    qa4Var22.setValue(f52);
                                                    eo2Var3.o("translator_font_size_scale", Integer.valueOf((int) floatValue22));
                                                    on2Var7.c();
                                                    return jg7Var2;
                                                default:
                                                    float floatValue3 = f52.floatValue();
                                                    qa4Var22.setValue(f52);
                                                    eo2Var3.o("translator_bubble_opacity", Integer.valueOf((int) floatValue3));
                                                    on2Var7.c();
                                                    return jg7Var2;
                                            }
                                        }
                                    };
                                    xq2Var2.l0(P18);
                                }
                                hi2.n("Размер шрифта", floatValue, bs0Var, 14, str3, (qn2) P18, xq2Var2, 3078);
                                l.c(null, bl2.F(xq2Var2).f, RecyclerView.B1, xq2Var2, 0, 13);
                                float floatValue2 = ((Number) qa4Var19.getValue()).floatValue();
                                bs0 bs0Var2 = new bs0(RecyclerView.B1, 100.0f);
                                String str4 = ((int) ((Number) qa4Var19.getValue()).floatValue()) + "%";
                                boolean f5 = xq2Var2.f(eo2Var2) | xq2Var2.f(on2Var6);
                                Object P19 = xq2Var2.P();
                                if (f5 || P19 == vs0Var) {
                                    P19 = new qn2() { // from class: gb7
                                        @Override // defpackage.qn2
                                        public final Object g(Object obj6) {
                                            int i6 = r4;
                                            jg7 jg7Var2 = jg7.a;
                                            qa4 qa4Var22 = qa4Var19;
                                            on2 on2Var7 = on2Var6;
                                            eo2 eo2Var3 = eo2Var2;
                                            Float f52 = (Float) obj6;
                                            switch (i6) {
                                                case 0:
                                                    float floatValue22 = f52.floatValue();
                                                    qa4Var22.setValue(f52);
                                                    eo2Var3.o("translator_font_size_scale", Integer.valueOf((int) floatValue22));
                                                    on2Var7.c();
                                                    return jg7Var2;
                                                default:
                                                    float floatValue3 = f52.floatValue();
                                                    qa4Var22.setValue(f52);
                                                    eo2Var3.o("translator_bubble_opacity", Integer.valueOf((int) floatValue3));
                                                    on2Var7.c();
                                                    return jg7Var2;
                                            }
                                        }
                                    };
                                    xq2Var2.l0(P19);
                                }
                                hi2.n("Непрозрачность фона", floatValue2, bs0Var2, 19, str4, (qn2) P19, xq2Var2, 3078);
                                return jg7Var;
                            }
                            xq2Var2.V();
                            return jg7Var;
                        default:
                            px0 px0Var3 = (px0) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            ((zt0) obj3).getClass();
                            if ((intValue2 & 17) != 16) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            xq2 xq2Var3 = (xq2) px0Var3;
                            if (xq2Var3.S(intValue2 & 1, z3)) {
                                boolean booleanValue = ((Boolean) qa4Var21.getValue()).booleanValue();
                                boolean f6 = xq2Var3.f(eo2Var2);
                                Object P20 = xq2Var3.P();
                                if (f6 || P20 == vs0Var) {
                                    P20 = new cb7(eo2Var2, qa4Var21, 0);
                                    xq2Var3.l0(P20);
                                }
                                hi2.o("Пауза при переводе", booleanValue, (qn2) P20, xq2Var3, 6);
                                l.c(null, bl2.F(xq2Var3).f, RecyclerView.B1, xq2Var3, 0, 13);
                                wa7.Companion.getClass();
                                String Q0 = qs6.Q0(va7.a((String) qa4Var20.getValue()).getDisplayName(), " (");
                                boolean f7 = xq2Var3.f(eo2Var2);
                                Object P21 = xq2Var3.P();
                                if (f7 || P21 == vs0Var) {
                                    P21 = new yu6(6, eo2Var2, qa4Var20);
                                    xq2Var3.l0(P21);
                                }
                                hi2.l("Движок перевода", Q0, (on2) P21, xq2Var3, 6);
                                l.c(null, bl2.F(xq2Var3).f, RecyclerView.B1, xq2Var3, 0, 13);
                                mb7.Companion.getClass();
                                int i6 = kb7.a[lb7.a((String) qa4Var19.getValue()).ordinal()];
                                if (i6 != 1) {
                                    if (i6 == 2) {
                                        str2 = "Автоматически";
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    str2 = "По кнопке";
                                }
                                boolean f8 = xq2Var3.f(eo2Var2) | xq2Var3.f(on2Var6);
                                Object P22 = xq2Var3.P();
                                if (f8 || P22 == vs0Var) {
                                    P22 = new on2() { // from class: db7
                                        @Override // defpackage.on2
                                        public final Object c() {
                                            int i62 = r4;
                                            jg7 jg7Var2 = jg7.a;
                                            qa4 qa4Var22 = qa4Var19;
                                            on2 on2Var7 = on2Var6;
                                            eo2 eo2Var3 = eo2Var2;
                                            switch (i62) {
                                                case 0:
                                                    String str32 = "on_demand";
                                                    if (nb3.k((String) qa4Var22.getValue(), "on_demand")) {
                                                        str32 = "auto_screen_change";
                                                    }
                                                    qa4Var22.setValue(str32);
                                                    eo2Var3.o("translator_trigger_mode", (String) qa4Var22.getValue());
                                                    on2Var7.c();
                                                    return jg7Var2;
                                                default:
                                                    t52<ya7> entries = ya7.getEntries();
                                                    ArrayList arrayList = new ArrayList(ht0.v0(entries, 10));
                                                    for (ya7 ya7Var : entries) {
                                                        arrayList.add(ya7Var.getPreferenceValue());
                                                    }
                                                    qa4Var22.setValue((String) arrayList.get((arrayList.indexOf((String) qa4Var22.getValue()) + 1) % arrayList.size()));
                                                    eo2Var3.o("translator_overlay_style", (String) qa4Var22.getValue());
                                                    on2Var7.c();
                                                    return jg7Var2;
                                            }
                                        }
                                    };
                                    xq2Var3.l0(P22);
                                }
                                hi2.l("Режим активации", str2, (on2) P22, xq2Var3, 6);
                                return jg7Var;
                            }
                            xq2Var3.V();
                            return jg7Var;
                    }
                }
            }, xq2Var), xq2Var, 6);
            gi2.h(xq2Var, dj6.e(x64Var2, 16.0f));
            m("Озвучка (TTS)", xq2Var, 6);
            k(n16.I(-1706057747, new xn3(eo2Var, on2Var5, qa4Var7, qa4Var10, qa4Var8, qa4Var14, qa4Var9, qa4Var15, 3), xq2Var), xq2Var, 6);
            gi2.h(xq2Var, dj6.e(x64Var2, 16.0f));
            m("AI Voice Actor Studio (Piper INT8)", xq2Var, 6);
            final eo2 eo2Var2 = eo2Var;
            k(n16.I(1929843468, new xn3(eo2Var, context3, qa4Var10, qa4Var7, qa4Var8, qa4Var11, qa4Var13, qa4Var12, 4), xq2Var), xq2Var, 6);
            if (((Boolean) qa4Var14.getValue()).booleanValue()) {
                xq2Var.b0(396681180);
                List c0 = hf.c0(new vr4("neural_edge", "⚡ Нейро-голоса Edge Cloud (Высокое качество, 24 характера)"), new vr4("local_multi", "🎙️ Локальный AI Voice Actor Studio (Piper INT8 оффлайн)"), new vr4("single", "🤖 Системный Android TTS (Базовый синтезатор)"));
                long j3 = bl2.F(xq2Var).c;
                y16 b2 = z16.b(16.0f);
                Object P17 = xq2Var.P();
                f2 = 16.0f;
                obj = obj2;
                if (P17 == obj) {
                    P17 = new oe4(qa4Var14, 26);
                    xq2Var.l0(P17);
                }
                zv0 I = n16.I(814046562, new e4(qa4Var14, 6), xq2Var);
                zv0 zv0Var = jw2.i;
                ne4 ne4Var = new ne4(c0, eo2Var2, qa4Var8, qa4Var10, qa4Var14);
                eo2Var2 = eo2Var2;
                qa4Var2 = qa4Var13;
                x64Var = x64Var2;
                context = context3;
                iy0Var2 = iy0Var;
                pnVar = pnVar8;
                z = false;
                pnVar2 = pnVar5;
                pnVar3 = pnVar6;
                pnVar4 = pnVar7;
                neVar = neVar2;
                qa4Var = qa4Var15;
                nb3.a((on2) P17, I, null, zv0Var, n16.I(-1507913243, ne4Var, xq2Var), b2, j3, 0L, null, xq2Var, 27702);
                xq2Var.p(false);
            } else {
                f2 = 16.0f;
                x64Var = x64Var2;
                qa4Var = qa4Var15;
                context = context3;
                qa4Var2 = qa4Var13;
                z = false;
                iy0Var2 = iy0Var;
                pnVar = pnVar8;
                pnVar2 = pnVar5;
                pnVar3 = pnVar6;
                pnVar4 = pnVar7;
                neVar = neVar2;
                obj = obj2;
                xq2Var.b0(401740845);
                xq2Var.p(false);
            }
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                xq2Var.b0(401910229);
                final List c02 = hf.c0(new vr4("auto", "🌐 Автовыбор (по языку перевода)"), new vr4("ru", "🇷🇺 Русский (ru)"), new vr4("en", "🇬🇧 Английский (en)"), new vr4("ja", "🇯🇵 Японский (ja)"), new vr4("zh", "🇨🇳 Китайский (zh)"), new vr4("de", "🇩🇪 Немецкий (de)"), new vr4("fr", "🇫🇷 Французский (fr)"), new vr4("es", "🇪🇸 Испанский (es)"));
                long j4 = bl2.F(xq2Var).c;
                y16 b3 = z16.b(f2);
                Object P18 = xq2Var.P();
                if (P18 == obj) {
                    qa4Var3 = qa4Var;
                    P18 = new oe4(qa4Var3, 27);
                    xq2Var.l0(P18);
                } else {
                    qa4Var3 = qa4Var;
                }
                final qa4 qa4Var19 = qa4Var3;
                qa4Var2 = qa4Var2;
                context = context;
                nb3.a((on2) P18, n16.I(500970123, new e4(qa4Var3, 7), xq2Var), null, jw2.k, n16.I(-1814375858, new eo2() { // from class: hb7
                    @Override // defpackage.eo2
                    public final Object o(Object obj3, Object obj4) {
                        boolean z2;
                        long j5;
                        eo2 eo2Var3;
                        qa4 qa4Var20;
                        qa4 qa4Var21;
                        boolean z3;
                        long j6;
                        oj2 oj2Var;
                        hb7 hb7Var = this;
                        int i4 = r5;
                        jg7 jg7Var = jg7.a;
                        vs0 vs0Var = ox0.a;
                        float f3 = 1.0f;
                        x64 x64Var3 = x64.a;
                        boolean z4 = false;
                        boolean z5 = true;
                        switch (i4) {
                            case 0:
                                px0 px0Var2 = (px0) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if ((intValue & 3) != 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                xq2 xq2Var2 = (xq2) px0Var2;
                                if (xq2Var2.S(intValue & 1, z2)) {
                                    a74 c3 = dj6.c(x64Var3, 1.0f);
                                    yt0 a4 = wt0.a(new gu(4.0f, true, new i(1)), d90.k0, xq2Var2, 6);
                                    int hashCode3 = Long.hashCode(xq2Var2.T);
                                    xv4 l4 = xq2Var2.l();
                                    a74 E3 = l.E(xq2Var2, c3);
                                    jx0.i.getClass();
                                    iy0 iy0Var4 = ix0.b;
                                    xq2Var2.f0();
                                    if (xq2Var2.S) {
                                        xq2Var2.k(iy0Var4);
                                    } else {
                                        xq2Var2.o0();
                                    }
                                    yh2.K(xq2Var2, ix0.f, a4);
                                    yh2.K(xq2Var2, ix0.e, l4);
                                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode3));
                                    yh2.F(xq2Var2, ix0.h);
                                    yh2.K(xq2Var2, ix0.d, E3);
                                    xq2Var2.b0(-1734598884);
                                    for (vr4 vr4Var : c02) {
                                        final String str = (String) vr4Var.A;
                                        String str2 = (String) vr4Var.B;
                                        final qa4 qa4Var22 = qa4Var9;
                                        boolean k2 = nb3.k(str, (String) qa4Var22.getValue());
                                        a74 g2 = u24.g(dj6.c(x64Var3, f3), z16.b(8.0f));
                                        if (k2) {
                                            xq2Var2.b0(-1929771024);
                                            j5 = kt0.c(0.15f, bl2.F(xq2Var2).l);
                                            xq2Var2.p(z4);
                                        } else {
                                            xq2Var2.b0(-1929769112);
                                            xq2Var2.p(z4);
                                            j5 = kt0.g;
                                        }
                                        a74 L = vy7.L(g2, j5, u24.m);
                                        boolean f4 = xq2Var2.f(str);
                                        final eo2 eo2Var4 = eo2Var2;
                                        boolean f5 = f4 | xq2Var2.f(eo2Var4);
                                        Object P19 = xq2Var2.P();
                                        final qa4 qa4Var23 = qa4Var19;
                                        if (!f5 && P19 != vs0Var) {
                                            qa4Var21 = qa4Var23;
                                            qa4Var20 = qa4Var22;
                                            eo2Var3 = eo2Var4;
                                        } else {
                                            P19 = new on2() { // from class: eb7
                                                @Override // defpackage.on2
                                                public final Object c() {
                                                    int i5 = r5;
                                                    jg7 jg7Var2 = jg7.a;
                                                    qa4 qa4Var24 = qa4Var23;
                                                    qa4 qa4Var25 = qa4Var22;
                                                    eo2 eo2Var5 = eo2Var4;
                                                    String str3 = str;
                                                    switch (i5) {
                                                        case 0:
                                                            qa4Var25.setValue(str3);
                                                            eo2Var5.o("translator_tts_lang", str3);
                                                            qa4Var24.setValue(Boolean.FALSE);
                                                            return jg7Var2;
                                                        default:
                                                            qa4Var25.setValue(str3);
                                                            eo2Var5.o("translator_tts_lang", str3);
                                                            qa4Var24.setValue(Boolean.FALSE);
                                                            return jg7Var2;
                                                    }
                                                }
                                            };
                                            eo2Var3 = eo2Var4;
                                            qa4Var20 = qa4Var22;
                                            qa4Var21 = qa4Var23;
                                            xq2Var2.l0(P19);
                                        }
                                        a74 P20 = ge7.P(mb3.u(L, z4, null, (on2) P19, 15), 12.0f, 10.0f);
                                        l26 a5 = k26.a(ju.e, d90.i0, xq2Var2, 54);
                                        int hashCode4 = Long.hashCode(xq2Var2.T);
                                        xv4 l5 = xq2Var2.l();
                                        a74 E4 = l.E(xq2Var2, P20);
                                        jx0.i.getClass();
                                        iy0 iy0Var5 = ix0.b;
                                        xq2Var2.f0();
                                        if (xq2Var2.S) {
                                            xq2Var2.k(iy0Var5);
                                        } else {
                                            xq2Var2.o0();
                                        }
                                        yh2.K(xq2Var2, ix0.f, a5);
                                        yh2.K(xq2Var2, ix0.e, l5);
                                        yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode4));
                                        yh2.F(xq2Var2, ix0.h);
                                        yh2.K(xq2Var2, ix0.d, E4);
                                        if (k2) {
                                            xq2Var2.b0(-779131554);
                                            j6 = bl2.F(xq2Var2).l;
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                            xq2Var2.b0(-779130851);
                                            j6 = bl2.F(xq2Var2).g;
                                        }
                                        xq2Var2.p(z3);
                                        long j7 = j6;
                                        if (k2) {
                                            oj2Var = oj2.e0;
                                        } else {
                                            oj2Var = oj2.Y;
                                        }
                                        xq2 xq2Var3 = xq2Var2;
                                        x37.b(str2, new vn3(1.0f, true), j7, hi2.E(13), oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 3072, 0, 131024);
                                        boolean f6 = xq2Var3.f(str) | xq2Var3.f(eo2Var3);
                                        Object P21 = xq2Var3.P();
                                        if (f6 || P21 == vs0Var) {
                                            final eo2 eo2Var5 = eo2Var3;
                                            final qa4 qa4Var24 = qa4Var20;
                                            final qa4 qa4Var25 = qa4Var21;
                                            P21 = new on2() { // from class: eb7
                                                @Override // defpackage.on2
                                                public final Object c() {
                                                    int i5 = r5;
                                                    jg7 jg7Var2 = jg7.a;
                                                    qa4 qa4Var242 = qa4Var25;
                                                    qa4 qa4Var252 = qa4Var24;
                                                    eo2 eo2Var52 = eo2Var5;
                                                    String str3 = str;
                                                    switch (i5) {
                                                        case 0:
                                                            qa4Var252.setValue(str3);
                                                            eo2Var52.o("translator_tts_lang", str3);
                                                            qa4Var242.setValue(Boolean.FALSE);
                                                            return jg7Var2;
                                                        default:
                                                            qa4Var252.setValue(str3);
                                                            eo2Var52.o("translator_tts_lang", str3);
                                                            qa4Var242.setValue(Boolean.FALSE);
                                                            return jg7Var2;
                                                    }
                                                }
                                            };
                                            xq2Var3.l0(P21);
                                        }
                                        kd5.a(k2, (on2) P21, null, false, jx2.n(bl2.F(xq2Var3).l, bl2.F(xq2Var3).h, xq2Var3, 0, 4), xq2Var3, 0, 28);
                                        xq2Var2 = xq2Var3;
                                        xq2Var2.p(true);
                                        z5 = true;
                                        z4 = false;
                                        f3 = 1.0f;
                                        hb7Var = this;
                                    }
                                    xq2Var2.p(z4);
                                    xq2Var2.p(z5);
                                } else {
                                    xq2Var2.V();
                                }
                                return jg7Var;
                            default:
                                px0 px0Var3 = (px0) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z4 = true;
                                }
                                xq2 xq2Var4 = (xq2) px0Var3;
                                if (xq2Var4.S(intValue2 & 1, z4)) {
                                    a74 f7 = dj6.f(dj6.c(x64Var3, 1.0f), RecyclerView.B1, 420.0f, 1);
                                    gu guVar = new gu(4.0f, true, new i(1));
                                    List list = c02;
                                    boolean h3 = xq2Var4.h(list);
                                    eo2 eo2Var6 = eo2Var2;
                                    boolean f8 = h3 | xq2Var4.f(eo2Var6);
                                    Object P22 = xq2Var4.P();
                                    if (f8 || P22 == vs0Var) {
                                        cn cnVar = new cn(list, eo2Var6, qa4Var9, qa4Var19, 12);
                                        xq2Var4.l0(cnVar);
                                        P22 = cnVar;
                                    }
                                    gi2.e(f7, null, null, guVar, null, null, false, null, (qn2) P22, xq2Var4, 24582, 494);
                                } else {
                                    xq2Var4.V();
                                }
                                return jg7Var;
                        }
                    }
                }, xq2Var), b3, j4, 0L, null, xq2Var, 27702);
                xq2Var.p(z);
            } else {
                xq2Var.b0(406023309);
                xq2Var.p(z);
            }
            if (((Boolean) qa4Var2.getValue()).booleanValue()) {
                xq2Var.b0(406190833);
                Context context4 = context;
                final List u = ii2.u(context4);
                long j5 = bl2.F(xq2Var).c;
                y16 b4 = z16.b(f2);
                Object P19 = xq2Var.P();
                if (P19 == obj) {
                    P19 = new fb7(qa4Var2, 4);
                    xq2Var.l0(P19);
                }
                final qa4 qa4Var20 = qa4Var2;
                context2 = context4;
                nb3.a((on2) P19, n16.I(-158095958, new e4(qa4Var2, 8), xq2Var), null, jw2.m, n16.I(1821525357, new eo2() { // from class: hb7
                    @Override // defpackage.eo2
                    public final Object o(Object obj3, Object obj4) {
                        boolean z2;
                        long j52;
                        eo2 eo2Var3;
                        qa4 qa4Var202;
                        qa4 qa4Var21;
                        boolean z3;
                        long j6;
                        oj2 oj2Var;
                        hb7 hb7Var = this;
                        int i4 = r5;
                        jg7 jg7Var = jg7.a;
                        vs0 vs0Var = ox0.a;
                        float f3 = 1.0f;
                        x64 x64Var3 = x64.a;
                        boolean z4 = false;
                        boolean z5 = true;
                        switch (i4) {
                            case 0:
                                px0 px0Var2 = (px0) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if ((intValue & 3) != 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                xq2 xq2Var2 = (xq2) px0Var2;
                                if (xq2Var2.S(intValue & 1, z2)) {
                                    a74 c3 = dj6.c(x64Var3, 1.0f);
                                    yt0 a4 = wt0.a(new gu(4.0f, true, new i(1)), d90.k0, xq2Var2, 6);
                                    int hashCode3 = Long.hashCode(xq2Var2.T);
                                    xv4 l4 = xq2Var2.l();
                                    a74 E3 = l.E(xq2Var2, c3);
                                    jx0.i.getClass();
                                    iy0 iy0Var4 = ix0.b;
                                    xq2Var2.f0();
                                    if (xq2Var2.S) {
                                        xq2Var2.k(iy0Var4);
                                    } else {
                                        xq2Var2.o0();
                                    }
                                    yh2.K(xq2Var2, ix0.f, a4);
                                    yh2.K(xq2Var2, ix0.e, l4);
                                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode3));
                                    yh2.F(xq2Var2, ix0.h);
                                    yh2.K(xq2Var2, ix0.d, E3);
                                    xq2Var2.b0(-1734598884);
                                    for (vr4 vr4Var : u) {
                                        final String str = (String) vr4Var.A;
                                        String str2 = (String) vr4Var.B;
                                        final qa4 qa4Var22 = qa4Var11;
                                        boolean k2 = nb3.k(str, (String) qa4Var22.getValue());
                                        a74 g2 = u24.g(dj6.c(x64Var3, f3), z16.b(8.0f));
                                        if (k2) {
                                            xq2Var2.b0(-1929771024);
                                            j52 = kt0.c(0.15f, bl2.F(xq2Var2).l);
                                            xq2Var2.p(z4);
                                        } else {
                                            xq2Var2.b0(-1929769112);
                                            xq2Var2.p(z4);
                                            j52 = kt0.g;
                                        }
                                        a74 L = vy7.L(g2, j52, u24.m);
                                        boolean f4 = xq2Var2.f(str);
                                        final eo2 eo2Var4 = eo2Var2;
                                        boolean f5 = f4 | xq2Var2.f(eo2Var4);
                                        Object P192 = xq2Var2.P();
                                        final qa4 qa4Var23 = qa4Var20;
                                        if (!f5 && P192 != vs0Var) {
                                            qa4Var21 = qa4Var23;
                                            qa4Var202 = qa4Var22;
                                            eo2Var3 = eo2Var4;
                                        } else {
                                            P192 = new on2() { // from class: eb7
                                                @Override // defpackage.on2
                                                public final Object c() {
                                                    int i5 = r5;
                                                    jg7 jg7Var2 = jg7.a;
                                                    qa4 qa4Var242 = qa4Var23;
                                                    qa4 qa4Var252 = qa4Var22;
                                                    eo2 eo2Var52 = eo2Var4;
                                                    String str3 = str;
                                                    switch (i5) {
                                                        case 0:
                                                            qa4Var252.setValue(str3);
                                                            eo2Var52.o("translator_tts_lang", str3);
                                                            qa4Var242.setValue(Boolean.FALSE);
                                                            return jg7Var2;
                                                        default:
                                                            qa4Var252.setValue(str3);
                                                            eo2Var52.o("translator_tts_lang", str3);
                                                            qa4Var242.setValue(Boolean.FALSE);
                                                            return jg7Var2;
                                                    }
                                                }
                                            };
                                            eo2Var3 = eo2Var4;
                                            qa4Var202 = qa4Var22;
                                            qa4Var21 = qa4Var23;
                                            xq2Var2.l0(P192);
                                        }
                                        a74 P20 = ge7.P(mb3.u(L, z4, null, (on2) P192, 15), 12.0f, 10.0f);
                                        l26 a5 = k26.a(ju.e, d90.i0, xq2Var2, 54);
                                        int hashCode4 = Long.hashCode(xq2Var2.T);
                                        xv4 l5 = xq2Var2.l();
                                        a74 E4 = l.E(xq2Var2, P20);
                                        jx0.i.getClass();
                                        iy0 iy0Var5 = ix0.b;
                                        xq2Var2.f0();
                                        if (xq2Var2.S) {
                                            xq2Var2.k(iy0Var5);
                                        } else {
                                            xq2Var2.o0();
                                        }
                                        yh2.K(xq2Var2, ix0.f, a5);
                                        yh2.K(xq2Var2, ix0.e, l5);
                                        yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode4));
                                        yh2.F(xq2Var2, ix0.h);
                                        yh2.K(xq2Var2, ix0.d, E4);
                                        if (k2) {
                                            xq2Var2.b0(-779131554);
                                            j6 = bl2.F(xq2Var2).l;
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                            xq2Var2.b0(-779130851);
                                            j6 = bl2.F(xq2Var2).g;
                                        }
                                        xq2Var2.p(z3);
                                        long j7 = j6;
                                        if (k2) {
                                            oj2Var = oj2.e0;
                                        } else {
                                            oj2Var = oj2.Y;
                                        }
                                        xq2 xq2Var3 = xq2Var2;
                                        x37.b(str2, new vn3(1.0f, true), j7, hi2.E(13), oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 3072, 0, 131024);
                                        boolean f6 = xq2Var3.f(str) | xq2Var3.f(eo2Var3);
                                        Object P21 = xq2Var3.P();
                                        if (f6 || P21 == vs0Var) {
                                            final eo2 eo2Var5 = eo2Var3;
                                            final qa4 qa4Var24 = qa4Var202;
                                            final qa4 qa4Var25 = qa4Var21;
                                            P21 = new on2() { // from class: eb7
                                                @Override // defpackage.on2
                                                public final Object c() {
                                                    int i5 = r5;
                                                    jg7 jg7Var2 = jg7.a;
                                                    qa4 qa4Var242 = qa4Var25;
                                                    qa4 qa4Var252 = qa4Var24;
                                                    eo2 eo2Var52 = eo2Var5;
                                                    String str3 = str;
                                                    switch (i5) {
                                                        case 0:
                                                            qa4Var252.setValue(str3);
                                                            eo2Var52.o("translator_tts_lang", str3);
                                                            qa4Var242.setValue(Boolean.FALSE);
                                                            return jg7Var2;
                                                        default:
                                                            qa4Var252.setValue(str3);
                                                            eo2Var52.o("translator_tts_lang", str3);
                                                            qa4Var242.setValue(Boolean.FALSE);
                                                            return jg7Var2;
                                                    }
                                                }
                                            };
                                            xq2Var3.l0(P21);
                                        }
                                        kd5.a(k2, (on2) P21, null, false, jx2.n(bl2.F(xq2Var3).l, bl2.F(xq2Var3).h, xq2Var3, 0, 4), xq2Var3, 0, 28);
                                        xq2Var2 = xq2Var3;
                                        xq2Var2.p(true);
                                        z5 = true;
                                        z4 = false;
                                        f3 = 1.0f;
                                        hb7Var = this;
                                    }
                                    xq2Var2.p(z4);
                                    xq2Var2.p(z5);
                                } else {
                                    xq2Var2.V();
                                }
                                return jg7Var;
                            default:
                                px0 px0Var3 = (px0) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z4 = true;
                                }
                                xq2 xq2Var4 = (xq2) px0Var3;
                                if (xq2Var4.S(intValue2 & 1, z4)) {
                                    a74 f7 = dj6.f(dj6.c(x64Var3, 1.0f), RecyclerView.B1, 420.0f, 1);
                                    gu guVar = new gu(4.0f, true, new i(1));
                                    List list = u;
                                    boolean h3 = xq2Var4.h(list);
                                    eo2 eo2Var6 = eo2Var2;
                                    boolean f8 = h3 | xq2Var4.f(eo2Var6);
                                    Object P22 = xq2Var4.P();
                                    if (f8 || P22 == vs0Var) {
                                        cn cnVar = new cn(list, eo2Var6, qa4Var11, qa4Var20, 12);
                                        xq2Var4.l0(cnVar);
                                        P22 = cnVar;
                                    }
                                    gi2.e(f7, null, null, guVar, null, null, false, null, (qn2) P22, xq2Var4, 24582, 494);
                                } else {
                                    xq2Var4.V();
                                }
                                return jg7Var;
                        }
                    }
                }, xq2Var), b4, j5, 0L, null, xq2Var, 27702);
                xq2Var.p(z);
            } else {
                context2 = context;
                xq2Var.b0(410153997);
                xq2Var.p(z);
            }
            x64 x64Var3 = x64Var;
            gi2.h(xq2Var, dj6.e(x64Var3, f2));
            a74 c3 = dj6.c(x64Var3, 1.0f);
            l26 a4 = k26.a(new gu(8.0f, true, new i(1)), d90.h0, xq2Var, 6);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E3 = l.E(xq2Var, c3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar2, a4);
            yh2.K(xq2Var, pnVar3, l4);
            i61.w(hashCode3, xq2Var, pnVar4, xq2Var, neVar);
            yh2.K(xq2Var, pnVar, E3);
            if (1.0f <= 0.0d) {
                n53.a("invalid weight; must be greater than zero");
            }
            vn3 vn3Var = new vn3(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            pq4 pq4Var = k90.a;
            mb3.a(on2Var4, vn3Var, false, null, null, null, k90.a(bl2.F(xq2Var).l, bl2.F(xq2Var).c, xq2Var, 0, 12), null, jw2.n, xq2Var, ((i3 >> 12) & 14) | 805306368, 380);
            boolean h3 = xq2Var.h(context2);
            Object P20 = xq2Var.P();
            if (h3 || P20 == obj) {
                P20 = new ej0(context2, 9);
                xq2Var.l0(P20);
            }
            on2 on2Var6 = (on2) P20;
            if (1.0f <= 0.0d) {
                n53.a("invalid weight; must be greater than zero");
            }
            mb3.a(on2Var6, new vn3(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, k90.a(bl2.F(xq2Var).e, bl2.F(xq2Var).g, xq2Var, 0, 12), null, jw2.o, xq2Var, 805306368, 380);
            xq2Var = xq2Var;
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.e(x64Var3, 24.0f));
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new c4(sharedPreferences, on2Var, on2Var2, on2Var3, on2Var4, on2Var5, i2);
        }
    }

    public static final ArrayList q(int i2, int i3, int i4) {
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

    public static void r(pk6 pk6Var, List list, ey0 ey0Var) {
        Object obj;
        cf5 cf5Var;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int c2 = pk6Var.c((sq2) list.get(i2));
                int N = pk6Var.N(pk6Var.b, pk6Var.r(c2));
                if (N < pk6Var.g(pk6Var.b, pk6Var.r(c2 + 1))) {
                    obj = pk6Var.c[pk6Var.h(N)];
                } else {
                    obj = ox0.a;
                }
                if (obj instanceof cf5) {
                    cf5Var = (cf5) obj;
                } else {
                    cf5Var = null;
                }
                if (cf5Var != null) {
                    cf5Var.a = ey0Var;
                }
            }
        }
    }

    public static void s(StringBuilder sb, Object obj, qn2 qn2Var) {
        boolean z;
        if (qn2Var != null) {
            sb.append((CharSequence) qn2Var.g(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final ee5 t(ui6 ui6Var) {
        ui6Var.getClass();
        return new ee5(ui6Var);
    }

    public static final fe5 u(in6 in6Var) {
        in6Var.getClass();
        return new fe5(in6Var);
    }

    public static final void v(long j2) {
        boolean z;
        y47[] y47VarArr = x47.b;
        if ((j2 & 1095216660480L) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r53.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final l07 w(xg1 xg1Var) {
        w07 w07Var;
        j07 j07Var = new j07();
        ii2.V(xg1Var, n07.a, new ro5(new ro5(j07Var, 17), new xj5(1, j07Var, j07.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 4)));
        ca4 ca4Var = new ca4();
        ca4 ca4Var2 = j07Var.a;
        Object[] objArr = ca4Var2.a;
        int i2 = ca4Var2.b;
        k07 k07Var = null;
        int i3 = 0;
        boolean z = true;
        k07 k07Var2 = null;
        while (true) {
            w07Var = w07.b;
            if (i3 >= i2) {
                break;
            }
            k07 k07Var3 = (k07) objArr[i3];
            if (!z || k07Var3 != w07Var) {
                if (k07Var3 != w07Var || k07Var2 != w07Var) {
                    if (k07Var3 != w07Var) {
                        ca4 ca4Var3 = j07Var.b;
                        Object[] objArr2 = ca4Var3.a;
                        int i4 = ca4Var3.b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (((Boolean) ((qn2) objArr2[i5]).g(k07Var3)).booleanValue()) {
                            }
                        }
                    }
                    ca4Var.a(k07Var3);
                    z = false;
                    k07Var2 = k07Var3;
                }
                z = false;
                break;
            }
            i3++;
        }
        if (!ca4Var.h()) {
            k07Var = ca4Var.a[ca4Var.b - 1];
        }
        if (k07Var == w07Var) {
            ca4Var.k(ca4Var.b - 1);
        }
        aa4 aa4Var = ca4Var.c;
        if (aa4Var == null) {
            aa4Var = new aa4(ca4Var, 0);
            ca4Var.c = aa4Var;
        }
        return new l07(aa4Var);
    }

    public static final String x(String str, String str2, int i2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !qs6.v0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !qs6.v0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final i34 y(fq3 fq3Var, int i2, long j2, ar4 ar4Var, long j3, lo4 lo4Var, d40 d40Var, kk3 kk3Var, int i3, p94 p94Var) {
        ArrayList arrayList;
        Object c2 = ar4Var.c(i2);
        List list = (List) p94Var.b(i2);
        if (list != null) {
            arrayList = list;
        } else {
            List b2 = fq3Var.b(i2);
            int size = b2.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList2.add(((x24) b2.get(i4)).y(j2));
            }
            p94Var.i(i2, arrayList2);
            arrayList = arrayList2;
        }
        return new i34(i2, i3, arrayList, j3, c2, lo4Var, d40Var, kk3Var);
    }

    public static u2 z(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new u2(pt0.h(view), 1);
        }
        return null;
    }
}
