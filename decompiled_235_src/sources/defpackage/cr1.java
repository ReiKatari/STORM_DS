package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cr1  reason: default package */
/* loaded from: classes.dex */
public final class cr1 implements br1 {
    public final DynamicRangeProfiles a;

    public cr1(DynamicRangeProfiles dynamicRangeProfiles) {
        this.a = dynamicRangeProfiles;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return du1.A;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            yq1 yq1Var = (yq1) zq1.a.get(Long.valueOf(longValue));
            if (yq1Var == null && kj2.L()) {
                Log.w("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            }
            if (yq1Var != null) {
                linkedHashSet.add(yq1Var);
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    @Override // defpackage.br1
    public final Set a() {
        Set supportedProfiles = this.a.getSupportedProfiles();
        supportedProfiles.getClass();
        return d(supportedProfiles);
    }

    @Override // defpackage.br1
    public final DynamicRangeProfiles b() {
        return this.a;
    }

    @Override // defpackage.br1
    public final Set c(yq1 yq1Var) {
        yq1Var.getClass();
        LinkedHashMap linkedHashMap = zq1.a;
        Long a = zq1.a(yq1Var, this.a);
        if (a != null) {
            Set profileCaptureRequestConstraints = this.a.getProfileCaptureRequestConstraints(a.longValue());
            profileCaptureRequestConstraints.getClass();
            return d(profileCaptureRequestConstraints);
        }
        u34.w(yq1Var, "DynamicRange is not supported: ");
        return null;
    }
}
