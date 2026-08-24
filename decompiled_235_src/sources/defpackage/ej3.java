package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej3  reason: default package */
/* loaded from: classes.dex */
public final class ej3 extends yh2 {
    public final Uri d;

    public ej3(Uri uri) {
        this.d = uri;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ej3) || !this.d.equals(((ej3) obj).d)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "RomUri(uri=" + this.d + ")";
    }
}
