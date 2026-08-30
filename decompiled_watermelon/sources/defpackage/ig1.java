package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ig1  reason: default package */
/* loaded from: classes.dex */
public final class ig1 extends Exception {
    public final Throwable A;

    public ig1(Throwable th, g31 g31Var, e31 e31Var) {
        super("Coroutine dispatcher " + g31Var + " threw an exception, context = " + e31Var, th);
        this.A = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.A;
    }
}
