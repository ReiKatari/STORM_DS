package y;

import android.hardware.camera2.params.DynamicRangeProfiles;
import d0.a0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final DynamicRangeProfiles f14633a;

    public c(Object obj) {
        this.f14633a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            a0 a0Var = (a0) a.f14631a.get(l10);
            if (a0Var == null) {
                aj.g.y0("DynamicRangesCompatApi33Impl", "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            }
            if (a0Var != null) {
                hashSet.add(a0Var);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // y.b
    public final Set a() {
        return d(this.f14633a.getSupportedProfiles());
    }

    @Override // y.b
    public final Set b(a0 a0Var) {
        boolean z10;
        Long a10 = a.a(a0Var, this.f14633a);
        if (a10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.g("DynamicRange is not supported: " + a0Var, z10);
        return d(this.f14633a.getProfileCaptureRequestConstraints(a10.longValue()));
    }

    @Override // y.b
    public final DynamicRangeProfiles c() {
        return this.f14633a;
    }
}
