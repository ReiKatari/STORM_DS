package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz  reason: default package */
/* loaded from: classes.dex */
public final class qz {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(qz.class, "notCompletedCount$volatile");
    public final jg1[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public qz(jg1[] jg1VarArr) {
        this.a = jg1VarArr;
        this.notCompletedCount$volatile = jg1VarArr.length;
    }
}
