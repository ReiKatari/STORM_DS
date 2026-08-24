package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d90  reason: default package */
/* loaded from: classes.dex */
public final class d90 implements b51, gz0, a70, rk0, k61, t54, pv7, ji2, fu, iu, ba0 {
    public static volatile boolean x0;
    public final /* synthetic */ int A;
    public static final d90 B = new d90(0);
    public static final e40 L = new e40(-1.0f, -1.0f);
    public static final e40 R = new e40(RecyclerView.B1, -1.0f);
    public static final e40 X = new e40(1.0f, -1.0f);
    public static final e40 Y = new e40(-1.0f, RecyclerView.B1);
    public static final e40 Z = new e40(RecyclerView.B1, RecyclerView.B1);
    public static final e40 d0 = new e40(1.0f, RecyclerView.B1);
    public static final e40 e0 = new e40(-1.0f, 1.0f);
    public static final e40 f0 = new e40(RecyclerView.B1, 1.0f);
    public static final e40 g0 = new e40(1.0f, 1.0f);
    public static final d40 h0 = new d40(-1.0f);
    public static final d40 i0 = new d40(RecyclerView.B1);
    public static final d40 j0 = new d40(1.0f);
    public static final c40 k0 = new c40(-1.0f);
    public static final c40 l0 = new c40(RecyclerView.B1);
    public static final c40 m0 = new c40(1.0f);
    public static final d90 n0 = new d90(2);
    public static final d90 o0 = new d90(3);
    public static final d90 p0 = new d90(4);
    public static final d90 q0 = new d90(5);
    public static final /* synthetic */ d90 r0 = new d90(6);
    public static final d90 s0 = new d90(7);
    public static final d90 t0 = new d90(8);
    public static final /* synthetic */ d90 u0 = new d90(9);
    public static final d90 v0 = new d90(10);
    public static final d90 w0 = new d90(11);
    public static final d90 y0 = new d90(12);
    public static final d90 z0 = new d90(13);
    public static final d90 A0 = new d90(14);
    public static final d90 B0 = new d90(15);
    public static final d90 C0 = new d90(16);
    public static final /* synthetic */ d90 D0 = new d90(17);
    public static final d90 E0 = new d90(18);
    public static final d90 F0 = new d90(19);
    public static final d90 G0 = new d90(20);
    public static final d90 H0 = new d90(21);

    public /* synthetic */ d90(int i) {
        this.A = i;
    }

