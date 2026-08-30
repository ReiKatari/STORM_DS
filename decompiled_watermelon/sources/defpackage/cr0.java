package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.provider.Settings;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cr0  reason: default package */
/* loaded from: classes.dex */
public abstract class cr0 {
    public static void A(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void B(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void C(NotificationChannel notificationChannel) {
        notificationChannel.setVibrationPattern(null);
    }

    public static void D(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static final ColorSpace a(ar0 ar0Var) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (b53.x(ar0Var, dr0.e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (b53.x(ar0Var, dr0.q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (b53.x(ar0Var, dr0.r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (b53.x(ar0Var, dr0.o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (b53.x(ar0Var, dr0.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (b53.x(ar0Var, dr0.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (b53.x(ar0Var, dr0.t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (b53.x(ar0Var, dr0.s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (b53.x(ar0Var, dr0.k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (b53.x(ar0Var, dr0.l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (b53.x(ar0Var, dr0.g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (b53.x(ar0Var, dr0.h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (b53.x(ar0Var, dr0.f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (b53.x(ar0Var, dr0.m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (b53.x(ar0Var, dr0.p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (b53.x(ar0Var, dr0.n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        ColorSpace.Rgb.TransferParameters transferParameters = null;
        if (Build.VERSION.SDK_INT >= 34) {
            if (b53.x(ar0Var, dr0.v)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (b53.x(ar0Var, dr0.w)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (ar0Var instanceof eg5) {
            String str = ar0Var.a;
            eg5 eg5Var = (eg5) ar0Var;
            float[] a = eg5Var.d.a();
            rw6 rw6Var = eg5Var.g;
            if (rw6Var != null) {
                transferParameters = new ColorSpace.Rgb.TransferParameters(rw6Var.b, rw6Var.c, rw6Var.d, rw6Var.e, rw6Var.f, rw6Var.g, rw6Var.a);
            }
            float[] fArr = eg5Var.i;
            if (transferParameters != null) {
                ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, eg5Var.h, a, transferParameters);
                if (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) {
                    return rgb;
                }
                return new ColorSpace.Rgb(str, fArr, transferParameters);
            }
            float[] fArr2 = eg5Var.h;
            final dg5 dg5Var = eg5Var.l;
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: br0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    int i = r1;
                    mi2 mi2Var = dg5Var;
                    switch (i) {
                        case 0:
                            return ((Number) mi2Var.n(Double.valueOf(d))).doubleValue();
                        default:
                            return ((Number) mi2Var.n(Double.valueOf(d))).doubleValue();
                    }
                }
            };
            final dg5 dg5Var2 = eg5Var.o;
            return new ColorSpace.Rgb(str, fArr2, a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: br0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    int i = r1;
                    mi2 mi2Var = dg5Var2;
                    switch (i) {
                        case 0:
                            return ((Number) mi2Var.n(Double.valueOf(d))).doubleValue();
                        default:
                            return ((Number) mi2Var.n(Double.valueOf(d))).doubleValue();
                    }
                }
            }, eg5Var.e, eg5Var.f);
        }
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static NotificationChannel c(CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, 2);
    }

    public static void d(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static Icon e(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void f(NotificationChannel notificationChannel) {
        notificationChannel.enableLights(false);
    }

    public static void g(NotificationChannel notificationChannel) {
        notificationChannel.enableVibration(false);
    }

    public static AutofillId h(View view) {
        return view.getAutofillId();
    }

    public static float i(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float l(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void m(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void n(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void o(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void p(NotificationChannel notificationChannel) {
        notificationChannel.setDescription(null);
    }

    public static void q(NotificationChannel notificationChannel) {
        notificationChannel.setGroup(null);
    }

    public static void r(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void s(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void t(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void u(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(0);
    }

    public static void v(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void w(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void x(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void y(NotificationChannel notificationChannel) {
        notificationChannel.setShowBadge(true);
    }

    public static void z(NotificationChannel notificationChannel) {
        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
    }
}
