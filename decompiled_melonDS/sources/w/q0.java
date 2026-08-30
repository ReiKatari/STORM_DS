package w;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import j0.d2;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Size f14028e = new Size(1920, 1080);

    /* renamed from: f  reason: collision with root package name */
    public static final Size f14029f = new Size(320, 240);

    /* renamed from: g  reason: collision with root package name */
    public static final Size f14030g = new Size(640, 480);

    /* renamed from: h  reason: collision with root package name */
    public static final Object f14031h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static volatile q0 f14032i;

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f14033a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Size f14034b = null;

    /* renamed from: c  reason: collision with root package name */
    public final a0.f f14035c = new a0.f(0);

    /* renamed from: d  reason: collision with root package name */
    public final a0.b f14036d = new a0.b(0);

    public q0(Context context) {
        this.f14033a = (DisplayManager) context.getSystemService("display");
    }

    public static q0 b(Context context) {
        if (f14032i == null) {
            synchronized (f14031h) {
                try {
                    if (f14032i == null) {
                        f14032i = new q0(context);
                    }
                } finally {
                }
            }
        }
        return f14032i;
    }

    public static Display d(Display[] displayArr, boolean z10) {
        Display display = null;
        int i2 = -1;
        for (Display display2 : displayArr) {
            if (!z10 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i10 = point.x * point.y;
                if (i10 > i2) {
                    display = display2;
                    i2 = i10;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size b10;
        Size size;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        Size size3 = q0.a.f12087a;
        if (size2.getHeight() * size2.getWidth() < q0.a.a(f14029f)) {
            if (((SmallDisplaySizeQuirk) this.f14036d.B) != null) {
                size = (Size) SmallDisplaySizeQuirk.f1057a.get(Build.MODEL.toUpperCase(Locale.US));
            } else {
                size = null;
            }
            size2 = size;
            if (size2 == null) {
                size2 = f14030g;
            }
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        int height = size2.getHeight() * size2.getWidth();
        Size size4 = f14028e;
        if (height > size4.getHeight() * size4.getWidth()) {
            size2 = size4;
        }
        if (this.f14035c.f6a != null && (b10 = ExtraCroppingQuirk.b(d2.PRIV)) != null) {
            if (b10.getHeight() * b10.getWidth() > size2.getHeight() * size2.getWidth()) {
                return b10;
            }
        }
        return size2;
    }

    public final Display c(boolean z10) {
        Display[] displays = this.f14033a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d4 = d(displays, z10);
        if (d4 == null && z10) {
            d4 = d(displays, false);
        }
        if (d4 != null) {
            return d4;
        }
        a0.j.h("No display can be found from the input display manager!");
        return null;
    }

    public final Size e() {
        if (this.f14034b != null) {
            return this.f14034b;
        }
        this.f14034b = a();
        return this.f14034b;
    }
}
