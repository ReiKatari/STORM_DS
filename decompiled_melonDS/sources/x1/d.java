package x1;

import mc.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: b  reason: collision with root package name */
    public final String f14325b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14326c;

    /* renamed from: d  reason: collision with root package name */
    public final l f14327d;

    public d(Object obj, String str, int i2, l lVar) {
        super(obj);
        this.f14325b = str;
        this.f14326c = i2;
        this.f14327d = lVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuItem(key=");
        sb2.append(this.f14322a);
        sb2.append(", label=\"");
        sb2.append(this.f14325b);
        sb2.append("\", leadingIcon=");
        return w.d.p(sb2, this.f14326c, ')');
    }
}
