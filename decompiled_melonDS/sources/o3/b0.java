package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10677a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10678b;

    public b0(int i2) {
        boolean z10;
        if ((i2 & 1) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = (i2 & 2) == 0;
        this.f10677a = z10;
        this.f10678b = z11;
    }
}