    public static bv3 k(List list, float f, float f2, int i) {
        float f3;
        float f4;
        if ((i & 2) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i & 4) != 0) {
            f4 = Float.POSITIVE_INFINITY;
        } else {
            f4 = f2;
        }
        return new bv3(list, null, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), 0);
    }

    public static bv3 l(List list, long j, long j2) {
        return new bv3(list, null, j, j2, 0);
    }

    public static bv3 m(List list, float f, float f2, int i) {
        float f3;
        float f4;
        if ((i & 2) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i & 4) != 0) {
            f4 = Float.POSITIVE_INFINITY;
        } else {
            f4 = f2;
        }
        return new bv3(list, null, (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), 0);
    }

    @Override // defpackage.fu, defpackage.iu
    public float a() {
        return RecyclerView.B1;
    }

    @Override // defpackage.ba0
    public byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.pv7
    public lv7 c(Activity activity, rh1 rh1Var) {
        rh1Var.getClass();
        a70.a.getClass();
        return new lv7(new w60(z60.a().f(activity)), rh1Var.l(activity));
    }

    @Override // defpackage.gz0
    public void configure(z32 z32Var) {
        ex exVar = ex.a;
        z32Var.registerEncoder(u30.class, exVar);
        z32Var.registerEncoder(rx.class, exVar);
        hx hxVar = hx.a;
        z32Var.registerEncoder(py3.class, hxVar);
        z32Var.registerEncoder(oy.class, hxVar);
        fx fxVar = fx.a;
        z32Var.registerEncoder(rr0.class, fxVar);
        z32Var.registerEncoder(wx.class, fxVar);
        dx dxVar = dx.a;
        z32Var.registerEncoder(be.class, dxVar);
        z32Var.registerEncoder(ox.class, dxVar);
        gx gxVar = gx.a;
        z32Var.registerEncoder(oy3.class, gxVar);
        z32Var.registerEncoder(ny.class, gxVar);
        ix ixVar = ix.a;
        z32Var.registerEncoder(te4.class, ixVar);
        z32Var.registerEncoder(qy.class, ixVar);
    }

    @Override // defpackage.fu
    public void d(qh1 qh1Var, int i, int[] iArr, kk3 kk3Var, int[] iArr2) {
        if (kk3Var == kk3.Ltr) {
            ju.a(i, iArr, iArr2, false);
        } else {
            ju.a(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.pv7
    public lv7 e(Context context, rh1 rh1Var) {
        rh1Var.getClass();
        Context context2 = context;
        while (true) {
            if (context2 instanceof ContextWrapper) {
                if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) context2;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                context2 = contextWrapper.getBaseContext();
                context2.getClass();
            } else {
                context2 = context;
                break;
            }
        }
        if (context2 instanceof Activity) {
            return c((Activity) context2, rh1Var);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            i.h("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new lv7(new Rect(0, 0, point.x, point.y), rh1Var.l(context));
    }

    @Override // defpackage.a70
    public Rect f(Activity activity) {
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
            a70.a.getClass();
            Log.w(z60.b, e);
            return xd5.L.f(activity);
        }
    }

    @Override // defpackage.iu
    public void g(qh1 qh1Var, int i, int[] iArr, int[] iArr2) {
        ju.a(i, iArr, iArr2, false);
    }

    @Override // defpackage.b51
    public Object h(Object obj) {
        switch (this.A) {
            case 0:
                return obj.toString();
            default:
                return (yl5) obj;
        }
    }

    public void i(final boolean z, final boolean z2, final r94 r94Var, final i17 i17Var, final ke6 ke6Var, float f, float f2, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        final float f3;
        final float f4;
        int i7;
        float f5;
        float f6;
        float f7;
        pp6 b0;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(943754022);
        if (xq2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (xq2Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (xq2Var.f(r94Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (xq2Var.f(i17Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (xq2Var.f(ke6Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6 | 589824;
        if ((4793491 & i12) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var.S(i12 & 1, z3)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                i7 = i12 & (-4128769);
                f5 = f;
                f6 = f2;
            } else {
                i7 = i12 & (-4128769);
                f5 = 2.0f;
                f6 = 1.0f;
            }
            xq2Var.q();
            qa4 a = bw7.a(r94Var, xq2Var, ((i7 & 8190) >> 6) & 14);
            pp6 f8 = i17Var.f(z, z2, r94Var, xq2Var, i7 & 8190);
            if (((Boolean) a.getValue()).booleanValue()) {
                f7 = f5;
            } else {
                f7 = f6;
            }
            if (z) {
                xq2Var.b0(1361082574);
                b0 = in.a(f7, ge7.Y(150, 0, null, 6), xq2Var, 48, 12);
                xq2Var.p(false);
            } else {
                xq2Var.b0(1361186796);
                b0 = np2.b0(new om1(f6), xq2Var);
                xq2Var.p(false);
            }
            c60 c60Var = (c60) np2.b0(new c60(((om1) b0.getValue()).A, new cn6(((kt0) f8.getValue()).a)), xq2Var).getValue();
            h70.a(new b60(c60Var.a, c60Var.b, ke6Var), xq2Var, 0);
            f3 = f5;
            f4 = f6;
        } else {
            xq2Var.V();
            f3 = f;
            f4 = f2;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(z, z2, r94Var, i17Var, ke6Var, f3, f4, i) { // from class: k17
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ r94 R;
                public final /* synthetic */ i17 X;
                public final /* synthetic */ ke6 Y;
                public final /* synthetic */ float Z;
                public final /* synthetic */ float d0;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(12582913);
                    d90.this.i(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public void j(final String str, final eo2 eo2Var, final boolean z, final boolean z2, final wq7 wq7Var, final r94 r94Var, final boolean z3, final eo2 eo2Var2, final eo2 eo2Var3, final ke6 ke6Var, final i17 i17Var, lq4 lq4Var, final zv0 zv0Var, px0 px0Var, final int i) {
        int i2;
        eo2 eo2Var4;
        boolean z4;
        boolean z5;
        wq7 wq7Var2;
        int i3;
        int i4;
        int i5;
        boolean z6;
        xq2 xq2Var;
        final lq4 lq4Var2;
        pq4 pq4Var;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1154925202);
        if ((i & 6) == 0) {
            if (xq2Var2.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i2 = i16 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            eo2Var4 = eo2Var;
            if (xq2Var2.h(eo2Var4)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i2 |= i15;
        } else {
            eo2Var4 = eo2Var;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            z4 = z;
            if (xq2Var2.g(z4)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i2 |= i14;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            z5 = z2;
            if (xq2Var2.g(z5)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i2 |= i13;
        } else {
            z5 = z2;
        }
        if ((i & 24576) == 0) {
            wq7Var2 = wq7Var;
            if (xq2Var2.f(wq7Var2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i2 |= i12;
        } else {
            wq7Var2 = wq7Var;
        }
        if ((i & 196608) == 0) {
            if (xq2Var2.f(r94Var)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i2 |= i11;
        }
        if ((i & 1572864) == 0) {
            if (xq2Var2.g(z3)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i2 |= i10;
        }
        if ((i & 12582912) == 0) {
            if (xq2Var2.h(eo2Var2)) {
                i9 = 8388608;
            } else {
                i9 = Compress.MAXWINSIZE;
            }
            i2 |= i9;
        }
        if ((i & 100663296) == 0) {
            if (xq2Var2.h(eo2Var3)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i2 |= i8;
        }
        if ((i & 805306368) == 0) {
            if (xq2Var2.h(null)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i2 |= i7;
        }
        if (xq2Var2.h(null)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i17 = 221184 | i3;
        if (xq2Var2.f(ke6Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i18 = i17 | i4;
        if (xq2Var2.f(i17Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i19 = i18 | i5 | 1024;
        if ((306783379 & i2) == 306783378 && (74899 & i19) == 74898) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (xq2Var2.S(i2 & 1, z6)) {
            xq2Var2.X();
            if ((i & 1) != 0 && !xq2Var2.B()) {
                xq2Var2.V();
                i6 = i19 & (-7169);
                pq4Var = lq4Var;
            } else {
                pq4Var = new pq4(16.0f, 16.0f, 16.0f, 16.0f);
                i6 = i19 & (-7169);
            }
            xq2Var2.q();
            int i20 = i2 << 3;
            int i21 = ((i2 >> 3) & 7168) | (i20 & 112) | 6 | (i20 & 896);
            int i22 = i2 >> 9;
            int i23 = i6 << 6;
            xq2Var = xq2Var2;
            eo2 eo2Var5 = eo2Var4;
            boolean z7 = z4;
            boolean z8 = z5;
            wq7 wq7Var3 = wq7Var2;
            nj2.a(b37.Outlined, str, eo2Var5, wq7Var3, eo2Var2, eo2Var3, z8, z7, z3, r94Var, pq4Var, ke6Var, i17Var, zv0Var, xq2Var, i21 | (i22 & 57344) | (i22 & 458752) | (i22 & 3670016) | ((i6 << 21) & 29360128) | ((i2 << 15) & 234881024) | ((i2 << 21) & 1879048192), (i23 & 57344) | ((i2 >> 12) & 112) | ((i2 >> 18) & 14) | (i23 & 7168) | 196608);
            lq4Var2 = pq4Var;
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
            lq4Var2 = lq4Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: j17
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(i | 1);
                    d90.this.j(str, eo2Var, z, z2, wq7Var, r94Var, z3, eo2Var2, eo2Var3, ke6Var, i17Var, lq4Var2, zv0Var, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public String toString() {
        switch (this.A) {
            case ConnectionResult.API_DISABLED /* 23 */:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }
}
