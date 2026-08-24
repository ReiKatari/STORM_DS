package defpackage;

import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy7  reason: default package */
/* loaded from: classes.dex */
public abstract class xy7 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        boolean z;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null) {
                z = qs6.j0(message, "getsockname failed", false);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
