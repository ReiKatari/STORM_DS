package x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public final rd.k f14298b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14299c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f14297a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public c1 f14300d = null;

    public j(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14298b = new rd.k(20, cameraCharacteristics);
        } else {
            this.f14298b = new rd.k(20, cameraCharacteristics);
        }
        this.f14299c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f14298b.B).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f14297a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f14298b.B).get(key);
                if (obj2 != null) {
                    this.f14297a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b() {
        Integer num;
        CameraCharacteristics.Key key;
        if (d() && Build.VERSION.SDK_INT >= 35) {
            key = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
            num = (Integer) a(key);
        } else {
            num = null;
        }
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p1.c1] */
    public final c1 c() {
        if (this.f14300d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    a0.g gVar = new a0.g(this.f14299c, 0);
                    ?? obj = new Object();
                    obj.L = new HashMap();
                    new HashMap();
                    new HashMap();
                    obj.A = new rd.k(22, streamConfigurationMap);
                    obj.B = gVar;
                    this.f14300d = obj;
                } else {
                    a0.j.h("StreamConfigurationMap is null!");
                    return null;
                }
            } catch (AssertionError | NullPointerException e6) {
                a0.j.h(e6.getMessage());
                return null;
            }
        }
        return this.f14300d;
    }

    public final boolean d() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }
}
