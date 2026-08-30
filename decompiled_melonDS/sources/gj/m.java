package gj;

import java.util.logging.Logger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f5711a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        boolean z10;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z10 = vc.h.Y(message, "getsockname failed", false);
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }
}
