package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: af7  reason: default package */
/* loaded from: classes.dex */
public final class af7 extends if7 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public x13 f;

    public af7() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // defpackage.if7
    public vf7 b() {
        a();
        vf7 g2 = vf7.g(null, this.e);
        x13[] x13VarArr = this.b;
        rf7 rf7Var = g2.a;
        rf7Var.v(x13VarArr);
        rf7Var.x(this.f);
        rf7Var.u(null);
        rf7Var.z(this.c);
        rf7Var.A(this.d);
        return g2;
    }

    @Override // defpackage.if7
    public void f(x13 x13Var) {
        this.f = x13Var;
    }

    @Override // defpackage.if7
    public void h(x13 x13Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(x13Var.a, x13Var.b, x13Var.c, x13Var.d);
        }
    }

    public af7(vf7 vf7Var) {
        super(vf7Var);
        this.e = vf7Var.f();
    }
}
