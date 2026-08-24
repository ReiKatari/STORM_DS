package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw  reason: default package */
/* loaded from: classes.dex */
public final class xw {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(xw.class, Object.class, "a");
    public static final /* synthetic */ long c = v36.a.objectFieldOffset(xw.class.getDeclaredField("a"));
    public volatile Object a;

    public final boolean a(Object obj, Object obj2) {
        while (true) {
            b.getClass();
            Unsafe unsafe = v36.a;
            long j = c;
            xw xwVar = this;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(xwVar, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObjectVolatile(xwVar, j) != obj3) {
                return false;
            }
            this = xwVar;
            obj = obj3;
            obj2 = obj4;
        }
    }

    public final Object b(Object obj) {
        b.getClass();
        return v36.a.getAndSetObject(this, c, obj);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
