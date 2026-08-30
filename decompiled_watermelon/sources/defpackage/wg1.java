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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wg1  reason: default package */
/* loaded from: classes.dex */
public final class wg1 {
    public static final k45 g = new k45(29);
    public static final Size h = new Size(1920, 1080);
    public static final Size i = new Size(320, 240);
    public static final Size j = new Size(640, 480);
    public static volatile wg1 k;
    public final lv3 a = new lv3(0);
    public final t71 b = new t71(8);
    public final Object c = new Object();
    public volatile Display[] d;
    public final DisplayManager e;
    public volatile Size f;

    public wg1(Context context) {
        vg1 vg1Var = new vg1(0, this);
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        displayManager.registerDisplayListener(vg1Var, new Handler(Looper.getMainLooper()));
        this.e = displayManager;
    }

    public final Size a() {
        Size b;
        Size size;
        Point point = new Point();
        b(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        if (x76.a(size2) < x76.a(i)) {
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
        if (x76.a(size3) < x76.a(size2)) {
            size2 = size3;
        }
        lv3 lv3Var = this.a;
        lv3Var.getClass();
        if (lv3Var.a != null && (b = ExtraCroppingQuirk.b(nj6.PRIV)) != null) {
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
