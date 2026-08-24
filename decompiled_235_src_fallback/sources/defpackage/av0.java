package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av0  reason: default package */
/* loaded from: classes.dex */
public class av0 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;
    private volatile /* synthetic */ int _handled$volatile;
    public final java.lang.Throwable a;

    static {
            java.lang.Class<av0> r0 = defpackage.av0.class
            java.lang.String r1 = "_handled$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.av0.b = r0
            return
    }

    public av0(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0._handled$volatile = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r2 = r2.a
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
