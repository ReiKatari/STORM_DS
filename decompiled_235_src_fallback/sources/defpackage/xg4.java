package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg4  reason: default package */
/* loaded from: classes.dex */
public final class xg4 {
    public final android.content.Context a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public java.lang.CharSequence e;
    public java.lang.CharSequence f;
    public android.app.PendingIntent g;
    public int h;
    public final boolean i;
    public defpackage.ap3 j;
    public java.lang.CharSequence k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public android.os.Bundle p;
    public int q;
    public java.lang.String r;
    public final boolean s;
    public final android.app.Notification t;
    public final java.util.ArrayList u;

    public xg4(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.d = r0
            r0 = 1
            r3.i = r0
            r1 = 0
            r3.o = r1
            r3.q = r1
            android.app.Notification r2 = new android.app.Notification
            r2.<init>()
            r3.t = r2
            r3.a = r4
            r3.r = r5
            long r4 = java.lang.System.currentTimeMillis()
            r2.when = r4
            r4 = -1
            r2.audioStreamType = r4
            r3.h = r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.u = r4
            r3.s = r0
            return
    }

    public static java.lang.CharSequence b(java.lang.CharSequence r2) {
            if (r2 != 0) goto L3
            return r2
        L3:
            int r0 = r2.length()
            r1 = 5120(0x1400, float:7.175E-42)
            if (r0 <= r1) goto L10
            r0 = 0
            java.lang.CharSequence r2 = r2.subSequence(r0, r1)
        L10:
            return r2
    }

