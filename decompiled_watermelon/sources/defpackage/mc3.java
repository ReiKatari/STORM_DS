package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mc3  reason: default package */
/* loaded from: classes.dex */
public final class mc3 extends ln2 {
    public final Uri L;

    public mc3(Uri uri) {
        this.L = uri;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof mc3) || !this.L.equals(((mc3) obj).L)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.L.hashCode();
    }

    public final String toString() {
        return "RomUri(uri=" + this.L + ")";
    }
}
