package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k45  reason: default package */
/* loaded from: classes.dex */
public class k45 implements x40, t11, ji0, d31, ta6, ay3, t57, s57, nt, qt, s01 {
    public static final k45 B = new k45(1);
    public static final k45 L = new k45(2);
    public static final k45 R = new k45(3);
    public static final k45 X = new k45(4);
    public static final /* synthetic */ k45 Y = new k45(5);
    public static final k45 Z = new k45(6);
    public static final y55 c0 = new y55(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final /* synthetic */ k45 d0 = new k45(8);
    public static final /* synthetic */ k45 e0 = new k45(9);
    public static final k45 f0 = new k45(10);
    public static final k45 g0 = new k45(11);
    public static final k45 h0 = new k45(12);
    public static final k45 i0 = new k45(13);
    public static final c44 j0 = new c44(26);
    public static final c44 k0 = new c44(27);
    public static final c44 l0 = new c44(28);
    public static final c44 m0 = new c44(29);
    public static final k45 n0 = new k45(16);
    public static final k45 o0 = new k45(17);
    public static final k45 p0 = new k45(18);
    public static final qg7 q0 = new Object();
    public static final /* synthetic */ int r0 = 0;
    public final /* synthetic */ int A;

    public /* synthetic */ k45(int i) {
        this.A = i;
    }

    public static String m(int i, ByteBuffer byteBuffer) {
        int i2;
        byteBuffer.getClass();
        if (i >= 0) {
            if (byteBuffer.remaining() >= 4) {
                i2 = byteBuffer.getInt();
            } else {
                i2 = 0;
            }
            int remaining = byteBuffer.remaining();
            if (i > remaining) {
                i = remaining;
            }
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 <= i) {
                i = i2;
            }
            return new String(bArr, 0, i, hk0.a);
        }
        i.i("slotBytes must not be negative");
        return null;
    }

    @Override // defpackage.nt, defpackage.qt
    public float a() {
        return RecyclerView.A1;
    }

    @Override // defpackage.ta6
    public boolean b(Object obj, Object obj2) {
        switch (this.A) {
            case 10:
                return false;
            default:
                return b53.x(obj, obj2);
        }
    }

