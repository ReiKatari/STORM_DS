package defpackage;

import java.util.Map;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nd3  reason: default package */
/* loaded from: classes.dex */
public final class nd3 {
    public static final UUID h = new UUID(0, 0);
    public final UUID a;
    public final String b;
    public final ld3 c;
    public final kd3 d;
    public final boolean e;
    public final int f;
    public final Map g;

    public nd3(UUID uuid, String str, ld3 ld3Var, kd3 kd3Var, boolean z, int i, Map map) {
        ld3Var.getClass();
        kd3Var.getClass();
        this.a = uuid;
        this.b = str;
        this.c = ld3Var;
        this.d = kd3Var;
        this.e = z;
        this.f = i;
        this.g = map;
    }

    public static nd3 a(nd3 nd3Var, UUID uuid, String str, ld3 ld3Var, kd3 kd3Var, boolean z, int i, Map map, int i2) {
        if ((i2 & 1) != 0) {
            uuid = nd3Var.a;
        }
        UUID uuid2 = uuid;
        if ((i2 & 2) != 0) {
            str = nd3Var.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            ld3Var = nd3Var.c;
        }
        ld3 ld3Var2 = ld3Var;
        if ((i2 & 8) != 0) {
            kd3Var = nd3Var.d;
        }
        kd3 kd3Var2 = kd3Var;
        if ((i2 & 16) != 0) {
            z = nd3Var.e;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            i = nd3Var.f;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            map = nd3Var.g;
        }
        ld3Var2.getClass();
        kd3Var2.getClass();
        return new nd3(uuid2, str2, ld3Var2, kd3Var2, z2, i3, map);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nd3) {
                nd3 nd3Var = (nd3) obj;
                if (!b53.x(this.a, nd3Var.a) || !b53.x(this.b, nd3Var.b) || this.c != nd3Var.c || this.d != nd3Var.d || this.e != nd3Var.e || this.f != nd3Var.f || !this.g.equals(nd3Var.g)) {
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
        return this.g.hashCode() + wh1.a(this.f, ej6.c((this.d.hashCode() + ((this.c.hashCode() + ((i2 + i) * 31)) * 31)) * 31, this.e, 31), 31);
    }

    public final String toString() {
        return "LayoutConfiguration(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ", orientation=" + this.d + ", useCustomOpacity=" + this.e + ", opacity=" + this.f + ", layoutVariants=" + this.g + ")";
    }
}
