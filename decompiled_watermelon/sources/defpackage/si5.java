package defpackage;

import android.net.Uri;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: si5  reason: default package */
/* loaded from: classes.dex */
public final class si5 {
    public static final int g = 8;
    @r06("a")
    private final cs5 a;
    @r06("b")
    private final is5 b;
    @r06("c")
    private final UUID c;
    @r06("d")
    private final boolean d;
    @r06("e")
    private final Uri e;
    @r06("f")
    private final Uri f;

    public si5(cs5 cs5Var, is5 is5Var, UUID uuid, boolean z, Uri uri, Uri uri2) {
        cs5Var.getClass();
        is5Var.getClass();
        this.a = cs5Var;
        this.b = is5Var;
        this.c = uuid;
        this.d = z;
        this.e = uri;
        this.f = uri2;
    }

    public static /* synthetic */ si5 h(si5 si5Var, cs5 cs5Var, is5 is5Var, UUID uuid, boolean z, Uri uri, Uri uri2, int i, Object obj) {
        if ((i & 1) != 0) {
            cs5Var = si5Var.a;
        }
        if ((i & 2) != 0) {
            is5Var = si5Var.b;
        }
        if ((i & 4) != 0) {
            uuid = si5Var.c;
        }
        if ((i & 8) != 0) {
            z = si5Var.d;
        }
        if ((i & 16) != 0) {
            uri = si5Var.e;
        }
        if ((i & 32) != 0) {
            uri2 = si5Var.f;
        }
        Uri uri3 = uri;
        Uri uri4 = uri2;
        return si5Var.g(cs5Var, is5Var, uuid, z, uri3, uri4);
    }

    public final cs5 a() {
        return this.a;
    }

    public final is5 b() {
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
        if (!(obj instanceof si5)) {
            return false;
        }
        si5 si5Var = (si5) obj;
        if (this.a == si5Var.a && this.b == si5Var.b && b53.x(this.c, si5Var.c) && this.d == si5Var.d && b53.x(this.e, si5Var.e) && b53.x(this.f, si5Var.f)) {
            return true;
        }
        return false;
    }

    public final Uri f() {
        return this.f;
    }

    public final si5 g(cs5 cs5Var, is5 is5Var, UUID uuid, boolean z, Uri uri, Uri uri2) {
        cs5Var.getClass();
        is5Var.getClass();
        return new si5(cs5Var, is5Var, uuid, z, uri, uri2);
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
        int c = ej6.c((hashCode3 + hashCode) * 31, this.d, 31);
        Uri uri = this.e;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int i2 = (c + hashCode2) * 31;
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

    public final cs5 m() {
        return this.a;
    }

    public final is5 n() {
        return this.b;
    }

    public String toString() {
        cs5 cs5Var = this.a;
        is5 is5Var = this.b;
        UUID uuid = this.c;
        boolean z = this.d;
        Uri uri = this.e;
        Uri uri2 = this.f;
        return "RomConfig1(runtimeConsoleType=" + cs5Var + ", runtimeMicSource=" + is5Var + ", layoutId=" + uuid + ", loadGbaCart=" + z + ", gbaCartPath=" + uri + ", gbaSavePath=" + uri2 + ")";
    }
}
