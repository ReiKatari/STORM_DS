package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al1  reason: default package */
/* loaded from: classes.dex */
public final class al1 {
    public static final q61 g = new Object();
    public static final Size h = new Size(1920, 1080);
    public static final Size i = new Size(320, 240);
    public static final Size j = new Size(640, 480);
    public static volatile al1 k;
    public final w24 a = new w24(0);
    public final d51 b = new d51(10);
    public final Object c = new Object();
    public volatile Display[] d;
    public final DisplayManager e;
    public volatile Size f;

    public al1(Context context) {
        zk1 zk1Var = new zk1(this, 0);
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        displayManager.registerDisplayListener(zk1Var, new Handler(Looper.getMainLooper()));
        this.e = displayManager;
    }

    public final Size a() {
        Size b;
        Size size;
        Point point = new Point();
        b(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        if (mj6.a(size2) < mj6.a(i)) {
            if (((SmallDisplaySizeQuirk) this.b.B) != null) {
                Map map = SmallDisplaySizeQuirk.a;
                String str = Build.MODEL;
                str.getClass();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                Object obj = map.get(upperCase);
                obj.getClass();
                size = (Size) obj;
            } else {
                size = null;
            }
            if (size == null) {
                size = j;
            }
            size2 = size;
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        Size size3 = h;
        if (mj6.a(size3) < mj6.a(size2)) {
            size2 = size3;
        }
        w24 w24Var = this.a;
        w24Var.getClass();
        if (w24Var.a != null && (b = ExtraCroppingQuirk.b(hv6.PRIV)) != null) {
            if (b.getHeight() * b.getWidth() > size2.getHeight() * size2.getWidth()) {
                return b;
            }
        }
        return size2;
    }

    public final Display b(boolean z) {
        Display[] displayArr;
        int i2;
        synchronized (this.c) {
            displayArr = this.d;
            if (displayArr == null) {
                displayArr = this.e.getDisplays();
                this.d = displayArr;
                displayArr.getClass();
            }
        }
        if (displayArr.length == 1) {
            return displayArr[0];
        }
        int i3 = -1;
        Display display = null;
        Display display2 = null;
        int i4 = -1;
        for (Display display3 : displayArr) {
            Point point = new Point();
            display3.getRealSize(point);
            int i5 = point.x * point.y;
            if (i5 > i3) {
                display = display3;
                i3 = i5;
            }
            if (display3.getState() != 1 && (i2 = point.x * point.y) > i4) {
                display2 = display3;
                i4 = i2;
            }
        }
        if (z && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        String arrays = Arrays.toString(displayArr);
        arrays.getClass();
        throw new IllegalStateException(("No displays found from " + arrays + '!').toString());
    }

    public final Size c() {
        synchronized (this.c) {
            if (this.f != null) {
                Size size = this.f;
                size.getClass();
                return size;
            }
            this.f = a();
            Size size2 = this.f;
            size2.getClass();
            return size2;
        }
    }
}
