package q;

import android.os.Build;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u3 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f12027a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f12028b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f12029c;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 27) {
            z10 = true;
        } else {
            z10 = false;
        }
        f12029c = z10;
    }
}
