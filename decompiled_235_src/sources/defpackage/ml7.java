package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml7  reason: default package */
/* loaded from: classes.dex */
public final class ml7 implements il7 {
    public final kl7 A;
    public final ck5 B;
    public final long L;
    public final long R = 0;

    public ml7(kl7 kl7Var, ck5 ck5Var) {
        this.A = kl7Var;
        this.B = ck5Var;
        this.L = (kl7Var.p() + kl7Var.o()) * 1000000;
    }

    @Override // defpackage.il7
    public final boolean a() {
        return true;
    }

    @Override // defpackage.il7
    public final long b(ap apVar, ap apVar2, ap apVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j2 = this.R;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.L;
        long j5 = j3 / j4;
        if (this.B != ck5.Restart && j5 % 2 != 0) {
            return ((j5 + 1) * j4) - j3;
        }
        return j3 - (j5 * j4);
    }

    public final ap d(long j, ap apVar, ap apVar2, ap apVar3) {
        long j2 = this.R;
        long j3 = this.L;
        if (j + j2 > j3) {
            return this.A.h(j3 - j2, apVar, apVar3, apVar2);
        }
        return apVar2;
    }

    @Override // defpackage.il7
    public final ap h(long j, ap apVar, ap apVar2, ap apVar3) {
        return this.A.h(c(j), apVar, apVar2, d(j, apVar, apVar3, apVar2));
    }

    @Override // defpackage.il7
    public final ap q(long j, ap apVar, ap apVar2, ap apVar3) {
        return this.A.q(c(j), apVar, apVar2, d(j, apVar, apVar3, apVar2));
    }
}
