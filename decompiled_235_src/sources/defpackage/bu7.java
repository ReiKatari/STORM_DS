package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu7  reason: default package */
/* loaded from: classes.dex */
public final class bu7 extends iu7 {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public e83 f;

    public bu7() {
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

    @Override // defpackage.iu7
    public vu7 b() {
        a();
        vu7 g2 = vu7.g(null, this.e);
        e83[] e83VarArr = this.b;
        ru7 ru7Var = g2.a;
        ru7Var.v(e83VarArr);
        ru7Var.x(this.f);
        ru7Var.u(null);
        ru7Var.z(this.c);
        ru7Var.A(this.d);
        return g2;
    }

    @Override // defpackage.iu7
    public void f(e83 e83Var) {
        this.f = e83Var;
    }

    @Override // defpackage.iu7
    public void h(e83 e83Var) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(e83Var.a, e83Var.b, e83Var.c, e83Var.d);
        }
    }

    public bu7(vu7 vu7Var) {
        super(vu7Var);
        this.e = vu7Var.f();
    }
}
