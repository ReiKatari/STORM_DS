package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lx4  reason: default package */
/* loaded from: classes.dex */
public final class lx4 {
    public final boolean a;
    public final Set b;
    public final Set c;

    public lx4(boolean z, HashSet hashSet, HashSet hashSet2) {
        Set hashSet3;
        Set hashSet4;
        this.a = z;
        if (hashSet == null) {
            hashSet3 = Collections.EMPTY_SET;
        } else {
            hashSet3 = new HashSet(hashSet);
        }
        this.b = hashSet3;
        if (hashSet2 == null) {
            hashSet4 = Collections.EMPTY_SET;
        } else {
            hashSet4 = new HashSet(hashSet2);
        }
        this.c = hashSet4;
    }

    public final boolean a(Class cls, boolean z) {
        if (!this.b.contains(cls)) {
            if (!this.c.contains(cls) && this.a && z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lx4)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        lx4 lx4Var = (lx4) obj;
        if (this.a != lx4Var.a || !Objects.equals(this.b, lx4Var.b) || !Objects.equals(this.c, lx4Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
