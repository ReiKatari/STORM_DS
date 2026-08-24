package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a72  reason: default package */
/* loaded from: classes.dex */
public final class a72 {
    public static final q61 c = new Object();
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final yc1 b;

    /* JADX WARN: Type inference failed for: r5v3, types: [yc1, java.lang.Object] */
    public a72(String str, boolean z) {
        ReentrantLock reentrantLock;
        yc1 yc1Var;
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
            yc1Var = obj2;
        } else {
            yc1Var = null;
        }
        this.b = yc1Var;
    }
}
