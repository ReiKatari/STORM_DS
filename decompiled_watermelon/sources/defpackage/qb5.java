package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qb5  reason: default package */
/* loaded from: classes.dex */
public final class qb5 {
    public final /* synthetic */ int a;
    public final LinkedHashSet b;

    public qb5() {
        this.a = 1;
        this.b = new LinkedHashSet();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "ResolvedFeatureGroup(features=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public qb5(LinkedHashSet linkedHashSet) {
        this.a = 0;
        this.b = linkedHashSet;
    }
}
