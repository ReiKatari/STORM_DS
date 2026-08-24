package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z20  reason: default package */
/* loaded from: classes.dex */
public final class z20 extends LinkedHashMap {
    public z20() {
        super(64, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 32) {
            return true;
        }
        return false;
    }
}
