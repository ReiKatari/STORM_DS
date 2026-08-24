package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pt0  reason: default package */
/* loaded from: classes.dex */
public abstract class pt0 {
    public static void A(NotificationChannel notificationChannel) {
        notificationChannel.setShowBadge(true);
    }

    public static void B(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    public static void C(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void D(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void E(NotificationChannel notificationChannel) {
        notificationChannel.setVibrationPattern(null);
    }

    public static void F(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static final ColorSpace a(nt0 nt0Var) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (nb3.k(nt0Var, qt0.e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (nb3.k(nt0Var, qt0.q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (nb3.k(nt0Var, qt0.r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (nb3.k(nt0Var, qt0.o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (nb3.k(nt0Var, qt0.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (nb3.k(nt0Var, qt0.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (nb3.k(nt0Var, qt0.t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (nb3.k(nt0Var, qt0.s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (nb3.k(nt0Var, qt0.k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (nb3.k(nt0Var, qt0.l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (nb3.k(nt0Var, qt0.g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (nb3.k(nt0Var, qt0.h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (nb3.k(nt0Var, qt0.f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (nb3.k(nt0Var, qt0.m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (nb3.k(nt0Var, qt0.p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (nb3.k(nt0Var, qt0.n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        ColorSpace.Rgb.TransferParameters transferParameters = null;
        if (Build.VERSION.SDK_INT >= 34) {
            if (nb3.k(nt0Var, qt0.v)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (nb3.k(nt0Var, qt0.w)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (nt0Var instanceof cq5) {
            String str = nt0Var.a;
            cq5 cq5Var = (cq5) nt0Var;
            float[] a = cq5Var.d.a();
            e97 e97Var = cq5Var.g;
            if (e97Var != null) {
                transferParameters = new ColorSpace.Rgb.TransferParameters(e97Var.b, e97Var.c, e97Var.d, e97Var.e, e97Var.f, e97Var.g, e97Var.a);
            }
            float[] fArr = cq5Var.i;
            if (transferParameters != null) {
                ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, cq5Var.h, a, transferParameters);
                if (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) {
                    return rgb;
                }
                return new ColorSpace.Rgb(str, fArr, transferParameters);
            }
            float[] fArr2 = cq5Var.h;
            final bq5 bq5Var = cq5Var.l;
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ot0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    int i = r1;
                    qn2 qn2Var = bq5Var;
                    switch (i) {
                        case 0:
                            return ((Number) qn2Var.g(Double.valueOf(d))).doubleValue();
                        default:
                            return ((Number) qn2Var.g(Double.valueOf(d))).doubleValue();
                    }
                }
            };
            final bq5 bq5Var2 = cq5Var.o;
            return new ColorSpace.Rgb(str, fArr2, a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: ot0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d) {
                    int i = r1;
                    qn2 qn2Var = bq5Var2;
                    switch (i) {
                        case 0:
                            return ((Number) qn2Var.g(Double.valueOf(d))).doubleValue();
                        default:
                            return ((Number) qn2Var.g(Double.valueOf(d))).doubleValue();
                    }
                }
            }, cq5Var.e, cq5Var.f);
        }
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static NotificationChannel c(int i, CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, i);
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

    public static Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 0);
    }

    public static Intent n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 2);
    }

    public static void o(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void p(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void q(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void r(NotificationChannel notificationChannel) {
        notificationChannel.setDescription(null);
    }

    public static void s(NotificationChannel notificationChannel) {
        notificationChannel.setGroup(null);
    }

    public static void t(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void u(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void v(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void w(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(0);
    }

    public static void x(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void y(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void z(Notification.Builder builder) {
        builder.setShortcutId(null);
    }
}
