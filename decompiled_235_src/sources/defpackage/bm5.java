package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm5  reason: default package */
/* loaded from: classes.dex */
public final class bm5 extends ak7 {
    public final Set l;
    public final Set m;
    public final Set n;
    public final Set o;
    public final ov0 p;

    public bm5(bv0 bv0Var, ov0 ov0Var) {
        boolean z;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<wh1> set = bv0Var.b;
        Set set2 = bv0Var.e;
        for (wh1 wh1Var : set) {
            int i = wh1Var.c;
            int i2 = wh1Var.b;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            Class cls = wh1Var.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else if (i == 2) {
                hashSet3.add(cls);
            } else if (i2 == 2) {
                hashSet5.add(cls);
            } else {
                hashSet2.add(cls);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(g65.class);
        }
        this.l = Collections.unmodifiableSet(hashSet);
        this.m = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.n = Collections.unmodifiableSet(hashSet4);
        this.o = Collections.unmodifiableSet(hashSet5);
        this.p = ov0Var;
    }

    @Override // defpackage.ak7, defpackage.ov0
    public final Object a(Class cls) {
        if (this.l.contains(cls)) {
            Object a = this.p.a(cls);
            if (!cls.equals(g65.class)) {
                return a;
            }
            g65 g65Var = (g65) a;
            return new Object();
        }
        u34.v(cls, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.ov0
    public final o55 b(Class cls) {
        if (this.m.contains(cls)) {
            return this.p.b(cls);
        }
        u34.v(cls, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // defpackage.ov0
    public final o55 c(Class cls) {
        if (this.o.contains(cls)) {
            return this.p.c(cls);
        }
        u34.v(cls, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // defpackage.ak7, defpackage.ov0
    public final Set d(Class cls) {
        if (this.n.contains(cls)) {
            return this.p.d(cls);
        }
        u34.v(cls, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }
}
