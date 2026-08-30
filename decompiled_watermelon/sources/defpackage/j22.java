package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j22  reason: default package */
/* loaded from: classes.dex */
public final class j22 {
    public static final so1 c = new so1(2);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final k91 b;

    /* JADX WARN: Type inference failed for: r5v3, types: [k91, java.lang.Object] */
    public j22(String str, boolean z) {
        ReentrantLock reentrantLock;
        k91 k91Var;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        if (z) {
            ?? obj2 = new Object();
            obj2.A = str.concat(".lck");
            k91Var = obj2;
        } else {
            k91Var = null;
        }
        this.b = k91Var;
    }
}
