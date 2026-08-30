package l1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements f, h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8546a;

    /* renamed from: b  reason: collision with root package name */
    public float f8547b;

    public e(int i2) {
        this.f8546a = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f8547b = 0;
                return;
            case 2:
                this.f8547b = 0;
                return;
            case 3:
                this.f8547b = 0;
                return;
            case 4:
                return;
            default:
                this.f8547b = 0;
                return;
        }
    }

    @Override // l1.f, l1.h
    public float a() {
        switch (this.f8546a) {
            case 0:
                return this.f8547b;
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.f8547b;
            case 2:
                return this.f8547b;
            default:
                return this.f8547b;
        }
    }

    @Override // l1.h
    public void b(int i2, y3.x0 x0Var, int[] iArr, int[] iArr2) {
        switch (this.f8546a) {
            case 0:
                i.a(i2, iArr, iArr2, false);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                i.d(i2, iArr, iArr2, false);
                return;
            case 2:
                i.e(i2, iArr, iArr2, false);
                return;
            default:
                i.f(i2, iArr, iArr2, false);
                return;
        }
    }

    @Override // l1.f
    public void c(x4.c cVar, int i2, int[] iArr, x4.m mVar, int[] iArr2) {
        switch (this.f8546a) {
            case 0:
                if (mVar == x4.m.Ltr) {
                    i.a(i2, iArr, iArr2, false);
                    return;
                } else {
                    i.a(i2, iArr, iArr2, true);
                    return;
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                if (mVar == x4.m.Ltr) {
                    i.d(i2, iArr, iArr2, false);
                    return;
                } else {
                    i.d(i2, iArr, iArr2, true);
                    return;
                }
            case 2:
                if (mVar == x4.m.Ltr) {
                    i.e(i2, iArr, iArr2, false);
                    return;
                } else {
                    i.e(i2, iArr, iArr2, true);
                    return;
                }
            default:
                if (mVar == x4.m.Ltr) {
                    i.f(i2, iArr, iArr2, false);
                    return;
                } else {
                    i.f(i2, iArr, iArr2, true);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f8546a) {
            case 0:
                return "Arrangement#Center";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
