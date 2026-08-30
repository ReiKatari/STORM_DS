package a6;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 extends v1 {

    /* renamed from: e  reason: collision with root package name */
    public static Field f503e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f504f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor f505g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f506h = false;

    /* renamed from: c  reason: collision with root package name */
    public WindowInsets f507c;

    /* renamed from: d  reason: collision with root package name */
    public q5.b f508d;

    public q1() {
        this.f507c = i();
    }

    private static WindowInsets i() {
        if (!f504f) {
            try {
                f503e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f504f = true;
        }
        Field field = f503e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f506h) {
            try {
                f505g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f506h = true;
        }
        Constructor constructor = f505g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // a6.v1
    public i2 b() {
        a();
        i2 g10 = i2.g(null, this.f507c);
        q5.b[] bVarArr = this.f518b;
        d2 d2Var = g10.f479a;
        d2Var.q(bVarArr);
        d2Var.s(this.f508d);
        return g10;
    }

    @Override // a6.v1
    public void e(q5.b bVar) {
        this.f508d = bVar;
    }

    @Override // a6.v1
    public void g(q5.b bVar) {
        WindowInsets windowInsets = this.f507c;
        if (windowInsets != null) {
            this.f507c = windowInsets.replaceSystemWindowInsets(bVar.f12283a, bVar.f12284b, bVar.f12285c, bVar.f12286d);
        }
    }

    public q1(i2 i2Var) {
        super(i2Var);
        this.f507c = i2Var.f();
    }
}
