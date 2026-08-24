package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q63  reason: default package */
/* loaded from: classes.dex */
public final class q63 implements defpackage.r63 {
    public final android.view.inputmethod.InputContentInfo A;

    public q63(android.net.Uri r2, android.content.ClipDescription r3, android.net.Uri r4) {
            r1 = this;
            r1.<init>()
            android.view.inputmethod.InputContentInfo r0 = new android.view.inputmethod.InputContentInfo
            r0.<init>(r2, r3, r4)
            r1.A = r0
            return
    }

    public q63(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            android.view.inputmethod.InputContentInfo r1 = (android.view.inputmethod.InputContentInfo) r1
            r0.A = r1
            return
    }

    @Override // defpackage.r63
    public final android.net.Uri c() {
            r0 = this;
            android.view.inputmethod.InputContentInfo r0 = r0.A
            android.net.Uri r0 = r0.getContentUri()
            return r0
    }

    @Override // defpackage.r63
    public final void g() {
            r0 = this;
            android.view.inputmethod.InputContentInfo r0 = r0.A
            r0.requestPermission()
            return
    }

    @Override // defpackage.r63
    public final android.net.Uri h() {
            r0 = this;
            android.view.inputmethod.InputContentInfo r0 = r0.A
            android.net.Uri r0 = r0.getLinkUri()
            return r0
    }

    @Override // defpackage.r63
    public final android.content.ClipDescription m() {
            r0 = this;
            android.view.inputmethod.InputContentInfo r0 = r0.A
            android.content.ClipDescription r0 = r0.getDescription()
            return r0
    }

    @Override // defpackage.r63
    public final java.lang.Object r() {
            r0 = this;
            android.view.inputmethod.InputContentInfo r0 = r0.A
            return r0
    }
}
