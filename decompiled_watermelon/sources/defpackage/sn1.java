package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sn1  reason: default package */
/* loaded from: classes.dex */
public class sn1 implements x40, t11, pd1, d31, ay3, s57, ta6, p40, pg7, nd2, nt, qt, u70, s01 {
    public static volatile boolean h0;
    public final /* synthetic */ int A;
    public static final sn1 B = new sn1(1);
    public static final sn1 L = new sn1(2);
    public static final sn1 R = new sn1(3);
    public static final i X = new i(10);
    public static final bf Y = new bf(1);
    public static final bf Z = new bf(2);
    public static final sn1 c0 = new sn1(6);
    public static final sn1 d0 = new sn1(7);
    public static final /* synthetic */ sn1 e0 = new sn1(8);
    public static final sn1 f0 = new sn1(9);
    public static final sn1 g0 = new sn1(10);
    public static final sn1 i0 = new sn1(11);
    public static final sn1 j0 = new sn1(12);
    public static final sn1 k0 = new sn1(13);
    public static final sn1 l0 = new sn1(13);
    public static final sn1 m0 = new sn1(13);
    public static final sn1 n0 = new sn1(13);
    public static final sn1 o0 = new sn1(13);
    public static final sn1 p0 = new sn1(13);
    public static final sn1 q0 = new sn1(14);
    public static final sn1 r0 = new sn1(15);
    public static final sn1 s0 = new sn1(16);
    public static final sn1 t0 = new sn1(17);
    public static final sn1 u0 = new sn1(18);
    public static final sn1 v0 = new sn1(19);

    public /* synthetic */ sn1(int i) {
        this.A = i;
    }

    public static zn3 m(List list) {
        return new zn3(list, null, (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L), 0);
    }

    public static zn3 n(ti4[] ti4VarArr, float f) {
        ti4[] ti4VarArr2 = (ti4[]) Arrays.copyOf(ti4VarArr, ti4VarArr.length);
        long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(RecyclerView.A1) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        ArrayList arrayList = new ArrayList(ti4VarArr2.length);
        for (ti4 ti4Var : ti4VarArr2) {
            arrayList.add(new xq0(((xq0) ti4Var.B).a));
        }
        ArrayList arrayList2 = new ArrayList(ti4VarArr2.length);
        for (ti4 ti4Var2 : ti4VarArr2) {
            arrayList2.add(Float.valueOf(((Number) ti4Var2.A).floatValue()));
        }
        return new zn3(arrayList, arrayList2, floatToRawIntBits, floatToRawIntBits2, 1);
    }

    public static zn3 o(List list, float f, float f2, int i) {
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
        return new zn3(list, null, (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), 0);
    }

    @Override // defpackage.nt, defpackage.qt
    public float a() {
        return RecyclerView.A1;
    }

    @Override // defpackage.ta6
    public boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.u70
    public byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.s01
    public long d(long j, long j2) {
        switch (this.A) {
            case 27:
                float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i = vu5.a;
                return floatToRawIntBits;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i2 = vu5.a;
                    return floatToRawIntBits2;
                }
                float j3 = a53.j(j, j2);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(j3) << 32) | (Float.floatToRawIntBits(j3) & 4294967295L);
                int i3 = vu5.a;
                return floatToRawIntBits3;
        }
    }

    @Override // defpackage.pg7
    public lg7 e(Activity activity, pd1 pd1Var) {
        pd1Var.getClass();
        x40.a.getClass();
        return new lg7(new t40(w40.a().h(activity)), pd1Var.f(activity));
    }

    @Override // defpackage.pd1
    public float f(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.nt
    public void g(od1 od1Var, int i, int[] iArr, sd3 sd3Var, int[] iArr2) {
        if (sd3Var == sd3.Ltr) {
            rt.a(i, iArr, iArr2, false);
        } else {
            rt.a(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.x40
    public Rect h(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int i;
        w40 w40Var = x40.a;
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
            w40Var.getClass();
            Log.w(w40.b, e);
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
                if (h2.w(obj2)) {
                    displayCutout = h2.f(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                w40Var.getClass();
                Log.w(w40.b, e2);
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

    @Override // defpackage.qt
    public void i(od1 od1Var, int i, int[] iArr, int[] iArr2) {
        rt.a(i, iArr, iArr2, false);
    }

    @Override // defpackage.p40
    public long j(int i, yp0 yp0Var) {
        return ((lr6) yp0Var.e).j(i);
    }

    @Override // defpackage.t11
    public Object k(Object obj) {
        return (ua5) obj;
    }

    @Override // defpackage.pg7
    public lg7 l(Context context, pd1 pd1Var) {
        pd1Var.getClass();
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
            return e((Activity) context2, pd1Var);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            i.i("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new lg7(new Rect(0, 0, point.x, point.y), pd1Var.f(context));
    }

    public String toString() {
        switch (this.A) {
            case 14:
                return "ReferentialEqualityPolicy";
            case 16:
                return "Start";
            case 21:
                return "Arrangement#Center";
            case 26:
                return "Empty";
            default:
                return super.toString();
        }
    }
}
