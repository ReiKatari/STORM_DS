package b9;

import android.graphics.Bitmap;
import m9.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ec.c {
    public h R;
    public m9.a X;
    public j Y;
    public c Z;

    /* renamed from: b0  reason: collision with root package name */
    public Bitmap f2119b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f2120c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ h f2121d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2122e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ec.c cVar) {
        super(cVar);
        this.f2121d0 = hVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f2120c0 = obj;
        this.f2122e0 |= Integer.MIN_VALUE;
        return h.a(this.f2121d0, null, 0, this);
    }
}
