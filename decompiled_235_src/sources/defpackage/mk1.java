package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mk1  reason: default package */
/* loaded from: classes.dex */
public final class mk1 extends Exception {
    public final Throwable A;

    public mk1(Throwable th, n61 n61Var, l61 l61Var) {
        super("Coroutine dispatcher " + n61Var + " threw an exception, context = " + l61Var, th);
        this.A = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.A;
    }
}
