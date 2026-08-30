package hg;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import nc.u;
import nc.v;
import nc.x;
import nd.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class h extends j {
    public static final g Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final Map f6495e;

    /* renamed from: d  reason: collision with root package name */
    public final eg.c f6496d;

    /* JADX WARN: Type inference failed for: r0v0, types: [hg.g, java.lang.Object] */
    static {
        v vVar = u.f10262a;
        nc.e a10 = u.a(eg.c.class);
        List list = Collections.EMPTY_LIST;
        vVar.getClass();
        Map singletonMap = Collections.singletonMap(new x(a10), j.f6497a);
        singletonMap.getClass();
        f6495e = singletonMap;
    }

    public h(int i2, eg.c cVar) {
        if (1 == (i2 & 1)) {
            this.f6496d = cVar;
        } else {
            a1.j(i2, 1, f.f6494a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && nc.k.a(this.f6496d, ((h) obj).f6496d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6496d.hashCode();
    }

    public final String toString() {
        return "BackgroundPreview(backgroundParcelable=" + this.f6496d + ")";
    }

    public h(eg.c cVar) {
        this.f6496d = cVar;
    }
}
