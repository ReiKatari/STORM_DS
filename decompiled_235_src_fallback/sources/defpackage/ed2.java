package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed2  reason: default package */
/* loaded from: classes.dex */
public abstract class ed2 extends defpackage.jq {
    @Override // androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r7) {
            r6 = this;
            g57 r0 = defpackage.ht.a()
            int r0 = r0.getThemeResId()
            r6.setTheme(r0)
            super.onCreate(r7)
            me.magnum.melonds.domain.model.ConsoleType r7 = r6.z()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = r6.getPackageName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".LAUNCH_FIRMWARE"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.String r1 = "boot_firmware_only"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "boot_firmware_console"
            int r3 = r7.ordinal()
            r0.putExtra(r1, r3)
            java.lang.String r1 = r7.name()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            r1.getClass()
            pa r3 = new pa
            r4 = 11
            r5 = 0
            r3.<init>(r4, r5)
            r3.B = r6
            r3.L = r1
            int[] r1 = defpackage.dd2.a
            int r4 = r7.ordinal()
            r4 = r1[r4]
            r5 = 2
            if (r4 == r2) goto L70
            if (r4 != r5) goto L6c
            r4 = 2131951831(0x7f1300d7, float:1.9540088E38)
            java.lang.String r4 = r6.getString(r4)
            r4.getClass()
            goto L7a
        L6c:
            defpackage.i.d()
            return
        L70:
            r4 = 2131951829(0x7f1300d5, float:1.9540084E38)
            java.lang.String r4 = r6.getString(r4)
            r4.getClass()
        L7a:
            r3.X = r4
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r2) goto L9c
            if (r7 != r5) goto L98
            android.graphics.PorterDuff$Mode r7 = androidx.core.graphics.drawable.IconCompat.k
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r1 = r6.getPackageName()
            r2 = 2131820548(0x7f110004, float:1.9273814E38)
            androidx.core.graphics.drawable.IconCompat r7 = androidx.core.graphics.drawable.IconCompat.b(r7, r1, r2)
            goto Lad
        L98:
            defpackage.i.d()
            return
        L9c:
            android.graphics.PorterDuff$Mode r7 = androidx.core.graphics.drawable.IconCompat.k
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r1 = r6.getPackageName()
            r2 = 2131820546(0x7f110002, float:1.927381E38)
            androidx.core.graphics.drawable.IconCompat r7 = androidx.core.graphics.drawable.IconCompat.b(r7, r1, r2)
        Lad:
            r3.Y = r7
            android.content.Intent[] r7 = new android.content.Intent[]{r0}
            r3.R = r7
            java.lang.Object r7 = r3.X
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lda
            java.lang.Object r7 = r3.R
            android.content.Intent[] r7 = (android.content.Intent[]) r7
            if (r7 == 0) goto Ld4
            int r7 = r7.length
            if (r7 == 0) goto Ld4
            android.content.Intent r7 = defpackage.qo2.t(r6, r3)
            r0 = -1
            r6.setResult(r0, r7)
            r6.finish()
            return
        Ld4:
            java.lang.String r6 = "Shortcut must have an intent"
            defpackage.i.h(r6)
            return
        Lda:
            java.lang.String r6 = "Shortcut must have a non-empty label"
            defpackage.i.h(r6)
            return
    }

    public abstract me.magnum.melonds.domain.model.ConsoleType z();
}
