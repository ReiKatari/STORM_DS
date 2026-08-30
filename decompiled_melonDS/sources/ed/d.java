package ed;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final List f4452a;

    static {
        try {
            f4452a = uc.h.L(uc.h.I(Arrays.asList(new ad.b()).iterator()));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
