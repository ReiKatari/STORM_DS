package j4;

import a1.m;
import a1.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final x f7442a;

    /* renamed from: b  reason: collision with root package name */
    public d f7443b;

    /* renamed from: c  reason: collision with root package name */
    public long f7444c;

    /* renamed from: d  reason: collision with root package name */
    public long f7445d;

    /* renamed from: e  reason: collision with root package name */
    public long f7446e;

    /* renamed from: f  reason: collision with root package name */
    public long f7447f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f7448g;

    public e() {
        x xVar = m.f66a;
        this.f7442a = new x();
        this.f7444c = -1L;
        this.f7445d = 0L;
        this.f7446e = 0L;
    }

    public final void a(d dVar, long j2, long j10, float[] fArr, long j11) {
        boolean z10;
        long j12 = dVar.f7440g;
        if (j11 - j12 <= 0 && j12 != Long.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            dVar.f7440g = j11;
            dVar.a(dVar.f7438e, dVar.f7439f, j2, j10, fArr);
        }
    }
}
