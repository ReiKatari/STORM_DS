package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q20  reason: default package */
/* loaded from: classes.dex */
public final class q20 extends lf2 {
    public final /* synthetic */ int B = 0;
    public Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q20(vb4 vb4Var, u60 u60Var) {
        super(u60Var);
        this.L = vb4Var;
    }

    @Override // defpackage.lf2, defpackage.sb6
    public long L(f60 f60Var, long j) {
        switch (this.B) {
            case 0:
                try {
                    return super.L(f60Var, j);
                } catch (Exception e) {
                    this.L = e;
                    throw e;
                }
            case 1:
            default:
                return super.L(f60Var, j);
            case 2:
                try {
                    return super.L(f60Var, j);
                } catch (IOException e2) {
                    ((vb4) this.L).R = e2;
                    throw e2;
                }
        }
    }

    @Override // defpackage.lf2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.B) {
            case 1:
                ((z70) this.L).B.close();
                super.close();
                return;
            default:
                super.close();
                return;
        }
    }

    public /* synthetic */ q20(sb6 sb6Var) {
        super(sb6Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q20(sb6 sb6Var, z70 z70Var) {
        super(sb6Var);
        this.L = z70Var;
    }
}
