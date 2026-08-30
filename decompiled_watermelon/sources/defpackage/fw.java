package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fw  reason: default package */
/* loaded from: classes.dex */
public final class fw {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(fw.class, Object.class, "a");
    public static final /* synthetic */ long c = ys5.a.objectFieldOffset(fw.class.getDeclaredField("a"));
    public volatile Object a;

    public final boolean a(Object obj, Object obj2) {
        while (true) {
            b.getClass();
            Unsafe unsafe = ys5.a;
            long j = c;
            fw fwVar = this;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(fwVar, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObjectVolatile(fwVar, j) != obj3) {
                return false;
            }
            this = fwVar;
            obj = obj3;
            obj2 = obj4;
        }
    }

    public final Object b(Object obj) {
        b.getClass();
        return ys5.a.getAndSetObject(this, c, obj);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
