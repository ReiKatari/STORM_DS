package q;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f11978a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f11979b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f11980c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f11981d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f11978a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f11979b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f11980c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f11981d = true;
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
        }
    }
}
