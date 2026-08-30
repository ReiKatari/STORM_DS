package j7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public int f7661a;

    /* renamed from: b  reason: collision with root package name */
    public int f7662b;

    /* renamed from: c  reason: collision with root package name */
    public int f7663c;

    /* renamed from: d  reason: collision with root package name */
    public int f7664d;

    /* renamed from: e  reason: collision with root package name */
    public int f7665e;

    public final boolean a() {
        int i2;
        int i10;
        int i11;
        int i12 = this.f7661a;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.f7664d;
            int i15 = this.f7662b;
            if (i14 > i15) {
                i11 = 1;
            } else if (i14 == i15) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if ((i11 & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 112) != 0) {
            int i16 = this.f7664d;
            int i17 = this.f7663c;
            if (i16 > i17) {
                i10 = 1;
            } else if (i16 == i17) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 4) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 1792) != 0) {
            int i18 = this.f7665e;
            int i19 = this.f7662b;
            if (i18 > i19) {
                i2 = 1;
            } else if (i18 == i19) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.f7665e;
            int i21 = this.f7663c;
            if (i20 > i21) {
                i13 = 1;
            } else if (i20 != i21) {
                i13 = 4;
            }
            if ((i12 & (i13 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