    public final android.app.Notification a() {
            r18 = this;
            r0 = r18
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.Context r3 = r0.a
            r4 = 26
            if (r2 < r4) goto L16
            java.lang.String r2 = r0.r
            android.app.Notification$Builder r2 = defpackage.pt0.b(r3, r2)
            goto L1b
        L16:
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            r2.<init>(r3)
        L1b:
            android.app.Notification r3 = r0.t
            long r5 = r3.when
            android.app.Notification$Builder r5 = r2.setWhen(r5)
            int r6 = r3.icon
            int r7 = r3.iconLevel
            android.app.Notification$Builder r5 = r5.setSmallIcon(r6, r7)
            android.widget.RemoteViews r6 = r3.contentView
            android.app.Notification$Builder r5 = r5.setContent(r6)
            java.lang.CharSequence r6 = r3.tickerText
            r7 = 0
            android.app.Notification$Builder r5 = r5.setTicker(r6, r7)
            long[] r6 = r3.vibrate
            android.app.Notification$Builder r5 = r5.setVibrate(r6)
            int r6 = r3.ledARGB
            int r8 = r3.ledOnMS
            int r9 = r3.ledOffMS
            android.app.Notification$Builder r5 = r5.setLights(r6, r8, r9)
            int r6 = r3.flags
            r6 = r6 & 2
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L52
            r6 = r8
            goto L53
        L52:
            r6 = r9
        L53:
            android.app.Notification$Builder r5 = r5.setOngoing(r6)
            int r6 = r3.flags
            r6 = r6 & 8
            if (r6 == 0) goto L5f
            r6 = r8
            goto L60
        L5f:
            r6 = r9
        L60:
            android.app.Notification$Builder r5 = r5.setOnlyAlertOnce(r6)
            int r6 = r3.flags
            r6 = r6 & 16
            if (r6 == 0) goto L6c
            r6 = r8
            goto L6d
        L6c:
            r6 = r9
        L6d:
            android.app.Notification$Builder r5 = r5.setAutoCancel(r6)
            int r6 = r3.defaults
            android.app.Notification$Builder r5 = r5.setDefaults(r6)
            java.lang.CharSequence r6 = r0.e
            android.app.Notification$Builder r5 = r5.setContentTitle(r6)
            java.lang.CharSequence r6 = r0.f
            android.app.Notification$Builder r5 = r5.setContentText(r6)
            android.app.Notification$Builder r5 = r5.setContentInfo(r7)
            android.app.PendingIntent r6 = r0.g
            android.app.Notification$Builder r5 = r5.setContentIntent(r6)
            android.app.PendingIntent r6 = r3.deleteIntent
            android.app.Notification$Builder r5 = r5.setDeleteIntent(r6)
            int r6 = r3.flags
            r6 = r6 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L9a
            goto L9b
        L9a:
            r8 = r9
        L9b:
            android.app.Notification$Builder r5 = r5.setFullScreenIntent(r7, r8)
            android.app.Notification$Builder r5 = r5.setNumber(r9)
            int r6 = r0.l
            int r8 = r0.m
            boolean r10 = r0.n
            r5.setProgress(r6, r8, r10)
            r2.setLargeIcon(r7)
            java.lang.CharSequence r5 = r0.k
            android.app.Notification$Builder r5 = r2.setSubText(r5)
            android.app.Notification$Builder r5 = r5.setUsesChronometer(r9)
            int r6 = r0.h
            r5.setPriority(r6)
            java.util.ArrayList r5 = r0.b
            int r6 = r5.size()
            r8 = r9
        Lc5:
            java.lang.String r11 = "android.support.allowGeneratedReplies"
            java.lang.String r12 = ""
            if (r8 >= r6) goto L13c
            java.lang.Object r14 = r5.get(r8)
            int r8 = r8 + 1
            wg4 r14 = (defpackage.wg4) r14
            androidx.core.graphics.drawable.IconCompat r15 = r14.b
            if (r15 != 0) goto Le1
            int r15 = r14.e
            if (r15 == 0) goto Le1
            androidx.core.graphics.drawable.IconCompat r12 = androidx.core.graphics.drawable.IconCompat.b(r7, r12, r15)
            r14.b = r12
        Le1:
            androidx.core.graphics.drawable.IconCompat r12 = r14.b
            boolean r15 = r14.c
            android.os.Bundle r4 = r14.a
            android.app.Notification$Action$Builder r10 = new android.app.Notification$Action$Builder
            if (r12 == 0) goto Lf0
            android.graphics.drawable.Icon r12 = r12.f(r7)
            goto Lf1
        Lf0:
            r12 = r7
        Lf1:
            java.lang.CharSequence r7 = r14.f
            android.app.PendingIntent r13 = r14.g
            r10.<init>(r12, r7, r13)
            if (r4 == 0) goto L100
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r4)
            goto L105
        L100:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
        L105:
            r7.putBoolean(r11, r15)
            r10.setAllowGeneratedReplies(r15)
            java.lang.String r4 = "android.support.action.semanticAction"
            r7.putInt(r4, r9)
            int r4 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r4 < r11) goto L119
            defpackage.pp.v(r10)
        L119:
            r11 = 29
            if (r4 < r11) goto L120
            defpackage.rp.s(r10)
        L120:
            r11 = 31
            if (r4 < r11) goto L127
            defpackage.up.h(r10)
        L127:
            java.lang.String r4 = "android.support.action.showsUserInterface"
            boolean r11 = r14.d
            r7.putBoolean(r4, r11)
            r10.addExtras(r7)
            android.app.Notification$Action r4 = r10.build()
            r2.addAction(r4)
            r4 = 26
            r7 = 0
            goto Lc5
        L13c:
            android.os.Bundle r4 = r0.p
            if (r4 == 0) goto L143
            r1.putAll(r4)
        L143:
            boolean r4 = r0.i
            r2.setShowWhen(r4)
            boolean r4 = r0.o
            r2.setLocalOnly(r4)
            r4 = 0
            r2.setGroup(r4)
            r2.setSortKey(r4)
            r2.setGroupSummary(r9)
            r2.setCategory(r4)
            int r5 = r0.q
            r2.setColor(r5)
            r2.setVisibility(r9)
            r2.setPublicVersion(r4)
            android.net.Uri r4 = r3.sound
            android.media.AudioAttributes r3 = r3.audioAttributes
            r2.setSound(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.util.ArrayList r4 = r0.u
            java.util.ArrayList r5 = r0.c
            r6 = 28
            if (r3 >= r6) goto L1b3
            if (r5 != 0) goto L17a
            r3 = 0
            goto L18d
        L17a:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = r5.size()
            r3.<init>(r6)
            java.util.Iterator r6 = r5.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L1ae
        L18d:
            if (r3 != 0) goto L190
            goto L1b3
        L190:
            if (r4 != 0) goto L194
            r4 = r3
            goto L1b3
        L194:
            zu r6 = new zu
            int r7 = r3.size()
            int r8 = r4.size()
            int r8 = r8 + r7
            r6.<init>(r8)
            r6.addAll(r3)
            r6.addAll(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r6)
            goto L1b3
        L1ae:
            java.lang.ClassCastException r0 = defpackage.i61.j(r6)
            throw r0
        L1b3:
            if (r4 == 0) goto L1ce
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L1ce
            int r3 = r4.size()
            r6 = r9
        L1c0:
            if (r6 >= r3) goto L1ce
            java.lang.Object r7 = r4.get(r6)
            int r6 = r6 + 1
            java.lang.String r7 = (java.lang.String) r7
            r2.addPerson(r7)
            goto L1c0
        L1ce:
            java.util.ArrayList r3 = r0.d
            int r4 = r3.size()
            if (r4 <= 0) goto L299
            android.os.Bundle r4 = r0.p
            if (r4 != 0) goto L1e1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r0.p = r4
        L1e1:
            android.os.Bundle r4 = r0.p
            java.lang.String r6 = "android.car.EXTENSIONS"
            android.os.Bundle r4 = r4.getBundle(r6)
            if (r4 != 0) goto L1f0
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L1f0:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r4)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r10 = r9
        L1fb:
            int r13 = r3.size()
            if (r10 >= r13) goto L27b
            java.lang.String r13 = java.lang.Integer.toString(r10)
            java.lang.Object r14 = r3.get(r10)
            wg4 r14 = (defpackage.wg4) r14
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            androidx.core.graphics.drawable.IconCompat r9 = r14.b
            if (r9 != 0) goto L222
            int r9 = r14.e
            if (r9 == 0) goto L222
            r16 = r3
            r3 = 0
            androidx.core.graphics.drawable.IconCompat r9 = androidx.core.graphics.drawable.IconCompat.b(r3, r12, r9)
            r14.b = r9
            goto L224
        L222:
            r16 = r3
        L224:
            androidx.core.graphics.drawable.IconCompat r3 = r14.b
            android.os.Bundle r9 = r14.a
            if (r3 == 0) goto L231
            int r3 = r3.c()
        L22e:
            r17 = r5
            goto L233
        L231:
            r3 = 0
            goto L22e
        L233:
            java.lang.String r5 = "icon"
            r15.putInt(r5, r3)
            java.lang.String r3 = "title"
            java.lang.CharSequence r5 = r14.f
            r15.putCharSequence(r3, r5)
            java.lang.String r3 = "actionIntent"
            android.app.PendingIntent r5 = r14.g
            r15.putParcelable(r3, r5)
            if (r9 == 0) goto L24e
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>(r9)
            goto L253
        L24e:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L253:
            boolean r5 = r14.c
            r3.putBoolean(r11, r5)
            java.lang.String r5 = "extras"
            r15.putBundle(r5, r3)
            java.lang.String r3 = "remoteInputs"
            r5 = 0
            r15.putParcelableArray(r3, r5)
            java.lang.String r3 = "showsUserInterface"
            boolean r5 = r14.d
            r15.putBoolean(r3, r5)
            java.lang.String r3 = "semanticAction"
            r5 = 0
            r15.putInt(r3, r5)
            r8.putBundle(r13, r15)
            int r10 = r10 + 1
            r3 = r16
            r5 = r17
            r9 = 0
            goto L1fb
        L27b:
            r17 = r5
            java.lang.String r3 = "invisible_actions"
            r4.putBundle(r3, r8)
            r7.putBundle(r3, r8)
            android.os.Bundle r3 = r0.p
            if (r3 != 0) goto L290
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r0.p = r3
        L290:
            android.os.Bundle r3 = r0.p
            r3.putBundle(r6, r4)
            r1.putBundle(r6, r7)
            goto L29b
        L299:
            r17 = r5
        L29b:
            android.os.Bundle r1 = r0.p
            r2.setExtras(r1)
            r3 = 0
            r2.setRemoteInputHistory(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r1 < r4) goto L2d1
            defpackage.pt0.p(r2)
            defpackage.pt0.y(r2)
            defpackage.pt0.z(r2)
            defpackage.pt0.C(r2)
            defpackage.pt0.t(r2)
            java.lang.String r4 = r0.r
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L2d1
            android.app.Notification$Builder r4 = r2.setSound(r3)
            r5 = 0
            android.app.Notification$Builder r4 = r4.setDefaults(r5)
            android.app.Notification$Builder r4 = r4.setLights(r5, r5, r5)
            r4.setVibrate(r3)
        L2d1:
            r6 = 28
            if (r1 < r6) goto L2df
            java.util.Iterator r3 = r17.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L2e2
        L2df:
            r11 = 29
            goto L2e7
        L2e2:
            java.lang.ClassCastException r0 = defpackage.i61.j(r3)
            throw r0
        L2e7:
            if (r1 < r11) goto L2f1
            boolean r3 = r0.s
            defpackage.rp.q(r2, r3)
            defpackage.rp.r(r2)
        L2f1:
            r3 = 36
            if (r1 < r3) goto L2f8
            defpackage.s2.e(r2)
        L2f8:
            ap3 r1 = r0.j
            if (r1 == 0) goto L30d
            android.app.Notification$BigTextStyle r3 = new android.app.Notification$BigTextStyle
            r3.<init>(r2)
            r4 = 0
            android.app.Notification$BigTextStyle r3 = r3.setBigContentTitle(r4)
            java.lang.Object r4 = r1.L
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.bigText(r4)
        L30d:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L318
            android.app.Notification r2 = r2.build()
            goto L31c
        L318:
            android.app.Notification r2 = r2.build()
        L31c:
            if (r1 == 0) goto L323
            ap3 r0 = r0.j
            r0.getClass()
        L323:
            if (r1 == 0) goto L330
            android.os.Bundle r0 = r2.extras
            if (r0 == 0) goto L330
            java.lang.String r1 = "androidx.core.app.NotificationCompat$BigTextStyle"
            java.lang.String r3 = "androidx.core.app.extra.COMPAT_TEMPLATE"
            r0.putString(r3, r1)
        L330:
            return r2
    }

    public final void c(int r2) {
            r1 = this;
            android.app.Notification r1 = r1.t
            int r0 = r1.flags
            r2 = r2 | r0
            r1.flags = r2
            return
    }

    public final void d(defpackage.ap3 r2) {
            r1 = this;
            ap3 r0 = r1.j
            if (r0 == r2) goto L11
            r1.j = r2
            java.lang.Object r0 = r2.B
            xg4 r0 = (defpackage.xg4) r0
            if (r0 == r1) goto L11
            r2.B = r1
            r1.d(r2)
        L11:
            return
    }
}
