package zj;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends LinkedHashMap {
    public c() {
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
