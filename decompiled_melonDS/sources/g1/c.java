package g1;

import i3.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f5014a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5015b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5016c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5017d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5018e;

    public c(long j2, long j10, long j11, long j12, long j13) {
        this.f5014a = j2;
        this.f5015b = j10;
        this.f5016c = j11;
        this.f5017d = j12;
        this.f5018e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (s.c(this.f5014a, cVar.f5014a) && s.c(this.f5015b, cVar.f5015b) && s.c(this.f5016c, cVar.f5016c) && s.c(this.f5017d, cVar.f5017d) && s.c(this.f5018e, cVar.f5018e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = s.f6688i;
        return Long.hashCode(this.f5018e) + w.d.f(this.f5017d, w.d.f(this.f5016c, w.d.f(this.f5015b, Long.hashCode(this.f5014a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) s.i(this.f5014a)) + ", textColor=" + ((Object) s.i(this.f5015b)) + ", iconColor=" + ((Object) s.i(this.f5016c)) + ", disabledTextColor=" + ((Object) s.i(this.f5017d)) + ", disabledIconColor=" + ((Object) s.i(this.f5018e)) + ')';
    }
}
