package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m53  reason: default package */
/* loaded from: classes.dex */
public final class m53 {
    public final sq5 a;
    public final sy6 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final do1 e;
    public final do1 f;
    public final Object g;

    public m53(sq5 sq5Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = sq5Var;
        sy6 sy6Var = new sy6(sq5Var, linkedHashMap, linkedHashMap2, strArr, sq5Var.k, new z(1, this, m53.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 23));
        this.b = sy6Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new do1(this, 19);
        this.f = new do1(this, 20);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        sy6Var.k = new bz2(3, this);
    }

    public final Object a(nk6 nk6Var) {
        Object f = this.b.f(nk6Var);
        if (f == p31.COROUTINE_SUSPENDED) {
            return f;
        }
        return o27.a;
    }
}
