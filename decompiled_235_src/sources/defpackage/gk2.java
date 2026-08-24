package defpackage;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk2  reason: default package */
/* loaded from: classes.dex */
public abstract class gk2 implements s23 {
    public final s23 B;
    public final Object A = new Object();
    public final HashSet L = new HashSet();

    public gk2(s23 s23Var) {
        this.B = s23Var;
    }

    @Override // defpackage.s23
    public i23 S() {
        return this.B.S();
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
            ((fk2) it.next()).c(this);
        }
    }

    public final void e(fk2 fk2Var) {
        synchronized (this.A) {
            this.L.add(fk2Var);
        }
    }

    @Override // defpackage.s23
    public final int getFormat() {
        return this.B.getFormat();
    }

    @Override // defpackage.s23
    public int getHeight() {
        return this.B.getHeight();
    }

    @Override // defpackage.s23
    public int getWidth() {
        return this.B.getWidth();
    }

    @Override // defpackage.s23
    public r23[] j() {
        return this.B.j();
    }
}
