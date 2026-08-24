package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n1  reason: default package */
/* loaded from: classes.dex */
public final class n1 {
    public static final n1 d = new n1(null, null);
    public final Runnable a;
    public final Executor b;
    public n1 c;

    public n1(Executor executor, Runnable runnable) {
        this.a = runnable;
        this.b = executor;
    }
}
