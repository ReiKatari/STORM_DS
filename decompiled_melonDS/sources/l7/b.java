package l7;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import jb.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8968c = new a(0);

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f8969d = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f8970a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8971b;

    public b(String str, boolean z10) {
        ReentrantLock reentrantLock;
        c cVar;
        synchronized (f8968c) {
            try {
                LinkedHashMap linkedHashMap = f8969d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f8970a = reentrantLock;
        if (z10) {
            cVar = new c(str);
        } else {
            cVar = null;
        }
        this.f8971b = cVar;
    }
}
