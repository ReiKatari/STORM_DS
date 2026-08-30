package n8;

import android.os.Build;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f10097a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final String f10098b = b.class.getSimpleName();

    public static b a() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return d.f10106b;
        }
        if (i2 >= 29) {
            return c.f10102e;
        }
        if (i2 >= 28) {
            return c.f10101d;
        }
        return c.f10100c;
    }
}
