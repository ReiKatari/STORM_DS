package rj;

import a0.j;
import java.io.InputStream;
import java.util.zip.CRC32;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends oj.c {

    /* renamed from: h  reason: collision with root package name */
    public CRC32 f12779h;

    /* renamed from: i  reason: collision with root package name */
    public long f12780i;

    /* renamed from: j  reason: collision with root package name */
    public long f12781j;

    public final d B0() {
        oj.a aVar = this.f11054e;
        if (aVar != null) {
            return new d((InputStream) aVar.f11052e, this.f12779h, this.f12781j, this.f12780i);
        }
        j.p("origin == null");
        return null;
    }
}
