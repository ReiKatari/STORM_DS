package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n62  reason: default package */
/* loaded from: classes.dex */
public final class n62 extends o62 {
    public final Runnable L;

    public n62(Runnable runnable, long j) {
        super(j);
        this.L = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.run();
    }

    @Override // defpackage.o62
    public final String toString() {
        return super.toString() + this.L;
    }
}
