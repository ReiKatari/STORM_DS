package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb1  reason: default package */
/* loaded from: classes.dex */
public final class gb1 {
    public final m55 A;
    public final m55 B;
    public final m55 C;
    public final m55 D;
    public final m55 E;
    public final m55 F;
    public final m55 G;
    public final m55 H;
    public final m55 I;
    public final gr1 a;
    public final rr6 b;
    public final eb1 c;
    public final m55 d;
    public final m55 e;
    public final m55 f;
    public final m55 g;
    public final m55 h;
    public final m55 i;
    public final m55 j;
    public final m55 k;
    public final m55 l;
    public final m55 m;
    public final m55 n;
    public final m55 o;
    public final m55 p;
    public final m55 q;
    public final m55 r;
    public final m55 s;
    public final m55 t;
    public final m55 u;
    public final m55 v;
    public final m55 w;
    public final m55 x;
    public final m55 y;
    public final yg1 z = new Object();

    /* JADX WARN: Type inference failed for: r3v45, types: [yg1, java.lang.Object] */
    public gb1(eb1 eb1Var, gr1 gr1Var, rr6 rr6Var) {
        this.c = eb1Var;
        this.a = gr1Var;
        this.b = rr6Var;
        this.d = i61.h(eb1Var, this, 4);
        this.e = i61.h(eb1Var, this, 3);
        this.f = i61.h(eb1Var, this, 2);
        this.g = i61.h(eb1Var, this, 9);
        this.h = i61.h(eb1Var, this, 10);
        this.i = i61.h(eb1Var, this, 8);
        this.j = i61.h(eb1Var, this, 7);
        this.k = i61.h(eb1Var, this, 11);
        this.l = i61.h(eb1Var, this, 6);
        this.m = i61.h(eb1Var, this, 12);
        this.n = i61.h(eb1Var, this, 5);
        this.o = i61.h(eb1Var, this, 14);
        this.p = i61.h(eb1Var, this, 13);
        this.q = i61.h(eb1Var, this, 16);
        this.r = i61.h(eb1Var, this, 15);
        this.s = i61.h(eb1Var, this, 17);
        this.t = i61.h(eb1Var, this, 18);
        this.u = i61.h(eb1Var, this, 19);
        this.v = i61.h(eb1Var, this, 20);
        this.w = i61.h(eb1Var, this, 22);
        this.x = i61.h(eb1Var, this, 21);
        this.y = i61.h(eb1Var, this, 23);
        this.A = i61.h(eb1Var, this, 25);
        this.B = i61.h(eb1Var, this, 26);
        this.C = i61.h(eb1Var, this, 28);
        this.D = i61.h(eb1Var, this, 27);
        this.E = i61.h(eb1Var, this, 29);
        this.F = i61.h(eb1Var, this, 24);
        this.G = i61.h(eb1Var, this, 30);
        this.H = i61.h(eb1Var, this, 1);
        this.I = i61.h(eb1Var, this, 31);
        yg1.a(this.z, em1.a(new fb1(eb1Var, 0, 0, this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        return new defpackage.zf2(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tz6 a() {
        jh0 jh0Var = (jh0) this.j.get();
        jh0Var.getClass();
        y65 a = jh0Var.a();
        a.getClass();
        ArrayList c = a.c(CaptureIntentPreviewQuirk.class);
        int size = c.size();
        int i = 0;
        while (true) {
            if (i < size) {
                Object obj = c.get(i);
                i++;
                if (((CaptureIntentPreviewQuirk) obj).a()) {
                    break;
                }
            } else if (a.a(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
                break;
            } else {
                return xd5.j0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x013f A[Catch: AssertionError -> 0x00ad, TryCatch #0 {AssertionError -> 0x00ad, blocks: (B:22:0x0078, B:24:0x008a, B:26:0x0090, B:29:0x00b0, B:30:0x00b7, B:35:0x00e9, B:37:0x00ef, B:40:0x010a, B:45:0x0139, B:47:0x013f, B:49:0x0159, B:43:0x012b, B:48:0x0153, B:33:0x00db, B:39:0x0104), top: B:67:0x0078 }] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, oy7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oy7 b() {
        Range range;
        CameraCharacteristics.Key key;
        Float f;
        float floatValue;
        sg0 sg0Var = (sg0) this.e.get();
        sg0Var.getClass();
        lg0 lg0Var = sg0Var.b;
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = sf4.A;
            if (list == null || !list.isEmpty()) {
                for (CameraCharacteristics.Key key2 : list) {
                    if (kj2.L()) {
                        Log.w("CXCP", "Failed to read " + key2 + " for zoom features.");
                    }
                    key2.getClass();
                    if (((qc0) lg0Var).c(key2) == null) {
                        return new Object();
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Float valueOf = Float.valueOf(1.0f);
            lg0Var.getClass();
            try {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                key.getClass();
                Range range2 = (Range) ((qc0) lg0Var).c(key);
                if (range2 == null) {
                    if (kj2.L()) {
                        Log.w("CXCP", "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) xf0.b(((qc0) lg0Var).A)) + '!');
                    }
                    range = new Range(valueOf, valueOf);
                } else {
                    Comparable lower = range2.getLower();
                    lower.getClass();
                    float floatValue2 = ((Number) lower).floatValue();
                    if (Math.abs(floatValue2) >= Math.ulp(Math.abs(floatValue2)) * 2.0d && ((Number) range2.getLower()).floatValue() >= RecyclerView.B1) {
                        f = (Float) range2.getLower();
                        Comparable upper = range2.getUpper();
                        upper.getClass();
                        floatValue = ((Number) upper).floatValue();
                        if (Math.abs(floatValue) >= Math.ulp(Math.abs(floatValue)) * 2.0d && ((Number) range2.getUpper()).floatValue() >= RecyclerView.B1) {
                            valueOf = (Float) range2.getUpper();
                            range = new Range(f, valueOf);
                        }
                        if (kj2.L()) {
                            Log.w("CXCP", "Invalid upper zoom range detected: " + range2.getUpper());
                        }
                        range = new Range(f, valueOf);
                    }
                    if (kj2.L()) {
                        Log.w("CXCP", "Invalid lower zoom range detected: " + range2.getLower());
                    }
                    f = valueOf;
                    Comparable upper2 = range2.getUpper();
                    upper2.getClass();
                    floatValue = ((Number) upper2).floatValue();
                    if (Math.abs(floatValue) >= Math.ulp(Math.abs(floatValue)) * 2.0d) {
                        valueOf = (Float) range2.getUpper();
                        range = new Range(f, valueOf);
                    }
                    if (kj2.L()) {
                    }
                    range = new Range(f, valueOf);
                }
            } catch (AssertionError e) {
                if (si1.a().b(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                    }
                } else if (kj2.G()) {
                    Log.e("CXCP", "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e);
                }
                if (kj2.L()) {
                    Log.w("CXCP", "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e);
                }
                range = null;
            }
            if (range != null) {
                return new u63(5, sg0Var, range);
            }
        }
        return new u63(sg0Var);
    }
}
