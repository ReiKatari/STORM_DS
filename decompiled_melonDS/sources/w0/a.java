package w0;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import d1.f2;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14108a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14109b;

    public a(CameraManager cameraManager, String str) {
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        cameraDeviceSetup = cameraManager.getCameraDeviceSetup(str);
        this.f14109b = cameraDeviceSetup;
    }

    public final f2 a(SessionConfiguration sessionConfiguration) {
        boolean isSessionConfigurationSupported;
        int i2;
        switch (this.f14108a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f14109b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f2 a10 = ((a) obj).a(sessionConfiguration);
                    if (a10.A != 0) {
                        return a10;
                    }
                }
                return new f2(0);
            default:
                isSessionConfigurationSupported = ((CameraDevice.CameraDeviceSetup) this.f14109b).isSessionConfigurationSupported(sessionConfiguration);
                if (isSessionConfigurationSupported) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                String property = System.getProperty("ro.build.date.utc");
                if (property != null) {
                    try {
                        Long.parseLong(property);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new f2(i2);
        }
    }

    public a(ArrayList arrayList) {
        this.f14109b = arrayList;
    }
}
