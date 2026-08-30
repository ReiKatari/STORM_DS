package q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    public int f11956a;

    /* renamed from: b  reason: collision with root package name */
    public int f11957b;

    /* renamed from: c  reason: collision with root package name */
    public int f11958c;

    /* renamed from: d  reason: collision with root package name */
    public int f11959d;

    /* renamed from: e  reason: collision with root package name */
    public int f11960e;

    /* renamed from: f  reason: collision with root package name */
    public int f11961f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11962g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11963h;

    public final void a(int i2, int i10) {
        this.f11958c = i2;
        this.f11959d = i10;
        this.f11963h = true;
        if (this.f11962g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f11956a = i10;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f11957b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f11956a = i2;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f11957b = i10;
        }
    }
}
