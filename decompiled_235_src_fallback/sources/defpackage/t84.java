package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t84  reason: default package */
/* loaded from: classes.dex */
public final class t84 extends android.os.RemoteCallbackList {
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService a;

    public t84(androidx.room.MultiInstanceInvalidationService r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(android.os.IInterface r1, java.lang.Object r2) {
            r0 = this;
            u03 r1 = (defpackage.u03) r1
            r1.getClass()
            r2.getClass()
            androidx.room.MultiInstanceInvalidationService r0 = r0.a
            java.util.LinkedHashMap r0 = r0.B
            java.lang.Integer r2 = (java.lang.Integer) r2
            r0.remove(r2)
            return
    }
}
