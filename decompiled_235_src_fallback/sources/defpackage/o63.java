package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o63  reason: default package */
/* loaded from: classes.dex */
public final class o63 extends android.view.inputmethod.InputConnectionWrapper {
    public final /* synthetic */ defpackage.h61 a;

    public o63(android.view.inputmethod.InputConnection r1, defpackage.h61 r2) {
            r0 = this;
            r0.a = r2
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo r4, int r5, android.os.Bundle r6) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L16
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r1 >= r2) goto Lb
            goto L16
        Lb:
            s63 r0 = new s63
            q63 r1 = new q63
            r1.<init>(r4)
            r2 = 0
            r0.<init>(r1, r2)
        L16:
            h61 r1 = r3.a
            boolean r0 = r1.g(r0, r5, r6)
            if (r0 == 0) goto L20
            r3 = 1
            return r3
        L20:
            boolean r3 = super.commitContent(r4, r5, r6)
            return r3
    }
}
