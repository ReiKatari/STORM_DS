package p1;

import android.os.Build;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final e1 f11208a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        e1 e1Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                e1Var = new Object();
                f11208a = e1Var;
            }
        }
        e1Var = null;
        f11208a = e1Var;
    }
}
