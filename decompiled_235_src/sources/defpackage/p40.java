package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p40  reason: default package */
/* loaded from: classes.dex */
public final class p40 extends kk2 {
    public final /* synthetic */ int B = 0;
    public Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(tk4 tk4Var, z80 z80Var) {
        super(z80Var);
        this.L = tk4Var;
    }

    @Override // defpackage.kk2, defpackage.in6
    public long b0(k80 k80Var, long j) {
        switch (this.B) {
            case 0:
                try {
                    return super.b0(k80Var, j);
                } catch (Exception e) {
                    this.L = e;
                    throw e;
                }
            case 1:
            default:
                return super.b0(k80Var, j);
            case 2:
                try {
                    return super.b0(k80Var, j);
                } catch (IOException e2) {
                    ((tk4) this.L).R = e2;
                    throw e2;
                }
        }
    }

    @Override // defpackage.kk2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.B) {
            case 1:
                ((ha0) this.L).B.close();
                super.close();
                return;
            default:
                super.close();
                return;
        }
    }

    public /* synthetic */ p40(in6 in6Var) {
        super(in6Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(in6 in6Var, ha0 ha0Var) {
        super(in6Var);
        this.L = ha0Var;
    }
}
