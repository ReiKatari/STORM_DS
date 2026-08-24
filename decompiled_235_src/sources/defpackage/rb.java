package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rb  reason: default package */
/* loaded from: classes.dex */
public final class rb {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public rb(CameraManager cameraManager, String str) {
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        cameraDeviceSetup = cameraManager.getCameraDeviceSetup(str);
        this.b = cameraDeviceSetup;
    }

    public final ga0 a(SessionConfiguration sessionConfiguration) {
        boolean isSessionConfigurationSupported;
        int i;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    ga0 a = ((rb) obj2).a(sessionConfiguration);
                    if (a.b != 0) {
                        return a;
                    }
                }
                return new ga0(0, 5);
            default:
                isSessionConfigurationSupported = ((CameraDevice.CameraDeviceSetup) obj).isSessionConfigurationSupported(sessionConfiguration);
                if (isSessionConfigurationSupported) {
                    i = 1;
                } else {
                    i = 2;
                }
                String property = System.getProperty("ro.build.date.utc");
                if (property != null) {
                    try {
                        Long.parseLong(property);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new ga0(i, 5);
        }
    }

    public rb(ArrayList arrayList) {
        this.b = arrayList;
    }
}