    public void c(final boolean z, final boolean z2, final l14 l14Var, final yb1 yb1Var, final y26 y26Var, float f, float f2, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        final float f3;
        float f4;
        int i7;
        float f5;
        long j;
        int i8;
        bn1 bn1Var;
        ae6 L2;
        float f6;
        ae6 L3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(943754022);
        if (sk2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (sk2Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (sk2Var.f(l14Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (sk2Var.f(yb1Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (sk2Var.f(y26Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6 | 589824;
        if ((4793491 & i13) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sk2Var.O(i13 & 1, z3)) {
            sk2Var.T();
            if ((i & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
                f4 = f;
                i7 = i13 & (-4128769);
                f5 = f2;
            } else {
                f4 = 2.0f;
                i7 = i13 & (-4128769);
                f5 = 1.0f;
            }
            sk2Var.q();
            k24 a = bh7.a(l14Var, sk2Var, ((i7 & 8190) >> 6) & 14);
            yb1Var.getClass();
            sk2Var.X(476110356);
            k24 a2 = bh7.a(l14Var, sk2Var, ((i7 & 8190) >> 6) & 14);
            if (!z) {
                j = yb1Var.h;
            } else if (z2) {
                j = yb1Var.g;
            } else if (((Boolean) a2.getValue()).booleanValue()) {
                j = yb1Var.e;
            } else {
                j = yb1Var.f;
            }
            if (z) {
                sk2Var.X(1822093355);
                f = f4;
                bn1Var = null;
                i8 = 150;
                L2 = f76.a(j, ct3.V0(150, 0, null, 6), sk2Var, 48, 12);
                sk2Var.p(false);
            } else {
                f = f4;
                i8 = 150;
                bn1Var = null;
                sk2Var.X(1822196213);
                L2 = me2.L(new xq0(j), sk2Var);
                sk2Var.p(false);
            }
            sk2Var.p(false);
            if (((Boolean) a.getValue()).booleanValue()) {
                f6 = f;
            } else {
                f6 = f5;
            }
            if (z) {
                sk2Var.X(1361082574);
                L3 = wm.a(f6, ct3.V0(i8, 0, bn1Var, 6), sk2Var, 48, 12);
                sk2Var.p(false);
            } else {
                sk2Var.X(1361186796);
                L3 = me2.L(new ji1(f5), sk2Var);
                sk2Var.p(false);
            }
            e40 e40Var = (e40) me2.L(new e40(((ji1) L3.getValue()).A, new mb6(((xq0) L2.getValue()).a)), sk2Var).getValue();
            d50.a(new d40(e40Var.a, e40Var.b, y26Var), sk2Var, 0);
            f3 = f5;
        } else {
            sk2Var.R();
            f3 = f2;
        }
        final float f7 = f;
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(z, z2, l14Var, yb1Var, y26Var, f7, f3, i) { // from class: yo6
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ l14 R;
                public final /* synthetic */ yb1 X;
                public final /* synthetic */ y26 Y;
                public final /* synthetic */ float Z;
                public final /* synthetic */ float c0;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(12582913);
                    k45.this.c(this.B, this.L, this.R, this.X, this.Y, this.Z, this.c0, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    @Override // defpackage.s01
    public long d(long j, long j2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L);
        int i = vu5.a;
        return floatToRawIntBits;
    }

    public void e(final String str, final aj2 aj2Var, final boolean z, final boolean z2, final uc7 uc7Var, final l14 l14Var, final boolean z3, final aj2 aj2Var2, final y26 y26Var, final yb1 yb1Var, ih4 ih4Var, final et0 et0Var, tu0 tu0Var, final int i) {
        String str2;
        int i2;
        aj2 aj2Var3;
        boolean z4;
        boolean z5;
        uc7 uc7Var2;
        sk2 sk2Var;
        final ih4 ih4Var2;
        int i3;
        mh4 mh4Var;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(1154925202);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (sk2Var2.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            aj2Var3 = aj2Var;
            i2 |= sk2Var2.h(aj2Var3) ? 32 : 16;
        } else {
            aj2Var3 = aj2Var;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            z4 = z;
            i2 |= sk2Var2.g(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            z5 = z2;
            i2 |= sk2Var2.g(z5) ? 2048 : 1024;
        } else {
            z5 = z2;
        }
        if ((i & 24576) == 0) {
            uc7Var2 = uc7Var;
            i2 |= sk2Var2.f(uc7Var2) ? 16384 : 8192;
        } else {
            uc7Var2 = uc7Var;
        }
        if ((i & 196608) == 0) {
            i2 |= sk2Var2.f(l14Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= sk2Var2.g(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= sk2Var2.h(aj2Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= sk2Var2.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= sk2Var2.h(null) ? 536870912 : 268435456;
        }
        int i4 = 221184 | (sk2Var2.h(null) ? 4 : 2) | (sk2Var2.f(y26Var) ? 32 : 16) | (sk2Var2.f(yb1Var) ? 256 : 128) | 1024;
        if (sk2Var2.O(i2 & 1, ((306783379 & i2) == 306783378 && (74899 & i4) == 74898) ? false : true)) {
            sk2Var2.T();
            if ((i & 1) != 0 && !sk2Var2.y()) {
                sk2Var2.R();
                i3 = i4 & (-7169);
                mh4Var = ih4Var;
            } else {
                i3 = i4 & (-7169);
                mh4Var = new mh4(16.0f, 16.0f, 16.0f, 16.0f);
            }
            sk2Var2.q();
            int i5 = i2 << 3;
            sk2Var = sk2Var2;
            int i6 = ((i2 >> 3) & 7168) | (i5 & 112) | 6 | (i5 & 896);
            int i7 = i2 >> 9;
            int i8 = i6 | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | ((i3 << 21) & 29360128) | ((i2 << 15) & 234881024) | ((i2 << 21) & 1879048192);
            int i9 = ((i2 >> 18) & 14) | ((i2 >> 12) & 112);
            int i10 = i3 << 6;
            uc7 uc7Var3 = uc7Var2;
            jk2.a(nq6.Outlined, str2, aj2Var3, uc7Var3, aj2Var2, z5, z4, z3, l14Var, mh4Var, y26Var, yb1Var, et0Var, sk2Var, i8, i9 | (i10 & 7168) | (i10 & 57344) | 196608);
            ih4Var2 = mh4Var;
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
            ih4Var2 = ih4Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: xo6
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(i | 1);
                    k45.this.e(str, aj2Var, z, z2, uc7Var, l14Var, z3, aj2Var2, y26Var, yb1Var, ih4Var2, et0Var, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public List f(Executor executor) {
        return Collections.singletonList(new m91(executor));
    }

    @Override // defpackage.nt
    public void g(od1 od1Var, int i, int[] iArr, sd3 sd3Var, int[] iArr2) {
        if (sd3Var == sd3.Ltr) {
            rt.b(i, iArr, iArr2, false);
        } else {
            rt.b(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.x40
    public Rect h(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            invoke.getClass();
            return new Rect((Rect) invoke);
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            x40.a.getClass();
            Log.w(w40.b, e);
            return sn1.L.h(activity);
        }
    }

    @Override // defpackage.qt
    public void i(od1 od1Var, int i, int[] iArr, int[] iArr2) {
        rt.b(i, iArr, iArr2, false);
    }

    public List j() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.t11
    public Object k(Object obj) {
        return (gc5) obj;
    }

    public wg1 l(Context context) {
        wg1 wg1Var;
        context.getClass();
        wg1 wg1Var2 = wg1.k;
        if (wg1Var2 == null) {
            synchronized (this) {
                wg1Var = wg1.k;
                if (wg1Var == null) {
                    Context a = i11.a(context);
                    a.getClass();
                    wg1Var = new wg1(a);
                    wg1.k = wg1Var;
                }
            }
            return wg1Var;
        }
        return wg1Var2;
    }

    public String toString() {
        switch (this.A) {
            case 10:
                return "NeverEqualPolicy";
            case 16:
                return "StructuralEqualityPolicy";
            case 21:
                return "Arrangement#SpaceBetween";
            case 26:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
