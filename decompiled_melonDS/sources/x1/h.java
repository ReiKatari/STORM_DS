package x1;

import android.view.textclassifier.TextClassification;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: b  reason: collision with root package name */
    public final TextClassification f14334b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14335c;

    public h(Object obj, TextClassification textClassification, int i2) {
        super(obj);
        this.f14334b = textClassification;
        this.f14335c = i2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.f14322a);
        sb2.append(", textClassification=");
        sb2.append(this.f14334b);
        sb2.append(", index=");
        return w.d.p(sb2, this.f14335c, ')');
    }
}
