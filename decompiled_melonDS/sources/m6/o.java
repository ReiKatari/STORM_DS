package m6;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public int f9287a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final r f9288b;

    /* renamed from: c  reason: collision with root package name */
    public r f9289c;

    /* renamed from: d  reason: collision with root package name */
    public r f9290d;

    /* renamed from: e  reason: collision with root package name */
    public int f9291e;

    /* renamed from: f  reason: collision with root package name */
    public int f9292f;

    public o(r rVar) {
        this.f9288b = rVar;
        this.f9289c = rVar;
    }

    public final void a() {
        this.f9287a = 1;
        this.f9289c = this.f9288b;
        this.f9292f = 0;
    }

    public final boolean b() {
        n6.a b10 = this.f9289c.f9303b.b();
        int a10 = b10.a(6);
        if ((a10 != 0 && ((ByteBuffer) b10.R).get(a10 + b10.A) != 0) || this.f9291e == 65039) {
            return true;
        }
        return false;
    }
}
