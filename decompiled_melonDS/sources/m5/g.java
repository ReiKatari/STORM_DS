package m5;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.provider.Settings;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static NotificationChannel b(CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, 2);
    }

    public static void c(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void d(NotificationChannel notificationChannel) {
        notificationChannel.enableLights(false);
    }

    public static void e(NotificationChannel notificationChannel) {
        notificationChannel.enableVibration(false);
    }

    public static void f(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void g(NotificationChannel notificationChannel) {
        notificationChannel.setDescription(null);
    }

    public static void h(NotificationChannel notificationChannel) {
        notificationChannel.setGroup(null);
    }

    public static void i(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void j(NotificationChannel notificationChannel) {
        notificationChannel.setLightColor(0);
    }

    public static void k(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void l(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void m(NotificationChannel notificationChannel) {
        notificationChannel.setShowBadge(true);
    }

    public static void n(NotificationChannel notificationChannel) {
        notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
    }

    public static void o(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void p(NotificationChannel notificationChannel) {
        notificationChannel.setVibrationPattern(null);
    }
}
