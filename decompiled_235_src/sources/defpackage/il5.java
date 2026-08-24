package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il5  reason: default package */
/* loaded from: classes.dex */
public final class il5 {
    public final /* synthetic */ int a;
    public final LinkedHashSet b;

    public il5() {
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

    public il5(LinkedHashSet linkedHashSet) {
        this.a = 0;
        this.b = linkedHashSet;
    }
}
