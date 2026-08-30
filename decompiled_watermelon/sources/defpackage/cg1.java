package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cg1  reason: default package */
/* loaded from: classes.dex */
public final class cg1 implements Closeable {
    public final ag1 A;
    public boolean B;
    public final /* synthetic */ hg1 L;

    public cg1(hg1 hg1Var, ag1 ag1Var) {
        this.L = hg1Var;
        this.A = ag1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.B) {
            this.B = true;
            hg1 hg1Var = this.L;
            synchronized (hg1Var) {
                ag1 ag1Var = this.A;
                int i = ag1Var.h - 1;
                ag1Var.h = i;
                if (i == 0 && ag1Var.f) {
                    h85 h85Var = hg1.l0;
                    hg1Var.F(ag1Var);
                }
            }
        }
    }
}
