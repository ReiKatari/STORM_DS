package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.stormds.emulator.R;
import java.lang.reflect.Constructor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ys  reason: default package */
/* loaded from: classes.dex */
public class ys {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] e = {16844156};
    public static final int[] f = {16844148};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final ci6 h = new ci6(0);
    public final Object[] a = new Object[2];

    public kq a(Context context, AttributeSet attributeSet) {
        return new kq(context, attributeSet);
    }

    public lq b(Context context, AttributeSet attributeSet) {
        return new lq(context, attributeSet, R.attr.buttonStyle);
    }

    public nq c(Context context, AttributeSet attributeSet) {
        return new nq(context, attributeSet, R.attr.checkboxStyle);
    }

    public qr d(Context context, AttributeSet attributeSet) {
        return new qr(context, attributeSet);
    }

    public qs e(Context context, AttributeSet attributeSet) {
        return new qs(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        ci6 ci6Var = h;
        Constructor constructor = (Constructor) ci6Var.get(str);
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
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            ci6Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
