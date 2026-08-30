package x;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f14306a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap f14307b = new ArrayMap(4);

    public p(a0 a0Var) {
        this.f14306a = a0Var;
    }

    public static p a(Context context, Handler handler) {
        a0 a0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            a0Var = new a0(context, (t) null);
        } else if (i2 >= 29) {
            a0Var = new a0(context, (t) null);
        } else if (i2 >= 28) {
            a0Var = new a0(context, (t) null);
        } else {
            a0Var = new a0(context, new t(handler));
        }
        return new p(a0Var);
    }

    public final j b(String str) {
        j jVar;
        synchronized (this.f14307b) {
            jVar = (j) this.f14307b.get(str);
            if (jVar == null) {
                try {
                    j jVar2 = new j(this.f14306a.x(str), str);
                    this.f14307b.put(str, jVar2);
                    jVar = jVar2;
                } catch (AssertionError e6) {
                    throw new a(e6.getMessage(), e6);
                }
            }
        }
        return jVar;
    }

    public final String[] c() {
        a0 a0Var = this.f14306a;
        a0Var.getClass();
        try {
            return ((CameraManager) a0Var.B).getCameraIdList();
        } catch (CameraAccessException e6) {
            throw new a(e6);
        }
    }
}
