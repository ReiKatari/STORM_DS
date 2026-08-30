package gj;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5689a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final long f5690b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5691c;

    public f(long j2, long j10) {
        this.f5690b = j2;
        this.f5691c = j10;
    }

    public String toString() {
        switch (this.f5689a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return "BindPair binding input " + this.f5690b + " to output " + this.f5691c;
            default:
                return super.toString();
        }
    }

    public f(long j2, long j10, int i2) {
        this.f5690b = j2;
        this.f5691c = j10;
    }
}
