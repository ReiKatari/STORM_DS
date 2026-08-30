package f1;

import android.os.Build;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final i4.w f4542a = new i4.w("MagnifierPositionInRoot");

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
