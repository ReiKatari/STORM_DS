package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wm1  reason: default package */
/* loaded from: classes.dex */
public final class wm1 implements vm1 {
    public final DynamicRangeProfiles a;

    public wm1(DynamicRangeProfiles dynamicRangeProfiles) {
        this.a = dynamicRangeProfiles;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return up1.A;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            sm1 sm1Var = (sm1) tm1.a.get(Long.valueOf(longValue));
            if (sm1Var == null && ve2.I()) {
                Log.w("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            }
            if (sm1Var != null) {
                linkedHashSet.add(sm1Var);
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    @Override // defpackage.vm1
    public final Set a() {
        Set supportedProfiles = this.a.getSupportedProfiles();
        supportedProfiles.getClass();
        return d(supportedProfiles);
    }

    @Override // defpackage.vm1
    public final Set b(sm1 sm1Var) {
        sm1Var.getClass();
        LinkedHashMap linkedHashMap = tm1.a;
        Long a = tm1.a(sm1Var, this.a);
        if (a != null) {
            Set profileCaptureRequestConstraints = this.a.getProfileCaptureRequestConstraints(a.longValue());
            profileCaptureRequestConstraints.getClass();
            return d(profileCaptureRequestConstraints);
        }
        c44.u(sm1Var, "DynamicRange is not supported: ");
        return null;
    }

    @Override // defpackage.vm1
    public final DynamicRangeProfiles c() {
        return this.a;
    }
}
