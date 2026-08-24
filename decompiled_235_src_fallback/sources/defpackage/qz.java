package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz  reason: default package */
/* loaded from: classes.dex */
public final class qz {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;
    public final defpackage.jg1[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    static {
            java.lang.Class<qz> r0 = defpackage.qz.class
            java.lang.String r1 = "notCompletedCount$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.qz.b = r0
            return
    }

    public qz(defpackage.jg1[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            int r1 = r1.length
            r0.notCompletedCount$volatile = r1
            return
    }
}
