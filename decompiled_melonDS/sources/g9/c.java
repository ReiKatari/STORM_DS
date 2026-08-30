package g9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import d8.p;
import d9.r;
import java.nio.ByteBuffer;
import m9.n;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5608a;

    /* renamed from: b  reason: collision with root package name */
    public final n f5609b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5610c;

    public /* synthetic */ c(Object obj, n nVar, int i2) {
        this.f5608a = i2;
        this.f5610c = obj;
        this.f5609b = nVar;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [fj.g, fj.e, java.lang.Object] */
    @Override // g9.g
    public final Object a(cc.c cVar) {
        int i2 = this.f5608a;
        boolean z10 = false;
        Object obj = this.f5610c;
        n nVar = this.f5609b;
        switch (i2) {
            case 0:
                return new d(new BitmapDrawable(nVar.f9429a.getResources(), (Bitmap) obj), false, d9.f.MEMORY);
            case DSiCameraSource.FrontCamera /* 1 */:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ?? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = nVar.f9429a;
                    return new m(new r(obj2, null), null, d9.f.MEMORY);
                } catch (Throwable th2) {
                    byteBuffer.position(0);
                    throw th2;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = q9.g.f12393a;
                z10 = ((drawable instanceof VectorDrawable) || (drawable instanceof p)) ? true : true;
                if (z10) {
                    drawable = new BitmapDrawable(nVar.f9429a.getResources(), p7.l.g(drawable, nVar.f9430b, nVar.f9432d, nVar.f9433e, nVar.f9434f));
                }
                return new d(drawable, z10, d9.f.MEMORY);
        }
    }
}
