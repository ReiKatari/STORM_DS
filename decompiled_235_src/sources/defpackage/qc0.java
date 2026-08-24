package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc0  reason: default package */
/* loaded from: classes.dex */
public final class qc0 implements lg0 {
    public final String A;
    public final CameraCharacteristics B;
    public final ld0 L;
    public final Set R;
    public final ArrayMap X;
    public final ArrayMap Y;
    public final go3 Z;
    public final go3 d0;
    public final go3 e0;

    public qc0(String str, CameraCharacteristics cameraCharacteristics, ld0 ld0Var, Set set) {
        str.getClass();
        set.getClass();
        this.A = str;
        this.B = cameraCharacteristics;
        this.L = ld0Var;
        this.R = set;
        this.X = new ArrayMap();
        this.Y = new ArrayMap();
        xr3 xr3Var = xr3.PUBLICATION;
        this.Z = kj2.M(xr3Var, new on2(this) { // from class: pc0
            public final /* synthetic */ qc0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = yt1.A;
                Collection collection3 = du1.A;
                qc0 qc0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = qc0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) xf0.b(str2)) + "#supportedExtensions");
                            ld0 ld0Var2 = qc0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = ld0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = gt0.p1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) xf0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str3)) + "#keys");
                            Collection keys = qc0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection p1 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) xf0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = qc0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection p12 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) xf0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = qc0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection p13 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) xf0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) xf0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = qc0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) xf0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                                for (String str7 : set2) {
                                    xf0.a(str7);
                                    arrayList.add(new xf0(str7));
                                }
                                Collection p14 = gt0.p1(arrayList);
                                Trace.endSection();
                                collection3 = p14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = qc0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection p15 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 6:
                        String str9 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = qc0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection p16 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = qc0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection p17 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p17;
                                return collection3;
                            } catch (AssertionError e9) {
                                Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                                return collection3;
                            }
                        }
                        return collection3;
                }
            }
        });
        kj2.M(xr3Var, new on2(this) { // from class: pc0
            public final /* synthetic */ qc0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = yt1.A;
                Collection collection3 = du1.A;
                qc0 qc0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = qc0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) xf0.b(str2)) + "#supportedExtensions");
                            ld0 ld0Var2 = qc0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = ld0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = gt0.p1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) xf0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str3)) + "#keys");
                            Collection keys = qc0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection p1 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) xf0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = qc0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection p12 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) xf0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = qc0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection p13 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) xf0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) xf0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = qc0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) xf0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                                for (String str7 : set2) {
                                    xf0.a(str7);
                                    arrayList.add(new xf0(str7));
                                }
                                Collection p14 = gt0.p1(arrayList);
                                Trace.endSection();
                                collection3 = p14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = qc0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection p15 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 6:
                        String str9 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = qc0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection p16 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = qc0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection p17 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p17;
                                return collection3;
                            } catch (AssertionError e9) {
                                Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                                return collection3;
                            }
                        }
                        return collection3;
                }
            }
        });
        kj2.M(xr3Var, new on2(this) { // from class: pc0
            public final /* synthetic */ qc0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = yt1.A;
                Collection collection3 = du1.A;
                qc0 qc0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = qc0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) xf0.b(str2)) + "#supportedExtensions");
                            ld0 ld0Var2 = qc0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = ld0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = gt0.p1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) xf0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str3)) + "#keys");
                            Collection keys = qc0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection p1 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) xf0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = qc0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection p12 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) xf0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = qc0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection p13 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) xf0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) xf0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = qc0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) xf0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                                for (String str7 : set2) {
                                    xf0.a(str7);
                                    arrayList.add(new xf0(str7));
                                }
                                Collection p14 = gt0.p1(arrayList);
                                Trace.endSection();
                                collection3 = p14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = qc0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection p15 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 6:
                        String str9 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = qc0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection p16 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = qc0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection p17 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p17;
                                return collection3;
                            } catch (AssertionError e9) {
                                Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                                return collection3;
                            }
                        }
                        return collection3;
                }
            }
        });
        kj2.M(xr3Var, new on2(this) { // from class: pc0
            public final /* synthetic */ qc0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = yt1.A;
                Collection collection3 = du1.A;
                qc0 qc0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = qc0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) xf0.b(str2)) + "#supportedExtensions");
                            ld0 ld0Var2 = qc0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = ld0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = gt0.p1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) xf0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str3)) + "#keys");
                            Collection keys = qc0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection p1 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) xf0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = qc0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection p12 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) xf0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = qc0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection p13 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) xf0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) xf0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = qc0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) xf0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                                for (String str7 : set2) {
                                    xf0.a(str7);
                                    arrayList.add(new xf0(str7));
                                }
                                Collection p14 = gt0.p1(arrayList);
                                Trace.endSection();
                                collection3 = p14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = qc0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection p15 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 6:
                        String str9 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = qc0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection p16 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = qc0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection p17 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p17;
                                return collection3;
                            } catch (AssertionError e9) {
                                Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                                return collection3;
                            }
                        }
                        return collection3;
                }
            }
        });
        this.d0 = kj2.M(xr3Var, new on2(this) { // from class: pc0
            public final /* synthetic */ qc0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = yt1.A;
                Collection collection3 = du1.A;
                qc0 qc0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = qc0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) xf0.b(str2)) + "#supportedExtensions");
                            ld0 ld0Var2 = qc0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = ld0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = gt0.p1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) xf0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str3)) + "#keys");
                            Collection keys = qc0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection p1 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) xf0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = qc0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection p12 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) xf0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = qc0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection p13 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) xf0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) xf0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = qc0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) xf0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                                for (String str7 : set2) {
                                    xf0.a(str7);
                                    arrayList.add(new xf0(str7));
                                }
                                Collection p14 = gt0.p1(arrayList);
                                Trace.endSection();
                                collection3 = p14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = qc0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection p15 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 6:
                        String str9 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = qc0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection p16 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = qc0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection p17 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p17;
                                return collection3;
                            } catch (AssertionError e9) {
                                Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                                return collection3;
                            }
                        }
                        return collection3;
                }
            }
        });
        kj2.M(xr3Var, new on2(this) { // from class: pc0
            public final /* synthetic */ qc0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = yt1.A;
                Collection collection3 = du1.A;
                qc0 qc0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = qc0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) xf0.b(str2)) + "#supportedExtensions");
                            ld0 ld0Var2 = qc0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = ld0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = gt0.p1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) xf0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str3)) + "#keys");
                            Collection keys = qc0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection p1 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) xf0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = qc0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection p12 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) xf0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = qc0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection p13 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) xf0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) xf0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = qc0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) xf0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                                for (String str7 : set2) {
                                    xf0.a(str7);
                                    arrayList.add(new xf0(str7));
                                }
                                Collection p14 = gt0.p1(arrayList);
                                Trace.endSection();
                                collection3 = p14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = qc0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection p15 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 6:
                        String str9 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = qc0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection p16 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = qc0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection p17 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p17;
                                return collection3;
                            } catch (AssertionError e9) {
                                Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                                return collection3;
                            }
                        }
                        return collection3;
                }
            }
        });
        kj2.M(xr3Var, new on2(this) { // from class: pc0
            public final /* synthetic */ qc0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = yt1.A;
                Collection collection3 = du1.A;
                qc0 qc0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = qc0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) xf0.b(str2)) + "#supportedExtensions");
                            ld0 ld0Var2 = qc0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = ld0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = gt0.p1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) xf0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str3)) + "#keys");
                            Collection keys = qc0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection p1 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) xf0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = qc0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection p12 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) xf0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = qc0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection p13 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) xf0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) xf0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = qc0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) xf0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                                for (String str7 : set2) {
                                    xf0.a(str7);
                                    arrayList.add(new xf0(str7));
                                }
                                Collection p14 = gt0.p1(arrayList);
                                Trace.endSection();
                                collection3 = p14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = qc0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection p15 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 6:
                        String str9 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = qc0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection p16 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = qc0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection p17 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p17;
                                return collection3;
                            } catch (AssertionError e9) {
                                Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                                return collection3;
                            }
                        }
                        return collection3;
                }
            }
        });
        this.e0 = kj2.M(xr3Var, new on2(this) { // from class: pc0
            public final /* synthetic */ qc0 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = yt1.A;
                Collection collection3 = du1.A;
                qc0 qc0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = qc0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) xf0.b(str2)) + "#supportedExtensions");
                            ld0 ld0Var2 = qc0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = ld0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = gt0.p1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) xf0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str3)) + "#keys");
                            Collection keys = qc0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection p1 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) xf0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = qc0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection p12 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) xf0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = qc0Var.A;
                        try {
                            Trace.beginSection(((Object) xf0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = qc0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection p13 = gt0.p1(collection2);
                            Trace.endSection();
                            collection3 = p13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) xf0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) xf0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = qc0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) xf0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                                for (String str7 : set2) {
                                    xf0.a(str7);
                                    arrayList.add(new xf0(str7));
                                }
                                Collection p14 = gt0.p1(arrayList);
                                Trace.endSection();
                                collection3 = p14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) xf0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = qc0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection p15 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 6:
                        String str9 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = qc0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection p16 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = qc0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = qc0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection p17 = gt0.p1(collection2);
                                Trace.endSection();
                                collection3 = p17;
                                return collection3;
                            } catch (AssertionError e9) {
                                Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-" + str10, e9);
                                return collection3;
                            }
                        }
                        return collection3;
                }
            }
        });
    }

    public final Object c(CameraCharacteristics.Key key) {
        Object obj;
        if (this.R.contains(key)) {
            try {
                return this.B.get(key);
            } catch (AssertionError unused) {
                e41.o(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
                return null;
            }
        }
        synchronized (this.X) {
            obj = this.X.get(key);
        }
        if (obj == null) {
            try {
                Object obj2 = this.B.get(key);
                if (obj2 != null) {
                    synchronized (this.X) {
                        this.X.put(key, obj2);
                    }
                    return obj2;
                }
                return obj2;
            } catch (AssertionError unused2) {
                e41.o(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
                return null;
            }
        }
        return obj;
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(CameraCharacteristics.class))) {
            return this.B;
        }
        return null;
    }
}
