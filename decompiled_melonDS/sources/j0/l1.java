package j0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7261a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f7262b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f7263c;

    public l1(boolean z10, HashSet hashSet, HashSet hashSet2) {
        Set hashSet3;
        Set hashSet4;
        this.f7261a = z10;
        if (hashSet == null) {
            hashSet3 = Collections.EMPTY_SET;
        } else {
            hashSet3 = new HashSet(hashSet);
        }
        this.f7262b = hashSet3;
        if (hashSet2 == null) {
            hashSet4 = Collections.EMPTY_SET;
        } else {
            hashSet4 = new HashSet(hashSet2);
        }
        this.f7263c = hashSet4;
    }

    public final boolean a(Class cls, boolean z10) {
        if (!this.f7262b.contains(cls)) {
            if (!this.f7263c.contains(cls) && this.f7261a && z10) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        l1 l1Var = (l1) obj;
        if (this.f7261a != l1Var.f7261a || !Objects.equals(this.f7262b, l1Var.f7262b) || !Objects.equals(this.f7263c, l1Var.f7263c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f7261a), this.f7262b, this.f7263c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f7261a + ", forceEnabledQuirks=" + this.f7262b + ", forceDisabledQuirks=" + this.f7263c + '}';
    }
}
