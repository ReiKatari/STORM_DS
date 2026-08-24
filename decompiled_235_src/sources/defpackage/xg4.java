package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg4  reason: default package */
/* loaded from: classes.dex */
public final class xg4 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public ap3 j;
    public CharSequence k;
    public int l;
    public int m;
    public boolean n;
    public Bundle p;
    public String r;
    public final boolean s;
    public final Notification t;
    public final ArrayList u;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final boolean i = true;
    public boolean o = false;
    public int q = 0;

    public xg4(Context context, String str) {
        Notification notification = new Notification();
        this.t = notification;
        this.a = context;
        this.r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.u = new ArrayList();
        this.s = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context, android.content.res.Resources] */
    public final Notification a() {
        Notification.Builder builder;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        Notification build;
        Bundle bundle;
        ArrayList arrayList2;
        int i;
        Bundle bundle2;
        int i2;
        ArrayList arrayList3;
        Icon icon;
        Bundle bundle3;
        int i3;
        Bundle bundle4 = new Bundle();
        int i4 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i4 >= 26) {
            builder = pt0.b(context, this.r);
        } else {
            builder = new Notification.Builder(context);
        }
        Notification notification = this.t;
        ?? r7 = 0;
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
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(null, z4).setNumber(0).setProgress(this.l, this.m, this.n);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(this.k).setUsesChronometer(false).setPriority(this.h);
        ArrayList arrayList4 = this.b;
        int size = arrayList4.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList4.get(i5);
            i5++;
            wg4 wg4Var = (wg4) obj;
            if (wg4Var.b == null && (i3 = wg4Var.e) != 0) {
                wg4Var.b = IconCompat.b(r7, "", i3);
            }
            IconCompat iconCompat = wg4Var.b;
            boolean z5 = wg4Var.c;
            Bundle bundle5 = wg4Var.a;
            if (iconCompat != 0) {
                icon = iconCompat.f(r7);
            } else {
                icon = r7;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, wg4Var.f, wg4Var.g);
            if (bundle5 != null) {
                bundle3 = new Bundle(bundle5);
            } else {
                bundle3 = new Bundle();
            }
            bundle3.putBoolean("android.support.allowGeneratedReplies", z5);
            builder2.setAllowGeneratedReplies(z5);
            bundle3.putInt("android.support.action.semanticAction", 0);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                pp.v(builder2);
            }
            if (i6 >= 29) {
                rp.s(builder2);
            }
            if (i6 >= 31) {
                up.h(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", wg4Var.d);
            builder2.addExtras(bundle3);
            builder.addAction(builder2.build());
            r7 = 0;
        }
        Bundle bundle6 = this.p;
        if (bundle6 != null) {
            bundle4.putAll(bundle6);
        }
        builder.setShowWhen(this.i);
        builder.setLocalOnly(this.o);
        builder.setGroup(null);
        builder.setSortKey(null);
        builder.setGroupSummary(false);
        builder.setCategory(null);
        builder.setColor(this.q);
        builder.setVisibility(0);
        builder.setPublicVersion(null);
        builder.setSound(notification.sound, notification.audioAttributes);
        int i7 = Build.VERSION.SDK_INT;
        ArrayList arrayList5 = this.u;
        ArrayList arrayList6 = this.c;
        if (i7 < 28) {
            if (arrayList6 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList(arrayList6.size());
                Iterator it = arrayList6.iterator();
                if (it.hasNext()) {
                    throw i61.j(it);
                }
            }
            if (arrayList3 != null) {
                if (arrayList5 == null) {
                    arrayList5 = arrayList3;
                } else {
                    zu zuVar = new zu(arrayList5.size() + arrayList3.size());
                    zuVar.addAll(arrayList3);
                    zuVar.addAll(arrayList5);
                    arrayList5 = new ArrayList(zuVar);
                }
            }
        }
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            int size2 = arrayList5.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList5.get(i8);
                i8++;
                builder.addPerson((String) obj2);
            }
        }
        ArrayList arrayList7 = this.d;
        if (arrayList7.size() > 0) {
            if (this.p == null) {
                this.p = new Bundle();
            }
            Bundle bundle7 = this.p.getBundle("android.car.EXTENSIONS");
            if (bundle7 == null) {
                bundle7 = new Bundle();
            }
            Bundle bundle8 = new Bundle(bundle7);
            Bundle bundle9 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList7.size()) {
                String num = Integer.toString(i9);
                wg4 wg4Var2 = (wg4) arrayList7.get(i9);
                Bundle bundle10 = new Bundle();
                if (wg4Var2.b == null && (i2 = wg4Var2.e) != 0) {
                    arrayList2 = arrayList7;
                    wg4Var2.b = IconCompat.b(null, "", i2);
                } else {
                    arrayList2 = arrayList7;
                }
                IconCompat iconCompat2 = wg4Var2.b;
                Bundle bundle11 = wg4Var2.a;
                if (iconCompat2 != null) {
                    i = iconCompat2.c();
                } else {
                    i = 0;
                }
                ArrayList arrayList8 = arrayList6;
                bundle10.putInt("icon", i);
                bundle10.putCharSequence("title", wg4Var2.f);
                bundle10.putParcelable("actionIntent", wg4Var2.g);
                if (bundle11 != null) {
                    bundle2 = new Bundle(bundle11);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", wg4Var2.c);
                bundle10.putBundle("extras", bundle2);
                bundle10.putParcelableArray("remoteInputs", null);
                bundle10.putBoolean("showsUserInterface", wg4Var2.d);
                bundle10.putInt("semanticAction", 0);
                bundle9.putBundle(num, bundle10);
                i9++;
                arrayList7 = arrayList2;
                arrayList6 = arrayList8;
            }
            arrayList = arrayList6;
            bundle7.putBundle("invisible_actions", bundle9);
            bundle8.putBundle("invisible_actions", bundle9);
            if (this.p == null) {
                this.p = new Bundle();
            }
            this.p.putBundle("android.car.EXTENSIONS", bundle7);
            bundle4.putBundle("android.car.EXTENSIONS", bundle8);
        } else {
            arrayList = arrayList6;
        }
        builder.setExtras(this.p);
        builder.setRemoteInputHistory(null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            pt0.p(builder);
            pt0.y(builder);
            pt0.z(builder);
            pt0.C(builder);
            pt0.t(builder);
            if (!TextUtils.isEmpty(this.r)) {
                builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw i61.j(it2);
            }
        }
        if (i10 >= 29) {
            rp.q(builder, this.s);
            rp.r(builder);
        }
        if (i10 >= 36) {
            s2.e(builder);
        }
        ap3 ap3Var = this.j;
        if (ap3Var != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) ap3Var.L);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            build = builder.build();
        } else {
            build = builder.build();
        }
        if (ap3Var != null) {
            this.j.getClass();
        }
        if (ap3Var != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return build;
    }

    public final void c(int i) {
        Notification notification = this.t;
        notification.flags = i | notification.flags;
    }

    public final void d(ap3 ap3Var) {
        if (this.j != ap3Var) {
            this.j = ap3Var;
            if (((xg4) ap3Var.B) != this) {
                ap3Var.B = this;
                d(ap3Var);
            }
        }
    }
}
