package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: tm0  reason: default package */
/* loaded from: classes.dex */
public final class tm0 extends tq5 {
    public static final sm0 Companion = new Object();
    public final String t;

    public tm0(int i, String str) {
        if (1 == (i & 1)) {
            this.t = str;
        } else {
            ep2.H(i, 1, rm0.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tm0) && b53.x(this.t, ((tm0) obj).t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.t;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wh1.A("GameFolders(gameName=", this.t, ")");
    }

    public tm0(String str) {
        this.t = str;
    }
}
