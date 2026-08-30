package v;

import a0.j;
import aj.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceHolder;
import j0.i;
import j0.p0;
import j0.u0;
import j0.w1;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p7.m;
import p7.t;
import rd.k;
import x.p;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements f0.b {

    /* renamed from: c0  reason: collision with root package name */
    public static final d f13572c0 = new CameraCaptureSession.StateCallback();
    public final Context A;
    public final String B;
    public final p L;
    public final n R;
    public final n X;
    public final n Y;
    public final n Z;

    /* renamed from: b0  reason: collision with root package name */
    public final n f13573b0;

    public e(Context context, String str, p pVar) {
        context.getClass();
        str.getClass();
        pVar.getClass();
        this.A = context;
        this.B = str;
        this.L = pVar;
        this.R = new n(new mc.a(this) { // from class: v.b
            public final /* synthetic */ e B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                w0.b bVar;
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                boolean z10;
                Boolean bool;
                boolean z11;
                switch (r2) {
                    case 0:
                        e eVar = this.B;
                        Context context2 = eVar.A;
                        w0.b bVar2 = null;
                        if (Build.VERSION.SDK_INT >= 35) {
                            bVar = new w0.b(context2);
                        } else {
                            bVar = null;
                        }
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 == null) {
                                            str2 = string;
                                        } else {
                                            j.p("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        bVar2 = (w0.b) Class.forName(str2).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e6) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e6);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str3 = eVar.B;
                        ArrayList arrayList = new ArrayList();
                        if (bVar2 != null) {
                            arrayList.add(new w0.a(bVar2.f14110a, str3));
                        }
                        if (bVar != null) {
                            try {
                                arrayList.add(new w0.a(bVar.f14110a, str3));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        e eVar2 = this.B;
                        p pVar2 = eVar2.L;
                        String str4 = eVar2.B;
                        isCameraDeviceSetupSupported = ((CameraManager) pVar2.f14306a.B).isCameraDeviceSetupSupported(str4);
                        if (isCameraDeviceSetupSupported) {
                            cameraDeviceSetup = ((CameraManager) pVar2.f14306a.B).getCameraDeviceSetup(str4);
                            return cameraDeviceSetup;
                        }
                        return null;
                    case 2:
                        e eVar3 = this.B;
                        try {
                            return eVar3.L.b(eVar3.B);
                        } catch (x.a e10) {
                            throw new Exception(e10);
                        }
                    case 3:
                        k n10 = k.n((x.j) this.B.Y.getValue());
                        if (Build.VERSION.SDK_INT >= 33) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m.o("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z10);
                        return ((y.b) n10.B).c();
                    default:
                        Context context3 = this.B.A;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < serviceInfoArr2.length) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        int i10 = i2 + 1;
                                        try {
                                            Bundle bundle2 = serviceInfoArr2[i2].metaData;
                                            if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                                bool = Boolean.TRUE;
                                            } else {
                                                i2 = i10;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e11) {
                                            o.x(e11.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(nc.k.a(bool, Boolean.FALSE));
                }
            }
        });
        this.X = new n(new mc.a(this) { // from class: v.b
            public final /* synthetic */ e B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                w0.b bVar;
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                boolean z10;
                Boolean bool;
                boolean z11;
                switch (r2) {
                    case 0:
                        e eVar = this.B;
                        Context context2 = eVar.A;
                        w0.b bVar2 = null;
                        if (Build.VERSION.SDK_INT >= 35) {
                            bVar = new w0.b(context2);
                        } else {
                            bVar = null;
                        }
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 == null) {
                                            str2 = string;
                                        } else {
                                            j.p("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        bVar2 = (w0.b) Class.forName(str2).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e6) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e6);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str3 = eVar.B;
                        ArrayList arrayList = new ArrayList();
                        if (bVar2 != null) {
                            arrayList.add(new w0.a(bVar2.f14110a, str3));
                        }
                        if (bVar != null) {
                            try {
                                arrayList.add(new w0.a(bVar.f14110a, str3));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        e eVar2 = this.B;
                        p pVar2 = eVar2.L;
                        String str4 = eVar2.B;
                        isCameraDeviceSetupSupported = ((CameraManager) pVar2.f14306a.B).isCameraDeviceSetupSupported(str4);
                        if (isCameraDeviceSetupSupported) {
                            cameraDeviceSetup = ((CameraManager) pVar2.f14306a.B).getCameraDeviceSetup(str4);
                            return cameraDeviceSetup;
                        }
                        return null;
                    case 2:
                        e eVar3 = this.B;
                        try {
                            return eVar3.L.b(eVar3.B);
                        } catch (x.a e10) {
                            throw new Exception(e10);
                        }
                    case 3:
                        k n10 = k.n((x.j) this.B.Y.getValue());
                        if (Build.VERSION.SDK_INT >= 33) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m.o("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z10);
                        return ((y.b) n10.B).c();
                    default:
                        Context context3 = this.B.A;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < serviceInfoArr2.length) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        int i10 = i2 + 1;
                                        try {
                                            Bundle bundle2 = serviceInfoArr2[i2].metaData;
                                            if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                                bool = Boolean.TRUE;
                                            } else {
                                                i2 = i10;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e11) {
                                            o.x(e11.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(nc.k.a(bool, Boolean.FALSE));
                }
            }
        });
        this.Y = new n(new mc.a(this) { // from class: v.b
            public final /* synthetic */ e B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                w0.b bVar;
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                boolean z10;
                Boolean bool;
                boolean z11;
                switch (r2) {
                    case 0:
                        e eVar = this.B;
                        Context context2 = eVar.A;
                        w0.b bVar2 = null;
                        if (Build.VERSION.SDK_INT >= 35) {
                            bVar = new w0.b(context2);
                        } else {
                            bVar = null;
                        }
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 == null) {
                                            str2 = string;
                                        } else {
                                            j.p("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        bVar2 = (w0.b) Class.forName(str2).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e6) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e6);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str3 = eVar.B;
                        ArrayList arrayList = new ArrayList();
                        if (bVar2 != null) {
                            arrayList.add(new w0.a(bVar2.f14110a, str3));
                        }
                        if (bVar != null) {
                            try {
                                arrayList.add(new w0.a(bVar.f14110a, str3));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        e eVar2 = this.B;
                        p pVar2 = eVar2.L;
                        String str4 = eVar2.B;
                        isCameraDeviceSetupSupported = ((CameraManager) pVar2.f14306a.B).isCameraDeviceSetupSupported(str4);
                        if (isCameraDeviceSetupSupported) {
                            cameraDeviceSetup = ((CameraManager) pVar2.f14306a.B).getCameraDeviceSetup(str4);
                            return cameraDeviceSetup;
                        }
                        return null;
                    case 2:
                        e eVar3 = this.B;
                        try {
                            return eVar3.L.b(eVar3.B);
                        } catch (x.a e10) {
                            throw new Exception(e10);
                        }
                    case 3:
                        k n10 = k.n((x.j) this.B.Y.getValue());
                        if (Build.VERSION.SDK_INT >= 33) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m.o("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z10);
                        return ((y.b) n10.B).c();
                    default:
                        Context context3 = this.B.A;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < serviceInfoArr2.length) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        int i10 = i2 + 1;
                                        try {
                                            Bundle bundle2 = serviceInfoArr2[i2].metaData;
                                            if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                                bool = Boolean.TRUE;
                                            } else {
                                                i2 = i10;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e11) {
                                            o.x(e11.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(nc.k.a(bool, Boolean.FALSE));
                }
            }
        });
        this.Z = new n(new mc.a(this) { // from class: v.b
            public final /* synthetic */ e B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                w0.b bVar;
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                boolean z10;
                Boolean bool;
                boolean z11;
                switch (r2) {
                    case 0:
                        e eVar = this.B;
                        Context context2 = eVar.A;
                        w0.b bVar2 = null;
                        if (Build.VERSION.SDK_INT >= 35) {
                            bVar = new w0.b(context2);
                        } else {
                            bVar = null;
                        }
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 == null) {
                                            str2 = string;
                                        } else {
                                            j.p("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        bVar2 = (w0.b) Class.forName(str2).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e6) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e6);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str3 = eVar.B;
                        ArrayList arrayList = new ArrayList();
                        if (bVar2 != null) {
                            arrayList.add(new w0.a(bVar2.f14110a, str3));
                        }
                        if (bVar != null) {
                            try {
                                arrayList.add(new w0.a(bVar.f14110a, str3));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        e eVar2 = this.B;
                        p pVar2 = eVar2.L;
                        String str4 = eVar2.B;
                        isCameraDeviceSetupSupported = ((CameraManager) pVar2.f14306a.B).isCameraDeviceSetupSupported(str4);
                        if (isCameraDeviceSetupSupported) {
                            cameraDeviceSetup = ((CameraManager) pVar2.f14306a.B).getCameraDeviceSetup(str4);
                            return cameraDeviceSetup;
                        }
                        return null;
                    case 2:
                        e eVar3 = this.B;
                        try {
                            return eVar3.L.b(eVar3.B);
                        } catch (x.a e10) {
                            throw new Exception(e10);
                        }
                    case 3:
                        k n10 = k.n((x.j) this.B.Y.getValue());
                        if (Build.VERSION.SDK_INT >= 33) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m.o("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z10);
                        return ((y.b) n10.B).c();
                    default:
                        Context context3 = this.B.A;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < serviceInfoArr2.length) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        int i10 = i2 + 1;
                                        try {
                                            Bundle bundle2 = serviceInfoArr2[i2].metaData;
                                            if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                                bool = Boolean.TRUE;
                                            } else {
                                                i2 = i10;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e11) {
                                            o.x(e11.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(nc.k.a(bool, Boolean.FALSE));
                }
            }
        });
        this.f13573b0 = new n(new mc.a(this) { // from class: v.b
            public final /* synthetic */ e B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                w0.b bVar;
                String string;
                boolean isCameraDeviceSetupSupported;
                CameraDevice.CameraDeviceSetup cameraDeviceSetup;
                boolean z10;
                Boolean bool;
                boolean z11;
                switch (r2) {
                    case 0:
                        e eVar = this.B;
                        Context context2 = eVar.A;
                        w0.b bVar2 = null;
                        if (Build.VERSION.SDK_INT >= 35) {
                            bVar = new w0.b(context2);
                        } else {
                            bVar = null;
                        }
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr != null) {
                                String str2 = null;
                                for (ServiceInfo serviceInfo : serviceInfoArr) {
                                    Bundle bundle = serviceInfo.metaData;
                                    if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                        if (str2 == null) {
                                            str2 = string;
                                        } else {
                                            j.p("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                            return null;
                                        }
                                    }
                                }
                                if (str2 != null) {
                                    try {
                                        bVar2 = (w0.b) Class.forName(str2).getConstructor(Context.class).newInstance(context2);
                                    } catch (Exception e6) {
                                        throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e6);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        String str3 = eVar.B;
                        ArrayList arrayList = new ArrayList();
                        if (bVar2 != null) {
                            arrayList.add(new w0.a(bVar2.f14110a, str3));
                        }
                        if (bVar != null) {
                            try {
                                arrayList.add(new w0.a(bVar.f14110a, str3));
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    case DSiCameraSource.FrontCamera /* 1 */:
                        e eVar2 = this.B;
                        p pVar2 = eVar2.L;
                        String str4 = eVar2.B;
                        isCameraDeviceSetupSupported = ((CameraManager) pVar2.f14306a.B).isCameraDeviceSetupSupported(str4);
                        if (isCameraDeviceSetupSupported) {
                            cameraDeviceSetup = ((CameraManager) pVar2.f14306a.B).getCameraDeviceSetup(str4);
                            return cameraDeviceSetup;
                        }
                        return null;
                    case 2:
                        e eVar3 = this.B;
                        try {
                            return eVar3.L.b(eVar3.B);
                        } catch (x.a e10) {
                            throw new Exception(e10);
                        }
                    case 3:
                        k n10 = k.n((x.j) this.B.Y.getValue());
                        if (Build.VERSION.SDK_INT >= 33) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m.o("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z10);
                        return ((y.b) n10.B).c();
                    default:
                        Context context3 = this.B.A;
                        try {
                            ServiceInfo[] serviceInfoArr2 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 132).services;
                            if (serviceInfoArr2 == null) {
                                bool = Boolean.FALSE;
                            } else {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < serviceInfoArr2.length) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        int i10 = i2 + 1;
                                        try {
                                            Bundle bundle2 = serviceInfoArr2[i2].metaData;
                                            if (bundle2 != null && bundle2.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                                bool = Boolean.TRUE;
                                            } else {
                                                i2 = i10;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e11) {
                                            o.x(e11.getMessage());
                                            return null;
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            bool = null;
                        }
                        return Boolean.valueOf(nc.k.a(bool, Boolean.FALSE));
                }
            }
        });
    }

    @Override // f0.b
    public final boolean a(w1 w1Var) {
        boolean z10;
        boolean isTerminated;
        long j2;
        c cVar;
        DynamicRangeProfiles dynamicRangeProfiles;
        OutputConfiguration outputConfiguration;
        p0 p0Var = w1Var.f7322g;
        ArrayList arrayList = w1Var.f7316a;
        ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i iVar = (i) obj;
            if (((Boolean) this.f13573b0.getValue()).booleanValue()) {
                iVar.getClass();
                u0 u0Var = iVar.f7213a;
                Class cls = u0Var.f7304j;
                StringBuilder sb2 = new StringBuilder("toDeferredOutputConfiguration: surface containerClass = ");
                Class cls2 = u0Var.f7304j;
                Size size2 = u0Var.f7302h;
                sb2.append(cls2);
                g.o("FeatureCombinationQueryImpl", sb2.toString());
                if (cls != null) {
                    if (size2 != null) {
                        outputConfiguration = new OutputConfiguration(size2, cls);
                    } else {
                        j.h("Required value was null.");
                        return false;
                    }
                } else {
                    outputConfiguration = new OutputConfiguration(u0Var.f7303i, size2);
                }
                cVar = new c(outputConfiguration, null);
            } else {
                iVar.getClass();
                u0 u0Var2 = iVar.f7213a;
                Class cls3 = u0Var2.f7304j;
                if (nc.k.a(cls3, MediaCodec.class)) {
                    j2 = 65536;
                } else if (nc.k.a(cls3, SurfaceHolder.class)) {
                    j2 = 2048;
                } else if (nc.k.a(cls3, SurfaceTexture.class)) {
                    j2 = 256;
                } else {
                    j2 = 0;
                }
                StringBuilder sb3 = new StringBuilder("toConcreteOutputConfiguration: surface containerClass = ");
                Class cls4 = u0Var2.f7304j;
                Size size3 = u0Var2.f7302h;
                sb3.append(cls4);
                sb3.append(", usageFlag = ");
                sb3.append(j2);
                g.o("FeatureCombinationQueryImpl", sb3.toString());
                ImageReader newInstance = ImageReader.newInstance(size3.getWidth(), size3.getHeight(), u0Var2.f7303i, 1, j2);
                newInstance.getClass();
                cVar = new c(new OutputConfiguration(newInstance.getSurface()), newInstance);
            }
            if (iVar.f7213a.f7304j != null && (dynamicRangeProfiles = (DynamicRangeProfiles) this.Z.getValue()) != null) {
                Long a10 = y.a.a(iVar.f7217e, dynamicRangeProfiles);
                if (a10 != null) {
                    cVar.A.setDynamicRangeProfile(a10.longValue());
                } else {
                    j.h("Required value was null.");
                    return false;
                }
            }
            arrayList2.add(cVar);
        }
        ArrayList arrayList3 = new ArrayList(zb.m.G(arrayList2, 10));
        int size4 = arrayList2.size();
        int i10 = 0;
        while (i10 < size4) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(((c) obj2).A);
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList3, ij.a.D(), f13572c0);
        CameraDevice.CameraDeviceSetup cameraDeviceSetup = (CameraDevice.CameraDeviceSetup) this.X.getValue();
        if (cameraDeviceSetup == null) {
            sessionConfiguration = null;
        } else {
            CaptureRequest.Builder createCaptureRequest = cameraDeviceSetup.createCaptureRequest(p0Var.f7276c);
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, p0Var.a());
            if (p0Var.b() == 2) {
                createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            sessionConfiguration.setSessionParameters(createCaptureRequest.build());
        }
        if (sessionConfiguration == null) {
            return false;
        }
        int i11 = ((w0.a) this.R.getValue()).a(sessionConfiguration).A;
        StringBuilder i12 = kc.a.i("isSupported: supported = ", i11, " for session config with ");
        StringBuilder sb4 = new StringBuilder("sessionParameters=[");
        sb4.append("fpsRange=" + p0Var.a());
        sb4.append(", previewStabilizationMode=" + p0Var.b());
        sb4.append("], outputConfigurations=[");
        int size5 = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i14 < size5) {
            Object obj3 = arrayList.get(i14);
            i14++;
            int i15 = i13 + 1;
            if (i13 >= 0) {
                i iVar2 = (i) obj3;
                if (i13 != 0) {
                    sb4.append(",");
                }
                StringBuilder sb5 = new StringBuilder("{format=");
                u0 u0Var3 = iVar2.f7213a;
                sb5.append(u0Var3.f7303i);
                sb5.append(", size=");
                sb5.append(u0Var3.f7302h);
                sb5.append(", dynamicRange=");
                sb5.append(iVar2.f7217e);
                sb5.append(", class=");
                sb5.append(u0Var3.f7304j);
                sb5.append('}');
                sb4.append(sb5.toString());
                i13 = i15;
            } else {
                t.F();
                throw null;
            }
        }
        sb4.append("]");
        i12.append(sb4.toString());
        g.o("FeatureCombinationQueryImpl", i12.toString());
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size6 = arrayList2.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj4 = arrayList2.get(i16);
            i16++;
            AutoCloseable autoCloseable = (AutoCloseable) obj4;
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z11 = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z11) {
                                executorService.shutdownNow();
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else {
                fj.j.b();
                return false;
            }
        }
        return z10;
    }
}
