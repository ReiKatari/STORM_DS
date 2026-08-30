package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n03  reason: default package */
/* loaded from: classes.dex */
public final class n03 implements o03 {
    public final InputContentInfo A;

    public n03(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.A = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.o03
    public final ClipDescription a() {
        return this.A.getDescription();
    }

    @Override // defpackage.o03
    public final Object b() {
        return this.A;
    }

    @Override // defpackage.o03
    public final Uri c() {
        return this.A.getContentUri();
    }

    @Override // defpackage.o03
    public final void e() {
        this.A.requestPermission();
    }

    @Override // defpackage.o03
    public final Uri g() {
        return this.A.getLinkUri();
    }

    public n03(Object obj) {
        this.A = (InputContentInfo) obj;
    }
}
