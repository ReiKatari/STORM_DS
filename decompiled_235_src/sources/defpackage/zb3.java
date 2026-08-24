package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb3  reason: default package */
/* loaded from: classes.dex */
public final class zb3 {
    public final m16 a;
    public final nc7 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final ns1 e;
    public final ns1 f;
    public final Object g;

    public zb3(m16 m16Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = m16Var;
        nc7 nc7Var = new nc7(m16Var, linkedHashMap, linkedHashMap2, strArr, m16Var.k, new a0(1, this, zb3.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 23));
        this.b = nc7Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new ns1(this, 23);
        this.f = new ns1(this, 24);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        nc7Var.k = new er2(this, 6);
    }

    public final Object a(hw6 hw6Var) {
        Object f = this.b.f(hw6Var);
        if (f == x61.COROUTINE_SUSPENDED) {
            return f;
        }
        return jg7.a;
    }
}
