package c6;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements h {
    public final InputContentInfo A;

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.A = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // c6.h
    public final ClipDescription a() {
        return this.A.getDescription();
    }

    @Override // c6.h
    public final Object b() {
        return this.A;
    }

    @Override // c6.h
    public final Uri d() {
        return this.A.getContentUri();
    }

    @Override // c6.h
    public final void e() {
        this.A.requestPermission();
    }

    @Override // c6.h
    public final Uri f() {
        return this.A.getLinkUri();
    }

    public g(Object obj) {
        this.A = (InputContentInfo) obj;
    }
}
