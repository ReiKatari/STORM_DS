package n8;

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
import f2.p0;
import j8.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements b, e, g {

    /* renamed from: c  reason: collision with root package name */
    public static final c f10100c = new c(0);

    /* renamed from: d  reason: collision with root package name */
    public static final c f10101d = new c(1);

    /* renamed from: e  reason: collision with root package name */
    public static final c f10102e = new c(2);

    /* renamed from: f  reason: collision with root package name */
    public static final c f10103f = new c(3);

    /* renamed from: g  reason: collision with root package name */
    public static final c f10104g = new c(4);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10105b;

    public /* synthetic */ c(int i2) {
        this.f10105b = i2;
    }

    @Override // n8.g
    public j a(Activity activity, e eVar) {
        eVar.getClass();
        b.f10099a.getClass();
        return new j(new h8.b(a.a().c(activity)), eVar.d(activity));
    }

    @Override // n8.g
    public j b(Context context, e eVar) {
        eVar.getClass();
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
            return a((Activity) context2, eVar);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            a0.j.h("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new j(new Rect(0, 0, point.x, point.y), eVar.d(context));
    }

    @Override // n8.b
    public Rect c(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int i2;
        int i10 = this.f10105b;
        int i11 = 0;
        a aVar = b.f10099a;
        DisplayCutout displayCutout = null;
        switch (i10) {
            case 0:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i11 = resources.getDimensionPixelSize(identifier);
                    }
                    int i12 = rect.bottom + i11;
                    if (i12 == point.y) {
                        rect.bottom = i12;
                    } else {
                        int i13 = rect.right + i11;
                        if (i13 == point.x) {
                            rect.right = i13;
                        }
                    }
                }
                return rect;
            case DSiCameraSource.FrontCamera /* 1 */:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        invoke.getClass();
                        rect2.set((Rect) invoke);
                    } else {
                        Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        invoke2.getClass();
                        rect2.set((Rect) invoke2);
                    }
                } catch (Exception e6) {
                    if (!(e6 instanceof NoSuchFieldException) && !(e6 instanceof NoSuchMethodException) && !(e6 instanceof IllegalAccessException) && !(e6 instanceof InvocationTargetException)) {
                        throw e6;
                    }
                    aVar.getClass();
                    Log.w(a.f10098b, e6);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    if (identifier2 > 0) {
                        i2 = resources2.getDimensionPixelSize(identifier2);
                    } else {
                        i2 = 0;
                    }
                    int i14 = rect2.bottom + i2;
                    if (i14 == point2.y) {
                        rect2.bottom = i14;
                    } else {
                        int i15 = rect2.right + i2;
                        if (i15 == point2.x) {
                            rect2.right = i15;
                        } else if (rect2.left == i2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object newInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, newInstance);
                        Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(newInstance);
                        if (p0.x(obj2)) {
                            displayCutout = p0.m(obj2);
                        }
                    } catch (Exception e10) {
                        if (!(e10 instanceof ClassNotFoundException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof NoSuchFieldException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException) && !(e10 instanceof InstantiationException)) {
                            throw e10;
                        }
                        aVar.getClass();
                        Log.w(a.f10098b, e10);
                    }
                    if (displayCutout != null) {
                        int i16 = rect2.left;
                        safeInsetLeft = displayCutout.getSafeInsetLeft();
                        if (i16 == safeInsetLeft) {
                            rect2.left = 0;
                        }
                        int i17 = point2.x - rect2.right;
                        safeInsetRight = displayCutout.getSafeInsetRight();
                        if (i17 == safeInsetRight) {
                            int i18 = rect2.right;
                            safeInsetRight2 = displayCutout.getSafeInsetRight();
                            rect2.right = safeInsetRight2 + i18;
                        }
                        int i19 = rect2.top;
                        safeInsetTop = displayCutout.getSafeInsetTop();
                        if (i19 == safeInsetTop) {
                            rect2.top = 0;
                        }
                        int i20 = point2.y - rect2.bottom;
                        safeInsetBottom = displayCutout.getSafeInsetBottom();
                        if (i20 == safeInsetBottom) {
                            int i21 = rect2.bottom;
                            safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                            rect2.bottom = safeInsetBottom2 + i21;
                        }
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object invoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    invoke3.getClass();
                    return new Rect((Rect) invoke3);
                } catch (Exception e11) {
                    if (!(e11 instanceof NoSuchFieldException) && !(e11 instanceof NoSuchMethodException) && !(e11 instanceof IllegalAccessException) && !(e11 instanceof InvocationTargetException)) {
                        throw e11;
                    }
                    aVar.getClass();
                    Log.w(a.f10098b, e11);
                    return f10101d.c(activity);
                }
        }
    }

    @Override // n8.e
    public float d(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
