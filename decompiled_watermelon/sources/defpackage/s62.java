package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s62  reason: default package */
/* loaded from: classes.dex */
public final class s62 {
    public final List a;
    public final boolean b;

    public s62(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s62) {
                s62 s62Var = (s62) obj;
                if (!this.a.equals(s62Var.a) || this.b != s62Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RomCacheReadResult(roms=" + this.a + ", isValid=" + this.b + ")";
    }
}
