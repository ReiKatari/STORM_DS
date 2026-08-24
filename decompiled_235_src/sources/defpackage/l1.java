package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l1  reason: default package */
/* loaded from: classes.dex */
public final class l1 extends Throwable {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(String str, int i) {
        super(str);
        this.A = i;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i = this.A;
        synchronized (this) {
            switch (i) {
                case 0:
                    return this;
                default:
                    return this;
            }
        }
    }
}
