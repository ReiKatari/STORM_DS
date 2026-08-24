package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m62  reason: default package */
/* loaded from: classes.dex */
public final class m62 extends o62 {
    public final rj0 L;
    public final /* synthetic */ q62 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m62(q62 q62Var, long j, rj0 rj0Var) {
        super(j);
        this.R = q62Var;
        this.L = rj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.I(this.R, jg7.a);
    }

    @Override // defpackage.o62
    public final String toString() {
        return super.toString() + this.L;
    }
}
