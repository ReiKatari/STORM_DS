package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Set;
import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l62  reason: default package */
/* loaded from: classes.dex */
public final class l62 {
    public final w16 a;
    public final Context b;

    public l62(Context context, w16 w16Var) {
        this.a = w16Var;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hw0 a(me.magnum.melonds.domain.model.ConsoleType r28, android.net.Uri r29) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l62.a(me.magnum.melonds.domain.model.ConsoleType, android.net.Uri):hw0");
    }

    public final hw0 b(ConsoleType consoleType) {
        String str;
        consoleType.getClass();
        int i = iw0.a[consoleType.ordinal()];
        Uri uri = null;
        if (i != 1) {
            if (i == 2) {
                return c();
            }
            i.c();
            return null;
        }
        Set<String> stringSet = ((b56) this.a).b.getStringSet("bios_dir", null);
        if (stringSet != null) {
            str = (String) tq0.L0(stringSet);
        } else {
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        }
        return a(ConsoleType.DS, uri);
    }

    public final hw0 c() {
        String str;
        Uri uri;
        String str2;
        w16 w16Var = this.a;
        Uri uri2 = null;
        Set<String> stringSet = ((b56) w16Var).b.getStringSet("dsi_bios_dir", null);
        if (stringSet != null) {
            str = (String) tq0.L0(stringSet);
        } else {
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        hw0 a = a(ConsoleType.DSi, uri);
        if (a.b != gw0.VALID) {
            return a;
        }
        Set<String> stringSet2 = ((b56) w16Var).b.getStringSet("bios_dir", null);
        if (stringSet2 != null) {
            str2 = (String) tq0.L0(stringSet2);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            uri2 = Uri.parse(str2);
        }
        return a(ConsoleType.DS, uri2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r3 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fw0 d(defpackage.uh1 r3, java.lang.String r4, long r5) {
        /*
            r2 = this;
            uh1 r3 = r3.f(r4)
            if (r3 != 0) goto L9
            fw0 r2 = defpackage.fw0.MISSING
            return r2
        L9:
            android.content.Context r2 = r2.b     // Catch: java.lang.Throwable -> L42
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L42
            android.net.Uri r3 = r3.j()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "r"
            android.content.res.AssetFileDescriptor r2 = r2.openAssetFileDescriptor(r3, r4)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L3f
            long r3 = r2.getLength()     // Catch: java.lang.Throwable -> L28
            r0 = -1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L2a
            fw0 r3 = defpackage.fw0.MISSING     // Catch: java.lang.Throwable -> L28
            goto L33
        L28:
            r3 = move-exception
            goto L39
        L2a:
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L31
            fw0 r3 = defpackage.fw0.PRESENT     // Catch: java.lang.Throwable -> L28
            goto L33
        L31:
            fw0 r3 = defpackage.fw0.INVALID     // Catch: java.lang.Throwable -> L28
        L33:
            r2.close()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L48
            goto L3f
        L39:
            throw r3     // Catch: java.lang.Throwable -> L3a
        L3a:
            r4 = move-exception
            defpackage.dt3.W(r2, r3)     // Catch: java.lang.Throwable -> L42
            throw r4     // Catch: java.lang.Throwable -> L42
        L3f:
            fw0 r3 = defpackage.fw0.MISSING     // Catch: java.lang.Throwable -> L42
            goto L48
        L42:
            r2 = move-exception
            kc5 r3 = new kc5
            r3.<init>(r2)
        L48:
            fw0 r2 = defpackage.fw0.MISSING
            boolean r4 = r3 instanceof defpackage.kc5
            if (r4 == 0) goto L4f
            r3 = r2
        L4f:
            fw0 r3 = (defpackage.fw0) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l62.d(uh1, java.lang.String, long):fw0");
    }
}
