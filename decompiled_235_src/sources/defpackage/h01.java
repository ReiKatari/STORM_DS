package defpackage;

import org.conscrypt.Conscrypt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h01  reason: default package */
/* loaded from: classes.dex */
public abstract class h01 {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version != null) {
            if (version.major() != 2) {
                if (version.major() <= 2) {
                    return false;
                }
            } else if (version.minor() != 1) {
                if (version.minor() <= 1) {
                    return false;
                }
            } else if (version.patch() < 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
