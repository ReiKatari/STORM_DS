package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aj1  reason: default package */
/* loaded from: classes.dex */
public final class aj1 extends defpackage.zk2 {
    public final /* synthetic */ defpackage.zk2 A;
    public final /* synthetic */ androidx.fragment.app.i B;

    public aj1(androidx.fragment.app.i r1, defpackage.zk2 r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.A = r2
            return
    }

    @Override // defpackage.zk2
    public final android.view.View c(int r3) {
            r2 = this;
            zk2 r0 = r2.A
            boolean r1 = r0.j()
            if (r1 == 0) goto Ld
            android.view.View r2 = r0.c(r3)
            return r2
        Ld:
            androidx.fragment.app.i r2 = r2.B
            android.view.View r2 = r2.onFindViewById(r3)
            return r2
    }

    @Override // defpackage.zk2
    public final boolean j() {
            r1 = this;
            zk2 r0 = r1.A
            boolean r0 = r0.j()
            if (r0 != 0) goto L13
            androidx.fragment.app.i r1 = r1.B
            boolean r1 = r1.onHasView()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }
}
