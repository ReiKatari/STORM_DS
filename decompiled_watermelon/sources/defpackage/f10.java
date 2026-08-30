package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f10  reason: default package */
/* loaded from: classes.dex */
public final class f10 extends LinkedHashMap {
    public f10() {
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
