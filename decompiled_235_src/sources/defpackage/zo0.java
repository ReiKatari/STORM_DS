package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: zo0  reason: default package */
/* loaded from: classes.dex */
public final class zo0 extends vy7 {
    public static final yo0 Companion = new Object();
    public final String h0;

    public zo0(int i, String str) {
        if (1 == (i & 1)) {
            this.h0 = str;
        } else {
            ii2.S(i, 1, xo0.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zo0) && nb3.k(this.h0, ((zo0) obj).h0)) {
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
        return lb1.A("FolderCheats(folderName=", this.h0, ")");
    }

    public zo0(String str) {
        this.h0 = str;
    }
}
