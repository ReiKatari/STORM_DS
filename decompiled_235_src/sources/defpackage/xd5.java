package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Base64;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd5  reason: default package */
/* loaded from: classes.dex */
public final class xd5 implements a70, b51, rh1, c43, tz6, g36, im6, a54, lg1, a97, z31 {
    public static final xd5 B = new xd5(1);
    public static final xd5 L = new xd5(2);
    public static final xd5 R = new xd5(3);
    public static final i X = new i(11);
    public static final rf Y = new rf(1);
    public static final rf Z = new rf(2);
    public static final xd5 d0 = new xd5(6);
    public static final xd5 e0 = new xd5(7);
    public static final /* synthetic */ xd5 f0 = new xd5(8);
    public static final xd5 g0 = new xd5(9);
    public static final xd5 h0 = new xd5(10);
    public static final xd5 i0 = new xd5(11);
    public static final xd5 j0 = new xd5(12);
    public static final un4 k0 = new un4(1);
    public static final un4 l0 = new un4(0);
    public static final /* synthetic */ xd5 m0 = new xd5(14);
    public static final xd5 n0 = new xd5(15);
    public static final u34 o0 = new Object();
    public static final fa6 p0 = new fa6(0);
    public static final fa6 q0 = new fa6(1);
    public static final fa6 r0 = new fa6(2);
    public static final xd5 s0 = new xd5(17);
    public static final xd5 t0 = new xd5(18);
    public static final xd5 u0 = new xd5(19);
    public static final fa6 v0 = new fa6(18);
    public final /* synthetic */ int A;

    public /* synthetic */ xd5(int i) {
        this.A = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static da0 m(String str) {
        int i;
        char charAt;
        str.getClass();
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                char charAt2 = str.charAt(i3);
                if ('A' <= charAt2 && charAt2 < '[') {
                    i = charAt2 - 'A';
                } else if ('a' <= charAt2 && charAt2 < '{') {
                    i = charAt2 - 'G';
                } else if ('0' <= charAt2 && charAt2 < ':') {
                    i = charAt2 + 4;
                } else if (charAt2 != '+' && charAt2 != '-') {
                    if (charAt2 != '/' && charAt2 != '_') {
                        if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                            break;
                        }
                        i3++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                i5 = (i5 << 6) | i;
                i4++;
                if (i4 % 4 == 0) {
                    bArr2[i6] = (byte) (i5 >> 16);
                    int i7 = i6 + 2;
                    bArr2[i6 + 1] = (byte) (i5 >> 8);
                    i6 += 3;
                    bArr2[i7] = (byte) i5;
                }
                i3++;
            } else {
                int i8 = i4 % 4;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            int i9 = i5 << 6;
                            int i10 = i6 + 1;
                            bArr2[i6] = (byte) (i9 >> 16);
                            i6 += 2;
                            bArr2[i10] = (byte) (i9 >> 8);
                        }
                    } else {
                        bArr2[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    }
                    if (i6 != i2) {
                        bArr2 = Arrays.copyOf(bArr2, i6);
                    }
                }
            }
        }
        if (bArr2 == null) {
            return null;
        }
        return new da0(bArr2);
    }

    public static da0 n(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (f04.n(str.charAt(i2 + 1)) + (f04.n(str.charAt(i2)) << 4));
            }
            return new da0(bArr);
        }
        i.f("Unexpected hex string: ".concat(str));
        return null;
    }

    public static da0 o(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(qm0.a);
        bytes.getClass();
        da0 da0Var = new da0(bytes);
        da0Var.L = str;
        return da0Var;
    }

    public static long p() {
        return kt0.b;
    }

    public static long q() {
        return kt0.d;
    }

    public static long r(float f, float f2, float f3) {
        int i = kt0.i;
        cq5 cq5Var = qt0.e;
        if (RecyclerView.B1 > f || f > 360.0f || RecyclerView.B1 > f2 || f2 > 1.0f || RecyclerView.B1 > f3 || f3 > 1.0f) {
            o53.a("HSL (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)");
        }
        return hv.a(s(f, f2, f3, 0), s(f, f2, f3, 8), s(f, f2, f3, 4), 1.0f, cq5Var);
    }

    public static float s(float f, float f2, float f3, int i) {
        float f4 = ((f / 30.0f) + i) % 12.0f;
        return f3 - (Math.max(-1.0f, Math.min(f4 - 3.0f, Math.min(9.0f - f4, 1.0f))) * (Math.min(f3, 1.0f - f3) * f2));
    }

    public static da0 t(byte[] bArr) {
        da0 da0Var = da0.R;
        int length = bArr.length;
        hf.D(bArr.length, 0L, length);
        return new da0(fv.x0(bArr, 0, length));
    }

    @Override // defpackage.a54
    public boolean M(i44 i44Var) {
        return false;
    }

    @Override // defpackage.lg1
    public boolean a(SSLSocket sSLSocket) {
        return xs6.g0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.g36
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        c42 c42Var = i36.X;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            bt a = fz.a();
            String string = cursor.getString(1);
            byte[] bArr = null;
            if (string != null) {
                a.B = string;
                a.R = d35.b(cursor.getInt(2));
                String string2 = cursor.getString(3);
                if (string2 != null) {
                    bArr = Base64.decode(string2, 0);
                }
                a.L = bArr;
                arrayList.add(a.A());
            } else {
                u34.x("Null backendName");
                return null;
            }
        }
        return arrayList;
    }

    @Override // defpackage.tz6
    public Map b(bl5 bl5Var) {
        return zt1.A;
    }

    @Override // defpackage.z31
    public long c(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        int i = a66.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.a70
    public Rect f(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int i;
        z60 z60Var = a70.a;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            z60Var.getClass();
            Log.w(z60.b, e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
            } else {
                int i3 = rect.right + i;
                if (i3 == point.x) {
                    rect.right = i3;
                } else if (rect.left == i) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (j2.w(obj2)) {
                    displayCutout = j2.f(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                z60Var.getClass();
                Log.w(z60.b, e2);
            }
            if (displayCutout != null) {
                int i4 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i4 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i5 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i5 == safeInsetRight) {
                    int i6 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i6;
                }
                int i7 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i7 == safeInsetTop) {
                    rect.top = 0;
                }
                int i8 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i8 == safeInsetBottom) {
                    int i9 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i9;
                }
            }
        }
        return rect;
    }

    @Override // defpackage.c43
    public void g(int i, ig1 ig1Var, sf0 sf0Var) {
        ig1Var.getClass();
    }

    @Override // defpackage.b51
    public Object h(Object obj) {
        return (mk5) obj;
    }

    @Override // defpackage.im6
    public boolean i(Object obj, Object obj2) {
        return nb3.k(obj, obj2);
    }

    @Override // defpackage.lg1
    public sm6 j(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new bm(cls2);
    }

    @Override // defpackage.rh1
    public float l(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public String toString() {
        switch (this.A) {
            case 17:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.c43
    public void e() {
    }

    @Override // defpackage.c43
    public void k(ig1 ig1Var) {
    }

    @Override // defpackage.a54
    public void d(i44 i44Var, boolean z) {
    }
}
