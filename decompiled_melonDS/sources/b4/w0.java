package b4;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1954a;

    public /* synthetic */ w0(int i2) {
        this.f1954a = i2;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1954a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    y0 y0Var = new y0(choreographer, p7.t.f(myLooper));
                    return pc.a.G(y0Var, y0Var.f2013f0);
                }
                a0.j.p("no Looper on this thread");
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new StringBuilder("Picasso-");
            case 2:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return ij.a.p0();
                }
                if (Looper.myLooper() != null) {
                    return new l0.d(new Handler(Looper.myLooper()));
                }
                return null;
            case 3:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(qi.g.f12552a);
                return simpleDateFormat;
        }
    }
}
