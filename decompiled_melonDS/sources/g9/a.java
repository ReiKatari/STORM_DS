package g9;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import m9.n;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5604a;

    public /* synthetic */ a(int i2) {
        this.f5604a = i2;
    }

    @Override // g9.f
    public final g a(Object obj, n nVar, b9.h hVar) {
        switch (this.f5604a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!q9.g.c(uri)) {
                    return null;
                }
                return new b(uri, nVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new c((Bitmap) obj, nVar, 0);
            case 2:
                return new c((ByteBuffer) obj, nVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (!nc.k.a(uri2.getScheme(), "content")) {
                    return null;
                }
                return new b(uri2, nVar, 1);
            case 4:
                return new c((Drawable) obj, nVar, 2);
            case l1.c.f8511g /* 5 */:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (!nc.k.a(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                return new b(uri3, nVar, 2);
        }
    }
}
