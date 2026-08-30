package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nk2  reason: default package */
/* loaded from: classes.dex */
public abstract class nk2 {
    public static ax2 a;
    public static ax2 b;
    public static ax2 c;

    public static byte A(short s, int i) {
        int i2 = ((byte) (((s & 65535) >> i) & 31)) & 255;
        return (byte) (((i2 << 3) + (i2 >> 2)) & 255);
    }

    public static ColorStateList B(Context context, n85 n85Var, int i) {
        int resourceId;
        ColorStateList x;
        TypedArray typedArray = (TypedArray) n85Var.L;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (x = jv3.x(context, resourceId)) != null) {
            return x;
        }
        return n85Var.e(i);
    }

    public static ColorStateList C(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList x;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (x = jv3.x(context, resourceId)) != null) {
            return x;
        }
        return typedArray.getColorStateList(i);
    }

    public static Drawable D(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable M;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (M = l07.M(context, resourceId)) != null) {
            return M;
        }
        return typedArray.getDrawable(i);
    }

    public static final ax2 E() {
        ax2 ax2Var = a;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new rk4(8.59f, 16.59f));
        arrayList.add(new qk4(13.17f, 12.0f));
        arrayList.add(new qk4(8.59f, 7.41f));
        arrayList.add(new qk4(10.0f, 6.0f));
        arrayList.add(new yk4(6.0f, 6.0f));
        arrayList.add(new yk4(-6.0f, 6.0f));
        arrayList.add(new yk4(-1.41f, -1.41f));
        arrayList.add(nk4.c);
        zw2.a(zw2Var, arrayList, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        a = b2;
        return b2;
    }

    public static final Object F(ez5 ez5Var, qz5 qz5Var) {
        Object g = ez5Var.A.g(qz5Var);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static Bitmap G(InputStream inputStream) {
        byte[] bArr;
        int i;
        a0(inputStream, 104L);
        inputStream.read(new byte[4]);
        a0(inputStream, q(0, bArr) - 76);
        byte[] bArr2 = new byte[512];
        inputStream.read(bArr2);
        byte[] bArr3 = new byte[32];
        inputStream.read(bArr3);
        short[] sArr = new short[16];
        for (int i2 = 0; i2 < 16; i2++) {
            int i3 = i2 * 2;
            sArr[i2] = (short) ((255 & bArr3[i3]) | ((bArr3[i3 + 1] & 255) << 8));
        }
        int[] iArr = new int[16];
        for (int i4 = 0; i4 < 16; i4++) {
            short s = sArr[i4];
            int A = A(s, 0) & 255;
            int A2 = A(s, 5) & 255;
            int A3 = A(s, 10) & 255;
            if (i4 == 0) {
                i = 0;
            } else {
                i = 255;
            }
            iArr[i4] = Color.argb(i, A, A2, A3);
        }
        int[] iArr2 = new int[1024];
        for (int i5 = 0; i5 < 4; i5++) {
            for (int i6 = 0; i6 < 4; i6++) {
                for (int i7 = 0; i7 < 32; i7++) {
                    byte b2 = bArr2[(((i5 * 4) + i6) * 32) + i7];
                    int i8 = (((byte) (b2 & (-16))) & 255) >> 4;
                    int i9 = b2 & 15;
                    int i10 = (((i7 / 4) + (i5 * 8)) * 32) + ((i7 % 4) * 2) + (i6 * 8);
                    if (i9 == 0) {
                        iArr2[i10] = 0;
                    } else {
                        iArr2[i10] = iArr[i9];
                    }
                    if (i8 == 0) {
                        iArr2[i10 + 1] = 0;
                    } else {
                        iArr2[i10 + 1] = iArr[i8];
                    }
                }
            }
        }
        byte[] bArr4 = new byte[4096];
        for (int i11 = 0; i11 < 1024; i11++) {
            int i12 = iArr2[i11];
            int i13 = i11 * 4;
            bArr4[i13] = (byte) ((i12 >> 16) & 255);
            bArr4[i13 + 1] = (byte) ((i12 >> 8) & 255);
            bArr4[i13 + 2] = (byte) (i12 & 255);
            bArr4[i13 + 3] = (byte) ((i12 >> 24) & 255);
        }
        Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr4));
        return createBitmap;
    }

    public static wm5 H(rg5 rg5Var, InputStream inputStream) {
        rg5Var.getClass();
        int i = 512;
        byte[] bArr = new byte[512];
        if (inputStream.read(bArr) < 512) {
            return null;
        }
        int i2 = 0;
        String d0 = gh6.d0(0, 12, 5, bArr);
        String d02 = gh6.d0(12, 16, 4, bArr);
        int i3 = -1;
        while (true) {
            int i4 = i - 1;
            if (i > 0) {
                i3 = (i3 >>> 8) ^ w81.m[(bArr[i2] ^ i3) & 255];
                i2++;
                i = i4;
            } else {
                return new wm5(i3, d02, d0, rg5Var.a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zo5 I(java.io.InputStream r15) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk2.I(java.io.InputStream):zo5");
    }

    public static j11 J(j11 j11Var) {
        k11 k11Var;
        j11 j11Var2;
        j11Var.getClass();
        if (j11Var instanceof k11) {
            k11Var = (k11) j11Var;
        } else {
            k11Var = null;
        }
        if (k11Var != null && (j11Var = k11Var.L) == null) {
            g31 g31Var = (g31) k11Var.a().I(k45.Y);
            if (g31Var != null) {
                j11Var2 = new jg1(g31Var, k11Var);
            } else {
                j11Var2 = k11Var;
            }
            k11Var.L = j11Var2;
            return j11Var2;
        }
        return j11Var;
    }

    public static boolean K(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static final boolean L(float f, float f2, vi viVar) {
        y55 y55Var = new y55(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        vi a2 = zi.a();
        vi.b(a2, y55Var);
        vi a3 = zi.a();
        a3.f(viVar, a2, 1);
        boolean isEmpty = a3.a.isEmpty();
        a3.g();
        a2.g();
        return !isEmpty;
    }

    public static boolean M() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static final boolean N(Throwable th) {
        String message;
        if (!(th instanceof p37) || (message = ((p37) th).getMessage()) == null) {
            return false;
        }
        if (!zg6.q0(message, "Unpromoted_achievements_cannot_be_unlocked", true) && (!zg6.q0(message, "\"Code\":\"invalid_state\"", true) || !zg6.q0(message, "Unpromoted", true))) {
            return false;
        }
        return true;
    }

    public static final boolean O(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static Typeface P(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, me2.k(i3 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final void Q(yy3 yy3Var, ki2 ki2Var) {
        n94 n94Var = yy3Var.Z;
        if (n94Var == null) {
            n94Var = new n94((m94) yy3Var);
            yy3Var.Z = n94Var;
        }
        yg4 snapshotObserver = ((ee) l.Q(yy3Var)).getSnapshotObserver();
        snapshotObserver.a.d(n94Var, qc2.d0, ki2Var);
    }

    public static final long R(oy2 oy2Var, jf4 jf4Var, ny2 ny2Var, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        long j = oy2Var.g;
        if (jf4Var != null) {
            int i = ny2Var.a;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            if (jf4Var == jf4.Horizontal) {
                floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.A1);
                floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat) << 32;
            } else {
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits2 = Float.floatToRawIntBits(RecyclerView.A1) << 32;
            }
            j = floatToRawIntBits2 | (floatToRawIntBits & 4294967295L);
        }
        long d = mb4.d(S(oy2Var, jf4Var, ny2Var), j);
        if (!z && oy2Var.i) {
            return 0L;
        }
        return d;
    }

    public static final long S(oy2 oy2Var, jf4 jf4Var, ny2 ny2Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        if (jf4Var == null) {
            return oy2Var.c;
        }
        int i = ny2Var.a;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (oy2Var.c >> 32));
        } else if (i == 2) {
            intBitsToFloat = Float.intBitsToFloat((int) (oy2Var.c & 4294967295L));
        } else {
            return oy2Var.c;
        }
        if (jf4Var == jf4.Horizontal) {
            floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.A1);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat) << 32;
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits2 = Float.floatToRawIntBits(RecyclerView.A1) << 32;
        }
        return floatToRawIntBits2 | (4294967295L & floatToRawIntBits);
    }

    public static final void T(Bundle bundle, String str, List list) {
        ArrayList<String> arrayList;
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = new ArrayList<>(list);
        }
        bundle.putStringArrayList(str, arrayList);
    }

    public static final boolean U(VideoRenderer videoRenderer, boolean z) {
        videoRenderer.getClass();
        int i = ba5.a[videoRenderer.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                z2 = false;
                if (i != 3 && i != 4) {
                    i.c();
                }
            }
            return z2;
        }
        return z;
    }

    public static void V(Runnable runnable) {
        if (M()) {
            runnable.run();
        } else {
            nl2.D("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int W(int r7, java.lang.CharSequence r8) {
        /*
            int r0 = r8.length()
            r1 = -1
            if (r7 < r0) goto L8
            return r1
        L8:
            char r0 = r8.charAt(r7)
            r2 = 92
            r3 = 60
            if (r0 != r3) goto L39
        L12:
            int r7 = r7 + 1
            int r0 = r8.length()
            if (r7 >= r0) goto L38
            char r0 = r8.charAt(r7)
            r4 = 10
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            r4 = 62
            if (r0 == r4) goto L35
            if (r0 == r2) goto L2b
            goto L12
        L2b:
            int r0 = r7 + 1
            boolean r4 = defpackage.mj2.I(r0, r8)
            if (r4 == 0) goto L12
            r7 = r0
            goto L12
        L35:
            int r7 = r7 + 1
            return r7
        L38:
            return r1
        L39:
            r0 = 0
            r3 = r7
        L3b:
            int r4 = r8.length()
            if (r3 >= r4) goto L79
            char r4 = r8.charAt(r3)
            if (r4 == 0) goto L75
            r5 = 32
            if (r4 == r5) goto L75
            if (r4 == r2) goto L69
            r6 = 40
            if (r4 == r6) goto L64
            r5 = 41
            if (r4 == r5) goto L5e
            boolean r4 = java.lang.Character.isISOControl(r4)
            if (r4 == 0) goto L72
            if (r3 == r7) goto L78
            goto L77
        L5e:
            if (r0 != 0) goto L61
            goto L77
        L61:
            int r0 = r0 + (-1)
            goto L72
        L64:
            int r0 = r0 + 1
            if (r0 <= r5) goto L72
            goto L78
        L69:
            int r4 = r3 + 1
            boolean r5 = defpackage.mj2.I(r4, r8)
            if (r5 == 0) goto L72
            r3 = r4
        L72:
            int r3 = r3 + 1
            goto L3b
        L75:
            if (r3 == r7) goto L78
        L77:
            return r3
        L78:
            return r1
        L79:
            int r7 = r8.length()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk2.W(int, java.lang.CharSequence):int");
    }

    public static int X(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!mj2.I(i2, charSequence)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int Y(CharSequence charSequence, int i, char c2) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (mj2.I(i2, charSequence)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c2) {
                return i;
            }
            if (c2 == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final long Z(y55 y55Var) {
        float f = y55Var.c - y55Var.a;
        float f2 = y55Var.d - y55Var.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0512  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.util.Map r51, final java.lang.Character r52, final boolean r53, final boolean r54, final defpackage.ki2 r55, final defpackage.aj2 r56, final defpackage.zy3 r57, defpackage.tu0 r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk2.a(java.util.Map, java.lang.Character, boolean, boolean, ki2, aj2, zy3, tu0, int):void");
    }

    public static void a0(InputStream inputStream, long j) {
        byte[] bArr = new byte[1024];
        do {
            int read = inputStream.read(bArr, 0, (int) Math.min(j, 1024L));
            if (read > 0) {
                j -= read;
            } else {
                return;
            }
        } while (j > 0);
    }

    public static final void b(final List list, final boolean z, final boolean z2, final boolean z3, final ki2 ki2Var, zy3 zy3Var, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z4;
        sk2 sk2Var;
        final wy3 wy3Var;
        boolean z5;
        String S0;
        int i6;
        int i7;
        ki2Var.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-919742006);
        if (sk2Var2.h(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (sk2Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (sk2Var2.g(z3)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (sk2Var2.h(ki2Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5 | 196608;
        if ((74771 & i11) != 74770) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (sk2Var2.O(i11 & 1, z4)) {
            if (!z3) {
                m55 r = sk2Var2.r();
                if (r != null) {
                    r.d = new aj2(list, z, z2, z3, ki2Var, i) { // from class: zg5
                        public final /* synthetic */ List A;
                        public final /* synthetic */ boolean B;
                        public final /* synthetic */ boolean L;
                        public final /* synthetic */ boolean R;
                        public final /* synthetic */ ki2 X;

                        @Override // defpackage.aj2
                        public final Object j(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ep2.I(1);
                            nk2.b(this.A, this.B, this.L, this.R, this.X, wy3.a, (tu0) obj, I);
                            return o27.a;
                        }
                    };
                    return;
                }
                return;
            }
            jd7 C = mj2.C(sk2Var2);
            wy3 wy3Var2 = wy3.a;
            zy3 Y = b53.Y(o76.c(wy3Var2, 1.0f), 16.0f, 8.0f);
            i20 i20Var = y60.h0;
            lt ltVar = rt.a;
            sr5 a2 = rr5.a(ltVar, i20Var, sk2Var2, 48);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l = sk2Var2.l();
            zy3 e0 = l07.e0(sk2Var2, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var2.b0();
            if (sk2Var2.S) {
                sk2Var2.k(mv0Var);
            } else {
                sk2Var2.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var2, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var2, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var2, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var2, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var2, dnVar4, e0);
            if (z && !z3) {
                sk2Var2.X(-2031026150);
                zy3 b0 = b53.b0(a53.s(a53.t(wy3Var2, gr5.b(8.0f)), false, null, ki2Var, 15), RecyclerView.A1, RecyclerView.A1, 8.0f, RecyclerView.A1, 11);
                sr5 a3 = rr5.a(ltVar, i20Var, sk2Var2, 48);
                int hashCode2 = Long.hashCode(sk2Var2.T);
                sm4 l2 = sk2Var2.l();
                zy3 e02 = l07.e0(sk2Var2, b0);
                sk2Var2.b0();
                if (sk2Var2.S) {
                    sk2Var2.k(mv0Var);
                } else {
                    sk2Var2.k0();
                }
                oo2.S(sk2Var2, dnVar, a3);
                oo2.S(sk2Var2, dnVar2, l2);
                b31.x(hashCode2, sk2Var2, dnVar3, sk2Var2, ydVar);
                oo2.S(sk2Var2, dnVar4, e02);
                ev2.a(se.A(), me2.X(sk2Var2, R.string.rom_browser_navigate_up), o76.h(wy3Var2, 18.0f), C.h, sk2Var2, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                cg2.k(sk2Var2, o76.k(wy3Var2, 3.0f));
                ev2.a(fj7.b(), null, o76.h(wy3Var2, 17.0f), C.l, sk2Var2, 432, 0);
                sk2Var2 = sk2Var2;
                sk2Var2.p(true);
                z5 = false;
                sk2Var2.p(false);
            } else {
                z5 = false;
                sk2Var2.X(-2030406956);
                sk2Var2.p(false);
            }
            if (z3) {
                i6 = 627241537;
                i7 = R.string.rom_browser_search_results;
            } else if (list.isEmpty()) {
                i6 = 627244383;
                i7 = R.string.rom_browser_virtual_root;
            } else {
                sk2Var2.X(627246977);
                sk2Var2.p(z5);
                S0 = tq0.S0(list, " / ", null, null, null, 62);
                sk2 sk2Var3 = sk2Var2;
                ir6.b(S0, new xg3(1.0f, true), C.g, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var3, 1772544, 3120, 120720);
                sk2Var = sk2Var3;
                sk2Var.p(true);
                wy3Var = wy3Var2;
            }
            S0 = b31.o(sk2Var2, i6, i7, sk2Var2, z5);
            sk2 sk2Var32 = sk2Var2;
            ir6.b(S0, new xg3(1.0f, true), C.g, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var32, 1772544, 3120, 120720);
            sk2Var = sk2Var32;
            sk2Var.p(true);
            wy3Var = wy3Var2;
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
            wy3Var = zy3Var;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2(list, z, z2, z3, ki2Var, wy3Var, i) { // from class: ah5
                public final /* synthetic */ List A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ ki2 X;
                public final /* synthetic */ zy3 Y;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    nk2.b(this.A, this.B, this.L, this.R, this.X, this.Y, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static String b0(long j) {
        return "RASetId(id=" + j + ")";
    }

    public static final void c(rg5 rg5Var, String str, String str2, boolean z, ki2 ki2Var, ki2 ki2Var2, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        l14 l14Var;
        ug ugVar;
        k24 k24Var;
        String str3;
        float f;
        h20 h20Var;
        mt mtVar;
        zy3 zy3Var;
        String str4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(414607229);
        if (sk2Var.h(rg5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (sk2Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (sk2Var.f(str2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (sk2Var.g(z)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (sk2Var.h(ki2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (sk2Var.h(ki2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (sk2Var.h(mi2Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((i15 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i15 & 1, z2)) {
            jd7 C = mj2.C(sk2Var);
            fr5 b2 = gr5.b(8.0f);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = b31.f(sk2Var);
            }
            l14 l14Var2 = (l14) L;
            k24 a2 = bh7.a(l14Var2, sk2Var, 6);
            k24 q = io2.q(l14Var2, sk2Var);
            Boolean bool = (Boolean) a2.getValue();
            bool.getClass();
            boolean f2 = sk2Var.f(a2);
            if ((i15 & 3670016) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h = f2 | z3 | sk2Var.h(rg5Var);
            Object L2 = sk2Var.L();
            if (!h && L2 != sn1Var) {
                k24Var = a2;
                str3 = null;
                ugVar = L2;
                l14Var = l14Var2;
            } else {
                l14Var = l14Var2;
                ugVar = new ug(mi2Var, rg5Var, a2, null, 6);
                k24Var = a2;
                str3 = null;
                sk2Var.h0(ugVar);
            }
            l.g(sk2Var, (aj2) ugVar, bool);
            if (((Boolean) q.getValue()).booleanValue()) {
                f = 0.95f;
            } else {
                f = 1.0f;
            }
            String str5 = str3;
            ae6 b3 = wm.b(f, ct3.P0(1.0f, 4000.0f, str3, 4), "press", sk2Var, 3120, 20);
            wy3 wy3Var = wy3.a;
            zy3 v = a53.v(sn2.L(o76.k(wy3Var, 116.0f), ((Number) b3.getValue()).floatValue()), l14Var, false, ki2Var2, ki2Var, 444);
            h20 h20Var2 = y60.j0;
            mt mtVar2 = rt.c;
            lr0 a3 = jr0.a(mtVar2, h20Var2, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, v);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a3);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 t = a53.t(jk2.Q(l07.p(o76.c(wy3Var, 1.0f), 1.117904f), 6.0f, b2, false, 0L, 28), b2);
            if (((Boolean) k24Var.getValue()).booleanValue()) {
                h20Var = h20Var2;
                mtVar = mtVar2;
                zy3Var = b53.z(3.0f, C.j, wy3Var, b2);
            } else {
                h20Var = h20Var2;
                mtVar = mtVar2;
                zy3Var = wy3Var;
            }
            zy3 f3 = t.f(zy3Var);
            j20 j20Var = y60.L;
            tv3 d = d50.d(j20Var, false);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, f3);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            y60 y60Var = y60.n0;
            f34.o(rg5Var, str2, str, l07.p(o76.c(wy3Var, 1.0f), 1.117904f), hi2.B(26), null, z, null, sk2Var, ((i15 << 3) & 896) | (i15 & 14) | 27648 | ((i15 >> 3) & 112) | ((i15 << 9) & 3670016), 160);
            f34.g(f34.Q(rg5Var), b53.b0(y60Var.i(wy3Var, j20Var), 6.0f, 6.0f, RecyclerView.A1, RecyclerView.A1, 12), hi2.B(8), sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            zy3 c2 = o76.c(y60Var.i(wy3Var, y60.d0), 1.0f);
            xq0 xq0Var = new xq0(xq0.g);
            long j = xq0.b;
            zy3 a0 = b53.a0(dk7.h(c2, sn1.o(l07.c0(xq0Var, new xq0(xq0.b(0.72f, j))), RecyclerView.A1, RecyclerView.A1, 14)), 8.0f, 9.0f, 8.0f, 7.0f);
            lr0 a4 = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, a0);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a4);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            String M = f34.M(rg5Var);
            long j2 = xq0.d;
            ir6.b(M, null, j2, hi2.A(10.5d), pe2.d0, null, 0L, null, hi2.B(12), 2, false, 1, 0, null, null, sk2Var, 200064, 3126, 119762);
            sk2Var = sk2Var;
            sk2Var.p(true);
            zy3 h2 = o76.h(b53.b0(y60Var.i(wy3Var, y60.f0), RecyclerView.A1, RecyclerView.A1, 6.0f, 7.0f, 3), 22.0f);
            fr5 fr5Var = gr5.a;
            zy3 z4 = b53.z(1.0f, xq0.b(0.25f, j2), dk7.i(a53.t(h2, fr5Var), xq0.b(0.4f, j), iq2.g), fr5Var);
            tv3 d2 = d50.d(y60.Z, false);
            int hashCode4 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e04 = l07.e0(sk2Var, z4);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d2);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode4, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e04);
            ev2.a(io2.I(), null, o76.h(wy3Var, 12.0f), j2, sk2Var, 3504, 0);
            sk2Var.p(true);
            sk2Var.p(true);
            Date date = rg5Var.g;
            if (date != null) {
                str4 = DateUtils.getRelativeTimeSpanString(date.getTime(), System.currentTimeMillis(), 60000L).toString();
            } else {
                str4 = str5;
            }
            if (str4 != null) {
                sk2Var.X(-1814920112);
                ir6.b(me2.W(R.string.rom_last_played_format, new Object[]{str4}, sk2Var), b53.b0(wy3Var, 1.0f, 5.0f, RecyclerView.A1, RecyclerView.A1, 12), mj2.C(sk2Var).i, hi2.B(9), null, td7.c, 0L, null, hi2.B(11), 2, false, 1, 0, null, null, sk2Var, 1575984, 3126, 119728);
                sk2Var = sk2Var;
                sk2Var.p(false);
            } else {
                sk2Var.X(-1814511377);
                sk2Var.p(false);
            }
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new xy(rg5Var, str, str2, z, ki2Var, ki2Var2, mi2Var, i);
        }
    }

    public static Object c0(aj2 aj2Var, Object obj, j11 j11Var) {
        Object k11Var;
        aj2Var.getClass();
        e31 a2 = j11Var.a();
        if (a2 == mp1.A) {
            k11Var = new ic5(j11Var);
        } else {
            k11Var = new k11(j11Var, a2);
        }
        l07.q(2, aj2Var);
        return aj2Var.j(obj, k11Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.util.List r34, final java.util.Map r35, final java.util.Map r36, final defpackage.mi2 r37, final defpackage.mi2 r38, defpackage.zy3 r39, float r40, final defpackage.mi2 r41, final defpackage.mi2 r42, defpackage.tu0 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk2.d(java.util.List, java.util.Map, java.util.Map, mi2, mi2, zy3, float, mi2, mi2, tu0, int, int):void");
    }

    public static final long e(float f, boolean z, boolean z2) {
        long j;
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        long j2 = 0;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        if (z2) {
            j2 = 2;
        }
        return ((j | j2) & 4294967295L) | (floatToRawIntBits << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.bm5 r17, defpackage.mi2 r18, defpackage.zy3 r19, defpackage.tu0 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk2.f(bm5, mi2, zy3, tu0, int, int):void");
    }

    public static final void g(Object obj, int i, nj3 nj3Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        mi2 mi2Var;
        int i4;
        int i5;
        int i6;
        int i7;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(872548579);
        if ((i2 & 6) == 0) {
            if (sk2Var.h(obj)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.d(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(nj3Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            boolean f = sk2Var.f(obj) | sk2Var.f(nj3Var);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (f || L == sn1Var) {
                L = new mj3(obj, nj3Var);
                sk2Var.h0(L);
            }
            mj3 mj3Var = (mj3) L;
            mj3Var.c = i;
            tj4 tj4Var = mj3Var.g;
            tv0 tv0Var = un4.a;
            mj3 mj3Var2 = (mj3) sk2Var.j(tv0Var);
            ga6 z2 = io2.z();
            if (z2 != null) {
                mi2Var = z2.e();
            } else {
                mi2Var = null;
            }
            ga6 Y = io2.Y(z2);
            try {
                if (mj3Var2 != ((mj3) tj4Var.getValue())) {
                    tj4Var.setValue(mj3Var2);
                    if (mj3Var.d > 0) {
                        mj3 mj3Var3 = mj3Var.e;
                        if (mj3Var3 != null) {
                            mj3Var3.b();
                        }
                        if (mj3Var2 != null) {
                            mj3Var2.a();
                        } else {
                            mj3Var2 = null;
                        }
                        mj3Var.e = mj3Var2;
                    }
                }
                io2.l0(z2, Y, mi2Var);
                boolean f2 = sk2Var.f(mj3Var);
                Object L2 = sk2Var.L();
                if (f2 || L2 == sn1Var) {
                    L2 = new kb2(6, mj3Var);
                    sk2Var.h0(L2);
                }
                l.d(mj3Var, (mi2) L2, sk2Var);
                dk7.a(tv0Var.a(mj3Var), et0Var, sk2Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                io2.l0(z2, Y, mi2Var);
                throw th;
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new g4(obj, i, nj3Var, et0Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r32, final boolean r33, defpackage.qb6 r34, defpackage.rb6 r35, final int r36, final defpackage.ki2 r37, final defpackage.mi2 r38, defpackage.zy3 r39, defpackage.tu0 r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk2.h(java.lang.String, boolean, qb6, rb6, int, ki2, mi2, zy3, tu0, int, int):void");
    }

    public static final void i(final zy3 zy3Var, aj2 aj2Var, aj2 aj2Var2, bj2 bj2Var, final aj2 aj2Var3, final aj2 aj2Var4, final boolean z, final float f, ih4 ih4Var, tu0 tu0Var, final int i) {
        int i2;
        boolean z2;
        aj2 aj2Var5;
        bj2 bj2Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        j20 j20Var;
        boolean z6;
        boolean z7;
        j20 j20Var2;
        boolean z8;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final aj2 aj2Var6 = aj2Var;
        final ih4 ih4Var2 = ih4Var;
        j20 j20Var3 = y60.L;
        j20 j20Var4 = y60.Z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1595074580);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(aj2Var6)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(aj2Var2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.h(bj2Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.h(aj2Var3)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.h(aj2Var4)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (sk2Var.g(z)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (sk2Var.c(f)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (sk2Var.f(ih4Var2)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i2 & 1, z2)) {
            if ((3670016 & i2) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((29360128 & i2) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z4 | z3;
            if ((234881024 & i2) == 67108864) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = z9 | z5;
            Object L = sk2Var.L();
            if (z10 || L == su0.a) {
                L = new mp6(z, f, ih4Var2);
                sk2Var.h0(L);
            }
            mp6 mp6Var = (mp6) L;
            sd3 sd3Var = (sd3) sk2Var.j(ov0.n);
            int j0 = dt3.j0(sk2Var);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            int i12 = i2;
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, mp6Var);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            dn dnVar3 = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar3);
            }
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            ty3 ty3Var = ty3.a;
            if (aj2Var3 != null) {
                sk2Var.X(-1444611617);
                zy3 w = iq2.w("Leading");
                ye6 ye6Var = m33.a;
                zy3 f2 = w.f(ty3Var);
                j20Var = j20Var3;
                tv3 d = d50.d(j20Var4, false);
                int j02 = dt3.j0(sk2Var);
                sm4 l2 = sk2Var.l();
                zy3 e02 = l07.e0(sk2Var, f2);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar, d);
                oo2.S(sk2Var, dnVar2, l2);
                if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j02))) {
                    b31.w(j02, sk2Var, j02, dnVar3);
                }
                oo2.S(sk2Var, dnVar4, e02);
                aj2Var3.j(sk2Var, Integer.valueOf((i12 >> 12) & 14));
                sk2Var.p(true);
                z6 = false;
                sk2Var.p(false);
            } else {
                j20Var = j20Var3;
                z6 = false;
                sk2Var.X(-1444365601);
                sk2Var.p(false);
            }
            if (aj2Var4 != null) {
                sk2Var.X(-1444322883);
                zy3 w2 = iq2.w("Trailing");
                ye6 ye6Var2 = m33.a;
                zy3 f3 = w2.f(ty3Var);
                tv3 d2 = d50.d(j20Var4, z6);
                int j03 = dt3.j0(sk2Var);
                sm4 l3 = sk2Var.l();
                zy3 e03 = l07.e0(sk2Var, f3);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar, d2);
                oo2.S(sk2Var, dnVar2, l3);
                if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j03))) {
                    b31.w(j03, sk2Var, j03, dnVar3);
                }
                oo2.S(sk2Var, dnVar4, e03);
                aj2Var4.j(sk2Var, Integer.valueOf((i12 >> 15) & 14));
                sk2Var.p(true);
                sk2Var.p(false);
            } else {
                sk2Var.X(-1444074945);
                sk2Var.p(z6);
            }
            ih4Var2 = ih4Var;
            float B = b53.B(ih4Var2, sd3Var);
            float A = b53.A(ih4Var2, sd3Var);
            if (aj2Var3 != null) {
                B -= 12.0f;
                if (B < RecyclerView.A1) {
                    B = 0.0f;
                }
            }
            float f4 = B;
            if (aj2Var4 != null) {
                A -= 12.0f;
                if (A < RecyclerView.A1) {
                    A = 0.0f;
                }
            }
            zy3 b0 = b53.b0(wy3.a, f4, RecyclerView.A1, A, RecyclerView.A1, 10);
            if (bj2Var != null) {
                sk2Var.X(-1443222972);
                bj2Var2 = bj2Var;
                bj2Var2.i(iq2.w("Hint").f(b0), sk2Var, Integer.valueOf((i12 >> 6) & 112));
                z7 = false;
                sk2Var.p(false);
            } else {
                bj2Var2 = bj2Var;
                z7 = false;
                sk2Var.X(-1443135521);
                sk2Var.p(false);
            }
            if (aj2Var2 != null) {
                sk2Var.X(-1443101018);
                zy3 f5 = iq2.w("Label").f(b0);
                j20Var2 = j20Var;
                tv3 d3 = d50.d(j20Var2, z7);
                int j04 = dt3.j0(sk2Var);
                sm4 l4 = sk2Var.l();
                zy3 e04 = l07.e0(sk2Var, f5);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar, d3);
                oo2.S(sk2Var, dnVar2, l4);
                if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j04))) {
                    b31.w(j04, sk2Var, j04, dnVar3);
                }
                oo2.S(sk2Var, dnVar4, e04);
                aj2Var5 = aj2Var2;
                aj2Var5.j(sk2Var, Integer.valueOf((i12 >> 6) & 14));
                z8 = true;
                sk2Var.p(true);
                sk2Var.p(false);
            } else {
                aj2Var5 = aj2Var2;
                j20Var2 = j20Var;
                z8 = true;
                sk2Var.X(-1443015489);
                sk2Var.p(z7);
            }
            zy3 f6 = iq2.w("TextField").f(b0);
            tv3 d4 = d50.d(j20Var2, z8);
            int j05 = dt3.j0(sk2Var);
            sm4 l5 = sk2Var.l();
            zy3 e05 = l07.e0(sk2Var, f6);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d4);
            oo2.S(sk2Var, dnVar2, l5);
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j05))) {
                b31.w(j05, sk2Var, j05, dnVar3);
            }
            oo2.S(sk2Var, dnVar4, e05);
            aj2Var6 = aj2Var;
            aj2Var6.j(sk2Var, Integer.valueOf((i12 >> 3) & 14));
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            aj2Var5 = aj2Var2;
            bj2Var2 = bj2Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            final aj2 aj2Var7 = aj2Var5;
            final bj2 bj2Var3 = bj2Var2;
            r.d = new aj2() { // from class: kp6
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nk2.i(zy3.this, aj2Var6, aj2Var7, bj2Var3, aj2Var3, aj2Var4, z, f, ih4Var2, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final java.lang.String r39, final boolean r40, final defpackage.ki2 r41, defpackage.zy3 r42, long r43, long r45, float r47, float r48, float r49, defpackage.tu0 r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk2.j(java.lang.String, boolean, ki2, zy3, long, long, float, float, float, tu0, int, int):void");
    }

    public static final void k(boolean z, String str, tp5 tp5Var, final mi2 mi2Var, ki2 ki2Var, ki2 ki2Var2, ki2 ki2Var3, ki2 ki2Var4, ki2 ki2Var5, ki2 ki2Var6, zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        final mi2 mi2Var2;
        wy3 wy3Var;
        is2 is2Var;
        float f;
        boolean z3;
        boolean z4;
        k24 k24Var;
        k24 k24Var2;
        jd7 jd7Var;
        wy3 wy3Var2;
        int i12;
        boolean z5;
        float f2;
        boolean z6;
        boolean z7;
        mi2 mi2Var3;
        str.getClass();
        tp5Var.getClass();
        mi2Var.getClass();
        ki2Var.getClass();
        ki2Var2.getClass();
        ki2Var3.getClass();
        ki2Var4.getClass();
        ki2Var5.getClass();
        ki2Var6.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1992567122);
        if (sk2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i13 = i | i2;
        if (sk2Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i14 = i13 | i3;
        if (sk2Var.d(tp5Var.ordinal())) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i15 = i14 | i4;
        if (sk2Var.h(mi2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i16 = i15 | i5;
        if (sk2Var.h(ki2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i17 = i16 | i6;
        if (sk2Var.h(ki2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i18 = i17 | i7;
        if (sk2Var.h(ki2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i19 = i18 | i8;
        if (sk2Var.h(ki2Var4)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i20 = i19 | i9;
        if (sk2Var.h(ki2Var5)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i21 = i20 | i10;
        if (sk2Var.h(ki2Var6)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i22 = i21 | i11;
        if ((306783379 & i22) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (sk2Var.O(i22 & 1, z2)) {
            jd7 C = mj2.C(sk2Var);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(Boolean.valueOf(z));
                sk2Var.h0(L);
            }
            final k24 k24Var3 = (k24) L;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = me2.G(Boolean.FALSE);
                sk2Var.h0(L2);
            }
            k24 k24Var4 = (k24) L2;
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = new wc2();
                sk2Var.h0(L3);
            }
            wc2 wc2Var = (wc2) L3;
            wy3 wy3Var3 = wy3.a;
            zy3 c2 = o76.c(wy3Var3, 1.0f);
            long j = C.b;
            is2 is2Var2 = iq2.g;
            zy3 i23 = dk7.i(c2, j, is2Var2);
            lr0 a2 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, i23);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 b0 = b53.b0(o76.d(o76.c(wy3Var3, 1.0f), 56.0f), 18.0f, RecyclerView.A1, 6.0f, RecyclerView.A1, 10);
            i20 i20Var = y60.h0;
            lt ltVar = rt.a;
            sr5 a3 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, b0);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            if (((Boolean) k24Var3.getValue()).booleanValue()) {
                sk2Var.X(163464897);
                int i24 = i22 & 7168;
                if (i24 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object L4 = sk2Var.L();
                if (z5 || L4 == sn1Var) {
                    L4 = new ki2() { // from class: vg5
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i25 = r3;
                            o27 o27Var = o27.a;
                            k24 k24Var5 = k24Var3;
                            mi2 mi2Var4 = mi2Var;
                            switch (i25) {
                                case 0:
                                    k24Var5.setValue(Boolean.FALSE);
                                    mi2Var4.n(null);
                                    return o27Var;
                                default:
                                    k24Var5.setValue(Boolean.TRUE);
                                    mi2Var4.n("");
                                    return o27Var;
                            }
                        }
                    };
                    sk2Var.h0(L4);
                }
                oo2.c((ki2) L4, o76.h(wy3Var3, 42.0f), false, ct3.H0(1874886591, new d4(C, 4), sk2Var), sk2Var, 24624, 12);
                fb3 fb3Var = new fb3(0, 0, 3, 119);
                ds6 ds6Var = new ds6(C.g, hi2.B(16), null, 0L, 0L, 0, 0L, 16777212);
                mb6 mb6Var = new mb6(C.j);
                if (1.0f <= 0.0d) {
                    kz2.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                zy3 I = b53.I(b53.Z(new xg3(f2, true), 8.0f, RecyclerView.A1, 2), wc2Var);
                if (i24 == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object L5 = sk2Var.L();
                if (z6 || L5 == sn1Var) {
                    L5 = new hz(5, mi2Var);
                    sk2Var.h0(L5);
                }
                is2Var = is2Var2;
                q10.b(str, (mi2) L5, I, false, ds6Var, fb3Var, null, true, 0, 0, null, null, null, mb6Var, ct3.H0(-1350942304, new l4(10, str, C), sk2Var), sk2Var, ((i22 >> 3) & 14) | 102236160, 196608, 16024);
                sk2Var = sk2Var;
                Object L6 = sk2Var.L();
                if (L6 == sn1Var) {
                    L6 = new n5(wc2Var, null, 23);
                    sk2Var.h0(L6);
                }
                l.g(sk2Var, (aj2) L6, o27.a);
                if (i24 == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                Object L7 = sk2Var.L();
                if (!z7 && L7 != sn1Var) {
                    mi2Var3 = mi2Var;
                } else {
                    mi2Var3 = mi2Var;
                    L7 = new v51(11, mi2Var3);
                    sk2Var.h0(L7);
                }
                oo2.c((ki2) L7, o76.h(wy3Var3, 42.0f), false, ct3.H0(1003810422, new d4(C, 5), sk2Var), sk2Var, 24624, 12);
                sk2Var.p(false);
                wy3Var2 = wy3Var3;
                jd7Var = C;
                i12 = 0;
                mi2Var2 = mi2Var3;
                z3 = true;
            } else {
                is2Var = is2Var2;
                sk2Var.X(165562450);
                nd7.a(24.0f, 48, sk2Var, null);
                cg2.k(sk2Var, o76.k(wy3Var3, 9.0f));
                if (1.0f <= 0.0d) {
                    kz2.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                xg3 xg3Var = new xg3(f, true);
                sr5 a4 = rr5.a(ltVar, y60.g0, sk2Var, 0);
                int hashCode3 = Long.hashCode(sk2Var.T);
                sm4 l3 = sk2Var.l();
                zy3 e03 = l07.e0(sk2Var, xg3Var);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar, a4);
                oo2.S(sk2Var, dnVar2, l3);
                b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
                oo2.S(sk2Var, dnVar4, e03);
                long j2 = C.g;
                sd2 sd2Var = td7.a;
                long B = hi2.B(21);
                pe2 pe2Var = pe2.d0;
                ir6.b("Watermelon", null, j2, B, pe2Var, sd2Var, hi2.A(-0.3d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 1772550, 0, 130834);
                ir6.b("DS", null, C.l, hi2.B(21), pe2Var, sd2Var, hi2.A(-0.3d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 1772550, 0, 130834);
                z3 = true;
                sk2Var.p(true);
                if ((i22 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object L8 = sk2Var.L();
                if (!z4 && L8 != sn1Var) {
                    mi2Var2 = mi2Var;
                } else {
                    mi2Var2 = mi2Var;
                    L8 = new ki2() { // from class: vg5
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i25 = r3;
                            o27 o27Var = o27.a;
                            k24 k24Var5 = k24Var3;
                            mi2 mi2Var4 = mi2Var2;
                            switch (i25) {
                                case 0:
                                    k24Var5.setValue(Boolean.FALSE);
                                    mi2Var4.n(null);
                                    return o27Var;
                                default:
                                    k24Var5.setValue(Boolean.TRUE);
                                    mi2Var4.n("");
                                    return o27Var;
                            }
                        }
                    };
                    sk2Var.h0(L8);
                }
                oo2.c((ki2) L8, o76.h(wy3Var3, 42.0f), false, ct3.H0(1931642056, new d4(C, 6), sk2Var), sk2Var, 24624, 12);
                oo2.c(ki2Var, o76.h(wy3Var3, 42.0f), false, ct3.H0(-2078198465, new i15(1, tp5Var, C), sk2Var), sk2Var, ((i22 >> 12) & 14) | 24624, 12);
                tv3 d = d50.d(y60.L, false);
                int hashCode4 = Long.hashCode(sk2Var.T);
                sm4 l4 = sk2Var.l();
                zy3 e04 = l07.e0(sk2Var, wy3Var3);
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, dnVar, d);
                oo2.S(sk2Var, dnVar2, l4);
                b31.x(hashCode4, sk2Var, dnVar3, sk2Var, ydVar);
                oo2.S(sk2Var, dnVar4, e04);
                Object L9 = sk2Var.L();
                if (L9 == sn1Var) {
                    k24Var = k24Var4;
                    L9 = new wg5(k24Var, 1);
                    sk2Var.h0(L9);
                } else {
                    k24Var = k24Var4;
                }
                k24 k24Var5 = k24Var;
                oo2.c((ki2) L9, o76.h(wy3Var3, 42.0f), false, ct3.H0(144968782, new d4(C, 2), sk2Var), sk2Var, 24630, 12);
                boolean booleanValue = ((Boolean) k24Var5.getValue()).booleanValue();
                Object L10 = sk2Var.L();
                if (L10 == sn1Var) {
                    k24Var2 = k24Var5;
                    L10 = new wg5(k24Var2, 0);
                    sk2Var.h0(L10);
                } else {
                    k24Var2 = k24Var5;
                }
                jd7Var = C;
                wy3Var2 = wy3Var3;
                hi.a(booleanValue, (ki2) L10, null, 0L, null, null, ct3.H0(811231013, new u3(ki2Var2, ki2Var3, ki2Var4, ki2Var5, k24Var2, 2), sk2Var), sk2Var, 1572912);
                sk2Var = sk2Var;
                sk2Var.p(true);
                oo2.c(ki2Var6, o76.h(wy3Var2, 42.0f), false, ct3.H0(-614560448, new d4(jd7Var, 3), sk2Var), sk2Var, ((i22 >> 27) & 14) | 24624, 12);
                i12 = 0;
                sk2Var.p(false);
            }
            sk2Var.p(z3);
            d50.a(dk7.i(o76.d(o76.c(wy3Var2, 1.0f), 1.0f), jd7Var.f, is2Var), sk2Var, i12);
            sk2Var.p(z3);
            wy3Var = wy3Var2;
        } else {
            mi2Var2 = mi2Var;
            sk2Var.R();
            wy3Var = zy3Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new th4(z, str, tp5Var, mi2Var2, ki2Var, ki2Var2, ki2Var3, ki2Var4, ki2Var5, ki2Var6, wy3Var, i);
        }
    }

    public static final void l(int i, boolean z, ki2 ki2Var, List list, Map map, k24 k24Var, k24 k24Var2, k24 k24Var3, aj2 aj2Var, float f) {
        if (((Number) k24Var.getValue()).intValue() > 0 && i != 0) {
            int m = io2.m((int) (f / (((Number) k24Var.getValue()).intValue() / i)), 0, i - 1);
            if (z && m == 0) {
                if (!((Boolean) k24Var2.getValue()).booleanValue()) {
                    k24Var2.setValue(Boolean.TRUE);
                    k24Var3.setValue(null);
                    ki2Var.c();
                    return;
                }
                return;
            }
            if (((Boolean) k24Var2.getValue()).booleanValue()) {
                k24Var2.setValue(Boolean.FALSE);
            }
            Character ch = (Character) tq0.N0(m - (z ? 1 : 0), list);
            if (ch != null) {
                char charValue = ch.charValue();
                Character ch2 = (Character) k24Var3.getValue();
                if (ch2 == null || charValue != ch2.charValue()) {
                    k24Var3.setValue(ch);
                    Integer num = (Integer) map.get(ch);
                    if (num != null) {
                        aj2Var.j(Integer.valueOf(num.intValue()), ch);
                    }
                }
            }
        }
    }

    public static final void m(u57 u57Var, oy2 oy2Var, jf4 jf4Var, ny2 ny2Var, sb sbVar, long j) {
        float intBitsToFloat;
        w14 w14Var = (w14) sbVar.L;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (oy2Var.c >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (oy2Var.c & 4294967295L));
        if (r(oy2Var)) {
            sbVar.B = 0;
            w14Var.d();
        }
        if (!o(oy2Var) && !r(oy2Var)) {
            if (w14Var.b == 3) {
                int i = sbVar.B;
                sbVar.B = i + 1;
                w14Var.n(i, oy2Var);
            } else {
                w14Var.a(oy2Var);
            }
            if (sbVar.B == 3) {
                sbVar.B = 0;
            }
            Object[] objArr = w14Var.a;
            int i2 = w14Var.b;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += Float.intBitsToFloat((int) (((oy2) objArr[i3]).c >> 32));
            }
            int i4 = w14Var.b;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = w14Var.a;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((oy2) objArr2[i5]).c & 4294967295L));
            }
            intBitsToFloat3 = f2 / w14Var.b;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (jf4Var != null) {
            int i6 = ny2Var.a;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = jf4Var == jf4.Horizontal ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L) : (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((ac1) u57Var.B).d(oy2Var.b, mb4.e(floatToRawIntBits, j));
    }

    public static final int n(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, ih4 ih4Var) {
        float f2;
        float f3 = 2.0f * f;
        float d = ih4Var.d() * f;
        float c2 = ih4Var.c() * f;
        int max = Math.max(i, i5);
        if (z) {
            f2 = i2 + f3 + max + c2;
        } else {
            f2 = d + max + c2;
        }
        return nz0.f(Math.max(jv3.X(f2), Math.max(i3, i4)), j);
    }

    public static final boolean o(oy2 oy2Var) {
        if (oy2Var.h && !oy2Var.d) {
            return true;
        }
        return false;
    }

    public static final mk2 p(mk2 mk2Var) {
        if (mk2Var == null) {
            mk2Var = null;
        }
        if (mk2Var != null) {
            return mk2Var;
        }
        xu0.b("Inconsistent composition");
        f81.c();
        return null;
    }

    public static int q(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final boolean r(oy2 oy2Var) {
        if (!oy2Var.h && oy2Var.d) {
            return true;
        }
        return false;
    }

    public static void s() {
        nl2.D("Not in application's main thread", M());
    }

    public static void t(Object obj) {
        if (obj != null) {
            return;
        }
        c44.i("Cannot return null from a non-@Nullable @Provides method");
    }

    public static int u(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                        int callingUid = Binder.getCallingUid();
                        int i = 1;
                        if (appOpsManager == null) {
                            noteProxyOpNoThrow = 1;
                        } else {
                            noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                        }
                        if (noteProxyOpNoThrow == 0) {
                            String d = fp.d(context);
                            if (appOpsManager != null) {
                                i = appOpsManager.checkOpNoThrow(permissionToOp, myUid, d);
                            }
                            noteProxyOpNoThrow = i;
                        }
                    } else {
                        noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static j11 v(aj2 aj2Var, Object obj, j11 j11Var) {
        aj2Var.getClass();
        j11Var.getClass();
        if (aj2Var instanceof m00) {
            return ((m00) aj2Var).t(j11Var, obj);
        }
        e31 a2 = j11Var.a();
        if (a2 == mp1.A) {
            return new c53(aj2Var, obj, j11Var);
        }
        return new d53(j11Var, a2, aj2Var, obj);
    }

    public static final long w(long j, boolean z, int i, float f) {
        int h;
        if ((z || i == 2 || i == 4 || i == 5) && lz0.d(j)) {
            h = lz0.h(j);
        } else {
            h = Preference.DEFAULT_ORDER;
        }
        if (lz0.j(j) != h) {
            h = io2.m(hi2.f(f), lz0.j(j), h);
        }
        return w81.m(0, h, 0, lz0.g(j));
    }

    public static b44 x(g44 g44Var) {
        Iterator it = d06.x0(g44Var, new gi3(29)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (b44) next;
        }
        vd6.e("Sequence is empty.");
        return null;
    }

    public static final au5 y(View view) {
        au5 au5Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof au5) {
                au5Var = (au5) tag;
            } else {
                au5Var = null;
            }
            if (au5Var != null) {
                return au5Var;
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

    public static p31 z() {
        return p31.COROUTINE_SUSPENDED;
    }
}
