package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f84  reason: default package */
/* loaded from: classes.dex */
public final class f84 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public int g;
    public CharSequence i;
    public int j;
    public int k;
    public boolean l;
    public Bundle m;
    public final String o;
    public final boolean p;
    public final Notification q;
    public final ArrayList r;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final boolean h = true;
    public int n = 0;

    public f84(Context context) {
        Notification notification = new Notification();
        this.q = notification;
        this.a = context;
        this.o = "channel_cheat_importing";
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.g = 0;
        this.r = new ArrayList();
        this.p = true;
    }

    public static CharSequence b(String str) {
        if (str == null) {
            return str;
        }
        if (str.length() > 5120) {
            return str.subSequence(0, 5120);
        }
        return str;
    }

    public final Notification a() {
        Notification.Builder builder;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        String str = this.o;
        if (i >= 26) {
            builder = cr0.b(context, str);
        } else {
            builder = new Notification.Builder(context);
        }
        Notification notification = this.q;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z4 = true;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(null, z4).setNumber(0).setProgress(this.j, this.k, this.l);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(this.i).setUsesChronometer(false).setPriority(this.g);
        Iterator it = this.b.iterator();
        if (!it.hasNext()) {
            Bundle bundle2 = this.m;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            builder.setShowWhen(this.h);
            builder.setLocalOnly(false);
            builder.setGroup(null);
            builder.setSortKey(null);
            builder.setGroupSummary(false);
            builder.setCategory(null);
            builder.setColor(this.n);
            builder.setVisibility(0);
            builder.setPublicVersion(null);
            builder.setSound(notification.sound, notification.audioAttributes);
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.c;
            if (i < 28) {
                if (arrayList3 == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it2 = arrayList3.iterator();
                    if (it2.hasNext()) {
                        throw b31.m(it2);
                    }
                }
                if (arrayList != null) {
                    if (arrayList2 == null) {
                        arrayList2 = arrayList;
                    } else {
                        hu huVar = new hu(arrayList2.size() + arrayList.size());
                        huVar.addAll(arrayList);
                        huVar.addAll(arrayList2);
                        arrayList2 = new ArrayList(huVar);
                    }
                }
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    builder.addPerson((String) obj);
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4.size() > 0) {
                if (this.m == null) {
                    this.m = new Bundle();
                }
                Bundle bundle3 = this.m.getBundle("android.car.EXTENSIONS");
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                if (arrayList4.size() <= 0) {
                    bundle3.putBundle("invisible_actions", bundle5);
                    bundle4.putBundle("invisible_actions", bundle5);
                    if (this.m == null) {
                        this.m = new Bundle();
                    }
                    this.m.putBundle("android.car.EXTENSIONS", bundle3);
                    bundle.putBundle("android.car.EXTENSIONS", bundle4);
                } else {
                    Integer.toString(0);
                    if (arrayList4.get(0) != null) {
                        c44.b();
                        return null;
                    }
                    new Bundle();
                    throw null;
                }
            }
            builder.setExtras(this.m);
            builder.setRemoteInputHistory(null);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 26) {
                cr0.n(builder);
                cr0.w(builder);
                cr0.x(builder);
                cr0.A(builder);
                cr0.r(builder);
                if (!TextUtils.isEmpty(str)) {
                    builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                }
            }
            if (i3 >= 28) {
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    throw b31.m(it3);
                }
            }
            if (i3 >= 29) {
                fp.q(builder, this.p);
                fp.r(builder);
            }
            if (i3 >= 36) {
                q2.e(builder);
            }
            if (i3 >= 26) {
                return builder.build();
            }
            return builder.build();
        }
        throw b31.m(it);
    }
}
