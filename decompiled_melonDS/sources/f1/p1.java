package f1;

import android.widget.Magnifier;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class p1 implements n1 {

    /* renamed from: a  reason: collision with root package name */
    public final Magnifier f4640a;

    public p1(Magnifier magnifier) {
        this.f4640a = magnifier;
    }

    @Override // f1.n1
    public void a(long j2, long j10) {
        this.f4640a.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void b() {
        this.f4640a.dismiss();
    }

    public final long c() {
        int width = this.f4640a.getWidth();
        return (this.f4640a.getHeight() & 4294967295L) | (width << 32);
    }

    public final void d() {
        this.f4640a.update();
    }
}
