package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nl2  reason: default package */
/* loaded from: classes.dex */
public abstract class nl2 {
    public static ax2 a;

    public static void A(String str, int i, int i2, int i3) {
        if (i >= i2) {
            if (i <= i3) {
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
    }

    public static void B(int i) {
        if (i >= 0) {
            return;
        }
        c44.r();
    }

    public static void C(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c44.i(str);
    }

    public static void D(String str, boolean z) {
        if (z) {
            return;
        }
        i.n(str);
    }

    public static final void E(h44 h44Var, qo0 qo0Var, Map map, et0 et0Var) {
        l54 l54Var = h44Var.g;
        l54Var.getClass();
        h44Var.i.add(new zt0((yt0) l54Var.b(hi2.x(yt0.class)), qo0Var, map, et0Var).a());
    }

    public static byte[] F(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Mac mac = (Mac) a02.f.a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr2.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr2, str));
            }
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
            byte[] bArr5 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update(bArr3);
                mac.update((byte) i2);
                bArr5 = mac.doFinal();
                if (bArr5.length + i3 < i) {
                    System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
                    i3 += bArr5.length;
                    i2++;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                    return bArr4;
                }
            }
        } else {
            f81.u("size too large");
            return null;
        }
    }

    public static StaticLayout G(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            nz2.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            nz2.a("invalid end value");
        }
        if (i3 < 0) {
            nz2.a("invalid maxLines value");
        }
        if (i < 0) {
            nz2.a("invalid width value");
        }
        if (i4 < 0) {
            nz2.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(RecyclerView.A1, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            q41.l(obtain, q41.e(q41.r(q41.d(q41.c(), i7), i8)));
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dk7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [dk7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [dk7, java.lang.Object] */
    public static dk7 H(int i) {
        if (i != 0) {
            if (i != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static final pq5 I(Context context, Class cls, String str) {
        if (!zg6.B0(str)) {
            if (!str.equals(":memory:")) {
                return new pq5(context, cls, str);
            }
            i.i("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        i.i("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final y55 J(yy3 yy3Var, boolean z, boolean z2) {
        if (!yy3Var.A.i0) {
            return y55.e;
        }
        if (!z) {
            m74 N = l.N(yy3Var, 8);
            return me2.s(N).L(N, z2);
        }
        return l.N(yy3Var, 8).u1();
    }

    public static ry3 K(ry3 ry3Var, sd3 sd3Var, ds6 ds6Var, od1 od1Var, od2 od2Var) {
        if (ry3Var != null && sd3Var == ry3Var.a && cg2.T(ds6Var, sd3Var).equals(ry3Var.b) && od1Var.b() == ry3Var.c.A && od2Var == ry3Var.d) {
            return ry3Var;
        }
        ry3 ry3Var2 = ry3.h;
        if (ry3Var2 != null && sd3Var == ry3Var2.a && cg2.T(ds6Var, sd3Var).equals(ry3Var2.b) && od1Var.b() == ry3Var2.c.A && od2Var == ry3Var2.d) {
            return ry3Var2;
        }
        ry3 ry3Var3 = new ry3(sd3Var, cg2.T(ds6Var, sd3Var), new rd1(od1Var.b(), od1Var.o()), od2Var);
        ry3.h = ry3Var3;
        return ry3Var3;
    }

    public static final ab7 L(View view) {
        ab7 ab7Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof ab7) {
                ab7Var = (ab7) tag;
            } else {
                ab7Var = null;
            }
            if (ab7Var != null) {
                return ab7Var;
            }
            ViewParent z = hk2.z(view);
            if (z instanceof View) {
                view = (View) z;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final void M(gz5 gz5Var) {
        l.P(gz5Var).F();
    }

    public static final boolean N(float[] fArr, float[] fArr2) {
        boolean z;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        int i = (f29 > RecyclerView.A1 ? 1 : (f29 == RecyclerView.A1 ? 0 : -1));
        if (i != 0) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final boolean O(lk3 lk3Var, int i) {
        int c = lk3Var.c();
        if (i <= lk3Var.e() && c <= i) {
            return true;
        }
        return false;
    }

    public static final dz2 P(String str, tu0 tu0Var, int i) {
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        if (L == su0.a) {
            L = new dz2();
            sk2Var.h0(L);
        }
        dz2 dz2Var = (dz2) L;
        dz2Var.a(sk2Var, 0);
        return dz2Var;
    }

    public static final Object Q(rm3 rm3Var, qm3 qm3Var, aj2 aj2Var, j11 j11Var) {
        Object k;
        if (qm3Var != qm3.INITIALIZED) {
            if (rm3Var.b() != qm3.DESTROYED && (k = iq2.k(new m5(rm3Var, qm3Var, aj2Var, (j11) null), j11Var)) == p31.COROUTINE_SUSPENDED) {
                return k;
            }
            return o27.a;
        }
        i.i("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final Object R(fn3 fn3Var, qm3 qm3Var, aj2 aj2Var, nk6 nk6Var) {
        Object Q = Q(fn3Var.getLifecycle(), qm3Var, aj2Var, nk6Var);
        if (Q == p31.COROUTINE_SUSPENDED) {
            return Q;
        }
        return o27.a;
    }

    public static final void S(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final String T(Context context, Boolean bool, boolean z) {
        int i;
        int i2;
        if (bool == null) {
            if (z) {
                i2 = R.string.retro_achievements_global_enabled;
            } else {
                i2 = R.string.retro_achievements_global_disabled;
            }
            String string = context.getString(i2);
            string.getClass();
            return string;
        } else if (bool.equals(Boolean.TRUE)) {
            if (z) {
                i = R.string.retro_achievements_enabled;
            } else {
                i = R.string.retro_achievements_enabled_global_disabled;
            }
            String string2 = context.getString(i);
            string2.getClass();
            return string2;
        } else if (bool.equals(Boolean.FALSE)) {
            String string3 = context.getString(R.string.retro_achievements_disabled);
            string3.getClass();
            return string3;
        } else {
            i.c();
            return null;
        }
    }

    public static void U(View view, gv3 gv3Var) {
        fo1 fo1Var = gv3Var.B.c;
        if (fo1Var != null && fo1Var.a) {
            float f = RecyclerView.A1;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += ((View) parent).getElevation();
            }
            ev3 ev3Var = gv3Var.B;
            if (ev3Var.m != f) {
                ev3Var.m = f;
                gv3Var.s();
            }
        }
    }

    public static final String V(byte[] bArr) {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
        digest.getClass();
        return nu.x0(digest, new n44(4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.p31 W(java.lang.Throwable r5, defpackage.j11 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ac3
            if (r0 == 0) goto L13
            r0 = r6
            ac3 r0 = (defpackage.ac3) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ac3 r0 = new ac3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L31
            r5 = 0
            if (r2 == r3) goto L2a
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r5
        L2a:
            defpackage.me2.a0(r6)
            defpackage.f81.c()
            return r5
        L31:
            defpackage.me2.a0(r6)
            r0.X = r3
            bb1 r6 = defpackage.tg1.a
            e31 r2 = r0.B
            r2.getClass()
            qj2 r3 = new qj2
            r4 = 8
            r3.<init>(r4, r0, r5)
            r6.j0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl2.W(java.lang.Throwable, j11):p31");
    }

    public static final long X(long j, long j2, long j3, String str) {
        String str2;
        int i = bm6.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long p0 = gh6.p0(str2);
        if (p0 != null) {
            long longValue = p0.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            ej6.k(sb, "..", j3, ", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int Y(int i, int i2, String str) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = Preference.DEFAULT_ORDER;
        } else {
            i3 = 2097150;
        }
        return (int) X(i, 1L, i3, str);
    }

    public static final String Z(int i) {
        iq2.g(16);
        return io2.r0(16, i & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.zy3 r62, defpackage.ih4 r63, final defpackage.rg5 r64, final defpackage.jj5 r65, final defpackage.mi2 r66, defpackage.ki2 r67, defpackage.tu0 r68, int r69) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl2.a(zy3, ih4, rg5, jj5, mi2, ki2, tu0, int):void");
    }

    public static String a0(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        if (i == 3) {
            return "Decal";
        }
        return "Unknown";
    }

    public static final boolean b(VideoRenderer videoRenderer, VideoFiltering videoFiltering) {
        if (ij5.a[videoRenderer.ordinal()] == 3) {
            return videoFiltering.isSupportedByVulkan();
        }
        return videoFiltering.isSupportedByOpenGlSurface();
    }

    public static final String b0(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            if (f < RecyclerView.A1) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }

    public static final String c(Context context, String str) {
        String string = context.getString(R.string.use_global_preference_with_value, str);
        string.getClass();
        return string;
    }

    public static final e17 c0(int i, String str) {
        r17 d0 = d0(i, str);
        if (d0 != null) {
            int i2 = d0.A;
            if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147483393) <= 0) {
                return new e17((byte) i2);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [r42, java.lang.Object] */
    public static final void d(p96 p96Var, zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        boolean h;
        int i5;
        et0 et0Var = l.e;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1354335728);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = sk2Var.f(p96Var);
            } else {
                h = sk2Var.h(p96Var);
            }
            if (h) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(et0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            Object L = sk2Var.L();
            Object obj = L;
            if (L == su0.a) {
                ?? obj2 = new Object();
                obj2.a = new Object();
                obj2.b = new ArrayList();
                sk2Var.h0(obj2);
                obj = obj2;
            }
            r42 r42Var = (r42) obj;
            String H = cg2.H(sk2Var, 7);
            Object obj3 = r42Var.a;
            ArrayList arrayList = r42Var.b;
            if (!b53.x(p96Var, obj3)) {
                sk2Var.X(93279711);
                r42Var.a = p96Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList2.add((p96) ((q42) arrayList.get(i6)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(p96Var)) {
                    arrayList3.add(p96Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    Object obj4 = arrayList3.get(i7);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                int i8 = 0;
                while (i8 < size3) {
                    p96 p96Var2 = (p96) arrayList4.get(i8);
                    arrayList.add(new q42(p96Var2, ct3.H0(-1032415134, new u3(p96Var2, p96Var, arrayList3, r42Var, H, 4), sk2Var)));
                    i8++;
                    z3 = z3;
                }
                z2 = z3;
                sk2Var.p(false);
            } else {
                z2 = true;
                sk2Var.X(95881138);
                sk2Var.p(false);
            }
            tv3 d = d50.d(y60.L, false);
            int j0 = dt3.j0(sk2Var);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            dn dnVar = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar);
            }
            oo2.S(sk2Var, mu0.d, e0);
            m55 x = sk2Var.x();
            if (x != null) {
                x.b |= 1;
                r42Var.c = x;
                sk2Var.X(-1757732554);
                int size4 = arrayList.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    q42 q42Var = (q42) arrayList.get(i9);
                    p96 p96Var3 = (p96) q42Var.a;
                    et0 et0Var2 = q42Var.b;
                    sk2Var.V(-1515535286, p96Var3);
                    et0Var2.i(ct3.H0(2017516783, new m96(p96Var3, 0), sk2Var), sk2Var, 6);
                    sk2Var.p(false);
                }
                sk2Var.p(false);
                sk2Var.p(z2);
            } else {
                i.n("no recompose scope found");
                return;
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(i, 11, p96Var, zy3Var);
        }
    }

    public static final r17 d0(int i, String str) {
        int i2;
        iq2.g(i);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            if (b53.E(charAt, 48) < 0) {
                i2 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i2 = 0;
            }
            int i4 = 119304647;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    int i5 = i3 ^ Integer.MIN_VALUE;
                    if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                        if (i4 == 119304647) {
                            i4 = (int) (4294967295L / (i & 4294967295L));
                            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i6 = i3 * i;
                    int i7 = digit + i6;
                    if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                        return null;
                    }
                    i2++;
                    i3 = i7;
                } else {
                    return null;
                }
            }
            return new r17(i3);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x029c, code lost:
        if (r3 == r2) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.nd3 r45, boolean r46, defpackage.ki2 r47, defpackage.ki2 r48, defpackage.ki2 r49, defpackage.tu0 r50, int r51) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl2.e(nd3, boolean, ki2, ki2, ki2, tu0, int):void");
    }

    public static final w17 e0(String str) {
        str.getClass();
        int i = 10;
        iq2.g(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (b53.E(charAt, 48) < 0) {
                i2 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            }
            long j = 0;
            long j2 = 512409557603043100L;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    long j3 = j ^ Long.MIN_VALUE;
                    int i3 = length;
                    if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                        if (j2 == 512409557603043100L && Long.compare(j3, -7378697629483820647L) <= 0) {
                            j2 = 1844674407370955161L;
                        } else {
                            return null;
                        }
                    }
                    long j4 = j * 10;
                    long j5 = (digit & 4294967295L) + j4;
                    if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i2++;
                    j = j5;
                    length = i3;
                    i = 10;
                } else {
                    return null;
                }
            }
            return new w17(j);
        }
        return null;
    }

    public static final void f(s00 s00Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        s00 s00Var2;
        ki2 ki2Var2;
        sk2 sk2Var;
        int i4;
        UUID uuid;
        gt3 gt3Var;
        sn1 sn1Var;
        s00Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-1859478006);
        if (sk2Var2.h(s00Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (sk2Var2.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i6 & 1, z)) {
            Context context = (Context) sk2Var2.j(ue.b);
            k24 x = l.x(s00Var.d, sk2Var2);
            k24 x2 = l.x(s00Var.f(), sk2Var2);
            b9 b9Var = new b9(4);
            Object L = sk2Var2.L();
            sn1 sn1Var2 = su0.a;
            if (L == sn1Var2) {
                L = new qu1(27);
                sk2Var2.h0(L);
            }
            gt3 z2 = tq5.z(b9Var, (mi2) L, sk2Var2, 48);
            List list = (List) x.getValue();
            if (list == null) {
                list = pp1.A;
            }
            List list2 = list;
            UUID uuid2 = ((oy5) x2.getValue()).a;
            boolean h = sk2Var2.h(s00Var);
            Object L2 = sk2Var2.L();
            if (!h && L2 != sn1Var2) {
                uuid = uuid2;
                sn1Var = sn1Var2;
                i4 = 18;
                gt3Var = z2;
            } else {
                uuid = uuid2;
                i4 = 18;
                gt3Var = z2;
                sn1Var = sn1Var2;
                z zVar = new z(1, s00Var, s00.class, "setSelectedLayoutId", "setSelectedLayoutId(Ljava/util/UUID;)V", 0, 0, 25);
                sk2Var2.h0(zVar);
                L2 = zVar;
            }
            mi2 mi2Var = (mi2) ((lj2) L2);
            boolean h2 = sk2Var2.h(context) | sk2Var2.h(gt3Var);
            Object L3 = sk2Var2.L();
            if (h2 || L3 == sn1Var) {
                L3 = new e61(context, gt3Var, 2);
                sk2Var2.h0(L3);
            }
            ki2 ki2Var3 = (ki2) L3;
            boolean h3 = sk2Var2.h(context) | sk2Var2.h(gt3Var);
            Object L4 = sk2Var2.L();
            if (h3 || L4 == sn1Var) {
                L4 = new gi2(9, context, gt3Var);
                sk2Var2.h0(L4);
            }
            mi2 mi2Var2 = (mi2) L4;
            boolean h4 = sk2Var2.h(s00Var);
            Object L5 = sk2Var2.L();
            if (h4 || L5 == sn1Var) {
                z zVar2 = new z(1, s00Var, s00.class, "deleteLayout", "deleteLayout(Lme/magnum/melonds/domain/model/layout/LayoutConfiguration;)V", 0, 0, 26);
                sk2Var2.h0(zVar2);
                L5 = zVar2;
            }
            mi2 mi2Var3 = (mi2) ((lj2) L5);
            boolean h5 = sk2Var2.h(s00Var);
            Object L6 = sk2Var2.L();
            if (!h5 && L6 != sn1Var) {
                s00Var2 = s00Var;
            } else {
                z zVar3 = new z(1, s00Var, s00.class, "addLayout", "addLayout(Lme/magnum/melonds/domain/model/layout/LayoutConfiguration;)V", 0, 0, 27);
                s00Var2 = s00Var;
                sk2Var2.h0(zVar3);
                L6 = zVar3;
            }
            ki2Var2 = ki2Var;
            sk2Var = sk2Var2;
            g(list2, uuid, mi2Var, ki2Var3, mi2Var2, mi2Var3, (mi2) ((lj2) L6), ki2Var2, sk2Var, 29360128 & (i6 << 18));
        } else {
            s00Var2 = s00Var;
            ki2Var2 = ki2Var;
            sk2Var = sk2Var2;
            i4 = 18;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, i4, s00Var2, ki2Var2);
        }
    }

    public static final void g(List list, UUID uuid, mi2 mi2Var, ki2 ki2Var, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4, ki2 ki2Var2, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        r96 r96Var;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(517665124);
        if ((i & 6) == 0) {
            if (sk2Var.h(list)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(uuid)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(mi2Var)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.h(ki2Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.h(mi2Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.h(mi2Var3)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (sk2Var.h(mi2Var4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (sk2Var.h(ki2Var2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((4793491 & i2) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (L == obj) {
                L = new r96();
                sk2Var.h0(L);
            }
            r96 r96Var2 = (r96) L;
            tu5 d = ru5.d(r96Var2, sk2Var, 1);
            Object L2 = sk2Var.L();
            if (L2 == obj) {
                L2 = new wc2();
                sk2Var.h0(L2);
            }
            wc2 wc2Var = (wc2) L2;
            Object L3 = sk2Var.L();
            if (L3 == obj) {
                i3 = i2;
                r96Var = r96Var2;
                L3 = d46.b(0, 10, h60.DROP_OLDEST, 1);
                sk2Var.h0(L3);
            } else {
                i3 = i2;
                r96Var = r96Var2;
            }
            h24 h24Var = (h24) L3;
            Object L4 = sk2Var.L();
            if (L4 == obj) {
                L4 = new kl0(wc2Var, null, 1);
                sk2Var.h0(L4);
            }
            l.g(sk2Var, (aj2) L4, o27.a);
            ep2.h(me2.X(sk2Var, R.string.layouts), ki2Var2, null, null, ct3.H0(-45140653, new s4(19, ki2Var, mj2.C(sk2Var)), sk2Var), d, ct3.H0(-889983848, new zg3(wc2Var, list, uuid, mi2Var, mi2Var2, h24Var, mi2Var3), sk2Var), sk2Var, ((i3 >> 18) & 112) | 1597440, 12);
            Object obj2 = (Resources) sk2Var.j(ue.c);
            boolean h = sk2Var.h(h24Var) | sk2Var.h(obj2);
            if ((i3 & 3670016) == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = h | z2;
            Object L5 = sk2Var.L();
            if (z3 || L5 == obj) {
                Object m5Var = new m5(h24Var, r96Var, obj2, mi2Var4, null, 18);
                sk2Var.h0(m5Var);
                L5 = m5Var;
            }
            l.g(sk2Var, (aj2) L5, h24Var);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w4(list, uuid, mi2Var, ki2Var, mi2Var2, mi2Var3, mi2Var4, ki2Var2, i);
        }
    }

    public static final void h(zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1625210322);
        if (sk2Var.f(zy3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            tv3 d = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            yu4.a(y60.n0.i(wy3.a, y60.Z), ((hr0) sk2Var.j(ir0.a)).i(), RecyclerView.A1, 0L, 0, sk2Var, 0, 28);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ez(zy3Var, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final defpackage.oq6 r29, final defpackage.mi2 r30, final defpackage.zy3 r31, boolean r32, defpackage.ds6 r33, final defpackage.aj2 r34, final defpackage.aj2 r35, final boolean r36, defpackage.uc7 r37, final defpackage.fb3 r38, defpackage.db3 r39, boolean r40, int r41, int r42, defpackage.y26 r43, final defpackage.yb1 r44, defpackage.tu0 r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl2.i(oq6, mi2, zy3, boolean, ds6, aj2, aj2, boolean, uc7, fb3, db3, boolean, int, int, y26, yb1, tu0, int, int, int):void");
    }

    public static final void j(zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        zy3 zy3Var2;
        et0 et0Var2;
        int i3;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(790527681);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
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
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                tj4 tj4Var = new tj4(null, k45.f0);
                sk2Var.h0(tj4Var);
                L = tj4Var;
            }
            k24 k24Var = (k24) L;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = new f4(k24Var, 29);
                sk2Var.h0(L2);
            }
            ki2 ki2Var = (ki2) L2;
            dr4 dr4Var = xb1.a;
            n10 j = dk7.j(w81.l, sk2Var, 6);
            zy3Var2 = zy3Var;
            et0Var2 = et0Var;
            dk7.b(new dq[]{ko6.b.a(n40.b0(ki2Var, sk2Var, 2)), ko6.a.a(j)}, ct3.H0(1070596993, new b4(zy3Var2, k24Var, et0Var2, j, ki2Var), sk2Var), sk2Var, 56);
        } else {
            zy3Var2 = zy3Var;
            et0Var2 = et0Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new wl(zy3Var2, et0Var2, i, 4);
        }
    }

    public static final void k(zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(155925518);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
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
            if (sk2Var.j(ko6.a) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (sk2Var.j(ko6.b) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                sk2Var.X(-1977187922);
                tv3 d = d50.d(y60.L, true);
                int hashCode = Long.hashCode(sk2Var.T);
                sm4 l = sk2Var.l();
                zy3 e0 = l07.e0(sk2Var, zy3Var);
                nu0.i.getClass();
                mv0 mv0Var = mu0.b;
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, mu0.f, d);
                oo2.S(sk2Var, mu0.e, l);
                oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                oo2.P(sk2Var, mu0.h);
                oo2.S(sk2Var, mu0.d, e0);
                et0Var.j(sk2Var, Integer.valueOf((i2 >> 3) & 14));
                sk2Var.p(true);
                sk2Var.p(false);
            } else if (z2) {
                sk2Var.X(-1976997706);
                n40.z(zy3Var, et0Var, sk2Var, i2 & 126);
                sk2Var.p(false);
            } else if (z3) {
                sk2Var.X(-1976846922);
                xb1.d(zy3Var, et0Var, sk2Var, i2 & 126);
                sk2Var.p(false);
            } else {
                sk2Var.X(-1976716505);
                j(zy3Var, et0Var, sk2Var, i2 & 126);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new wl(zy3Var, et0Var, i, 3);
        }
    }

    public static final void l(zy3 zy3Var, ih4 ih4Var, rg5 rg5Var, mj5 mj5Var, mi2 mi2Var, ki2 ki2Var, aj2 aj2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        zy3Var.getClass();
        ih4Var.getClass();
        rg5Var.getClass();
        mj5Var.getClass();
        mi2Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1562456105);
        if (sk2Var.f(zy3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (sk2Var.f(ih4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (sk2Var.h(rg5Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (sk2Var.f(mj5Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (sk2Var.h(ki2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (sk2Var.h(aj2Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i15 & 1, z)) {
            dk7.a(wi5.a.a(aj2Var), ct3.H0(-1152441111, new c4(mj5Var, zy3Var, ih4Var, rg5Var, mi2Var, ki2Var), sk2Var), sk2Var, 56);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new xl0(zy3Var, ih4Var, rg5Var, mj5Var, mi2Var, ki2Var, aj2Var, i);
        }
    }

    public static final void m(r96 r96Var, zy3 zy3Var, bj2 bj2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        wy3 wy3Var;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1351125615);
        if ((i & 6) == 0) {
            if (sk2Var.f(r96Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            bj2Var = l.e;
            p96 p96Var = (p96) r96Var.b.getValue();
            g2 g2Var = (g2) sk2Var.j(ov0.a);
            boolean h = sk2Var.h(p96Var) | sk2Var.h(g2Var);
            Object L = sk2Var.L();
            if (h || L == su0.a) {
                L = new v74(p96Var, g2Var, null, 18);
                sk2Var.h0(L);
            }
            l.g(sk2Var, (aj2) L, p96Var);
            wy3 wy3Var2 = wy3.a;
            d((p96) r96Var.b.getValue(), wy3Var2, sk2Var, i4 & 1008);
            wy3Var = wy3Var2;
        } else {
            sk2Var.R();
            wy3Var = zy3Var;
        }
        bj2 bj2Var2 = bj2Var;
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(r96Var, wy3Var, bj2Var2, i, 20);
        }
    }

    public static final long n(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final y55 o(xn4 xn4Var, int i, uw6 uw6Var, lr6 lr6Var, boolean z, int i2) {
        y55 y55Var;
        float f;
        float f2;
        if (lr6Var != null) {
            y55Var = lr6Var.c(uw6Var.b.r(i));
        } else {
            y55Var = y55.e;
        }
        float f3 = y55Var.a;
        int Y = xn4Var.Y(2.0f);
        if (z) {
            f = (i2 - f3) - Y;
        } else {
            f = f3;
        }
        if (z) {
            f2 = i2 - f3;
        } else {
            f2 = Y + f3;
        }
        return new y55(f, y55Var.b, f2, y55Var.d);
    }

    public static final Long p(n35 n35Var) {
        if (b53.x(n35Var, k35.a)) {
            return null;
        }
        if (n35Var instanceof j35) {
            return Long.valueOf(((j35) n35Var).a);
        }
        if (n35Var instanceof m35) {
            return Long.valueOf(((m35) n35Var).a);
        }
        if (n35Var instanceof l35) {
            return Long.valueOf(((l35) n35Var).a);
        }
        i.c();
        return null;
    }

    public static final String q(Object[] objArr, int i, int i2, c1 c1Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == c1Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final i35 r(c35 c35Var) {
        int i = h35.a[c35Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return i35.TERMINAL_EXIT;
            }
            i.c();
            return null;
        }
        return i35.RESUMABLE_EXIT;
    }

    public static final az2 s(dz2 dz2Var, float f, float f2, zy2 zy2Var, String str, tu0 tu0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return v(dz2Var, Float.valueOf(f), Float.valueOf(f2), dt3.g0, zy2Var, str, tu0Var, (i & 1022) | 32768 | ((i << 3) & 458752), 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(11:18|19|20|21|22|23|24|25|(3:27|28|29)|13|14))(6:92|(1:94)|95|96|97|(11:99|100|(1:102)(1:105)|103|104|23|24|25|(0)|13|14)(2:106|107))))|113|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[Catch: r53 -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #3 {r53 -> 0x01a1, blocks: (B:35:0x00bf, B:42:0x00dd, B:56:0x0102, B:58:0x0116, B:62:0x012b, B:66:0x0133), top: B:108:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020f  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, l75] */
    /* JADX WARN: Type inference failed for: r20v1, types: [k75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [j75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, n75] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x017c -> B:76:0x0185). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.lk3 r27, int r28, int r29, defpackage.od1 r30, defpackage.k11 r31) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl2.t(lk3, int, int, od1, k11):java.lang.Object");
    }

    public static final boolean u(boolean z, lk3 lk3Var, int i) {
        if (z) {
            if (lk3Var.c() <= i) {
                if (lk3Var.c() == i && lk3Var.d() > 0) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (lk3Var.c() >= i) {
            if (lk3Var.c() == i && lk3Var.d() < 0) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    public static final az2 v(dz2 dz2Var, Number number, Number number2, bz6 bz6Var, zy2 zy2Var, String str, tu0 tu0Var, int i, int i2) {
        dz2 dz2Var2;
        Number number3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (L == sn1Var) {
            dz2Var2 = dz2Var;
            az2 az2Var = new az2(dz2Var2, number, number2, bz6Var, zy2Var);
            number3 = number2;
            sk2Var.h0(az2Var);
            L = az2Var;
        } else {
            dz2Var2 = dz2Var;
            number3 = number2;
        }
        az2 az2Var2 = (az2) L;
        boolean z2 = true;
        if ((((i & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) > 256 && sk2Var.h(number3)) || (i & RendererDebugBridge.CAPTURE_HEIGHT) == 256) {
            z = true;
        } else {
            z = false;
        }
        if ((((57344 & i) ^ 24576) <= 16384 || !sk2Var.h(zy2Var)) && (i & 24576) != 16384) {
            z2 = false;
        }
        boolean z3 = z | z2;
        Object L2 = sk2Var.L();
        if (z3 || L2 == sn1Var) {
            yc0 yc0Var = new yc0(number, az2Var2, number3, zy2Var, 3);
            sk2Var.h0(yc0Var);
            L2 = yc0Var;
        }
        l.j((ki2) L2, sk2Var);
        boolean h = sk2Var.h(dz2Var2);
        Object L3 = sk2Var.L();
        if (h || L3 == sn1Var) {
            L3 = new gi2(5, dz2Var2, az2Var2);
            sk2Var.h0(L3);
        }
        l.d(az2Var2, (mi2) L3, sk2Var);
        return az2Var2;
    }

    public static final Object w(y80 y80Var, j11 j11Var) {
        ih0 ih0Var = new ih0(1, nk2.J(j11Var));
        ih0Var.x();
        ih0Var.z(new yb3(y80Var, 0));
        y80Var.d(new zb3(ih0Var, 0));
        Object v = ih0Var.v();
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return v;
    }

    public static final Object x(y80 y80Var, j11 j11Var) {
        ih0 ih0Var = new ih0(1, nk2.J(j11Var));
        ih0Var.x();
        ih0Var.z(new yb3(y80Var, 1));
        y80Var.d(new zb3(ih0Var, 1));
        Object v = ih0Var.v();
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return v;
    }

    public static void y(String str, boolean z) {
        if (z) {
            return;
        }
        i.i(str);
    }

    public static void z(boolean z) {
        if (z) {
            return;
        }
        c44.r();
    }
}
