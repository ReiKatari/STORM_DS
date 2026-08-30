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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ia0  reason: default package */
/* loaded from: classes.dex */
public final class ia0 implements ce0 {
    public final String A;
    public final CameraCharacteristics B;
    public final db0 L;
    public final Set R;
    public final ArrayMap X;
    public final ArrayMap Y;
    public final gh3 Z;
    public final gh3 c0;
    public final gh3 d0;

    public ia0(String str, CameraCharacteristics cameraCharacteristics, db0 db0Var, Set set) {
        str.getClass();
        set.getClass();
        this.A = str;
        this.B = cameraCharacteristics;
        this.L = db0Var;
        this.R = set;
        this.X = new ArrayMap();
        this.Y = new ArrayMap();
        wk3 wk3Var = wk3.PUBLICATION;
        this.Z = yf2.H(wk3Var, new ki2(this) { // from class: ha0
            public final /* synthetic */ ia0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = pp1.A;
                Collection collection3 = up1.A;
                ia0 ia0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = ia0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) od0.b(str2)) + "#supportedExtensions");
                            db0 db0Var2 = ia0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = db0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = tq0.s1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) od0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str3)) + "#keys");
                            Collection keys = ia0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection s1 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) od0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = ia0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection s12 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) od0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = ia0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection s13 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) od0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) od0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = ia0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) od0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                                for (String str7 : set2) {
                                    od0.a(str7);
                                    arrayList.add(new od0(str7));
                                }
                                Collection s14 = tq0.s1(arrayList);
                                Trace.endSection();
                                collection3 = s14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = ia0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection s15 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case ig7.b /* 6 */:
                        String str9 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = ia0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection s16 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = ia0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection s17 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s17;
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
        yf2.H(wk3Var, new ki2(this) { // from class: ha0
            public final /* synthetic */ ia0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = pp1.A;
                Collection collection3 = up1.A;
                ia0 ia0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = ia0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) od0.b(str2)) + "#supportedExtensions");
                            db0 db0Var2 = ia0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = db0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = tq0.s1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) od0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str3)) + "#keys");
                            Collection keys = ia0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection s1 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) od0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = ia0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection s12 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) od0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = ia0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection s13 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) od0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) od0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = ia0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) od0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                                for (String str7 : set2) {
                                    od0.a(str7);
                                    arrayList.add(new od0(str7));
                                }
                                Collection s14 = tq0.s1(arrayList);
                                Trace.endSection();
                                collection3 = s14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = ia0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection s15 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case ig7.b /* 6 */:
                        String str9 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = ia0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection s16 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = ia0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection s17 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s17;
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
        yf2.H(wk3Var, new ki2(this) { // from class: ha0
            public final /* synthetic */ ia0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = pp1.A;
                Collection collection3 = up1.A;
                ia0 ia0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = ia0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) od0.b(str2)) + "#supportedExtensions");
                            db0 db0Var2 = ia0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = db0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = tq0.s1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) od0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str3)) + "#keys");
                            Collection keys = ia0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection s1 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) od0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = ia0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection s12 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) od0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = ia0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection s13 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) od0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) od0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = ia0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) od0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                                for (String str7 : set2) {
                                    od0.a(str7);
                                    arrayList.add(new od0(str7));
                                }
                                Collection s14 = tq0.s1(arrayList);
                                Trace.endSection();
                                collection3 = s14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = ia0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection s15 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case ig7.b /* 6 */:
                        String str9 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = ia0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection s16 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = ia0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection s17 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s17;
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
        yf2.H(wk3Var, new ki2(this) { // from class: ha0
            public final /* synthetic */ ia0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = pp1.A;
                Collection collection3 = up1.A;
                ia0 ia0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = ia0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) od0.b(str2)) + "#supportedExtensions");
                            db0 db0Var2 = ia0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = db0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = tq0.s1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) od0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str3)) + "#keys");
                            Collection keys = ia0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection s1 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) od0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = ia0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection s12 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) od0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = ia0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection s13 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) od0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) od0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = ia0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) od0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                                for (String str7 : set2) {
                                    od0.a(str7);
                                    arrayList.add(new od0(str7));
                                }
                                Collection s14 = tq0.s1(arrayList);
                                Trace.endSection();
                                collection3 = s14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = ia0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection s15 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case ig7.b /* 6 */:
                        String str9 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = ia0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection s16 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = ia0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection s17 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s17;
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
        this.c0 = yf2.H(wk3Var, new ki2(this) { // from class: ha0
            public final /* synthetic */ ia0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = pp1.A;
                Collection collection3 = up1.A;
                ia0 ia0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = ia0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) od0.b(str2)) + "#supportedExtensions");
                            db0 db0Var2 = ia0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = db0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = tq0.s1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) od0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str3)) + "#keys");
                            Collection keys = ia0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection s1 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) od0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = ia0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection s12 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) od0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = ia0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection s13 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) od0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) od0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = ia0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) od0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                                for (String str7 : set2) {
                                    od0.a(str7);
                                    arrayList.add(new od0(str7));
                                }
                                Collection s14 = tq0.s1(arrayList);
                                Trace.endSection();
                                collection3 = s14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = ia0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection s15 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case ig7.b /* 6 */:
                        String str9 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = ia0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection s16 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = ia0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection s17 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s17;
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
        yf2.H(wk3Var, new ki2(this) { // from class: ha0
            public final /* synthetic */ ia0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = pp1.A;
                Collection collection3 = up1.A;
                ia0 ia0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = ia0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) od0.b(str2)) + "#supportedExtensions");
                            db0 db0Var2 = ia0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = db0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = tq0.s1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) od0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str3)) + "#keys");
                            Collection keys = ia0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection s1 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) od0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = ia0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection s12 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) od0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = ia0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection s13 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) od0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) od0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = ia0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) od0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                                for (String str7 : set2) {
                                    od0.a(str7);
                                    arrayList.add(new od0(str7));
                                }
                                Collection s14 = tq0.s1(arrayList);
                                Trace.endSection();
                                collection3 = s14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = ia0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection s15 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case ig7.b /* 6 */:
                        String str9 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = ia0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection s16 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = ia0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection s17 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s17;
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
        yf2.H(wk3Var, new ki2(this) { // from class: ha0
            public final /* synthetic */ ia0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = pp1.A;
                Collection collection3 = up1.A;
                ia0 ia0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = ia0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) od0.b(str2)) + "#supportedExtensions");
                            db0 db0Var2 = ia0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = db0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = tq0.s1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) od0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str3)) + "#keys");
                            Collection keys = ia0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection s1 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) od0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = ia0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection s12 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) od0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = ia0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection s13 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) od0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) od0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = ia0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) od0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                                for (String str7 : set2) {
                                    od0.a(str7);
                                    arrayList.add(new od0(str7));
                                }
                                Collection s14 = tq0.s1(arrayList);
                                Trace.endSection();
                                collection3 = s14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = ia0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection s15 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case ig7.b /* 6 */:
                        String str9 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = ia0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection s16 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = ia0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection s17 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s17;
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
        this.d0 = yf2.H(wk3Var, new ki2(this) { // from class: ha0
            public final /* synthetic */ ia0 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                Collection collection;
                List supportedExtensions;
                Set physicalCameraIds;
                Collection availablePhysicalCameraRequestKeys;
                Collection availableSessionCharacteristicsKeys;
                Collection availableSessionKeys;
                int i = r2;
                Collection collection2 = pp1.A;
                Collection collection3 = up1.A;
                ia0 ia0Var = this.B;
                switch (i) {
                    case 0:
                        String str2 = ia0Var.A;
                        try {
                            Trace.beginSection("Camera-" + ((Object) od0.b(str2)) + "#supportedExtensions");
                            db0 db0Var2 = ia0Var.L;
                            str2.getClass();
                            if (Build.VERSION.SDK_INT >= 31) {
                                supportedExtensions = db0Var2.e(str2).getSupportedExtensions();
                                supportedExtensions.getClass();
                                collection = tq0.s1(supportedExtensions);
                            } else {
                                collection = collection3;
                            }
                            Trace.endSection();
                            collection3 = collection;
                            return collection3;
                        } catch (AssertionError e) {
                            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-" + ((Object) od0.b(str2)), e);
                            return collection3;
                        }
                    case 1:
                        String str3 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str3)) + "#keys");
                            Collection keys = ia0Var.B.getKeys();
                            if (keys != null) {
                                collection2 = keys;
                            }
                            Collection s1 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s1;
                            return collection3;
                        } catch (AssertionError e2) {
                            Log.w("CXCP", "Failed to getKeys from " + ((Object) od0.b(str3)) + '}', e2);
                            return collection3;
                        }
                    case 2:
                        String str4 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str4)) + "#availableCaptureRequestKeys");
                            Collection availableCaptureRequestKeys = ia0Var.B.getAvailableCaptureRequestKeys();
                            if (availableCaptureRequestKeys != null) {
                                collection2 = availableCaptureRequestKeys;
                            }
                            Collection s12 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s12;
                            return collection3;
                        } catch (AssertionError e3) {
                            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from " + ((Object) od0.b(str4)), e3);
                            return collection3;
                        }
                    case 3:
                        String str5 = ia0Var.A;
                        try {
                            Trace.beginSection(((Object) od0.b(str5)) + "#availableCaptureResultKeys");
                            Collection availableCaptureResultKeys = ia0Var.B.getAvailableCaptureResultKeys();
                            if (availableCaptureResultKeys != null) {
                                collection2 = availableCaptureResultKeys;
                            }
                            Collection s13 = tq0.s1(collection2);
                            Trace.endSection();
                            collection3 = s13;
                            return collection3;
                        } catch (AssertionError e4) {
                            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from " + ((Object) od0.b(str5)), e4);
                            return collection3;
                        }
                    case 4:
                        String str6 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection(((Object) od0.b(str6)) + "#physicalCameraIds");
                                physicalCameraIds = ia0Var.B.getPhysicalCameraIds();
                                physicalCameraIds.getClass();
                                Log.i("CXCP", "Loaded physicalCameraIds from " + ((Object) od0.b(str6)) + ": " + physicalCameraIds);
                                Set<String> set2 = physicalCameraIds;
                                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                                for (String str7 : set2) {
                                    od0.a(str7);
                                    arrayList.add(new od0(str7));
                                }
                                Collection s14 = tq0.s1(arrayList);
                                Trace.endSection();
                                collection3 = s14;
                                return collection3;
                            } catch (AssertionError e5) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e5);
                                return collection3;
                            } catch (NullPointerException e6) {
                                Log.w("CXCP", "Failed to getPhysicalCameraIds from " + ((Object) od0.b(str6)), e6);
                                return collection3;
                            }
                        }
                        return collection3;
                    case 5:
                        String str8 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str8 + "#availablePhysicalCameraRequestKeys");
                                availablePhysicalCameraRequestKeys = ia0Var.B.getAvailablePhysicalCameraRequestKeys();
                                if (availablePhysicalCameraRequestKeys != null) {
                                    collection2 = availablePhysicalCameraRequestKeys;
                                }
                                Collection s15 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s15;
                                return collection3;
                            } catch (AssertionError e7) {
                                Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + str8, e7);
                                return collection3;
                            }
                        }
                        return collection3;
                    case ig7.b /* 6 */:
                        String str9 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 35) {
                            try {
                                Trace.beginSection("Camera-" + str9 + "#getAvailableSessionCharacteristicsKeys");
                                availableSessionCharacteristicsKeys = ia0Var.B.getAvailableSessionCharacteristicsKeys();
                                if (availableSessionCharacteristicsKeys != null) {
                                    collection2 = availableSessionCharacteristicsKeys;
                                }
                                Collection s16 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s16;
                                return collection3;
                            } catch (AssertionError e8) {
                                Log.w("CXCP", "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + str9, e8);
                                return collection3;
                            }
                        }
                        return collection3;
                    default:
                        String str10 = ia0Var.A;
                        if (Build.VERSION.SDK_INT >= 28) {
                            try {
                                Trace.beginSection("Camera-" + str10 + "#availableSessionKeys");
                                availableSessionKeys = ia0Var.B.getAvailableSessionKeys();
                                if (availableSessionKeys != null) {
                                    collection2 = availableSessionKeys;
                                }
                                Collection s17 = tq0.s1(collection2);
                                Trace.endSection();
                                collection3 = s17;
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
                f81.h(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
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
                f81.h(key, ": Framework throw an AssertionError", "Failed to get characteristic for ");
                return null;
            }
        }
        return obj;
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(CameraCharacteristics.class))) {
            return this.B;
        }
        return null;
    }
}
