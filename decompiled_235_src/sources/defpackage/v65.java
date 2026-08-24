package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v65  reason: default package */
/* loaded from: classes.dex */
public final class v65 {
    public final boolean a;
    public final Set b;
    public final Set c;

    public v65(boolean z, HashSet hashSet, HashSet hashSet2) {
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
        if (!(obj instanceof v65)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        v65 v65Var = (v65) obj;
        if (this.a != v65Var.a || !Objects.equals(this.b, v65Var.b) || !Objects.equals(this.c, v65Var.c)) {
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
