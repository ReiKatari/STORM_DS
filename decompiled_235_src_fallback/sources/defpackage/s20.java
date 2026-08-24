package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s20  reason: default package */
/* loaded from: classes.dex */
public final class s20 implements android.os.Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r1 = r2.what
            if (r1 == 0) goto L10
            r0 = 1
            if (r1 == r0) goto L9
            r1 = 0
            return r1
        L9:
            java.lang.Object r1 = r2.obj
            java.lang.ClassCastException r1 = defpackage.i61.i(r1)
            throw r1
        L10:
            java.lang.Object r1 = r2.obj
            java.lang.ClassCastException r1 = defpackage.i61.i(r1)
            throw r1
    }
}
