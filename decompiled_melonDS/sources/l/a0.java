package l;

import a1.w0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import me.magnum.melonds.R;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f8348b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f8349c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f8350d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f8351e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f8352f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f8353g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final w0 f8354h = new w0(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f8355a = new Object[2];

    public q.n a(Context context, AttributeSet attributeSet) {
        return new q.n(context, attributeSet);
    }

    public q.o b(Context context, AttributeSet attributeSet) {
        return new q.o(context, attributeSet, R.attr.buttonStyle);
    }

    public q.p c(Context context, AttributeSet attributeSet) {
        return new q.p(context, attributeSet, R.attr.checkboxStyle);
    }

    public q.a0 d(Context context, AttributeSet attributeSet) {
        return new q.a0(context, attributeSet);
    }

    public z0 e(Context context, AttributeSet attributeSet) {
        return new z0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        w0 w0Var = f8354h;
        Constructor constructor = (Constructor) w0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f8348b);
            w0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f8355a);
    }
}
