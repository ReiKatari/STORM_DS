package m5;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9249a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f9253e;

    /* renamed from: f  reason: collision with root package name */
    public int f9254f;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f9256h;

    /* renamed from: i  reason: collision with root package name */
    public int f9257i;

    /* renamed from: j  reason: collision with root package name */
    public int f9258j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f9259k;

    /* renamed from: l  reason: collision with root package name */
    public Bundle f9260l;

    /* renamed from: n  reason: collision with root package name */
    public final String f9261n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f9262o;

    /* renamed from: p  reason: collision with root package name */
    public final Notification f9263p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f9264q;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9250b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9251c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9252d = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9255g = true;
    public int m = 0;

    public h(Context context) {
        Notification notification = new Notification();
        this.f9263p = notification;
        this.f9249a = context;
        this.f9261n = "channel_cheat_importing";
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f9254f = 0;
        this.f9264q = new ArrayList();
        this.f9262o = true;
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
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        new ArrayList();
        Bundle bundle = new Bundle();
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.f9249a;
        String str = this.f9261n;
        if (i2 >= 26) {
            builder = g.a(context, str);
        } else {
            builder = new Notification.Builder(context);
        }
        Notification notification = this.f9263p;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z13 = true;
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(this.f9253e).setContentText(null).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(null, z13).setNumber(0).setProgress(this.f9257i, this.f9258j, this.f9259k);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(this.f9256h).setUsesChronometer(false).setPriority(this.f9254f);
        Iterator it = this.f9250b.iterator();
        if (!it.hasNext()) {
            Bundle bundle2 = this.f9260l;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            builder.setShowWhen(this.f9255g);
            builder.setLocalOnly(false);
            builder.setGroup(null);
            builder.setSortKey(null);
            builder.setGroupSummary(false);
            builder.setCategory(null);
            builder.setColor(this.m);
            builder.setVisibility(0);
            builder.setPublicVersion(null);
            builder.setSound(notification.sound, notification.audioAttributes);
            ArrayList arrayList2 = this.f9264q;
            ArrayList arrayList3 = this.f9251c;
            if (i2 < 28) {
                if (arrayList3 == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it2 = arrayList3.iterator();
                    if (it2.hasNext()) {
                        throw w.d.k(it2);
                    }
                }
                if (arrayList != null) {
                    if (arrayList2 == null) {
                        arrayList2 = arrayList;
                    } else {
                        a1.f fVar = new a1.f(arrayList2.size() + arrayList.size());
                        fVar.addAll(arrayList);
                        fVar.addAll(arrayList2);
                        arrayList2 = new ArrayList(fVar);
                    }
                }
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    builder.addPerson((String) obj);
                }
            }
            ArrayList arrayList4 = this.f9252d;
            if (arrayList4.size() > 0) {
                if (this.f9260l == null) {
                    this.f9260l = new Bundle();
                }
                Bundle bundle3 = this.f9260l.getBundle("android.car.EXTENSIONS");
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                if (arrayList4.size() <= 0) {
                    bundle3.putBundle("invisible_actions", bundle5);
                    bundle4.putBundle("invisible_actions", bundle5);
                    if (this.f9260l == null) {
                        this.f9260l = new Bundle();
                    }
                    this.f9260l.putBundle("android.car.EXTENSIONS", bundle3);
                    bundle.putBundle("android.car.EXTENSIONS", bundle4);
                } else {
                    Integer.toString(0);
                    if (arrayList4.get(0) != null) {
                        m9.o.b();
                        return null;
                    }
                    new Bundle();
                    throw null;
                }
            }
            builder.setExtras(this.f9260l);
            builder.setRemoteInputHistory(null);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                g.f(builder);
                g.k(builder);
                g.l(builder);
                g.o(builder);
                g.i(builder);
                if (!TextUtils.isEmpty(str)) {
                    builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                }
            }
            if (i11 >= 28) {
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    throw w.d.k(it3);
                }
            }
            if (i11 >= 29) {
                d.b(builder, this.f9262o);
                d.c(builder);
            }
            if (i11 >= 36) {
                i.a(builder);
            }
            if (i11 >= 26) {
                return builder.build();
            }
            return builder.build();
        }
        throw w.d.k(it);
    }
}
