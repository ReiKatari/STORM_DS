package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f67  reason: default package */
/* loaded from: classes.dex */
public final class f67 implements jp5 {
    public final long b;
    public final jp5 c;

    public f67(long j, jp5 jp5Var) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        np2.s("Timeout must be non-negative.", z);
        this.b = j;
        this.c = jp5Var;
    }

    @Override // defpackage.jp5
    public final long a() {
        return this.b;
    }

    @Override // defpackage.jp5
    public final ip5 b(ou ouVar) {
        ip5 b = this.c.b(ouVar);
        long j = this.b;
        if (j > 0 && ouVar.b >= j - b.a) {
            return ip5.d;
        }
        return b;
    }
}
