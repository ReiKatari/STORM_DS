package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lb  reason: default package */
/* loaded from: classes.dex */
public final class lb {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public lb(CameraManager cameraManager, String str) {
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        cameraDeviceSetup = cameraManager.getCameraDeviceSetup(str);
        this.b = cameraDeviceSetup;
    }

    public final y70 a(SessionConfiguration sessionConfiguration) {
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
                    y70 a = ((lb) obj2).a(sessionConfiguration);
                    if (a.b != 0) {
                        return a;
                    }
                }
                return new y70(0, 5);
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
                return new y70(i, 5);
        }
    }

    public lb(ArrayList arrayList) {
        this.b = arrayList;
    }
}
