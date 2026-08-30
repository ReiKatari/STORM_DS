package w;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import j0.o1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements j0.b0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14095a;

    /* renamed from: b  reason: collision with root package name */
    public final x.j f14096b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.b f14097c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14098d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final k0.f f14099e;

    /* renamed from: f  reason: collision with root package name */
    public final o1 f14100f;

    public y(String str, x.p pVar) {
        str.getClass();
        this.f14095a = str;
        x.j b10 = pVar.b(str);
        this.f14096b = b10;
        a0.b bVar = new a0.b(12);
        bVar.B = this;
        this.f14097c = bVar;
        this.f14100f = p7.t.j(b10);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            aj.g.y0("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
        }
        this.f14099e = new k0.f(new d0.e(d0.s.CLOSED, null));
    }

    @Override // j0.b0
    public final Set a() {
        return ((y.b) rd.k.n(this.f14096b).B).a();
    }

    @Override // j0.b0
    public final int b() {
        return e(0);
    }

    @Override // j0.b0
    public final int c() {
        boolean z10;
        Integer num = (Integer) this.f14096b.a(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.g("Unable to get the lens facing of the camera.", z10);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        aj.g.y0("LensFacingUtil", "The given lens facing integer: " + intValue + " can not be recognized.");
        return -1;
    }

    @Override // j0.b0
    public final String d() {
        return this.f14095a;
    }

    @Override // j0.b0
    public final int e(int i2) {
        Integer num = (Integer) this.f14096b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int x02 = ij.a.x0(i2);
        boolean z10 = true;
        if (1 != c()) {
            z10 = false;
        }
        return ij.a.c0(x02, z10, intValue);
    }

    @Override // j0.b0
    public final Object f() {
        return (CameraCharacteristics) this.f14096b.f14298b.B;
    }

    @Override // j0.b0
    public final o1 i() {
        return this.f14100f;
    }

    @Override // j0.b0
    public final List j(int i2) {
        Size[] l10 = this.f14096b.c().l(i2);
        if (l10 != null) {
            return Arrays.asList(l10);
        }
        return Collections.EMPTY_LIST;
    }

    @Override // j0.b0
    public final Rect k() {
        Rect rect = (Rect) this.f14096b.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // j0.b0
    public final androidx.lifecycle.d0 l() {
        return this.f14099e;
    }

    @Override // j0.b0
    public final Set m() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.f14096b.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i2 : iArr) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        return hashSet;
    }

    @Override // j0.b0
    public final Set n() {
        int[] iArr;
        rd.k kVar = (rd.k) this.f14096b.c().A;
        kVar.getClass();
        int[] iArr2 = null;
        try {
            iArr = ((StreamConfigurationMap) kVar.B).getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e6) {
            aj.g.z0("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e6);
            iArr = null;
        }
        if (iArr != null) {
            iArr2 = (int[]) iArr.clone();
        }
        if (iArr2 == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i2 : iArr2) {
            hashSet.add(Integer.valueOf(i2));
        }
        return hashSet;
    }

    public final void o(i iVar) {
        String str;
        synchronized (this.f14098d) {
        }
        Integer num = (Integer) this.f14096b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            str = d.l(intValue, "Unknown value: ");
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        aj.g.I("Camera2CameraInfo", "Device Level: ".concat(str));
    }
}
