package defpackage;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hf2  reason: default package */
/* loaded from: classes.dex */
public abstract class hf2 implements ow2 {
    public final ow2 B;
    public final Object A = new Object();
    public final HashSet L = new HashSet();

    public hf2(ow2 ow2Var) {
        this.B = ow2Var;
    }

    @Override // defpackage.ow2
    public int a() {
        return this.B.a();
    }

    @Override // defpackage.ow2
    public int c() {
        return this.B.c();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.B.close();
        synchronized (this.A) {
            hashSet = new HashSet(this.L);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((gf2) it.next()).e(this);
        }
    }

    public final void d(gf2 gf2Var) {
        synchronized (this.A) {
            this.L.add(gf2Var);
        }
    }

    @Override // defpackage.ow2
    public final int getFormat() {
        return this.B.getFormat();
    }

    @Override // defpackage.ow2
    public nw2[] m() {
        return this.B.m();
    }

    @Override // defpackage.ow2
    public ew2 s() {
        return this.B.s();
    }
}
