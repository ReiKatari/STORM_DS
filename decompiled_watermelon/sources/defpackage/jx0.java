package defpackage;

import org.conscrypt.Conscrypt;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jx0  reason: default package */
/* loaded from: classes.dex */
public abstract class jx0 {
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
