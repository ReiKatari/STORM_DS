package defpackage;

import android.net.Uri;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: it5  reason: default package */
/* loaded from: classes.dex */
public final class it5 {
    public static final int g = 8;
    @gc6("a")
    private final u26 a;
    @gc6("b")
    private final a36 b;
    @gc6("c")
    private final UUID c;
    @gc6("d")
    private final boolean d;
    @gc6("e")
    private final Uri e;
    @gc6("f")
    private final Uri f;

    public it5(u26 u26Var, a36 a36Var, UUID uuid, boolean z, Uri uri, Uri uri2) {
        u26Var.getClass();
        a36Var.getClass();
        this.a = u26Var;
        this.b = a36Var;
        this.c = uuid;
        this.d = z;
        this.e = uri;
        this.f = uri2;
    }

    public static /* synthetic */ it5 h(it5 it5Var, u26 u26Var, a36 a36Var, UUID uuid, boolean z, Uri uri, Uri uri2, int i, Object obj) {
        if ((i & 1) != 0) {
            u26Var = it5Var.a;
        }
        if ((i & 2) != 0) {
            a36Var = it5Var.b;
        }
        if ((i & 4) != 0) {
            uuid = it5Var.c;
        }
        if ((i & 8) != 0) {
            z = it5Var.d;
        }
        if ((i & 16) != 0) {
            uri = it5Var.e;
        }
        if ((i & 32) != 0) {
            uri2 = it5Var.f;
        }
        Uri uri3 = uri;
        Uri uri4 = uri2;
        return it5Var.g(u26Var, a36Var, uuid, z, uri3, uri4);
    }

    public final u26 a() {
        return this.a;
    }

    public final a36 b() {
        return this.b;
    }

    public final UUID c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final Uri e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it5)) {
            return false;
        }
        it5 it5Var = (it5) obj;
        if (this.a == it5Var.a && this.b == it5Var.b && nb3.k(this.c, it5Var.c) && this.d == it5Var.d && nb3.k(this.e, it5Var.e) && nb3.k(this.f, it5Var.f)) {
            return true;
        }
        return false;
    }

    public final Uri f() {
        return this.f;
    }

    public final it5 g(u26 u26Var, a36 a36Var, UUID uuid, boolean z, Uri uri, Uri uri2) {
        u26Var.getClass();
        a36Var.getClass();
        return new it5(u26Var, a36Var, uuid, z, uri, uri2);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        UUID uuid = this.c;
        int i = 0;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int e = xg6.e((hashCode3 + hashCode) * 31, this.d, 31);
        Uri uri = this.e;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int i2 = (e + hashCode2) * 31;
        Uri uri2 = this.f;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return i2 + i;
    }

    public final Uri i() {
        return this.e;
    }

    public final Uri j() {
        return this.f;
    }

    public final UUID k() {
        return this.c;
    }

    public final boolean l() {
        return this.d;
    }

    public final u26 m() {
        return this.a;
    }

    public final a36 n() {
        return this.b;
    }

    public String toString() {
        u26 u26Var = this.a;
        a36 a36Var = this.b;
        UUID uuid = this.c;
        boolean z = this.d;
        Uri uri = this.e;
        Uri uri2 = this.f;
        return "RomConfig1(runtimeConsoleType=" + u26Var + ", runtimeMicSource=" + a36Var + ", layoutId=" + uuid + ", loadGbaCart=" + z + ", gbaCartPath=" + uri + ", gbaSavePath=" + uri2 + ")";
    }
}
