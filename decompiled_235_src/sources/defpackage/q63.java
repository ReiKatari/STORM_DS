package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q63  reason: default package */
/* loaded from: classes.dex */
public final class q63 implements r63 {
    public final InputContentInfo A;

    public q63(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.A = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.r63
    public final Uri c() {
        return this.A.getContentUri();
    }

    @Override // defpackage.r63
    public final void g() {
        this.A.requestPermission();
    }

    @Override // defpackage.r63
    public final Uri h() {
        return this.A.getLinkUri();
    }

    @Override // defpackage.r63
    public final ClipDescription m() {
        return this.A.getDescription();
    }

    @Override // defpackage.r63
    public final Object r() {
        return this.A;
    }

    public q63(Object obj) {
        this.A = (InputContentInfo) obj;
    }
}
