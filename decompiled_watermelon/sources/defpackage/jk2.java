package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jk2  reason: default package */
/* loaded from: classes.dex */
public abstract class jk2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static ax2 c;

    public static final Object A(mv3 mv3Var) {
        ff3 ff3Var;
        Object l = mv3Var.l();
        if (l instanceof ff3) {
            ff3Var = (ff3) l;
        } else {
            ff3Var = null;
        }
        if (ff3Var == null) {
            return null;
        }
        return ff3Var.j0;
    }

    public static final ax2 C() {
        ax2 ax2Var = c;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(12.0f, 17.27f);
        vq2Var.m(18.18f, 21.0f);
        vq2Var.n(-1.64f, -7.03f);
        vq2Var.m(22.0f, 9.24f);
        vq2Var.n(-7.19f, -0.61f);
        vq2Var.m(12.0f, 2.0f);
        vq2Var.m(9.19f, 8.63f);
        vq2Var.m(2.0f, 9.24f);
        vq2Var.n(5.46f, 4.73f);
        vq2Var.m(5.82f, 21.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        c = b2;
        return b2;
    }

    public static File D(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean G(int i) {
        double pow;
        double pow2;
        double pow3;
        if (i != 0) {
            ThreadLocal threadLocal = gr0.a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d = red / 255.0d;
                if (d < 0.04045d) {
                    pow = d / 12.92d;
                } else {
                    pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
                }
                double d2 = green / 255.0d;
                if (d2 < 0.04045d) {
                    pow2 = d2 / 12.92d;
                } else {
                    pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = blue / 255.0d;
                if (d3 < 0.04045d) {
                    pow3 = d3 / 12.92d;
                } else {
                    pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d4;
                double d5 = pow3 * 0.9505d;
                dArr[2] = (d5 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d4 / 100.0d <= 0.5d) {
                    return false;
                }
                return true;
            }
            i.i("outXyz must have a length of 3.");
            return false;
        }
        return false;
    }

    public static final void H(String str) {
        str.getClass();
        throw new IllegalArgumentException(wh1.A("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static int I(float f, int i, int i2) {
        return gr0.b(gr0.d(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static MappedByteBuffer J(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        FileChannel channel = fileInputStream.getChannel();
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
        fileInputStream.close();
        openFileDescriptor.close();
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List K(z86 z86Var, int i, z86 z86Var2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        pp1 pp1Var;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int u = z86Var.u(i);
        int i5 = i + u;
        int f = z86Var.f(i);
        int f2 = z86Var.f(i5);
        int i6 = f2 - f;
        if (i >= 0 && (z86Var.b[(z86Var.r(i) * 5) + 1] & 201326592) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        z86Var2.w(u);
        z86Var2.x(i6, z86Var2.t);
        if (z86Var.g < i5) {
            z86Var.B(i5);
        }
        if (z86Var.k < f2) {
            z86Var.C(f2, i5);
        }
        int[] iArr = z86Var2.b;
        int i7 = z86Var2.t;
        int i8 = i7 * 5;
        nu.d0(i8, i * 5, i5 * 5, z86Var.b, iArr);
        Object[] objArr = z86Var2.c;
        int i9 = z86Var2.i;
        System.arraycopy(z86Var.c, f, objArr, i9, i6);
        int i10 = z86Var2.v;
        iArr[i8 + 2] = i10;
        int i11 = i7 - i;
        int i12 = i7 + u;
        int g = i9 - z86Var2.g(iArr, i7);
        int i13 = z86Var2.m;
        int i14 = z86Var2.l;
        int length = objArr.length;
        boolean z7 = z4;
        int i15 = i13;
        int i16 = i7;
        while (i16 < i12) {
            if (i16 != i7) {
                int i17 = (i16 * 5) + 2;
                iArr[i17] = iArr[i17] + i11;
            }
            int[] iArr2 = iArr;
            int g2 = z86Var2.g(iArr, i16) + g;
            if (i15 < i16) {
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = z86Var2.k;
            }
            iArr2[(i16 * 5) + 4] = z86.i(g2, i4, i14, length);
            if (i16 == i15) {
                i15++;
            }
            i16++;
            i7 = i3;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        z86Var2.m = i15;
        int a2 = y86.a(z86Var.d, i, z86Var.p());
        int a3 = y86.a(z86Var.d, i5, z86Var.p());
        if (a2 < a3) {
            ArrayList arrayList = z86Var.d;
            ArrayList arrayList2 = new ArrayList(a3 - a2);
            for (int i18 = a2; i18 < a3; i18++) {
                mk2 mk2Var = (mk2) arrayList.get(i18);
                mk2Var.a += i11;
                arrayList2.add(mk2Var);
            }
            z86Var2.d.addAll(y86.a(z86Var2.d, z86Var2.t, z86Var2.p()), arrayList2);
            arrayList.subList(a2, a3).clear();
            pp1Var = arrayList2;
        } else {
            pp1Var = pp1.A;
        }
        if (!pp1Var.isEmpty()) {
            HashMap hashMap = z86Var.e;
            HashMap hashMap2 = z86Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = pp1Var.size();
                for (int i19 = 0; i19 < size; i19++) {
                    uk2 uk2Var = (uk2) hashMap.get((mk2) pp1Var.get(i19));
                }
            }
        }
        int i20 = z86Var2.v;
        z86Var2.O(i10);
        int E = z86Var.E(z86Var.b, i);
        if (!z3) {
            z5 = false;
        } else if (z) {
            if (E >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                z86Var.P();
                z86Var.a(E - z86Var.t);
                z86Var.P();
            }
            z86Var.a(i - z86Var.t);
            boolean H = z86Var.H();
            if (z6) {
                z86Var.M();
                z86Var.j();
                z86Var.M();
                z86Var.j();
            }
            z5 = H;
        } else {
            boolean I = z86Var.I(i, u);
            z86Var.J(f, i6, i - 1);
            z5 = I;
        }
        if (z5) {
            xu0.a("Unexpectedly removed anchors");
        }
        int i21 = z86Var2.o;
        int i22 = iArr3[i8 + 1];
        if ((1073741824 & i22) != 0) {
            i2 = 1;
        } else {
            i2 = i22 & 67108863;
        }
        z86Var2.o = i21 + i2;
        if (z2) {
            z86Var2.t = i12;
            z86Var2.i = i9 + i6;
        }
        if (z7) {
            z86Var2.T(i10);
        }
        return pp1Var;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [xx3, lt3] */
    public static xx3 L(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    int i3 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j2 = duplicate.getInt() & 4294967295L;
                for (int i4 = 0; i4 < j2; i4++) {
                    int i5 = duplicate.getInt();
                    long j3 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (j3 + j));
                        ?? lt3Var = new lt3();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        lt3Var.R = duplicate;
                        lt3Var.A = position;
                        int i6 = position - duplicate.getInt(position);
                        lt3Var.B = i6;
                        lt3Var.L = ((ByteBuffer) lt3Var.R).getShort(i6);
                        return lt3Var;
                    }
                }
            }
            f81.j("Cannot read metadata.");
            return null;
        }
        f81.j("Cannot read metadata.");
        return null;
    }

    public static final Object M(Object[] objArr, ki2 ki2Var, tu0 tu0Var, int i) {
        return O(Arrays.copyOf(objArr, objArr.length), dk7.j, ki2Var, tu0Var, ((i << 6) & 7168) | RendererDebugBridge.CAPTURE_HEIGHT, 0);
    }

    public static final Object N(Object[] objArr, du5 du5Var, ki2 ki2Var, tu0 tu0Var, int i) {
        return O(Arrays.copyOf(objArr, objArr.length), du5Var, ki2Var, tu0Var, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object O(Object[] objArr, du5 du5Var, ki2 ki2Var, tu0 tu0Var, int i, int i2) {
        Object[] objArr2;
        du5 du5Var2;
        boolean z;
        Object obj;
        Object obj2;
        Object e;
        sk2 sk2Var = (sk2) tu0Var;
        long j = sk2Var.T;
        iq2.g(36);
        String l = Long.toString(j, 36);
        l.getClass();
        du5Var.getClass();
        lt5 lt5Var = (lt5) sk2Var.j(nt5.a);
        Object L = sk2Var.L();
        Object obj3 = null;
        sn1 sn1Var = su0.a;
        if (L == sn1Var) {
            if (lt5Var != null && (e = lt5Var.e(l)) != null) {
                obj2 = du5Var.i(e);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = ki2Var.c();
            }
            objArr2 = objArr;
            du5Var2 = du5Var;
            it5 it5Var = new it5(du5Var2, lt5Var, l, obj2, objArr2);
            sk2Var.h0(it5Var);
            L = it5Var;
        } else {
            objArr2 = objArr;
            du5Var2 = du5Var;
        }
        it5 it5Var2 = (it5) L;
        if (Arrays.equals(objArr2, it5Var2.X)) {
            obj3 = it5Var2.R;
        }
        if (obj3 == null) {
            obj3 = ki2Var.c();
        }
        boolean h = sk2Var.h(it5Var2);
        if ((((i & 112) ^ 48) > 32 && sk2Var.h(du5Var2)) || (i & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean h2 = h | z | sk2Var.h(lt5Var) | sk2Var.f(l) | sk2Var.h(obj3) | sk2Var.h(objArr2);
        Object L2 = sk2Var.L();
        if (!h2 && L2 != sn1Var) {
            obj = obj3;
        } else {
            Object[] objArr3 = objArr2;
            obj = obj3;
            m95 m95Var = new m95(it5Var2, du5Var2, lt5Var, l, obj, objArr3, 0);
            sk2Var.h0(m95Var);
            L2 = m95Var;
        }
        l.j((ki2) L2, sk2Var);
        return obj;
    }

    public static final h77 P(ax2 ax2Var, tu0 tu0Var) {
        od1 od1Var;
        b30 b30Var;
        sk2 sk2Var = (sk2) tu0Var;
        float b2 = ((od1) sk2Var.j(ov0.h)).b();
        boolean e = sk2Var.e((Float.floatToRawIntBits(b2) & 4294967295L) | (Float.floatToRawIntBits(ax2Var.j) << 32));
        Object L = sk2Var.L();
        if (e || L == su0.a) {
            jo2 jo2Var = new jo2();
            r(jo2Var, ax2Var.f);
            float f = ax2Var.b;
            float f2 = ax2Var.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(od1Var.C(f)) << 32) | (Float.floatToRawIntBits(od1Var.C(f2)) & 4294967295L);
            float f3 = ax2Var.d;
            float f4 = ax2Var.e;
            if (Float.isNaN(f3)) {
                f3 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f3) << 32) | (4294967295L & Float.floatToRawIntBits(f4));
            h77 h77Var = new h77(jo2Var);
            String str = ax2Var.a;
            long j = ax2Var.g;
            int i = ax2Var.h;
            if (j != 16) {
                b30Var = new b30(i, j);
            } else {
                b30Var = null;
            }
            boolean z = ax2Var.i;
            h77Var.X.setValue(new i76(floatToRawIntBits));
            h77Var.Y.setValue(Boolean.valueOf(z));
            r67 r67Var = h77Var.Z;
            r67Var.g.setValue(b30Var);
            r67Var.i.setValue(new i76(floatToRawIntBits2));
            r67Var.c = str;
            sk2Var.h0(h77Var);
            L = h77Var;
        }
        return (h77) L;
    }

    public static zy3 Q(zy3 zy3Var, float f, y26 y26Var, boolean z, long j, int i) {
        boolean z2;
        long j2;
        boolean z3;
        if ((i & 4) != 0) {
            if (ji1.a(f, RecyclerView.A1) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3;
        } else {
            z2 = z;
        }
        long j3 = un2.a;
        if ((i & 16) != 0) {
            j2 = j3;
        } else {
            j2 = j;
        }
        if (ji1.a(f, RecyclerView.A1) <= 0 && !z2) {
            return zy3Var;
        }
        return zy3Var.f(new v26(f, y26Var, z2, j3, j2));
    }

    public static final y55 R(rd3 rd3Var) {
        y55 j = me2.j(rd3Var, true);
        long h = rd3Var.h(j.d());
        long h2 = rd3Var.h((Float.floatToRawIntBits(j.c) << 32) | (Float.floatToRawIntBits(j.d) & 4294967295L));
        return new y55(Float.intBitsToFloat((int) (h >> 32)), Float.intBitsToFloat((int) (h & 4294967295L)), Float.intBitsToFloat((int) (h2 >> 32)), Float.intBitsToFloat((int) (h2 & 4294967295L)));
    }

    public static final void a(final nq6 nq6Var, final String str, final aj2 aj2Var, final uc7 uc7Var, final aj2 aj2Var2, final boolean z, final boolean z2, final boolean z3, final l14 l14Var, final ih4 ih4Var, final y26 y26Var, final yb1 yb1Var, final et0 et0Var, tu0 tu0Var, final int i, final int i2) {
        int i3;
        aj2 aj2Var3;
        boolean z4;
        int i4;
        y26 y26Var2;
        sk2 sk2Var;
        v03 v03Var;
        y60 y60Var;
        boolean z5;
        boolean z6;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(418608794);
        if ((i & 6) == 0) {
            i3 = (sk2Var2.d(nq6Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sk2Var2.f(str) ? 32 : 16;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            aj2Var3 = aj2Var;
            i3 |= sk2Var2.h(aj2Var3) ? 256 : 128;
        } else {
            aj2Var3 = aj2Var;
        }
        if ((i & 3072) == 0) {
            i3 |= sk2Var2.f(uc7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sk2Var2.h(aj2Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= sk2Var2.h(null) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= sk2Var2.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= sk2Var2.h(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            z4 = z;
            i3 |= sk2Var2.g(z4) ? 67108864 : 33554432;
        } else {
            z4 = z;
        }
        if ((i & 805306368) == 0) {
            i3 |= sk2Var2.g(z2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (sk2Var2.g(z3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sk2Var2.f(l14Var) ? 32 : 16;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i4 |= sk2Var2.f(ih4Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            y26Var2 = y26Var;
            i4 |= sk2Var2.f(y26Var2) ? 2048 : 1024;
        } else {
            y26Var2 = y26Var;
        }
        if ((i2 & 24576) == 0) {
            i4 |= sk2Var2.f(yb1Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= sk2Var2.h(et0Var) ? 131072 : 65536;
        }
        boolean z7 = true;
        if (sk2Var2.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            boolean z8 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object L = sk2Var2.L();
            if (z8 || L == su0.a) {
                L = uc7Var.a(new to(str));
                sk2Var2.h0(L);
            }
            String str2 = ((uw6) L).a.B;
            if (((Boolean) bh7.a(l14Var, sk2Var2, (i4 >> 3) & 14).getValue()).booleanValue()) {
                v03Var = v03.Focused;
            } else {
                v03Var = str2.length() == 0 ? v03.UnfocusedEmpty : v03.UnfocusedNotEmpty;
            }
            gp6 gp6Var = new gp6(yb1Var, z2, z3, l14Var);
            ye6 ye6Var = d17.b;
            c17 c17Var = (c17) sk2Var2.j(ye6Var);
            ds6 ds6Var = c17Var.g;
            ds6 ds6Var2 = c17Var.l;
            long b2 = ds6Var.b();
            long j = xq0.h;
            if ((!xq0.c(b2, j) || xq0.c(ds6Var2.b(), j)) && (xq0.c(ds6Var.b(), j) || !xq0.c(ds6Var2.b(), j))) {
                z7 = false;
            }
            y60 y60Var2 = y60.C0;
            sk2Var2.X(-1443813555);
            long b3 = ((c17) sk2Var2.j(ye6Var)).l.b();
            if (z7) {
                sk2Var2.X(-887928539);
                if (b3 == 16) {
                    b3 = ((xq0) gp6Var.i(v03Var, sk2Var2, 0)).a;
                }
                z5 = false;
                sk2Var2.p(false);
                y60Var = y60Var2;
            } else {
                y60Var = y60Var2;
                z5 = false;
                sk2Var2.X(1218284988);
                sk2Var2.p(false);
            }
            long j2 = b3;
            sk2Var2.p(z5);
            sk2Var2.X(-1443806289);
            long b4 = ((c17) sk2Var2.j(ye6Var)).g.b();
            if (z7) {
                sk2Var2.X(-1026713946);
                if (b4 == 16) {
                    b4 = ((xq0) gp6Var.i(v03Var, sk2Var2, 0)).a;
                }
                z6 = false;
                sk2Var2.p(false);
            } else {
                z6 = false;
                sk2Var2.X(798166043);
                sk2Var2.p(false);
            }
            sk2Var2.p(z6);
            if (aj2Var2 != null) {
                z6 = true;
            }
            sk2Var = sk2Var2;
            y60Var.b(v03Var, j2, b4, gp6Var, z6, ct3.H0(33336375, new fp6(aj2Var2, str2, yb1Var, z2, z3, l14Var, y26Var2, nq6Var, aj2Var3, z4, ih4Var, z7, et0Var), sk2Var), sk2Var, 1769472);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: ap6
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(i | 1);
                    int I2 = ep2.I(i2);
                    jk2.a(nq6.this, str, aj2Var, uc7Var, aj2Var2, z, z2, z3, l14Var, ih4Var, y26Var, yb1Var, et0Var, (tu0) obj, I, I2);
                    return o27.a;
                }
            };
        }
    }

    public static final void b(ee5 ee5Var, ee5 ee5Var2, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        long j;
        int i6;
        sk2 sk2Var;
        String str;
        ye6 ye6Var;
        int i7;
        dz2 dz2Var;
        int i8;
        String str2;
        to f;
        int e;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(537291603);
        if (sk2Var2.f(ee5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (sk2Var2.f(ee5Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if ((i10 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i10 & 1, z)) {
            ye6 ye6Var2 = d17.b;
            long j2 = ((c17) sk2Var2.j(ye6Var2)).i.b.c;
            Resources resources = (Resources) sk2Var2.j(ue.c);
            dz2 P = nl2.P("spinner-rotation", sk2Var2, 0);
            if ((i10 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var2.L();
            if (!z2 && L != su0.a) {
                str = "checkmark";
                ye6Var = ye6Var2;
                f = L;
                str2 = "spinner";
                j = j2;
                dz2Var = P;
            } else {
                if (ee5Var2 != null) {
                    i4 = ee5Var2.a;
                } else {
                    i4 = 0;
                }
                if (ee5Var2 != null) {
                    i5 = ee5Var2.b;
                } else {
                    i5 = 0;
                }
                ro roVar = new ro();
                j = j2;
                if (ee5Var != null) {
                    i6 = ee5Var.a;
                } else {
                    i6 = 0;
                }
                if (i6 > 0) {
                    dz2Var = P;
                    js6[] js6VarArr = is6.b;
                    long j3 = j & 1095216660480L;
                    if (j3 == 0) {
                        oz2.a("Cannot perform operation for Unspecified type.");
                    }
                    ye6Var = ye6Var2;
                    sk2Var = sk2Var2;
                    i7 = i5;
                    e = roVar.e(new bj4(hi2.L(is6.c(j) * 1.5f, j3), new sq6(2, b70.a)));
                    try {
                        oo2.s(roVar, "pending-achievement");
                        roVar.b("\u2003");
                        String quantityString = resources.getQuantityString(R.plurals.retroachievements_pending_achievement_unlocks, i4, Integer.valueOf(i4));
                        quantityString.getClass();
                        roVar.b(quantityString);
                        roVar.b(" ");
                        if (i4 <= 0) {
                            str = "checkmark";
                            oo2.s(roVar, str);
                        } else {
                            oo2.s(roVar, "spinner");
                            str = "checkmark";
                        }
                    } finally {
                        roVar.d(e);
                    }
                } else {
                    sk2Var = sk2Var2;
                    str = "checkmark";
                    ye6Var = ye6Var2;
                    i7 = i5;
                    dz2Var = P;
                }
                if (ee5Var != null) {
                    i8 = ee5Var.b;
                } else {
                    i8 = 0;
                }
                if (i8 <= 0) {
                    str2 = "spinner";
                } else {
                    js6[] js6VarArr2 = is6.b;
                    long j4 = j & 1095216660480L;
                    if (j4 == 0) {
                        oz2.a("Cannot perform operation for Unspecified type.");
                    }
                    str2 = "spinner";
                    e = roVar.e(new bj4(hi2.L(is6.c(j) * 1.5f, j4), new sq6(2, b70.a)));
                    try {
                        oo2.s(roVar, "pending-leaderboard");
                        roVar.b("\u2003");
                        int i11 = i7;
                        String quantityString2 = resources.getQuantityString(R.plurals.retroachievements_pending_leaderboard_entries, i11, Integer.valueOf(i7));
                        quantityString2.getClass();
                        roVar.b(quantityString2);
                        roVar.b(" ");
                        if (i11 > 0) {
                            oo2.s(roVar, str2);
                        } else {
                            oo2.s(roVar, str);
                        }
                    } finally {
                        roVar.d(e);
                    }
                }
                f = roVar.f();
                sk2Var2 = sk2Var;
                sk2Var2.h0(f);
            }
            to toVar = (to) f;
            lr0 a2 = jr0.a(rt.c, y60.j0, sk2Var2, 0);
            int hashCode = Long.hashCode(sk2Var2.T);
            sm4 l = sk2Var2.l();
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
            oo2.S(sk2Var2, mu0.f, a2);
            oo2.S(sk2Var2, mu0.e, l);
            oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var2, mu0.h);
            oo2.S(sk2Var2, mu0.d, e0);
            sk2 sk2Var3 = sk2Var2;
            long j5 = j;
            String str3 = str;
            ye6 ye6Var3 = ye6Var;
            ir6.b(me2.X(sk2Var2, R.string.retroachievements_unsynchronized_data_info), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var2.j(ye6Var)).i, sk2Var3, 0, 0, 65534);
            ir6.c(toVar, b53.Z(wy3Var, RecyclerView.A1, 8.0f, 1), 0L, 0L, null, 0L, 0L, 0, false, 0, 0, zt3.l0(new ti4("pending-achievement", new tz2(new co4(j5, j5), dt3.R)), new ti4("pending-leaderboard", new tz2(new co4(j5, j5), dt3.X)), new ti4(str2, new tz2(new co4(j5, j5), ct3.H0(-1509985660, new km4(0, dz2Var), sk2Var3))), new ti4(str3, new tz2(new co4(((c17) sk2Var3.j(ye6Var3)).i.a.b, ((c17) sk2Var3.j(ye6Var3)).i.a.b), dt3.Y))), null, ((c17) sk2Var3.j(ye6Var3)).i, sk2Var3, 48, 0, 98300);
            ro roVar2 = new ro();
            roVar2.append(resources.getString(R.string.retroachievements_unsynchronized_data_connect_internet));
            roVar2.append('\n');
            qo qoVar = new qo(new xb6(0L, 0L, pe2.d0, (ke2) null, (le2) null, (pd2) null, (String) null, 0L, (d10) null, (rq6) null, (fr3) null, 0L, (qo6) null, (u26) null, 65531), roVar2.A.length(), 0, 12);
            ArrayList arrayList = roVar2.B;
            arrayList.add(qoVar);
            roVar2.L.add(qoVar);
            int size = arrayList.size() - 1;
            try {
                String string = resources.getString(R.string.retroachievements_unsynchronized_data_loss_info);
                string.getClass();
                roVar2.b(string);
                roVar2.d(size);
                ir6.c(roVar2.f(), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, null, ((c17) sk2Var3.j(ye6Var3)).i, sk2Var3, 0, 0, 131070);
                sk2Var2 = sk2Var3;
                sk2Var2.p(true);
            } catch (Throwable th) {
                roVar2.d(size);
                throw th;
            }
        } else {
            sk2Var2.R();
        }
        m55 r = sk2Var2.r();
        if (r != null) {
            r.d = new s4(i, 29, ee5Var, ee5Var2);
        }
    }

    public static final void c(long j, ds6 ds6Var, aj2 aj2Var, tu0 tu0Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(2064632657);
        if (sk2Var.e(j)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i3 | i;
        int i9 = i2 & 2;
        if (i9 != 0) {
            i5 = i8 | 48;
        } else {
            if (sk2Var.f(ds6Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i8 | i4;
        }
        if ((i2 & 4) != 0) {
            i5 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(null)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i5 |= i6;
        }
        if (sk2Var.h(aj2Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i10 = i5 | i7;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i10 & 1, z)) {
            if (i9 != 0) {
                ds6Var = null;
            }
            et0 H0 = ct3.H0(-650790565, new bp6(j, (Float) null, aj2Var), sk2Var);
            if (ds6Var != null) {
                sk2Var.X(-162880673);
                ir6.a(ds6Var, H0, sk2Var, ((i10 >> 3) & 14) | 48);
            } else {
                sk2Var.X(-162879037);
                H0.j(sk2Var, 6);
            }
            sk2Var.p(false);
        } else {
            sk2Var.R();
        }
        ds6 ds6Var2 = ds6Var;
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new cp6(j, ds6Var2, aj2Var, i, i2);
        }
    }

    public static final void d(tu0 tu0Var, int i) {
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1829798492);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i & 1, z)) {
            lr0 a2 = jr0.a(new ot(8.0f, true, new i(1)), y60.j0, sk2Var, 6);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, wy3.a);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            sk2Var.X(1163639459);
            ro roVar = new ro();
            roVar.b(me2.X(sk2Var, R.string.retroachievements_unsynchronized_data_synchronized));
            roVar.b(" ");
            oo2.s(roVar, "checkmark");
            to f = roVar.f();
            sk2Var.p(false);
            ye6 ye6Var = d17.b;
            ds6 ds6Var = ((c17) sk2Var.j(ye6Var)).i;
            pe2 pe2Var = pe2.d0;
            Map singletonMap = Collections.singletonMap("checkmark", new tz2(new co4(((c17) sk2Var.j(ye6Var)).i.a.b, ((c17) sk2Var.j(ye6Var)).i.a.b), dt3.Z));
            singletonMap.getClass();
            ir6.c(f, null, 0L, 0L, pe2Var, 0L, 0L, 0, false, 0, 0, singletonMap, null, ds6Var, sk2Var, 196608, 0, 98270);
            ir6.b(me2.X(sk2Var, R.string.retroachievements_unsynchronized_data_exiting), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var.j(ye6Var)).i, sk2Var, 0, 0, 65534);
            sk2Var = sk2Var;
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new qt0(i, 23);
        }
    }

    public static final void e(zy3 zy3Var, i05 i05Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        i05Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1151379056);
        if (sk2Var.f(zy3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.h(i05Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i5 & 1, z)) {
            boolean f = sk2Var.f(i05Var);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (f || L == sn1Var) {
                L = me2.G(gu3.SHOW_ICON);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) L;
            boolean f2 = sk2Var.f(k24Var);
            Object L2 = sk2Var.L();
            if (f2 || L2 == sn1Var) {
                L2 = new x5(k24Var, null, 2);
                sk2Var.h0(L2);
            }
            l.g(sk2Var, (aj2) L2, i05Var);
            l07.a(o76.l(400.0f, 1, Q(b53.X(zy3Var, 16.0f), 8.0f, gr5.b(8.0f), false, mh7.d(4294956800L), 12)), gr5.b(8.0f), mh7.d(4294956800L), ct3.H0(1353536755, new s4(13, i05Var, k24Var), sk2Var), sk2Var, 1572864, 56);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, 14, zy3Var, i05Var);
        }
    }

    public static final long f(int i) {
        long j = i << 32;
        int i2 = r93.X;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0348, code lost:
        if (r7.d(0) == false) goto L271;
     */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x049b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(defpackage.zy3 r42, final defpackage.ya1 r43, final defpackage.ih4 r44, final defpackage.jf4 r45, final defpackage.ba6 r46, final boolean r47, final defpackage.eg r48, final defpackage.k45 r49, defpackage.u54 r50, final defpackage.i20 r51, final defpackage.sn1 r52, final defpackage.et0 r53, defpackage.tu0 r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk2.g(zy3, ya1, ih4, jf4, ba6, boolean, eg, k45, u54, i20, sn1, et0, tu0, int, int):void");
    }

    public static final void h(u92 u92Var, ki2 ki2Var, ki2 ki2Var2, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        ki2 ki2Var3;
        sk2 sk2Var;
        boolean z2;
        aj2 wx1Var;
        k24 k24Var;
        u92Var.getClass();
        ki2Var.getClass();
        ki2Var2.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-778426770);
        if (sk2Var2.h(u92Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (sk2Var2.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (sk2Var2.h(ki2Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        boolean z3 = false;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i7 & 1, z)) {
            k24 v = l.v(u92Var, null, sk2Var2, (i7 & 14) | 48);
            if (((ee5) v.getValue()) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean g = sk2Var2.g(z2);
            Object L = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (g || L == sn1Var) {
                L = (ee5) v.getValue();
                sk2Var2.h0(L);
            }
            ee5 ee5Var = (ee5) L;
            Object L2 = sk2Var2.L();
            if (L2 == sn1Var) {
                L2 = me2.G(Boolean.FALSE);
                sk2Var2.h0(L2);
            }
            k24 k24Var2 = (k24) L2;
            ee5 ee5Var2 = (ee5) v.getValue();
            boolean f = sk2Var2.f(v);
            if ((i7 & 112) == 32) {
                z3 = true;
            }
            boolean z4 = f | z3;
            Object L3 = sk2Var2.L();
            if (!z4 && L3 != sn1Var) {
                ki2Var3 = ki2Var;
                wx1Var = L3;
                k24Var = k24Var2;
            } else {
                k24Var = k24Var2;
                wx1Var = new wx1(ki2Var, v, k24Var, (j11) null, 16);
                ki2Var3 = ki2Var;
                sk2Var2.h0(wx1Var);
            }
            l.g(sk2Var2, wx1Var, ee5Var2);
            String X = me2.X(sk2Var2, R.string.retroachievements_unsynchronized_data);
            Object L4 = sk2Var2.L();
            if (L4 == sn1Var) {
                L4 = new d5(17);
                sk2Var2.h0(L4);
            }
            sk2Var = sk2Var2;
            mh7.a(X, (ki2) L4, ct3.H0(-1186299645, new m4(ee5Var, k24Var, v, 5), sk2Var2), ct3.H0(-913176187, new hl0(ki2Var2, ki2Var3, 2), sk2Var2), false, sk2Var, 3504, 16);
        } else {
            ki2Var3 = ki2Var;
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w3(u92Var, ki2Var3, ki2Var2, i, 23);
        }
    }

    public static final void i(zy3 zy3Var, h15 h15Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        String str;
        int i4;
        zy3 zy3Var2 = zy3Var;
        zy3Var2.getClass();
        h15Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(765706284);
        if (sk2Var.f(zy3Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (sk2Var.h(h15Var)) {
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
        if (sk2Var.O(i6 & 1, z)) {
            URL a2 = h15Var.a();
            if (a2 != null) {
                str = a2.toString();
            } else {
                str = null;
            }
            if (h15Var instanceof g15) {
                sk2Var.X(584785047);
                String str2 = str;
                fr5 fr5Var = pd7.a;
                ax2 N = mh7.N();
                String X = me2.X(sk2Var, R.string.ra_welcome_eyebrow);
                g15 g15Var = (g15) h15Var;
                String W = me2.W(R.string.ra_welcome_title, new Object[]{g15Var.b}, sk2Var);
                if (g15Var.c) {
                    i4 = R.string.ra_welcome_hardcore;
                } else {
                    i4 = R.string.ra_welcome_softcore;
                }
                pd7.a(zy3Var2, str2, fr5Var, N, X, W, me2.X(sk2Var, i4), 0, 0L, sk2Var, (i6 & 14) | RendererDebugBridge.CAPTURE_HEIGHT, RendererDebugBridge.CAPTURE_HEIGHT);
                sk2Var.p(false);
                zy3Var2 = zy3Var;
            } else {
                String str3 = str;
                if (h15Var instanceof c15) {
                    sk2Var.X(585363941);
                    c15 c15Var = (c15) h15Var;
                    zy3Var2 = zy3Var;
                    pd7.a(zy3Var2, str3, null, hk2.C(), me2.X(sk2Var, R.string.ra_now_playing), me2.X(sk2Var, R.string.achievements_loaded), me2.W(R.string.ra_achievements_progress, new Object[]{Integer.valueOf(c15Var.b), Integer.valueOf(c15Var.c)}, sk2Var), 0, 0L, sk2Var, i6 & 14, 388);
                    sk2Var.p(false);
                } else if (h15Var instanceof d15) {
                    sk2Var.X(585939146);
                    zy3Var2 = zy3Var;
                    pd7.a(zy3Var2, str3, null, hk2.C(), me2.X(sk2Var, R.string.ra_now_playing), me2.X(sk2Var, R.string.game_has_no_achievements), me2.X(sk2Var, R.string.ra_no_achievements), 0, 0L, sk2Var, i6 & 14, 388);
                    sk2Var.p(false);
                } else if (h15Var instanceof b15) {
                    sk2Var.X(586375657);
                    zy3Var2 = zy3Var;
                    pd7.a(zy3Var2, str3, null, io2.N(), me2.X(sk2Var, R.string.ra_welcome_eyebrow), me2.X(sk2Var, R.string.achievements_failed_load), me2.X(sk2Var, R.string.achievements_failed_load_tip), 2, kd7.a.j, sk2Var, (i6 & 14) | 113246208, 4);
                    sk2Var.p(false);
                } else if (h15Var instanceof e15) {
                    sk2Var.X(586911461);
                    zy3Var2 = zy3Var;
                    pd7.a(zy3Var2, str3, null, io2.N(), me2.X(sk2Var, R.string.ra_welcome_eyebrow), me2.X(sk2Var, R.string.achievements_login_expired), me2.X(sk2Var, R.string.achievements_login_expired_tip), 2, kd7.a.j, sk2Var, (i6 & 14) | 113246208, 4);
                    sk2Var.p(false);
                } else if (h15Var instanceof f15) {
                    sk2Var.X(587461463);
                    zy3Var2 = zy3Var;
                    pd7.a(zy3Var2, str3, null, io2.N(), me2.X(sk2Var, R.string.ra_welcome_eyebrow), me2.X(sk2Var, R.string.offline_ra_disabled_no_cache_title), me2.X(sk2Var, R.string.offline_ra_disabled_no_cache_message), 2, kd7.a.j, sk2Var, (i6 & 14) | 113246208, 4);
                    sk2Var.p(false);
                } else {
                    throw ej6.d(sk2Var, 1404338292, false);
                }
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new i15(i, 0, zy3Var2, h15Var);
        }
    }

    public static final void j(String str, boolean z, mi2 mi2Var, float f, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        str.getClass();
        mi2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1457840675);
        if (sk2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (sk2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (sk2Var.c(f)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i9 & 1, z2)) {
            wy3 wy3Var = wy3.a;
            zy3 c2 = o76.c(wy3Var, 1.0f);
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i9 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object L = sk2Var.L();
            if (z5 || L == su0.a) {
                L = new sx0(mi2Var, z, 2);
                sk2Var.h0(L);
            }
            zy3 a0 = b53.a0(o76.e(48.0f, 2, ct3.f0(a53.s(c2, false, null, (ki2) L, 15), false, null, 3)), f, 8.0f, f, 8.0f);
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, a0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            ir6.b(str, new xg3(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((c17) sk2Var.j(d17.b)).i, sk2Var, i9 & 14, 3120, 55292);
            cg2.k(sk2Var, o76.k(wy3Var, 16.0f));
            Resources.Theme theme = ((Context) sk2Var.j(ue.b)).getTheme();
            ThreadLocal threadLocal = ac5.a;
            hl6.a(z, null, null, false, hk2.g(mh7.c(((Resources) sk2Var.j(ue.c)).getColor(R.color.switchThumbUnselected, theme)), sk2Var, 1015), sk2Var, ((i9 >> 3) & 14) | 48, 28);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vl1(str, z, mi2Var, f, i);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.sk6 r7, defpackage.m00 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fg5
            if (r0 == 0) goto L13
            r0 = r8
            fg5 r0 = (defpackage.fg5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            fg5 r0 = new fg5
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            sk6 r7 = r0.R
            defpackage.me2.a0(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L30:
            defpackage.me2.a0(r8)
        L33:
            r0.R = r7
            r0.Y = r3
            lp4 r8 = defpackage.lp4.Main
            java.lang.Object r8 = r7.c(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            kp4 r8 = (defpackage.kp4) r8
            int r2 = r8.d
            java.util.List r8 = r8.a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            rp4 r6 = (defpackage.rp4) r6
            boolean r6 = defpackage.ve2.n(r6)
            if (r6 != 0) goto L5f
            goto L33
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk2.k(sk6, m00):java.lang.Object");
    }

    public static final int l(int i, o24 o24Var) {
        int i2 = o24Var.L - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = o24Var.A;
            int i5 = ((p43) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((p43) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final void m(int i) {
        if (i >= 1) {
            return;
        }
        i.g(wh1.g(i, "Expected positive parallelism level, but got "));
    }

    public static void n(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static k24 o() {
        return new tj4(o27.a, k45.f0);
    }

    public static boolean p(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean q = q(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return q;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean q(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final void r(jo2 jo2Var, e77 e77Var) {
        List list = e77Var.e0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g77 g77Var = (g77) list.get(i);
            if (g77Var instanceof i77) {
                lk4 lk4Var = new lk4();
                i77 i77Var = (i77) g77Var;
                lk4Var.d = i77Var.B;
                lk4Var.n = true;
                lk4Var.c();
                lk4Var.s.h(i77Var.L);
                lk4Var.c();
                lk4Var.c();
                lk4Var.b = i77Var.R;
                lk4Var.c();
                lk4Var.c = i77Var.X;
                lk4Var.c();
                lk4Var.g = i77Var.Y;
                lk4Var.c();
                lk4Var.e = i77Var.Z;
                lk4Var.c();
                lk4Var.f = i77Var.c0;
                lk4Var.o = true;
                lk4Var.c();
                lk4Var.h = i77Var.d0;
                lk4Var.o = true;
                lk4Var.c();
                lk4Var.i = i77Var.e0;
                lk4Var.o = true;
                lk4Var.c();
                lk4Var.j = i77Var.f0;
                lk4Var.o = true;
                lk4Var.c();
                lk4Var.k = i77Var.g0;
                lk4Var.p = true;
                lk4Var.c();
                lk4Var.l = i77Var.h0;
                lk4Var.p = true;
                lk4Var.c();
                lk4Var.m = i77Var.i0;
                lk4Var.p = true;
                lk4Var.c();
                jo2Var.e(i, lk4Var);
            } else if (g77Var instanceof e77) {
                jo2 jo2Var2 = new jo2();
                e77 e77Var2 = (e77) g77Var;
                jo2Var2.k = e77Var2.A;
                jo2Var2.c();
                jo2Var2.l = e77Var2.B;
                jo2Var2.s = true;
                jo2Var2.c();
                jo2Var2.o = e77Var2.X;
                jo2Var2.s = true;
                jo2Var2.c();
                jo2Var2.p = e77Var2.Y;
                jo2Var2.s = true;
                jo2Var2.c();
                jo2Var2.q = e77Var2.Z;
                jo2Var2.s = true;
                jo2Var2.c();
                jo2Var2.r = e77Var2.c0;
                jo2Var2.s = true;
                jo2Var2.c();
                jo2Var2.m = e77Var2.L;
                jo2Var2.s = true;
                jo2Var2.c();
                jo2Var2.n = e77Var2.R;
                jo2Var2.s = true;
                jo2Var2.c();
                jo2Var2.f = e77Var2.d0;
                jo2Var2.g = true;
                jo2Var2.c();
                r(jo2Var2, e77Var2);
                jo2Var.e(i, jo2Var2);
            }
        }
    }

    public static final long s() {
        return Thread.currentThread().getId();
    }

    public static final String t(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final fn3 u(View view) {
        fn3 fn3Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof fn3) {
                fn3Var = (fn3) tag;
            } else {
                fn3Var = null;
            }
            if (fn3Var != null) {
                return fn3Var;
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

    public static int w(Context context, int i, int i2) {
        Integer num;
        int i3;
        TypedValue O = hk2.O(context, i);
        if (O != null) {
            int i4 = O.resourceId;
            if (i4 != 0) {
                i3 = context.getColor(i4);
            } else {
                i3 = O.data;
            }
            num = Integer.valueOf(i3);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i2;
    }

    public static int x(View view, int i) {
        Context context = view.getContext();
        TypedValue Q = hk2.Q(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = Q.resourceId;
        if (i2 != 0) {
            return context.getColor(i2);
        }
        return Q.data;
    }

    public static String y(fh fhVar, int i) {
        fhVar.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = fhVar.A;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static b06 z(b44 b44Var) {
        b44Var.getClass();
        return d06.x0(b44Var, new gi3(28));
    }

    public abstract int B(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int E();

    public abstract ViewPropertyAnimator F(View view, int i);

    public abstract y55 v();
}
