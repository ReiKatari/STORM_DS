package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pj5  reason: default package */
/* loaded from: classes.dex */
public final class pj5 extends dk5 {
    public final Uri a;

    public pj5(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pj5) && b53.x(this.a, ((pj5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "GbaSavePathUpdate(gbaSavePath=" + this.a + ")";
    }
}
