package y6;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f14782a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f14783b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f14784c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f14785d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                kc.a.o(autoCloseable);
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }
}
