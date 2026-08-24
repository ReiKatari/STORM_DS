package defpackage;

import java.util.Map;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk3  reason: default package */
/* loaded from: classes.dex */
public final class fk3 {
    public static final UUID h = new UUID(0, 0);
    public final UUID a;
    public final String b;
    public final dk3 c;
    public final ck3 d;
    public final boolean e;
    public final int f;
    public final Map g;

    public fk3(UUID uuid, String str, dk3 dk3Var, ck3 ck3Var, boolean z, int i, Map map) {
        dk3Var.getClass();
        ck3Var.getClass();
        this.a = uuid;
        this.b = str;
        this.c = dk3Var;
        this.d = ck3Var;
        this.e = z;
        this.f = i;
        this.g = map;
    }

    public static fk3 a(fk3 fk3Var, UUID uuid, String str, dk3 dk3Var, ck3 ck3Var, boolean z, int i, Map map, int i2) {
        if ((i2 & 1) != 0) {
            uuid = fk3Var.a;
        }
        UUID uuid2 = uuid;
        if ((i2 & 2) != 0) {
            str = fk3Var.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            dk3Var = fk3Var.c;
        }
        dk3 dk3Var2 = dk3Var;
        if ((i2 & 8) != 0) {
            ck3Var = fk3Var.d;
        }
        ck3 ck3Var2 = ck3Var;
        if ((i2 & 16) != 0) {
            z = fk3Var.e;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            i = fk3Var.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            map = fk3Var.g;
        }
        dk3Var2.getClass();
        ck3Var2.getClass();
        return new fk3(uuid2, str2, dk3Var2, ck3Var2, z2, i3, map);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fk3) {
                fk3 fk3Var = (fk3) obj;
                if (!nb3.k(this.a, fk3Var.a) || !nb3.k(this.b, fk3Var.b) || this.c != fk3Var.c || this.d != fk3Var.d || this.e != fk3Var.e || this.f != fk3Var.f || !this.g.equals(fk3Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        UUID uuid = this.a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return this.g.hashCode() + lb1.a(this.f, xg6.e((this.d.hashCode() + ((this.c.hashCode() + ((i2 + i) * 31)) * 31)) * 31, this.e, 31), 31);
    }

    public final String toString() {
        return "LayoutConfiguration(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ", orientation=" + this.d + ", useCustomOpacity=" + this.e + ", opacity=" + this.f + ", layoutVariants=" + this.g + ")";
    }
}
