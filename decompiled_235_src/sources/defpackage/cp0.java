package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: cp0  reason: default package */
/* loaded from: classes.dex */
public final class cp0 extends vy7 {
    public static final bp0 Companion = new Object();
    public final String h0;

    public cp0(int i, String str) {
        if (1 == (i & 1)) {
            this.h0 = str;
        } else {
            ii2.S(i, 1, ap0.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cp0) && nb3.k(this.h0, ((cp0) obj).h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.h0;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return lb1.A("GameFolders(gameName=", this.h0, ")");
    }

    public cp0(String str) {
        this.h0 = str;
    }
}
