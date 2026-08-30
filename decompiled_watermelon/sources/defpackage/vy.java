package defpackage;

import android.net.Uri;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vy  reason: default package */
/* loaded from: classes.dex */
public final class vy {
    public final UUID a;
    public final String b;
    public final Uri c;

    public vy(UUID uuid, String str, Uri uri) {
        str.getClass();
        uri.getClass();
        this.a = uuid;
        this.b = str;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy)) {
            return false;
        }
        vy vyVar = (vy) obj;
        if (b53.x(this.a, vyVar.a) && b53.x(this.b, vyVar.b) && b53.x(this.c, vyVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        UUID uuid = this.a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        return this.c.hashCode() + ej6.b(hashCode * 31, 31, this.b);
    }

    public final String toString() {
        return "Background(id=" + this.a + ", name=" + this.b + ", uri=" + this.c + ")";
    }
}
